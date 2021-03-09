// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package aws

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Manages a custom Spotinst Ocean AWS Launch Spec resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-spotinst/sdk/v2/go/spotinst/aws"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
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
// 			BlockDeviceMappings: aws.OceanLaunchSpecBlockDeviceMappingArray{
// 				&aws.OceanLaunchSpecBlockDeviceMappingArgs{
// 					DeviceName: pulumi.String("/dev/xvda1"),
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
// 				pulumi.String("m3.large"),
// 				pulumi.String("m3.xlarge"),
// 				pulumi.String("m3.2xlarge"),
// 				pulumi.String("m4.large"),
// 				pulumi.String("m4.xlarge"),
// 				pulumi.String("m4.4xlarge"),
// 				pulumi.String("m4.2xlarge"),
// 				pulumi.String("m4.10xlarge"),
// 				pulumi.String("m4.16xlarge"),
// 				pulumi.String("m5.large"),
// 				pulumi.String("m5.xlarge"),
// 				pulumi.String("m5.2xlarge"),
// 				pulumi.String("m5.4xlarge"),
// 				pulumi.String("m5.12xlarge"),
// 				pulumi.String("m5.24xlarge"),
// 			},
// 			Labels: aws.OceanLaunchSpecLabelArray{
// 				&aws.OceanLaunchSpecLabelArgs{
// 					Key:   pulumi.String("fakeKey"),
// 					Value: pulumi.String("fakeValue"),
// 				},
// 			},
// 			OceanId: pulumi.String("o-123456"),
// 			ResourceLimits: aws.OceanLaunchSpecResourceLimitArray{
// 				&aws.OceanLaunchSpecResourceLimitArgs{
// 					MaxInstanceCount: pulumi.Int(4),
// 				},
// 			},
// 			RestrictScaleDown: pulumi.Bool(true),
// 			RootVolumeSize:    pulumi.Int(30),
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
// 					Key:    pulumi.String("taint key updated"),
// 					Value:  pulumi.String("taint value updated"),
// 				},
// 			},
// 			UserData: pulumi.String("echo hello world"),
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
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		ctx.Export("oceanLaunchspecId", spotinst_ocean_aws_launch_spec.Example.Id)
// 		return nil
// 	})
// }
// ```
type OceanLaunchSpec struct {
	pulumi.CustomResourceState

	// Configure public IP address allocation.
	AssociatePublicIpAddress pulumi.BoolPtrOutput `pulumi:"associatePublicIpAddress"`
	// Set custom headroom per launch spec. provide list of headrooms object.
	AutoscaleHeadrooms OceanLaunchSpecAutoscaleHeadroomArrayOutput `pulumi:"autoscaleHeadrooms"`
	// Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
	BlockDeviceMappings OceanLaunchSpecBlockDeviceMappingArrayOutput `pulumi:"blockDeviceMappings"`
	// Assign an Elastic IP to the instances spun by the launch spec. Can be null.
	ElasticIpPools OceanLaunchSpecElasticIpPoolArrayOutput `pulumi:"elasticIpPools"`
	// The ARN or name of an IAM instance profile to associate with launched instances.
	IamInstanceProfile pulumi.StringPtrOutput `pulumi:"iamInstanceProfile"`
	// ID of the image used to launch the instances.
	ImageId pulumi.StringPtrOutput `pulumi:"imageId"`
	// A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the Ocean cluster.
	InstanceTypes pulumi.StringArrayOutput `pulumi:"instanceTypes"`
	// Optionally adds labels to instances launched in an Ocean cluster.
	Labels OceanLaunchSpecLabelArrayOutput `pulumi:"labels"`
	// Set Launch Specification name
	Name pulumi.StringOutput `pulumi:"name"`
	// The ocean cluster you wish to
	OceanId        pulumi.StringOutput                     `pulumi:"oceanId"`
	ResourceLimits OceanLaunchSpecResourceLimitArrayOutput `pulumi:"resourceLimits"`
	// Boolean. When set to "True", VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
	RestrictScaleDown pulumi.BoolPtrOutput `pulumi:"restrictScaleDown"`
	// Set root volume size (in GB).
	RootVolumeSize pulumi.IntPtrOutput `pulumi:"rootVolumeSize"`
	// Optionally adds security group IDs.
	SecurityGroups pulumi.StringArrayOutput           `pulumi:"securityGroups"`
	Strategies     OceanLaunchSpecStrategyArrayOutput `pulumi:"strategies"`
	// Set subnets in launchSpec. Each element in array should be subnet ID.
	SubnetIds pulumi.StringArrayOutput `pulumi:"subnetIds"`
	// A key/value mapping of tags to assign to the resource.
	Tags OceanLaunchSpecTagArrayOutput `pulumi:"tags"`
	// Optionally adds labels to instances launched in an Ocean cluster.
	Taints OceanLaunchSpecTaintArrayOutput `pulumi:"taints"`
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
	// Set custom headroom per launch spec. provide list of headrooms object.
	AutoscaleHeadrooms []OceanLaunchSpecAutoscaleHeadroom `pulumi:"autoscaleHeadrooms"`
	// Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
	BlockDeviceMappings []OceanLaunchSpecBlockDeviceMapping `pulumi:"blockDeviceMappings"`
	// Assign an Elastic IP to the instances spun by the launch spec. Can be null.
	ElasticIpPools []OceanLaunchSpecElasticIpPool `pulumi:"elasticIpPools"`
	// The ARN or name of an IAM instance profile to associate with launched instances.
	IamInstanceProfile *string `pulumi:"iamInstanceProfile"`
	// ID of the image used to launch the instances.
	ImageId *string `pulumi:"imageId"`
	// A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the Ocean cluster.
	InstanceTypes []string `pulumi:"instanceTypes"`
	// Optionally adds labels to instances launched in an Ocean cluster.
	Labels []OceanLaunchSpecLabel `pulumi:"labels"`
	// Set Launch Specification name
	Name *string `pulumi:"name"`
	// The ocean cluster you wish to
	OceanId        *string                        `pulumi:"oceanId"`
	ResourceLimits []OceanLaunchSpecResourceLimit `pulumi:"resourceLimits"`
	// Boolean. When set to "True", VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
	RestrictScaleDown *bool `pulumi:"restrictScaleDown"`
	// Set root volume size (in GB).
	RootVolumeSize *int `pulumi:"rootVolumeSize"`
	// Optionally adds security group IDs.
	SecurityGroups []string                  `pulumi:"securityGroups"`
	Strategies     []OceanLaunchSpecStrategy `pulumi:"strategies"`
	// Set subnets in launchSpec. Each element in array should be subnet ID.
	SubnetIds []string `pulumi:"subnetIds"`
	// A key/value mapping of tags to assign to the resource.
	Tags []OceanLaunchSpecTag `pulumi:"tags"`
	// Optionally adds labels to instances launched in an Ocean cluster.
	Taints []OceanLaunchSpecTaint `pulumi:"taints"`
	// Base64-encoded MIME user data to make available to the instances.
	UserData *string `pulumi:"userData"`
}

type OceanLaunchSpecState struct {
	// Configure public IP address allocation.
	AssociatePublicIpAddress pulumi.BoolPtrInput
	// Set custom headroom per launch spec. provide list of headrooms object.
	AutoscaleHeadrooms OceanLaunchSpecAutoscaleHeadroomArrayInput
	// Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
	BlockDeviceMappings OceanLaunchSpecBlockDeviceMappingArrayInput
	// Assign an Elastic IP to the instances spun by the launch spec. Can be null.
	ElasticIpPools OceanLaunchSpecElasticIpPoolArrayInput
	// The ARN or name of an IAM instance profile to associate with launched instances.
	IamInstanceProfile pulumi.StringPtrInput
	// ID of the image used to launch the instances.
	ImageId pulumi.StringPtrInput
	// A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the Ocean cluster.
	InstanceTypes pulumi.StringArrayInput
	// Optionally adds labels to instances launched in an Ocean cluster.
	Labels OceanLaunchSpecLabelArrayInput
	// Set Launch Specification name
	Name pulumi.StringPtrInput
	// The ocean cluster you wish to
	OceanId        pulumi.StringPtrInput
	ResourceLimits OceanLaunchSpecResourceLimitArrayInput
	// Boolean. When set to "True", VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
	RestrictScaleDown pulumi.BoolPtrInput
	// Set root volume size (in GB).
	RootVolumeSize pulumi.IntPtrInput
	// Optionally adds security group IDs.
	SecurityGroups pulumi.StringArrayInput
	Strategies     OceanLaunchSpecStrategyArrayInput
	// Set subnets in launchSpec. Each element in array should be subnet ID.
	SubnetIds pulumi.StringArrayInput
	// A key/value mapping of tags to assign to the resource.
	Tags OceanLaunchSpecTagArrayInput
	// Optionally adds labels to instances launched in an Ocean cluster.
	Taints OceanLaunchSpecTaintArrayInput
	// Base64-encoded MIME user data to make available to the instances.
	UserData pulumi.StringPtrInput
}

func (OceanLaunchSpecState) ElementType() reflect.Type {
	return reflect.TypeOf((*oceanLaunchSpecState)(nil)).Elem()
}

type oceanLaunchSpecArgs struct {
	// Configure public IP address allocation.
	AssociatePublicIpAddress *bool `pulumi:"associatePublicIpAddress"`
	// Set custom headroom per launch spec. provide list of headrooms object.
	AutoscaleHeadrooms []OceanLaunchSpecAutoscaleHeadroom `pulumi:"autoscaleHeadrooms"`
	// Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
	BlockDeviceMappings []OceanLaunchSpecBlockDeviceMapping `pulumi:"blockDeviceMappings"`
	// Assign an Elastic IP to the instances spun by the launch spec. Can be null.
	ElasticIpPools []OceanLaunchSpecElasticIpPool `pulumi:"elasticIpPools"`
	// The ARN or name of an IAM instance profile to associate with launched instances.
	IamInstanceProfile *string `pulumi:"iamInstanceProfile"`
	// ID of the image used to launch the instances.
	ImageId *string `pulumi:"imageId"`
	// A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the Ocean cluster.
	InstanceTypes []string `pulumi:"instanceTypes"`
	// Optionally adds labels to instances launched in an Ocean cluster.
	Labels []OceanLaunchSpecLabel `pulumi:"labels"`
	// Set Launch Specification name
	Name *string `pulumi:"name"`
	// The ocean cluster you wish to
	OceanId        string                         `pulumi:"oceanId"`
	ResourceLimits []OceanLaunchSpecResourceLimit `pulumi:"resourceLimits"`
	// Boolean. When set to "True", VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
	RestrictScaleDown *bool `pulumi:"restrictScaleDown"`
	// Set root volume size (in GB).
	RootVolumeSize *int `pulumi:"rootVolumeSize"`
	// Optionally adds security group IDs.
	SecurityGroups []string                  `pulumi:"securityGroups"`
	Strategies     []OceanLaunchSpecStrategy `pulumi:"strategies"`
	// Set subnets in launchSpec. Each element in array should be subnet ID.
	SubnetIds []string `pulumi:"subnetIds"`
	// A key/value mapping of tags to assign to the resource.
	Tags []OceanLaunchSpecTag `pulumi:"tags"`
	// Optionally adds labels to instances launched in an Ocean cluster.
	Taints []OceanLaunchSpecTaint `pulumi:"taints"`
	// Base64-encoded MIME user data to make available to the instances.
	UserData *string `pulumi:"userData"`
}

// The set of arguments for constructing a OceanLaunchSpec resource.
type OceanLaunchSpecArgs struct {
	// Configure public IP address allocation.
	AssociatePublicIpAddress pulumi.BoolPtrInput
	// Set custom headroom per launch spec. provide list of headrooms object.
	AutoscaleHeadrooms OceanLaunchSpecAutoscaleHeadroomArrayInput
	// Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
	BlockDeviceMappings OceanLaunchSpecBlockDeviceMappingArrayInput
	// Assign an Elastic IP to the instances spun by the launch spec. Can be null.
	ElasticIpPools OceanLaunchSpecElasticIpPoolArrayInput
	// The ARN or name of an IAM instance profile to associate with launched instances.
	IamInstanceProfile pulumi.StringPtrInput
	// ID of the image used to launch the instances.
	ImageId pulumi.StringPtrInput
	// A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the Ocean cluster.
	InstanceTypes pulumi.StringArrayInput
	// Optionally adds labels to instances launched in an Ocean cluster.
	Labels OceanLaunchSpecLabelArrayInput
	// Set Launch Specification name
	Name pulumi.StringPtrInput
	// The ocean cluster you wish to
	OceanId        pulumi.StringInput
	ResourceLimits OceanLaunchSpecResourceLimitArrayInput
	// Boolean. When set to "True", VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
	RestrictScaleDown pulumi.BoolPtrInput
	// Set root volume size (in GB).
	RootVolumeSize pulumi.IntPtrInput
	// Optionally adds security group IDs.
	SecurityGroups pulumi.StringArrayInput
	Strategies     OceanLaunchSpecStrategyArrayInput
	// Set subnets in launchSpec. Each element in array should be subnet ID.
	SubnetIds pulumi.StringArrayInput
	// A key/value mapping of tags to assign to the resource.
	Tags OceanLaunchSpecTagArrayInput
	// Optionally adds labels to instances launched in an Ocean cluster.
	Taints OceanLaunchSpecTaintArrayInput
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
	return reflect.TypeOf(([]*OceanLaunchSpec)(nil))
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
	return reflect.TypeOf((map[string]*OceanLaunchSpec)(nil))
}

func (i OceanLaunchSpecMap) ToOceanLaunchSpecMapOutput() OceanLaunchSpecMapOutput {
	return i.ToOceanLaunchSpecMapOutputWithContext(context.Background())
}

func (i OceanLaunchSpecMap) ToOceanLaunchSpecMapOutputWithContext(ctx context.Context) OceanLaunchSpecMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OceanLaunchSpecMapOutput)
}

type OceanLaunchSpecOutput struct {
	*pulumi.OutputState
}

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
	return o.ApplyT(func(v OceanLaunchSpec) *OceanLaunchSpec {
		return &v
	}).(OceanLaunchSpecPtrOutput)
}

type OceanLaunchSpecPtrOutput struct {
	*pulumi.OutputState
}

func (OceanLaunchSpecPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OceanLaunchSpec)(nil))
}

func (o OceanLaunchSpecPtrOutput) ToOceanLaunchSpecPtrOutput() OceanLaunchSpecPtrOutput {
	return o
}

func (o OceanLaunchSpecPtrOutput) ToOceanLaunchSpecPtrOutputWithContext(ctx context.Context) OceanLaunchSpecPtrOutput {
	return o
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
	pulumi.RegisterOutputType(OceanLaunchSpecOutput{})
	pulumi.RegisterOutputType(OceanLaunchSpecPtrOutput{})
	pulumi.RegisterOutputType(OceanLaunchSpecArrayOutput{})
	pulumi.RegisterOutputType(OceanLaunchSpecMapOutput{})
}
