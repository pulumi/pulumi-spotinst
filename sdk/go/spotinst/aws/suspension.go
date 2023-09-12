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

// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-spotinst/sdk/v3/go/spotinst/aws"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := aws.NewSuspension(ctx, "resourceName", &aws.SuspensionArgs{
//				GroupId: pulumi.String("sig-12345678"),
//				Suspensions: aws.SuspensionSuspensionArray{
//					&aws.SuspensionSuspensionArgs{
//						Name: pulumi.String("OUT_OF_STRATEGY"),
//					},
//					&aws.SuspensionSuspensionArgs{
//						Name: pulumi.String("REVERT_PREFERRED"),
//					},
//					&aws.SuspensionSuspensionArgs{
//						Name: pulumi.String("PREVENTIVE_REPLACEMENT"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type Suspension struct {
	pulumi.CustomResourceState

	// Elastigroup ID to apply the suspensions on.
	GroupId pulumi.StringOutput `pulumi:"groupId"`
	// block of single process to suspend.
	Suspensions SuspensionSuspensionArrayOutput `pulumi:"suspensions"`
}

// NewSuspension registers a new resource with the given unique name, arguments, and options.
func NewSuspension(ctx *pulumi.Context,
	name string, args *SuspensionArgs, opts ...pulumi.ResourceOption) (*Suspension, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.GroupId == nil {
		return nil, errors.New("invalid value for required argument 'GroupId'")
	}
	if args.Suspensions == nil {
		return nil, errors.New("invalid value for required argument 'Suspensions'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Suspension
	err := ctx.RegisterResource("spotinst:aws/suspension:Suspension", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSuspension gets an existing Suspension resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSuspension(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SuspensionState, opts ...pulumi.ResourceOption) (*Suspension, error) {
	var resource Suspension
	err := ctx.ReadResource("spotinst:aws/suspension:Suspension", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Suspension resources.
type suspensionState struct {
	// Elastigroup ID to apply the suspensions on.
	GroupId *string `pulumi:"groupId"`
	// block of single process to suspend.
	Suspensions []SuspensionSuspension `pulumi:"suspensions"`
}

type SuspensionState struct {
	// Elastigroup ID to apply the suspensions on.
	GroupId pulumi.StringPtrInput
	// block of single process to suspend.
	Suspensions SuspensionSuspensionArrayInput
}

func (SuspensionState) ElementType() reflect.Type {
	return reflect.TypeOf((*suspensionState)(nil)).Elem()
}

type suspensionArgs struct {
	// Elastigroup ID to apply the suspensions on.
	GroupId string `pulumi:"groupId"`
	// block of single process to suspend.
	Suspensions []SuspensionSuspension `pulumi:"suspensions"`
}

// The set of arguments for constructing a Suspension resource.
type SuspensionArgs struct {
	// Elastigroup ID to apply the suspensions on.
	GroupId pulumi.StringInput
	// block of single process to suspend.
	Suspensions SuspensionSuspensionArrayInput
}

func (SuspensionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*suspensionArgs)(nil)).Elem()
}

type SuspensionInput interface {
	pulumi.Input

	ToSuspensionOutput() SuspensionOutput
	ToSuspensionOutputWithContext(ctx context.Context) SuspensionOutput
}

func (*Suspension) ElementType() reflect.Type {
	return reflect.TypeOf((**Suspension)(nil)).Elem()
}

func (i *Suspension) ToSuspensionOutput() SuspensionOutput {
	return i.ToSuspensionOutputWithContext(context.Background())
}

func (i *Suspension) ToSuspensionOutputWithContext(ctx context.Context) SuspensionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SuspensionOutput)
}

func (i *Suspension) ToOutput(ctx context.Context) pulumix.Output[*Suspension] {
	return pulumix.Output[*Suspension]{
		OutputState: i.ToSuspensionOutputWithContext(ctx).OutputState,
	}
}

// SuspensionArrayInput is an input type that accepts SuspensionArray and SuspensionArrayOutput values.
// You can construct a concrete instance of `SuspensionArrayInput` via:
//
//	SuspensionArray{ SuspensionArgs{...} }
type SuspensionArrayInput interface {
	pulumi.Input

	ToSuspensionArrayOutput() SuspensionArrayOutput
	ToSuspensionArrayOutputWithContext(context.Context) SuspensionArrayOutput
}

type SuspensionArray []SuspensionInput

func (SuspensionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Suspension)(nil)).Elem()
}

func (i SuspensionArray) ToSuspensionArrayOutput() SuspensionArrayOutput {
	return i.ToSuspensionArrayOutputWithContext(context.Background())
}

func (i SuspensionArray) ToSuspensionArrayOutputWithContext(ctx context.Context) SuspensionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SuspensionArrayOutput)
}

func (i SuspensionArray) ToOutput(ctx context.Context) pulumix.Output[[]*Suspension] {
	return pulumix.Output[[]*Suspension]{
		OutputState: i.ToSuspensionArrayOutputWithContext(ctx).OutputState,
	}
}

// SuspensionMapInput is an input type that accepts SuspensionMap and SuspensionMapOutput values.
// You can construct a concrete instance of `SuspensionMapInput` via:
//
//	SuspensionMap{ "key": SuspensionArgs{...} }
type SuspensionMapInput interface {
	pulumi.Input

	ToSuspensionMapOutput() SuspensionMapOutput
	ToSuspensionMapOutputWithContext(context.Context) SuspensionMapOutput
}

type SuspensionMap map[string]SuspensionInput

func (SuspensionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Suspension)(nil)).Elem()
}

func (i SuspensionMap) ToSuspensionMapOutput() SuspensionMapOutput {
	return i.ToSuspensionMapOutputWithContext(context.Background())
}

func (i SuspensionMap) ToSuspensionMapOutputWithContext(ctx context.Context) SuspensionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SuspensionMapOutput)
}

func (i SuspensionMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Suspension] {
	return pulumix.Output[map[string]*Suspension]{
		OutputState: i.ToSuspensionMapOutputWithContext(ctx).OutputState,
	}
}

type SuspensionOutput struct{ *pulumi.OutputState }

func (SuspensionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Suspension)(nil)).Elem()
}

func (o SuspensionOutput) ToSuspensionOutput() SuspensionOutput {
	return o
}

func (o SuspensionOutput) ToSuspensionOutputWithContext(ctx context.Context) SuspensionOutput {
	return o
}

func (o SuspensionOutput) ToOutput(ctx context.Context) pulumix.Output[*Suspension] {
	return pulumix.Output[*Suspension]{
		OutputState: o.OutputState,
	}
}

// Elastigroup ID to apply the suspensions on.
func (o SuspensionOutput) GroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *Suspension) pulumi.StringOutput { return v.GroupId }).(pulumi.StringOutput)
}

// block of single process to suspend.
func (o SuspensionOutput) Suspensions() SuspensionSuspensionArrayOutput {
	return o.ApplyT(func(v *Suspension) SuspensionSuspensionArrayOutput { return v.Suspensions }).(SuspensionSuspensionArrayOutput)
}

type SuspensionArrayOutput struct{ *pulumi.OutputState }

func (SuspensionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Suspension)(nil)).Elem()
}

func (o SuspensionArrayOutput) ToSuspensionArrayOutput() SuspensionArrayOutput {
	return o
}

func (o SuspensionArrayOutput) ToSuspensionArrayOutputWithContext(ctx context.Context) SuspensionArrayOutput {
	return o
}

func (o SuspensionArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Suspension] {
	return pulumix.Output[[]*Suspension]{
		OutputState: o.OutputState,
	}
}

func (o SuspensionArrayOutput) Index(i pulumi.IntInput) SuspensionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Suspension {
		return vs[0].([]*Suspension)[vs[1].(int)]
	}).(SuspensionOutput)
}

type SuspensionMapOutput struct{ *pulumi.OutputState }

func (SuspensionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Suspension)(nil)).Elem()
}

func (o SuspensionMapOutput) ToSuspensionMapOutput() SuspensionMapOutput {
	return o
}

func (o SuspensionMapOutput) ToSuspensionMapOutputWithContext(ctx context.Context) SuspensionMapOutput {
	return o
}

func (o SuspensionMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Suspension] {
	return pulumix.Output[map[string]*Suspension]{
		OutputState: o.OutputState,
	}
}

func (o SuspensionMapOutput) MapIndex(k pulumi.StringInput) SuspensionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Suspension {
		return vs[0].(map[string]*Suspension)[vs[1].(string)]
	}).(SuspensionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SuspensionInput)(nil)).Elem(), &Suspension{})
	pulumi.RegisterInputType(reflect.TypeOf((*SuspensionArrayInput)(nil)).Elem(), SuspensionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SuspensionMapInput)(nil)).Elem(), SuspensionMap{})
	pulumi.RegisterOutputType(SuspensionOutput{})
	pulumi.RegisterOutputType(SuspensionArrayOutput{})
	pulumi.RegisterOutputType(SuspensionMapOutput{})
}
