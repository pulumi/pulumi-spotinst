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
	"bytes"
	"fmt"
	"path"
	"regexp"
	"strings"
	"unicode"

	// embed is used to store bridge-metadata.json in the compiled binary
	_ "embed"

	"github.com/spotinst/terraform-provider-spotinst/spotinst"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	tks "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"

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
	mainMod    = "Index"
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
		DocRules:         &tfbridge.DocRuleInfo{EditRules: docEditRules},
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
			"spotinst_ocean_aks": {Tok: makeResource(azureMod, "Ocean")},
			"spotinst_ocean_aks_np_virtual_node_group": {
				Tok:  makeResource(azureMod, "OceanNpVirtualNodeGroup"),
				Docs: noUpstreamDocs,
			},
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
			"spotinst_elastigroup_azure_v3": {
				Tok:  makeResource(mainMod, "ElastigroupAzureV3"),
				Docs: noUpstreamDocs,
			},
			"spotinst_data_integration":    {Tok: makeResource(mainMod, "DataIntegration")},
			"spotinst_stateful_node_azure": {Tok: makeResource(mainMod, "StatefulNodeAzure")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			// List any npm dependencies and their versions
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			RespectSchemaVersion: true,
		},
		Python: &tfbridge.PythonInfo{
			RespectSchemaVersion: true,
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
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

	prov.MustComputeTokens(tks.KnownModules("spotinst_", "", []string{
		"organization",
		"multai",
		"oceancd",
	}, tks.MakeStandard(mainPkg)))
	prov.MustApplyAutoAliases()

	prov.SetAutonaming(255, "-")

	return prov
}

var anchorRegexp = regexp.MustCompile(`<a id=\"[a-zA-Z0-9-]*\"></a>`)
var removeAnchors = tfbridge.DocsEdit{
	Path: "*",
	Edit: func(_ string, content []byte) ([]byte, error) {
		content = anchorRegexp.ReplaceAllLiteral(content, nil)
		return content, nil
	},
}
var fixupOcean = tfbridge.DocsEdit{
	Path: "ocean_*.md",
	Edit: func(_ string, content []byte) ([]byte, error) {
		replaces := []string{
			"## Auto Scaler",
			"## Autoscaler",
			"## Scheduled Task",
			"## Attach LoadBalancer",
			"## Detach LoadBalancer",
			"## Update Policy",
			"## scheduled task",
			"## Strategy",
			"## Scheduled task",
			"## Block Devices",
		}

		for _, v := range replaces {
			content = bytes.ReplaceAll(
				content,
				[]byte(v),
				[]byte(""),
			)
		}
		content = bytes.ReplaceAll(content,
			[]byte("terraform-ecs-cluster"),
			[]byte("sample-ecs-cluster"),
		)

		return content, nil
	},
}

var fixUpElastigroup = tfbridge.DocsEdit{
	Path: "elastigroup_*.md",
	Edit: func(path string, content []byte) ([]byte, error) {
		content = bytes.ReplaceAll(content,
			[]byte("## Load Balancers"),
			[]byte("### Load Balancers"),
		)
		content = bytes.ReplaceAll(content,
			[]byte("## Signals"),
			[]byte("### Signals\n\nEach `signal` supports the following:\n"),
		)
		content = bytes.ReplaceAll(content,
			[]byte("## Scheduled Tasks"),
			[]byte("### Scheduled Tasks\n\nEach `scheduled_task` supports the following:\n"),
		)
		content = bytes.ReplaceAll(content,
			[]byte("## Scaling Policies"),
			[]byte("### Scaling Policies\n\n `scaling_up_policy` supports the following:\n"),
		)
		content = bytes.ReplaceAll(content,
			[]byte("## Network Interfaces"),
			[]byte("### Network Interfaces\n\n `network_interface` supports the following:\n"),
		)
		content = bytes.ReplaceAll(content,
			[]byte("## Block Devices"),
			[]byte("### Block Devices"),
		)
		content = bytes.Replace(content,
			[]byte("## Stateful"),
			[]byte("### Stateful"),
			1,
		)
		content = bytes.ReplaceAll(content,
			[]byte("## Stateful Deallocation\n\n* `stateful_deallocation` - (Optional)\n"),
			[]byte("### Stateful Deallocation\n\n `stateful_deallocation` supports the following:\n"),
		)
		content = bytes.ReplaceAll(content,
			[]byte("## Stateful Instance Action\n\n* `stateful_instance_action` - (Optional)\n"),
			[]byte("### Stateful Instance Action\n\n `stateful_instance_action` supports the following:\n"),
		)
		content = bytes.ReplaceAll(content,
			[]byte("## Health Check"),
			[]byte("### Health Check"),
		)
		content = bytes.ReplaceAll(content,
			[]byte("## Third-Party Integrations"),
			[]byte("### Third-Party Integrations"),
		)
		content = bytes.ReplaceAll(content,
			[]byte("## Update Policy\n\n* `update_policy` - (Optional)\n"),
			[]byte("### Update Policy\n\n `update_policy` supports the following:\n"),
		)
		content = bytes.ReplaceAll(content,
			[]byte("## GPU\n\n* `gpu` - (Optional) Defines the GPU configuration.\n"),
			[]byte("### GPU\n\n `gpu` supports the following:\n"),
		)
		content = bytes.ReplaceAll(content,
			[]byte("## Backend Services\n\n* `backend_services` - (Optional) Describes the backend service configurations.\n"),
			[]byte("### Backend Services\n\n `backend_services` supports the following:\n"),
		)
		content = bytes.ReplaceAll(content,
			[]byte("## Disks\n\n* `disks` - (Optional) Array of disks associated with this instance. Persistent disks must be created before you can assign them.\n"),
			[]byte("### Disks\n\n `disk` supports the following:\n"),
		)
		content = bytes.ReplaceAll(content,
			[]byte("## Diff-suppressed Parameters"),
			[]byte("### Diff-suppressed Parameters"),
		)
		content = bytes.ReplaceAll(content,
			[]byte("description = \"created by Terraform\""),
			[]byte("description = \"created by Pulumi\""),
		)
		content = bytes.ReplaceAll(content,
			[]byte("terraform-acc-test-cluster"),
			[]byte("sample-acc-test-cluster"),
		)
		return content, nil
	},
}

var fixupMrScaler = tfbridge.DocsEdit{
	Path: "mrscaler_aws.md",
	Edit: func(_ string, content []byte) ([]byte, error) {
		content = bytes.ReplaceAll(content,
			[]byte("## Example Usage - Clone Strategy"),
			[]byte("## Example Usage\n\n### New Strategy"),
		)
		content = bytes.ReplaceAll(content,
			[]byte("Terraform-MrScaler-01"),
			[]byte("sample-MrScaler-01"),
		)
		content = bytes.ReplaceAll(content,
			[]byte("Testing MrScaler creation via Terraform"),
			[]byte("Testing MrScaler creation"),
		)
		content = bytes.ReplaceAll(content,
			[]byte("bucket = \"terraform-emr-test\""),
			[]byte("bucket = \"sample-emr-test\""),
		)
		content = bytes.ReplaceAll(content,
			[]byte("value = \"Terraform\""),
			[]byte("value = \"Pulumi\""),
		)
		content = bytes.ReplaceAll(content,
			[]byte("## Example Usage - Clone Strategy"),
			[]byte("### Clone Strategy"),
		)
		content = bytes.ReplaceAll(content,
			[]byte("value = \"${spotinst_mrscaler_aws.Terraform-MrScaler-01"),
			[]byte("value = \"${spotinst_mrscaler_aws.sample-MrScaler-01"),
		)
		content = bytes.ReplaceAll(content,
			[]byte("## Example Usage - Wrap Strategy"),
			[]byte("### Wrap Strategy"),
		)
		content = bytes.ReplaceAll(content,
			[]byte("description = \"created by Terraform\""),
			[]byte("description = \"created by Pulumi\""),
		)
		content = bytes.ReplaceAll(content,
			[]byte("`expose_cluster_id` - (Optional) Allow the `cluster_id` to set a Terraform output variable."),
			[]byte("`expose_cluster_id` - (Optional) Allow the `cluster_id` to set a provider output variable."),
		)
		content = bytes.ReplaceAll(content,
			[]byte("## Provisioning Timeout"),
			[]byte("### Provisioning Timeout"),
		)
		content = bytes.ReplaceAll(content,
			[]byte("## Cluster Configuration"),
			[]byte("### Cluster Configuration"),
		)
		content = bytes.ReplaceAll(content,
			[]byte("## Task Group"),
			[]byte("### Task Group"),
		)
		content = bytes.ReplaceAll(content,
			[]byte("## Core Group"),
			[]byte("### Core Group"),
		)
		content = bytes.ReplaceAll(content,
			[]byte("## Master Group"),
			[]byte("### Master Group"),
		)
		content = bytes.ReplaceAll(content,
			[]byte("## Tags"),
			[]byte("### Tags"),
		)
		content = bytes.ReplaceAll(content,
			[]byte("## Optional Compute Parameters"),
			[]byte("### Optional Compute Parameters"),
		)
		content = bytes.ReplaceAll(content,
			[]byte("## Availability Zones"),
			[]byte("### Availability Zones"),
		)
		content = bytes.ReplaceAll(content,
			[]byte("## Configurations"),
			[]byte("### Configurations"),
		)
		content = bytes.ReplaceAll(content,
			[]byte("## Steps"),
			[]byte("### Steps"),
		)
		content = bytes.ReplaceAll(content,
			[]byte("## Bootstrap Actions"),
			[]byte("### Bootstrap Actions"),
		)
		content = bytes.ReplaceAll(content,
			[]byte("## Scaling Policies"),
			[]byte("### Scaling Policies"),
		)
		content = bytes.ReplaceAll(content,
			[]byte("## Scheduled Tasks"),
			[]byte("### Scheduled Tasks"),
		)
		content = bytes.ReplaceAll(content,
			[]byte("## termination policies"),
			[]byte("### termination policies"),
		)
		content = bytes.ReplaceAll(content,
			[]byte("## termination policies\n\n## Example Usage"),
			[]byte("### termination policies"),
		)

		return content, nil
	},
}

var fixUpStatefulNode = tfbridge.DocsEdit{
	Path: "stateful_node_aws.md",
	Edit: func(path string, content []byte) ([]byte, error) {

		replaces := []struct {
			old string
			new string
		}{
			{
				"description = \"created by Terraform\"",
				"description = \"created by Pulumi\"",
			},
			{
				"## Block Device Mapping",
				"### Block Device Mapping",
			},
			{
				"## Resource Tag Specification",
				"### Resource Tag Specification",
			},
			{
				"## Network Interface",
				"### Network Interface",
			},
			{
				"## Scheduled Tasks",
				"### Scheduled Tasks",
			},
			{
				"## Load Balancers",
				"### Load Balancers",
			},
			{
				"## Route53",
				"### Route53",
			},
			{
				"## Managed Instance Action",
				"### Managed Instance Action",
			},
		}

		for _, replace := range replaces {
			content = bytes.ReplaceAll(
				content,
				[]byte(replace.old),
				[]byte(replace.new),
			)
		}

		//content = bytes.ReplaceAll(content,
		//	[]byte("## Resource Tag Specification"),
		//	[]byte("### Resource Tag Specification"),
		//)
		//content = bytes.ReplaceAll(content,
		//	[]byte("## Scaling Policies"),
		//	[]byte("### Scaling Policies\n\n `scaling_up_policy` supports the following:\n"),
		//)
		//content = bytes.ReplaceAll(content,
		//	[]byte("## Network Interfaces"),
		//	[]byte("### Network Interfaces\n\n `network_interface` supports the following:\n"),
		//)
		//content = bytes.ReplaceAll(content,
		//	[]byte("## Block Devices"),
		//	[]byte("### Block Devices"),
		//)
		//content = bytes.Replace(content,
		//	[]byte("## Stateful"),
		//	[]byte("### Stateful"),
		//	1,
		//)
		//content = bytes.ReplaceAll(content,
		//	[]byte("## Stateful Deallocation\n\n* `stateful_deallocation` - (Optional)\n"),
		//	[]byte("### Stateful Deallocation\n\n `stateful_deallocation` supports the following:\n"),
		//)
		//content = bytes.ReplaceAll(content,
		//	[]byte("## Stateful Instance Action\n\n* `stateful_instance_action` - (Optional)\n"),
		//	[]byte("### Stateful Instance Action\n\n `stateful_instance_action` supports the following:\n"),
		//)
		//content = bytes.ReplaceAll(content,
		//	[]byte("## Health Check"),
		//	[]byte("### Health Check"),
		//)
		//content = bytes.ReplaceAll(content,
		//	[]byte("## Third-Party Integrations"),
		//	[]byte("### Third-Party Integrations"),
		//)
		//content = bytes.ReplaceAll(content,
		//	[]byte("## Update Policy\n\n* `update_policy` - (Optional)\n"),
		//	[]byte("### Update Policy\n\n `update_policy` supports the following:\n"),
		//)
		//content = bytes.ReplaceAll(content,
		//	[]byte("## GPU\n\n* `gpu` - (Optional) Defines the GPU configuration.\n"),
		//	[]byte("### GPU\n\n `gpu` supports the following:\n"),
		//)
		//content = bytes.ReplaceAll(content,
		//	[]byte("## Backend Services\n\n* `backend_services` - (Optional) Describes the backend service configurations.\n"),
		//	[]byte("### Backend Services\n\n `backend_services` supports the following:\n"),
		//)
		//content = bytes.ReplaceAll(content,
		//	[]byte("## Disks\n\n* `disks` - (Optional) Array of disks associated with this instance. Persistent disks must be created before you can assign them.\n"),
		//	[]byte("### Disks\n\n `disk` supports the following:\n"),
		//)
		//content = bytes.ReplaceAll(content,
		//	[]byte("## Diff-suppressed Parameters"),
		//	[]byte("### Diff-suppressed Parameters"),
		//)
		//content = bytes.ReplaceAll(content,
		//	[]byte("description = \"created by Terraform\""),
		//	[]byte("description = \"created by Pulumi\""),
		//)
		//content = bytes.ReplaceAll(content,
		//	[]byte("terraform-acc-test-cluster"),
		//	[]byte("sample-acc-test-cluster"),
		//)
		return content, nil
	},
}

var fixupHealthCheck = tfbridge.DocsEdit{
	Path: "health_check.md",
	Edit: func(_ string, content []byte) ([]byte, error) {
		content = bytes.ReplaceAll(content,
			[]byte("terraform_healt_cheack"),
			[]byte("sample_health_check"),
		)
		return content, nil
	},
}

func docEditRules(defaults []tfbridge.DocsEdit) []tfbridge.DocsEdit {
	return append(defaults, fixUpElastigroup, fixupOcean, fixupMrScaler, removeAnchors)
}

var noUpstreamDocs = &tfbridge.DocInfo{AllowMissing: true}

//go:embed cmd/pulumi-resource-spotinst/bridge-metadata.json
var metadata []byte
