// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package aws

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
	case "spotinst:aws/account:Account":
		r = &Account{}
	case "spotinst:aws/beanstalk:Beanstalk":
		r = &Beanstalk{}
	case "spotinst:aws/credentials:Credentials":
		r = &Credentials{}
	case "spotinst:aws/elastigroup:Elastigroup":
		r = &Elastigroup{}
	case "spotinst:aws/managedInstance:ManagedInstance":
		r = &ManagedInstance{}
	case "spotinst:aws/mrScalar:MrScalar":
		r = &MrScalar{}
	case "spotinst:aws/ocean:Ocean":
		r = &Ocean{}
	case "spotinst:aws/oceanExtendedResourceDefinition:OceanExtendedResourceDefinition":
		r = &OceanExtendedResourceDefinition{}
	case "spotinst:aws/oceanLaunchSpec:OceanLaunchSpec":
		r = &OceanLaunchSpec{}
	case "spotinst:aws/suspension:Suspension":
		r = &Suspension{}
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
		"aws/account",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"spotinst",
		"aws/beanstalk",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"spotinst",
		"aws/credentials",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"spotinst",
		"aws/elastigroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"spotinst",
		"aws/managedInstance",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"spotinst",
		"aws/mrScalar",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"spotinst",
		"aws/ocean",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"spotinst",
		"aws/oceanExtendedResourceDefinition",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"spotinst",
		"aws/oceanLaunchSpec",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"spotinst",
		"aws/suspension",
		&module{version},
	)
}
