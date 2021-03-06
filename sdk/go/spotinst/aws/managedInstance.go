// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package aws

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Spotinst AWS ManagedInstance resource.
//
// ## Managed Instance Action
//
// * `managedInstanceAction` - (Optional)
//     * `type` - (Required) String, Action type. Supported action types: `pause`, `resume`, `recycle`.
//
// Usage:
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
type ManagedInstance struct {
	pulumi.CustomResourceState

	// Enable the auto healing which auto replaces the instance in case the health check fails, default: `"true"`.
	AutoHealing pulumi.BoolPtrOutput `pulumi:"autoHealing"`
	// Attributes controls a portion of the AWS:
	BlockDeviceMappings ManagedInstanceBlockDeviceMappingArrayOutput `pulumi:"blockDeviceMappings"`
	// Determine the way we attach the data volumes to the data devices. Valid values: `"reattach"`, `"onLaunch"`.
	// Default: `"onLaunch"`.
	BlockDevicesMode pulumi.StringPtrOutput `pulumi:"blockDevicesMode"`
	// cpuCredits can have one of two values: `"unlimited"`, `"standard"`.
	CpuCredits pulumi.StringPtrOutput `pulumi:"cpuCredits"`
	// The ManagedInstance description.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The time in seconds to allow the instance be drained from incoming TCP connections and detached from ELB before terminating it, during a scale down operation.
	DrainingTimeout pulumi.IntPtrOutput `pulumi:"drainingTimeout"`
	// Enable EBS optimization for supported instances. Note: Additional charges will be applied by the Cloud Provider.
	// Default: false
	EbsOptimized pulumi.BoolOutput `pulumi:"ebsOptimized"`
	// Elastic IP Allocation Id to associate to the instance.
	ElasticIp pulumi.StringPtrOutput `pulumi:"elasticIp"`
	// Describes whether instance Enhanced Monitoring is enabled.
	// Default: false
	EnableMonitoring pulumi.BoolPtrOutput `pulumi:"enableMonitoring"`
	FallBackToOd     pulumi.BoolPtrOutput `pulumi:"fallBackToOd"`
	// The amount of time, in seconds, after the instance has launched to starts and check its health, default `"120"`.
	GracePeriod pulumi.IntPtrOutput `pulumi:"gracePeriod"`
	// The service to use for the health check. Valid values: `"EC2"`, `"ELB"`, `"TARGET_GROUP"`, `"MULTAI_TARGET_SET"`.
	// Default: `"EC2"`.
	HealthCheckType pulumi.StringPtrOutput `pulumi:"healthCheckType"`
	// Set IAM profile to instance. Set only one of ARN or Name.
	IamInstanceProfile pulumi.StringPtrOutput `pulumi:"iamInstanceProfile"`
	// The ID of the image used to launch the instance.
	ImageId pulumi.StringOutput `pulumi:"imageId"`
	// Comma separated list of available instance types for instance.
	InstanceTypes pulumi.StringArrayOutput `pulumi:"instanceTypes"`
	// Describes the [Route53](https://aws.amazon.com/documentation/route53/?id=docs_gateway) integration.
	IntegrationRoute53 ManagedInstanceIntegrationRoute53PtrOutput `pulumi:"integrationRoute53"`
	// Specify a Key Pair to attach to the instances.
	KeyPair pulumi.StringPtrOutput `pulumi:"keyPair"`
	// Set lifecycle, valid values: `"spot"`, `"onDemand"`.
	// Default `"spot"`.
	LifeCycle pulumi.StringPtrOutput `pulumi:"lifeCycle"`
	// List of load balancers configs.
	LoadBalancers           ManagedInstanceLoadBalancerArrayOutput        `pulumi:"loadBalancers"`
	ManagedInstanceAction   ManagedInstanceManagedInstanceActionPtrOutput `pulumi:"managedInstanceAction"`
	MinimumInstanceLifetime pulumi.IntPtrOutput                           `pulumi:"minimumInstanceLifetime"`
	// The record set name.
	Name              pulumi.StringOutput                        `pulumi:"name"`
	NetworkInterfaces ManagedInstanceNetworkInterfaceArrayOutput `pulumi:"networkInterfaces"`
	// When `performAt` is `"timeWindow"`: must specify a list of `"timeWindows"` with at least one time window. Each string should be formatted as `ddd:hh:mm-ddd:hh:mm` (ddd = day of week = Sun | Mon | Tue | Wed | Thu | Fri | Sat hh = hour 24 = 0 -23 mm = minute = 0 - 59).
	OptimizationWindows pulumi.StringArrayOutput `pulumi:"optimizationWindows"`
	// Select a prediction strategy. Valid values: `"balanced"`, `"costOriented"`, `"availabilityOriented"`, `"cheapest"`.
	// Default: `"availabilityOriented"`.
	Orientation pulumi.StringPtrOutput `pulumi:"orientation"`
	// Should the instance maintain its Data volumes.
	PersistBlockDevices pulumi.BoolOutput `pulumi:"persistBlockDevices"`
	// Should the instance maintain its private IP.
	PersistPrivateIp pulumi.BoolPtrOutput `pulumi:"persistPrivateIp"`
	// Should the instance maintain its root device volumes.
	PersistRootDevice pulumi.BoolPtrOutput `pulumi:"persistRootDevice"`
	// Valid values: `"default"`, `"dedicated"`.
	// Default: default
	PlacementTenancy pulumi.StringPtrOutput `pulumi:"placementTenancy"`
	// Preferred instance types for the instance. We will automatically select optional similar instance types to ensure optimized cost efficiency
	PreferredType pulumi.StringPtrOutput `pulumi:"preferredType"`
	// Private IP Allocation Id to associate to the instance.
	PrivateIp pulumi.StringPtrOutput `pulumi:"privateIp"`
	// Operation system type. Valid values: `"Linux/UNIX"`, `"SUSE Linux"`, `"Windows"`, `"Red Hat Enterprise Linux"`, `"Linux/UNIX (Amazon VPC)"`, `"SUSE Linux (Amazon VPC)"`, `"Windows (Amazon VPC)"`,  `"Red Hat Enterprise Linux (Amazon VPC)"`.
	Product pulumi.StringOutput `pulumi:"product"`
	// The AWS region your group will be created in.
	Region         pulumi.StringPtrOutput                  `pulumi:"region"`
	RevertToSpot   ManagedInstanceRevertToSpotPtrOutput    `pulumi:"revertToSpot"`
	ScheduledTasks ManagedInstanceScheduledTaskArrayOutput `pulumi:"scheduledTasks"`
	// One or more security group IDs.
	SecurityGroupIds pulumi.StringArrayOutput `pulumi:"securityGroupIds"`
	// The Base64-encoded shutdown script to execute prior to instance termination.
	ShutdownScript pulumi.StringPtrOutput `pulumi:"shutdownScript"`
	// A comma-separated list of subnet identifiers for your instance.
	SubnetIds pulumi.StringArrayOutput `pulumi:"subnetIds"`
	// Set tags for the instance. Items should be unique.
	Tags ManagedInstanceTagArrayOutput `pulumi:"tags"`
	// The amount of time, in seconds, an existing instance should remain active after becoming unhealthy. After the set time out the instance will be replaced, default `"120"`.
	UnhealthyDuration pulumi.IntPtrOutput `pulumi:"unhealthyDuration"`
	// The Base64-encoded MIME user data to make available to the instances.
	UserData pulumi.StringPtrOutput `pulumi:"userData"`
	// In case of any available Reserved Instances, Managed Instance will utilize them before purchasing Spot instances.
	// Default: `"false"`.
	UtilizeReservedInstances pulumi.BoolPtrOutput `pulumi:"utilizeReservedInstances"`
	VpcId                    pulumi.StringOutput  `pulumi:"vpcId"`
}

// NewManagedInstance registers a new resource with the given unique name, arguments, and options.
func NewManagedInstance(ctx *pulumi.Context,
	name string, args *ManagedInstanceArgs, opts ...pulumi.ResourceOption) (*ManagedInstance, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ImageId == nil {
		return nil, errors.New("invalid value for required argument 'ImageId'")
	}
	if args.InstanceTypes == nil {
		return nil, errors.New("invalid value for required argument 'InstanceTypes'")
	}
	if args.PersistBlockDevices == nil {
		return nil, errors.New("invalid value for required argument 'PersistBlockDevices'")
	}
	if args.Product == nil {
		return nil, errors.New("invalid value for required argument 'Product'")
	}
	if args.SubnetIds == nil {
		return nil, errors.New("invalid value for required argument 'SubnetIds'")
	}
	if args.VpcId == nil {
		return nil, errors.New("invalid value for required argument 'VpcId'")
	}
	var resource ManagedInstance
	err := ctx.RegisterResource("spotinst:aws/managedInstance:ManagedInstance", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetManagedInstance gets an existing ManagedInstance resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetManagedInstance(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ManagedInstanceState, opts ...pulumi.ResourceOption) (*ManagedInstance, error) {
	var resource ManagedInstance
	err := ctx.ReadResource("spotinst:aws/managedInstance:ManagedInstance", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ManagedInstance resources.
type managedInstanceState struct {
	// Enable the auto healing which auto replaces the instance in case the health check fails, default: `"true"`.
	AutoHealing *bool `pulumi:"autoHealing"`
	// Attributes controls a portion of the AWS:
	BlockDeviceMappings []ManagedInstanceBlockDeviceMapping `pulumi:"blockDeviceMappings"`
	// Determine the way we attach the data volumes to the data devices. Valid values: `"reattach"`, `"onLaunch"`.
	// Default: `"onLaunch"`.
	BlockDevicesMode *string `pulumi:"blockDevicesMode"`
	// cpuCredits can have one of two values: `"unlimited"`, `"standard"`.
	CpuCredits *string `pulumi:"cpuCredits"`
	// The ManagedInstance description.
	Description *string `pulumi:"description"`
	// The time in seconds to allow the instance be drained from incoming TCP connections and detached from ELB before terminating it, during a scale down operation.
	DrainingTimeout *int `pulumi:"drainingTimeout"`
	// Enable EBS optimization for supported instances. Note: Additional charges will be applied by the Cloud Provider.
	// Default: false
	EbsOptimized *bool `pulumi:"ebsOptimized"`
	// Elastic IP Allocation Id to associate to the instance.
	ElasticIp *string `pulumi:"elasticIp"`
	// Describes whether instance Enhanced Monitoring is enabled.
	// Default: false
	EnableMonitoring *bool `pulumi:"enableMonitoring"`
	FallBackToOd     *bool `pulumi:"fallBackToOd"`
	// The amount of time, in seconds, after the instance has launched to starts and check its health, default `"120"`.
	GracePeriod *int `pulumi:"gracePeriod"`
	// The service to use for the health check. Valid values: `"EC2"`, `"ELB"`, `"TARGET_GROUP"`, `"MULTAI_TARGET_SET"`.
	// Default: `"EC2"`.
	HealthCheckType *string `pulumi:"healthCheckType"`
	// Set IAM profile to instance. Set only one of ARN or Name.
	IamInstanceProfile *string `pulumi:"iamInstanceProfile"`
	// The ID of the image used to launch the instance.
	ImageId *string `pulumi:"imageId"`
	// Comma separated list of available instance types for instance.
	InstanceTypes []string `pulumi:"instanceTypes"`
	// Describes the [Route53](https://aws.amazon.com/documentation/route53/?id=docs_gateway) integration.
	IntegrationRoute53 *ManagedInstanceIntegrationRoute53 `pulumi:"integrationRoute53"`
	// Specify a Key Pair to attach to the instances.
	KeyPair *string `pulumi:"keyPair"`
	// Set lifecycle, valid values: `"spot"`, `"onDemand"`.
	// Default `"spot"`.
	LifeCycle *string `pulumi:"lifeCycle"`
	// List of load balancers configs.
	LoadBalancers           []ManagedInstanceLoadBalancer         `pulumi:"loadBalancers"`
	ManagedInstanceAction   *ManagedInstanceManagedInstanceAction `pulumi:"managedInstanceAction"`
	MinimumInstanceLifetime *int                                  `pulumi:"minimumInstanceLifetime"`
	// The record set name.
	Name              *string                           `pulumi:"name"`
	NetworkInterfaces []ManagedInstanceNetworkInterface `pulumi:"networkInterfaces"`
	// When `performAt` is `"timeWindow"`: must specify a list of `"timeWindows"` with at least one time window. Each string should be formatted as `ddd:hh:mm-ddd:hh:mm` (ddd = day of week = Sun | Mon | Tue | Wed | Thu | Fri | Sat hh = hour 24 = 0 -23 mm = minute = 0 - 59).
	OptimizationWindows []string `pulumi:"optimizationWindows"`
	// Select a prediction strategy. Valid values: `"balanced"`, `"costOriented"`, `"availabilityOriented"`, `"cheapest"`.
	// Default: `"availabilityOriented"`.
	Orientation *string `pulumi:"orientation"`
	// Should the instance maintain its Data volumes.
	PersistBlockDevices *bool `pulumi:"persistBlockDevices"`
	// Should the instance maintain its private IP.
	PersistPrivateIp *bool `pulumi:"persistPrivateIp"`
	// Should the instance maintain its root device volumes.
	PersistRootDevice *bool `pulumi:"persistRootDevice"`
	// Valid values: `"default"`, `"dedicated"`.
	// Default: default
	PlacementTenancy *string `pulumi:"placementTenancy"`
	// Preferred instance types for the instance. We will automatically select optional similar instance types to ensure optimized cost efficiency
	PreferredType *string `pulumi:"preferredType"`
	// Private IP Allocation Id to associate to the instance.
	PrivateIp *string `pulumi:"privateIp"`
	// Operation system type. Valid values: `"Linux/UNIX"`, `"SUSE Linux"`, `"Windows"`, `"Red Hat Enterprise Linux"`, `"Linux/UNIX (Amazon VPC)"`, `"SUSE Linux (Amazon VPC)"`, `"Windows (Amazon VPC)"`,  `"Red Hat Enterprise Linux (Amazon VPC)"`.
	Product *string `pulumi:"product"`
	// The AWS region your group will be created in.
	Region         *string                        `pulumi:"region"`
	RevertToSpot   *ManagedInstanceRevertToSpot   `pulumi:"revertToSpot"`
	ScheduledTasks []ManagedInstanceScheduledTask `pulumi:"scheduledTasks"`
	// One or more security group IDs.
	SecurityGroupIds []string `pulumi:"securityGroupIds"`
	// The Base64-encoded shutdown script to execute prior to instance termination.
	ShutdownScript *string `pulumi:"shutdownScript"`
	// A comma-separated list of subnet identifiers for your instance.
	SubnetIds []string `pulumi:"subnetIds"`
	// Set tags for the instance. Items should be unique.
	Tags []ManagedInstanceTag `pulumi:"tags"`
	// The amount of time, in seconds, an existing instance should remain active after becoming unhealthy. After the set time out the instance will be replaced, default `"120"`.
	UnhealthyDuration *int `pulumi:"unhealthyDuration"`
	// The Base64-encoded MIME user data to make available to the instances.
	UserData *string `pulumi:"userData"`
	// In case of any available Reserved Instances, Managed Instance will utilize them before purchasing Spot instances.
	// Default: `"false"`.
	UtilizeReservedInstances *bool   `pulumi:"utilizeReservedInstances"`
	VpcId                    *string `pulumi:"vpcId"`
}

type ManagedInstanceState struct {
	// Enable the auto healing which auto replaces the instance in case the health check fails, default: `"true"`.
	AutoHealing pulumi.BoolPtrInput
	// Attributes controls a portion of the AWS:
	BlockDeviceMappings ManagedInstanceBlockDeviceMappingArrayInput
	// Determine the way we attach the data volumes to the data devices. Valid values: `"reattach"`, `"onLaunch"`.
	// Default: `"onLaunch"`.
	BlockDevicesMode pulumi.StringPtrInput
	// cpuCredits can have one of two values: `"unlimited"`, `"standard"`.
	CpuCredits pulumi.StringPtrInput
	// The ManagedInstance description.
	Description pulumi.StringPtrInput
	// The time in seconds to allow the instance be drained from incoming TCP connections and detached from ELB before terminating it, during a scale down operation.
	DrainingTimeout pulumi.IntPtrInput
	// Enable EBS optimization for supported instances. Note: Additional charges will be applied by the Cloud Provider.
	// Default: false
	EbsOptimized pulumi.BoolPtrInput
	// Elastic IP Allocation Id to associate to the instance.
	ElasticIp pulumi.StringPtrInput
	// Describes whether instance Enhanced Monitoring is enabled.
	// Default: false
	EnableMonitoring pulumi.BoolPtrInput
	FallBackToOd     pulumi.BoolPtrInput
	// The amount of time, in seconds, after the instance has launched to starts and check its health, default `"120"`.
	GracePeriod pulumi.IntPtrInput
	// The service to use for the health check. Valid values: `"EC2"`, `"ELB"`, `"TARGET_GROUP"`, `"MULTAI_TARGET_SET"`.
	// Default: `"EC2"`.
	HealthCheckType pulumi.StringPtrInput
	// Set IAM profile to instance. Set only one of ARN or Name.
	IamInstanceProfile pulumi.StringPtrInput
	// The ID of the image used to launch the instance.
	ImageId pulumi.StringPtrInput
	// Comma separated list of available instance types for instance.
	InstanceTypes pulumi.StringArrayInput
	// Describes the [Route53](https://aws.amazon.com/documentation/route53/?id=docs_gateway) integration.
	IntegrationRoute53 ManagedInstanceIntegrationRoute53PtrInput
	// Specify a Key Pair to attach to the instances.
	KeyPair pulumi.StringPtrInput
	// Set lifecycle, valid values: `"spot"`, `"onDemand"`.
	// Default `"spot"`.
	LifeCycle pulumi.StringPtrInput
	// List of load balancers configs.
	LoadBalancers           ManagedInstanceLoadBalancerArrayInput
	ManagedInstanceAction   ManagedInstanceManagedInstanceActionPtrInput
	MinimumInstanceLifetime pulumi.IntPtrInput
	// The record set name.
	Name              pulumi.StringPtrInput
	NetworkInterfaces ManagedInstanceNetworkInterfaceArrayInput
	// When `performAt` is `"timeWindow"`: must specify a list of `"timeWindows"` with at least one time window. Each string should be formatted as `ddd:hh:mm-ddd:hh:mm` (ddd = day of week = Sun | Mon | Tue | Wed | Thu | Fri | Sat hh = hour 24 = 0 -23 mm = minute = 0 - 59).
	OptimizationWindows pulumi.StringArrayInput
	// Select a prediction strategy. Valid values: `"balanced"`, `"costOriented"`, `"availabilityOriented"`, `"cheapest"`.
	// Default: `"availabilityOriented"`.
	Orientation pulumi.StringPtrInput
	// Should the instance maintain its Data volumes.
	PersistBlockDevices pulumi.BoolPtrInput
	// Should the instance maintain its private IP.
	PersistPrivateIp pulumi.BoolPtrInput
	// Should the instance maintain its root device volumes.
	PersistRootDevice pulumi.BoolPtrInput
	// Valid values: `"default"`, `"dedicated"`.
	// Default: default
	PlacementTenancy pulumi.StringPtrInput
	// Preferred instance types for the instance. We will automatically select optional similar instance types to ensure optimized cost efficiency
	PreferredType pulumi.StringPtrInput
	// Private IP Allocation Id to associate to the instance.
	PrivateIp pulumi.StringPtrInput
	// Operation system type. Valid values: `"Linux/UNIX"`, `"SUSE Linux"`, `"Windows"`, `"Red Hat Enterprise Linux"`, `"Linux/UNIX (Amazon VPC)"`, `"SUSE Linux (Amazon VPC)"`, `"Windows (Amazon VPC)"`,  `"Red Hat Enterprise Linux (Amazon VPC)"`.
	Product pulumi.StringPtrInput
	// The AWS region your group will be created in.
	Region         pulumi.StringPtrInput
	RevertToSpot   ManagedInstanceRevertToSpotPtrInput
	ScheduledTasks ManagedInstanceScheduledTaskArrayInput
	// One or more security group IDs.
	SecurityGroupIds pulumi.StringArrayInput
	// The Base64-encoded shutdown script to execute prior to instance termination.
	ShutdownScript pulumi.StringPtrInput
	// A comma-separated list of subnet identifiers for your instance.
	SubnetIds pulumi.StringArrayInput
	// Set tags for the instance. Items should be unique.
	Tags ManagedInstanceTagArrayInput
	// The amount of time, in seconds, an existing instance should remain active after becoming unhealthy. After the set time out the instance will be replaced, default `"120"`.
	UnhealthyDuration pulumi.IntPtrInput
	// The Base64-encoded MIME user data to make available to the instances.
	UserData pulumi.StringPtrInput
	// In case of any available Reserved Instances, Managed Instance will utilize them before purchasing Spot instances.
	// Default: `"false"`.
	UtilizeReservedInstances pulumi.BoolPtrInput
	VpcId                    pulumi.StringPtrInput
}

func (ManagedInstanceState) ElementType() reflect.Type {
	return reflect.TypeOf((*managedInstanceState)(nil)).Elem()
}

type managedInstanceArgs struct {
	// Enable the auto healing which auto replaces the instance in case the health check fails, default: `"true"`.
	AutoHealing *bool `pulumi:"autoHealing"`
	// Attributes controls a portion of the AWS:
	BlockDeviceMappings []ManagedInstanceBlockDeviceMapping `pulumi:"blockDeviceMappings"`
	// Determine the way we attach the data volumes to the data devices. Valid values: `"reattach"`, `"onLaunch"`.
	// Default: `"onLaunch"`.
	BlockDevicesMode *string `pulumi:"blockDevicesMode"`
	// cpuCredits can have one of two values: `"unlimited"`, `"standard"`.
	CpuCredits *string `pulumi:"cpuCredits"`
	// The ManagedInstance description.
	Description *string `pulumi:"description"`
	// The time in seconds to allow the instance be drained from incoming TCP connections and detached from ELB before terminating it, during a scale down operation.
	DrainingTimeout *int `pulumi:"drainingTimeout"`
	// Enable EBS optimization for supported instances. Note: Additional charges will be applied by the Cloud Provider.
	// Default: false
	EbsOptimized *bool `pulumi:"ebsOptimized"`
	// Elastic IP Allocation Id to associate to the instance.
	ElasticIp *string `pulumi:"elasticIp"`
	// Describes whether instance Enhanced Monitoring is enabled.
	// Default: false
	EnableMonitoring *bool `pulumi:"enableMonitoring"`
	FallBackToOd     *bool `pulumi:"fallBackToOd"`
	// The amount of time, in seconds, after the instance has launched to starts and check its health, default `"120"`.
	GracePeriod *int `pulumi:"gracePeriod"`
	// The service to use for the health check. Valid values: `"EC2"`, `"ELB"`, `"TARGET_GROUP"`, `"MULTAI_TARGET_SET"`.
	// Default: `"EC2"`.
	HealthCheckType *string `pulumi:"healthCheckType"`
	// Set IAM profile to instance. Set only one of ARN or Name.
	IamInstanceProfile *string `pulumi:"iamInstanceProfile"`
	// The ID of the image used to launch the instance.
	ImageId string `pulumi:"imageId"`
	// Comma separated list of available instance types for instance.
	InstanceTypes []string `pulumi:"instanceTypes"`
	// Describes the [Route53](https://aws.amazon.com/documentation/route53/?id=docs_gateway) integration.
	IntegrationRoute53 *ManagedInstanceIntegrationRoute53 `pulumi:"integrationRoute53"`
	// Specify a Key Pair to attach to the instances.
	KeyPair *string `pulumi:"keyPair"`
	// Set lifecycle, valid values: `"spot"`, `"onDemand"`.
	// Default `"spot"`.
	LifeCycle *string `pulumi:"lifeCycle"`
	// List of load balancers configs.
	LoadBalancers           []ManagedInstanceLoadBalancer         `pulumi:"loadBalancers"`
	ManagedInstanceAction   *ManagedInstanceManagedInstanceAction `pulumi:"managedInstanceAction"`
	MinimumInstanceLifetime *int                                  `pulumi:"minimumInstanceLifetime"`
	// The record set name.
	Name              *string                           `pulumi:"name"`
	NetworkInterfaces []ManagedInstanceNetworkInterface `pulumi:"networkInterfaces"`
	// When `performAt` is `"timeWindow"`: must specify a list of `"timeWindows"` with at least one time window. Each string should be formatted as `ddd:hh:mm-ddd:hh:mm` (ddd = day of week = Sun | Mon | Tue | Wed | Thu | Fri | Sat hh = hour 24 = 0 -23 mm = minute = 0 - 59).
	OptimizationWindows []string `pulumi:"optimizationWindows"`
	// Select a prediction strategy. Valid values: `"balanced"`, `"costOriented"`, `"availabilityOriented"`, `"cheapest"`.
	// Default: `"availabilityOriented"`.
	Orientation *string `pulumi:"orientation"`
	// Should the instance maintain its Data volumes.
	PersistBlockDevices bool `pulumi:"persistBlockDevices"`
	// Should the instance maintain its private IP.
	PersistPrivateIp *bool `pulumi:"persistPrivateIp"`
	// Should the instance maintain its root device volumes.
	PersistRootDevice *bool `pulumi:"persistRootDevice"`
	// Valid values: `"default"`, `"dedicated"`.
	// Default: default
	PlacementTenancy *string `pulumi:"placementTenancy"`
	// Preferred instance types for the instance. We will automatically select optional similar instance types to ensure optimized cost efficiency
	PreferredType *string `pulumi:"preferredType"`
	// Private IP Allocation Id to associate to the instance.
	PrivateIp *string `pulumi:"privateIp"`
	// Operation system type. Valid values: `"Linux/UNIX"`, `"SUSE Linux"`, `"Windows"`, `"Red Hat Enterprise Linux"`, `"Linux/UNIX (Amazon VPC)"`, `"SUSE Linux (Amazon VPC)"`, `"Windows (Amazon VPC)"`,  `"Red Hat Enterprise Linux (Amazon VPC)"`.
	Product string `pulumi:"product"`
	// The AWS region your group will be created in.
	Region         *string                        `pulumi:"region"`
	RevertToSpot   *ManagedInstanceRevertToSpot   `pulumi:"revertToSpot"`
	ScheduledTasks []ManagedInstanceScheduledTask `pulumi:"scheduledTasks"`
	// One or more security group IDs.
	SecurityGroupIds []string `pulumi:"securityGroupIds"`
	// The Base64-encoded shutdown script to execute prior to instance termination.
	ShutdownScript *string `pulumi:"shutdownScript"`
	// A comma-separated list of subnet identifiers for your instance.
	SubnetIds []string `pulumi:"subnetIds"`
	// Set tags for the instance. Items should be unique.
	Tags []ManagedInstanceTag `pulumi:"tags"`
	// The amount of time, in seconds, an existing instance should remain active after becoming unhealthy. After the set time out the instance will be replaced, default `"120"`.
	UnhealthyDuration *int `pulumi:"unhealthyDuration"`
	// The Base64-encoded MIME user data to make available to the instances.
	UserData *string `pulumi:"userData"`
	// In case of any available Reserved Instances, Managed Instance will utilize them before purchasing Spot instances.
	// Default: `"false"`.
	UtilizeReservedInstances *bool  `pulumi:"utilizeReservedInstances"`
	VpcId                    string `pulumi:"vpcId"`
}

// The set of arguments for constructing a ManagedInstance resource.
type ManagedInstanceArgs struct {
	// Enable the auto healing which auto replaces the instance in case the health check fails, default: `"true"`.
	AutoHealing pulumi.BoolPtrInput
	// Attributes controls a portion of the AWS:
	BlockDeviceMappings ManagedInstanceBlockDeviceMappingArrayInput
	// Determine the way we attach the data volumes to the data devices. Valid values: `"reattach"`, `"onLaunch"`.
	// Default: `"onLaunch"`.
	BlockDevicesMode pulumi.StringPtrInput
	// cpuCredits can have one of two values: `"unlimited"`, `"standard"`.
	CpuCredits pulumi.StringPtrInput
	// The ManagedInstance description.
	Description pulumi.StringPtrInput
	// The time in seconds to allow the instance be drained from incoming TCP connections and detached from ELB before terminating it, during a scale down operation.
	DrainingTimeout pulumi.IntPtrInput
	// Enable EBS optimization for supported instances. Note: Additional charges will be applied by the Cloud Provider.
	// Default: false
	EbsOptimized pulumi.BoolPtrInput
	// Elastic IP Allocation Id to associate to the instance.
	ElasticIp pulumi.StringPtrInput
	// Describes whether instance Enhanced Monitoring is enabled.
	// Default: false
	EnableMonitoring pulumi.BoolPtrInput
	FallBackToOd     pulumi.BoolPtrInput
	// The amount of time, in seconds, after the instance has launched to starts and check its health, default `"120"`.
	GracePeriod pulumi.IntPtrInput
	// The service to use for the health check. Valid values: `"EC2"`, `"ELB"`, `"TARGET_GROUP"`, `"MULTAI_TARGET_SET"`.
	// Default: `"EC2"`.
	HealthCheckType pulumi.StringPtrInput
	// Set IAM profile to instance. Set only one of ARN or Name.
	IamInstanceProfile pulumi.StringPtrInput
	// The ID of the image used to launch the instance.
	ImageId pulumi.StringInput
	// Comma separated list of available instance types for instance.
	InstanceTypes pulumi.StringArrayInput
	// Describes the [Route53](https://aws.amazon.com/documentation/route53/?id=docs_gateway) integration.
	IntegrationRoute53 ManagedInstanceIntegrationRoute53PtrInput
	// Specify a Key Pair to attach to the instances.
	KeyPair pulumi.StringPtrInput
	// Set lifecycle, valid values: `"spot"`, `"onDemand"`.
	// Default `"spot"`.
	LifeCycle pulumi.StringPtrInput
	// List of load balancers configs.
	LoadBalancers           ManagedInstanceLoadBalancerArrayInput
	ManagedInstanceAction   ManagedInstanceManagedInstanceActionPtrInput
	MinimumInstanceLifetime pulumi.IntPtrInput
	// The record set name.
	Name              pulumi.StringPtrInput
	NetworkInterfaces ManagedInstanceNetworkInterfaceArrayInput
	// When `performAt` is `"timeWindow"`: must specify a list of `"timeWindows"` with at least one time window. Each string should be formatted as `ddd:hh:mm-ddd:hh:mm` (ddd = day of week = Sun | Mon | Tue | Wed | Thu | Fri | Sat hh = hour 24 = 0 -23 mm = minute = 0 - 59).
	OptimizationWindows pulumi.StringArrayInput
	// Select a prediction strategy. Valid values: `"balanced"`, `"costOriented"`, `"availabilityOriented"`, `"cheapest"`.
	// Default: `"availabilityOriented"`.
	Orientation pulumi.StringPtrInput
	// Should the instance maintain its Data volumes.
	PersistBlockDevices pulumi.BoolInput
	// Should the instance maintain its private IP.
	PersistPrivateIp pulumi.BoolPtrInput
	// Should the instance maintain its root device volumes.
	PersistRootDevice pulumi.BoolPtrInput
	// Valid values: `"default"`, `"dedicated"`.
	// Default: default
	PlacementTenancy pulumi.StringPtrInput
	// Preferred instance types for the instance. We will automatically select optional similar instance types to ensure optimized cost efficiency
	PreferredType pulumi.StringPtrInput
	// Private IP Allocation Id to associate to the instance.
	PrivateIp pulumi.StringPtrInput
	// Operation system type. Valid values: `"Linux/UNIX"`, `"SUSE Linux"`, `"Windows"`, `"Red Hat Enterprise Linux"`, `"Linux/UNIX (Amazon VPC)"`, `"SUSE Linux (Amazon VPC)"`, `"Windows (Amazon VPC)"`,  `"Red Hat Enterprise Linux (Amazon VPC)"`.
	Product pulumi.StringInput
	// The AWS region your group will be created in.
	Region         pulumi.StringPtrInput
	RevertToSpot   ManagedInstanceRevertToSpotPtrInput
	ScheduledTasks ManagedInstanceScheduledTaskArrayInput
	// One or more security group IDs.
	SecurityGroupIds pulumi.StringArrayInput
	// The Base64-encoded shutdown script to execute prior to instance termination.
	ShutdownScript pulumi.StringPtrInput
	// A comma-separated list of subnet identifiers for your instance.
	SubnetIds pulumi.StringArrayInput
	// Set tags for the instance. Items should be unique.
	Tags ManagedInstanceTagArrayInput
	// The amount of time, in seconds, an existing instance should remain active after becoming unhealthy. After the set time out the instance will be replaced, default `"120"`.
	UnhealthyDuration pulumi.IntPtrInput
	// The Base64-encoded MIME user data to make available to the instances.
	UserData pulumi.StringPtrInput
	// In case of any available Reserved Instances, Managed Instance will utilize them before purchasing Spot instances.
	// Default: `"false"`.
	UtilizeReservedInstances pulumi.BoolPtrInput
	VpcId                    pulumi.StringInput
}

func (ManagedInstanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*managedInstanceArgs)(nil)).Elem()
}

type ManagedInstanceInput interface {
	pulumi.Input

	ToManagedInstanceOutput() ManagedInstanceOutput
	ToManagedInstanceOutputWithContext(ctx context.Context) ManagedInstanceOutput
}

func (*ManagedInstance) ElementType() reflect.Type {
	return reflect.TypeOf((*ManagedInstance)(nil))
}

func (i *ManagedInstance) ToManagedInstanceOutput() ManagedInstanceOutput {
	return i.ToManagedInstanceOutputWithContext(context.Background())
}

func (i *ManagedInstance) ToManagedInstanceOutputWithContext(ctx context.Context) ManagedInstanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ManagedInstanceOutput)
}

func (i *ManagedInstance) ToManagedInstancePtrOutput() ManagedInstancePtrOutput {
	return i.ToManagedInstancePtrOutputWithContext(context.Background())
}

func (i *ManagedInstance) ToManagedInstancePtrOutputWithContext(ctx context.Context) ManagedInstancePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ManagedInstancePtrOutput)
}

type ManagedInstancePtrInput interface {
	pulumi.Input

	ToManagedInstancePtrOutput() ManagedInstancePtrOutput
	ToManagedInstancePtrOutputWithContext(ctx context.Context) ManagedInstancePtrOutput
}

type managedInstancePtrType ManagedInstanceArgs

func (*managedInstancePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ManagedInstance)(nil))
}

func (i *managedInstancePtrType) ToManagedInstancePtrOutput() ManagedInstancePtrOutput {
	return i.ToManagedInstancePtrOutputWithContext(context.Background())
}

func (i *managedInstancePtrType) ToManagedInstancePtrOutputWithContext(ctx context.Context) ManagedInstancePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ManagedInstancePtrOutput)
}

// ManagedInstanceArrayInput is an input type that accepts ManagedInstanceArray and ManagedInstanceArrayOutput values.
// You can construct a concrete instance of `ManagedInstanceArrayInput` via:
//
//          ManagedInstanceArray{ ManagedInstanceArgs{...} }
type ManagedInstanceArrayInput interface {
	pulumi.Input

	ToManagedInstanceArrayOutput() ManagedInstanceArrayOutput
	ToManagedInstanceArrayOutputWithContext(context.Context) ManagedInstanceArrayOutput
}

type ManagedInstanceArray []ManagedInstanceInput

func (ManagedInstanceArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*ManagedInstance)(nil))
}

func (i ManagedInstanceArray) ToManagedInstanceArrayOutput() ManagedInstanceArrayOutput {
	return i.ToManagedInstanceArrayOutputWithContext(context.Background())
}

func (i ManagedInstanceArray) ToManagedInstanceArrayOutputWithContext(ctx context.Context) ManagedInstanceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ManagedInstanceArrayOutput)
}

// ManagedInstanceMapInput is an input type that accepts ManagedInstanceMap and ManagedInstanceMapOutput values.
// You can construct a concrete instance of `ManagedInstanceMapInput` via:
//
//          ManagedInstanceMap{ "key": ManagedInstanceArgs{...} }
type ManagedInstanceMapInput interface {
	pulumi.Input

	ToManagedInstanceMapOutput() ManagedInstanceMapOutput
	ToManagedInstanceMapOutputWithContext(context.Context) ManagedInstanceMapOutput
}

type ManagedInstanceMap map[string]ManagedInstanceInput

func (ManagedInstanceMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*ManagedInstance)(nil))
}

func (i ManagedInstanceMap) ToManagedInstanceMapOutput() ManagedInstanceMapOutput {
	return i.ToManagedInstanceMapOutputWithContext(context.Background())
}

func (i ManagedInstanceMap) ToManagedInstanceMapOutputWithContext(ctx context.Context) ManagedInstanceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ManagedInstanceMapOutput)
}

type ManagedInstanceOutput struct {
	*pulumi.OutputState
}

func (ManagedInstanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ManagedInstance)(nil))
}

func (o ManagedInstanceOutput) ToManagedInstanceOutput() ManagedInstanceOutput {
	return o
}

func (o ManagedInstanceOutput) ToManagedInstanceOutputWithContext(ctx context.Context) ManagedInstanceOutput {
	return o
}

func (o ManagedInstanceOutput) ToManagedInstancePtrOutput() ManagedInstancePtrOutput {
	return o.ToManagedInstancePtrOutputWithContext(context.Background())
}

func (o ManagedInstanceOutput) ToManagedInstancePtrOutputWithContext(ctx context.Context) ManagedInstancePtrOutput {
	return o.ApplyT(func(v ManagedInstance) *ManagedInstance {
		return &v
	}).(ManagedInstancePtrOutput)
}

type ManagedInstancePtrOutput struct {
	*pulumi.OutputState
}

func (ManagedInstancePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ManagedInstance)(nil))
}

func (o ManagedInstancePtrOutput) ToManagedInstancePtrOutput() ManagedInstancePtrOutput {
	return o
}

func (o ManagedInstancePtrOutput) ToManagedInstancePtrOutputWithContext(ctx context.Context) ManagedInstancePtrOutput {
	return o
}

type ManagedInstanceArrayOutput struct{ *pulumi.OutputState }

func (ManagedInstanceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ManagedInstance)(nil))
}

func (o ManagedInstanceArrayOutput) ToManagedInstanceArrayOutput() ManagedInstanceArrayOutput {
	return o
}

func (o ManagedInstanceArrayOutput) ToManagedInstanceArrayOutputWithContext(ctx context.Context) ManagedInstanceArrayOutput {
	return o
}

func (o ManagedInstanceArrayOutput) Index(i pulumi.IntInput) ManagedInstanceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ManagedInstance {
		return vs[0].([]ManagedInstance)[vs[1].(int)]
	}).(ManagedInstanceOutput)
}

type ManagedInstanceMapOutput struct{ *pulumi.OutputState }

func (ManagedInstanceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]ManagedInstance)(nil))
}

func (o ManagedInstanceMapOutput) ToManagedInstanceMapOutput() ManagedInstanceMapOutput {
	return o
}

func (o ManagedInstanceMapOutput) ToManagedInstanceMapOutputWithContext(ctx context.Context) ManagedInstanceMapOutput {
	return o
}

func (o ManagedInstanceMapOutput) MapIndex(k pulumi.StringInput) ManagedInstanceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) ManagedInstance {
		return vs[0].(map[string]ManagedInstance)[vs[1].(string)]
	}).(ManagedInstanceOutput)
}

func init() {
	pulumi.RegisterOutputType(ManagedInstanceOutput{})
	pulumi.RegisterOutputType(ManagedInstancePtrOutput{})
	pulumi.RegisterOutputType(ManagedInstanceArrayOutput{})
	pulumi.RegisterOutputType(ManagedInstanceMapOutput{})
}
