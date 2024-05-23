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

// Manages a Spotinst Ocean AKS Virtual Node Groups resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-spotinst/sdk/v3/go/spotinst/azure"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := azure.NewOceanNpVirtualNodeGroup(ctx, "example", &azure.OceanNpVirtualNodeGroupArgs{
//				Name:    pulumi.String("testVng"),
//				OceanId: pulumi.String("o-134abcd"),
//				Headrooms: azure.OceanNpVirtualNodeGroupHeadroomArray{
//					&azure.OceanNpVirtualNodeGroupHeadroomArgs{
//						CpuPerUnit:    pulumi.Int(1024),
//						MemoryPerUnit: pulumi.Int(512),
//						GpuPerUnit:    pulumi.Int(0),
//						NumOfUnits:    pulumi.Int(2),
//					},
//				},
//				AvailabilityZones: pulumi.StringArray{
//					pulumi.String("1"),
//					pulumi.String("2"),
//					pulumi.String("3"),
//				},
//				Labels: pulumi.Map{
//					"key":   pulumi.Any("env"),
//					"value": pulumi.Any("test"),
//				},
//				MinCount:           pulumi.Int(1),
//				MaxCount:           pulumi.Int(100),
//				MaxPodsPerNode:     pulumi.Int(30),
//				EnableNodePublicIp: pulumi.Bool(true),
//				OsDiskSizeGb:       pulumi.Int(30),
//				OsDiskType:         pulumi.String("Managed"),
//				OsType:             pulumi.String("Linux"),
//				OsSku:              pulumi.String("Ubuntu"),
//				KubernetesVersion:  pulumi.String("1.26"),
//				PodSubnetIds: pulumi.StringArray{
//					pulumi.String("/subscriptions/123456-1234-1234-1234-123456789/resourceGroups/ExampleResourceGroup/providers/Microsoft.Network/virtualNetworks/ExampleVirtualNetwork/subnets/default"),
//				},
//				VnetSubnetIds: pulumi.StringArray{
//					pulumi.String("/subscriptions/123456-1234-1234-1234-123456789/resourceGroups/ExampleResourceGroup/providers/Microsoft.Network/virtualNetworks/ExampleVirtualNetwork/subnets/default"),
//				},
//				LinuxOsConfigs: azure.OceanNpVirtualNodeGroupLinuxOsConfigArray{
//					&azure.OceanNpVirtualNodeGroupLinuxOsConfigArgs{
//						Sysctls: azure.OceanNpVirtualNodeGroupLinuxOsConfigSysctlArray{
//							&azure.OceanNpVirtualNodeGroupLinuxOsConfigSysctlArgs{
//								VmMaxMapCount: pulumi.Int(79550),
//							},
//						},
//					},
//				},
//				SpotPercentage:     pulumi.Int(50),
//				FallbackToOndemand: pulumi.Bool(true),
//				Taints: azure.OceanNpVirtualNodeGroupTaintArray{
//					&azure.OceanNpVirtualNodeGroupTaintArgs{
//						Key:    pulumi.String("taintKey"),
//						Value:  pulumi.String("taintValue"),
//						Effect: pulumi.String("NoSchedule"),
//					},
//				},
//				Tags: pulumi.Map{
//					"tagKey":   pulumi.Any("env"),
//					"tagValue": pulumi.Any("staging"),
//				},
//				Filters: &azure.OceanNpVirtualNodeGroupFiltersArgs{
//					MinVcpu:      pulumi.Int(2),
//					MaxVcpu:      pulumi.Int(16),
//					MinMemoryGib: pulumi.Float64(8),
//					MaxMemoryGib: pulumi.Float64(128),
//					Architectures: pulumi.StringArray{
//						pulumi.String("x86_64"),
//						pulumi.String("arm64"),
//					},
//					Series: pulumi.StringArray{
//						pulumi.String("D v3"),
//						pulumi.String("Dds_v4"),
//						pulumi.String("Dsv2"),
//					},
//					ExcludeSeries: pulumi.StringArray{
//						pulumi.String("Av2"),
//						pulumi.String("A"),
//						pulumi.String("Bs"),
//						pulumi.String("D"),
//						pulumi.String("E"),
//					},
//					AcceleratedNetworking: pulumi.String("Enabled"),
//					DiskPerformance:       pulumi.String("Premium"),
//					MinGpu:                pulumi.Float64(1),
//					MaxGpu:                pulumi.Float64(2),
//					MinNics:               pulumi.Int(1),
//					VmTypes: pulumi.StringArray{
//						pulumi.String("generalPurpose"),
//						pulumi.String("GPU"),
//					},
//					MinDisk: pulumi.Int(1),
//					GpuTypes: pulumi.StringArray{
//						pulumi.String("nvidia-tesla-t4"),
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
type OceanNpVirtualNodeGroup struct {
	pulumi.CustomResourceState

	// An Array holding Availability Zones, this configures the availability zones the Ocean may launch instances in per VNG.
	AvailabilityZones pulumi.StringArrayOutput `pulumi:"availabilityZones"`
	// Enable node public IP.
	EnableNodePublicIp pulumi.BoolPtrOutput `pulumi:"enableNodePublicIp"`
	// If no spot instance markets are available, enable Ocean to launch on-demand instances instead.
	FallbackToOndemand pulumi.BoolPtrOutput `pulumi:"fallbackToOndemand"`
	// Filters for the VM sizes that can be launched from the virtual node group.
	Filters OceanNpVirtualNodeGroupFiltersPtrOutput `pulumi:"filters"`
	// Specify the custom headroom per VNG. Provide a list of headroom objects.
	Headrooms OceanNpVirtualNodeGroupHeadroomArrayOutput `pulumi:"headrooms"`
	// The desired Kubernetes version of the launched nodes. In case the value is null, the Kubernetes version of the control plane is used.
	KubernetesVersion pulumi.StringPtrOutput `pulumi:"kubernetesVersion"`
	// An array of labels to add to the virtual node group.Only custom user labels are allowed, and not Kubernetes built-in labels or Spot internal labels.
	Labels pulumi.MapOutput `pulumi:"labels"`
	// Custom Linux OS configuration.
	LinuxOsConfigs OceanNpVirtualNodeGroupLinuxOsConfigArrayOutput `pulumi:"linuxOsConfigs"`
	// Maximum node count limit.
	MaxCount pulumi.IntPtrOutput `pulumi:"maxCount"`
	// The maximum number of pods per node in the node pools.
	MaxPodsPerNode pulumi.IntPtrOutput `pulumi:"maxPodsPerNode"`
	// Minimum node count limit.
	MinCount pulumi.IntPtrOutput `pulumi:"minCount"`
	// Enter a name for the virtual node group.
	Name pulumi.StringOutput `pulumi:"name"`
	// The Ocean cluster identifier. Required for Launch Spec creation.
	OceanId pulumi.StringOutput `pulumi:"oceanId"`
	// The size of the OS disk in GB.
	OsDiskSizeGb pulumi.IntPtrOutput `pulumi:"osDiskSizeGb"`
	// The type of the OS disk.
	OsDiskType pulumi.StringPtrOutput `pulumi:"osDiskType"`
	// The OS SKU of the OS type. Must correlate with the os type.
	OsSku pulumi.StringPtrOutput `pulumi:"osSku"`
	// The OS type of the OS disk. Can't be modified once set.
	OsType pulumi.StringPtrOutput `pulumi:"osType"`
	// The IDs of subnets in an existing VNet into which to assign pods in the cluster (requires azure network-plugin).
	PodSubnetIds pulumi.StringArrayOutput `pulumi:"podSubnetIds"`
	// Percentage of spot VMs to maintain.
	SpotPercentage pulumi.IntPtrOutput `pulumi:"spotPercentage"`
	Tags           pulumi.MapOutput    `pulumi:"tags"`
	// Add taints to a virtual node group.
	Taints       OceanNpVirtualNodeGroupTaintArrayOutput      `pulumi:"taints"`
	UpdatePolicy OceanNpVirtualNodeGroupUpdatePolicyPtrOutput `pulumi:"updatePolicy"`
	// The IDs of subnets in an existing VNet into which to assign nodes in the cluster (requires azure network-plugin).
	VnetSubnetIds pulumi.StringArrayOutput `pulumi:"vnetSubnetIds"`
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
	opts = internal.PkgResourceDefaultOpts(opts)
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
	// An Array holding Availability Zones, this configures the availability zones the Ocean may launch instances in per VNG.
	AvailabilityZones []string `pulumi:"availabilityZones"`
	// Enable node public IP.
	EnableNodePublicIp *bool `pulumi:"enableNodePublicIp"`
	// If no spot instance markets are available, enable Ocean to launch on-demand instances instead.
	FallbackToOndemand *bool `pulumi:"fallbackToOndemand"`
	// Filters for the VM sizes that can be launched from the virtual node group.
	Filters *OceanNpVirtualNodeGroupFilters `pulumi:"filters"`
	// Specify the custom headroom per VNG. Provide a list of headroom objects.
	Headrooms []OceanNpVirtualNodeGroupHeadroom `pulumi:"headrooms"`
	// The desired Kubernetes version of the launched nodes. In case the value is null, the Kubernetes version of the control plane is used.
	KubernetesVersion *string `pulumi:"kubernetesVersion"`
	// An array of labels to add to the virtual node group.Only custom user labels are allowed, and not Kubernetes built-in labels or Spot internal labels.
	Labels map[string]interface{} `pulumi:"labels"`
	// Custom Linux OS configuration.
	LinuxOsConfigs []OceanNpVirtualNodeGroupLinuxOsConfig `pulumi:"linuxOsConfigs"`
	// Maximum node count limit.
	MaxCount *int `pulumi:"maxCount"`
	// The maximum number of pods per node in the node pools.
	MaxPodsPerNode *int `pulumi:"maxPodsPerNode"`
	// Minimum node count limit.
	MinCount *int `pulumi:"minCount"`
	// Enter a name for the virtual node group.
	Name *string `pulumi:"name"`
	// The Ocean cluster identifier. Required for Launch Spec creation.
	OceanId *string `pulumi:"oceanId"`
	// The size of the OS disk in GB.
	OsDiskSizeGb *int `pulumi:"osDiskSizeGb"`
	// The type of the OS disk.
	OsDiskType *string `pulumi:"osDiskType"`
	// The OS SKU of the OS type. Must correlate with the os type.
	OsSku *string `pulumi:"osSku"`
	// The OS type of the OS disk. Can't be modified once set.
	OsType *string `pulumi:"osType"`
	// The IDs of subnets in an existing VNet into which to assign pods in the cluster (requires azure network-plugin).
	PodSubnetIds []string `pulumi:"podSubnetIds"`
	// Percentage of spot VMs to maintain.
	SpotPercentage *int                   `pulumi:"spotPercentage"`
	Tags           map[string]interface{} `pulumi:"tags"`
	// Add taints to a virtual node group.
	Taints       []OceanNpVirtualNodeGroupTaint       `pulumi:"taints"`
	UpdatePolicy *OceanNpVirtualNodeGroupUpdatePolicy `pulumi:"updatePolicy"`
	// The IDs of subnets in an existing VNet into which to assign nodes in the cluster (requires azure network-plugin).
	VnetSubnetIds []string `pulumi:"vnetSubnetIds"`
}

type OceanNpVirtualNodeGroupState struct {
	// An Array holding Availability Zones, this configures the availability zones the Ocean may launch instances in per VNG.
	AvailabilityZones pulumi.StringArrayInput
	// Enable node public IP.
	EnableNodePublicIp pulumi.BoolPtrInput
	// If no spot instance markets are available, enable Ocean to launch on-demand instances instead.
	FallbackToOndemand pulumi.BoolPtrInput
	// Filters for the VM sizes that can be launched from the virtual node group.
	Filters OceanNpVirtualNodeGroupFiltersPtrInput
	// Specify the custom headroom per VNG. Provide a list of headroom objects.
	Headrooms OceanNpVirtualNodeGroupHeadroomArrayInput
	// The desired Kubernetes version of the launched nodes. In case the value is null, the Kubernetes version of the control plane is used.
	KubernetesVersion pulumi.StringPtrInput
	// An array of labels to add to the virtual node group.Only custom user labels are allowed, and not Kubernetes built-in labels or Spot internal labels.
	Labels pulumi.MapInput
	// Custom Linux OS configuration.
	LinuxOsConfigs OceanNpVirtualNodeGroupLinuxOsConfigArrayInput
	// Maximum node count limit.
	MaxCount pulumi.IntPtrInput
	// The maximum number of pods per node in the node pools.
	MaxPodsPerNode pulumi.IntPtrInput
	// Minimum node count limit.
	MinCount pulumi.IntPtrInput
	// Enter a name for the virtual node group.
	Name pulumi.StringPtrInput
	// The Ocean cluster identifier. Required for Launch Spec creation.
	OceanId pulumi.StringPtrInput
	// The size of the OS disk in GB.
	OsDiskSizeGb pulumi.IntPtrInput
	// The type of the OS disk.
	OsDiskType pulumi.StringPtrInput
	// The OS SKU of the OS type. Must correlate with the os type.
	OsSku pulumi.StringPtrInput
	// The OS type of the OS disk. Can't be modified once set.
	OsType pulumi.StringPtrInput
	// The IDs of subnets in an existing VNet into which to assign pods in the cluster (requires azure network-plugin).
	PodSubnetIds pulumi.StringArrayInput
	// Percentage of spot VMs to maintain.
	SpotPercentage pulumi.IntPtrInput
	Tags           pulumi.MapInput
	// Add taints to a virtual node group.
	Taints       OceanNpVirtualNodeGroupTaintArrayInput
	UpdatePolicy OceanNpVirtualNodeGroupUpdatePolicyPtrInput
	// The IDs of subnets in an existing VNet into which to assign nodes in the cluster (requires azure network-plugin).
	VnetSubnetIds pulumi.StringArrayInput
}

func (OceanNpVirtualNodeGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*oceanNpVirtualNodeGroupState)(nil)).Elem()
}

type oceanNpVirtualNodeGroupArgs struct {
	// An Array holding Availability Zones, this configures the availability zones the Ocean may launch instances in per VNG.
	AvailabilityZones []string `pulumi:"availabilityZones"`
	// Enable node public IP.
	EnableNodePublicIp *bool `pulumi:"enableNodePublicIp"`
	// If no spot instance markets are available, enable Ocean to launch on-demand instances instead.
	FallbackToOndemand *bool `pulumi:"fallbackToOndemand"`
	// Filters for the VM sizes that can be launched from the virtual node group.
	Filters *OceanNpVirtualNodeGroupFilters `pulumi:"filters"`
	// Specify the custom headroom per VNG. Provide a list of headroom objects.
	Headrooms []OceanNpVirtualNodeGroupHeadroom `pulumi:"headrooms"`
	// The desired Kubernetes version of the launched nodes. In case the value is null, the Kubernetes version of the control plane is used.
	KubernetesVersion *string `pulumi:"kubernetesVersion"`
	// An array of labels to add to the virtual node group.Only custom user labels are allowed, and not Kubernetes built-in labels or Spot internal labels.
	Labels map[string]interface{} `pulumi:"labels"`
	// Custom Linux OS configuration.
	LinuxOsConfigs []OceanNpVirtualNodeGroupLinuxOsConfig `pulumi:"linuxOsConfigs"`
	// Maximum node count limit.
	MaxCount *int `pulumi:"maxCount"`
	// The maximum number of pods per node in the node pools.
	MaxPodsPerNode *int `pulumi:"maxPodsPerNode"`
	// Minimum node count limit.
	MinCount *int `pulumi:"minCount"`
	// Enter a name for the virtual node group.
	Name *string `pulumi:"name"`
	// The Ocean cluster identifier. Required for Launch Spec creation.
	OceanId string `pulumi:"oceanId"`
	// The size of the OS disk in GB.
	OsDiskSizeGb *int `pulumi:"osDiskSizeGb"`
	// The type of the OS disk.
	OsDiskType *string `pulumi:"osDiskType"`
	// The OS SKU of the OS type. Must correlate with the os type.
	OsSku *string `pulumi:"osSku"`
	// The OS type of the OS disk. Can't be modified once set.
	OsType *string `pulumi:"osType"`
	// The IDs of subnets in an existing VNet into which to assign pods in the cluster (requires azure network-plugin).
	PodSubnetIds []string `pulumi:"podSubnetIds"`
	// Percentage of spot VMs to maintain.
	SpotPercentage *int                   `pulumi:"spotPercentage"`
	Tags           map[string]interface{} `pulumi:"tags"`
	// Add taints to a virtual node group.
	Taints       []OceanNpVirtualNodeGroupTaint       `pulumi:"taints"`
	UpdatePolicy *OceanNpVirtualNodeGroupUpdatePolicy `pulumi:"updatePolicy"`
	// The IDs of subnets in an existing VNet into which to assign nodes in the cluster (requires azure network-plugin).
	VnetSubnetIds []string `pulumi:"vnetSubnetIds"`
}

// The set of arguments for constructing a OceanNpVirtualNodeGroup resource.
type OceanNpVirtualNodeGroupArgs struct {
	// An Array holding Availability Zones, this configures the availability zones the Ocean may launch instances in per VNG.
	AvailabilityZones pulumi.StringArrayInput
	// Enable node public IP.
	EnableNodePublicIp pulumi.BoolPtrInput
	// If no spot instance markets are available, enable Ocean to launch on-demand instances instead.
	FallbackToOndemand pulumi.BoolPtrInput
	// Filters for the VM sizes that can be launched from the virtual node group.
	Filters OceanNpVirtualNodeGroupFiltersPtrInput
	// Specify the custom headroom per VNG. Provide a list of headroom objects.
	Headrooms OceanNpVirtualNodeGroupHeadroomArrayInput
	// The desired Kubernetes version of the launched nodes. In case the value is null, the Kubernetes version of the control plane is used.
	KubernetesVersion pulumi.StringPtrInput
	// An array of labels to add to the virtual node group.Only custom user labels are allowed, and not Kubernetes built-in labels or Spot internal labels.
	Labels pulumi.MapInput
	// Custom Linux OS configuration.
	LinuxOsConfigs OceanNpVirtualNodeGroupLinuxOsConfigArrayInput
	// Maximum node count limit.
	MaxCount pulumi.IntPtrInput
	// The maximum number of pods per node in the node pools.
	MaxPodsPerNode pulumi.IntPtrInput
	// Minimum node count limit.
	MinCount pulumi.IntPtrInput
	// Enter a name for the virtual node group.
	Name pulumi.StringPtrInput
	// The Ocean cluster identifier. Required for Launch Spec creation.
	OceanId pulumi.StringInput
	// The size of the OS disk in GB.
	OsDiskSizeGb pulumi.IntPtrInput
	// The type of the OS disk.
	OsDiskType pulumi.StringPtrInput
	// The OS SKU of the OS type. Must correlate with the os type.
	OsSku pulumi.StringPtrInput
	// The OS type of the OS disk. Can't be modified once set.
	OsType pulumi.StringPtrInput
	// The IDs of subnets in an existing VNet into which to assign pods in the cluster (requires azure network-plugin).
	PodSubnetIds pulumi.StringArrayInput
	// Percentage of spot VMs to maintain.
	SpotPercentage pulumi.IntPtrInput
	Tags           pulumi.MapInput
	// Add taints to a virtual node group.
	Taints       OceanNpVirtualNodeGroupTaintArrayInput
	UpdatePolicy OceanNpVirtualNodeGroupUpdatePolicyPtrInput
	// The IDs of subnets in an existing VNet into which to assign nodes in the cluster (requires azure network-plugin).
	VnetSubnetIds pulumi.StringArrayInput
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

// An Array holding Availability Zones, this configures the availability zones the Ocean may launch instances in per VNG.
func (o OceanNpVirtualNodeGroupOutput) AvailabilityZones() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) pulumi.StringArrayOutput { return v.AvailabilityZones }).(pulumi.StringArrayOutput)
}

// Enable node public IP.
func (o OceanNpVirtualNodeGroupOutput) EnableNodePublicIp() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) pulumi.BoolPtrOutput { return v.EnableNodePublicIp }).(pulumi.BoolPtrOutput)
}

// If no spot instance markets are available, enable Ocean to launch on-demand instances instead.
func (o OceanNpVirtualNodeGroupOutput) FallbackToOndemand() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) pulumi.BoolPtrOutput { return v.FallbackToOndemand }).(pulumi.BoolPtrOutput)
}

// Filters for the VM sizes that can be launched from the virtual node group.
func (o OceanNpVirtualNodeGroupOutput) Filters() OceanNpVirtualNodeGroupFiltersPtrOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) OceanNpVirtualNodeGroupFiltersPtrOutput { return v.Filters }).(OceanNpVirtualNodeGroupFiltersPtrOutput)
}

// Specify the custom headroom per VNG. Provide a list of headroom objects.
func (o OceanNpVirtualNodeGroupOutput) Headrooms() OceanNpVirtualNodeGroupHeadroomArrayOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) OceanNpVirtualNodeGroupHeadroomArrayOutput { return v.Headrooms }).(OceanNpVirtualNodeGroupHeadroomArrayOutput)
}

// The desired Kubernetes version of the launched nodes. In case the value is null, the Kubernetes version of the control plane is used.
func (o OceanNpVirtualNodeGroupOutput) KubernetesVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) pulumi.StringPtrOutput { return v.KubernetesVersion }).(pulumi.StringPtrOutput)
}

// An array of labels to add to the virtual node group.Only custom user labels are allowed, and not Kubernetes built-in labels or Spot internal labels.
func (o OceanNpVirtualNodeGroupOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

// Custom Linux OS configuration.
func (o OceanNpVirtualNodeGroupOutput) LinuxOsConfigs() OceanNpVirtualNodeGroupLinuxOsConfigArrayOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) OceanNpVirtualNodeGroupLinuxOsConfigArrayOutput {
		return v.LinuxOsConfigs
	}).(OceanNpVirtualNodeGroupLinuxOsConfigArrayOutput)
}

// Maximum node count limit.
func (o OceanNpVirtualNodeGroupOutput) MaxCount() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) pulumi.IntPtrOutput { return v.MaxCount }).(pulumi.IntPtrOutput)
}

// The maximum number of pods per node in the node pools.
func (o OceanNpVirtualNodeGroupOutput) MaxPodsPerNode() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) pulumi.IntPtrOutput { return v.MaxPodsPerNode }).(pulumi.IntPtrOutput)
}

// Minimum node count limit.
func (o OceanNpVirtualNodeGroupOutput) MinCount() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) pulumi.IntPtrOutput { return v.MinCount }).(pulumi.IntPtrOutput)
}

// Enter a name for the virtual node group.
func (o OceanNpVirtualNodeGroupOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The Ocean cluster identifier. Required for Launch Spec creation.
func (o OceanNpVirtualNodeGroupOutput) OceanId() pulumi.StringOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) pulumi.StringOutput { return v.OceanId }).(pulumi.StringOutput)
}

// The size of the OS disk in GB.
func (o OceanNpVirtualNodeGroupOutput) OsDiskSizeGb() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) pulumi.IntPtrOutput { return v.OsDiskSizeGb }).(pulumi.IntPtrOutput)
}

// The type of the OS disk.
func (o OceanNpVirtualNodeGroupOutput) OsDiskType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) pulumi.StringPtrOutput { return v.OsDiskType }).(pulumi.StringPtrOutput)
}

// The OS SKU of the OS type. Must correlate with the os type.
func (o OceanNpVirtualNodeGroupOutput) OsSku() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) pulumi.StringPtrOutput { return v.OsSku }).(pulumi.StringPtrOutput)
}

// The OS type of the OS disk. Can't be modified once set.
func (o OceanNpVirtualNodeGroupOutput) OsType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) pulumi.StringPtrOutput { return v.OsType }).(pulumi.StringPtrOutput)
}

// The IDs of subnets in an existing VNet into which to assign pods in the cluster (requires azure network-plugin).
func (o OceanNpVirtualNodeGroupOutput) PodSubnetIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) pulumi.StringArrayOutput { return v.PodSubnetIds }).(pulumi.StringArrayOutput)
}

// Percentage of spot VMs to maintain.
func (o OceanNpVirtualNodeGroupOutput) SpotPercentage() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) pulumi.IntPtrOutput { return v.SpotPercentage }).(pulumi.IntPtrOutput)
}

func (o OceanNpVirtualNodeGroupOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) pulumi.MapOutput { return v.Tags }).(pulumi.MapOutput)
}

// Add taints to a virtual node group.
func (o OceanNpVirtualNodeGroupOutput) Taints() OceanNpVirtualNodeGroupTaintArrayOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) OceanNpVirtualNodeGroupTaintArrayOutput { return v.Taints }).(OceanNpVirtualNodeGroupTaintArrayOutput)
}

func (o OceanNpVirtualNodeGroupOutput) UpdatePolicy() OceanNpVirtualNodeGroupUpdatePolicyPtrOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) OceanNpVirtualNodeGroupUpdatePolicyPtrOutput { return v.UpdatePolicy }).(OceanNpVirtualNodeGroupUpdatePolicyPtrOutput)
}

// The IDs of subnets in an existing VNet into which to assign nodes in the cluster (requires azure network-plugin).
func (o OceanNpVirtualNodeGroupOutput) VnetSubnetIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *OceanNpVirtualNodeGroup) pulumi.StringArrayOutput { return v.VnetSubnetIds }).(pulumi.StringArrayOutput)
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
