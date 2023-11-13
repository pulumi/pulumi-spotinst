// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package multai

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-spotinst/sdk/v3/go/spotinst/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type RoutingRule struct {
	pulumi.CustomResourceState

	BalancerId    pulumi.StringOutput       `pulumi:"balancerId"`
	ListenerId    pulumi.StringOutput       `pulumi:"listenerId"`
	MiddlewareIds pulumi.StringArrayOutput  `pulumi:"middlewareIds"`
	Priority      pulumi.IntPtrOutput       `pulumi:"priority"`
	Route         pulumi.StringOutput       `pulumi:"route"`
	Strategy      pulumi.StringPtrOutput    `pulumi:"strategy"`
	Tags          RoutingRuleTagArrayOutput `pulumi:"tags"`
	TargetSetIds  pulumi.StringArrayOutput  `pulumi:"targetSetIds"`
}

// NewRoutingRule registers a new resource with the given unique name, arguments, and options.
func NewRoutingRule(ctx *pulumi.Context,
	name string, args *RoutingRuleArgs, opts ...pulumi.ResourceOption) (*RoutingRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.BalancerId == nil {
		return nil, errors.New("invalid value for required argument 'BalancerId'")
	}
	if args.ListenerId == nil {
		return nil, errors.New("invalid value for required argument 'ListenerId'")
	}
	if args.Route == nil {
		return nil, errors.New("invalid value for required argument 'Route'")
	}
	if args.TargetSetIds == nil {
		return nil, errors.New("invalid value for required argument 'TargetSetIds'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RoutingRule
	err := ctx.RegisterResource("spotinst:multai/routingRule:RoutingRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRoutingRule gets an existing RoutingRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRoutingRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RoutingRuleState, opts ...pulumi.ResourceOption) (*RoutingRule, error) {
	var resource RoutingRule
	err := ctx.ReadResource("spotinst:multai/routingRule:RoutingRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RoutingRule resources.
type routingRuleState struct {
	BalancerId    *string          `pulumi:"balancerId"`
	ListenerId    *string          `pulumi:"listenerId"`
	MiddlewareIds []string         `pulumi:"middlewareIds"`
	Priority      *int             `pulumi:"priority"`
	Route         *string          `pulumi:"route"`
	Strategy      *string          `pulumi:"strategy"`
	Tags          []RoutingRuleTag `pulumi:"tags"`
	TargetSetIds  []string         `pulumi:"targetSetIds"`
}

type RoutingRuleState struct {
	BalancerId    pulumi.StringPtrInput
	ListenerId    pulumi.StringPtrInput
	MiddlewareIds pulumi.StringArrayInput
	Priority      pulumi.IntPtrInput
	Route         pulumi.StringPtrInput
	Strategy      pulumi.StringPtrInput
	Tags          RoutingRuleTagArrayInput
	TargetSetIds  pulumi.StringArrayInput
}

func (RoutingRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*routingRuleState)(nil)).Elem()
}

type routingRuleArgs struct {
	BalancerId    string           `pulumi:"balancerId"`
	ListenerId    string           `pulumi:"listenerId"`
	MiddlewareIds []string         `pulumi:"middlewareIds"`
	Priority      *int             `pulumi:"priority"`
	Route         string           `pulumi:"route"`
	Strategy      *string          `pulumi:"strategy"`
	Tags          []RoutingRuleTag `pulumi:"tags"`
	TargetSetIds  []string         `pulumi:"targetSetIds"`
}

// The set of arguments for constructing a RoutingRule resource.
type RoutingRuleArgs struct {
	BalancerId    pulumi.StringInput
	ListenerId    pulumi.StringInput
	MiddlewareIds pulumi.StringArrayInput
	Priority      pulumi.IntPtrInput
	Route         pulumi.StringInput
	Strategy      pulumi.StringPtrInput
	Tags          RoutingRuleTagArrayInput
	TargetSetIds  pulumi.StringArrayInput
}

func (RoutingRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*routingRuleArgs)(nil)).Elem()
}

type RoutingRuleInput interface {
	pulumi.Input

	ToRoutingRuleOutput() RoutingRuleOutput
	ToRoutingRuleOutputWithContext(ctx context.Context) RoutingRuleOutput
}

func (*RoutingRule) ElementType() reflect.Type {
	return reflect.TypeOf((**RoutingRule)(nil)).Elem()
}

func (i *RoutingRule) ToRoutingRuleOutput() RoutingRuleOutput {
	return i.ToRoutingRuleOutputWithContext(context.Background())
}

func (i *RoutingRule) ToRoutingRuleOutputWithContext(ctx context.Context) RoutingRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoutingRuleOutput)
}

// RoutingRuleArrayInput is an input type that accepts RoutingRuleArray and RoutingRuleArrayOutput values.
// You can construct a concrete instance of `RoutingRuleArrayInput` via:
//
//	RoutingRuleArray{ RoutingRuleArgs{...} }
type RoutingRuleArrayInput interface {
	pulumi.Input

	ToRoutingRuleArrayOutput() RoutingRuleArrayOutput
	ToRoutingRuleArrayOutputWithContext(context.Context) RoutingRuleArrayOutput
}

type RoutingRuleArray []RoutingRuleInput

func (RoutingRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RoutingRule)(nil)).Elem()
}

func (i RoutingRuleArray) ToRoutingRuleArrayOutput() RoutingRuleArrayOutput {
	return i.ToRoutingRuleArrayOutputWithContext(context.Background())
}

func (i RoutingRuleArray) ToRoutingRuleArrayOutputWithContext(ctx context.Context) RoutingRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoutingRuleArrayOutput)
}

// RoutingRuleMapInput is an input type that accepts RoutingRuleMap and RoutingRuleMapOutput values.
// You can construct a concrete instance of `RoutingRuleMapInput` via:
//
//	RoutingRuleMap{ "key": RoutingRuleArgs{...} }
type RoutingRuleMapInput interface {
	pulumi.Input

	ToRoutingRuleMapOutput() RoutingRuleMapOutput
	ToRoutingRuleMapOutputWithContext(context.Context) RoutingRuleMapOutput
}

type RoutingRuleMap map[string]RoutingRuleInput

func (RoutingRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RoutingRule)(nil)).Elem()
}

func (i RoutingRuleMap) ToRoutingRuleMapOutput() RoutingRuleMapOutput {
	return i.ToRoutingRuleMapOutputWithContext(context.Background())
}

func (i RoutingRuleMap) ToRoutingRuleMapOutputWithContext(ctx context.Context) RoutingRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoutingRuleMapOutput)
}

type RoutingRuleOutput struct{ *pulumi.OutputState }

func (RoutingRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RoutingRule)(nil)).Elem()
}

func (o RoutingRuleOutput) ToRoutingRuleOutput() RoutingRuleOutput {
	return o
}

func (o RoutingRuleOutput) ToRoutingRuleOutputWithContext(ctx context.Context) RoutingRuleOutput {
	return o
}

func (o RoutingRuleOutput) BalancerId() pulumi.StringOutput {
	return o.ApplyT(func(v *RoutingRule) pulumi.StringOutput { return v.BalancerId }).(pulumi.StringOutput)
}

func (o RoutingRuleOutput) ListenerId() pulumi.StringOutput {
	return o.ApplyT(func(v *RoutingRule) pulumi.StringOutput { return v.ListenerId }).(pulumi.StringOutput)
}

func (o RoutingRuleOutput) MiddlewareIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *RoutingRule) pulumi.StringArrayOutput { return v.MiddlewareIds }).(pulumi.StringArrayOutput)
}

func (o RoutingRuleOutput) Priority() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *RoutingRule) pulumi.IntPtrOutput { return v.Priority }).(pulumi.IntPtrOutput)
}

func (o RoutingRuleOutput) Route() pulumi.StringOutput {
	return o.ApplyT(func(v *RoutingRule) pulumi.StringOutput { return v.Route }).(pulumi.StringOutput)
}

func (o RoutingRuleOutput) Strategy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RoutingRule) pulumi.StringPtrOutput { return v.Strategy }).(pulumi.StringPtrOutput)
}

func (o RoutingRuleOutput) Tags() RoutingRuleTagArrayOutput {
	return o.ApplyT(func(v *RoutingRule) RoutingRuleTagArrayOutput { return v.Tags }).(RoutingRuleTagArrayOutput)
}

func (o RoutingRuleOutput) TargetSetIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *RoutingRule) pulumi.StringArrayOutput { return v.TargetSetIds }).(pulumi.StringArrayOutput)
}

type RoutingRuleArrayOutput struct{ *pulumi.OutputState }

func (RoutingRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RoutingRule)(nil)).Elem()
}

func (o RoutingRuleArrayOutput) ToRoutingRuleArrayOutput() RoutingRuleArrayOutput {
	return o
}

func (o RoutingRuleArrayOutput) ToRoutingRuleArrayOutputWithContext(ctx context.Context) RoutingRuleArrayOutput {
	return o
}

func (o RoutingRuleArrayOutput) Index(i pulumi.IntInput) RoutingRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RoutingRule {
		return vs[0].([]*RoutingRule)[vs[1].(int)]
	}).(RoutingRuleOutput)
}

type RoutingRuleMapOutput struct{ *pulumi.OutputState }

func (RoutingRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RoutingRule)(nil)).Elem()
}

func (o RoutingRuleMapOutput) ToRoutingRuleMapOutput() RoutingRuleMapOutput {
	return o
}

func (o RoutingRuleMapOutput) ToRoutingRuleMapOutputWithContext(ctx context.Context) RoutingRuleMapOutput {
	return o
}

func (o RoutingRuleMapOutput) MapIndex(k pulumi.StringInput) RoutingRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RoutingRule {
		return vs[0].(map[string]*RoutingRule)[vs[1].(string)]
	}).(RoutingRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RoutingRuleInput)(nil)).Elem(), &RoutingRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*RoutingRuleArrayInput)(nil)).Elem(), RoutingRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RoutingRuleMapInput)(nil)).Elem(), RoutingRuleMap{})
	pulumi.RegisterOutputType(RoutingRuleOutput{})
	pulumi.RegisterOutputType(RoutingRuleArrayOutput{})
	pulumi.RegisterOutputType(RoutingRuleMapOutput{})
}
