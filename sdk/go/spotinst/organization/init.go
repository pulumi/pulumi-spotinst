// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package organization

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
	case "spotinst:organization/policy:Policy":
		r = &Policy{}
	case "spotinst:organization/programmaticUser:ProgrammaticUser":
		r = &ProgrammaticUser{}
	case "spotinst:organization/user:User":
		r = &User{}
	case "spotinst:organization/userGroup:UserGroup":
		r = &UserGroup{}
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
		"organization/policy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"spotinst",
		"organization/programmaticUser",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"spotinst",
		"organization/user",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"spotinst",
		"organization/userGroup",
		&module{version},
	)
}
