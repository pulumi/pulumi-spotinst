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
	"strings"
	"unicode"

	"github.com/hashicorp/terraform-plugin-sdk/helper/schema"
	"github.com/pulumi/pulumi-terraform-bridge/v2/pkg/tfbridge"
	"github.com/pulumi/pulumi/sdk/v2/go/common/tokens"
	"github.com/terraform-providers/terraform-provider-spotinst/spotinst"
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
	p := spotinst.Provider().(*schema.Provider)

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:           p,
		Name:        "spotinst",
		Description: "A Pulumi package for creating and managing spotinst cloud resources.",
		Keywords:    []string{"pulumi", "spotinst"},
		License:     "Apache-2.0",
		Homepage:    "https://pulumi.io",
		Repository:  "https://github.com/pulumi/pulumi-spotinst",
		Config: map[string]*tfbridge.SchemaInfo{
			"account": {
				Default: &tfbridge.DefaultInfo{
					Value:   "",
					EnvVars: []string{"SPOTINST_ACCOUNT"},
				},
			},
			"token": {
				Default: &tfbridge.DefaultInfo{
					Value:   "",
					EnvVars: []string{"SPOTINST_TOKEN"},
				},
			},
		},
		Resources: map[string]*tfbridge.ResourceInfo{
			"spotinst_elastigroup_aws":           {Tok: makeResource(awsMod, "Elastigroup")},
			"spotinst_elastigroup_aws_beanstalk": {Tok: makeResource(awsMod, "Beanstalk")},
			"spotinst_managed_instance_aws":      {Tok: makeResource(awsMod, "ManagedInstance")},
			"spotinst_elastigroup_azure":         {Tok: makeResource(azureMod, "Elastigroup")},
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
			"spotinst_mrscaler_aws":                 {Tok: makeResource(awsMod, "MrScalar")},
			"spotinst_multai_balancer":              {Tok: makeResource(multaiMod, "Balancer")},
			"spotinst_multai_deployment":            {Tok: makeResource(multaiMod, "Deployment")},
			"spotinst_multai_listener":              {Tok: makeResource(multaiMod, "Listener")},
			"spotinst_multai_routing_rule":          {Tok: makeResource(multaiMod, "RoutingRule")},
			"spotinst_multai_target":                {Tok: makeResource(multaiMod, "Target")},
			"spotinst_multai_target_set":            {Tok: makeResource(multaiMod, "TargetSet")},
			"spotinst_ocean_aws":                    {Tok: makeResource(awsMod, "Ocean")},
			"spotinst_ocean_aws_launch_spec":        {Tok: makeResource(awsMod, "OceanLaunchSpec")},
			"spotinst_ocean_ecs":                    {Tok: makeResource(ecsMod, "Ocean")},
			"spotinst_ocean_ecs_launch_spec":        {Tok: makeResource(ecsMod, "OceanLaunchSpec")},
			"spotinst_ocean_gke_import":             {Tok: makeResource(gkeMod, "OceanImport")},
			"spotinst_ocean_gke_launch_spec":        {Tok: makeResource(gkeMod, "OceanLaunchSpec")},
			"spotinst_ocean_gke_launch_spec_import": {Tok: makeResource(gkeMod, "OceanLaunchSpecImport")},
			"spotinst_subscription":                 {Tok: makeResource(mainMod, "Subscription")},
			"spotinst_health_check":                 {Tok: makeResource(mainMod, "HealthCheck")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{},
		JavaScript: &tfbridge.JavaScriptInfo{
			AsyncDataSources: true,
			// List any npm dependencies and their versions
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^2.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^8.0.25", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			// See the documentation for tfbridge.OverlayInfo for how to lay out this
			// section, or refer to the AWS provider. Delete this section if there are
			// no overlay files.
			//Overlay: &tfbridge.OverlayInfo{},
		},
		Python: &tfbridge.PythonInfo{
			// List any Python dependencies and their version ranges
			Requires: map[string]string{
				"pulumi": ">=2.0.0,<3.0.0",
			},
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi":                       "2.*",
				"System.Collections.Immutable": "1.6.0",
			},
			Namespaces: namespaceMap,
		},
	}

	// For all resources with name properties, we will add an auto-name property.  Make sure to skip those that
	// already have a name mapping entry, since those may have custom overrides set above (e.g., for length).
	const nameProperty = "name"
	for resname, res := range prov.Resources {
		if schema := p.ResourcesMap[resname]; schema != nil {
			// Only apply auto-name to input properties (Optional || Required) named `name`
			if tfs, has := schema.Schema[nameProperty]; has && (tfs.Optional || tfs.Required) {
				if _, hasfield := res.Fields[nameProperty]; !hasfield {
					if res.Fields == nil {
						res.Fields = make(map[string]*tfbridge.SchemaInfo)
					}
					res.Fields[nameProperty] = tfbridge.AutoName(nameProperty, 255)
				}
			}
		}
	}

	return prov
}
