// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package spotinst

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The provider type for the spotinst package. By default, resources use package-wide configuration
// settings, however an explicit `Provider` instance may be created and passed during resource
// construction to achieve fine-grained programmatic control over provider settings. See the
// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
type Provider struct {
	pulumi.ProviderResourceState
}

// NewProvider registers a new resource with the given unique name, arguments, and options.
func NewProvider(ctx *pulumi.Context,
	name string, args *ProviderArgs, opts ...pulumi.ResourceOption) (*Provider, error) {
	if args == nil {
		args = &ProviderArgs{}
	}

	var resource Provider
	err := ctx.RegisterResource("pulumi:providers:spotinst", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

type providerArgs struct {
	// Spotinst Account ID
	Account *string `pulumi:"account"`
	// Spotinst SDK Feature Flags
	FeatureFlags *string `pulumi:"featureFlags"`
	// Spotinst Personal API Access Token
	Token *string `pulumi:"token"`
}

// The set of arguments for constructing a Provider resource.
type ProviderArgs struct {
	// Spotinst Account ID
	Account pulumi.StringPtrInput
	// Spotinst SDK Feature Flags
	FeatureFlags pulumi.StringPtrInput
	// Spotinst Personal API Access Token
	Token pulumi.StringPtrInput
}

func (ProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*providerArgs)(nil)).Elem()
}

type ProviderInput interface {
	pulumi.Input

	ToProviderOutput() ProviderOutput
	ToProviderOutputWithContext(ctx context.Context) ProviderOutput
}

func (*Provider) ElementType() reflect.Type {
	return reflect.TypeOf((*Provider)(nil))
}

func (i *Provider) ToProviderOutput() ProviderOutput {
	return i.ToProviderOutputWithContext(context.Background())
}

func (i *Provider) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderOutput)
}

func (i *Provider) ToProviderPtrOutput() ProviderPtrOutput {
	return i.ToProviderPtrOutputWithContext(context.Background())
}

func (i *Provider) ToProviderPtrOutputWithContext(ctx context.Context) ProviderPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderPtrOutput)
}

type ProviderPtrInput interface {
	pulumi.Input

	ToProviderPtrOutput() ProviderPtrOutput
	ToProviderPtrOutputWithContext(ctx context.Context) ProviderPtrOutput
}

type providerPtrType ProviderArgs

func (*providerPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil))
}

func (i *providerPtrType) ToProviderPtrOutput() ProviderPtrOutput {
	return i.ToProviderPtrOutputWithContext(context.Background())
}

func (i *providerPtrType) ToProviderPtrOutputWithContext(ctx context.Context) ProviderPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderPtrOutput)
}

type ProviderOutput struct {
	*pulumi.OutputState
}

func (ProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Provider)(nil))
}

func (o ProviderOutput) ToProviderOutput() ProviderOutput {
	return o
}

func (o ProviderOutput) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return o
}

func (o ProviderOutput) ToProviderPtrOutput() ProviderPtrOutput {
	return o.ToProviderPtrOutputWithContext(context.Background())
}

func (o ProviderOutput) ToProviderPtrOutputWithContext(ctx context.Context) ProviderPtrOutput {
	return o.ApplyT(func(v Provider) *Provider {
		return &v
	}).(ProviderPtrOutput)
}

type ProviderPtrOutput struct {
	*pulumi.OutputState
}

func (ProviderPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil))
}

func (o ProviderPtrOutput) ToProviderPtrOutput() ProviderPtrOutput {
	return o
}

func (o ProviderPtrOutput) ToProviderPtrOutputWithContext(ctx context.Context) ProviderPtrOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(ProviderOutput{})
	pulumi.RegisterOutputType(ProviderPtrOutput{})
}
