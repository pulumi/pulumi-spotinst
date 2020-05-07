// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a custom Spotinst Ocean ECS Launch Spec resource.
type OceanLaunchSpec struct {
	pulumi.CustomResourceState

	// Optionally adds labels to instances launched in an Ocean cluster.
	Attributes OceanLaunchSpecAttributeArrayOutput `pulumi:"attributes"`
	// Set custom headroom per launch spec. provide list of headrooms object.
	AutoscaleHeadrooms OceanLaunchSpecAutoscaleHeadroomArrayOutput `pulumi:"autoscaleHeadrooms"`
	// The ARN or name of an IAM instance profile to associate with launched instances.
	IamInstanceProfile pulumi.StringPtrOutput `pulumi:"iamInstanceProfile"`
	// ID of the image used to launch the instances.
	ImageId pulumi.StringPtrOutput `pulumi:"imageId"`
	// The Ocean Launch Specification name.
	Name pulumi.StringOutput `pulumi:"name"`
	// The Ocean cluster ID .
	OceanId pulumi.StringOutput `pulumi:"oceanId"`
	// One or more security group ids.
	SecurityGroupIds pulumi.StringArrayOutput `pulumi:"securityGroupIds"`
	// A key/value mapping of tags to assign to the resource.
	Tags OceanLaunchSpecTagArrayOutput `pulumi:"tags"`
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
	AutoscaleHeadrooms []OceanLaunchSpecAutoscaleHeadroom `pulumi:"autoscaleHeadrooms"`
	// The ARN or name of an IAM instance profile to associate with launched instances.
	IamInstanceProfile *string `pulumi:"iamInstanceProfile"`
	// ID of the image used to launch the instances.
	ImageId *string `pulumi:"imageId"`
	// The Ocean Launch Specification name.
	Name *string `pulumi:"name"`
	// The Ocean cluster ID .
	OceanId *string `pulumi:"oceanId"`
	// One or more security group ids.
	SecurityGroupIds []string `pulumi:"securityGroupIds"`
	// A key/value mapping of tags to assign to the resource.
	Tags []OceanLaunchSpecTag `pulumi:"tags"`
	// Base64-encoded MIME user data to make available to the instances.
	UserData *string `pulumi:"userData"`
}

type OceanLaunchSpecState struct {
	// Optionally adds labels to instances launched in an Ocean cluster.
	Attributes OceanLaunchSpecAttributeArrayInput
	// Set custom headroom per launch spec. provide list of headrooms object.
	AutoscaleHeadrooms OceanLaunchSpecAutoscaleHeadroomArrayInput
	// The ARN or name of an IAM instance profile to associate with launched instances.
	IamInstanceProfile pulumi.StringPtrInput
	// ID of the image used to launch the instances.
	ImageId pulumi.StringPtrInput
	// The Ocean Launch Specification name.
	Name pulumi.StringPtrInput
	// The Ocean cluster ID .
	OceanId pulumi.StringPtrInput
	// One or more security group ids.
	SecurityGroupIds pulumi.StringArrayInput
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
	AutoscaleHeadrooms []OceanLaunchSpecAutoscaleHeadroom `pulumi:"autoscaleHeadrooms"`
	// The ARN or name of an IAM instance profile to associate with launched instances.
	IamInstanceProfile *string `pulumi:"iamInstanceProfile"`
	// ID of the image used to launch the instances.
	ImageId *string `pulumi:"imageId"`
	// The Ocean Launch Specification name.
	Name *string `pulumi:"name"`
	// The Ocean cluster ID .
	OceanId string `pulumi:"oceanId"`
	// One or more security group ids.
	SecurityGroupIds []string `pulumi:"securityGroupIds"`
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
	AutoscaleHeadrooms OceanLaunchSpecAutoscaleHeadroomArrayInput
	// The ARN or name of an IAM instance profile to associate with launched instances.
	IamInstanceProfile pulumi.StringPtrInput
	// ID of the image used to launch the instances.
	ImageId pulumi.StringPtrInput
	// The Ocean Launch Specification name.
	Name pulumi.StringPtrInput
	// The Ocean cluster ID .
	OceanId pulumi.StringInput
	// One or more security group ids.
	SecurityGroupIds pulumi.StringArrayInput
	// A key/value mapping of tags to assign to the resource.
	Tags OceanLaunchSpecTagArrayInput
	// Base64-encoded MIME user data to make available to the instances.
	UserData pulumi.StringPtrInput
}

func (OceanLaunchSpecArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*oceanLaunchSpecArgs)(nil)).Elem()
}
