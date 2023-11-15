// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package azure

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-spotinst/sdk/v3/go/spotinst/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type OceanNp struct {
	pulumi.CustomResourceState

	AksClusterName                     pulumi.StringOutput        `pulumi:"aksClusterName"`
	AksInfrastructureResourceGroupName pulumi.StringOutput        `pulumi:"aksInfrastructureResourceGroupName"`
	AksRegion                          pulumi.StringOutput        `pulumi:"aksRegion"`
	AksResourceGroupName               pulumi.StringOutput        `pulumi:"aksResourceGroupName"`
	Autoscaler                         OceanNpAutoscalerPtrOutput `pulumi:"autoscaler"`
	AvailabilityZones                  pulumi.StringArrayOutput   `pulumi:"availabilityZones"`
	ControllerClusterId                pulumi.StringOutput        `pulumi:"controllerClusterId"`
	EnableNodePublicIp                 pulumi.BoolPtrOutput       `pulumi:"enableNodePublicIp"`
	FallbackToOndemand                 pulumi.BoolPtrOutput       `pulumi:"fallbackToOndemand"`
	Filters                            OceanNpFiltersPtrOutput    `pulumi:"filters"`
	Headrooms                          OceanNpHeadroomArrayOutput `pulumi:"headrooms"`
	Health                             OceanNpHealthOutput        `pulumi:"health"`
	KubernetesVersion                  pulumi.StringPtrOutput     `pulumi:"kubernetesVersion"`
	Labels                             pulumi.MapOutput           `pulumi:"labels"`
	MaxCount                           pulumi.IntPtrOutput        `pulumi:"maxCount"`
	MaxPodsPerNode                     pulumi.IntPtrOutput        `pulumi:"maxPodsPerNode"`
	MinCount                           pulumi.IntPtrOutput        `pulumi:"minCount"`
	Name                               pulumi.StringOutput        `pulumi:"name"`
	OsDiskSizeGb                       pulumi.IntPtrOutput        `pulumi:"osDiskSizeGb"`
	OsDiskType                         pulumi.StringPtrOutput     `pulumi:"osDiskType"`
	OsSku                              pulumi.StringPtrOutput     `pulumi:"osSku"`
	OsType                             pulumi.StringPtrOutput     `pulumi:"osType"`
	PodSubnetIds                       pulumi.StringArrayOutput   `pulumi:"podSubnetIds"`
	Scheduling                         OceanNpSchedulingPtrOutput `pulumi:"scheduling"`
	SpotPercentage                     pulumi.IntPtrOutput        `pulumi:"spotPercentage"`
	Tags                               pulumi.MapOutput           `pulumi:"tags"`
	Taints                             OceanNpTaintArrayOutput    `pulumi:"taints"`
	VnetSubnetIds                      pulumi.StringArrayOutput   `pulumi:"vnetSubnetIds"`
}

// NewOceanNp registers a new resource with the given unique name, arguments, and options.
func NewOceanNp(ctx *pulumi.Context,
	name string, args *OceanNpArgs, opts ...pulumi.ResourceOption) (*OceanNp, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AksClusterName == nil {
		return nil, errors.New("invalid value for required argument 'AksClusterName'")
	}
	if args.AksInfrastructureResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'AksInfrastructureResourceGroupName'")
	}
	if args.AksRegion == nil {
		return nil, errors.New("invalid value for required argument 'AksRegion'")
	}
	if args.AksResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'AksResourceGroupName'")
	}
	if args.AvailabilityZones == nil {
		return nil, errors.New("invalid value for required argument 'AvailabilityZones'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource OceanNp
	err := ctx.RegisterResource("spotinst:azure/oceanNp:OceanNp", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOceanNp gets an existing OceanNp resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOceanNp(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OceanNpState, opts ...pulumi.ResourceOption) (*OceanNp, error) {
	var resource OceanNp
	err := ctx.ReadResource("spotinst:azure/oceanNp:OceanNp", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OceanNp resources.
type oceanNpState struct {
	AksClusterName                     *string                `pulumi:"aksClusterName"`
	AksInfrastructureResourceGroupName *string                `pulumi:"aksInfrastructureResourceGroupName"`
	AksRegion                          *string                `pulumi:"aksRegion"`
	AksResourceGroupName               *string                `pulumi:"aksResourceGroupName"`
	Autoscaler                         *OceanNpAutoscaler     `pulumi:"autoscaler"`
	AvailabilityZones                  []string               `pulumi:"availabilityZones"`
	ControllerClusterId                *string                `pulumi:"controllerClusterId"`
	EnableNodePublicIp                 *bool                  `pulumi:"enableNodePublicIp"`
	FallbackToOndemand                 *bool                  `pulumi:"fallbackToOndemand"`
	Filters                            *OceanNpFilters        `pulumi:"filters"`
	Headrooms                          []OceanNpHeadroom      `pulumi:"headrooms"`
	Health                             *OceanNpHealth         `pulumi:"health"`
	KubernetesVersion                  *string                `pulumi:"kubernetesVersion"`
	Labels                             map[string]interface{} `pulumi:"labels"`
	MaxCount                           *int                   `pulumi:"maxCount"`
	MaxPodsPerNode                     *int                   `pulumi:"maxPodsPerNode"`
	MinCount                           *int                   `pulumi:"minCount"`
	Name                               *string                `pulumi:"name"`
	OsDiskSizeGb                       *int                   `pulumi:"osDiskSizeGb"`
	OsDiskType                         *string                `pulumi:"osDiskType"`
	OsSku                              *string                `pulumi:"osSku"`
	OsType                             *string                `pulumi:"osType"`
	PodSubnetIds                       []string               `pulumi:"podSubnetIds"`
	Scheduling                         *OceanNpScheduling     `pulumi:"scheduling"`
	SpotPercentage                     *int                   `pulumi:"spotPercentage"`
	Tags                               map[string]interface{} `pulumi:"tags"`
	Taints                             []OceanNpTaint         `pulumi:"taints"`
	VnetSubnetIds                      []string               `pulumi:"vnetSubnetIds"`
}

type OceanNpState struct {
	AksClusterName                     pulumi.StringPtrInput
	AksInfrastructureResourceGroupName pulumi.StringPtrInput
	AksRegion                          pulumi.StringPtrInput
	AksResourceGroupName               pulumi.StringPtrInput
	Autoscaler                         OceanNpAutoscalerPtrInput
	AvailabilityZones                  pulumi.StringArrayInput
	ControllerClusterId                pulumi.StringPtrInput
	EnableNodePublicIp                 pulumi.BoolPtrInput
	FallbackToOndemand                 pulumi.BoolPtrInput
	Filters                            OceanNpFiltersPtrInput
	Headrooms                          OceanNpHeadroomArrayInput
	Health                             OceanNpHealthPtrInput
	KubernetesVersion                  pulumi.StringPtrInput
	Labels                             pulumi.MapInput
	MaxCount                           pulumi.IntPtrInput
	MaxPodsPerNode                     pulumi.IntPtrInput
	MinCount                           pulumi.IntPtrInput
	Name                               pulumi.StringPtrInput
	OsDiskSizeGb                       pulumi.IntPtrInput
	OsDiskType                         pulumi.StringPtrInput
	OsSku                              pulumi.StringPtrInput
	OsType                             pulumi.StringPtrInput
	PodSubnetIds                       pulumi.StringArrayInput
	Scheduling                         OceanNpSchedulingPtrInput
	SpotPercentage                     pulumi.IntPtrInput
	Tags                               pulumi.MapInput
	Taints                             OceanNpTaintArrayInput
	VnetSubnetIds                      pulumi.StringArrayInput
}

func (OceanNpState) ElementType() reflect.Type {
	return reflect.TypeOf((*oceanNpState)(nil)).Elem()
}

type oceanNpArgs struct {
	AksClusterName                     string                 `pulumi:"aksClusterName"`
	AksInfrastructureResourceGroupName string                 `pulumi:"aksInfrastructureResourceGroupName"`
	AksRegion                          string                 `pulumi:"aksRegion"`
	AksResourceGroupName               string                 `pulumi:"aksResourceGroupName"`
	Autoscaler                         *OceanNpAutoscaler     `pulumi:"autoscaler"`
	AvailabilityZones                  []string               `pulumi:"availabilityZones"`
	ControllerClusterId                *string                `pulumi:"controllerClusterId"`
	EnableNodePublicIp                 *bool                  `pulumi:"enableNodePublicIp"`
	FallbackToOndemand                 *bool                  `pulumi:"fallbackToOndemand"`
	Filters                            *OceanNpFilters        `pulumi:"filters"`
	Headrooms                          []OceanNpHeadroom      `pulumi:"headrooms"`
	Health                             *OceanNpHealth         `pulumi:"health"`
	KubernetesVersion                  *string                `pulumi:"kubernetesVersion"`
	Labels                             map[string]interface{} `pulumi:"labels"`
	MaxCount                           *int                   `pulumi:"maxCount"`
	MaxPodsPerNode                     *int                   `pulumi:"maxPodsPerNode"`
	MinCount                           *int                   `pulumi:"minCount"`
	Name                               *string                `pulumi:"name"`
	OsDiskSizeGb                       *int                   `pulumi:"osDiskSizeGb"`
	OsDiskType                         *string                `pulumi:"osDiskType"`
	OsSku                              *string                `pulumi:"osSku"`
	OsType                             *string                `pulumi:"osType"`
	PodSubnetIds                       []string               `pulumi:"podSubnetIds"`
	Scheduling                         *OceanNpScheduling     `pulumi:"scheduling"`
	SpotPercentage                     *int                   `pulumi:"spotPercentage"`
	Tags                               map[string]interface{} `pulumi:"tags"`
	Taints                             []OceanNpTaint         `pulumi:"taints"`
	VnetSubnetIds                      []string               `pulumi:"vnetSubnetIds"`
}

// The set of arguments for constructing a OceanNp resource.
type OceanNpArgs struct {
	AksClusterName                     pulumi.StringInput
	AksInfrastructureResourceGroupName pulumi.StringInput
	AksRegion                          pulumi.StringInput
	AksResourceGroupName               pulumi.StringInput
	Autoscaler                         OceanNpAutoscalerPtrInput
	AvailabilityZones                  pulumi.StringArrayInput
	ControllerClusterId                pulumi.StringPtrInput
	EnableNodePublicIp                 pulumi.BoolPtrInput
	FallbackToOndemand                 pulumi.BoolPtrInput
	Filters                            OceanNpFiltersPtrInput
	Headrooms                          OceanNpHeadroomArrayInput
	Health                             OceanNpHealthPtrInput
	KubernetesVersion                  pulumi.StringPtrInput
	Labels                             pulumi.MapInput
	MaxCount                           pulumi.IntPtrInput
	MaxPodsPerNode                     pulumi.IntPtrInput
	MinCount                           pulumi.IntPtrInput
	Name                               pulumi.StringPtrInput
	OsDiskSizeGb                       pulumi.IntPtrInput
	OsDiskType                         pulumi.StringPtrInput
	OsSku                              pulumi.StringPtrInput
	OsType                             pulumi.StringPtrInput
	PodSubnetIds                       pulumi.StringArrayInput
	Scheduling                         OceanNpSchedulingPtrInput
	SpotPercentage                     pulumi.IntPtrInput
	Tags                               pulumi.MapInput
	Taints                             OceanNpTaintArrayInput
	VnetSubnetIds                      pulumi.StringArrayInput
}

func (OceanNpArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*oceanNpArgs)(nil)).Elem()
}

type OceanNpInput interface {
	pulumi.Input

	ToOceanNpOutput() OceanNpOutput
	ToOceanNpOutputWithContext(ctx context.Context) OceanNpOutput
}

func (*OceanNp) ElementType() reflect.Type {
	return reflect.TypeOf((**OceanNp)(nil)).Elem()
}

func (i *OceanNp) ToOceanNpOutput() OceanNpOutput {
	return i.ToOceanNpOutputWithContext(context.Background())
}

func (i *OceanNp) ToOceanNpOutputWithContext(ctx context.Context) OceanNpOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OceanNpOutput)
}

// OceanNpArrayInput is an input type that accepts OceanNpArray and OceanNpArrayOutput values.
// You can construct a concrete instance of `OceanNpArrayInput` via:
//
//	OceanNpArray{ OceanNpArgs{...} }
type OceanNpArrayInput interface {
	pulumi.Input

	ToOceanNpArrayOutput() OceanNpArrayOutput
	ToOceanNpArrayOutputWithContext(context.Context) OceanNpArrayOutput
}

type OceanNpArray []OceanNpInput

func (OceanNpArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OceanNp)(nil)).Elem()
}

func (i OceanNpArray) ToOceanNpArrayOutput() OceanNpArrayOutput {
	return i.ToOceanNpArrayOutputWithContext(context.Background())
}

func (i OceanNpArray) ToOceanNpArrayOutputWithContext(ctx context.Context) OceanNpArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OceanNpArrayOutput)
}

// OceanNpMapInput is an input type that accepts OceanNpMap and OceanNpMapOutput values.
// You can construct a concrete instance of `OceanNpMapInput` via:
//
//	OceanNpMap{ "key": OceanNpArgs{...} }
type OceanNpMapInput interface {
	pulumi.Input

	ToOceanNpMapOutput() OceanNpMapOutput
	ToOceanNpMapOutputWithContext(context.Context) OceanNpMapOutput
}

type OceanNpMap map[string]OceanNpInput

func (OceanNpMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OceanNp)(nil)).Elem()
}

func (i OceanNpMap) ToOceanNpMapOutput() OceanNpMapOutput {
	return i.ToOceanNpMapOutputWithContext(context.Background())
}

func (i OceanNpMap) ToOceanNpMapOutputWithContext(ctx context.Context) OceanNpMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OceanNpMapOutput)
}

type OceanNpOutput struct{ *pulumi.OutputState }

func (OceanNpOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OceanNp)(nil)).Elem()
}

func (o OceanNpOutput) ToOceanNpOutput() OceanNpOutput {
	return o
}

func (o OceanNpOutput) ToOceanNpOutputWithContext(ctx context.Context) OceanNpOutput {
	return o
}

func (o OceanNpOutput) AksClusterName() pulumi.StringOutput {
	return o.ApplyT(func(v *OceanNp) pulumi.StringOutput { return v.AksClusterName }).(pulumi.StringOutput)
}

func (o OceanNpOutput) AksInfrastructureResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *OceanNp) pulumi.StringOutput { return v.AksInfrastructureResourceGroupName }).(pulumi.StringOutput)
}

func (o OceanNpOutput) AksRegion() pulumi.StringOutput {
	return o.ApplyT(func(v *OceanNp) pulumi.StringOutput { return v.AksRegion }).(pulumi.StringOutput)
}

func (o OceanNpOutput) AksResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *OceanNp) pulumi.StringOutput { return v.AksResourceGroupName }).(pulumi.StringOutput)
}

func (o OceanNpOutput) Autoscaler() OceanNpAutoscalerPtrOutput {
	return o.ApplyT(func(v *OceanNp) OceanNpAutoscalerPtrOutput { return v.Autoscaler }).(OceanNpAutoscalerPtrOutput)
}

func (o OceanNpOutput) AvailabilityZones() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *OceanNp) pulumi.StringArrayOutput { return v.AvailabilityZones }).(pulumi.StringArrayOutput)
}

func (o OceanNpOutput) ControllerClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *OceanNp) pulumi.StringOutput { return v.ControllerClusterId }).(pulumi.StringOutput)
}

func (o OceanNpOutput) EnableNodePublicIp() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *OceanNp) pulumi.BoolPtrOutput { return v.EnableNodePublicIp }).(pulumi.BoolPtrOutput)
}

func (o OceanNpOutput) FallbackToOndemand() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *OceanNp) pulumi.BoolPtrOutput { return v.FallbackToOndemand }).(pulumi.BoolPtrOutput)
}

func (o OceanNpOutput) Filters() OceanNpFiltersPtrOutput {
	return o.ApplyT(func(v *OceanNp) OceanNpFiltersPtrOutput { return v.Filters }).(OceanNpFiltersPtrOutput)
}

func (o OceanNpOutput) Headrooms() OceanNpHeadroomArrayOutput {
	return o.ApplyT(func(v *OceanNp) OceanNpHeadroomArrayOutput { return v.Headrooms }).(OceanNpHeadroomArrayOutput)
}

func (o OceanNpOutput) Health() OceanNpHealthOutput {
	return o.ApplyT(func(v *OceanNp) OceanNpHealthOutput { return v.Health }).(OceanNpHealthOutput)
}

func (o OceanNpOutput) KubernetesVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OceanNp) pulumi.StringPtrOutput { return v.KubernetesVersion }).(pulumi.StringPtrOutput)
}

func (o OceanNpOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *OceanNp) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

func (o OceanNpOutput) MaxCount() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *OceanNp) pulumi.IntPtrOutput { return v.MaxCount }).(pulumi.IntPtrOutput)
}

func (o OceanNpOutput) MaxPodsPerNode() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *OceanNp) pulumi.IntPtrOutput { return v.MaxPodsPerNode }).(pulumi.IntPtrOutput)
}

func (o OceanNpOutput) MinCount() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *OceanNp) pulumi.IntPtrOutput { return v.MinCount }).(pulumi.IntPtrOutput)
}

func (o OceanNpOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *OceanNp) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o OceanNpOutput) OsDiskSizeGb() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *OceanNp) pulumi.IntPtrOutput { return v.OsDiskSizeGb }).(pulumi.IntPtrOutput)
}

func (o OceanNpOutput) OsDiskType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OceanNp) pulumi.StringPtrOutput { return v.OsDiskType }).(pulumi.StringPtrOutput)
}

func (o OceanNpOutput) OsSku() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OceanNp) pulumi.StringPtrOutput { return v.OsSku }).(pulumi.StringPtrOutput)
}

func (o OceanNpOutput) OsType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OceanNp) pulumi.StringPtrOutput { return v.OsType }).(pulumi.StringPtrOutput)
}

func (o OceanNpOutput) PodSubnetIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *OceanNp) pulumi.StringArrayOutput { return v.PodSubnetIds }).(pulumi.StringArrayOutput)
}

func (o OceanNpOutput) Scheduling() OceanNpSchedulingPtrOutput {
	return o.ApplyT(func(v *OceanNp) OceanNpSchedulingPtrOutput { return v.Scheduling }).(OceanNpSchedulingPtrOutput)
}

func (o OceanNpOutput) SpotPercentage() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *OceanNp) pulumi.IntPtrOutput { return v.SpotPercentage }).(pulumi.IntPtrOutput)
}

func (o OceanNpOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v *OceanNp) pulumi.MapOutput { return v.Tags }).(pulumi.MapOutput)
}

func (o OceanNpOutput) Taints() OceanNpTaintArrayOutput {
	return o.ApplyT(func(v *OceanNp) OceanNpTaintArrayOutput { return v.Taints }).(OceanNpTaintArrayOutput)
}

func (o OceanNpOutput) VnetSubnetIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *OceanNp) pulumi.StringArrayOutput { return v.VnetSubnetIds }).(pulumi.StringArrayOutput)
}

type OceanNpArrayOutput struct{ *pulumi.OutputState }

func (OceanNpArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OceanNp)(nil)).Elem()
}

func (o OceanNpArrayOutput) ToOceanNpArrayOutput() OceanNpArrayOutput {
	return o
}

func (o OceanNpArrayOutput) ToOceanNpArrayOutputWithContext(ctx context.Context) OceanNpArrayOutput {
	return o
}

func (o OceanNpArrayOutput) Index(i pulumi.IntInput) OceanNpOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OceanNp {
		return vs[0].([]*OceanNp)[vs[1].(int)]
	}).(OceanNpOutput)
}

type OceanNpMapOutput struct{ *pulumi.OutputState }

func (OceanNpMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OceanNp)(nil)).Elem()
}

func (o OceanNpMapOutput) ToOceanNpMapOutput() OceanNpMapOutput {
	return o
}

func (o OceanNpMapOutput) ToOceanNpMapOutputWithContext(ctx context.Context) OceanNpMapOutput {
	return o
}

func (o OceanNpMapOutput) MapIndex(k pulumi.StringInput) OceanNpOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OceanNp {
		return vs[0].(map[string]*OceanNp)[vs[1].(string)]
	}).(OceanNpOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OceanNpInput)(nil)).Elem(), &OceanNp{})
	pulumi.RegisterInputType(reflect.TypeOf((*OceanNpArrayInput)(nil)).Elem(), OceanNpArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OceanNpMapInput)(nil)).Elem(), OceanNpMap{})
	pulumi.RegisterOutputType(OceanNpOutput{})
	pulumi.RegisterOutputType(OceanNpArrayOutput{})
	pulumi.RegisterOutputType(OceanNpMapOutput{})
}
