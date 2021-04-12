// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package multai

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-spotinst/sdk/v2/go/spotinst"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "spotinst:multai/balancer:Balancer":
		r = &Balancer{}
	case "spotinst:multai/deployment:Deployment":
		r = &Deployment{}
	case "spotinst:multai/listener:Listener":
		r = &Listener{}
	case "spotinst:multai/routingRule:RoutingRule":
		r = &RoutingRule{}
	case "spotinst:multai/target:Target":
		r = &Target{}
	case "spotinst:multai/targetSet:TargetSet":
		r = &TargetSet{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

func init() {
	version, err := spotinst.PkgVersion()
	if err != nil {
		fmt.Println("failed to determine package version. defaulting to v1: %v", err)
	}
	pulumi.RegisterResourceModule(
		"spotinst",
		"multai/balancer",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"spotinst",
		"multai/deployment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"spotinst",
		"multai/listener",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"spotinst",
		"multai/routingRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"spotinst",
		"multai/target",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"spotinst",
		"multai/targetSet",
		&module{version},
	)
}
