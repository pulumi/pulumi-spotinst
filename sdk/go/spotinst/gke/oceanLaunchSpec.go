// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package gke

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-spotinst/sdk/v3/go/spotinst/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a custom Spotinst Ocean GKE Launch Spec resource.
//
// > This resource can be imported from GKE node pool or not. If you want to import the node pool and create the VNG from it, please provide `nodePoolName`.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-spotinst/sdk/v3/go/spotinst/gke"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := gke.NewOceanLaunchSpec(ctx, "example", &gke.OceanLaunchSpecArgs{
//				OceanId:           pulumi.String("o-123456"),
//				NodePoolName:      pulumi.String("default-pool"),
//				Name:              pulumi.String("specialty.nodes.spotk8s.com"),
//				SourceImage:       pulumi.String("image"),
//				RestrictScaleDown: pulumi.Bool(true),
//				RootVolumeSize:    pulumi.Int(10),
//				RootVolumeType:    pulumi.String("pd-standard"),
//				InstanceTypes: pulumi.StringArray{
//					pulumi.String("n1-standard-1, n1-standard-2"),
//				},
//				Tags: pulumi.StringArray{
//					pulumi.String("tag1"),
//					pulumi.String("tag2"),
//				},
//				CreateOptions: &gke.OceanLaunchSpecCreateOptionsArgs{
//					InitialNodes: pulumi.Int(1),
//				},
//				ShieldedInstanceConfig: &gke.OceanLaunchSpecShieldedInstanceConfigArgs{
//					EnableSecureBoot:          pulumi.Bool(false),
//					EnableIntegrityMonitoring: pulumi.Bool(true),
//				},
//				Storage: &gke.OceanLaunchSpecStorageArgs{
//					LocalSsdCount: pulumi.Int(5),
//				},
//				ResourceLimits: &gke.OceanLaunchSpecResourceLimitsArgs{
//					MaxInstanceCount: pulumi.Int(3),
//					MinInstanceCount: pulumi.Int(0),
//				},
//				ServiceAccount: pulumi.String("default"),
//				Metadatas: gke.OceanLaunchSpecMetadataArray{
//					&gke.OceanLaunchSpecMetadataArgs{
//						Key:   pulumi.String("gci-update-strategy"),
//						Value: pulumi.String("update_disabled"),
//					},
//				},
//				Labels: gke.OceanLaunchSpecLabelArray{
//					&gke.OceanLaunchSpecLabelArgs{
//						Key:   pulumi.String("labelKey"),
//						Value: pulumi.String("labelVal"),
//					},
//				},
//				Taints: gke.OceanLaunchSpecTaintArray{
//					&gke.OceanLaunchSpecTaintArgs{
//						Key:    pulumi.String("taintKey"),
//						Value:  pulumi.String("taintVal"),
//						Effect: pulumi.String("taintEffect"),
//					},
//				},
//				AutoscaleHeadroomsAutomatics: gke.OceanLaunchSpecAutoscaleHeadroomsAutomaticArray{
//					&gke.OceanLaunchSpecAutoscaleHeadroomsAutomaticArgs{
//						AutoHeadroomPercentage: pulumi.Int(5),
//					},
//				},
//				AutoscaleHeadrooms: gke.OceanLaunchSpecAutoscaleHeadroomArray{
//					&gke.OceanLaunchSpecAutoscaleHeadroomArgs{
//						NumOfUnits:    pulumi.Int(5),
//						CpuPerUnit:    pulumi.Int(1000),
//						GpuPerUnit:    pulumi.Int(0),
//						MemoryPerUnit: pulumi.Int(2048),
//					},
//				},
//				Strategies: gke.OceanLaunchSpecStrategyArray{
//					&gke.OceanLaunchSpecStrategyArgs{
//						PreemptiblePercentage: pulumi.Int(30),
//						ScalingOrientation:    pulumi.String("balanced"),
//					},
//				},
//				SchedulingTasks: gke.OceanLaunchSpecSchedulingTaskArray{
//					&gke.OceanLaunchSpecSchedulingTaskArgs{
//						IsEnabled:      pulumi.Bool(true),
//						CronExpression: pulumi.String("0 1 * * *"),
//						TaskType:       pulumi.String("manualHeadroomUpdate"),
//						TaskHeadrooms: gke.OceanLaunchSpecSchedulingTaskTaskHeadroomArray{
//							&gke.OceanLaunchSpecSchedulingTaskTaskHeadroomArgs{
//								NumOfUnits:    pulumi.Int(5),
//								CpuPerUnit:    pulumi.Int(1000),
//								GpuPerUnit:    pulumi.Int(0),
//								MemoryPerUnit: pulumi.Int(2048),
//							},
//						},
//					},
//				},
//				NetworkInterfaces: gke.OceanLaunchSpecNetworkInterfaceArray{
//					&gke.OceanLaunchSpecNetworkInterfaceArgs{
//						Network:   pulumi.String("test-vng-network"),
//						ProjectId: pulumi.String("test-vng-network-project"),
//						AccessConfigs: gke.OceanLaunchSpecNetworkInterfaceAccessConfigArray{
//							&gke.OceanLaunchSpecNetworkInterfaceAccessConfigArgs{
//								Name: pulumi.String("external-nat-vng"),
//								Type: pulumi.String("ONE_TO_ONE_NAT"),
//							},
//						},
//						AliasIpRanges: gke.OceanLaunchSpecNetworkInterfaceAliasIpRangeArray{
//							&gke.OceanLaunchSpecNetworkInterfaceAliasIpRangeArgs{
//								IpCidrRange:         pulumi.String("/25"),
//								SubnetworkRangeName: pulumi.String("gke-test-native-vpc-pods-123456-vng"),
//							},
//						},
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
type OceanLaunchSpec struct {
	pulumi.CustomResourceState

	// Set custom headroom per launch spec. provide list of headrooms object.
	AutoscaleHeadrooms OceanLaunchSpecAutoscaleHeadroomArrayOutput `pulumi:"autoscaleHeadrooms"`
	// Set automatic headroom per launch spec.
	AutoscaleHeadroomsAutomatics OceanLaunchSpecAutoscaleHeadroomsAutomaticArrayOutput `pulumi:"autoscaleHeadroomsAutomatics"`
	CreateOptions                OceanLaunchSpecCreateOptionsPtrOutput                 `pulumi:"createOptions"`
	// List of supported machine types for the Launch Spec.
	InstanceTypes pulumi.StringArrayOutput `pulumi:"instanceTypes"`
	// Optionally adds labels to instances launched in an Ocean cluster.
	Labels OceanLaunchSpecLabelArrayOutput `pulumi:"labels"`
	// Cluster's metadata.
	Metadatas OceanLaunchSpecMetadataArrayOutput `pulumi:"metadatas"`
	// The launch specification name.
	Name pulumi.StringOutput `pulumi:"name"`
	// Settings for network interfaces.
	NetworkInterfaces OceanLaunchSpecNetworkInterfaceArrayOutput `pulumi:"networkInterfaces"`
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
	// Used to define scheduled tasks such as a manual headroom update.
	SchedulingTasks OceanLaunchSpecSchedulingTaskArrayOutput `pulumi:"schedulingTasks"`
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
	// Every node launched from this configuration will be tagged with those tags. Note: during creation some tags are automatically imported to the state file, it is required to manually add it to the template configuration
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
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
	opts = internal.PkgResourceDefaultOpts(opts)
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
	// Set automatic headroom per launch spec.
	AutoscaleHeadroomsAutomatics []OceanLaunchSpecAutoscaleHeadroomsAutomatic `pulumi:"autoscaleHeadroomsAutomatics"`
	CreateOptions                *OceanLaunchSpecCreateOptions                `pulumi:"createOptions"`
	// List of supported machine types for the Launch Spec.
	InstanceTypes []string `pulumi:"instanceTypes"`
	// Optionally adds labels to instances launched in an Ocean cluster.
	Labels []OceanLaunchSpecLabel `pulumi:"labels"`
	// Cluster's metadata.
	Metadatas []OceanLaunchSpecMetadata `pulumi:"metadatas"`
	// The launch specification name.
	Name *string `pulumi:"name"`
	// Settings for network interfaces.
	NetworkInterfaces []OceanLaunchSpecNetworkInterface `pulumi:"networkInterfaces"`
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
	// Used to define scheduled tasks such as a manual headroom update.
	SchedulingTasks []OceanLaunchSpecSchedulingTask `pulumi:"schedulingTasks"`
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
	// Every node launched from this configuration will be tagged with those tags. Note: during creation some tags are automatically imported to the state file, it is required to manually add it to the template configuration
	Tags []string `pulumi:"tags"`
	// Optionally adds labels to instances launched in an Ocean cluster.
	Taints       []OceanLaunchSpecTaint       `pulumi:"taints"`
	UpdatePolicy *OceanLaunchSpecUpdatePolicy `pulumi:"updatePolicy"`
}

type OceanLaunchSpecState struct {
	// Set custom headroom per launch spec. provide list of headrooms object.
	AutoscaleHeadrooms OceanLaunchSpecAutoscaleHeadroomArrayInput
	// Set automatic headroom per launch spec.
	AutoscaleHeadroomsAutomatics OceanLaunchSpecAutoscaleHeadroomsAutomaticArrayInput
	CreateOptions                OceanLaunchSpecCreateOptionsPtrInput
	// List of supported machine types for the Launch Spec.
	InstanceTypes pulumi.StringArrayInput
	// Optionally adds labels to instances launched in an Ocean cluster.
	Labels OceanLaunchSpecLabelArrayInput
	// Cluster's metadata.
	Metadatas OceanLaunchSpecMetadataArrayInput
	// The launch specification name.
	Name pulumi.StringPtrInput
	// Settings for network interfaces.
	NetworkInterfaces OceanLaunchSpecNetworkInterfaceArrayInput
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
	// Used to define scheduled tasks such as a manual headroom update.
	SchedulingTasks OceanLaunchSpecSchedulingTaskArrayInput
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
	// Every node launched from this configuration will be tagged with those tags. Note: during creation some tags are automatically imported to the state file, it is required to manually add it to the template configuration
	Tags pulumi.StringArrayInput
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
	// Set automatic headroom per launch spec.
	AutoscaleHeadroomsAutomatics []OceanLaunchSpecAutoscaleHeadroomsAutomatic `pulumi:"autoscaleHeadroomsAutomatics"`
	CreateOptions                *OceanLaunchSpecCreateOptions                `pulumi:"createOptions"`
	// List of supported machine types for the Launch Spec.
	InstanceTypes []string `pulumi:"instanceTypes"`
	// Optionally adds labels to instances launched in an Ocean cluster.
	Labels []OceanLaunchSpecLabel `pulumi:"labels"`
	// Cluster's metadata.
	Metadatas []OceanLaunchSpecMetadata `pulumi:"metadatas"`
	// The launch specification name.
	Name *string `pulumi:"name"`
	// Settings for network interfaces.
	NetworkInterfaces []OceanLaunchSpecNetworkInterface `pulumi:"networkInterfaces"`
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
	// Used to define scheduled tasks such as a manual headroom update.
	SchedulingTasks []OceanLaunchSpecSchedulingTask `pulumi:"schedulingTasks"`
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
	// Every node launched from this configuration will be tagged with those tags. Note: during creation some tags are automatically imported to the state file, it is required to manually add it to the template configuration
	Tags []string `pulumi:"tags"`
	// Optionally adds labels to instances launched in an Ocean cluster.
	Taints       []OceanLaunchSpecTaint       `pulumi:"taints"`
	UpdatePolicy *OceanLaunchSpecUpdatePolicy `pulumi:"updatePolicy"`
}

// The set of arguments for constructing a OceanLaunchSpec resource.
type OceanLaunchSpecArgs struct {
	// Set custom headroom per launch spec. provide list of headrooms object.
	AutoscaleHeadrooms OceanLaunchSpecAutoscaleHeadroomArrayInput
	// Set automatic headroom per launch spec.
	AutoscaleHeadroomsAutomatics OceanLaunchSpecAutoscaleHeadroomsAutomaticArrayInput
	CreateOptions                OceanLaunchSpecCreateOptionsPtrInput
	// List of supported machine types for the Launch Spec.
	InstanceTypes pulumi.StringArrayInput
	// Optionally adds labels to instances launched in an Ocean cluster.
	Labels OceanLaunchSpecLabelArrayInput
	// Cluster's metadata.
	Metadatas OceanLaunchSpecMetadataArrayInput
	// The launch specification name.
	Name pulumi.StringPtrInput
	// Settings for network interfaces.
	NetworkInterfaces OceanLaunchSpecNetworkInterfaceArrayInput
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
	// Used to define scheduled tasks such as a manual headroom update.
	SchedulingTasks OceanLaunchSpecSchedulingTaskArrayInput
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
	// Every node launched from this configuration will be tagged with those tags. Note: during creation some tags are automatically imported to the state file, it is required to manually add it to the template configuration
	Tags pulumi.StringArrayInput
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
	return reflect.TypeOf((**OceanLaunchSpec)(nil)).Elem()
}

func (i *OceanLaunchSpec) ToOceanLaunchSpecOutput() OceanLaunchSpecOutput {
	return i.ToOceanLaunchSpecOutputWithContext(context.Background())
}

func (i *OceanLaunchSpec) ToOceanLaunchSpecOutputWithContext(ctx context.Context) OceanLaunchSpecOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OceanLaunchSpecOutput)
}

// OceanLaunchSpecArrayInput is an input type that accepts OceanLaunchSpecArray and OceanLaunchSpecArrayOutput values.
// You can construct a concrete instance of `OceanLaunchSpecArrayInput` via:
//
//	OceanLaunchSpecArray{ OceanLaunchSpecArgs{...} }
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
//	OceanLaunchSpecMap{ "key": OceanLaunchSpecArgs{...} }
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
	return reflect.TypeOf((**OceanLaunchSpec)(nil)).Elem()
}

func (o OceanLaunchSpecOutput) ToOceanLaunchSpecOutput() OceanLaunchSpecOutput {
	return o
}

func (o OceanLaunchSpecOutput) ToOceanLaunchSpecOutputWithContext(ctx context.Context) OceanLaunchSpecOutput {
	return o
}

// Set custom headroom per launch spec. provide list of headrooms object.
func (o OceanLaunchSpecOutput) AutoscaleHeadrooms() OceanLaunchSpecAutoscaleHeadroomArrayOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) OceanLaunchSpecAutoscaleHeadroomArrayOutput { return v.AutoscaleHeadrooms }).(OceanLaunchSpecAutoscaleHeadroomArrayOutput)
}

// Set automatic headroom per launch spec.
func (o OceanLaunchSpecOutput) AutoscaleHeadroomsAutomatics() OceanLaunchSpecAutoscaleHeadroomsAutomaticArrayOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) OceanLaunchSpecAutoscaleHeadroomsAutomaticArrayOutput {
		return v.AutoscaleHeadroomsAutomatics
	}).(OceanLaunchSpecAutoscaleHeadroomsAutomaticArrayOutput)
}

func (o OceanLaunchSpecOutput) CreateOptions() OceanLaunchSpecCreateOptionsPtrOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) OceanLaunchSpecCreateOptionsPtrOutput { return v.CreateOptions }).(OceanLaunchSpecCreateOptionsPtrOutput)
}

// List of supported machine types for the Launch Spec.
func (o OceanLaunchSpecOutput) InstanceTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) pulumi.StringArrayOutput { return v.InstanceTypes }).(pulumi.StringArrayOutput)
}

// Optionally adds labels to instances launched in an Ocean cluster.
func (o OceanLaunchSpecOutput) Labels() OceanLaunchSpecLabelArrayOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) OceanLaunchSpecLabelArrayOutput { return v.Labels }).(OceanLaunchSpecLabelArrayOutput)
}

// Cluster's metadata.
func (o OceanLaunchSpecOutput) Metadatas() OceanLaunchSpecMetadataArrayOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) OceanLaunchSpecMetadataArrayOutput { return v.Metadatas }).(OceanLaunchSpecMetadataArrayOutput)
}

// The launch specification name.
func (o OceanLaunchSpecOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Settings for network interfaces.
func (o OceanLaunchSpecOutput) NetworkInterfaces() OceanLaunchSpecNetworkInterfaceArrayOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) OceanLaunchSpecNetworkInterfaceArrayOutput { return v.NetworkInterfaces }).(OceanLaunchSpecNetworkInterfaceArrayOutput)
}

// The node pool you wish to use in your Launch Spec.
func (o OceanLaunchSpecOutput) NodePoolName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) pulumi.StringPtrOutput { return v.NodePoolName }).(pulumi.StringPtrOutput)
}

// The Ocean cluster ID.
func (o OceanLaunchSpecOutput) OceanId() pulumi.StringOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) pulumi.StringOutput { return v.OceanId }).(pulumi.StringOutput)
}

// The Ocean virtual node group resource limits object.
func (o OceanLaunchSpecOutput) ResourceLimits() OceanLaunchSpecResourceLimitsPtrOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) OceanLaunchSpecResourceLimitsPtrOutput { return v.ResourceLimits }).(OceanLaunchSpecResourceLimitsPtrOutput)
}

// Boolean. When set to `true`, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
func (o OceanLaunchSpecOutput) RestrictScaleDown() pulumi.BoolOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) pulumi.BoolOutput { return v.RestrictScaleDown }).(pulumi.BoolOutput)
}

// Root volume size (in GB).
func (o OceanLaunchSpecOutput) RootVolumeSize() pulumi.IntOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) pulumi.IntOutput { return v.RootVolumeSize }).(pulumi.IntOutput)
}

// Root volume disk type. Valid values: `"pd-standard"`, `"pd-ssd"`.
func (o OceanLaunchSpecOutput) RootVolumeType() pulumi.StringOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) pulumi.StringOutput { return v.RootVolumeType }).(pulumi.StringOutput)
}

// Used to define scheduled tasks such as a manual headroom update.
func (o OceanLaunchSpecOutput) SchedulingTasks() OceanLaunchSpecSchedulingTaskArrayOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) OceanLaunchSpecSchedulingTaskArrayOutput { return v.SchedulingTasks }).(OceanLaunchSpecSchedulingTaskArrayOutput)
}

// The account used by applications running on the VM to call GCP APIs.
func (o OceanLaunchSpecOutput) ServiceAccount() pulumi.StringOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) pulumi.StringOutput { return v.ServiceAccount }).(pulumi.StringOutput)
}

// The Ocean shielded instance configuration object.
func (o OceanLaunchSpecOutput) ShieldedInstanceConfig() OceanLaunchSpecShieldedInstanceConfigOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) OceanLaunchSpecShieldedInstanceConfigOutput { return v.ShieldedInstanceConfig }).(OceanLaunchSpecShieldedInstanceConfigOutput)
}

// Image URL.
func (o OceanLaunchSpecOutput) SourceImage() pulumi.StringOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) pulumi.StringOutput { return v.SourceImage }).(pulumi.StringOutput)
}

// The Ocean virtual node group storage object.
func (o OceanLaunchSpecOutput) Storage() OceanLaunchSpecStorageOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) OceanLaunchSpecStorageOutput { return v.Storage }).(OceanLaunchSpecStorageOutput)
}

// The Ocean Launch Spec Strategy object.
func (o OceanLaunchSpecOutput) Strategies() OceanLaunchSpecStrategyArrayOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) OceanLaunchSpecStrategyArrayOutput { return v.Strategies }).(OceanLaunchSpecStrategyArrayOutput)
}

// Every node launched from this configuration will be tagged with those tags. Note: during creation some tags are automatically imported to the state file, it is required to manually add it to the template configuration
func (o OceanLaunchSpecOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// Optionally adds labels to instances launched in an Ocean cluster.
func (o OceanLaunchSpecOutput) Taints() OceanLaunchSpecTaintArrayOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) OceanLaunchSpecTaintArrayOutput { return v.Taints }).(OceanLaunchSpecTaintArrayOutput)
}

func (o OceanLaunchSpecOutput) UpdatePolicy() OceanLaunchSpecUpdatePolicyPtrOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) OceanLaunchSpecUpdatePolicyPtrOutput { return v.UpdatePolicy }).(OceanLaunchSpecUpdatePolicyPtrOutput)
}

type OceanLaunchSpecArrayOutput struct{ *pulumi.OutputState }

func (OceanLaunchSpecArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OceanLaunchSpec)(nil)).Elem()
}

func (o OceanLaunchSpecArrayOutput) ToOceanLaunchSpecArrayOutput() OceanLaunchSpecArrayOutput {
	return o
}

func (o OceanLaunchSpecArrayOutput) ToOceanLaunchSpecArrayOutputWithContext(ctx context.Context) OceanLaunchSpecArrayOutput {
	return o
}

func (o OceanLaunchSpecArrayOutput) Index(i pulumi.IntInput) OceanLaunchSpecOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OceanLaunchSpec {
		return vs[0].([]*OceanLaunchSpec)[vs[1].(int)]
	}).(OceanLaunchSpecOutput)
}

type OceanLaunchSpecMapOutput struct{ *pulumi.OutputState }

func (OceanLaunchSpecMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OceanLaunchSpec)(nil)).Elem()
}

func (o OceanLaunchSpecMapOutput) ToOceanLaunchSpecMapOutput() OceanLaunchSpecMapOutput {
	return o
}

func (o OceanLaunchSpecMapOutput) ToOceanLaunchSpecMapOutputWithContext(ctx context.Context) OceanLaunchSpecMapOutput {
	return o
}

func (o OceanLaunchSpecMapOutput) MapIndex(k pulumi.StringInput) OceanLaunchSpecOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OceanLaunchSpec {
		return vs[0].(map[string]*OceanLaunchSpec)[vs[1].(string)]
	}).(OceanLaunchSpecOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OceanLaunchSpecInput)(nil)).Elem(), &OceanLaunchSpec{})
	pulumi.RegisterInputType(reflect.TypeOf((*OceanLaunchSpecArrayInput)(nil)).Elem(), OceanLaunchSpecArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OceanLaunchSpecMapInput)(nil)).Elem(), OceanLaunchSpecMap{})
	pulumi.RegisterOutputType(OceanLaunchSpecOutput{})
	pulumi.RegisterOutputType(OceanLaunchSpecArrayOutput{})
	pulumi.RegisterOutputType(OceanLaunchSpecMapOutput{})
}
