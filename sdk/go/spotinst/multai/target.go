// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package multai

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

type Target struct {
	pulumi.CustomResourceState

	BalancerId  pulumi.StringOutput  `pulumi:"balancerId"`
	Host        pulumi.StringOutput  `pulumi:"host"`
	Name        pulumi.StringOutput  `pulumi:"name"`
	Port        pulumi.IntPtrOutput  `pulumi:"port"`
	Tags        TargetTagArrayOutput `pulumi:"tags"`
	TargetSetId pulumi.StringOutput  `pulumi:"targetSetId"`
	Weight      pulumi.IntOutput     `pulumi:"weight"`
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
	BalancerId  *string     `pulumi:"balancerId"`
	Host        *string     `pulumi:"host"`
	Name        *string     `pulumi:"name"`
	Port        *int        `pulumi:"port"`
	Tags        []TargetTag `pulumi:"tags"`
	TargetSetId *string     `pulumi:"targetSetId"`
	Weight      *int        `pulumi:"weight"`
}

type TargetState struct {
	BalancerId  pulumi.StringPtrInput
	Host        pulumi.StringPtrInput
	Name        pulumi.StringPtrInput
	Port        pulumi.IntPtrInput
	Tags        TargetTagArrayInput
	TargetSetId pulumi.StringPtrInput
	Weight      pulumi.IntPtrInput
}

func (TargetState) ElementType() reflect.Type {
	return reflect.TypeOf((*targetState)(nil)).Elem()
}

type targetArgs struct {
	BalancerId  string      `pulumi:"balancerId"`
	Host        string      `pulumi:"host"`
	Name        *string     `pulumi:"name"`
	Port        *int        `pulumi:"port"`
	Tags        []TargetTag `pulumi:"tags"`
	TargetSetId string      `pulumi:"targetSetId"`
	Weight      int         `pulumi:"weight"`
}

// The set of arguments for constructing a Target resource.
type TargetArgs struct {
	BalancerId  pulumi.StringInput
	Host        pulumi.StringInput
	Name        pulumi.StringPtrInput
	Port        pulumi.IntPtrInput
	Tags        TargetTagArrayInput
	TargetSetId pulumi.StringInput
	Weight      pulumi.IntInput
}

func (TargetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*targetArgs)(nil)).Elem()
}

type TargetInput interface {
	pulumi.Input

	ToTargetOutput() TargetOutput
	ToTargetOutputWithContext(ctx context.Context) TargetOutput
}

func (Target) ElementType() reflect.Type {
	return reflect.TypeOf((*Target)(nil)).Elem()
}

func (i Target) ToTargetOutput() TargetOutput {
	return i.ToTargetOutputWithContext(context.Background())
}

func (i Target) ToTargetOutputWithContext(ctx context.Context) TargetOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TargetOutput)
}

type TargetOutput struct {
	*pulumi.OutputState
}

func (TargetOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*TargetOutput)(nil)).Elem()
}

func (o TargetOutput) ToTargetOutput() TargetOutput {
	return o
}

func (o TargetOutput) ToTargetOutputWithContext(ctx context.Context) TargetOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(TargetOutput{})
}
