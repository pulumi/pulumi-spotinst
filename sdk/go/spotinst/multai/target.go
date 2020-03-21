// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package multai

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a Spotinst Multai Target.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-spotinst/blob/master/website/docs/r/multai_target.html.markdown.
type Target struct {
	pulumi.CustomResourceState

	// The ID of the balancer.
	BalancerId pulumi.StringOutput `pulumi:"balancerId"`
	// The address (IP or URL) of the targets to register
	Host pulumi.StringOutput `pulumi:"host"`
	// The name of the Target . Must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
	Name pulumi.StringOutput `pulumi:"name"`
	// The port the target will register to.
	Port pulumi.IntPtrOutput `pulumi:"port"`
	// A list of key:value paired tags.
	Tags TargetTagArrayOutput `pulumi:"tags"`
	// The ID of the target set.
	TargetSetId pulumi.StringOutput `pulumi:"targetSetId"`
	// Defines how traffic is distributed between targets.
	Weight pulumi.IntOutput `pulumi:"weight"`
}

// NewTarget registers a new resource with the given unique name, arguments, and options.
func NewTarget(ctx *pulumi.Context,
	name string, args *TargetArgs, opts ...pulumi.ResourceOption) (*Target, error) {
	if args == nil || args.BalancerId == nil {
		return nil, errors.New("missing required argument 'BalancerId'")
	}
	if args == nil || args.Host == nil {
		return nil, errors.New("missing required argument 'Host'")
	}
	if args == nil || args.TargetSetId == nil {
		return nil, errors.New("missing required argument 'TargetSetId'")
	}
	if args == nil || args.Weight == nil {
		return nil, errors.New("missing required argument 'Weight'")
	}
	if args == nil {
		args = &TargetArgs{}
	}
	var resource Target
	err := ctx.RegisterResource("spotinst:multai/target:Target", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTarget gets an existing Target resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTarget(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TargetState, opts ...pulumi.ResourceOption) (*Target, error) {
	var resource Target
	err := ctx.ReadResource("spotinst:multai/target:Target", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Target resources.
type targetState struct {
	// The ID of the balancer.
	BalancerId *string `pulumi:"balancerId"`
	// The address (IP or URL) of the targets to register
	Host *string `pulumi:"host"`
	// The name of the Target . Must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
	Name *string `pulumi:"name"`
	// The port the target will register to.
	Port *int `pulumi:"port"`
	// A list of key:value paired tags.
	Tags []TargetTag `pulumi:"tags"`
	// The ID of the target set.
	TargetSetId *string `pulumi:"targetSetId"`
	// Defines how traffic is distributed between targets.
	Weight *int `pulumi:"weight"`
}

type TargetState struct {
	// The ID of the balancer.
	BalancerId pulumi.StringPtrInput
	// The address (IP or URL) of the targets to register
	Host pulumi.StringPtrInput
	// The name of the Target . Must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
	Name pulumi.StringPtrInput
	// The port the target will register to.
	Port pulumi.IntPtrInput
	// A list of key:value paired tags.
	Tags TargetTagArrayInput
	// The ID of the target set.
	TargetSetId pulumi.StringPtrInput
	// Defines how traffic is distributed between targets.
	Weight pulumi.IntPtrInput
}

func (TargetState) ElementType() reflect.Type {
	return reflect.TypeOf((*targetState)(nil)).Elem()
}

type targetArgs struct {
	// The ID of the balancer.
	BalancerId string `pulumi:"balancerId"`
	// The address (IP or URL) of the targets to register
	Host string `pulumi:"host"`
	// The name of the Target . Must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
	Name *string `pulumi:"name"`
	// The port the target will register to.
	Port *int `pulumi:"port"`
	// A list of key:value paired tags.
	Tags []TargetTag `pulumi:"tags"`
	// The ID of the target set.
	TargetSetId string `pulumi:"targetSetId"`
	// Defines how traffic is distributed between targets.
	Weight int `pulumi:"weight"`
}

// The set of arguments for constructing a Target resource.
type TargetArgs struct {
	// The ID of the balancer.
	BalancerId pulumi.StringInput
	// The address (IP or URL) of the targets to register
	Host pulumi.StringInput
	// The name of the Target . Must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
	Name pulumi.StringPtrInput
	// The port the target will register to.
	Port pulumi.IntPtrInput
	// A list of key:value paired tags.
	Tags TargetTagArrayInput
	// The ID of the target set.
	TargetSetId pulumi.StringInput
	// Defines how traffic is distributed between targets.
	Weight pulumi.IntInput
}

func (TargetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*targetArgs)(nil)).Elem()
}

