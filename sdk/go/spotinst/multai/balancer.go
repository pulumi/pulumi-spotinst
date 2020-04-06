// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package multai

import (
	"reflect"

	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a Spotinst Multai Balancer.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-spotinst/blob/master/website/docs/r/multai_balancer.html.markdown.
type Balancer struct {
	pulumi.CustomResourceState

	ConnectionTimeouts BalancerConnectionTimeoutsPtrOutput `pulumi:"connectionTimeouts"`
	DnsCnameAliases    pulumi.StringArrayOutput            `pulumi:"dnsCnameAliases"`
	// The balancer name. May contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
	Name   pulumi.StringOutput    `pulumi:"name"`
	Scheme pulumi.StringPtrOutput `pulumi:"scheme"`
	// A list of key:value paired tags.
	Tags BalancerTagArrayOutput `pulumi:"tags"`
}

// NewBalancer registers a new resource with the given unique name, arguments, and options.
func NewBalancer(ctx *pulumi.Context,
	name string, args *BalancerArgs, opts ...pulumi.ResourceOption) (*Balancer, error) {
	if args == nil {
		args = &BalancerArgs{}
	}
	var resource Balancer
	err := ctx.RegisterResource("spotinst:multai/balancer:Balancer", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBalancer gets an existing Balancer resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBalancer(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BalancerState, opts ...pulumi.ResourceOption) (*Balancer, error) {
	var resource Balancer
	err := ctx.ReadResource("spotinst:multai/balancer:Balancer", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Balancer resources.
type balancerState struct {
	ConnectionTimeouts *BalancerConnectionTimeouts `pulumi:"connectionTimeouts"`
	DnsCnameAliases    []string                    `pulumi:"dnsCnameAliases"`
	// The balancer name. May contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
	Name   *string `pulumi:"name"`
	Scheme *string `pulumi:"scheme"`
	// A list of key:value paired tags.
	Tags []BalancerTag `pulumi:"tags"`
}

type BalancerState struct {
	ConnectionTimeouts BalancerConnectionTimeoutsPtrInput
	DnsCnameAliases    pulumi.StringArrayInput
	// The balancer name. May contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
	Name   pulumi.StringPtrInput
	Scheme pulumi.StringPtrInput
	// A list of key:value paired tags.
	Tags BalancerTagArrayInput
}

func (BalancerState) ElementType() reflect.Type {
	return reflect.TypeOf((*balancerState)(nil)).Elem()
}

type balancerArgs struct {
	ConnectionTimeouts *BalancerConnectionTimeouts `pulumi:"connectionTimeouts"`
	DnsCnameAliases    []string                    `pulumi:"dnsCnameAliases"`
	// The balancer name. May contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
	Name   *string `pulumi:"name"`
	Scheme *string `pulumi:"scheme"`
	// A list of key:value paired tags.
	Tags []BalancerTag `pulumi:"tags"`
}

// The set of arguments for constructing a Balancer resource.
type BalancerArgs struct {
	ConnectionTimeouts BalancerConnectionTimeoutsPtrInput
	DnsCnameAliases    pulumi.StringArrayInput
	// The balancer name. May contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
	Name   pulumi.StringPtrInput
	Scheme pulumi.StringPtrInput
	// A list of key:value paired tags.
	Tags BalancerTagArrayInput
}

func (BalancerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*balancerArgs)(nil)).Elem()
}
