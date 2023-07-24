// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package spotinst

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-spotinst/sdk/v3/go/spotinst/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "spotinst:index/dataIntegration:DataIntegration":
		r = &DataIntegration{}
	case "spotinst:index/elastigroupAzureV3:ElastigroupAzureV3":
		r = &ElastigroupAzureV3{}
	case "spotinst:index/healthCheck:HealthCheck":
		r = &HealthCheck{}
	case "spotinst:index/statefulNodeAzure:StatefulNodeAzure":
		r = &StatefulNodeAzure{}
	case "spotinst:index/subscription:Subscription":
		r = &Subscription{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

type pkg struct {
	version semver.Version
}

func (p *pkg) Version() semver.Version {
	return p.version
}

func (p *pkg) ConstructProvider(ctx *pulumi.Context, name, typ, urn string) (pulumi.ProviderResource, error) {
	if typ != "pulumi:providers:spotinst" {
		return nil, fmt.Errorf("unknown provider type: %s", typ)
	}

	r := &Provider{}
	err := ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return r, err
}

func init() {
	version, err := internal.PkgVersion()
	if err != nil {
		version = semver.Version{Major: 1}
	}
	pulumi.RegisterResourceModule(
		"spotinst",
		"index/dataIntegration",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"spotinst",
		"index/elastigroupAzureV3",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"spotinst",
		"index/healthCheck",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"spotinst",
		"index/statefulNodeAzure",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"spotinst",
		"index/subscription",
		&module{version},
	)
	pulumi.RegisterResourcePackage(
		"spotinst",
		&pkg{version},
	)
}
