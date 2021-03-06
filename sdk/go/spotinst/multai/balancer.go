// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package multai

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type Balancer struct {
	pulumi.CustomResourceState

	ConnectionTimeouts BalancerConnectionTimeoutsPtrOutput `pulumi:"connectionTimeouts"`
	DnsCnameAliases    pulumi.StringArrayOutput            `pulumi:"dnsCnameAliases"`
	Name               pulumi.StringOutput                 `pulumi:"name"`
	Scheme             pulumi.StringPtrOutput              `pulumi:"scheme"`
	Tags               BalancerTagArrayOutput              `pulumi:"tags"`
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
	Name               *string                     `pulumi:"name"`
	Scheme             *string                     `pulumi:"scheme"`
	Tags               []BalancerTag               `pulumi:"tags"`
}

type BalancerState struct {
	ConnectionTimeouts BalancerConnectionTimeoutsPtrInput
	DnsCnameAliases    pulumi.StringArrayInput
	Name               pulumi.StringPtrInput
	Scheme             pulumi.StringPtrInput
	Tags               BalancerTagArrayInput
}

func (BalancerState) ElementType() reflect.Type {
	return reflect.TypeOf((*balancerState)(nil)).Elem()
}

type balancerArgs struct {
	ConnectionTimeouts *BalancerConnectionTimeouts `pulumi:"connectionTimeouts"`
	DnsCnameAliases    []string                    `pulumi:"dnsCnameAliases"`
	Name               *string                     `pulumi:"name"`
	Scheme             *string                     `pulumi:"scheme"`
	Tags               []BalancerTag               `pulumi:"tags"`
}

// The set of arguments for constructing a Balancer resource.
type BalancerArgs struct {
	ConnectionTimeouts BalancerConnectionTimeoutsPtrInput
	DnsCnameAliases    pulumi.StringArrayInput
	Name               pulumi.StringPtrInput
	Scheme             pulumi.StringPtrInput
	Tags               BalancerTagArrayInput
}

func (BalancerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*balancerArgs)(nil)).Elem()
}

type BalancerInput interface {
	pulumi.Input

	ToBalancerOutput() BalancerOutput
	ToBalancerOutputWithContext(ctx context.Context) BalancerOutput
}

func (*Balancer) ElementType() reflect.Type {
	return reflect.TypeOf((*Balancer)(nil))
}

func (i *Balancer) ToBalancerOutput() BalancerOutput {
	return i.ToBalancerOutputWithContext(context.Background())
}

func (i *Balancer) ToBalancerOutputWithContext(ctx context.Context) BalancerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BalancerOutput)
}

func (i *Balancer) ToBalancerPtrOutput() BalancerPtrOutput {
	return i.ToBalancerPtrOutputWithContext(context.Background())
}

func (i *Balancer) ToBalancerPtrOutputWithContext(ctx context.Context) BalancerPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BalancerPtrOutput)
}

type BalancerPtrInput interface {
	pulumi.Input

	ToBalancerPtrOutput() BalancerPtrOutput
	ToBalancerPtrOutputWithContext(ctx context.Context) BalancerPtrOutput
}

type balancerPtrType BalancerArgs

func (*balancerPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Balancer)(nil))
}

func (i *balancerPtrType) ToBalancerPtrOutput() BalancerPtrOutput {
	return i.ToBalancerPtrOutputWithContext(context.Background())
}

func (i *balancerPtrType) ToBalancerPtrOutputWithContext(ctx context.Context) BalancerPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BalancerPtrOutput)
}

// BalancerArrayInput is an input type that accepts BalancerArray and BalancerArrayOutput values.
// You can construct a concrete instance of `BalancerArrayInput` via:
//
//          BalancerArray{ BalancerArgs{...} }
type BalancerArrayInput interface {
	pulumi.Input

	ToBalancerArrayOutput() BalancerArrayOutput
	ToBalancerArrayOutputWithContext(context.Context) BalancerArrayOutput
}

type BalancerArray []BalancerInput

func (BalancerArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*Balancer)(nil))
}

func (i BalancerArray) ToBalancerArrayOutput() BalancerArrayOutput {
	return i.ToBalancerArrayOutputWithContext(context.Background())
}

func (i BalancerArray) ToBalancerArrayOutputWithContext(ctx context.Context) BalancerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BalancerArrayOutput)
}

// BalancerMapInput is an input type that accepts BalancerMap and BalancerMapOutput values.
// You can construct a concrete instance of `BalancerMapInput` via:
//
//          BalancerMap{ "key": BalancerArgs{...} }
type BalancerMapInput interface {
	pulumi.Input

	ToBalancerMapOutput() BalancerMapOutput
	ToBalancerMapOutputWithContext(context.Context) BalancerMapOutput
}

type BalancerMap map[string]BalancerInput

func (BalancerMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*Balancer)(nil))
}

func (i BalancerMap) ToBalancerMapOutput() BalancerMapOutput {
	return i.ToBalancerMapOutputWithContext(context.Background())
}

func (i BalancerMap) ToBalancerMapOutputWithContext(ctx context.Context) BalancerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BalancerMapOutput)
}

type BalancerOutput struct {
	*pulumi.OutputState
}

func (BalancerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Balancer)(nil))
}

func (o BalancerOutput) ToBalancerOutput() BalancerOutput {
	return o
}

func (o BalancerOutput) ToBalancerOutputWithContext(ctx context.Context) BalancerOutput {
	return o
}

func (o BalancerOutput) ToBalancerPtrOutput() BalancerPtrOutput {
	return o.ToBalancerPtrOutputWithContext(context.Background())
}

func (o BalancerOutput) ToBalancerPtrOutputWithContext(ctx context.Context) BalancerPtrOutput {
	return o.ApplyT(func(v Balancer) *Balancer {
		return &v
	}).(BalancerPtrOutput)
}

type BalancerPtrOutput struct {
	*pulumi.OutputState
}

func (BalancerPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Balancer)(nil))
}

func (o BalancerPtrOutput) ToBalancerPtrOutput() BalancerPtrOutput {
	return o
}

func (o BalancerPtrOutput) ToBalancerPtrOutputWithContext(ctx context.Context) BalancerPtrOutput {
	return o
}

type BalancerArrayOutput struct{ *pulumi.OutputState }

func (BalancerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Balancer)(nil))
}

func (o BalancerArrayOutput) ToBalancerArrayOutput() BalancerArrayOutput {
	return o
}

func (o BalancerArrayOutput) ToBalancerArrayOutputWithContext(ctx context.Context) BalancerArrayOutput {
	return o
}

func (o BalancerArrayOutput) Index(i pulumi.IntInput) BalancerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Balancer {
		return vs[0].([]Balancer)[vs[1].(int)]
	}).(BalancerOutput)
}

type BalancerMapOutput struct{ *pulumi.OutputState }

func (BalancerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Balancer)(nil))
}

func (o BalancerMapOutput) ToBalancerMapOutput() BalancerMapOutput {
	return o
}

func (o BalancerMapOutput) ToBalancerMapOutputWithContext(ctx context.Context) BalancerMapOutput {
	return o
}

func (o BalancerMapOutput) MapIndex(k pulumi.StringInput) BalancerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Balancer {
		return vs[0].(map[string]Balancer)[vs[1].(string)]
	}).(BalancerOutput)
}

func init() {
	pulumi.RegisterOutputType(BalancerOutput{})
	pulumi.RegisterOutputType(BalancerPtrOutput{})
	pulumi.RegisterOutputType(BalancerArrayOutput{})
	pulumi.RegisterOutputType(BalancerMapOutput{})
}
