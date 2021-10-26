// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package gcp

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Spotinst elastigroup GCP resource.
type Elastigroup struct {
	pulumi.CustomResourceState

	// Enable auto-replacement of unhealthy instances.
	AutoHealing pulumi.BoolPtrOutput `pulumi:"autoHealing"`
	// List of availability zones for the group.
	//
	// Deprecated: This field will soon be handled by Region in Subnets
	AvailabilityZones pulumi.StringArrayOutput `pulumi:"availabilityZones"`
	// Describes the backend service configurations.
	BackendServices ElastigroupBackendServiceArrayOutput `pulumi:"backendServices"`
	// The region your GCP group will be created in.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The desired number of instances the group should have at any time.
	DesiredCapacity pulumi.IntOutput           `pulumi:"desiredCapacity"`
	Disks           ElastigroupDiskArrayOutput `pulumi:"disks"`
	// Time (seconds) the instance is allowed to run after it is detached from the group. This is to allow the instance time to drain all the current TCP connections before terminating it.
	DrainingTimeout pulumi.IntPtrOutput `pulumi:"drainingTimeout"`
	// Activate fallback-to-on-demand. When provisioning an instance, if no Preemptible market is available, fallback-to-on-demand will provision an On-Demand instance to maintain the group capacity.
	FallbackToOndemand pulumi.BoolPtrOutput `pulumi:"fallbackToOndemand"`
	// Defines the GPU configuration.
	Gpu ElastigroupGpuArrayOutput `pulumi:"gpu"`
	// Period of time (seconds) to wait for VM to reach healthiness before monitoring for unhealthiness.
	HealthCheckGracePeriod pulumi.IntPtrOutput `pulumi:"healthCheckGracePeriod"`
	// The kind of health check to perform when monitoring for unhealthiness.
	HealthCheckType pulumi.StringPtrOutput `pulumi:"healthCheckType"`
	// Defines a set of custom instance types. Required if instanceTypesPreemptible and instanceTypesOndemand are not set.
	InstanceTypesCustoms ElastigroupInstanceTypesCustomArrayOutput `pulumi:"instanceTypesCustoms"`
	// The regular VM instance type to use for mixed-type groups and when falling back to on-demand. Required if instanceTypesPreemptible is not set.
	InstanceTypesOndemand pulumi.StringPtrOutput `pulumi:"instanceTypesOndemand"`
	// The preemptible VMs instance type. To maximize cost savings and market availability, select as many types as possible. Required if instanceTypesOndemand is not set.
	InstanceTypesPreemptibles pulumi.StringArrayOutput `pulumi:"instanceTypesPreemptibles"`
	// Describes the [Docker Swarm](https://api.spotinst.com/integration-docs/elastigroup/container-management/docker-swarm/docker-swarm-integration/) integration.
	IntegrationDockerSwarm ElastigroupIntegrationDockerSwarmPtrOutput `pulumi:"integrationDockerSwarm"`
	IntegrationGke         ElastigroupIntegrationGkePtrOutput         `pulumi:"integrationGke"`
	IpForwarding           pulumi.BoolPtrOutput                       `pulumi:"ipForwarding"`
	// Array of objects with key-value pairs.
	Labels ElastigroupLabelArrayOutput `pulumi:"labels"`
	// The maximum number of instances the group should have at any time.
	MaxSize pulumi.IntOutput `pulumi:"maxSize"`
	// Array of objects with key-value pairs.
	Metadatas ElastigroupMetadataArrayOutput `pulumi:"metadatas"`
	// The minimum number of instances the group should have at any time.
	MinSize pulumi.IntOutput `pulumi:"minSize"`
	// The dimension name.
	Name pulumi.StringOutput `pulumi:"name"`
	// Array of objects representing the network configuration for the elastigroup.
	NetworkInterfaces ElastigroupNetworkInterfaceArrayOutput `pulumi:"networkInterfaces"`
	OndemandCount     pulumi.IntPtrOutput                    `pulumi:"ondemandCount"`
	// Percentage of Preemptible VMs to spin up from the "desiredCapacity".
	PreemptiblePercentage pulumi.IntPtrOutput `pulumi:"preemptiblePercentage"`
	// Valid values: "SPOT", "PREEMPTIBLE". Define the provisioning model of the launched instances. Default value is "PREEMPTIBLE".
	ProvisioningModel pulumi.StringPtrOutput `pulumi:"provisioningModel"`
	// Contains scaling policies for scaling the Elastigroup down.
	ScalingDownPolicies ElastigroupScalingDownPolicyArrayOutput `pulumi:"scalingDownPolicies"`
	// Contains scaling policies for scaling the Elastigroup up.
	ScalingUpPolicies ElastigroupScalingUpPolicyArrayOutput `pulumi:"scalingUpPolicies"`
	ScheduledTasks    ElastigroupScheduledTaskArrayOutput   `pulumi:"scheduledTasks"`
	// The email of the service account in which the group instances will be launched.
	ServiceAccount pulumi.StringPtrOutput `pulumi:"serviceAccount"`
	// The Base64-encoded shutdown script that executes prior to instance termination, for more information please see: [Shutdown Script](https://api.spotinst.com/integration-docs/elastigroup/concepts/compute-concepts/shutdown-scripts/)
	ShutdownScript pulumi.StringPtrOutput `pulumi:"shutdownScript"`
	// Create and run your own startup scripts on your virtual machines to perform automated tasks every time your instance boots up.
	StartupScript pulumi.StringPtrOutput `pulumi:"startupScript"`
	// A list of regions and subnets.
	Subnets ElastigroupSubnetArrayOutput `pulumi:"subnets"`
	// Tags to mark created instances.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// Period of time (seconds) to remain in an unhealthy status before a replacement is triggered.
	UnhealthyDuration pulumi.IntPtrOutput `pulumi:"unhealthyDuration"`
}

// NewElastigroup registers a new resource with the given unique name, arguments, and options.
func NewElastigroup(ctx *pulumi.Context,
	name string, args *ElastigroupArgs, opts ...pulumi.ResourceOption) (*Elastigroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DesiredCapacity == nil {
		return nil, errors.New("invalid value for required argument 'DesiredCapacity'")
	}
	var resource Elastigroup
	err := ctx.RegisterResource("spotinst:gcp/elastigroup:Elastigroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetElastigroup gets an existing Elastigroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetElastigroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ElastigroupState, opts ...pulumi.ResourceOption) (*Elastigroup, error) {
	var resource Elastigroup
	err := ctx.ReadResource("spotinst:gcp/elastigroup:Elastigroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Elastigroup resources.
type elastigroupState struct {
	// Enable auto-replacement of unhealthy instances.
	AutoHealing *bool `pulumi:"autoHealing"`
	// List of availability zones for the group.
	//
	// Deprecated: This field will soon be handled by Region in Subnets
	AvailabilityZones []string `pulumi:"availabilityZones"`
	// Describes the backend service configurations.
	BackendServices []ElastigroupBackendService `pulumi:"backendServices"`
	// The region your GCP group will be created in.
	Description *string `pulumi:"description"`
	// The desired number of instances the group should have at any time.
	DesiredCapacity *int              `pulumi:"desiredCapacity"`
	Disks           []ElastigroupDisk `pulumi:"disks"`
	// Time (seconds) the instance is allowed to run after it is detached from the group. This is to allow the instance time to drain all the current TCP connections before terminating it.
	DrainingTimeout *int `pulumi:"drainingTimeout"`
	// Activate fallback-to-on-demand. When provisioning an instance, if no Preemptible market is available, fallback-to-on-demand will provision an On-Demand instance to maintain the group capacity.
	FallbackToOndemand *bool `pulumi:"fallbackToOndemand"`
	// Defines the GPU configuration.
	Gpu []ElastigroupGpu `pulumi:"gpu"`
	// Period of time (seconds) to wait for VM to reach healthiness before monitoring for unhealthiness.
	HealthCheckGracePeriod *int `pulumi:"healthCheckGracePeriod"`
	// The kind of health check to perform when monitoring for unhealthiness.
	HealthCheckType *string `pulumi:"healthCheckType"`
	// Defines a set of custom instance types. Required if instanceTypesPreemptible and instanceTypesOndemand are not set.
	InstanceTypesCustoms []ElastigroupInstanceTypesCustom `pulumi:"instanceTypesCustoms"`
	// The regular VM instance type to use for mixed-type groups and when falling back to on-demand. Required if instanceTypesPreemptible is not set.
	InstanceTypesOndemand *string `pulumi:"instanceTypesOndemand"`
	// The preemptible VMs instance type. To maximize cost savings and market availability, select as many types as possible. Required if instanceTypesOndemand is not set.
	InstanceTypesPreemptibles []string `pulumi:"instanceTypesPreemptibles"`
	// Describes the [Docker Swarm](https://api.spotinst.com/integration-docs/elastigroup/container-management/docker-swarm/docker-swarm-integration/) integration.
	IntegrationDockerSwarm *ElastigroupIntegrationDockerSwarm `pulumi:"integrationDockerSwarm"`
	IntegrationGke         *ElastigroupIntegrationGke         `pulumi:"integrationGke"`
	IpForwarding           *bool                              `pulumi:"ipForwarding"`
	// Array of objects with key-value pairs.
	Labels []ElastigroupLabel `pulumi:"labels"`
	// The maximum number of instances the group should have at any time.
	MaxSize *int `pulumi:"maxSize"`
	// Array of objects with key-value pairs.
	Metadatas []ElastigroupMetadata `pulumi:"metadatas"`
	// The minimum number of instances the group should have at any time.
	MinSize *int `pulumi:"minSize"`
	// The dimension name.
	Name *string `pulumi:"name"`
	// Array of objects representing the network configuration for the elastigroup.
	NetworkInterfaces []ElastigroupNetworkInterface `pulumi:"networkInterfaces"`
	OndemandCount     *int                          `pulumi:"ondemandCount"`
	// Percentage of Preemptible VMs to spin up from the "desiredCapacity".
	PreemptiblePercentage *int `pulumi:"preemptiblePercentage"`
	// Valid values: "SPOT", "PREEMPTIBLE". Define the provisioning model of the launched instances. Default value is "PREEMPTIBLE".
	ProvisioningModel *string `pulumi:"provisioningModel"`
	// Contains scaling policies for scaling the Elastigroup down.
	ScalingDownPolicies []ElastigroupScalingDownPolicy `pulumi:"scalingDownPolicies"`
	// Contains scaling policies for scaling the Elastigroup up.
	ScalingUpPolicies []ElastigroupScalingUpPolicy `pulumi:"scalingUpPolicies"`
	ScheduledTasks    []ElastigroupScheduledTask   `pulumi:"scheduledTasks"`
	// The email of the service account in which the group instances will be launched.
	ServiceAccount *string `pulumi:"serviceAccount"`
	// The Base64-encoded shutdown script that executes prior to instance termination, for more information please see: [Shutdown Script](https://api.spotinst.com/integration-docs/elastigroup/concepts/compute-concepts/shutdown-scripts/)
	ShutdownScript *string `pulumi:"shutdownScript"`
	// Create and run your own startup scripts on your virtual machines to perform automated tasks every time your instance boots up.
	StartupScript *string `pulumi:"startupScript"`
	// A list of regions and subnets.
	Subnets []ElastigroupSubnet `pulumi:"subnets"`
	// Tags to mark created instances.
	Tags []string `pulumi:"tags"`
	// Period of time (seconds) to remain in an unhealthy status before a replacement is triggered.
	UnhealthyDuration *int `pulumi:"unhealthyDuration"`
}

type ElastigroupState struct {
	// Enable auto-replacement of unhealthy instances.
	AutoHealing pulumi.BoolPtrInput
	// List of availability zones for the group.
	//
	// Deprecated: This field will soon be handled by Region in Subnets
	AvailabilityZones pulumi.StringArrayInput
	// Describes the backend service configurations.
	BackendServices ElastigroupBackendServiceArrayInput
	// The region your GCP group will be created in.
	Description pulumi.StringPtrInput
	// The desired number of instances the group should have at any time.
	DesiredCapacity pulumi.IntPtrInput
	Disks           ElastigroupDiskArrayInput
	// Time (seconds) the instance is allowed to run after it is detached from the group. This is to allow the instance time to drain all the current TCP connections before terminating it.
	DrainingTimeout pulumi.IntPtrInput
	// Activate fallback-to-on-demand. When provisioning an instance, if no Preemptible market is available, fallback-to-on-demand will provision an On-Demand instance to maintain the group capacity.
	FallbackToOndemand pulumi.BoolPtrInput
	// Defines the GPU configuration.
	Gpu ElastigroupGpuArrayInput
	// Period of time (seconds) to wait for VM to reach healthiness before monitoring for unhealthiness.
	HealthCheckGracePeriod pulumi.IntPtrInput
	// The kind of health check to perform when monitoring for unhealthiness.
	HealthCheckType pulumi.StringPtrInput
	// Defines a set of custom instance types. Required if instanceTypesPreemptible and instanceTypesOndemand are not set.
	InstanceTypesCustoms ElastigroupInstanceTypesCustomArrayInput
	// The regular VM instance type to use for mixed-type groups and when falling back to on-demand. Required if instanceTypesPreemptible is not set.
	InstanceTypesOndemand pulumi.StringPtrInput
	// The preemptible VMs instance type. To maximize cost savings and market availability, select as many types as possible. Required if instanceTypesOndemand is not set.
	InstanceTypesPreemptibles pulumi.StringArrayInput
	// Describes the [Docker Swarm](https://api.spotinst.com/integration-docs/elastigroup/container-management/docker-swarm/docker-swarm-integration/) integration.
	IntegrationDockerSwarm ElastigroupIntegrationDockerSwarmPtrInput
	IntegrationGke         ElastigroupIntegrationGkePtrInput
	IpForwarding           pulumi.BoolPtrInput
	// Array of objects with key-value pairs.
	Labels ElastigroupLabelArrayInput
	// The maximum number of instances the group should have at any time.
	MaxSize pulumi.IntPtrInput
	// Array of objects with key-value pairs.
	Metadatas ElastigroupMetadataArrayInput
	// The minimum number of instances the group should have at any time.
	MinSize pulumi.IntPtrInput
	// The dimension name.
	Name pulumi.StringPtrInput
	// Array of objects representing the network configuration for the elastigroup.
	NetworkInterfaces ElastigroupNetworkInterfaceArrayInput
	OndemandCount     pulumi.IntPtrInput
	// Percentage of Preemptible VMs to spin up from the "desiredCapacity".
	PreemptiblePercentage pulumi.IntPtrInput
	// Valid values: "SPOT", "PREEMPTIBLE". Define the provisioning model of the launched instances. Default value is "PREEMPTIBLE".
	ProvisioningModel pulumi.StringPtrInput
	// Contains scaling policies for scaling the Elastigroup down.
	ScalingDownPolicies ElastigroupScalingDownPolicyArrayInput
	// Contains scaling policies for scaling the Elastigroup up.
	ScalingUpPolicies ElastigroupScalingUpPolicyArrayInput
	ScheduledTasks    ElastigroupScheduledTaskArrayInput
	// The email of the service account in which the group instances will be launched.
	ServiceAccount pulumi.StringPtrInput
	// The Base64-encoded shutdown script that executes prior to instance termination, for more information please see: [Shutdown Script](https://api.spotinst.com/integration-docs/elastigroup/concepts/compute-concepts/shutdown-scripts/)
	ShutdownScript pulumi.StringPtrInput
	// Create and run your own startup scripts on your virtual machines to perform automated tasks every time your instance boots up.
	StartupScript pulumi.StringPtrInput
	// A list of regions and subnets.
	Subnets ElastigroupSubnetArrayInput
	// Tags to mark created instances.
	Tags pulumi.StringArrayInput
	// Period of time (seconds) to remain in an unhealthy status before a replacement is triggered.
	UnhealthyDuration pulumi.IntPtrInput
}

func (ElastigroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*elastigroupState)(nil)).Elem()
}

type elastigroupArgs struct {
	// Enable auto-replacement of unhealthy instances.
	AutoHealing *bool `pulumi:"autoHealing"`
	// List of availability zones for the group.
	//
	// Deprecated: This field will soon be handled by Region in Subnets
	AvailabilityZones []string `pulumi:"availabilityZones"`
	// Describes the backend service configurations.
	BackendServices []ElastigroupBackendService `pulumi:"backendServices"`
	// The region your GCP group will be created in.
	Description *string `pulumi:"description"`
	// The desired number of instances the group should have at any time.
	DesiredCapacity int               `pulumi:"desiredCapacity"`
	Disks           []ElastigroupDisk `pulumi:"disks"`
	// Time (seconds) the instance is allowed to run after it is detached from the group. This is to allow the instance time to drain all the current TCP connections before terminating it.
	DrainingTimeout *int `pulumi:"drainingTimeout"`
	// Activate fallback-to-on-demand. When provisioning an instance, if no Preemptible market is available, fallback-to-on-demand will provision an On-Demand instance to maintain the group capacity.
	FallbackToOndemand *bool `pulumi:"fallbackToOndemand"`
	// Defines the GPU configuration.
	Gpu []ElastigroupGpu `pulumi:"gpu"`
	// Period of time (seconds) to wait for VM to reach healthiness before monitoring for unhealthiness.
	HealthCheckGracePeriod *int `pulumi:"healthCheckGracePeriod"`
	// The kind of health check to perform when monitoring for unhealthiness.
	HealthCheckType *string `pulumi:"healthCheckType"`
	// Defines a set of custom instance types. Required if instanceTypesPreemptible and instanceTypesOndemand are not set.
	InstanceTypesCustoms []ElastigroupInstanceTypesCustom `pulumi:"instanceTypesCustoms"`
	// The regular VM instance type to use for mixed-type groups and when falling back to on-demand. Required if instanceTypesPreemptible is not set.
	InstanceTypesOndemand *string `pulumi:"instanceTypesOndemand"`
	// The preemptible VMs instance type. To maximize cost savings and market availability, select as many types as possible. Required if instanceTypesOndemand is not set.
	InstanceTypesPreemptibles []string `pulumi:"instanceTypesPreemptibles"`
	// Describes the [Docker Swarm](https://api.spotinst.com/integration-docs/elastigroup/container-management/docker-swarm/docker-swarm-integration/) integration.
	IntegrationDockerSwarm *ElastigroupIntegrationDockerSwarm `pulumi:"integrationDockerSwarm"`
	IntegrationGke         *ElastigroupIntegrationGke         `pulumi:"integrationGke"`
	IpForwarding           *bool                              `pulumi:"ipForwarding"`
	// Array of objects with key-value pairs.
	Labels []ElastigroupLabel `pulumi:"labels"`
	// The maximum number of instances the group should have at any time.
	MaxSize *int `pulumi:"maxSize"`
	// Array of objects with key-value pairs.
	Metadatas []ElastigroupMetadata `pulumi:"metadatas"`
	// The minimum number of instances the group should have at any time.
	MinSize *int `pulumi:"minSize"`
	// The dimension name.
	Name *string `pulumi:"name"`
	// Array of objects representing the network configuration for the elastigroup.
	NetworkInterfaces []ElastigroupNetworkInterface `pulumi:"networkInterfaces"`
	OndemandCount     *int                          `pulumi:"ondemandCount"`
	// Percentage of Preemptible VMs to spin up from the "desiredCapacity".
	PreemptiblePercentage *int `pulumi:"preemptiblePercentage"`
	// Valid values: "SPOT", "PREEMPTIBLE". Define the provisioning model of the launched instances. Default value is "PREEMPTIBLE".
	ProvisioningModel *string `pulumi:"provisioningModel"`
	// Contains scaling policies for scaling the Elastigroup down.
	ScalingDownPolicies []ElastigroupScalingDownPolicy `pulumi:"scalingDownPolicies"`
	// Contains scaling policies for scaling the Elastigroup up.
	ScalingUpPolicies []ElastigroupScalingUpPolicy `pulumi:"scalingUpPolicies"`
	ScheduledTasks    []ElastigroupScheduledTask   `pulumi:"scheduledTasks"`
	// The email of the service account in which the group instances will be launched.
	ServiceAccount *string `pulumi:"serviceAccount"`
	// The Base64-encoded shutdown script that executes prior to instance termination, for more information please see: [Shutdown Script](https://api.spotinst.com/integration-docs/elastigroup/concepts/compute-concepts/shutdown-scripts/)
	ShutdownScript *string `pulumi:"shutdownScript"`
	// Create and run your own startup scripts on your virtual machines to perform automated tasks every time your instance boots up.
	StartupScript *string `pulumi:"startupScript"`
	// A list of regions and subnets.
	Subnets []ElastigroupSubnet `pulumi:"subnets"`
	// Tags to mark created instances.
	Tags []string `pulumi:"tags"`
	// Period of time (seconds) to remain in an unhealthy status before a replacement is triggered.
	UnhealthyDuration *int `pulumi:"unhealthyDuration"`
}

// The set of arguments for constructing a Elastigroup resource.
type ElastigroupArgs struct {
	// Enable auto-replacement of unhealthy instances.
	AutoHealing pulumi.BoolPtrInput
	// List of availability zones for the group.
	//
	// Deprecated: This field will soon be handled by Region in Subnets
	AvailabilityZones pulumi.StringArrayInput
	// Describes the backend service configurations.
	BackendServices ElastigroupBackendServiceArrayInput
	// The region your GCP group will be created in.
	Description pulumi.StringPtrInput
	// The desired number of instances the group should have at any time.
	DesiredCapacity pulumi.IntInput
	Disks           ElastigroupDiskArrayInput
	// Time (seconds) the instance is allowed to run after it is detached from the group. This is to allow the instance time to drain all the current TCP connections before terminating it.
	DrainingTimeout pulumi.IntPtrInput
	// Activate fallback-to-on-demand. When provisioning an instance, if no Preemptible market is available, fallback-to-on-demand will provision an On-Demand instance to maintain the group capacity.
	FallbackToOndemand pulumi.BoolPtrInput
	// Defines the GPU configuration.
	Gpu ElastigroupGpuArrayInput
	// Period of time (seconds) to wait for VM to reach healthiness before monitoring for unhealthiness.
	HealthCheckGracePeriod pulumi.IntPtrInput
	// The kind of health check to perform when monitoring for unhealthiness.
	HealthCheckType pulumi.StringPtrInput
	// Defines a set of custom instance types. Required if instanceTypesPreemptible and instanceTypesOndemand are not set.
	InstanceTypesCustoms ElastigroupInstanceTypesCustomArrayInput
	// The regular VM instance type to use for mixed-type groups and when falling back to on-demand. Required if instanceTypesPreemptible is not set.
	InstanceTypesOndemand pulumi.StringPtrInput
	// The preemptible VMs instance type. To maximize cost savings and market availability, select as many types as possible. Required if instanceTypesOndemand is not set.
	InstanceTypesPreemptibles pulumi.StringArrayInput
	// Describes the [Docker Swarm](https://api.spotinst.com/integration-docs/elastigroup/container-management/docker-swarm/docker-swarm-integration/) integration.
	IntegrationDockerSwarm ElastigroupIntegrationDockerSwarmPtrInput
	IntegrationGke         ElastigroupIntegrationGkePtrInput
	IpForwarding           pulumi.BoolPtrInput
	// Array of objects with key-value pairs.
	Labels ElastigroupLabelArrayInput
	// The maximum number of instances the group should have at any time.
	MaxSize pulumi.IntPtrInput
	// Array of objects with key-value pairs.
	Metadatas ElastigroupMetadataArrayInput
	// The minimum number of instances the group should have at any time.
	MinSize pulumi.IntPtrInput
	// The dimension name.
	Name pulumi.StringPtrInput
	// Array of objects representing the network configuration for the elastigroup.
	NetworkInterfaces ElastigroupNetworkInterfaceArrayInput
	OndemandCount     pulumi.IntPtrInput
	// Percentage of Preemptible VMs to spin up from the "desiredCapacity".
	PreemptiblePercentage pulumi.IntPtrInput
	// Valid values: "SPOT", "PREEMPTIBLE". Define the provisioning model of the launched instances. Default value is "PREEMPTIBLE".
	ProvisioningModel pulumi.StringPtrInput
	// Contains scaling policies for scaling the Elastigroup down.
	ScalingDownPolicies ElastigroupScalingDownPolicyArrayInput
	// Contains scaling policies for scaling the Elastigroup up.
	ScalingUpPolicies ElastigroupScalingUpPolicyArrayInput
	ScheduledTasks    ElastigroupScheduledTaskArrayInput
	// The email of the service account in which the group instances will be launched.
	ServiceAccount pulumi.StringPtrInput
	// The Base64-encoded shutdown script that executes prior to instance termination, for more information please see: [Shutdown Script](https://api.spotinst.com/integration-docs/elastigroup/concepts/compute-concepts/shutdown-scripts/)
	ShutdownScript pulumi.StringPtrInput
	// Create and run your own startup scripts on your virtual machines to perform automated tasks every time your instance boots up.
	StartupScript pulumi.StringPtrInput
	// A list of regions and subnets.
	Subnets ElastigroupSubnetArrayInput
	// Tags to mark created instances.
	Tags pulumi.StringArrayInput
	// Period of time (seconds) to remain in an unhealthy status before a replacement is triggered.
	UnhealthyDuration pulumi.IntPtrInput
}

func (ElastigroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*elastigroupArgs)(nil)).Elem()
}

type ElastigroupInput interface {
	pulumi.Input

	ToElastigroupOutput() ElastigroupOutput
	ToElastigroupOutputWithContext(ctx context.Context) ElastigroupOutput
}

func (*Elastigroup) ElementType() reflect.Type {
	return reflect.TypeOf((*Elastigroup)(nil))
}

func (i *Elastigroup) ToElastigroupOutput() ElastigroupOutput {
	return i.ToElastigroupOutputWithContext(context.Background())
}

func (i *Elastigroup) ToElastigroupOutputWithContext(ctx context.Context) ElastigroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ElastigroupOutput)
}

func (i *Elastigroup) ToElastigroupPtrOutput() ElastigroupPtrOutput {
	return i.ToElastigroupPtrOutputWithContext(context.Background())
}

func (i *Elastigroup) ToElastigroupPtrOutputWithContext(ctx context.Context) ElastigroupPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ElastigroupPtrOutput)
}

type ElastigroupPtrInput interface {
	pulumi.Input

	ToElastigroupPtrOutput() ElastigroupPtrOutput
	ToElastigroupPtrOutputWithContext(ctx context.Context) ElastigroupPtrOutput
}

type elastigroupPtrType ElastigroupArgs

func (*elastigroupPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Elastigroup)(nil))
}

func (i *elastigroupPtrType) ToElastigroupPtrOutput() ElastigroupPtrOutput {
	return i.ToElastigroupPtrOutputWithContext(context.Background())
}

func (i *elastigroupPtrType) ToElastigroupPtrOutputWithContext(ctx context.Context) ElastigroupPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ElastigroupPtrOutput)
}

// ElastigroupArrayInput is an input type that accepts ElastigroupArray and ElastigroupArrayOutput values.
// You can construct a concrete instance of `ElastigroupArrayInput` via:
//
//          ElastigroupArray{ ElastigroupArgs{...} }
type ElastigroupArrayInput interface {
	pulumi.Input

	ToElastigroupArrayOutput() ElastigroupArrayOutput
	ToElastigroupArrayOutputWithContext(context.Context) ElastigroupArrayOutput
}

type ElastigroupArray []ElastigroupInput

func (ElastigroupArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*Elastigroup)(nil))
}

func (i ElastigroupArray) ToElastigroupArrayOutput() ElastigroupArrayOutput {
	return i.ToElastigroupArrayOutputWithContext(context.Background())
}

func (i ElastigroupArray) ToElastigroupArrayOutputWithContext(ctx context.Context) ElastigroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ElastigroupArrayOutput)
}

// ElastigroupMapInput is an input type that accepts ElastigroupMap and ElastigroupMapOutput values.
// You can construct a concrete instance of `ElastigroupMapInput` via:
//
//          ElastigroupMap{ "key": ElastigroupArgs{...} }
type ElastigroupMapInput interface {
	pulumi.Input

	ToElastigroupMapOutput() ElastigroupMapOutput
	ToElastigroupMapOutputWithContext(context.Context) ElastigroupMapOutput
}

type ElastigroupMap map[string]ElastigroupInput

func (ElastigroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*Elastigroup)(nil))
}

func (i ElastigroupMap) ToElastigroupMapOutput() ElastigroupMapOutput {
	return i.ToElastigroupMapOutputWithContext(context.Background())
}

func (i ElastigroupMap) ToElastigroupMapOutputWithContext(ctx context.Context) ElastigroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ElastigroupMapOutput)
}

type ElastigroupOutput struct {
	*pulumi.OutputState
}

func (ElastigroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Elastigroup)(nil))
}

func (o ElastigroupOutput) ToElastigroupOutput() ElastigroupOutput {
	return o
}

func (o ElastigroupOutput) ToElastigroupOutputWithContext(ctx context.Context) ElastigroupOutput {
	return o
}

func (o ElastigroupOutput) ToElastigroupPtrOutput() ElastigroupPtrOutput {
	return o.ToElastigroupPtrOutputWithContext(context.Background())
}

func (o ElastigroupOutput) ToElastigroupPtrOutputWithContext(ctx context.Context) ElastigroupPtrOutput {
	return o.ApplyT(func(v Elastigroup) *Elastigroup {
		return &v
	}).(ElastigroupPtrOutput)
}

type ElastigroupPtrOutput struct {
	*pulumi.OutputState
}

func (ElastigroupPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Elastigroup)(nil))
}

func (o ElastigroupPtrOutput) ToElastigroupPtrOutput() ElastigroupPtrOutput {
	return o
}

func (o ElastigroupPtrOutput) ToElastigroupPtrOutputWithContext(ctx context.Context) ElastigroupPtrOutput {
	return o
}

type ElastigroupArrayOutput struct{ *pulumi.OutputState }

func (ElastigroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Elastigroup)(nil))
}

func (o ElastigroupArrayOutput) ToElastigroupArrayOutput() ElastigroupArrayOutput {
	return o
}

func (o ElastigroupArrayOutput) ToElastigroupArrayOutputWithContext(ctx context.Context) ElastigroupArrayOutput {
	return o
}

func (o ElastigroupArrayOutput) Index(i pulumi.IntInput) ElastigroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Elastigroup {
		return vs[0].([]Elastigroup)[vs[1].(int)]
	}).(ElastigroupOutput)
}

type ElastigroupMapOutput struct{ *pulumi.OutputState }

func (ElastigroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Elastigroup)(nil))
}

func (o ElastigroupMapOutput) ToElastigroupMapOutput() ElastigroupMapOutput {
	return o
}

func (o ElastigroupMapOutput) ToElastigroupMapOutputWithContext(ctx context.Context) ElastigroupMapOutput {
	return o
}

func (o ElastigroupMapOutput) MapIndex(k pulumi.StringInput) ElastigroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Elastigroup {
		return vs[0].(map[string]Elastigroup)[vs[1].(string)]
	}).(ElastigroupOutput)
}

func init() {
	pulumi.RegisterOutputType(ElastigroupOutput{})
	pulumi.RegisterOutputType(ElastigroupPtrOutput{})
	pulumi.RegisterOutputType(ElastigroupArrayOutput{})
	pulumi.RegisterOutputType(ElastigroupMapOutput{})
}
