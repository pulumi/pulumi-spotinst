// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package multai

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

type TargetSet struct {
	pulumi.CustomResourceState

	BalancerId   pulumi.StringOutput        `pulumi:"balancerId"`
	DeploymentId pulumi.StringOutput        `pulumi:"deploymentId"`
	HealthCheck  TargetSetHealthCheckOutput `pulumi:"healthCheck"`
	Name         pulumi.StringOutput        `pulumi:"name"`
	Port         pulumi.IntPtrOutput        `pulumi:"port"`
	Protocol     pulumi.StringOutput        `pulumi:"protocol"`
	Tags         TargetSetTagArrayOutput    `pulumi:"tags"`
	Weight       pulumi.IntOutput           `pulumi:"weight"`
}

// NewTargetSet registers a new resource with the given unique name, arguments, and options.
func NewTargetSet(ctx *pulumi.Context,
	name string, args *TargetSetArgs, opts ...pulumi.ResourceOption) (*TargetSet, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.BalancerId == nil {
		return nil, errors.New("invalid value for required argument 'BalancerId'")
	}
	if args.DeploymentId == nil {
		return nil, errors.New("invalid value for required argument 'DeploymentId'")
	}
	if args.HealthCheck == nil {
		return nil, errors.New("invalid value for required argument 'HealthCheck'")
	}
	if args.Protocol == nil {
		return nil, errors.New("invalid value for required argument 'Protocol'")
	}
	if args.Weight == nil {
		return nil, errors.New("invalid value for required argument 'Weight'")
	}
	var resource TargetSet
	err := ctx.RegisterResource("spotinst:multai/targetSet:TargetSet", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTargetSet gets an existing TargetSet resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTargetSet(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TargetSetState, opts ...pulumi.ResourceOption) (*TargetSet, error) {
	var resource TargetSet
	err := ctx.ReadResource("spotinst:multai/targetSet:TargetSet", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TargetSet resources.
type targetSetState struct {
	BalancerId   *string               `pulumi:"balancerId"`
	DeploymentId *string               `pulumi:"deploymentId"`
	HealthCheck  *TargetSetHealthCheck `pulumi:"healthCheck"`
	Name         *string               `pulumi:"name"`
	Port         *int                  `pulumi:"port"`
	Protocol     *string               `pulumi:"protocol"`
	Tags         []TargetSetTag        `pulumi:"tags"`
	Weight       *int                  `pulumi:"weight"`
}

type TargetSetState struct {
	BalancerId   pulumi.StringPtrInput
	DeploymentId pulumi.StringPtrInput
	HealthCheck  TargetSetHealthCheckPtrInput
	Name         pulumi.StringPtrInput
	Port         pulumi.IntPtrInput
	Protocol     pulumi.StringPtrInput
	Tags         TargetSetTagArrayInput
	Weight       pulumi.IntPtrInput
}

func (TargetSetState) ElementType() reflect.Type {
	return reflect.TypeOf((*targetSetState)(nil)).Elem()
}

type targetSetArgs struct {
	BalancerId   string               `pulumi:"balancerId"`
	DeploymentId string               `pulumi:"deploymentId"`
	HealthCheck  TargetSetHealthCheck `pulumi:"healthCheck"`
	Name         *string              `pulumi:"name"`
	Port         *int                 `pulumi:"port"`
	Protocol     string               `pulumi:"protocol"`
	Tags         []TargetSetTag       `pulumi:"tags"`
	Weight       int                  `pulumi:"weight"`
}

// The set of arguments for constructing a TargetSet resource.
type TargetSetArgs struct {
	BalancerId   pulumi.StringInput
	DeploymentId pulumi.StringInput
	HealthCheck  TargetSetHealthCheckInput
	Name         pulumi.StringPtrInput
	Port         pulumi.IntPtrInput
	Protocol     pulumi.StringInput
	Tags         TargetSetTagArrayInput
	Weight       pulumi.IntInput
}

func (TargetSetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*targetSetArgs)(nil)).Elem()
}

type TargetSetInput interface {
	pulumi.Input

	ToTargetSetOutput() TargetSetOutput
	ToTargetSetOutputWithContext(ctx context.Context) TargetSetOutput
}

func (TargetSet) ElementType() reflect.Type {
	return reflect.TypeOf((*TargetSet)(nil)).Elem()
}

func (i TargetSet) ToTargetSetOutput() TargetSetOutput {
	return i.ToTargetSetOutputWithContext(context.Background())
}

func (i TargetSet) ToTargetSetOutputWithContext(ctx context.Context) TargetSetOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TargetSetOutput)
}

type TargetSetOutput struct {
	*pulumi.OutputState
}

func (TargetSetOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*TargetSetOutput)(nil)).Elem()
}

func (o TargetSetOutput) ToTargetSetOutput() TargetSetOutput {
	return o
}

func (o TargetSetOutput) ToTargetSetOutputWithContext(ctx context.Context) TargetSetOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(TargetSetOutput{})
}
