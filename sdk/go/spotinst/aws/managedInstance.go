// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package aws

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Spotinst AWS ManagedInstance resource.
//
// ## Network Interface - (Optional) List of network interfaces in an EC2 instance.
//
// * `deviceIndex` - (Optional) The position of the network interface in the attachment order. A primary network interface has a device index of 0. If you specify a network interface when launching an instance, you must specify the device index.
// * `associatePublicIpAddress` - (Optional) Indicates whether to assign a public IPv4 address to an instance you launch in a VPC. The public IP address can only be assigned to a network interface for eth0, and can only be assigned to a new network interface, not an existing one. You cannot specify more than one network interface in the request. If launching into a default subnet, the default value is true.
// * `associateIpv6Address` - (Optional) Indicates whether to assign an IPv6 address. Amazon EC2 chooses the IPv6 addresses from the range of the subnet.
//    Default: false
//
// Usage:
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		return nil
// 	})
// }
// ```
//
// <a id="scheduled-task"></a>
// ## Scheduled Tasks
//
// Each `scheduledTask` supports the following:
//
// * `isEnabled` - (Optional) Describes whether the task is enabled. When true the task should run when false it should not run.
// * `frequency` - (Optional) Set frequency for the task. Valid values: "hourly", "daily", "weekly", "continuous".
// * `startTime` - (Optional) DATETIME in ISO-8601 format. Sets a start time for scheduled actions. If "frequency" or "cronExpression" are not used - the task will run only once at the start time and will then be deleted from the instance configuration.
//    Example: 2019-05-23T10:55:09Z
// * `cronExpression` - (Optional) A valid cron expression. For example: " * * * * * ". The cron is running in UTC time zone and is in Unix cron format Cron Expression Validator Script. Only one of ‘frequency’ or ‘cronExpression’ should be used at a time.
//    Example: 0 1 * * *
// * `taskType`- (Required) The task type to run. Valid values: "pause", "resume", "recycle".
//
// Usage:
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		return nil
// 	})
// }
// ```
//
// <a id="load-balancers"></a>
// ## Load Balancers
//
//    * `loadBalancersConfig` - (Optional) Load Balancers integration object.
//
//        * `loadBalancers` - (Optional) List of load balancers configs.
//             * `name` - The AWS resource name. Required for Classic Load Balancer. Optional for Application Load Balancer.
//             * `arn` - The AWS resource ARN (Required only for ALB target groups).
//             * `balancerId` - The Multai load balancer ID.
//                  Default: lb-123456
//             * `targetSetId` - The Multai load target set ID.
//                  Default: ts-123456
//             * `autoWeight` - "Auto Weight" will automatically provide a higher weight for instances that are larger as appropriate. For example, if you have configured your Elastigroup with m4.large and m4.xlarge instances the m4.large will have half the weight of an m4.xlarge. This ensures that larger instances receive a higher number of MLB requests.
//             * `zoneAwareness` - "AZ Awareness" will ensure that instances within the same AZ are using the corresponding MLB runtime instance in the same AZ. This feature reduces multi-zone data transfer fees.
//             * `type` - The resource type. Valid Values: CLASSIC, TARGET_GROUP, MULTAI_TARGET_SET.
//
// Usage:
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		return nil
// 	})
// }
// ```
//
// <a id="route53"></a>
// ## route53
//
//    * `integrationRoute53` - (Optional) Describes the [Route53](https://aws.amazon.com/documentation/route53/?id=docs_gateway) integration.
//
//        * `domains` - (Required) Route 53 Domain configurations.
//            * `hostedZoneId` - (Required) The Route 53 Hosted Zone Id for the registered Domain.
//            * `spotinstAcctId` - (Optional) The Spotinst account ID that is linked to the AWS account that holds the Route 53 hosted Zone Id. The default is the user Spotinst account provided as a URL parameter.
//            * `recordSetType` - (Optional, Default: `a`) The type of the record set. Valid values: `"a"`, `"cname"`.
//            * `recordSets` - (Required) List of record sets
//                * `name` - (Required) The record set name.
//                * `usePublicIp` - (Optional, Default: `false`) - Designates whether the IP address should be exposed to connections outside the VPC.
//                * `usePublicDns` - (Optional, Default: `false`) - Designates whether the DNS address should be exposed to connections outside the VPC.
//
// Usage:
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
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
	// Determine the way we attach the data volumes to the data devices. Valid values: `"reattach"`, `"onLaunch"`.
	// Default: `"onLaunch"`.
	BlockDevicesMode pulumi.StringPtrOutput `pulumi:"blockDevicesMode"`
	// cpuCredits can have one of two values: `"unlimited"`, `"standard"`.
	// Default: unlimited
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
	InstanceTypes      pulumi.StringArrayOutput                   `pulumi:"instanceTypes"`
	IntegrationRoute53 ManagedInstanceIntegrationRoute53PtrOutput `pulumi:"integrationRoute53"`
	// Specify a Key Pair to attach to the instances.
	KeyPair pulumi.StringPtrOutput `pulumi:"keyPair"`
	// Set lifecycle, valid values: `"spot"`, `"onDemand"`.
	// Default `"spot"`.
	LifeCycle     pulumi.StringPtrOutput                 `pulumi:"lifeCycle"`
	LoadBalancers ManagedInstanceLoadBalancerArrayOutput `pulumi:"loadBalancers"`
	// The ManagedInstance name.
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
	if args == nil || args.ImageId == nil {
		return nil, errors.New("missing required argument 'ImageId'")
	}
	if args == nil || args.InstanceTypes == nil {
		return nil, errors.New("missing required argument 'InstanceTypes'")
	}
	if args == nil || args.PersistBlockDevices == nil {
		return nil, errors.New("missing required argument 'PersistBlockDevices'")
	}
	if args == nil || args.Product == nil {
		return nil, errors.New("missing required argument 'Product'")
	}
	if args == nil || args.SubnetIds == nil {
		return nil, errors.New("missing required argument 'SubnetIds'")
	}
	if args == nil || args.VpcId == nil {
		return nil, errors.New("missing required argument 'VpcId'")
	}
	if args == nil {
		args = &ManagedInstanceArgs{}
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
	// Determine the way we attach the data volumes to the data devices. Valid values: `"reattach"`, `"onLaunch"`.
	// Default: `"onLaunch"`.
	BlockDevicesMode *string `pulumi:"blockDevicesMode"`
	// cpuCredits can have one of two values: `"unlimited"`, `"standard"`.
	// Default: unlimited
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
	InstanceTypes      []string                           `pulumi:"instanceTypes"`
	IntegrationRoute53 *ManagedInstanceIntegrationRoute53 `pulumi:"integrationRoute53"`
	// Specify a Key Pair to attach to the instances.
	KeyPair *string `pulumi:"keyPair"`
	// Set lifecycle, valid values: `"spot"`, `"onDemand"`.
	// Default `"spot"`.
	LifeCycle     *string                       `pulumi:"lifeCycle"`
	LoadBalancers []ManagedInstanceLoadBalancer `pulumi:"loadBalancers"`
	// The ManagedInstance name.
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
	// Determine the way we attach the data volumes to the data devices. Valid values: `"reattach"`, `"onLaunch"`.
	// Default: `"onLaunch"`.
	BlockDevicesMode pulumi.StringPtrInput
	// cpuCredits can have one of two values: `"unlimited"`, `"standard"`.
	// Default: unlimited
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
	InstanceTypes      pulumi.StringArrayInput
	IntegrationRoute53 ManagedInstanceIntegrationRoute53PtrInput
	// Specify a Key Pair to attach to the instances.
	KeyPair pulumi.StringPtrInput
	// Set lifecycle, valid values: `"spot"`, `"onDemand"`.
	// Default `"spot"`.
	LifeCycle     pulumi.StringPtrInput
	LoadBalancers ManagedInstanceLoadBalancerArrayInput
	// The ManagedInstance name.
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
	// Determine the way we attach the data volumes to the data devices. Valid values: `"reattach"`, `"onLaunch"`.
	// Default: `"onLaunch"`.
	BlockDevicesMode *string `pulumi:"blockDevicesMode"`
	// cpuCredits can have one of two values: `"unlimited"`, `"standard"`.
	// Default: unlimited
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
	InstanceTypes      []string                           `pulumi:"instanceTypes"`
	IntegrationRoute53 *ManagedInstanceIntegrationRoute53 `pulumi:"integrationRoute53"`
	// Specify a Key Pair to attach to the instances.
	KeyPair *string `pulumi:"keyPair"`
	// Set lifecycle, valid values: `"spot"`, `"onDemand"`.
	// Default `"spot"`.
	LifeCycle     *string                       `pulumi:"lifeCycle"`
	LoadBalancers []ManagedInstanceLoadBalancer `pulumi:"loadBalancers"`
	// The ManagedInstance name.
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
	// Determine the way we attach the data volumes to the data devices. Valid values: `"reattach"`, `"onLaunch"`.
	// Default: `"onLaunch"`.
	BlockDevicesMode pulumi.StringPtrInput
	// cpuCredits can have one of two values: `"unlimited"`, `"standard"`.
	// Default: unlimited
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
	InstanceTypes      pulumi.StringArrayInput
	IntegrationRoute53 ManagedInstanceIntegrationRoute53PtrInput
	// Specify a Key Pair to attach to the instances.
	KeyPair pulumi.StringPtrInput
	// Set lifecycle, valid values: `"spot"`, `"onDemand"`.
	// Default `"spot"`.
	LifeCycle     pulumi.StringPtrInput
	LoadBalancers ManagedInstanceLoadBalancerArrayInput
	// The ManagedInstance name.
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

func (ManagedInstance) ElementType() reflect.Type {
	return reflect.TypeOf((*ManagedInstance)(nil)).Elem()
}

func (i ManagedInstance) ToManagedInstanceOutput() ManagedInstanceOutput {
	return i.ToManagedInstanceOutputWithContext(context.Background())
}

func (i ManagedInstance) ToManagedInstanceOutputWithContext(ctx context.Context) ManagedInstanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ManagedInstanceOutput)
}

type ManagedInstanceOutput struct {
	*pulumi.OutputState
}

func (ManagedInstanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ManagedInstanceOutput)(nil)).Elem()
}

func (o ManagedInstanceOutput) ToManagedInstanceOutput() ManagedInstanceOutput {
	return o
}

func (o ManagedInstanceOutput) ToManagedInstanceOutputWithContext(ctx context.Context) ManagedInstanceOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(ManagedInstanceOutput{})
}
