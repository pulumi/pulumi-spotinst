// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package aws

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-spotinst/sdk/v3/go/spotinst/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a Spotinst credential AWS resource.
type Credentials struct {
	pulumi.CustomResourceState

	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Provide the IAM Role ARN connected to another AWS account 922761411349 and with the latest Spot Policy - https://docs.spot.io/administration/api/spot-policy-in-aws
	Iamrole pulumi.StringOutput `pulumi:"iamrole"`
}

// NewCredentials registers a new resource with the given unique name, arguments, and options.
func NewCredentials(ctx *pulumi.Context,
	name string, args *CredentialsArgs, opts ...pulumi.ResourceOption) (*Credentials, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Iamrole == nil {
		return nil, errors.New("invalid value for required argument 'Iamrole'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Credentials
	err := ctx.RegisterResource("spotinst:aws/credentials:Credentials", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCredentials gets an existing Credentials resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCredentials(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CredentialsState, opts ...pulumi.ResourceOption) (*Credentials, error) {
	var resource Credentials
	err := ctx.ReadResource("spotinst:aws/credentials:Credentials", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Credentials resources.
type credentialsState struct {
	AccountId *string `pulumi:"accountId"`
	// Provide the IAM Role ARN connected to another AWS account 922761411349 and with the latest Spot Policy - https://docs.spot.io/administration/api/spot-policy-in-aws
	Iamrole *string `pulumi:"iamrole"`
}

type CredentialsState struct {
	AccountId pulumi.StringPtrInput
	// Provide the IAM Role ARN connected to another AWS account 922761411349 and with the latest Spot Policy - https://docs.spot.io/administration/api/spot-policy-in-aws
	Iamrole pulumi.StringPtrInput
}

func (CredentialsState) ElementType() reflect.Type {
	return reflect.TypeOf((*credentialsState)(nil)).Elem()
}

type credentialsArgs struct {
	AccountId string `pulumi:"accountId"`
	// Provide the IAM Role ARN connected to another AWS account 922761411349 and with the latest Spot Policy - https://docs.spot.io/administration/api/spot-policy-in-aws
	Iamrole string `pulumi:"iamrole"`
}

// The set of arguments for constructing a Credentials resource.
type CredentialsArgs struct {
	AccountId pulumi.StringInput
	// Provide the IAM Role ARN connected to another AWS account 922761411349 and with the latest Spot Policy - https://docs.spot.io/administration/api/spot-policy-in-aws
	Iamrole pulumi.StringInput
}

func (CredentialsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*credentialsArgs)(nil)).Elem()
}

type CredentialsInput interface {
	pulumi.Input

	ToCredentialsOutput() CredentialsOutput
	ToCredentialsOutputWithContext(ctx context.Context) CredentialsOutput
}

func (*Credentials) ElementType() reflect.Type {
	return reflect.TypeOf((**Credentials)(nil)).Elem()
}

func (i *Credentials) ToCredentialsOutput() CredentialsOutput {
	return i.ToCredentialsOutputWithContext(context.Background())
}

func (i *Credentials) ToCredentialsOutputWithContext(ctx context.Context) CredentialsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CredentialsOutput)
}

func (i *Credentials) ToOutput(ctx context.Context) pulumix.Output[*Credentials] {
	return pulumix.Output[*Credentials]{
		OutputState: i.ToCredentialsOutputWithContext(ctx).OutputState,
	}
}

// CredentialsArrayInput is an input type that accepts CredentialsArray and CredentialsArrayOutput values.
// You can construct a concrete instance of `CredentialsArrayInput` via:
//
//	CredentialsArray{ CredentialsArgs{...} }
type CredentialsArrayInput interface {
	pulumi.Input

	ToCredentialsArrayOutput() CredentialsArrayOutput
	ToCredentialsArrayOutputWithContext(context.Context) CredentialsArrayOutput
}

type CredentialsArray []CredentialsInput

func (CredentialsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Credentials)(nil)).Elem()
}

func (i CredentialsArray) ToCredentialsArrayOutput() CredentialsArrayOutput {
	return i.ToCredentialsArrayOutputWithContext(context.Background())
}

func (i CredentialsArray) ToCredentialsArrayOutputWithContext(ctx context.Context) CredentialsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CredentialsArrayOutput)
}

func (i CredentialsArray) ToOutput(ctx context.Context) pulumix.Output[[]*Credentials] {
	return pulumix.Output[[]*Credentials]{
		OutputState: i.ToCredentialsArrayOutputWithContext(ctx).OutputState,
	}
}

// CredentialsMapInput is an input type that accepts CredentialsMap and CredentialsMapOutput values.
// You can construct a concrete instance of `CredentialsMapInput` via:
//
//	CredentialsMap{ "key": CredentialsArgs{...} }
type CredentialsMapInput interface {
	pulumi.Input

	ToCredentialsMapOutput() CredentialsMapOutput
	ToCredentialsMapOutputWithContext(context.Context) CredentialsMapOutput
}

type CredentialsMap map[string]CredentialsInput

func (CredentialsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Credentials)(nil)).Elem()
}

func (i CredentialsMap) ToCredentialsMapOutput() CredentialsMapOutput {
	return i.ToCredentialsMapOutputWithContext(context.Background())
}

func (i CredentialsMap) ToCredentialsMapOutputWithContext(ctx context.Context) CredentialsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CredentialsMapOutput)
}

func (i CredentialsMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Credentials] {
	return pulumix.Output[map[string]*Credentials]{
		OutputState: i.ToCredentialsMapOutputWithContext(ctx).OutputState,
	}
}

type CredentialsOutput struct{ *pulumi.OutputState }

func (CredentialsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Credentials)(nil)).Elem()
}

func (o CredentialsOutput) ToCredentialsOutput() CredentialsOutput {
	return o
}

func (o CredentialsOutput) ToCredentialsOutputWithContext(ctx context.Context) CredentialsOutput {
	return o
}

func (o CredentialsOutput) ToOutput(ctx context.Context) pulumix.Output[*Credentials] {
	return pulumix.Output[*Credentials]{
		OutputState: o.OutputState,
	}
}

func (o CredentialsOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *Credentials) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Provide the IAM Role ARN connected to another AWS account 922761411349 and with the latest Spot Policy - https://docs.spot.io/administration/api/spot-policy-in-aws
func (o CredentialsOutput) Iamrole() pulumi.StringOutput {
	return o.ApplyT(func(v *Credentials) pulumi.StringOutput { return v.Iamrole }).(pulumi.StringOutput)
}

type CredentialsArrayOutput struct{ *pulumi.OutputState }

func (CredentialsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Credentials)(nil)).Elem()
}

func (o CredentialsArrayOutput) ToCredentialsArrayOutput() CredentialsArrayOutput {
	return o
}

func (o CredentialsArrayOutput) ToCredentialsArrayOutputWithContext(ctx context.Context) CredentialsArrayOutput {
	return o
}

func (o CredentialsArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Credentials] {
	return pulumix.Output[[]*Credentials]{
		OutputState: o.OutputState,
	}
}

func (o CredentialsArrayOutput) Index(i pulumi.IntInput) CredentialsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Credentials {
		return vs[0].([]*Credentials)[vs[1].(int)]
	}).(CredentialsOutput)
}

type CredentialsMapOutput struct{ *pulumi.OutputState }

func (CredentialsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Credentials)(nil)).Elem()
}

func (o CredentialsMapOutput) ToCredentialsMapOutput() CredentialsMapOutput {
	return o
}

func (o CredentialsMapOutput) ToCredentialsMapOutputWithContext(ctx context.Context) CredentialsMapOutput {
	return o
}

func (o CredentialsMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Credentials] {
	return pulumix.Output[map[string]*Credentials]{
		OutputState: o.OutputState,
	}
}

func (o CredentialsMapOutput) MapIndex(k pulumi.StringInput) CredentialsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Credentials {
		return vs[0].(map[string]*Credentials)[vs[1].(string)]
	}).(CredentialsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CredentialsInput)(nil)).Elem(), &Credentials{})
	pulumi.RegisterInputType(reflect.TypeOf((*CredentialsArrayInput)(nil)).Elem(), CredentialsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CredentialsMapInput)(nil)).Elem(), CredentialsMap{})
	pulumi.RegisterOutputType(CredentialsOutput{})
	pulumi.RegisterOutputType(CredentialsArrayOutput{})
	pulumi.RegisterOutputType(CredentialsMapOutput{})
}
