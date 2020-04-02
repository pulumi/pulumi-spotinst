// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package aws

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a custom Spotinst Ocean AWS Launch Spec resource.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-spotinst/blob/master/website/docs/r/ocean_aws_launch_spec.html.markdown.
type OceanLaunchSpec struct {
	pulumi.CustomResourceState

	// Set custom headroom per launch spec. provide list of headrooms object.
	AutoscaleHeadrooms OceanLaunchSpecAutoscaleHeadroomArrayOutput `pulumi:"autoscaleHeadrooms"`
	// The ARN or name of an IAM instance profile to associate with launched instances.
	IamInstanceProfile pulumi.StringPtrOutput `pulumi:"iamInstanceProfile"`
	// ID of the image used to launch the instances.
	ImageId pulumi.StringPtrOutput `pulumi:"imageId"`
	// Optionally adds labels to instances launched in an Ocean cluster.
	Labels OceanLaunchSpecLabelArrayOutput `pulumi:"labels"`
	// The ocean cluster you wish to
	OceanId pulumi.StringOutput `pulumi:"oceanId"`
	// Set root volume size (in GB).
	RootVolumeSize pulumi.IntPtrOutput `pulumi:"rootVolumeSize"`
	// Optionally adds security group IDs.
	SecurityGroups pulumi.StringArrayOutput `pulumi:"securityGroups"`
	// Set subnets in launchSpec. Each element in array should be subnet ID.
	SubnetIds pulumi.StringArrayOutput `pulumi:"subnetIds"`
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
	// The ARN or name of an IAM instance profile to associate with launched instances.
	IamInstanceProfile *string `pulumi:"iamInstanceProfile"`
	// ID of the image used to launch the instances.
	ImageId *string `pulumi:"imageId"`
	// Optionally adds labels to instances launched in an Ocean cluster.
	Labels []OceanLaunchSpecLabel `pulumi:"labels"`
	// The ocean cluster you wish to
	OceanId *string `pulumi:"oceanId"`
	// Set root volume size (in GB).
	RootVolumeSize *int `pulumi:"rootVolumeSize"`
	// Optionally adds security group IDs.
	SecurityGroups []string `pulumi:"securityGroups"`
	// Set subnets in launchSpec. Each element in array should be subnet ID.
	SubnetIds []string `pulumi:"subnetIds"`
	// Optionally adds labels to instances launched in an Ocean cluster.
	Taints []OceanLaunchSpecTaint `pulumi:"taints"`
	// Base64-encoded MIME user data to make available to the instances.
	UserData *string `pulumi:"userData"`
}

type OceanLaunchSpecState struct {
	// Set custom headroom per launch spec. provide list of headrooms object.
	AutoscaleHeadrooms OceanLaunchSpecAutoscaleHeadroomArrayInput
	// The ARN or name of an IAM instance profile to associate with launched instances.
	IamInstanceProfile pulumi.StringPtrInput
	// ID of the image used to launch the instances.
	ImageId pulumi.StringPtrInput
	// Optionally adds labels to instances launched in an Ocean cluster.
	Labels OceanLaunchSpecLabelArrayInput
	// The ocean cluster you wish to
	OceanId pulumi.StringPtrInput
	// Set root volume size (in GB).
	RootVolumeSize pulumi.IntPtrInput
	// Optionally adds security group IDs.
	SecurityGroups pulumi.StringArrayInput
	// Set subnets in launchSpec. Each element in array should be subnet ID.
	SubnetIds pulumi.StringArrayInput
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
	// The ARN or name of an IAM instance profile to associate with launched instances.
	IamInstanceProfile *string `pulumi:"iamInstanceProfile"`
	// ID of the image used to launch the instances.
	ImageId *string `pulumi:"imageId"`
	// Optionally adds labels to instances launched in an Ocean cluster.
	Labels []OceanLaunchSpecLabel `pulumi:"labels"`
	// The ocean cluster you wish to
	OceanId string `pulumi:"oceanId"`
	// Set root volume size (in GB).
	RootVolumeSize *int `pulumi:"rootVolumeSize"`
	// Optionally adds security group IDs.
	SecurityGroups []string `pulumi:"securityGroups"`
	// Set subnets in launchSpec. Each element in array should be subnet ID.
	SubnetIds []string `pulumi:"subnetIds"`
	// Optionally adds labels to instances launched in an Ocean cluster.
	Taints []OceanLaunchSpecTaint `pulumi:"taints"`
	// Base64-encoded MIME user data to make available to the instances.
	UserData *string `pulumi:"userData"`
}

// The set of arguments for constructing a OceanLaunchSpec resource.
type OceanLaunchSpecArgs struct {
	// Set custom headroom per launch spec. provide list of headrooms object.
	AutoscaleHeadrooms OceanLaunchSpecAutoscaleHeadroomArrayInput
	// The ARN or name of an IAM instance profile to associate with launched instances.
	IamInstanceProfile pulumi.StringPtrInput
	// ID of the image used to launch the instances.
	ImageId pulumi.StringPtrInput
	// Optionally adds labels to instances launched in an Ocean cluster.
	Labels OceanLaunchSpecLabelArrayInput
	// The ocean cluster you wish to
	OceanId pulumi.StringInput
	// Set root volume size (in GB).
	RootVolumeSize pulumi.IntPtrInput
	// Optionally adds security group IDs.
	SecurityGroups pulumi.StringArrayInput
	// Set subnets in launchSpec. Each element in array should be subnet ID.
	SubnetIds pulumi.StringArrayInput
	// Optionally adds labels to instances launched in an Ocean cluster.
	Taints OceanLaunchSpecTaintArrayInput
	// Base64-encoded MIME user data to make available to the instances.
	UserData pulumi.StringPtrInput
}

func (OceanLaunchSpecArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*oceanLaunchSpecArgs)(nil)).Elem()
}
