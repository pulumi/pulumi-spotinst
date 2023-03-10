// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package azure

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type OceanNpVirtualNodeGroup struct {
	pulumi.CustomResourceState

	AvailabilityZones  pulumi.StringArrayOutput                   `pulumi:"availabilityZones"`
	EnableNodePublicIp pulumi.BoolPtrOutput                       `pulumi:"enableNodePublicIp"`
	FallbackToOndemand pulumi.BoolPtrOutput                       `pulumi:"fallbackToOndemand"`
	Headrooms          OceanNpVirtualNodeGroupHeadroomArrayOutput `pulumi:"headrooms"`
	Labels             pulumi.MapOutput                           `pulumi:"labels"`
	MaxCount           pulumi.IntPtrOutput                        `pulumi:"maxCount"`
	MaxPodsPerNode     pulumi.IntPtrOutput                        `pulumi:"maxPodsPerNode"`
	MinCount           pulumi.IntPtrOutput                        `pulumi:"minCount"`
	Name               pulumi.StringOutput                        `pulumi:"name"`
	OceanId            pulumi.StringOutput                        `pulumi:"oceanId"`
	OsDiskSizeGb       pulumi.IntPtrOutput                        `pulumi:"osDiskSizeGb"`
	OsDiskType         pulumi.StringPtrOutput                     `pulumi:"osDiskType"`
	OsType             pulumi.StringPtrOutput                     `pulumi:"osType"`
	SpotPercentage     pulumi.IntPtrOutput                        `pulumi:"spotPercentage"`
	Tags               pulumi.MapOutput                           `pulumi:"tags"`
	Taints             OceanNpVirtualNodeGroupTaintArrayOutput    `pulumi:"taints"`
}

// NewOceanNpVirtualNodeGroup registers a new resource with the given unique name, arguments, and options.
func NewOceanNpVirtualNodeGroup(ctx *pulumi.Context,
	name string, args *OceanNpVirtualNodeGroupArgs, opts ...pulumi.ResourceOption) (*OceanNpVirtualNodeGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OceanId == nil {
		return nil, errors.New("invalid value for required argument 'OceanId'")
	}
	var resource OceanNpVirtualNodeGroup
	err := ctx.RegisterResource("spotinst:azure/oceanNpVirtualNodeGroup:OceanNpVirtualNodeGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOceanNpVirtualNodeGroup gets an existing OceanNpVirtualNodeGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOceanNpVirtualNodeGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OceanNpVirtualNodeGroupState, opts ...pulumi.ResourceOption) (*OceanNpVirtualNodeGroup, error) {
	var resource OceanNpVirtualNodeGroup
	err := ctx.ReadResource("spotinst:azure/oceanNpVirtualNodeGroup:OceanNpVirtualNodeGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OceanNpVirtualNodeGroup resources.
type oceanNpVirtualNodeGroupState struct {
	AvailabilityZones  []string                          `pulumi:"availabilityZones"`
	EnableNodePublicIp *bool                             `pulumi:"enableNodePublicIp"`
	FallbackToOndemand *bool                             `pulumi:"fallbackToOndemand"`
	Headrooms          []OceanNpVirtualNodeGroupHeadroom `pulumi:"headrooms"`
	Labels             map[string]interface{}            `pulumi:"labels"`
	MaxCount           *int                              `pulumi:"maxCount"`
	MaxPodsPerNode     *int                              `pulumi:"maxPodsPerNode"`
	MinCount           *int                              `pulumi:"minCount"`
	Name               *string                           `pulumi:"name"`
	OceanId            *string                           `pulumi:"oceanId"`
	OsDiskSizeGb       *int                              `pulumi:"osDiskSizeGb"`
	OsDiskType         *string                           `pulumi:"osDiskType"`
	OsType             *string                           `pulumi:"osType"`
	SpotPercentage     *int                              `pulumi:"spotPercentage"`
	Tags               map[string]interface{}            `pulumi:"tags"`
	Taints             []OceanNpVirtualNodeGroupTaint    `pulumi:"taints"`
}

type OceanNpVirtualNodeGroupState struct {
	AvailabilityZones  pulumi.StringArrayInput
	EnableNodePublicIp pulumi.BoolPtrInput
	FallbackToOndemand pulumi.BoolPtrInput
	Headrooms          OceanNpVirtualNodeGroupHeadroomArrayInput
	Labels             pulumi.MapInput
	MaxCount           pulumi.IntPtrInput
	MaxPodsPerNode     pulumi.IntPtrInput
	MinCount           pulumi.IntPtrInput
	Name               pulumi.StringPtrInput
	OceanId            pulumi.StringPtrInput
	OsDiskSizeGb       pulumi.IntPtrInput
	OsDiskType         pulumi.StringPtrInput
	OsType             pulumi.StringPtrInput
	SpotPercentage     pulumi.IntPtrInput
	Tags               pulumi.MapInput
	Taints             OceanNpVirtualNodeGroupTaintArrayInput
}

func (OceanNpVirtualNodeGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*oceanNpVirtualNodeGroupState)(nil)).Elem()
}

type oceanNpVirtualNodeGroupArgs struct {
	AvailabilityZones  []string                          `pulumi:"availabilityZones"`
	EnableNodePublicIp *bool                             `pulumi:"enableNodePublicIp"`
	FallbackToOndemand *bool                             `pulumi:"fallbackToOndemand"`
	Headrooms          []OceanNpVirtualNodeGroupHeadroom `pulumi:"headrooms"`
	Labels             map[string]interface{}            `pulumi:"labels"`
	MaxCount           *int                              `pulumi:"maxCount"`
	MaxPodsPerNode     *int                              `pulumi:"maxPodsPerNode"`
	MinCount           *int                              `pulumi:"minCount"`
	Name               *string                           `pulumi:"name"`
	OceanId            string                            `pulumi:"oceanId"`
	OsDiskSizeGb       *int                              `pulumi:"osDiskSizeGb"`
	OsDiskType         *string                           `pulumi:"osDiskType"`
	OsType             *string                           `pulumi:"osType"`
	SpotPercentage     *int                              `pulumi:"spotPercentage"`
	Tags               map[string]interface{}            `pulumi:"tags"`
	Taints             []OceanNpVirtualNodeGroupTaint    `pulumi:"taints"`
}

// The set of arguments for constructing a OceanNpVirtualNodeGroup resource.
type OceanNpVirtualNodeGroupArgs struct {
	AvailabilityZones  pulumi.StringArrayInput
	EnableNodePublicIp pulumi.BoolPtrInput
	FallbackToOndemand pulumi.BoolPtrInput
	Headrooms          OceanNpVirtualNodeGroupHeadroomArrayInput
	Labels             pulumi.MapInput
	MaxCount           pulumi.IntPtrInput
	MaxPodsPerNode     pulumi.IntPtrInput
	MinCount           pulumi.IntPtrInput
	Name               pulumi.StringPtrInput
	OceanId            pulumi.StringInput
	OsDiskSizeGb       pulumi.IntPtrInput
	OsDiskType         pulumi.StringPtrInput
	OsType             pulumi.StringPtrInput
	SpotPercentage     pulumi.IntPtrInput
	Tags               pulumi.MapInput
	Taints             OceanNpVirtualNodeGroupTaintArrayInput
}

func (OceanNpVirtualNodeGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*oceanNpVirtualNodeGroupArgs)(nil)).Elem()
}

type OceanNpVirtualNodeGroupInput interface {
	pulumi.Input

	ToOceanNpVirtualNodeGroupOutput() OceanNpVirtualNodeGroupOutput
	ToOceanNpVirtualNodeGroupOutputWithContext(ctx context.Context) OceanNpVirtualNodeGroupOutput
}

func (*OceanNpVirtualNodeGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**OceanNpVirtualNodeGroup)(nil)).Elem()
}

func (i *OceanNpVirtualNodeGroup) ToOceanNpVirtualNodeGroupOutput() OceanNpVirtualNodeGroupOutput {
	return i.ToOceanNpVirtualNodeGroupOutputWithContext(context.Background())
}

func (i *OceanNpVirtualNodeGroup) ToOceanNpVirtualNodeGroupOutputWithContext(ctx context.Context) OceanNpVirtualNodeGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OceanNpVirtualNodeGroupOutput)
}

// OceanNpVirtualNodeGroupArrayInput is an input type that accepts OceanNpVirtualNodeGroupArray and OceanNpVirtualNodeGroupArrayOutput values.
// You can construct a concrete instance of `OceanNpVirtualNodeGroupArrayInput` via:
//
//	OceanNpVirtualNodeGroupArray{ OceanNpVirtualNodeGroupArgs{...} }
type OceanNpVirtualNodeGroupArrayInput interface {
	pulumi.Input

	ToOceanNpVirtualNodeGroupArrayOutput() OceanNpVirtualNodeGroupArrayOutput
	ToOceanNpVirtualNodeGroupArrayOutputWithContext(context.Context) OceanNpVirtualNodeGroupArrayOutput
}

type OceanNpVirtualNodeGroupArray []OceanNpVirtualNodeGroupInput

func (OceanNpVirtualNodeGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OceanNpVirtualNodeGroup)(nil)).Elem()
}

func (i OceanNpVirtualNodeGroupArray) ToOceanNpVirtualNodeGroupArrayOutput() OceanNpVirtualNodeGroupArrayOutput {
	return i.ToOceanNpVirtualNodeGroupArrayOutputWithContext(context.Background())
}

func (i OceanNpVirtualNodeGroupArray) ToOceanNpVirtualNodeGroupArrayOutputWithContext(ctx context.Context) OceanNpVirtualNodeGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OceanNpVirtualNodeGroupArrayOutput)
}

// OceanNpVirtualNodeGroupMapInput is an input type that accepts OceanNpVirtualNodeGroupMap and OceanNpVirtualNodeGroupMapOutput values.
// You can construct a concrete instance of `OceanNpVirtualNodeGroupMapInput` via:
//
//	OceanNpVirtualNodeGroupMap{ "key": OceanNpVirtualNodeGroupArgs{...} }
type OceanNpVirtualNodeGroupMapInput interface {
	pulumi.Input

	ToOceanNpVirtualNodeGroupMapOutput() OceanNpVirtualNodeGroupMapOutput
	ToOceanNpVirtualNodeGroupMapOutputWithContext(context.Context) OceanNpVirtualNodeGroupMapOutput
}

type OceanNpVirtualNodeGroupMap map[string]OceanNpVirtualNodeGroupInput

func (OceanNpVirtualNodeGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OceanNpVirtualNodeGroup)(nil)).Elem()
}

func (i OceanNpVirtualNodeGroupMap) ToOceanNpVirtualNodeGroupMapOutput() OceanNpVirtualNodeGroupMapOutput {
	return i.ToOceanNpVirtualNodeGroupMapOutputWithContext(context.Background())
}

func (i OceanNpVirtualNodeGroupMap) ToOceanNpVirtualNodeGroupMapOutputWithContext(ctx context.Context) OceanNpVirtualNodeGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OceanNpVirtualNodeGroupMapOutput)
}

type OceanNpVirtualNodeGroupOutput struct{ *pulumi.OutputState }

func (OceanNpVirtualNodeGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OceanNpVirtualNodeGroup)(nil)).Elem()
}

func (o OceanNpVirtualNodeGroupOutput) ToOceanNpVirtualNodeGroupOutput() OceanNpVirtualNodeGroupOutput {
	return o
}

func (o OceanNpVirtualNodeGroupOutput) ToOceanNpVirtualNodeGroupOutputWithContext(ctx context.Context) OceanNpVirtualNodeGroupOutput {
	return o
}

func (o OceanNpVirtualNodeGroupOutput) AvailabilityZones() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) pulumi.StringArrayOutput { return v.AvailabilityZones }).(pulumi.StringArrayOutput)
}

func (o OceanNpVirtualNodeGroupOutput) EnableNodePublicIp() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) pulumi.BoolPtrOutput { return v.EnableNodePublicIp }).(pulumi.BoolPtrOutput)
}

func (o OceanNpVirtualNodeGroupOutput) FallbackToOndemand() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) pulumi.BoolPtrOutput { return v.FallbackToOndemand }).(pulumi.BoolPtrOutput)
}

func (o OceanNpVirtualNodeGroupOutput) Headrooms() OceanNpVirtualNodeGroupHeadroomArrayOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) OceanNpVirtualNodeGroupHeadroomArrayOutput { return v.Headrooms }).(OceanNpVirtualNodeGroupHeadroomArrayOutput)
}

func (o OceanNpVirtualNodeGroupOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

func (o OceanNpVirtualNodeGroupOutput) MaxCount() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) pulumi.IntPtrOutput { return v.MaxCount }).(pulumi.IntPtrOutput)
}

func (o OceanNpVirtualNodeGroupOutput) MaxPodsPerNode() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) pulumi.IntPtrOutput { return v.MaxPodsPerNode }).(pulumi.IntPtrOutput)
}

func (o OceanNpVirtualNodeGroupOutput) MinCount() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) pulumi.IntPtrOutput { return v.MinCount }).(pulumi.IntPtrOutput)
}

func (o OceanNpVirtualNodeGroupOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o OceanNpVirtualNodeGroupOutput) OceanId() pulumi.StringOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) pulumi.StringOutput { return v.OceanId }).(pulumi.StringOutput)
}

func (o OceanNpVirtualNodeGroupOutput) OsDiskSizeGb() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) pulumi.IntPtrOutput { return v.OsDiskSizeGb }).(pulumi.IntPtrOutput)
}

func (o OceanNpVirtualNodeGroupOutput) OsDiskType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) pulumi.StringPtrOutput { return v.OsDiskType }).(pulumi.StringPtrOutput)
}

func (o OceanNpVirtualNodeGroupOutput) OsType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) pulumi.StringPtrOutput { return v.OsType }).(pulumi.StringPtrOutput)
}

func (o OceanNpVirtualNodeGroupOutput) SpotPercentage() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) pulumi.IntPtrOutput { return v.SpotPercentage }).(pulumi.IntPtrOutput)
}

func (o OceanNpVirtualNodeGroupOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) pulumi.MapOutput { return v.Tags }).(pulumi.MapOutput)
}

func (o OceanNpVirtualNodeGroupOutput) Taints() OceanNpVirtualNodeGroupTaintArrayOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) OceanNpVirtualNodeGroupTaintArrayOutput { return v.Taints }).(OceanNpVirtualNodeGroupTaintArrayOutput)
}

type OceanNpVirtualNodeGroupArrayOutput struct{ *pulumi.OutputState }

func (OceanNpVirtualNodeGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OceanNpVirtualNodeGroup)(nil)).Elem()
}

func (o OceanNpVirtualNodeGroupArrayOutput) ToOceanNpVirtualNodeGroupArrayOutput() OceanNpVirtualNodeGroupArrayOutput {
	return o
}

func (o OceanNpVirtualNodeGroupArrayOutput) ToOceanNpVirtualNodeGroupArrayOutputWithContext(ctx context.Context) OceanNpVirtualNodeGroupArrayOutput {
	return o
}

func (o OceanNpVirtualNodeGroupArrayOutput) Index(i pulumi.IntInput) OceanNpVirtualNodeGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OceanNpVirtualNodeGroup {
		return vs[0].([]*OceanNpVirtualNodeGroup)[vs[1].(int)]
	}).(OceanNpVirtualNodeGroupOutput)
}

type OceanNpVirtualNodeGroupMapOutput struct{ *pulumi.OutputState }

func (OceanNpVirtualNodeGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OceanNpVirtualNodeGroup)(nil)).Elem()
}

func (o OceanNpVirtualNodeGroupMapOutput) ToOceanNpVirtualNodeGroupMapOutput() OceanNpVirtualNodeGroupMapOutput {
	return o
}

func (o OceanNpVirtualNodeGroupMapOutput) ToOceanNpVirtualNodeGroupMapOutputWithContext(ctx context.Context) OceanNpVirtualNodeGroupMapOutput {
	return o
}

func (o OceanNpVirtualNodeGroupMapOutput) MapIndex(k pulumi.StringInput) OceanNpVirtualNodeGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OceanNpVirtualNodeGroup {
		return vs[0].(map[string]*OceanNpVirtualNodeGroup)[vs[1].(string)]
	}).(OceanNpVirtualNodeGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OceanNpVirtualNodeGroupInput)(nil)).Elem(), &OceanNpVirtualNodeGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*OceanNpVirtualNodeGroupArrayInput)(nil)).Elem(), OceanNpVirtualNodeGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OceanNpVirtualNodeGroupMapInput)(nil)).Elem(), OceanNpVirtualNodeGroupMap{})
	pulumi.RegisterOutputType(OceanNpVirtualNodeGroupOutput{})
	pulumi.RegisterOutputType(OceanNpVirtualNodeGroupArrayOutput{})
	pulumi.RegisterOutputType(OceanNpVirtualNodeGroupMapOutput{})
}
