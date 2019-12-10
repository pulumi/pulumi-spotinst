// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a custom Spotinst Ocean ECS Launch Spec resource.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-spotinst/blob/master/website/docs/r/ocean_ecs_launch_spec.html.markdown.
type OceanLaunchSpec struct {
	s *pulumi.ResourceState
}

// NewOceanLaunchSpec registers a new resource with the given unique name, arguments, and options.
func NewOceanLaunchSpec(ctx *pulumi.Context,
	name string, args *OceanLaunchSpecArgs, opts ...pulumi.ResourceOpt) (*OceanLaunchSpec, error) {
	if args == nil || args.OceanId == nil {
		return nil, errors.New("missing required argument 'OceanId'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["attributes"] = nil
		inputs["iamInstanceProfile"] = nil
		inputs["imageId"] = nil
		inputs["name"] = nil
		inputs["oceanId"] = nil
		inputs["securityGroupIds"] = nil
		inputs["userData"] = nil
	} else {
		inputs["attributes"] = args.Attributes
		inputs["iamInstanceProfile"] = args.IamInstanceProfile
		inputs["imageId"] = args.ImageId
		inputs["name"] = args.Name
		inputs["oceanId"] = args.OceanId
		inputs["securityGroupIds"] = args.SecurityGroupIds
		inputs["userData"] = args.UserData
	}
	s, err := ctx.RegisterResource("spotinst:ecs/oceanLaunchSpec:OceanLaunchSpec", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &OceanLaunchSpec{s: s}, nil
}

// GetOceanLaunchSpec gets an existing OceanLaunchSpec resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOceanLaunchSpec(ctx *pulumi.Context,
	name string, id pulumi.ID, state *OceanLaunchSpecState, opts ...pulumi.ResourceOpt) (*OceanLaunchSpec, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["attributes"] = state.Attributes
		inputs["iamInstanceProfile"] = state.IamInstanceProfile
		inputs["imageId"] = state.ImageId
		inputs["name"] = state.Name
		inputs["oceanId"] = state.OceanId
		inputs["securityGroupIds"] = state.SecurityGroupIds
		inputs["userData"] = state.UserData
	}
	s, err := ctx.ReadResource("spotinst:ecs/oceanLaunchSpec:OceanLaunchSpec", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &OceanLaunchSpec{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *OceanLaunchSpec) URN() pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *OceanLaunchSpec) ID() pulumi.IDOutput {
	return r.s.ID()
}

// Optionally adds labels to instances launched in an Ocean cluster.
func (r *OceanLaunchSpec) Attributes() pulumi.ArrayOutput {
	return (pulumi.ArrayOutput)(r.s.State["attributes"])
}

// The ARN or name of an IAM instance profile to associate with launched instances.
func (r *OceanLaunchSpec) IamInstanceProfile() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["iamInstanceProfile"])
}

// ID of the image used to launch the instances.
func (r *OceanLaunchSpec) ImageId() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["imageId"])
}

// The Ocean Launch Specification name. 
func (r *OceanLaunchSpec) Name() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["name"])
}

// The Ocean cluster ID .
func (r *OceanLaunchSpec) OceanId() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["oceanId"])
}

// One or more security group ids.
func (r *OceanLaunchSpec) SecurityGroupIds() pulumi.ArrayOutput {
	return (pulumi.ArrayOutput)(r.s.State["securityGroupIds"])
}

// Base64-encoded MIME user data to make available to the instances.
func (r *OceanLaunchSpec) UserData() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["userData"])
}

// Input properties used for looking up and filtering OceanLaunchSpec resources.
type OceanLaunchSpecState struct {
	// Optionally adds labels to instances launched in an Ocean cluster.
	Attributes interface{}
	// The ARN or name of an IAM instance profile to associate with launched instances.
	IamInstanceProfile interface{}
	// ID of the image used to launch the instances.
	ImageId interface{}
	// The Ocean Launch Specification name. 
	Name interface{}
	// The Ocean cluster ID .
	OceanId interface{}
	// One or more security group ids.
	SecurityGroupIds interface{}
	// Base64-encoded MIME user data to make available to the instances.
	UserData interface{}
}

// The set of arguments for constructing a OceanLaunchSpec resource.
type OceanLaunchSpecArgs struct {
	// Optionally adds labels to instances launched in an Ocean cluster.
	Attributes interface{}
	// The ARN or name of an IAM instance profile to associate with launched instances.
	IamInstanceProfile interface{}
	// ID of the image used to launch the instances.
	ImageId interface{}
	// The Ocean Launch Specification name. 
	Name interface{}
	// The Ocean cluster ID .
	OceanId interface{}
	// One or more security group ids.
	SecurityGroupIds interface{}
	// Base64-encoded MIME user data to make available to the instances.
	UserData interface{}
}
