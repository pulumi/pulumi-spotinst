// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package aws

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Spotinst Ocean AWS [Virtual Node Group](https://docs.spot.io/ocean/features/launch-specifications) resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-spotinst/sdk/v3/go/spotinst/aws"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := aws.NewOceanLaunchSpec(ctx, "example", &aws.OceanLaunchSpecArgs{
// 			AssociatePublicIpAddress: pulumi.Bool(true),
// 			AutoscaleHeadrooms: aws.OceanLaunchSpecAutoscaleHeadroomArray{
// 				&aws.OceanLaunchSpecAutoscaleHeadroomArgs{
// 					CpuPerUnit:    pulumi.Int(1000),
// 					GpuPerUnit:    pulumi.Int(0),
// 					MemoryPerUnit: pulumi.Int(2048),
// 					NumOfUnits:    pulumi.Int(5),
// 				},
// 			},
// 			AutoscaleHeadroomsAutomatics: aws.OceanLaunchSpecAutoscaleHeadroomsAutomaticArray{
// 				&aws.OceanLaunchSpecAutoscaleHeadroomsAutomaticArgs{
// 					AutoHeadroomPercentage: pulumi.Int(5),
// 				},
// 			},
// 			BlockDeviceMappings: aws.OceanLaunchSpecBlockDeviceMappingArray{
// 				&aws.OceanLaunchSpecBlockDeviceMappingArgs{
// 					DeviceName: pulumi.String("/dev/xvda"),
// 					Ebs: &aws.OceanLaunchSpecBlockDeviceMappingEbsArgs{
// 						DeleteOnTermination: pulumi.Bool(true),
// 						DynamicVolumeSize: &aws.OceanLaunchSpecBlockDeviceMappingEbsDynamicVolumeSizeArgs{
// 							BaseSize:            pulumi.Int(50),
// 							Resource:            pulumi.String("CPU"),
// 							SizePerResourceUnit: pulumi.Int(20),
// 						},
// 						Encrypted:  pulumi.Bool(false),
// 						Throughput: pulumi.Int(500),
// 						VolumeSize: pulumi.Int(50),
// 						VolumeType: pulumi.String("gp2"),
// 					},
// 				},
// 			},
// 			CreateOptions: &aws.OceanLaunchSpecCreateOptionsArgs{
// 				InitialNodes: pulumi.Int(1),
// 			},
// 			DeleteOptions: &aws.OceanLaunchSpecDeleteOptionsArgs{
// 				ForceDelete: pulumi.Bool(true),
// 			},
// 			ElasticIpPools: aws.OceanLaunchSpecElasticIpPoolArray{
// 				&aws.OceanLaunchSpecElasticIpPoolArgs{
// 					TagSelector: &aws.OceanLaunchSpecElasticIpPoolTagSelectorArgs{
// 						TagKey:   pulumi.String("key"),
// 						TagValue: pulumi.String("value"),
// 					},
// 				},
// 			},
// 			IamInstanceProfile: pulumi.String("iam-profile"),
// 			ImageId:            pulumi.String("ami-123456"),
// 			InstanceTypes: pulumi.StringArray{
// 				pulumi.String("m4.large"),
// 				pulumi.String("m4.xlarge"),
// 				pulumi.String("m4.2xlarge"),
// 				pulumi.String("m4.4xlarge"),
// 			},
// 			Labels: aws.OceanLaunchSpecLabelArray{
// 				&aws.OceanLaunchSpecLabelArgs{
// 					Key:   pulumi.String("key1"),
// 					Value: pulumi.String("value1"),
// 				},
// 			},
// 			OceanId: pulumi.String("o-123456"),
// 			PreferredSpotTypes: pulumi.StringArray{
// 				pulumi.String("m4.large"),
// 				pulumi.String("m4.xlarge"),
// 			},
// 			ResourceLimits: aws.OceanLaunchSpecResourceLimitArray{
// 				&aws.OceanLaunchSpecResourceLimitArgs{
// 					MaxInstanceCount: pulumi.Int(4),
// 					MinInstanceCount: pulumi.Int(0),
// 				},
// 			},
// 			RestrictScaleDown: pulumi.Bool(true),
// 			RootVolumeSize:    pulumi.Int(30),
// 			SchedulingShutdownHours: &aws.OceanLaunchSpecSchedulingShutdownHoursArgs{
// 				IsEnabled: pulumi.Bool(true),
// 				TimeWindows: pulumi.StringArray{
// 					pulumi.String("Sat:08:00-Sat:08:30"),
// 					pulumi.String("Sun:08:00-Sun:08:30"),
// 				},
// 			},
// 			SchedulingTasks: aws.OceanLaunchSpecSchedulingTaskArray{
// 				&aws.OceanLaunchSpecSchedulingTaskArgs{
// 					CronExpression: pulumi.String("0 1 * * *"),
// 					IsEnabled:      pulumi.Bool(true),
// 					TaskHeadrooms: aws.OceanLaunchSpecSchedulingTaskTaskHeadroomArray{
// 						&aws.OceanLaunchSpecSchedulingTaskTaskHeadroomArgs{
// 							CpuPerUnit:    pulumi.Int(1000),
// 							GpuPerUnit:    pulumi.Int(0),
// 							MemoryPerUnit: pulumi.Int(2048),
// 							NumOfUnits:    pulumi.Int(5),
// 						},
// 					},
// 					TaskType: pulumi.String("manualHeadroomUpdate"),
// 				},
// 			},
// 			SecurityGroups: pulumi.StringArray{
// 				pulumi.String("sg-987654321"),
// 			},
// 			Strategies: aws.OceanLaunchSpecStrategyArray{
// 				&aws.OceanLaunchSpecStrategyArgs{
// 					SpotPercentage: pulumi.Int(70),
// 				},
// 			},
// 			SubnetIds: pulumi.StringArray{
// 				pulumi.String("subnet-1234"),
// 			},
// 			Tags: aws.OceanLaunchSpecTagArray{
// 				&aws.OceanLaunchSpecTagArgs{
// 					Key:   pulumi.String("Env"),
// 					Value: pulumi.String("production"),
// 				},
// 			},
// 			Taints: aws.OceanLaunchSpecTaintArray{
// 				&aws.OceanLaunchSpecTaintArgs{
// 					Effect: pulumi.String("NoExecute"),
// 					Key:    pulumi.String("key1"),
// 					Value:  pulumi.String("value1"),
// 				},
// 			},
// 			UserData: pulumi.String("echo Hello, world!"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		ctx.Export("oceanLaunchspecId", spotinst_ocean_aws_launch_spec.Example.Id)
// 		return nil
// 	})
// }
// ```
// ## Update Policy
//
// * `updatePolicy` - (Optional)
//     * `shouldRoll` - (Required) Enables the roll.
//     * `rollConfig` - (Required) Holds the roll configuration.
//         * `batchSizePercentage` - (Required) Sets the percentage of the instances to deploy in each batch.
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

	// Configure public IP address allocation.
	AssociatePublicIpAddress pulumi.BoolPtrOutput `pulumi:"associatePublicIpAddress"`
	// Set custom headroom per Virtual Node Group. Provide a list of headrooms object.
	AutoscaleHeadrooms OceanLaunchSpecAutoscaleHeadroomArrayOutput `pulumi:"autoscaleHeadrooms"`
	// Set automatic headroom per launch spec.
	AutoscaleHeadroomsAutomatics OceanLaunchSpecAutoscaleHeadroomsAutomaticArrayOutput `pulumi:"autoscaleHeadroomsAutomatics"`
	// Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
	BlockDeviceMappings OceanLaunchSpecBlockDeviceMappingArrayOutput `pulumi:"blockDeviceMappings"`
	CreateOptions       OceanLaunchSpecCreateOptionsPtrOutput        `pulumi:"createOptions"`
	DeleteOptions       OceanLaunchSpecDeleteOptionsPtrOutput        `pulumi:"deleteOptions"`
	// Assign an Elastic IP to the instances spun by the Virtual Node Group. Can be null.
	ElasticIpPools OceanLaunchSpecElasticIpPoolArrayOutput `pulumi:"elasticIpPools"`
	// The ARN or name of an IAM instance profile to associate with launched instances.
	IamInstanceProfile pulumi.StringPtrOutput `pulumi:"iamInstanceProfile"`
	// ID of the image used to launch the instances.
	ImageId pulumi.StringPtrOutput `pulumi:"imageId"`
	// A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the cluster.
	InstanceTypes pulumi.StringArrayOutput `pulumi:"instanceTypes"`
	// Optionally adds labels to instances launched in the cluster.
	Labels OceanLaunchSpecLabelArrayOutput `pulumi:"labels"`
	// The name of the Virtual Node Group.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the Ocean cluster.
	OceanId pulumi.StringOutput `pulumi:"oceanId"`
	// A list of instance types. Takes the preferred types into consideration while maintaining a variety of machine types running for optimized distribution.
	PreferredSpotTypes pulumi.StringArrayOutput                `pulumi:"preferredSpotTypes"`
	ResourceLimits     OceanLaunchSpecResourceLimitArrayOutput `pulumi:"resourceLimits"`
	// Boolean. When set to `True`, nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
	RestrictScaleDown pulumi.BoolPtrOutput `pulumi:"restrictScaleDown"`
	// Set root volume size (in GB).
	RootVolumeSize pulumi.IntPtrOutput `pulumi:"rootVolumeSize"`
	// Used to specify times that the nodes in the virtual node group will be taken down.
	SchedulingShutdownHours OceanLaunchSpecSchedulingShutdownHoursPtrOutput `pulumi:"schedulingShutdownHours"`
	// Used to define scheduled tasks such as a manual headroom update.
	SchedulingTasks OceanLaunchSpecSchedulingTaskArrayOutput `pulumi:"schedulingTasks"`
	// Optionally adds security group IDs.
	SecurityGroups pulumi.StringArrayOutput           `pulumi:"securityGroups"`
	Strategies     OceanLaunchSpecStrategyArrayOutput `pulumi:"strategies"`
	// A list of subnet IDs.
	SubnetIds pulumi.StringArrayOutput `pulumi:"subnetIds"`
	// A key/value mapping of tags to assign to the resource.
	Tags OceanLaunchSpecTagArrayOutput `pulumi:"tags"`
	// Optionally adds labels to instances launched in the cluster.
	Taints       OceanLaunchSpecTaintArrayOutput      `pulumi:"taints"`
	UpdatePolicy OceanLaunchSpecUpdatePolicyPtrOutput `pulumi:"updatePolicy"`
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
	var resource OceanLaunchSpec
	err := ctx.RegisterResource("spotinst:aws/oceanLaunchSpec:OceanLaunchSpec", name, args, &resource, opts...)
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
	err := ctx.ReadResource("spotinst:aws/oceanLaunchSpec:OceanLaunchSpec", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OceanLaunchSpec resources.
type oceanLaunchSpecState struct {
	// Configure public IP address allocation.
	AssociatePublicIpAddress *bool `pulumi:"associatePublicIpAddress"`
	// Set custom headroom per Virtual Node Group. Provide a list of headrooms object.
	AutoscaleHeadrooms []OceanLaunchSpecAutoscaleHeadroom `pulumi:"autoscaleHeadrooms"`
	// Set automatic headroom per launch spec.
	AutoscaleHeadroomsAutomatics []OceanLaunchSpecAutoscaleHeadroomsAutomatic `pulumi:"autoscaleHeadroomsAutomatics"`
	// Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
	BlockDeviceMappings []OceanLaunchSpecBlockDeviceMapping `pulumi:"blockDeviceMappings"`
	CreateOptions       *OceanLaunchSpecCreateOptions       `pulumi:"createOptions"`
	DeleteOptions       *OceanLaunchSpecDeleteOptions       `pulumi:"deleteOptions"`
	// Assign an Elastic IP to the instances spun by the Virtual Node Group. Can be null.
	ElasticIpPools []OceanLaunchSpecElasticIpPool `pulumi:"elasticIpPools"`
	// The ARN or name of an IAM instance profile to associate with launched instances.
	IamInstanceProfile *string `pulumi:"iamInstanceProfile"`
	// ID of the image used to launch the instances.
	ImageId *string `pulumi:"imageId"`
	// A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the cluster.
	InstanceTypes []string `pulumi:"instanceTypes"`
	// Optionally adds labels to instances launched in the cluster.
	Labels []OceanLaunchSpecLabel `pulumi:"labels"`
	// The name of the Virtual Node Group.
	Name *string `pulumi:"name"`
	// The ID of the Ocean cluster.
	OceanId *string `pulumi:"oceanId"`
	// A list of instance types. Takes the preferred types into consideration while maintaining a variety of machine types running for optimized distribution.
	PreferredSpotTypes []string                       `pulumi:"preferredSpotTypes"`
	ResourceLimits     []OceanLaunchSpecResourceLimit `pulumi:"resourceLimits"`
	// Boolean. When set to `True`, nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
	RestrictScaleDown *bool `pulumi:"restrictScaleDown"`
	// Set root volume size (in GB).
	RootVolumeSize *int `pulumi:"rootVolumeSize"`
	// Used to specify times that the nodes in the virtual node group will be taken down.
	SchedulingShutdownHours *OceanLaunchSpecSchedulingShutdownHours `pulumi:"schedulingShutdownHours"`
	// Used to define scheduled tasks such as a manual headroom update.
	SchedulingTasks []OceanLaunchSpecSchedulingTask `pulumi:"schedulingTasks"`
	// Optionally adds security group IDs.
	SecurityGroups []string                  `pulumi:"securityGroups"`
	Strategies     []OceanLaunchSpecStrategy `pulumi:"strategies"`
	// A list of subnet IDs.
	SubnetIds []string `pulumi:"subnetIds"`
	// A key/value mapping of tags to assign to the resource.
	Tags []OceanLaunchSpecTag `pulumi:"tags"`
	// Optionally adds labels to instances launched in the cluster.
	Taints       []OceanLaunchSpecTaint       `pulumi:"taints"`
	UpdatePolicy *OceanLaunchSpecUpdatePolicy `pulumi:"updatePolicy"`
	// Base64-encoded MIME user data to make available to the instances.
	UserData *string `pulumi:"userData"`
}

type OceanLaunchSpecState struct {
	// Configure public IP address allocation.
	AssociatePublicIpAddress pulumi.BoolPtrInput
	// Set custom headroom per Virtual Node Group. Provide a list of headrooms object.
	AutoscaleHeadrooms OceanLaunchSpecAutoscaleHeadroomArrayInput
	// Set automatic headroom per launch spec.
	AutoscaleHeadroomsAutomatics OceanLaunchSpecAutoscaleHeadroomsAutomaticArrayInput
	// Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
	BlockDeviceMappings OceanLaunchSpecBlockDeviceMappingArrayInput
	CreateOptions       OceanLaunchSpecCreateOptionsPtrInput
	DeleteOptions       OceanLaunchSpecDeleteOptionsPtrInput
	// Assign an Elastic IP to the instances spun by the Virtual Node Group. Can be null.
	ElasticIpPools OceanLaunchSpecElasticIpPoolArrayInput
	// The ARN or name of an IAM instance profile to associate with launched instances.
	IamInstanceProfile pulumi.StringPtrInput
	// ID of the image used to launch the instances.
	ImageId pulumi.StringPtrInput
	// A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the cluster.
	InstanceTypes pulumi.StringArrayInput
	// Optionally adds labels to instances launched in the cluster.
	Labels OceanLaunchSpecLabelArrayInput
	// The name of the Virtual Node Group.
	Name pulumi.StringPtrInput
	// The ID of the Ocean cluster.
	OceanId pulumi.StringPtrInput
	// A list of instance types. Takes the preferred types into consideration while maintaining a variety of machine types running for optimized distribution.
	PreferredSpotTypes pulumi.StringArrayInput
	ResourceLimits     OceanLaunchSpecResourceLimitArrayInput
	// Boolean. When set to `True`, nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
	RestrictScaleDown pulumi.BoolPtrInput
	// Set root volume size (in GB).
	RootVolumeSize pulumi.IntPtrInput
	// Used to specify times that the nodes in the virtual node group will be taken down.
	SchedulingShutdownHours OceanLaunchSpecSchedulingShutdownHoursPtrInput
	// Used to define scheduled tasks such as a manual headroom update.
	SchedulingTasks OceanLaunchSpecSchedulingTaskArrayInput
	// Optionally adds security group IDs.
	SecurityGroups pulumi.StringArrayInput
	Strategies     OceanLaunchSpecStrategyArrayInput
	// A list of subnet IDs.
	SubnetIds pulumi.StringArrayInput
	// A key/value mapping of tags to assign to the resource.
	Tags OceanLaunchSpecTagArrayInput
	// Optionally adds labels to instances launched in the cluster.
	Taints       OceanLaunchSpecTaintArrayInput
	UpdatePolicy OceanLaunchSpecUpdatePolicyPtrInput
	// Base64-encoded MIME user data to make available to the instances.
	UserData pulumi.StringPtrInput
}

func (OceanLaunchSpecState) ElementType() reflect.Type {
	return reflect.TypeOf((*oceanLaunchSpecState)(nil)).Elem()
}

type oceanLaunchSpecArgs struct {
	// Configure public IP address allocation.
	AssociatePublicIpAddress *bool `pulumi:"associatePublicIpAddress"`
	// Set custom headroom per Virtual Node Group. Provide a list of headrooms object.
	AutoscaleHeadrooms []OceanLaunchSpecAutoscaleHeadroom `pulumi:"autoscaleHeadrooms"`
	// Set automatic headroom per launch spec.
	AutoscaleHeadroomsAutomatics []OceanLaunchSpecAutoscaleHeadroomsAutomatic `pulumi:"autoscaleHeadroomsAutomatics"`
	// Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
	BlockDeviceMappings []OceanLaunchSpecBlockDeviceMapping `pulumi:"blockDeviceMappings"`
	CreateOptions       *OceanLaunchSpecCreateOptions       `pulumi:"createOptions"`
	DeleteOptions       *OceanLaunchSpecDeleteOptions       `pulumi:"deleteOptions"`
	// Assign an Elastic IP to the instances spun by the Virtual Node Group. Can be null.
	ElasticIpPools []OceanLaunchSpecElasticIpPool `pulumi:"elasticIpPools"`
	// The ARN or name of an IAM instance profile to associate with launched instances.
	IamInstanceProfile *string `pulumi:"iamInstanceProfile"`
	// ID of the image used to launch the instances.
	ImageId *string `pulumi:"imageId"`
	// A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the cluster.
	InstanceTypes []string `pulumi:"instanceTypes"`
	// Optionally adds labels to instances launched in the cluster.
	Labels []OceanLaunchSpecLabel `pulumi:"labels"`
	// The name of the Virtual Node Group.
	Name *string `pulumi:"name"`
	// The ID of the Ocean cluster.
	OceanId string `pulumi:"oceanId"`
	// A list of instance types. Takes the preferred types into consideration while maintaining a variety of machine types running for optimized distribution.
	PreferredSpotTypes []string                       `pulumi:"preferredSpotTypes"`
	ResourceLimits     []OceanLaunchSpecResourceLimit `pulumi:"resourceLimits"`
	// Boolean. When set to `True`, nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
	RestrictScaleDown *bool `pulumi:"restrictScaleDown"`
	// Set root volume size (in GB).
	RootVolumeSize *int `pulumi:"rootVolumeSize"`
	// Used to specify times that the nodes in the virtual node group will be taken down.
	SchedulingShutdownHours *OceanLaunchSpecSchedulingShutdownHours `pulumi:"schedulingShutdownHours"`
	// Used to define scheduled tasks such as a manual headroom update.
	SchedulingTasks []OceanLaunchSpecSchedulingTask `pulumi:"schedulingTasks"`
	// Optionally adds security group IDs.
	SecurityGroups []string                  `pulumi:"securityGroups"`
	Strategies     []OceanLaunchSpecStrategy `pulumi:"strategies"`
	// A list of subnet IDs.
	SubnetIds []string `pulumi:"subnetIds"`
	// A key/value mapping of tags to assign to the resource.
	Tags []OceanLaunchSpecTag `pulumi:"tags"`
	// Optionally adds labels to instances launched in the cluster.
	Taints       []OceanLaunchSpecTaint       `pulumi:"taints"`
	UpdatePolicy *OceanLaunchSpecUpdatePolicy `pulumi:"updatePolicy"`
	// Base64-encoded MIME user data to make available to the instances.
	UserData *string `pulumi:"userData"`
}

// The set of arguments for constructing a OceanLaunchSpec resource.
type OceanLaunchSpecArgs struct {
	// Configure public IP address allocation.
	AssociatePublicIpAddress pulumi.BoolPtrInput
	// Set custom headroom per Virtual Node Group. Provide a list of headrooms object.
	AutoscaleHeadrooms OceanLaunchSpecAutoscaleHeadroomArrayInput
	// Set automatic headroom per launch spec.
	AutoscaleHeadroomsAutomatics OceanLaunchSpecAutoscaleHeadroomsAutomaticArrayInput
	// Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
	BlockDeviceMappings OceanLaunchSpecBlockDeviceMappingArrayInput
	CreateOptions       OceanLaunchSpecCreateOptionsPtrInput
	DeleteOptions       OceanLaunchSpecDeleteOptionsPtrInput
	// Assign an Elastic IP to the instances spun by the Virtual Node Group. Can be null.
	ElasticIpPools OceanLaunchSpecElasticIpPoolArrayInput
	// The ARN or name of an IAM instance profile to associate with launched instances.
	IamInstanceProfile pulumi.StringPtrInput
	// ID of the image used to launch the instances.
	ImageId pulumi.StringPtrInput
	// A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the cluster.
	InstanceTypes pulumi.StringArrayInput
	// Optionally adds labels to instances launched in the cluster.
	Labels OceanLaunchSpecLabelArrayInput
	// The name of the Virtual Node Group.
	Name pulumi.StringPtrInput
	// The ID of the Ocean cluster.
	OceanId pulumi.StringInput
	// A list of instance types. Takes the preferred types into consideration while maintaining a variety of machine types running for optimized distribution.
	PreferredSpotTypes pulumi.StringArrayInput
	ResourceLimits     OceanLaunchSpecResourceLimitArrayInput
	// Boolean. When set to `True`, nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
	RestrictScaleDown pulumi.BoolPtrInput
	// Set root volume size (in GB).
	RootVolumeSize pulumi.IntPtrInput
	// Used to specify times that the nodes in the virtual node group will be taken down.
	SchedulingShutdownHours OceanLaunchSpecSchedulingShutdownHoursPtrInput
	// Used to define scheduled tasks such as a manual headroom update.
	SchedulingTasks OceanLaunchSpecSchedulingTaskArrayInput
	// Optionally adds security group IDs.
	SecurityGroups pulumi.StringArrayInput
	Strategies     OceanLaunchSpecStrategyArrayInput
	// A list of subnet IDs.
	SubnetIds pulumi.StringArrayInput
	// A key/value mapping of tags to assign to the resource.
	Tags OceanLaunchSpecTagArrayInput
	// Optionally adds labels to instances launched in the cluster.
	Taints       OceanLaunchSpecTaintArrayInput
	UpdatePolicy OceanLaunchSpecUpdatePolicyPtrInput
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
	return reflect.TypeOf((**OceanLaunchSpec)(nil)).Elem()
}

func (o OceanLaunchSpecOutput) ToOceanLaunchSpecOutput() OceanLaunchSpecOutput {
	return o
}

func (o OceanLaunchSpecOutput) ToOceanLaunchSpecOutputWithContext(ctx context.Context) OceanLaunchSpecOutput {
	return o
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
