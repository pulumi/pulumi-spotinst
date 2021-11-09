// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package gke

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a custom Spotinst Ocean GKE Launch Spec resource.
//
// > This resource can be imported from GKE node pool or not. If you want to import the node pool and create the VNG from it, please provide `nodePoolName`.
//
// ## Update Policy
//
// * `updatePolicy` - (Optional)
//   * `shouldRoll` - (Required) Enables the roll.
//   * `rollConfig` - (Required) Holds the roll configuration.
//     * `batchSizePercentage` - (Required) Sets the percentage of the instances to deploy in each batch.
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		return nil
// 	})
// }
// ```
type OceanLaunchSpec struct {
	pulumi.CustomResourceState

	// Set custom headroom per launch spec. provide list of headrooms object.
	AutoscaleHeadrooms OceanLaunchSpecAutoscaleHeadroomArrayOutput `pulumi:"autoscaleHeadrooms"`
	// List of supported machine types for the Launch Spec.
	InstanceTypes pulumi.StringArrayOutput `pulumi:"instanceTypes"`
	// Optionally adds labels to instances launched in an Ocean cluster.
	Labels OceanLaunchSpecLabelArrayOutput `pulumi:"labels"`
	// Cluster's metadata.
	Metadatas OceanLaunchSpecMetadataArrayOutput `pulumi:"metadatas"`
	// The launch specification name.
	Name pulumi.StringOutput `pulumi:"name"`
	// The node pool you wish to use in your Launch Spec.
	NodePoolName pulumi.StringPtrOutput `pulumi:"nodePoolName"`
	// The Ocean cluster ID.
	OceanId pulumi.StringOutput `pulumi:"oceanId"`
	// The Ocean virtual node group resource limits object.
	ResourceLimits OceanLaunchSpecResourceLimitsPtrOutput `pulumi:"resourceLimits"`
	// Boolean. When set to `true`, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
	RestrictScaleDown pulumi.BoolOutput `pulumi:"restrictScaleDown"`
	// Root volume size (in GB).
	RootVolumeSize pulumi.IntOutput `pulumi:"rootVolumeSize"`
	// Root volume disk type. Valid values: `"pd-standard"`, `"pd-ssd"`.
	RootVolumeType pulumi.StringOutput `pulumi:"rootVolumeType"`
	// The account used by applications running on the VM to call GCP APIs.
	ServiceAccount pulumi.StringOutput `pulumi:"serviceAccount"`
	// The Ocean shielded instance configuration object.
	ShieldedInstanceConfig OceanLaunchSpecShieldedInstanceConfigOutput `pulumi:"shieldedInstanceConfig"`
	// Image URL.
	SourceImage pulumi.StringOutput `pulumi:"sourceImage"`
	// The Ocean virtual node group storage object.
	Storage OceanLaunchSpecStorageOutput `pulumi:"storage"`
	// The Ocean Launch Spec Strategy object.
	Strategies OceanLaunchSpecStrategyArrayOutput `pulumi:"strategies"`
	// Optionally adds labels to instances launched in an Ocean cluster.
	Taints       OceanLaunchSpecTaintArrayOutput      `pulumi:"taints"`
	UpdatePolicy OceanLaunchSpecUpdatePolicyPtrOutput `pulumi:"updatePolicy"`
}

// NewOceanLaunchSpec registers a new resource with the given unique name, arguments, and options.
func NewOceanLaunchSpec(ctx *pulumi.Context,
	name string, args *OceanLaunchSpecArgs, opts ...pulumi.ResourceOption) (*OceanLaunchSpec, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OceanId == nil {
		return nil, errors.New("invalid value for required argument 'OceanId'")
	}
	var resource OceanLaunchSpec
	err := ctx.RegisterResource("spotinst:gke/oceanLaunchSpec:OceanLaunchSpec", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOceanLaunchSpec gets an existing OceanLaunchSpec resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOceanLaunchSpec(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OceanLaunchSpecState, opts ...pulumi.ResourceOption) (*OceanLaunchSpec, error) {
	var resource OceanLaunchSpec
	err := ctx.ReadResource("spotinst:gke/oceanLaunchSpec:OceanLaunchSpec", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OceanLaunchSpec resources.
type oceanLaunchSpecState struct {
	// Set custom headroom per launch spec. provide list of headrooms object.
	AutoscaleHeadrooms []OceanLaunchSpecAutoscaleHeadroom `pulumi:"autoscaleHeadrooms"`
	// List of supported machine types for the Launch Spec.
	InstanceTypes []string `pulumi:"instanceTypes"`
	// Optionally adds labels to instances launched in an Ocean cluster.
	Labels []OceanLaunchSpecLabel `pulumi:"labels"`
	// Cluster's metadata.
	Metadatas []OceanLaunchSpecMetadata `pulumi:"metadatas"`
	// The launch specification name.
	Name *string `pulumi:"name"`
	// The node pool you wish to use in your Launch Spec.
	NodePoolName *string `pulumi:"nodePoolName"`
	// The Ocean cluster ID.
	OceanId *string `pulumi:"oceanId"`
	// The Ocean virtual node group resource limits object.
	ResourceLimits *OceanLaunchSpecResourceLimits `pulumi:"resourceLimits"`
	// Boolean. When set to `true`, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
	RestrictScaleDown *bool `pulumi:"restrictScaleDown"`
	// Root volume size (in GB).
	RootVolumeSize *int `pulumi:"rootVolumeSize"`
	// Root volume disk type. Valid values: `"pd-standard"`, `"pd-ssd"`.
	RootVolumeType *string `pulumi:"rootVolumeType"`
	// The account used by applications running on the VM to call GCP APIs.
	ServiceAccount *string `pulumi:"serviceAccount"`
	// The Ocean shielded instance configuration object.
	ShieldedInstanceConfig *OceanLaunchSpecShieldedInstanceConfig `pulumi:"shieldedInstanceConfig"`
	// Image URL.
	SourceImage *string `pulumi:"sourceImage"`
	// The Ocean virtual node group storage object.
	Storage *OceanLaunchSpecStorage `pulumi:"storage"`
	// The Ocean Launch Spec Strategy object.
	Strategies []OceanLaunchSpecStrategy `pulumi:"strategies"`
	// Optionally adds labels to instances launched in an Ocean cluster.
	Taints       []OceanLaunchSpecTaint       `pulumi:"taints"`
	UpdatePolicy *OceanLaunchSpecUpdatePolicy `pulumi:"updatePolicy"`
}

type OceanLaunchSpecState struct {
	// Set custom headroom per launch spec. provide list of headrooms object.
	AutoscaleHeadrooms OceanLaunchSpecAutoscaleHeadroomArrayInput
	// List of supported machine types for the Launch Spec.
	InstanceTypes pulumi.StringArrayInput
	// Optionally adds labels to instances launched in an Ocean cluster.
	Labels OceanLaunchSpecLabelArrayInput
	// Cluster's metadata.
	Metadatas OceanLaunchSpecMetadataArrayInput
	// The launch specification name.
	Name pulumi.StringPtrInput
	// The node pool you wish to use in your Launch Spec.
	NodePoolName pulumi.StringPtrInput
	// The Ocean cluster ID.
	OceanId pulumi.StringPtrInput
	// The Ocean virtual node group resource limits object.
	ResourceLimits OceanLaunchSpecResourceLimitsPtrInput
	// Boolean. When set to `true`, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
	RestrictScaleDown pulumi.BoolPtrInput
	// Root volume size (in GB).
	RootVolumeSize pulumi.IntPtrInput
	// Root volume disk type. Valid values: `"pd-standard"`, `"pd-ssd"`.
	RootVolumeType pulumi.StringPtrInput
	// The account used by applications running on the VM to call GCP APIs.
	ServiceAccount pulumi.StringPtrInput
	// The Ocean shielded instance configuration object.
	ShieldedInstanceConfig OceanLaunchSpecShieldedInstanceConfigPtrInput
	// Image URL.
	SourceImage pulumi.StringPtrInput
	// The Ocean virtual node group storage object.
	Storage OceanLaunchSpecStoragePtrInput
	// The Ocean Launch Spec Strategy object.
	Strategies OceanLaunchSpecStrategyArrayInput
	// Optionally adds labels to instances launched in an Ocean cluster.
	Taints       OceanLaunchSpecTaintArrayInput
	UpdatePolicy OceanLaunchSpecUpdatePolicyPtrInput
}

func (OceanLaunchSpecState) ElementType() reflect.Type {
	return reflect.TypeOf((*oceanLaunchSpecState)(nil)).Elem()
}

type oceanLaunchSpecArgs struct {
	// Set custom headroom per launch spec. provide list of headrooms object.
	AutoscaleHeadrooms []OceanLaunchSpecAutoscaleHeadroom `pulumi:"autoscaleHeadrooms"`
	// List of supported machine types for the Launch Spec.
	InstanceTypes []string `pulumi:"instanceTypes"`
	// Optionally adds labels to instances launched in an Ocean cluster.
	Labels []OceanLaunchSpecLabel `pulumi:"labels"`
	// Cluster's metadata.
	Metadatas []OceanLaunchSpecMetadata `pulumi:"metadatas"`
	// The launch specification name.
	Name *string `pulumi:"name"`
	// The node pool you wish to use in your Launch Spec.
	NodePoolName *string `pulumi:"nodePoolName"`
	// The Ocean cluster ID.
	OceanId string `pulumi:"oceanId"`
	// The Ocean virtual node group resource limits object.
	ResourceLimits *OceanLaunchSpecResourceLimits `pulumi:"resourceLimits"`
	// Boolean. When set to `true`, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
	RestrictScaleDown *bool `pulumi:"restrictScaleDown"`
	// Root volume size (in GB).
	RootVolumeSize *int `pulumi:"rootVolumeSize"`
	// Root volume disk type. Valid values: `"pd-standard"`, `"pd-ssd"`.
	RootVolumeType *string `pulumi:"rootVolumeType"`
	// The account used by applications running on the VM to call GCP APIs.
	ServiceAccount *string `pulumi:"serviceAccount"`
	// The Ocean shielded instance configuration object.
	ShieldedInstanceConfig *OceanLaunchSpecShieldedInstanceConfig `pulumi:"shieldedInstanceConfig"`
	// Image URL.
	SourceImage *string `pulumi:"sourceImage"`
	// The Ocean virtual node group storage object.
	Storage *OceanLaunchSpecStorage `pulumi:"storage"`
	// The Ocean Launch Spec Strategy object.
	Strategies []OceanLaunchSpecStrategy `pulumi:"strategies"`
	// Optionally adds labels to instances launched in an Ocean cluster.
	Taints       []OceanLaunchSpecTaint       `pulumi:"taints"`
	UpdatePolicy *OceanLaunchSpecUpdatePolicy `pulumi:"updatePolicy"`
}

// The set of arguments for constructing a OceanLaunchSpec resource.
type OceanLaunchSpecArgs struct {
	// Set custom headroom per launch spec. provide list of headrooms object.
	AutoscaleHeadrooms OceanLaunchSpecAutoscaleHeadroomArrayInput
	// List of supported machine types for the Launch Spec.
	InstanceTypes pulumi.StringArrayInput
	// Optionally adds labels to instances launched in an Ocean cluster.
	Labels OceanLaunchSpecLabelArrayInput
	// Cluster's metadata.
	Metadatas OceanLaunchSpecMetadataArrayInput
	// The launch specification name.
	Name pulumi.StringPtrInput
	// The node pool you wish to use in your Launch Spec.
	NodePoolName pulumi.StringPtrInput
	// The Ocean cluster ID.
	OceanId pulumi.StringInput
	// The Ocean virtual node group resource limits object.
	ResourceLimits OceanLaunchSpecResourceLimitsPtrInput
	// Boolean. When set to `true`, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
	RestrictScaleDown pulumi.BoolPtrInput
	// Root volume size (in GB).
	RootVolumeSize pulumi.IntPtrInput
	// Root volume disk type. Valid values: `"pd-standard"`, `"pd-ssd"`.
	RootVolumeType pulumi.StringPtrInput
	// The account used by applications running on the VM to call GCP APIs.
	ServiceAccount pulumi.StringPtrInput
	// The Ocean shielded instance configuration object.
	ShieldedInstanceConfig OceanLaunchSpecShieldedInstanceConfigPtrInput
	// Image URL.
	SourceImage pulumi.StringPtrInput
	// The Ocean virtual node group storage object.
	Storage OceanLaunchSpecStoragePtrInput
	// The Ocean Launch Spec Strategy object.
	Strategies OceanLaunchSpecStrategyArrayInput
	// Optionally adds labels to instances launched in an Ocean cluster.
	Taints       OceanLaunchSpecTaintArrayInput
	UpdatePolicy OceanLaunchSpecUpdatePolicyPtrInput
}

func (OceanLaunchSpecArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*oceanLaunchSpecArgs)(nil)).Elem()
}

type OceanLaunchSpecInput interface {
	pulumi.Input

	ToOceanLaunchSpecOutput() OceanLaunchSpecOutput
	ToOceanLaunchSpecOutputWithContext(ctx context.Context) OceanLaunchSpecOutput
}

func (*OceanLaunchSpec) ElementType() reflect.Type {
	return reflect.TypeOf((*OceanLaunchSpec)(nil))
}

func (i *OceanLaunchSpec) ToOceanLaunchSpecOutput() OceanLaunchSpecOutput {
	return i.ToOceanLaunchSpecOutputWithContext(context.Background())
}

func (i *OceanLaunchSpec) ToOceanLaunchSpecOutputWithContext(ctx context.Context) OceanLaunchSpecOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OceanLaunchSpecOutput)
}

func (i *OceanLaunchSpec) ToOceanLaunchSpecPtrOutput() OceanLaunchSpecPtrOutput {
	return i.ToOceanLaunchSpecPtrOutputWithContext(context.Background())
}

func (i *OceanLaunchSpec) ToOceanLaunchSpecPtrOutputWithContext(ctx context.Context) OceanLaunchSpecPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OceanLaunchSpecPtrOutput)
}

type OceanLaunchSpecPtrInput interface {
	pulumi.Input

	ToOceanLaunchSpecPtrOutput() OceanLaunchSpecPtrOutput
	ToOceanLaunchSpecPtrOutputWithContext(ctx context.Context) OceanLaunchSpecPtrOutput
}

type oceanLaunchSpecPtrType OceanLaunchSpecArgs

func (*oceanLaunchSpecPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**OceanLaunchSpec)(nil))
}

func (i *oceanLaunchSpecPtrType) ToOceanLaunchSpecPtrOutput() OceanLaunchSpecPtrOutput {
	return i.ToOceanLaunchSpecPtrOutputWithContext(context.Background())
}

func (i *oceanLaunchSpecPtrType) ToOceanLaunchSpecPtrOutputWithContext(ctx context.Context) OceanLaunchSpecPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OceanLaunchSpecPtrOutput)
}

// OceanLaunchSpecArrayInput is an input type that accepts OceanLaunchSpecArray and OceanLaunchSpecArrayOutput values.
// You can construct a concrete instance of `OceanLaunchSpecArrayInput` via:
//
//          OceanLaunchSpecArray{ OceanLaunchSpecArgs{...} }
type OceanLaunchSpecArrayInput interface {
	pulumi.Input

	ToOceanLaunchSpecArrayOutput() OceanLaunchSpecArrayOutput
	ToOceanLaunchSpecArrayOutputWithContext(context.Context) OceanLaunchSpecArrayOutput
}

type OceanLaunchSpecArray []OceanLaunchSpecInput

func (OceanLaunchSpecArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OceanLaunchSpec)(nil)).Elem()
}

func (i OceanLaunchSpecArray) ToOceanLaunchSpecArrayOutput() OceanLaunchSpecArrayOutput {
	return i.ToOceanLaunchSpecArrayOutputWithContext(context.Background())
}

func (i OceanLaunchSpecArray) ToOceanLaunchSpecArrayOutputWithContext(ctx context.Context) OceanLaunchSpecArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OceanLaunchSpecArrayOutput)
}

// OceanLaunchSpecMapInput is an input type that accepts OceanLaunchSpecMap and OceanLaunchSpecMapOutput values.
// You can construct a concrete instance of `OceanLaunchSpecMapInput` via:
//
//          OceanLaunchSpecMap{ "key": OceanLaunchSpecArgs{...} }
type OceanLaunchSpecMapInput interface {
	pulumi.Input

	ToOceanLaunchSpecMapOutput() OceanLaunchSpecMapOutput
	ToOceanLaunchSpecMapOutputWithContext(context.Context) OceanLaunchSpecMapOutput
}

type OceanLaunchSpecMap map[string]OceanLaunchSpecInput

func (OceanLaunchSpecMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OceanLaunchSpec)(nil)).Elem()
}

func (i OceanLaunchSpecMap) ToOceanLaunchSpecMapOutput() OceanLaunchSpecMapOutput {
	return i.ToOceanLaunchSpecMapOutputWithContext(context.Background())
}

func (i OceanLaunchSpecMap) ToOceanLaunchSpecMapOutputWithContext(ctx context.Context) OceanLaunchSpecMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OceanLaunchSpecMapOutput)
}

type OceanLaunchSpecOutput struct{ *pulumi.OutputState }

func (OceanLaunchSpecOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*OceanLaunchSpec)(nil))
}

func (o OceanLaunchSpecOutput) ToOceanLaunchSpecOutput() OceanLaunchSpecOutput {
	return o
}

func (o OceanLaunchSpecOutput) ToOceanLaunchSpecOutputWithContext(ctx context.Context) OceanLaunchSpecOutput {
	return o
}

func (o OceanLaunchSpecOutput) ToOceanLaunchSpecPtrOutput() OceanLaunchSpecPtrOutput {
	return o.ToOceanLaunchSpecPtrOutputWithContext(context.Background())
}

func (o OceanLaunchSpecOutput) ToOceanLaunchSpecPtrOutputWithContext(ctx context.Context) OceanLaunchSpecPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v OceanLaunchSpec) *OceanLaunchSpec {
		return &v
	}).(OceanLaunchSpecPtrOutput)
}

type OceanLaunchSpecPtrOutput struct{ *pulumi.OutputState }

func (OceanLaunchSpecPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OceanLaunchSpec)(nil))
}

func (o OceanLaunchSpecPtrOutput) ToOceanLaunchSpecPtrOutput() OceanLaunchSpecPtrOutput {
	return o
}

func (o OceanLaunchSpecPtrOutput) ToOceanLaunchSpecPtrOutputWithContext(ctx context.Context) OceanLaunchSpecPtrOutput {
	return o
}

func (o OceanLaunchSpecPtrOutput) Elem() OceanLaunchSpecOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) OceanLaunchSpec {
		if v != nil {
			return *v
		}
		var ret OceanLaunchSpec
		return ret
	}).(OceanLaunchSpecOutput)
}

type OceanLaunchSpecArrayOutput struct{ *pulumi.OutputState }

func (OceanLaunchSpecArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]OceanLaunchSpec)(nil))
}

func (o OceanLaunchSpecArrayOutput) ToOceanLaunchSpecArrayOutput() OceanLaunchSpecArrayOutput {
	return o
}

func (o OceanLaunchSpecArrayOutput) ToOceanLaunchSpecArrayOutputWithContext(ctx context.Context) OceanLaunchSpecArrayOutput {
	return o
}

func (o OceanLaunchSpecArrayOutput) Index(i pulumi.IntInput) OceanLaunchSpecOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) OceanLaunchSpec {
		return vs[0].([]OceanLaunchSpec)[vs[1].(int)]
	}).(OceanLaunchSpecOutput)
}

type OceanLaunchSpecMapOutput struct{ *pulumi.OutputState }

func (OceanLaunchSpecMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]OceanLaunchSpec)(nil))
}

func (o OceanLaunchSpecMapOutput) ToOceanLaunchSpecMapOutput() OceanLaunchSpecMapOutput {
	return o
}

func (o OceanLaunchSpecMapOutput) ToOceanLaunchSpecMapOutputWithContext(ctx context.Context) OceanLaunchSpecMapOutput {
	return o
}

func (o OceanLaunchSpecMapOutput) MapIndex(k pulumi.StringInput) OceanLaunchSpecOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) OceanLaunchSpec {
		return vs[0].(map[string]OceanLaunchSpec)[vs[1].(string)]
	}).(OceanLaunchSpecOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OceanLaunchSpecInput)(nil)).Elem(), &OceanLaunchSpec{})
	pulumi.RegisterInputType(reflect.TypeOf((*OceanLaunchSpecPtrInput)(nil)).Elem(), &OceanLaunchSpec{})
	pulumi.RegisterInputType(reflect.TypeOf((*OceanLaunchSpecArrayInput)(nil)).Elem(), OceanLaunchSpecArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OceanLaunchSpecMapInput)(nil)).Elem(), OceanLaunchSpecMap{})
	pulumi.RegisterOutputType(OceanLaunchSpecOutput{})
	pulumi.RegisterOutputType(OceanLaunchSpecPtrOutput{})
	pulumi.RegisterOutputType(OceanLaunchSpecArrayOutput{})
	pulumi.RegisterOutputType(OceanLaunchSpecMapOutput{})
}
