// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package spotinst

import (
	"fmt"
	"path"
	"strings"
	"unicode"

	// embed is used to store bridge-metadata.json in the compiled binary
	_ "embed"

	"github.com/spotinst/terraform-provider-spotinst/spotinst"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	tks "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens/fallbackstrat"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
	"github.com/pulumi/pulumi/sdk/v3/go/common/util/contract"

	"github.com/pulumi/pulumi-spotinst/provider/v3/pkg/version"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "spotinst"
	// modules:
	awsMod     = "Aws"
	ecsMod     = "Ecs"
	gcpMod     = "Gcp"
	gkeMod     = "Gke"
	azureMod   = "Azure"
	mainMod    = "index"
	sparkMod   = "Spark"
	oceancdMod = "Oceancd"
)

var namespaceMap = map[string]string{
	"spotinst": "SpotInst",
}

// makeMember manufactures a type token for the OpenStack package and the given module and type.  It automatically
// uses the SpotInst package and names the file by simply lower casing the resource's first character.
func makeMember(moduleTitle string, mem string) tokens.ModuleMember {
	moduleName := strings.ToLower(moduleTitle)
	namespaceMap[moduleName] = moduleTitle
	fn := string(unicode.ToLower(rune(mem[0]))) + mem[1:]
	token := moduleName + "/" + fn
	return tokens.ModuleMember(mainPkg + ":" + token + ":" + mem)
}

// makeType manufactures a type token for the package and the given module and type.
func makeType(mod string, typ string) tokens.Type {
	return tokens.Type(makeMember(mod, typ))
}

// makeResource manufactures a standard resource token given a module and resource name.
func makeResource(mod string, res string) tokens.Type {
	return makeType(mod, res)
}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := shimv2.NewProvider(spotinst.Provider())

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:           p,
		Name:        "spotinst",
		Description: "A Pulumi package for creating and managing spotinst cloud resources.",
		Keywords:    []string{"pulumi", "spotinst"},
		License:     "Apache-2.0",
		Homepage:    "https://pulumi.io",
		GitHubOrg:   "spotinst",
		Repository:  "https://github.com/pulumi/pulumi-spotinst",
		Config:      map[string]*tfbridge.SchemaInfo{},
		DocRules:    &tfbridge.DocRuleInfo{EditRules: docEditRules},
		Resources: map[string]*tfbridge.ResourceInfo{
			"spotinst_account_aws":                {Tok: makeResource(awsMod, "Account")},
			"spotinst_credentials_aws":            {Tok: makeResource(awsMod, "Credentials")},
			"spotinst_elastigroup_aws":            {Tok: makeResource(awsMod, "Elastigroup")},
			"spotinst_elastigroup_aws_beanstalk":  {Tok: makeResource(awsMod, "Beanstalk")},
			"spotinst_elastigroup_aws_suspension": {Tok: makeResource(awsMod, "Suspension")},
			"spotinst_managed_instance_aws": {
				Tok:  makeResource(awsMod, "ManagedInstance"),
				Docs: noUpstreamDocs,
			},
			"spotinst_ocean_aks_np_virtual_node_group": {
				Tok:  makeResource(azureMod, "OceanNpVirtualNodeGroup"),
				Docs: noUpstreamDocs,
			},
			"spotinst_ocean_aks_np": {
				Tok:  makeResource(azureMod, "OceanNp"),
				Docs: noUpstreamDocs,
			},
			"spotinst_elastigroup_gcp": {
				Tok: makeResource(gcpMod, "Elastigroup"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"gpu": {Name: "gpu"},
				},
			},
			"spotinst_elastigroup_gke": {
				Tok: makeResource(gkeMod, "Elastigroup"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"gpu": {Name: "gpu"},
				},
			},
			"spotinst_mrscaler_aws": {Tok: makeResource(awsMod, "MrScalar")},

			"spotinst_ocean_aws":                              {Tok: makeResource(awsMod, "Ocean")},
			"spotinst_ocean_aws_launch_spec":                  {Tok: makeResource(awsMod, "OceanLaunchSpec")},
			"spotinst_ocean_aws_extended_resource_definition": {Tok: makeResource(awsMod, "OceanExtendedResourceDefinition")},
			"spotinst_ocean_ecs":                              {Tok: makeResource(ecsMod, "Ocean")},
			"spotinst_ocean_ecs_launch_spec":                  {Tok: makeResource(ecsMod, "OceanLaunchSpec")},
			"spotinst_ocean_gke_import":                       {Tok: makeResource(gkeMod, "OceanImport")},
			"spotinst_ocean_gke_launch_spec":                  {Tok: makeResource(gkeMod, "OceanLaunchSpec")},
			"spotinst_ocean_gke_launch_spec_import":           {Tok: makeResource(gkeMod, "OceanLaunchSpecImport")},
			"spotinst_ocean_spark":                            {Tok: makeResource(sparkMod, "Ocean")},
			"spotinst_ocean_spark_virtual_node_group":         {Tok: makeResource(sparkMod, "OceanVirtualNodeGroup")},
			"spotinst_elastigroup_azure_v3": {
				Tok:  makeResource(mainMod, "ElastigroupAzureV3"),
				Docs: noUpstreamDocs,
			},
			"spotinst_ocean_right_sizing_rule": {Docs: noUpstreamDocs},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			// List any npm dependencies and their versions

			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			RespectSchemaVersion: true,
		},
		Python: &tfbridge.PythonInfo{
			RespectSchemaVersion: true,

			PyProject: struct{ Enabled bool }{true},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: path.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
			RespectSchemaVersion:           true,
		},
		CSharp: &tfbridge.CSharpInfo{
			RespectSchemaVersion: true,
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
			Namespaces: namespaceMap,
		},
		MetadataInfo: tfbridge.NewProviderMetadata(metadata),
	}

	strategy, err := fallbackstrat.KnownModulesWithInferredFallback(
		&prov,
		"spotinst_",
		mainMod,
		[]string{
			"organization",
			"multai",
			"oceancd",
		},
		tks.MakeStandard(mainPkg),
	)
	contract.AssertNoErrorf(err, "failed to create fallback strategy")

	prov.MustComputeTokens(strategy)
	prov.MustApplyAutoAliases()

	prov.SetAutonaming(255, "-")

	return prov
}

var noUpstreamDocs = &tfbridge.DocInfo{AllowMissing: true}

//go:embed cmd/pulumi-resource-spotinst/bridge-metadata.json
var metadata []byte
