// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package aws

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a custom Spotinst Ocean AWS Launch Spec resource.
type OceanLaunchSpec struct {
	pulumi.CustomResourceState

	// Set custom headroom per launch spec. provide list of headrooms object.
	AutoscaleHeadrooms OceanLaunchSpecAutoscaleHeadroomArrayOutput `pulumi:"autoscaleHeadrooms"`
	// Assign an Elastic IP to the instances spun by the launch spec. Can be null.
	ElasticIpPools OceanLaunchSpecElasticIpPoolArrayOutput `pulumi:"elasticIpPools"`
	// The ARN or name of an IAM instance profile to associate with launched instances.
	IamInstanceProfile pulumi.StringPtrOutput `pulumi:"iamInstanceProfile"`
	// ID of the image used to launch the instances.
	ImageId pulumi.StringPtrOutput `pulumi:"imageId"`
	// Optionally adds labels to instances launched in an Ocean cluster.
	Labels OceanLaunchSpecLabelArrayOutput `pulumi:"labels"`
	// Set Launch Specification name
	Name pulumi.StringOutput `pulumi:"name"`
	// The ocean cluster you wish to
	OceanId        pulumi.StringOutput                     `pulumi:"oceanId"`
	ResourceLimits OceanLaunchSpecResourceLimitArrayOutput `pulumi:"resourceLimits"`
	// Set root volume size (in GB).
	RootVolumeSize pulumi.IntPtrOutput `pulumi:"rootVolumeSize"`
	// Optionally adds security group IDs.
	SecurityGroups pulumi.StringArrayOutput `pulumi:"securityGroups"`
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
	if args == nil || args.OceanId == nil {
		return nil, errors.New("missing required argument 'OceanId'")
	}
	if args == nil {
		args = &OceanLaunchSpecArgs{}
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
	// Set custom headroom per launch spec. provide list of headrooms object.
	AutoscaleHeadrooms []OceanLaunchSpecAutoscaleHeadroom `pulumi:"autoscaleHeadrooms"`
	// Assign an Elastic IP to the instances spun by the launch spec. Can be null.
	ElasticIpPools []OceanLaunchSpecElasticIpPool `pulumi:"elasticIpPools"`
	// The ARN or name of an IAM instance profile to associate with launched instances.
	IamInstanceProfile *string `pulumi:"iamInstanceProfile"`
	// ID of the image used to launch the instances.
	ImageId *string `pulumi:"imageId"`
	// Optionally adds labels to instances launched in an Ocean cluster.
	Labels []OceanLaunchSpecLabel `pulumi:"labels"`
	// Set Launch Specification name
	Name *string `pulumi:"name"`
	// The ocean cluster you wish to
	OceanId        *string                        `pulumi:"oceanId"`
	ResourceLimits []OceanLaunchSpecResourceLimit `pulumi:"resourceLimits"`
	// Set root volume size (in GB).
	RootVolumeSize *int `pulumi:"rootVolumeSize"`
	// Optionally adds security group IDs.
	SecurityGroups []string `pulumi:"securityGroups"`
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
	// Set custom headroom per launch spec. provide list of headrooms object.
	AutoscaleHeadrooms OceanLaunchSpecAutoscaleHeadroomArrayInput
	// Assign an Elastic IP to the instances spun by the launch spec. Can be null.
	ElasticIpPools OceanLaunchSpecElasticIpPoolArrayInput
	// The ARN or name of an IAM instance profile to associate with launched instances.
	IamInstanceProfile pulumi.StringPtrInput
	// ID of the image used to launch the instances.
	ImageId pulumi.StringPtrInput
	// Optionally adds labels to instances launched in an Ocean cluster.
	Labels OceanLaunchSpecLabelArrayInput
	// Set Launch Specification name
	Name pulumi.StringPtrInput
	// The ocean cluster you wish to
	OceanId        pulumi.StringPtrInput
	ResourceLimits OceanLaunchSpecResourceLimitArrayInput
	// Set root volume size (in GB).
	RootVolumeSize pulumi.IntPtrInput
	// Optionally adds security group IDs.
	SecurityGroups pulumi.StringArrayInput
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
	// Set custom headroom per launch spec. provide list of headrooms object.
	AutoscaleHeadrooms []OceanLaunchSpecAutoscaleHeadroom `pulumi:"autoscaleHeadrooms"`
	// Assign an Elastic IP to the instances spun by the launch spec. Can be null.
	ElasticIpPools []OceanLaunchSpecElasticIpPool `pulumi:"elasticIpPools"`
	// The ARN or name of an IAM instance profile to associate with launched instances.
	IamInstanceProfile *string `pulumi:"iamInstanceProfile"`
	// ID of the image used to launch the instances.
	ImageId *string `pulumi:"imageId"`
	// Optionally adds labels to instances launched in an Ocean cluster.
	Labels []OceanLaunchSpecLabel `pulumi:"labels"`
	// Set Launch Specification name
	Name *string `pulumi:"name"`
	// The ocean cluster you wish to
	OceanId        string                         `pulumi:"oceanId"`
	ResourceLimits []OceanLaunchSpecResourceLimit `pulumi:"resourceLimits"`
	// Set root volume size (in GB).
	RootVolumeSize *int `pulumi:"rootVolumeSize"`
	// Optionally adds security group IDs.
	SecurityGroups []string `pulumi:"securityGroups"`
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
	// Set custom headroom per launch spec. provide list of headrooms object.
	AutoscaleHeadrooms OceanLaunchSpecAutoscaleHeadroomArrayInput
	// Assign an Elastic IP to the instances spun by the launch spec. Can be null.
	ElasticIpPools OceanLaunchSpecElasticIpPoolArrayInput
	// The ARN or name of an IAM instance profile to associate with launched instances.
	IamInstanceProfile pulumi.StringPtrInput
	// ID of the image used to launch the instances.
	ImageId pulumi.StringPtrInput
	// Optionally adds labels to instances launched in an Ocean cluster.
	Labels OceanLaunchSpecLabelArrayInput
	// Set Launch Specification name
	Name pulumi.StringPtrInput
	// The ocean cluster you wish to
	OceanId        pulumi.StringInput
	ResourceLimits OceanLaunchSpecResourceLimitArrayInput
	// Set root volume size (in GB).
	RootVolumeSize pulumi.IntPtrInput
	// Optionally adds security group IDs.
	SecurityGroups pulumi.StringArrayInput
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
