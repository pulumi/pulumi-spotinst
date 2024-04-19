// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-spotinst/sdk/v3/go/spotinst/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a custom Spotinst Ocean ECS Launch Spec resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-spotinst/sdk/v3/go/spotinst/ecs"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := ecs.NewOceanLaunchSpec(ctx, "example", &ecs.OceanLaunchSpecArgs{
//				Attributes: ecs.OceanLaunchSpecAttributeArray{
//					&ecs.OceanLaunchSpecAttributeArgs{
//						Key:   pulumi.String("fakeKey"),
//						Value: pulumi.String("fakeValue"),
//					},
//				},
//				AutoscaleHeadrooms: ecs.OceanLaunchSpecAutoscaleHeadroomArray{
//					&ecs.OceanLaunchSpecAutoscaleHeadroomArgs{
//						CpuPerUnit:    pulumi.Int(1000),
//						MemoryPerUnit: pulumi.Int(2048),
//						NumOfUnits:    pulumi.Int(5),
//					},
//				},
//				BlockDeviceMappings: ecs.OceanLaunchSpecBlockDeviceMappingArray{
//					&ecs.OceanLaunchSpecBlockDeviceMappingArgs{
//						DeviceName: pulumi.String("/dev/xvda1"),
//						Ebs: &ecs.OceanLaunchSpecBlockDeviceMappingEbsArgs{
//							DeleteOnTermination: pulumi.Bool(true),
//							DynamicVolumeSize: &ecs.OceanLaunchSpecBlockDeviceMappingEbsDynamicVolumeSizeArgs{
//								BaseSize:            pulumi.Int(50),
//								Resource:            pulumi.String("CPU"),
//								SizePerResourceUnit: pulumi.Int(20),
//							},
//							Encrypted:  pulumi.Bool(false),
//							Throughput: pulumi.Int(500),
//							VolumeSize: pulumi.Int(50),
//							VolumeType: pulumi.String("gp2"),
//						},
//					},
//				},
//				IamInstanceProfile: pulumi.String("iam-profile"),
//				ImageId:            pulumi.String("ami-123456"),
//				Images: ecs.OceanLaunchSpecImageArray{
//					&ecs.OceanLaunchSpecImageArgs{
//						ImageId: pulumi.String("ami-12345"),
//					},
//					&ecs.OceanLaunchSpecImageArgs{
//						ImageId: pulumi.String("ami-67890"),
//					},
//				},
//				InstanceMetadataOptions: &ecs.OceanLaunchSpecInstanceMetadataOptionsArgs{
//					HttpPutResponseHopLimit: pulumi.Int(10),
//					HttpTokens:              pulumi.String("required"),
//				},
//				InstanceTypes: pulumi.StringArray{
//					pulumi.String("m3.large"),
//					pulumi.String("m3.xlarge"),
//					pulumi.String("m3.2xlarge"),
//					pulumi.String("m4.large"),
//					pulumi.String("m4.xlarge"),
//					pulumi.String("m4.4xlarge"),
//					pulumi.String("m4.2xlarge"),
//					pulumi.String("m4.10xlarge"),
//					pulumi.String("m4.16xlarge"),
//					pulumi.String("m5.large"),
//					pulumi.String("m5.xlarge"),
//					pulumi.String("m5.2xlarge"),
//					pulumi.String("m5.4xlarge"),
//					pulumi.String("m5.12xlarge"),
//					pulumi.String("m5.24xlarge"),
//				},
//				OceanId: pulumi.String("o-123456"),
//				PreferredSpotTypes: pulumi.StringArray{
//					pulumi.String("m3.large"),
//					pulumi.String("m3.xlarge"),
//					pulumi.String("m3.2xlarge"),
//					pulumi.String("m4.large"),
//					pulumi.String("m4.xlarge"),
//				},
//				RestrictScaleDown: pulumi.Bool(true),
//				SchedulingTasks: ecs.OceanLaunchSpecSchedulingTaskArray{
//					&ecs.OceanLaunchSpecSchedulingTaskArgs{
//						CronExpression: pulumi.String("0 1 * * *"),
//						IsEnabled:      pulumi.Bool(true),
//						TaskHeadrooms: ecs.OceanLaunchSpecSchedulingTaskTaskHeadroomArray{
//							&ecs.OceanLaunchSpecSchedulingTaskTaskHeadroomArgs{
//								CpuPerUnit:    pulumi.Int(1000),
//								MemoryPerUnit: pulumi.Int(2048),
//								NumOfUnits:    pulumi.Int(5),
//							},
//						},
//						TaskType: pulumi.String("manualHeadroomUpdate"),
//					},
//				},
//				SecurityGroupIds: pulumi.StringArray{
//					pulumi.String("awseb-12345"),
//				},
//				Strategies: ecs.OceanLaunchSpecStrategyArray{
//					&ecs.OceanLaunchSpecStrategyArgs{
//						SpotPercentage: pulumi.Int(50),
//					},
//				},
//				SubnetIds: pulumi.StringArray{
//					pulumi.String("subnet-12345"),
//				},
//				Tags: ecs.OceanLaunchSpecTagArray{
//					&ecs.OceanLaunchSpecTagArgs{
//						Key:   pulumi.String("Env"),
//						Value: pulumi.String("production"),
//					},
//				},
//				UserData: pulumi.String("echo hello world"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Block Devices
//
// * `blockDeviceMappings`- (Optional) Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
//   - `deviceName` - (Optional) String. Set device name. (Example: "/dev/xvda1").
//   - `ebs`- (Optional) Object. Set Elastic Block Store properties .
//   - `deleteOnTermination`- (Optional) Boolean. Flag to delete the EBS on instance termination.
//   - `encrypted`- (Optional) Boolean. Enables [EBS encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html) on the volume.
//   - `iops`- (Required for requests to create io1 volumes; it is not used in requests to create gp2, st1, sc1, or standard volumes) Int. The number of I/O operations per second (IOPS) that the volume supports.
//   - `kmsKeyId`- (Optional) String. Identifier (key ID, key alias, ID ARN, or alias ARN) for a customer managed CMK under which the EBS volume is encrypted.
//   - `snapshotId`- (Optional) (Optional) String. The Snapshot ID to mount by.
//   - `volumeType`- (Optional, Default: `"standard"`) String. The type of the volume (example: "gp2").
//   - `volumeSize`- (Optional) Int. The size, in GB of the volume.
//   - `throughput`- (Optional) The amount of data transferred to or from a storage device per second, you can use this param just in a case that `volumeType` = gp3.
//   - `dynamicVolumeSize`- (Optional) Object. Set dynamic volume size properties. When using this object, you cannot use volumeSize. You must use one or the other.
//   - `baseSize`- (Required) Int. Initial size for volume. (Example: 50)
//   - `resource`- (Required) String. Resource type to increase volume size dynamically by. (valid values: "CPU")
//   - `sizePerResourceUnit`- (Required) Int. Additional size (in GB) per resource unit. (Example: baseSize= 50, sizePerResourceUnit=20, and instance with 2 CPU is launched - its total disk size will be: 90GB)
//   - `noDevice`- (Optional) String. suppresses the specified device included in the block device mapping of the AMI.
type OceanLaunchSpec struct {
	pulumi.CustomResourceState

	// Optionally adds labels to instances launched in an Ocean cluster.
	Attributes OceanLaunchSpecAttributeArrayOutput `pulumi:"attributes"`
	// Set custom headroom per launch spec. provide list of headrooms object.
	AutoscaleHeadrooms  OceanLaunchSpecAutoscaleHeadroomArrayOutput  `pulumi:"autoscaleHeadrooms"`
	BlockDeviceMappings OceanLaunchSpecBlockDeviceMappingArrayOutput `pulumi:"blockDeviceMappings"`
	// The ARN or name of an IAM instance profile to associate with launched instances.
	IamInstanceProfile pulumi.StringPtrOutput `pulumi:"iamInstanceProfile"`
	// Identifier of the image in AWS. Valid values: any string which is not empty or null.
	ImageId pulumi.StringPtrOutput `pulumi:"imageId"`
	// You can configure VNG with either the imageId or images objects, but not both simultaneously. For each architecture type (amd64, arm64) only one AMI is allowed. Valid values: null, or an array with at least one element
	Images OceanLaunchSpecImageArrayOutput `pulumi:"images"`
	// Ocean instance metadata options object for IMDSv2.
	InstanceMetadataOptions OceanLaunchSpecInstanceMetadataOptionsPtrOutput `pulumi:"instanceMetadataOptions"`
	// A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the Ocean cluster.
	InstanceTypes pulumi.StringArrayOutput `pulumi:"instanceTypes"`
	// The Ocean Launch Specification name.
	Name pulumi.StringOutput `pulumi:"name"`
	// The Ocean cluster ID .
	OceanId pulumi.StringOutput `pulumi:"oceanId"`
	// When Ocean scales up instances, it takes your preferred types into consideration while maintaining a variety of machine types running for optimized distribution.
	PreferredSpotTypes pulumi.StringArrayOutput `pulumi:"preferredSpotTypes"`
	// Boolean. When set to “True”, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
	RestrictScaleDown pulumi.BoolPtrOutput `pulumi:"restrictScaleDown"`
	// Used to define scheduled tasks such as a manual headroom update.
	SchedulingTasks OceanLaunchSpecSchedulingTaskArrayOutput `pulumi:"schedulingTasks"`
	// One or more security group ids.
	SecurityGroupIds pulumi.StringArrayOutput `pulumi:"securityGroupIds"`
	// Similar to a strategy for an Ocean cluster, but applying only to a virtual node group.
	Strategies OceanLaunchSpecStrategyArrayOutput `pulumi:"strategies"`
	// Set subnets in launchSpec. Each element in the array should be a subnet ID.
	SubnetIds pulumi.StringArrayOutput `pulumi:"subnetIds"`
	// A key/value mapping of tags to assign to the resource.
	Tags OceanLaunchSpecTagArrayOutput `pulumi:"tags"`
	// Base64-encoded MIME user data to make available to the instances.
	UserData pulumi.StringPtrOutput `pulumi:"userData"`
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
	err := ctx.RegisterResource("spotinst:ecs/oceanLaunchSpec:OceanLaunchSpec", name, args, &resource, opts...)
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
	err := ctx.ReadResource("spotinst:ecs/oceanLaunchSpec:OceanLaunchSpec", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OceanLaunchSpec resources.
type oceanLaunchSpecState struct {
	// Optionally adds labels to instances launched in an Ocean cluster.
	Attributes []OceanLaunchSpecAttribute `pulumi:"attributes"`
	// Set custom headroom per launch spec. provide list of headrooms object.
	AutoscaleHeadrooms  []OceanLaunchSpecAutoscaleHeadroom  `pulumi:"autoscaleHeadrooms"`
	BlockDeviceMappings []OceanLaunchSpecBlockDeviceMapping `pulumi:"blockDeviceMappings"`
	// The ARN or name of an IAM instance profile to associate with launched instances.
	IamInstanceProfile *string `pulumi:"iamInstanceProfile"`
	// Identifier of the image in AWS. Valid values: any string which is not empty or null.
	ImageId *string `pulumi:"imageId"`
	// You can configure VNG with either the imageId or images objects, but not both simultaneously. For each architecture type (amd64, arm64) only one AMI is allowed. Valid values: null, or an array with at least one element
	Images []OceanLaunchSpecImage `pulumi:"images"`
	// Ocean instance metadata options object for IMDSv2.
	InstanceMetadataOptions *OceanLaunchSpecInstanceMetadataOptions `pulumi:"instanceMetadataOptions"`
	// A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the Ocean cluster.
	InstanceTypes []string `pulumi:"instanceTypes"`
	// The Ocean Launch Specification name.
	Name *string `pulumi:"name"`
	// The Ocean cluster ID .
	OceanId *string `pulumi:"oceanId"`
	// When Ocean scales up instances, it takes your preferred types into consideration while maintaining a variety of machine types running for optimized distribution.
	PreferredSpotTypes []string `pulumi:"preferredSpotTypes"`
	// Boolean. When set to “True”, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
	RestrictScaleDown *bool `pulumi:"restrictScaleDown"`
	// Used to define scheduled tasks such as a manual headroom update.
	SchedulingTasks []OceanLaunchSpecSchedulingTask `pulumi:"schedulingTasks"`
	// One or more security group ids.
	SecurityGroupIds []string `pulumi:"securityGroupIds"`
	// Similar to a strategy for an Ocean cluster, but applying only to a virtual node group.
	Strategies []OceanLaunchSpecStrategy `pulumi:"strategies"`
	// Set subnets in launchSpec. Each element in the array should be a subnet ID.
	SubnetIds []string `pulumi:"subnetIds"`
	// A key/value mapping of tags to assign to the resource.
	Tags []OceanLaunchSpecTag `pulumi:"tags"`
	// Base64-encoded MIME user data to make available to the instances.
	UserData *string `pulumi:"userData"`
}

type OceanLaunchSpecState struct {
	// Optionally adds labels to instances launched in an Ocean cluster.
	Attributes OceanLaunchSpecAttributeArrayInput
	// Set custom headroom per launch spec. provide list of headrooms object.
	AutoscaleHeadrooms  OceanLaunchSpecAutoscaleHeadroomArrayInput
	BlockDeviceMappings OceanLaunchSpecBlockDeviceMappingArrayInput
	// The ARN or name of an IAM instance profile to associate with launched instances.
	IamInstanceProfile pulumi.StringPtrInput
	// Identifier of the image in AWS. Valid values: any string which is not empty or null.
	ImageId pulumi.StringPtrInput
	// You can configure VNG with either the imageId or images objects, but not both simultaneously. For each architecture type (amd64, arm64) only one AMI is allowed. Valid values: null, or an array with at least one element
	Images OceanLaunchSpecImageArrayInput
	// Ocean instance metadata options object for IMDSv2.
	InstanceMetadataOptions OceanLaunchSpecInstanceMetadataOptionsPtrInput
	// A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the Ocean cluster.
	InstanceTypes pulumi.StringArrayInput
	// The Ocean Launch Specification name.
	Name pulumi.StringPtrInput
	// The Ocean cluster ID .
	OceanId pulumi.StringPtrInput
	// When Ocean scales up instances, it takes your preferred types into consideration while maintaining a variety of machine types running for optimized distribution.
	PreferredSpotTypes pulumi.StringArrayInput
	// Boolean. When set to “True”, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
	RestrictScaleDown pulumi.BoolPtrInput
	// Used to define scheduled tasks such as a manual headroom update.
	SchedulingTasks OceanLaunchSpecSchedulingTaskArrayInput
	// One or more security group ids.
	SecurityGroupIds pulumi.StringArrayInput
	// Similar to a strategy for an Ocean cluster, but applying only to a virtual node group.
	Strategies OceanLaunchSpecStrategyArrayInput
	// Set subnets in launchSpec. Each element in the array should be a subnet ID.
	SubnetIds pulumi.StringArrayInput
	// A key/value mapping of tags to assign to the resource.
	Tags OceanLaunchSpecTagArrayInput
	// Base64-encoded MIME user data to make available to the instances.
	UserData pulumi.StringPtrInput
}

func (OceanLaunchSpecState) ElementType() reflect.Type {
	return reflect.TypeOf((*oceanLaunchSpecState)(nil)).Elem()
}

type oceanLaunchSpecArgs struct {
	// Optionally adds labels to instances launched in an Ocean cluster.
	Attributes []OceanLaunchSpecAttribute `pulumi:"attributes"`
	// Set custom headroom per launch spec. provide list of headrooms object.
	AutoscaleHeadrooms  []OceanLaunchSpecAutoscaleHeadroom  `pulumi:"autoscaleHeadrooms"`
	BlockDeviceMappings []OceanLaunchSpecBlockDeviceMapping `pulumi:"blockDeviceMappings"`
	// The ARN or name of an IAM instance profile to associate with launched instances.
	IamInstanceProfile *string `pulumi:"iamInstanceProfile"`
	// Identifier of the image in AWS. Valid values: any string which is not empty or null.
	ImageId *string `pulumi:"imageId"`
	// You can configure VNG with either the imageId or images objects, but not both simultaneously. For each architecture type (amd64, arm64) only one AMI is allowed. Valid values: null, or an array with at least one element
	Images []OceanLaunchSpecImage `pulumi:"images"`
	// Ocean instance metadata options object for IMDSv2.
	InstanceMetadataOptions *OceanLaunchSpecInstanceMetadataOptions `pulumi:"instanceMetadataOptions"`
	// A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the Ocean cluster.
	InstanceTypes []string `pulumi:"instanceTypes"`
	// The Ocean Launch Specification name.
	Name *string `pulumi:"name"`
	// The Ocean cluster ID .
	OceanId string `pulumi:"oceanId"`
	// When Ocean scales up instances, it takes your preferred types into consideration while maintaining a variety of machine types running for optimized distribution.
	PreferredSpotTypes []string `pulumi:"preferredSpotTypes"`
	// Boolean. When set to “True”, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
	RestrictScaleDown *bool `pulumi:"restrictScaleDown"`
	// Used to define scheduled tasks such as a manual headroom update.
	SchedulingTasks []OceanLaunchSpecSchedulingTask `pulumi:"schedulingTasks"`
	// One or more security group ids.
	SecurityGroupIds []string `pulumi:"securityGroupIds"`
	// Similar to a strategy for an Ocean cluster, but applying only to a virtual node group.
	Strategies []OceanLaunchSpecStrategy `pulumi:"strategies"`
	// Set subnets in launchSpec. Each element in the array should be a subnet ID.
	SubnetIds []string `pulumi:"subnetIds"`
	// A key/value mapping of tags to assign to the resource.
	Tags []OceanLaunchSpecTag `pulumi:"tags"`
	// Base64-encoded MIME user data to make available to the instances.
	UserData *string `pulumi:"userData"`
}

// The set of arguments for constructing a OceanLaunchSpec resource.
type OceanLaunchSpecArgs struct {
	// Optionally adds labels to instances launched in an Ocean cluster.
	Attributes OceanLaunchSpecAttributeArrayInput
	// Set custom headroom per launch spec. provide list of headrooms object.
	AutoscaleHeadrooms  OceanLaunchSpecAutoscaleHeadroomArrayInput
	BlockDeviceMappings OceanLaunchSpecBlockDeviceMappingArrayInput
	// The ARN or name of an IAM instance profile to associate with launched instances.
	IamInstanceProfile pulumi.StringPtrInput
	// Identifier of the image in AWS. Valid values: any string which is not empty or null.
	ImageId pulumi.StringPtrInput
	// You can configure VNG with either the imageId or images objects, but not both simultaneously. For each architecture type (amd64, arm64) only one AMI is allowed. Valid values: null, or an array with at least one element
	Images OceanLaunchSpecImageArrayInput
	// Ocean instance metadata options object for IMDSv2.
	InstanceMetadataOptions OceanLaunchSpecInstanceMetadataOptionsPtrInput
	// A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the Ocean cluster.
	InstanceTypes pulumi.StringArrayInput
	// The Ocean Launch Specification name.
	Name pulumi.StringPtrInput
	// The Ocean cluster ID .
	OceanId pulumi.StringInput
	// When Ocean scales up instances, it takes your preferred types into consideration while maintaining a variety of machine types running for optimized distribution.
	PreferredSpotTypes pulumi.StringArrayInput
	// Boolean. When set to “True”, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
	RestrictScaleDown pulumi.BoolPtrInput
	// Used to define scheduled tasks such as a manual headroom update.
	SchedulingTasks OceanLaunchSpecSchedulingTaskArrayInput
	// One or more security group ids.
	SecurityGroupIds pulumi.StringArrayInput
	// Similar to a strategy for an Ocean cluster, but applying only to a virtual node group.
	Strategies OceanLaunchSpecStrategyArrayInput
	// Set subnets in launchSpec. Each element in the array should be a subnet ID.
	SubnetIds pulumi.StringArrayInput
	// A key/value mapping of tags to assign to the resource.
	Tags OceanLaunchSpecTagArrayInput
	// Base64-encoded MIME user data to make available to the instances.
	UserData pulumi.StringPtrInput
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

// Optionally adds labels to instances launched in an Ocean cluster.
func (o OceanLaunchSpecOutput) Attributes() OceanLaunchSpecAttributeArrayOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) OceanLaunchSpecAttributeArrayOutput { return v.Attributes }).(OceanLaunchSpecAttributeArrayOutput)
}

// Set custom headroom per launch spec. provide list of headrooms object.
func (o OceanLaunchSpecOutput) AutoscaleHeadrooms() OceanLaunchSpecAutoscaleHeadroomArrayOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) OceanLaunchSpecAutoscaleHeadroomArrayOutput { return v.AutoscaleHeadrooms }).(OceanLaunchSpecAutoscaleHeadroomArrayOutput)
}

func (o OceanLaunchSpecOutput) BlockDeviceMappings() OceanLaunchSpecBlockDeviceMappingArrayOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) OceanLaunchSpecBlockDeviceMappingArrayOutput { return v.BlockDeviceMappings }).(OceanLaunchSpecBlockDeviceMappingArrayOutput)
}

// The ARN or name of an IAM instance profile to associate with launched instances.
func (o OceanLaunchSpecOutput) IamInstanceProfile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) pulumi.StringPtrOutput { return v.IamInstanceProfile }).(pulumi.StringPtrOutput)
}

// Identifier of the image in AWS. Valid values: any string which is not empty or null.
func (o OceanLaunchSpecOutput) ImageId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) pulumi.StringPtrOutput { return v.ImageId }).(pulumi.StringPtrOutput)
}

// You can configure VNG with either the imageId or images objects, but not both simultaneously. For each architecture type (amd64, arm64) only one AMI is allowed. Valid values: null, or an array with at least one element
func (o OceanLaunchSpecOutput) Images() OceanLaunchSpecImageArrayOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) OceanLaunchSpecImageArrayOutput { return v.Images }).(OceanLaunchSpecImageArrayOutput)
}

// Ocean instance metadata options object for IMDSv2.
func (o OceanLaunchSpecOutput) InstanceMetadataOptions() OceanLaunchSpecInstanceMetadataOptionsPtrOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) OceanLaunchSpecInstanceMetadataOptionsPtrOutput {
		return v.InstanceMetadataOptions
	}).(OceanLaunchSpecInstanceMetadataOptionsPtrOutput)
}

// A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the Ocean cluster.
func (o OceanLaunchSpecOutput) InstanceTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) pulumi.StringArrayOutput { return v.InstanceTypes }).(pulumi.StringArrayOutput)
}

// The Ocean Launch Specification name.
func (o OceanLaunchSpecOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The Ocean cluster ID .
func (o OceanLaunchSpecOutput) OceanId() pulumi.StringOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) pulumi.StringOutput { return v.OceanId }).(pulumi.StringOutput)
}

// When Ocean scales up instances, it takes your preferred types into consideration while maintaining a variety of machine types running for optimized distribution.
func (o OceanLaunchSpecOutput) PreferredSpotTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) pulumi.StringArrayOutput { return v.PreferredSpotTypes }).(pulumi.StringArrayOutput)
}

// Boolean. When set to “True”, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
func (o OceanLaunchSpecOutput) RestrictScaleDown() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) pulumi.BoolPtrOutput { return v.RestrictScaleDown }).(pulumi.BoolPtrOutput)
}

// Used to define scheduled tasks such as a manual headroom update.
func (o OceanLaunchSpecOutput) SchedulingTasks() OceanLaunchSpecSchedulingTaskArrayOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) OceanLaunchSpecSchedulingTaskArrayOutput { return v.SchedulingTasks }).(OceanLaunchSpecSchedulingTaskArrayOutput)
}

// One or more security group ids.
func (o OceanLaunchSpecOutput) SecurityGroupIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) pulumi.StringArrayOutput { return v.SecurityGroupIds }).(pulumi.StringArrayOutput)
}

// Similar to a strategy for an Ocean cluster, but applying only to a virtual node group.
func (o OceanLaunchSpecOutput) Strategies() OceanLaunchSpecStrategyArrayOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) OceanLaunchSpecStrategyArrayOutput { return v.Strategies }).(OceanLaunchSpecStrategyArrayOutput)
}

// Set subnets in launchSpec. Each element in the array should be a subnet ID.
func (o OceanLaunchSpecOutput) SubnetIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) pulumi.StringArrayOutput { return v.SubnetIds }).(pulumi.StringArrayOutput)
}

// A key/value mapping of tags to assign to the resource.
func (o OceanLaunchSpecOutput) Tags() OceanLaunchSpecTagArrayOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) OceanLaunchSpecTagArrayOutput { return v.Tags }).(OceanLaunchSpecTagArrayOutput)
}

// Base64-encoded MIME user data to make available to the instances.
func (o OceanLaunchSpecOutput) UserData() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OceanLaunchSpec) pulumi.StringPtrOutput { return v.UserData }).(pulumi.StringPtrOutput)
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
