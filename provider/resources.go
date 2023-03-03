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
	"path/filepath"
	"strings"
	"unicode"

	"github.com/pulumi/pulumi-spotinst/provider/v3/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/x"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
	"github.com/pulumi/pulumi/sdk/v3/go/common/util/contract"
	"github.com/spotinst/terraform-provider-spotinst/spotinst"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "spotinst"
	// modules:
	awsMod    = "Aws"
	ecsMod    = "Ecs"
	gcpMod    = "Gcp"
	gkeMod    = "Gke"
	azureMod  = "Azure"
	multaiMod = "Multai"
	mainMod   = "Index"
	sparkMod  = "Spark"
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
		P:                p,
		Name:             "spotinst",
		Description:      "A Pulumi package for creating and managing spotinst cloud resources.",
		Keywords:         []string{"pulumi", "spotinst"},
		License:          "Apache-2.0",
		Homepage:         "https://pulumi.io",
		GitHubOrg:        "spotinst",
		Repository:       "https://github.com/pulumi/pulumi-spotinst",
		Config:           map[string]*tfbridge.SchemaInfo{},
		UpstreamRepoPath: "./upstream",
		Resources: map[string]*tfbridge.ResourceInfo{
			"spotinst_elastigroup_aws":            {Tok: makeResource(awsMod, "Elastigroup")},
			"spotinst_elastigroup_aws_beanstalk":  {Tok: makeResource(awsMod, "Beanstalk")},
			"spotinst_elastigroup_aws_suspension": {Tok: makeResource(awsMod, "Suspension")},
			"spotinst_managed_instance_aws":       {Tok: makeResource(awsMod, "ManagedInstance")},
			"spotinst_elastigroup_azure":          {Tok: makeResource(azureMod, "Elastigroup")},
			"spotinst_ocean_aks":                  {Tok: makeResource(azureMod, "Ocean")},
			"spotinst_ocean_aks_np": {
				Tok:  makeResource(azureMod, "OceanNp"),
				Docs: noUpstreamDocs,
			},
			"spotinst_ocean_aks_virtual_node_group": {Tok: makeResource(azureMod, "OceanVirtualNodeGroup")},
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

			// Lack of docs is tracked in: https://github.com/pulumi/pulumi-spotinst/issues/193
			"spotinst_multai_balancer": {
				Tok:  makeResource(multaiMod, "Balancer"),
				Docs: noUpstreamDocs,
			},
			"spotinst_multai_deployment": {
				Tok:  makeResource(multaiMod, "Deployment"),
				Docs: noUpstreamDocs,
			},
			"spotinst_multai_listener": {
				Tok:  makeResource(multaiMod, "Listener"),
				Docs: noUpstreamDocs,
			},
			"spotinst_multai_routing_rule": {
				Tok:  makeResource(multaiMod, "RoutingRule"),
				Docs: noUpstreamDocs,
			},
			"spotinst_multai_target": {
				Tok:  makeResource(multaiMod, "Target"),
				Docs: noUpstreamDocs,
			},
			"spotinst_multai_target_set": {
				Tok:  makeResource(multaiMod, "TargetSet"),
				Docs: noUpstreamDocs,
			},

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
			"spotinst_subscription":                           {Tok: makeResource(mainMod, "Subscription")},
			"spotinst_health_check":                           {Tok: makeResource(mainMod, "HealthCheck")},
			"spotinst_elastigroup_azure_v3":                   {Tok: makeResource(mainMod, "ElastigroupAzureV3")},
			"spotinst_data_integration":                       {Tok: makeResource(mainMod, "DataIntegration")},
			"spotinst_stateful_node_azure":                    {Tok: makeResource(mainMod, "StatefulNodeAzure")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{},
		JavaScript: &tfbridge.JavaScriptInfo{
			// List any npm dependencies and their versions
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
		},
		Python: &tfbridge.PythonInfo{
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
			Namespaces: namespaceMap,
		},
	}
	err := x.ComputeDefaults(&prov, x.TokensKnownModules("spotinst_", mainMod, []string{
		"aws_",
		"ecs_",
		"gcp_",
		"gke_",
		"azure_",
		"multai_",
		"spark_",
	}, x.MakeStandardToken(mainPkg)))
	contract.AssertNoError(err)
	prov.SetAutonaming(255, "-")

	return prov
}

var noUpstreamDocs = &tfbridge.DocInfo{
	Markdown: []byte(" "),
}
