// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package spotinst

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-spotinst/sdk/v3/go/spotinst/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Spotinst Health Check resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-spotinst/sdk/v3/go/spotinst"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := spotinst.NewHealthCheck(ctx, "http_check", &spotinst.HealthCheckArgs{
//				Name:       pulumi.String("sample_health_check"),
//				ResourceId: pulumi.String("sig-123"),
//				Check: &spotinst.HealthCheckCheckArgs{
//					Protocol:  pulumi.String("http"),
//					Endpoint:  pulumi.String("http://endpoint.com"),
//					Port:      pulumi.Int(1337),
//					Interval:  pulumi.Int(10),
//					Timeout:   pulumi.Int(10),
//					Healthy:   pulumi.Int(1),
//					Unhealthy: pulumi.Int(1),
//				},
//				ProxyAddress: pulumi.String("http://proxy.com"),
//				ProxyPort:    pulumi.Int(80),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type HealthCheck struct {
	pulumi.CustomResourceState

	// Describes the check to execute.
	Check HealthCheckCheckPtrOutput `pulumi:"check"`
	// The name of the health check.
	Name         pulumi.StringOutput `pulumi:"name"`
	ProxyAddress pulumi.StringOutput `pulumi:"proxyAddress"`
	ProxyPort    pulumi.IntPtrOutput `pulumi:"proxyPort"`
	// The ID of the resource to check.
	ResourceId pulumi.StringOutput `pulumi:"resourceId"`
}

// NewHealthCheck registers a new resource with the given unique name, arguments, and options.
func NewHealthCheck(ctx *pulumi.Context,
	name string, args *HealthCheckArgs, opts ...pulumi.ResourceOption) (*HealthCheck, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ProxyAddress == nil {
		return nil, errors.New("invalid value for required argument 'ProxyAddress'")
	}
	if args.ResourceId == nil {
		return nil, errors.New("invalid value for required argument 'ResourceId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource HealthCheck
	err := ctx.RegisterResource("spotinst:index/healthCheck:HealthCheck", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetHealthCheck gets an existing HealthCheck resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetHealthCheck(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *HealthCheckState, opts ...pulumi.ResourceOption) (*HealthCheck, error) {
	var resource HealthCheck
	err := ctx.ReadResource("spotinst:index/healthCheck:HealthCheck", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering HealthCheck resources.
type healthCheckState struct {
	// Describes the check to execute.
	Check *HealthCheckCheck `pulumi:"check"`
	// The name of the health check.
	Name         *string `pulumi:"name"`
	ProxyAddress *string `pulumi:"proxyAddress"`
	ProxyPort    *int    `pulumi:"proxyPort"`
	// The ID of the resource to check.
	ResourceId *string `pulumi:"resourceId"`
}

type HealthCheckState struct {
	// Describes the check to execute.
	Check HealthCheckCheckPtrInput
	// The name of the health check.
	Name         pulumi.StringPtrInput
	ProxyAddress pulumi.StringPtrInput
	ProxyPort    pulumi.IntPtrInput
	// The ID of the resource to check.
	ResourceId pulumi.StringPtrInput
}

func (HealthCheckState) ElementType() reflect.Type {
	return reflect.TypeOf((*healthCheckState)(nil)).Elem()
}

type healthCheckArgs struct {
	// Describes the check to execute.
	Check *HealthCheckCheck `pulumi:"check"`
	// The name of the health check.
	Name         *string `pulumi:"name"`
	ProxyAddress string  `pulumi:"proxyAddress"`
	ProxyPort    *int    `pulumi:"proxyPort"`
	// The ID of the resource to check.
	ResourceId string `pulumi:"resourceId"`
}

// The set of arguments for constructing a HealthCheck resource.
type HealthCheckArgs struct {
	// Describes the check to execute.
	Check HealthCheckCheckPtrInput
	// The name of the health check.
	Name         pulumi.StringPtrInput
	ProxyAddress pulumi.StringInput
	ProxyPort    pulumi.IntPtrInput
	// The ID of the resource to check.
	ResourceId pulumi.StringInput
}

func (HealthCheckArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*healthCheckArgs)(nil)).Elem()
}

type HealthCheckInput interface {
	pulumi.Input

	ToHealthCheckOutput() HealthCheckOutput
	ToHealthCheckOutputWithContext(ctx context.Context) HealthCheckOutput
}

func (*HealthCheck) ElementType() reflect.Type {
	return reflect.TypeOf((**HealthCheck)(nil)).Elem()
}

func (i *HealthCheck) ToHealthCheckOutput() HealthCheckOutput {
	return i.ToHealthCheckOutputWithContext(context.Background())
}

func (i *HealthCheck) ToHealthCheckOutputWithContext(ctx context.Context) HealthCheckOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HealthCheckOutput)
}

// HealthCheckArrayInput is an input type that accepts HealthCheckArray and HealthCheckArrayOutput values.
// You can construct a concrete instance of `HealthCheckArrayInput` via:
//
//	HealthCheckArray{ HealthCheckArgs{...} }
type HealthCheckArrayInput interface {
	pulumi.Input

	ToHealthCheckArrayOutput() HealthCheckArrayOutput
	ToHealthCheckArrayOutputWithContext(context.Context) HealthCheckArrayOutput
}

type HealthCheckArray []HealthCheckInput

func (HealthCheckArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HealthCheck)(nil)).Elem()
}

func (i HealthCheckArray) ToHealthCheckArrayOutput() HealthCheckArrayOutput {
	return i.ToHealthCheckArrayOutputWithContext(context.Background())
}

func (i HealthCheckArray) ToHealthCheckArrayOutputWithContext(ctx context.Context) HealthCheckArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HealthCheckArrayOutput)
}

// HealthCheckMapInput is an input type that accepts HealthCheckMap and HealthCheckMapOutput values.
// You can construct a concrete instance of `HealthCheckMapInput` via:
//
//	HealthCheckMap{ "key": HealthCheckArgs{...} }
type HealthCheckMapInput interface {
	pulumi.Input

	ToHealthCheckMapOutput() HealthCheckMapOutput
	ToHealthCheckMapOutputWithContext(context.Context) HealthCheckMapOutput
}

type HealthCheckMap map[string]HealthCheckInput

func (HealthCheckMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HealthCheck)(nil)).Elem()
}

func (i HealthCheckMap) ToHealthCheckMapOutput() HealthCheckMapOutput {
	return i.ToHealthCheckMapOutputWithContext(context.Background())
}

func (i HealthCheckMap) ToHealthCheckMapOutputWithContext(ctx context.Context) HealthCheckMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HealthCheckMapOutput)
}

type HealthCheckOutput struct{ *pulumi.OutputState }

func (HealthCheckOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**HealthCheck)(nil)).Elem()
}

func (o HealthCheckOutput) ToHealthCheckOutput() HealthCheckOutput {
	return o
}

func (o HealthCheckOutput) ToHealthCheckOutputWithContext(ctx context.Context) HealthCheckOutput {
	return o
}

// Describes the check to execute.
func (o HealthCheckOutput) Check() HealthCheckCheckPtrOutput {
	return o.ApplyT(func(v *HealthCheck) HealthCheckCheckPtrOutput { return v.Check }).(HealthCheckCheckPtrOutput)
}

// The name of the health check.
func (o HealthCheckOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *HealthCheck) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o HealthCheckOutput) ProxyAddress() pulumi.StringOutput {
	return o.ApplyT(func(v *HealthCheck) pulumi.StringOutput { return v.ProxyAddress }).(pulumi.StringOutput)
}

func (o HealthCheckOutput) ProxyPort() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *HealthCheck) pulumi.IntPtrOutput { return v.ProxyPort }).(pulumi.IntPtrOutput)
}

// The ID of the resource to check.
func (o HealthCheckOutput) ResourceId() pulumi.StringOutput {
	return o.ApplyT(func(v *HealthCheck) pulumi.StringOutput { return v.ResourceId }).(pulumi.StringOutput)
}

type HealthCheckArrayOutput struct{ *pulumi.OutputState }

func (HealthCheckArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HealthCheck)(nil)).Elem()
}

func (o HealthCheckArrayOutput) ToHealthCheckArrayOutput() HealthCheckArrayOutput {
	return o
}

func (o HealthCheckArrayOutput) ToHealthCheckArrayOutputWithContext(ctx context.Context) HealthCheckArrayOutput {
	return o
}

func (o HealthCheckArrayOutput) Index(i pulumi.IntInput) HealthCheckOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *HealthCheck {
		return vs[0].([]*HealthCheck)[vs[1].(int)]
	}).(HealthCheckOutput)
}

type HealthCheckMapOutput struct{ *pulumi.OutputState }

func (HealthCheckMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HealthCheck)(nil)).Elem()
}

func (o HealthCheckMapOutput) ToHealthCheckMapOutput() HealthCheckMapOutput {
	return o
}

func (o HealthCheckMapOutput) ToHealthCheckMapOutputWithContext(ctx context.Context) HealthCheckMapOutput {
	return o
}

func (o HealthCheckMapOutput) MapIndex(k pulumi.StringInput) HealthCheckOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *HealthCheck {
		return vs[0].(map[string]*HealthCheck)[vs[1].(string)]
	}).(HealthCheckOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*HealthCheckInput)(nil)).Elem(), &HealthCheck{})
	pulumi.RegisterInputType(reflect.TypeOf((*HealthCheckArrayInput)(nil)).Elem(), HealthCheckArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*HealthCheckMapInput)(nil)).Elem(), HealthCheckMap{})
	pulumi.RegisterOutputType(HealthCheckOutput{})
	pulumi.RegisterOutputType(HealthCheckArrayOutput{})
	pulumi.RegisterOutputType(HealthCheckMapOutput{})
}
