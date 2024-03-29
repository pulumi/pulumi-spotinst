// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package azure

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
	case "spotinst:azure/elastigroup:Elastigroup":
		r = &Elastigroup{}
	case "spotinst:azure/ocean:Ocean":
		r = &Ocean{}
	case "spotinst:azure/oceanNp:OceanNp":
		r = &OceanNp{}
	case "spotinst:azure/oceanNpVirtualNodeGroup:OceanNpVirtualNodeGroup":
		r = &OceanNpVirtualNodeGroup{}
	case "spotinst:azure/oceanVirtualNodeGroup:OceanVirtualNodeGroup":
		r = &OceanVirtualNodeGroup{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

func init() {
	version, err := internal.PkgVersion()
	if err != nil {
		version = semver.Version{Major: 1}
	}
	pulumi.RegisterResourceModule(
		"spotinst",
		"azure/elastigroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"spotinst",
		"azure/ocean",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"spotinst",
		"azure/oceanNp",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"spotinst",
		"azure/oceanNpVirtualNodeGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"spotinst",
		"azure/oceanVirtualNodeGroup",
		&module{version},
	)
}
