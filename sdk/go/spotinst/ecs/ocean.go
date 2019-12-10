// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a Spotinst Ocean ECS resource.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-spotinst/blob/master/website/docs/r/ocean_ecs.html.markdown.
type Ocean struct {
	s *pulumi.ResourceState
}

// NewOcean registers a new resource with the given unique name, arguments, and options.
func NewOcean(ctx *pulumi.Context,
	name string, args *OceanArgs, opts ...pulumi.ResourceOpt) (*Ocean, error) {
	if args == nil || args.ClusterName == nil {
		return nil, errors.New("missing required argument 'ClusterName'")
	}
	if args == nil || args.Region == nil {
		return nil, errors.New("missing required argument 'Region'")
	}
	if args == nil || args.SecurityGroupIds == nil {
		return nil, errors.New("missing required argument 'SecurityGroupIds'")
	}
	if args == nil || args.SubnetIds == nil {
		return nil, errors.New("missing required argument 'SubnetIds'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["associatePublicIpAddress"] = nil
		inputs["autoscaler"] = nil
		inputs["clusterName"] = nil
		inputs["desiredCapacity"] = nil
		inputs["drainingTimeout"] = nil
		inputs["ebsOptimized"] = nil
		inputs["iamInstanceProfile"] = nil
		inputs["imageId"] = nil
		inputs["keyPair"] = nil
		inputs["maxSize"] = nil
		inputs["minSize"] = nil
		inputs["monitoring"] = nil
		inputs["name"] = nil
		inputs["region"] = nil
		inputs["securityGroupIds"] = nil
		inputs["subnetIds"] = nil
		inputs["tags"] = nil
		inputs["updatePolicy"] = nil
		inputs["userData"] = nil
		inputs["utilizeReservedInstances"] = nil
		inputs["whitelists"] = nil
	} else {
		inputs["associatePublicIpAddress"] = args.AssociatePublicIpAddress
		inputs["autoscaler"] = args.Autoscaler
		inputs["clusterName"] = args.ClusterName
		inputs["desiredCapacity"] = args.DesiredCapacity
		inputs["drainingTimeout"] = args.DrainingTimeout
		inputs["ebsOptimized"] = args.EbsOptimized
		inputs["iamInstanceProfile"] = args.IamInstanceProfile
		inputs["imageId"] = args.ImageId
		inputs["keyPair"] = args.KeyPair
		inputs["maxSize"] = args.MaxSize
		inputs["minSize"] = args.MinSize
		inputs["monitoring"] = args.Monitoring
		inputs["name"] = args.Name
		inputs["region"] = args.Region
		inputs["securityGroupIds"] = args.SecurityGroupIds
		inputs["subnetIds"] = args.SubnetIds
		inputs["tags"] = args.Tags
		inputs["updatePolicy"] = args.UpdatePolicy
		inputs["userData"] = args.UserData
		inputs["utilizeReservedInstances"] = args.UtilizeReservedInstances
		inputs["whitelists"] = args.Whitelists
	}
	s, err := ctx.RegisterResource("spotinst:ecs/ocean:Ocean", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &Ocean{s: s}, nil
}

// GetOcean gets an existing Ocean resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOcean(ctx *pulumi.Context,
	name string, id pulumi.ID, state *OceanState, opts ...pulumi.ResourceOpt) (*Ocean, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["associatePublicIpAddress"] = state.AssociatePublicIpAddress
		inputs["autoscaler"] = state.Autoscaler
		inputs["clusterName"] = state.ClusterName
		inputs["desiredCapacity"] = state.DesiredCapacity
		inputs["drainingTimeout"] = state.DrainingTimeout
		inputs["ebsOptimized"] = state.EbsOptimized
		inputs["iamInstanceProfile"] = state.IamInstanceProfile
		inputs["imageId"] = state.ImageId
		inputs["keyPair"] = state.KeyPair
		inputs["maxSize"] = state.MaxSize
		inputs["minSize"] = state.MinSize
		inputs["monitoring"] = state.Monitoring
		inputs["name"] = state.Name
		inputs["region"] = state.Region
		inputs["securityGroupIds"] = state.SecurityGroupIds
		inputs["subnetIds"] = state.SubnetIds
		inputs["tags"] = state.Tags
		inputs["updatePolicy"] = state.UpdatePolicy
		inputs["userData"] = state.UserData
		inputs["utilizeReservedInstances"] = state.UtilizeReservedInstances
		inputs["whitelists"] = state.Whitelists
	}
	s, err := ctx.ReadResource("spotinst:ecs/ocean:Ocean", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &Ocean{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *Ocean) URN() pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *Ocean) ID() pulumi.IDOutput {
	return r.s.ID()
}

// Configure public IP address allocation.
func (r *Ocean) AssociatePublicIpAddress() pulumi.BoolOutput {
	return (pulumi.BoolOutput)(r.s.State["associatePublicIpAddress"])
}

// Describes the Ocean ECS autoscaler.
func (r *Ocean) Autoscaler() pulumi.Output {
	return r.s.State["autoscaler"]
}

// The ocean cluster name.
func (r *Ocean) ClusterName() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["clusterName"])
}

// The number of instances to launch and maintain in the cluster.
func (r *Ocean) DesiredCapacity() pulumi.IntOutput {
	return (pulumi.IntOutput)(r.s.State["desiredCapacity"])
}

// The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
func (r *Ocean) DrainingTimeout() pulumi.IntOutput {
	return (pulumi.IntOutput)(r.s.State["drainingTimeout"])
}

// Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
func (r *Ocean) EbsOptimized() pulumi.BoolOutput {
	return (pulumi.BoolOutput)(r.s.State["ebsOptimized"])
}

// The instance profile iam role.
func (r *Ocean) IamInstanceProfile() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["iamInstanceProfile"])
}

// ID of the image used to launch the instances.
func (r *Ocean) ImageId() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["imageId"])
}

// The key pair to attach the instances.
func (r *Ocean) KeyPair() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["keyPair"])
}

// The upper limit of instances the cluster can scale up to.
func (r *Ocean) MaxSize() pulumi.IntOutput {
	return (pulumi.IntOutput)(r.s.State["maxSize"])
}

// The lower limit of instances the cluster can scale down to.
func (r *Ocean) MinSize() pulumi.IntOutput {
	return (pulumi.IntOutput)(r.s.State["minSize"])
}

// Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
func (r *Ocean) Monitoring() pulumi.BoolOutput {
	return (pulumi.BoolOutput)(r.s.State["monitoring"])
}

// The Ocean cluster name.
func (r *Ocean) Name() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["name"])
}

// The region the cluster will run in.
func (r *Ocean) Region() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["region"])
}

// One or more security group ids.
func (r *Ocean) SecurityGroupIds() pulumi.ArrayOutput {
	return (pulumi.ArrayOutput)(r.s.State["securityGroupIds"])
}

// A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public ip.
func (r *Ocean) SubnetIds() pulumi.ArrayOutput {
	return (pulumi.ArrayOutput)(r.s.State["subnetIds"])
}

// Optionally adds tags to instances launched in an Ocean cluster.
func (r *Ocean) Tags() pulumi.ArrayOutput {
	return (pulumi.ArrayOutput)(r.s.State["tags"])
}

func (r *Ocean) UpdatePolicy() pulumi.Output {
	return r.s.State["updatePolicy"]
}

// Base64-encoded MIME user data to make available to the instances.
func (r *Ocean) UserData() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["userData"])
}

func (r *Ocean) UtilizeReservedInstances() pulumi.BoolOutput {
	return (pulumi.BoolOutput)(r.s.State["utilizeReservedInstances"])
}

// Instance types allowed in the Ocean cluster.
func (r *Ocean) Whitelists() pulumi.ArrayOutput {
	return (pulumi.ArrayOutput)(r.s.State["whitelists"])
}

// Input properties used for looking up and filtering Ocean resources.
type OceanState struct {
	// Configure public IP address allocation.
	AssociatePublicIpAddress interface{}
	// Describes the Ocean ECS autoscaler.
	Autoscaler interface{}
	// The ocean cluster name.
	ClusterName interface{}
	// The number of instances to launch and maintain in the cluster.
	DesiredCapacity interface{}
	// The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
	DrainingTimeout interface{}
	// Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
	EbsOptimized interface{}
	// The instance profile iam role.
	IamInstanceProfile interface{}
	// ID of the image used to launch the instances.
	ImageId interface{}
	// The key pair to attach the instances.
	KeyPair interface{}
	// The upper limit of instances the cluster can scale up to.
	MaxSize interface{}
	// The lower limit of instances the cluster can scale down to.
	MinSize interface{}
	// Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
	Monitoring interface{}
	// The Ocean cluster name.
	Name interface{}
	// The region the cluster will run in.
	Region interface{}
	// One or more security group ids.
	SecurityGroupIds interface{}
	// A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public ip.
	SubnetIds interface{}
	// Optionally adds tags to instances launched in an Ocean cluster.
	Tags interface{}
	UpdatePolicy interface{}
	// Base64-encoded MIME user data to make available to the instances.
	UserData interface{}
	UtilizeReservedInstances interface{}
	// Instance types allowed in the Ocean cluster.
	Whitelists interface{}
}

// The set of arguments for constructing a Ocean resource.
type OceanArgs struct {
	// Configure public IP address allocation.
	AssociatePublicIpAddress interface{}
	// Describes the Ocean ECS autoscaler.
	Autoscaler interface{}
	// The ocean cluster name.
	ClusterName interface{}
	// The number of instances to launch and maintain in the cluster.
	DesiredCapacity interface{}
	// The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
	DrainingTimeout interface{}
	// Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
	EbsOptimized interface{}
	// The instance profile iam role.
	IamInstanceProfile interface{}
	// ID of the image used to launch the instances.
	ImageId interface{}
	// The key pair to attach the instances.
	KeyPair interface{}
	// The upper limit of instances the cluster can scale up to.
	MaxSize interface{}
	// The lower limit of instances the cluster can scale down to.
	MinSize interface{}
	// Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
	Monitoring interface{}
	// The Ocean cluster name.
	Name interface{}
	// The region the cluster will run in.
	Region interface{}
	// One or more security group ids.
	SecurityGroupIds interface{}
	// A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public ip.
	SubnetIds interface{}
	// Optionally adds tags to instances launched in an Ocean cluster.
	Tags interface{}
	UpdatePolicy interface{}
	// Base64-encoded MIME user data to make available to the instances.
	UserData interface{}
	UtilizeReservedInstances interface{}
	// Instance types allowed in the Ocean cluster.
	Whitelists interface{}
}
