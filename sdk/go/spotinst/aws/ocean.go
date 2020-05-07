// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package aws

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Spotinst Ocean AWS resource.
type Ocean struct {
	pulumi.CustomResourceState

	// Configure public IP address allocation.
	AssociatePublicIpAddress pulumi.BoolPtrOutput     `pulumi:"associatePublicIpAddress"`
	Autoscaler               OceanAutoscalerPtrOutput `pulumi:"autoscaler"`
	// Instance types not allowed in the Ocean cluster. Cannot be configured if `whitelist` is configured.
	Blacklists pulumi.StringArrayOutput `pulumi:"blacklists"`
	// The ocean cluster identifier. Example: `ocean.k8s`
	ControllerId pulumi.StringPtrOutput `pulumi:"controllerId"`
	// The number of instances to launch and maintain in the cluster.
	DesiredCapacity pulumi.IntOutput `pulumi:"desiredCapacity"`
	// The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
	DrainingTimeout pulumi.IntPtrOutput `pulumi:"drainingTimeout"`
	// Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
	EbsOptimized pulumi.BoolPtrOutput `pulumi:"ebsOptimized"`
	// If not Spot instance markets are available, enable Ocean to launch On-Demand instances instead.
	FallbackToOndemand pulumi.BoolPtrOutput `pulumi:"fallbackToOndemand"`
	// The amount of time, in seconds, after the instance has launched to start checking its health.
	GracePeriod pulumi.IntPtrOutput `pulumi:"gracePeriod"`
	// The instance profile iam role.
	IamInstanceProfile pulumi.StringPtrOutput `pulumi:"iamInstanceProfile"`
	// ID of the image used to launch the instances.
	ImageId pulumi.StringPtrOutput `pulumi:"imageId"`
	// The key pair to attach the instances.
	KeyName pulumi.StringPtrOutput `pulumi:"keyName"`
	// - Array of load balancer objects to add to ocean cluster
	LoadBalancers OceanLoadBalancerArrayOutput `pulumi:"loadBalancers"`
	// The upper limit of instances the cluster can scale up to.
	MaxSize pulumi.IntPtrOutput `pulumi:"maxSize"`
	// The lower limit of instances the cluster can scale down to.
	MinSize pulumi.IntOutput `pulumi:"minSize"`
	// Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
	Monitoring pulumi.BoolPtrOutput `pulumi:"monitoring"`
	// Required if type is set to CLASSIC
	Name pulumi.StringOutput `pulumi:"name"`
	// The region the cluster will run in.
	Region pulumi.StringPtrOutput `pulumi:"region"`
	// The size (in Gb) to allocate for the root volume. Minimum `20`.
	RootVolumeSize pulumi.IntPtrOutput           `pulumi:"rootVolumeSize"`
	ScheduledTasks OceanScheduledTaskArrayOutput `pulumi:"scheduledTasks"`
	// One or more security group ids.
	SecurityGroups pulumi.StringArrayOutput `pulumi:"securityGroups"`
	SpotPercentage pulumi.Float64PtrOutput  `pulumi:"spotPercentage"`
	// A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public ip.
	SubnetIds pulumi.StringArrayOutput `pulumi:"subnetIds"`
	// Optionally adds tags to instances launched in an Ocean cluster.
	Tags         OceanTagArrayOutput        `pulumi:"tags"`
	UpdatePolicy OceanUpdatePolicyPtrOutput `pulumi:"updatePolicy"`
	// Base64-encoded MIME user data to make available to the instances.
	UserData pulumi.StringPtrOutput `pulumi:"userData"`
	// If Reserved instances exist, Ocean will utilize them before launching Spot instances.
	UtilizeReservedInstances pulumi.BoolPtrOutput `pulumi:"utilizeReservedInstances"`
	// Instance types allowed in the Ocean cluster. Cannot be configured if `blacklist` is configured.
	Whitelists pulumi.StringArrayOutput `pulumi:"whitelists"`
}

// NewOcean registers a new resource with the given unique name, arguments, and options.
func NewOcean(ctx *pulumi.Context,
	name string, args *OceanArgs, opts ...pulumi.ResourceOption) (*Ocean, error) {
	if args == nil || args.SecurityGroups == nil {
		return nil, errors.New("missing required argument 'SecurityGroups'")
	}
	if args == nil || args.SubnetIds == nil {
		return nil, errors.New("missing required argument 'SubnetIds'")
	}
	if args == nil {
		args = &OceanArgs{}
	}
	var resource Ocean
	err := ctx.RegisterResource("spotinst:aws/ocean:Ocean", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOcean gets an existing Ocean resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOcean(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OceanState, opts ...pulumi.ResourceOption) (*Ocean, error) {
	var resource Ocean
	err := ctx.ReadResource("spotinst:aws/ocean:Ocean", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Ocean resources.
type oceanState struct {
	// Configure public IP address allocation.
	AssociatePublicIpAddress *bool            `pulumi:"associatePublicIpAddress"`
	Autoscaler               *OceanAutoscaler `pulumi:"autoscaler"`
	// Instance types not allowed in the Ocean cluster. Cannot be configured if `whitelist` is configured.
	Blacklists []string `pulumi:"blacklists"`
	// The ocean cluster identifier. Example: `ocean.k8s`
	ControllerId *string `pulumi:"controllerId"`
	// The number of instances to launch and maintain in the cluster.
	DesiredCapacity *int `pulumi:"desiredCapacity"`
	// The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
	DrainingTimeout *int `pulumi:"drainingTimeout"`
	// Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
	EbsOptimized *bool `pulumi:"ebsOptimized"`
	// If not Spot instance markets are available, enable Ocean to launch On-Demand instances instead.
	FallbackToOndemand *bool `pulumi:"fallbackToOndemand"`
	// The amount of time, in seconds, after the instance has launched to start checking its health.
	GracePeriod *int `pulumi:"gracePeriod"`
	// The instance profile iam role.
	IamInstanceProfile *string `pulumi:"iamInstanceProfile"`
	// ID of the image used to launch the instances.
	ImageId *string `pulumi:"imageId"`
	// The key pair to attach the instances.
	KeyName *string `pulumi:"keyName"`
	// - Array of load balancer objects to add to ocean cluster
	LoadBalancers []OceanLoadBalancer `pulumi:"loadBalancers"`
	// The upper limit of instances the cluster can scale up to.
	MaxSize *int `pulumi:"maxSize"`
	// The lower limit of instances the cluster can scale down to.
	MinSize *int `pulumi:"minSize"`
	// Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
	Monitoring *bool `pulumi:"monitoring"`
	// Required if type is set to CLASSIC
	Name *string `pulumi:"name"`
	// The region the cluster will run in.
	Region *string `pulumi:"region"`
	// The size (in Gb) to allocate for the root volume. Minimum `20`.
	RootVolumeSize *int                 `pulumi:"rootVolumeSize"`
	ScheduledTasks []OceanScheduledTask `pulumi:"scheduledTasks"`
	// One or more security group ids.
	SecurityGroups []string `pulumi:"securityGroups"`
	SpotPercentage *float64 `pulumi:"spotPercentage"`
	// A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public ip.
	SubnetIds []string `pulumi:"subnetIds"`
	// Optionally adds tags to instances launched in an Ocean cluster.
	Tags         []OceanTag         `pulumi:"tags"`
	UpdatePolicy *OceanUpdatePolicy `pulumi:"updatePolicy"`
	// Base64-encoded MIME user data to make available to the instances.
	UserData *string `pulumi:"userData"`
	// If Reserved instances exist, Ocean will utilize them before launching Spot instances.
	UtilizeReservedInstances *bool `pulumi:"utilizeReservedInstances"`
	// Instance types allowed in the Ocean cluster. Cannot be configured if `blacklist` is configured.
	Whitelists []string `pulumi:"whitelists"`
}

type OceanState struct {
	// Configure public IP address allocation.
	AssociatePublicIpAddress pulumi.BoolPtrInput
	Autoscaler               OceanAutoscalerPtrInput
	// Instance types not allowed in the Ocean cluster. Cannot be configured if `whitelist` is configured.
	Blacklists pulumi.StringArrayInput
	// The ocean cluster identifier. Example: `ocean.k8s`
	ControllerId pulumi.StringPtrInput
	// The number of instances to launch and maintain in the cluster.
	DesiredCapacity pulumi.IntPtrInput
	// The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
	DrainingTimeout pulumi.IntPtrInput
	// Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
	EbsOptimized pulumi.BoolPtrInput
	// If not Spot instance markets are available, enable Ocean to launch On-Demand instances instead.
	FallbackToOndemand pulumi.BoolPtrInput
	// The amount of time, in seconds, after the instance has launched to start checking its health.
	GracePeriod pulumi.IntPtrInput
	// The instance profile iam role.
	IamInstanceProfile pulumi.StringPtrInput
	// ID of the image used to launch the instances.
	ImageId pulumi.StringPtrInput
	// The key pair to attach the instances.
	KeyName pulumi.StringPtrInput
	// - Array of load balancer objects to add to ocean cluster
	LoadBalancers OceanLoadBalancerArrayInput
	// The upper limit of instances the cluster can scale up to.
	MaxSize pulumi.IntPtrInput
	// The lower limit of instances the cluster can scale down to.
	MinSize pulumi.IntPtrInput
	// Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
	Monitoring pulumi.BoolPtrInput
	// Required if type is set to CLASSIC
	Name pulumi.StringPtrInput
	// The region the cluster will run in.
	Region pulumi.StringPtrInput
	// The size (in Gb) to allocate for the root volume. Minimum `20`.
	RootVolumeSize pulumi.IntPtrInput
	ScheduledTasks OceanScheduledTaskArrayInput
	// One or more security group ids.
	SecurityGroups pulumi.StringArrayInput
	SpotPercentage pulumi.Float64PtrInput
	// A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public ip.
	SubnetIds pulumi.StringArrayInput
	// Optionally adds tags to instances launched in an Ocean cluster.
	Tags         OceanTagArrayInput
	UpdatePolicy OceanUpdatePolicyPtrInput
	// Base64-encoded MIME user data to make available to the instances.
	UserData pulumi.StringPtrInput
	// If Reserved instances exist, Ocean will utilize them before launching Spot instances.
	UtilizeReservedInstances pulumi.BoolPtrInput
	// Instance types allowed in the Ocean cluster. Cannot be configured if `blacklist` is configured.
	Whitelists pulumi.StringArrayInput
}

func (OceanState) ElementType() reflect.Type {
	return reflect.TypeOf((*oceanState)(nil)).Elem()
}

type oceanArgs struct {
	// Configure public IP address allocation.
	AssociatePublicIpAddress *bool            `pulumi:"associatePublicIpAddress"`
	Autoscaler               *OceanAutoscaler `pulumi:"autoscaler"`
	// Instance types not allowed in the Ocean cluster. Cannot be configured if `whitelist` is configured.
	Blacklists []string `pulumi:"blacklists"`
	// The ocean cluster identifier. Example: `ocean.k8s`
	ControllerId *string `pulumi:"controllerId"`
	// The number of instances to launch and maintain in the cluster.
	DesiredCapacity *int `pulumi:"desiredCapacity"`
	// The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
	DrainingTimeout *int `pulumi:"drainingTimeout"`
	// Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
	EbsOptimized *bool `pulumi:"ebsOptimized"`
	// If not Spot instance markets are available, enable Ocean to launch On-Demand instances instead.
	FallbackToOndemand *bool `pulumi:"fallbackToOndemand"`
	// The amount of time, in seconds, after the instance has launched to start checking its health.
	GracePeriod *int `pulumi:"gracePeriod"`
	// The instance profile iam role.
	IamInstanceProfile *string `pulumi:"iamInstanceProfile"`
	// ID of the image used to launch the instances.
	ImageId *string `pulumi:"imageId"`
	// The key pair to attach the instances.
	KeyName *string `pulumi:"keyName"`
	// - Array of load balancer objects to add to ocean cluster
	LoadBalancers []OceanLoadBalancer `pulumi:"loadBalancers"`
	// The upper limit of instances the cluster can scale up to.
	MaxSize *int `pulumi:"maxSize"`
	// The lower limit of instances the cluster can scale down to.
	MinSize *int `pulumi:"minSize"`
	// Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
	Monitoring *bool `pulumi:"monitoring"`
	// Required if type is set to CLASSIC
	Name *string `pulumi:"name"`
	// The region the cluster will run in.
	Region *string `pulumi:"region"`
	// The size (in Gb) to allocate for the root volume. Minimum `20`.
	RootVolumeSize *int                 `pulumi:"rootVolumeSize"`
	ScheduledTasks []OceanScheduledTask `pulumi:"scheduledTasks"`
	// One or more security group ids.
	SecurityGroups []string `pulumi:"securityGroups"`
	SpotPercentage *float64 `pulumi:"spotPercentage"`
	// A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public ip.
	SubnetIds []string `pulumi:"subnetIds"`
	// Optionally adds tags to instances launched in an Ocean cluster.
	Tags         []OceanTag         `pulumi:"tags"`
	UpdatePolicy *OceanUpdatePolicy `pulumi:"updatePolicy"`
	// Base64-encoded MIME user data to make available to the instances.
	UserData *string `pulumi:"userData"`
	// If Reserved instances exist, Ocean will utilize them before launching Spot instances.
	UtilizeReservedInstances *bool `pulumi:"utilizeReservedInstances"`
	// Instance types allowed in the Ocean cluster. Cannot be configured if `blacklist` is configured.
	Whitelists []string `pulumi:"whitelists"`
}

// The set of arguments for constructing a Ocean resource.
type OceanArgs struct {
	// Configure public IP address allocation.
	AssociatePublicIpAddress pulumi.BoolPtrInput
	Autoscaler               OceanAutoscalerPtrInput
	// Instance types not allowed in the Ocean cluster. Cannot be configured if `whitelist` is configured.
	Blacklists pulumi.StringArrayInput
	// The ocean cluster identifier. Example: `ocean.k8s`
	ControllerId pulumi.StringPtrInput
	// The number of instances to launch and maintain in the cluster.
	DesiredCapacity pulumi.IntPtrInput
	// The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
	DrainingTimeout pulumi.IntPtrInput
	// Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
	EbsOptimized pulumi.BoolPtrInput
	// If not Spot instance markets are available, enable Ocean to launch On-Demand instances instead.
	FallbackToOndemand pulumi.BoolPtrInput
	// The amount of time, in seconds, after the instance has launched to start checking its health.
	GracePeriod pulumi.IntPtrInput
	// The instance profile iam role.
	IamInstanceProfile pulumi.StringPtrInput
	// ID of the image used to launch the instances.
	ImageId pulumi.StringPtrInput
	// The key pair to attach the instances.
	KeyName pulumi.StringPtrInput
	// - Array of load balancer objects to add to ocean cluster
	LoadBalancers OceanLoadBalancerArrayInput
	// The upper limit of instances the cluster can scale up to.
	MaxSize pulumi.IntPtrInput
	// The lower limit of instances the cluster can scale down to.
	MinSize pulumi.IntPtrInput
	// Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
	Monitoring pulumi.BoolPtrInput
	// Required if type is set to CLASSIC
	Name pulumi.StringPtrInput
	// The region the cluster will run in.
	Region pulumi.StringPtrInput
	// The size (in Gb) to allocate for the root volume. Minimum `20`.
	RootVolumeSize pulumi.IntPtrInput
	ScheduledTasks OceanScheduledTaskArrayInput
	// One or more security group ids.
	SecurityGroups pulumi.StringArrayInput
	SpotPercentage pulumi.Float64PtrInput
	// A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public ip.
	SubnetIds pulumi.StringArrayInput
	// Optionally adds tags to instances launched in an Ocean cluster.
	Tags         OceanTagArrayInput
	UpdatePolicy OceanUpdatePolicyPtrInput
	// Base64-encoded MIME user data to make available to the instances.
	UserData pulumi.StringPtrInput
	// If Reserved instances exist, Ocean will utilize them before launching Spot instances.
	UtilizeReservedInstances pulumi.BoolPtrInput
	// Instance types allowed in the Ocean cluster. Cannot be configured if `blacklist` is configured.
	Whitelists pulumi.StringArrayInput
}

func (OceanArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*oceanArgs)(nil)).Elem()
}
