// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gcp
{
    /// <summary>
    /// Provides a Spotinst elastigroup GCP resource.
    /// </summary>
    [SpotInstResourceType("spotinst:gcp/elastigroup:Elastigroup")]
    public partial class Elastigroup : Pulumi.CustomResource
    {
        /// <summary>
        /// Enable auto-replacement of unhealthy instances.
        /// </summary>
        [Output("autoHealing")]
        public Output<bool?> AutoHealing { get; private set; } = null!;

        /// <summary>
        /// List of availability zones for the group.
        /// </summary>
        [Output("availabilityZones")]
        public Output<ImmutableArray<string>> AvailabilityZones { get; private set; } = null!;

        /// <summary>
        /// Describes the backend service configurations.
        /// </summary>
        [Output("backendServices")]
        public Output<ImmutableArray<Outputs.ElastigroupBackendService>> BackendServices { get; private set; } = null!;

        /// <summary>
        /// The region your GCP group will be created in.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The desired number of instances the group should have at any time.
        /// </summary>
        [Output("desiredCapacity")]
        public Output<int> DesiredCapacity { get; private set; } = null!;

        [Output("disks")]
        public Output<ImmutableArray<Outputs.ElastigroupDisk>> Disks { get; private set; } = null!;

        /// <summary>
        /// Time (seconds) the instance is allowed to run after it is detached from the group. This is to allow the instance time to drain all the current TCP connections before terminating it.
        /// </summary>
        [Output("drainingTimeout")]
        public Output<int?> DrainingTimeout { get; private set; } = null!;

        /// <summary>
        /// Activate fallback-to-on-demand. When provisioning an instance, if no Preemptible market is available, fallback-to-on-demand will provision an On-Demand instance to maintain the group capacity.
        /// </summary>
        [Output("fallbackToOndemand")]
        public Output<bool?> FallbackToOndemand { get; private set; } = null!;

        /// <summary>
        /// Defines the GPU configuration.
        /// </summary>
        [Output("gpu")]
        public Output<ImmutableArray<Outputs.ElastigroupGpu>> Gpu { get; private set; } = null!;

        /// <summary>
        /// Period of time (seconds) to wait for VM to reach healthiness before monitoring for unhealthiness.
        /// </summary>
        [Output("healthCheckGracePeriod")]
        public Output<int?> HealthCheckGracePeriod { get; private set; } = null!;

        /// <summary>
        /// The kind of health check to perform when monitoring for unhealthiness.
        /// </summary>
        [Output("healthCheckType")]
        public Output<string?> HealthCheckType { get; private set; } = null!;

        /// <summary>
        /// Defines a set of custom instance types. Required if instance_types_preemptible and instance_types_ondemand are not set.
        /// </summary>
        [Output("instanceTypesCustoms")]
        public Output<ImmutableArray<Outputs.ElastigroupInstanceTypesCustom>> InstanceTypesCustoms { get; private set; } = null!;

        /// <summary>
        /// The regular VM instance type to use for mixed-type groups and when falling back to on-demand. Required if instance_types_preemptible is not set.
        /// </summary>
        [Output("instanceTypesOndemand")]
        public Output<string?> InstanceTypesOndemand { get; private set; } = null!;

        /// <summary>
        /// The preemptible VMs instance type. To maximize cost savings and market availability, select as many types as possible. Required if instance_types_ondemand is not set.
        /// </summary>
        [Output("instanceTypesPreemptibles")]
        public Output<ImmutableArray<string>> InstanceTypesPreemptibles { get; private set; } = null!;

        /// <summary>
        /// Describes the [Docker Swarm](https://api.spotinst.com/integration-docs/elastigroup/container-management/docker-swarm/docker-swarm-integration/) integration.
        /// </summary>
        [Output("integrationDockerSwarm")]
        public Output<Outputs.ElastigroupIntegrationDockerSwarm?> IntegrationDockerSwarm { get; private set; } = null!;

        [Output("integrationGke")]
        public Output<Outputs.ElastigroupIntegrationGke?> IntegrationGke { get; private set; } = null!;

        [Output("ipForwarding")]
        public Output<bool?> IpForwarding { get; private set; } = null!;

        /// <summary>
        /// Array of objects with key-value pairs.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableArray<Outputs.ElastigroupLabel>> Labels { get; private set; } = null!;

        /// <summary>
        /// The maximum number of instances the group should have at any time.
        /// </summary>
        [Output("maxSize")]
        public Output<int> MaxSize { get; private set; } = null!;

        /// <summary>
        /// Array of objects with key-value pairs.
        /// </summary>
        [Output("metadatas")]
        public Output<ImmutableArray<Outputs.ElastigroupMetadata>> Metadatas { get; private set; } = null!;

        /// <summary>
        /// The minimum number of instances the group should have at any time.
        /// </summary>
        [Output("minSize")]
        public Output<int> MinSize { get; private set; } = null!;

        /// <summary>
        /// The dimension name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Array of objects representing the network configuration for the elastigroup.
        /// </summary>
        [Output("networkInterfaces")]
        public Output<ImmutableArray<Outputs.ElastigroupNetworkInterface>> NetworkInterfaces { get; private set; } = null!;

        [Output("ondemandCount")]
        public Output<int?> OndemandCount { get; private set; } = null!;

        /// <summary>
        /// Percentage of Preemptible VMs to spin up from the "desired_capacity".
        /// </summary>
        [Output("preemptiblePercentage")]
        public Output<int?> PreemptiblePercentage { get; private set; } = null!;

        /// <summary>
        /// Contains scaling policies for scaling the Elastigroup down.
        /// </summary>
        [Output("scalingDownPolicies")]
        public Output<ImmutableArray<Outputs.ElastigroupScalingDownPolicy>> ScalingDownPolicies { get; private set; } = null!;

        /// <summary>
        /// Contains scaling policies for scaling the Elastigroup up.
        /// </summary>
        [Output("scalingUpPolicies")]
        public Output<ImmutableArray<Outputs.ElastigroupScalingUpPolicy>> ScalingUpPolicies { get; private set; } = null!;

        [Output("scheduledTasks")]
        public Output<ImmutableArray<Outputs.ElastigroupScheduledTask>> ScheduledTasks { get; private set; } = null!;

        /// <summary>
        /// The email of the service account in which the group instances will be launched.
        /// </summary>
        [Output("serviceAccount")]
        public Output<string?> ServiceAccount { get; private set; } = null!;

        /// <summary>
        /// The Base64-encoded shutdown script that executes prior to instance termination, for more information please see: [Shutdown Script](https://api.spotinst.com/integration-docs/elastigroup/concepts/compute-concepts/shutdown-scripts/)
        /// </summary>
        [Output("shutdownScript")]
        public Output<string?> ShutdownScript { get; private set; } = null!;

        /// <summary>
        /// Create and run your own startup scripts on your virtual machines to perform automated tasks every time your instance boots up.
        /// </summary>
        [Output("startupScript")]
        public Output<string?> StartupScript { get; private set; } = null!;

        /// <summary>
        /// A list of regions and subnets.
        /// </summary>
        [Output("subnets")]
        public Output<ImmutableArray<Outputs.ElastigroupSubnet>> Subnets { get; private set; } = null!;

        /// <summary>
        /// Tags to mark created instances.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// Period of time (seconds) to remain in an unhealthy status before a replacement is triggered.
        /// </summary>
        [Output("unhealthyDuration")]
        public Output<int?> UnhealthyDuration { get; private set; } = null!;


        /// <summary>
        /// Create a Elastigroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Elastigroup(string name, ElastigroupArgs args, CustomResourceOptions? options = null)
            : base("spotinst:gcp/elastigroup:Elastigroup", name, args ?? new ElastigroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Elastigroup(string name, Input<string> id, ElastigroupState? state = null, CustomResourceOptions? options = null)
            : base("spotinst:gcp/elastigroup:Elastigroup", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Elastigroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Elastigroup Get(string name, Input<string> id, ElastigroupState? state = null, CustomResourceOptions? options = null)
        {
            return new Elastigroup(name, id, state, options);
        }
    }

    public sealed class ElastigroupArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable auto-replacement of unhealthy instances.
        /// </summary>
        [Input("autoHealing")]
        public Input<bool>? AutoHealing { get; set; }

        [Input("availabilityZones")]
        private InputList<string>? _availabilityZones;

        /// <summary>
        /// List of availability zones for the group.
        /// </summary>
        [Obsolete(@"This field will soon be handled by Region in Subnets")]
        public InputList<string> AvailabilityZones
        {
            get => _availabilityZones ?? (_availabilityZones = new InputList<string>());
            set => _availabilityZones = value;
        }

        [Input("backendServices")]
        private InputList<Inputs.ElastigroupBackendServiceArgs>? _backendServices;

        /// <summary>
        /// Describes the backend service configurations.
        /// </summary>
        public InputList<Inputs.ElastigroupBackendServiceArgs> BackendServices
        {
            get => _backendServices ?? (_backendServices = new InputList<Inputs.ElastigroupBackendServiceArgs>());
            set => _backendServices = value;
        }

        /// <summary>
        /// The region your GCP group will be created in.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The desired number of instances the group should have at any time.
        /// </summary>
        [Input("desiredCapacity", required: true)]
        public Input<int> DesiredCapacity { get; set; } = null!;

        [Input("disks")]
        private InputList<Inputs.ElastigroupDiskArgs>? _disks;
        public InputList<Inputs.ElastigroupDiskArgs> Disks
        {
            get => _disks ?? (_disks = new InputList<Inputs.ElastigroupDiskArgs>());
            set => _disks = value;
        }

        /// <summary>
        /// Time (seconds) the instance is allowed to run after it is detached from the group. This is to allow the instance time to drain all the current TCP connections before terminating it.
        /// </summary>
        [Input("drainingTimeout")]
        public Input<int>? DrainingTimeout { get; set; }

        /// <summary>
        /// Activate fallback-to-on-demand. When provisioning an instance, if no Preemptible market is available, fallback-to-on-demand will provision an On-Demand instance to maintain the group capacity.
        /// </summary>
        [Input("fallbackToOndemand")]
        public Input<bool>? FallbackToOndemand { get; set; }

        [Input("gpu")]
        private InputList<Inputs.ElastigroupGpuArgs>? _gpu;

        /// <summary>
        /// Defines the GPU configuration.
        /// </summary>
        public InputList<Inputs.ElastigroupGpuArgs> Gpu
        {
            get => _gpu ?? (_gpu = new InputList<Inputs.ElastigroupGpuArgs>());
            set => _gpu = value;
        }

        /// <summary>
        /// Period of time (seconds) to wait for VM to reach healthiness before monitoring for unhealthiness.
        /// </summary>
        [Input("healthCheckGracePeriod")]
        public Input<int>? HealthCheckGracePeriod { get; set; }

        /// <summary>
        /// The kind of health check to perform when monitoring for unhealthiness.
        /// </summary>
        [Input("healthCheckType")]
        public Input<string>? HealthCheckType { get; set; }

        [Input("instanceTypesCustoms")]
        private InputList<Inputs.ElastigroupInstanceTypesCustomArgs>? _instanceTypesCustoms;

        /// <summary>
        /// Defines a set of custom instance types. Required if instance_types_preemptible and instance_types_ondemand are not set.
        /// </summary>
        public InputList<Inputs.ElastigroupInstanceTypesCustomArgs> InstanceTypesCustoms
        {
            get => _instanceTypesCustoms ?? (_instanceTypesCustoms = new InputList<Inputs.ElastigroupInstanceTypesCustomArgs>());
            set => _instanceTypesCustoms = value;
        }

        /// <summary>
        /// The regular VM instance type to use for mixed-type groups and when falling back to on-demand. Required if instance_types_preemptible is not set.
        /// </summary>
        [Input("instanceTypesOndemand")]
        public Input<string>? InstanceTypesOndemand { get; set; }

        [Input("instanceTypesPreemptibles")]
        private InputList<string>? _instanceTypesPreemptibles;

        /// <summary>
        /// The preemptible VMs instance type. To maximize cost savings and market availability, select as many types as possible. Required if instance_types_ondemand is not set.
        /// </summary>
        public InputList<string> InstanceTypesPreemptibles
        {
            get => _instanceTypesPreemptibles ?? (_instanceTypesPreemptibles = new InputList<string>());
            set => _instanceTypesPreemptibles = value;
        }

        /// <summary>
        /// Describes the [Docker Swarm](https://api.spotinst.com/integration-docs/elastigroup/container-management/docker-swarm/docker-swarm-integration/) integration.
        /// </summary>
        [Input("integrationDockerSwarm")]
        public Input<Inputs.ElastigroupIntegrationDockerSwarmArgs>? IntegrationDockerSwarm { get; set; }

        [Input("integrationGke")]
        public Input<Inputs.ElastigroupIntegrationGkeArgs>? IntegrationGke { get; set; }

        [Input("ipForwarding")]
        public Input<bool>? IpForwarding { get; set; }

        [Input("labels")]
        private InputList<Inputs.ElastigroupLabelArgs>? _labels;

        /// <summary>
        /// Array of objects with key-value pairs.
        /// </summary>
        public InputList<Inputs.ElastigroupLabelArgs> Labels
        {
            get => _labels ?? (_labels = new InputList<Inputs.ElastigroupLabelArgs>());
            set => _labels = value;
        }

        /// <summary>
        /// The maximum number of instances the group should have at any time.
        /// </summary>
        [Input("maxSize")]
        public Input<int>? MaxSize { get; set; }

        [Input("metadatas")]
        private InputList<Inputs.ElastigroupMetadataArgs>? _metadatas;

        /// <summary>
        /// Array of objects with key-value pairs.
        /// </summary>
        public InputList<Inputs.ElastigroupMetadataArgs> Metadatas
        {
            get => _metadatas ?? (_metadatas = new InputList<Inputs.ElastigroupMetadataArgs>());
            set => _metadatas = value;
        }

        /// <summary>
        /// The minimum number of instances the group should have at any time.
        /// </summary>
        [Input("minSize")]
        public Input<int>? MinSize { get; set; }

        /// <summary>
        /// The dimension name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("networkInterfaces")]
        private InputList<Inputs.ElastigroupNetworkInterfaceArgs>? _networkInterfaces;

        /// <summary>
        /// Array of objects representing the network configuration for the elastigroup.
        /// </summary>
        public InputList<Inputs.ElastigroupNetworkInterfaceArgs> NetworkInterfaces
        {
            get => _networkInterfaces ?? (_networkInterfaces = new InputList<Inputs.ElastigroupNetworkInterfaceArgs>());
            set => _networkInterfaces = value;
        }

        [Input("ondemandCount")]
        public Input<int>? OndemandCount { get; set; }

        /// <summary>
        /// Percentage of Preemptible VMs to spin up from the "desired_capacity".
        /// </summary>
        [Input("preemptiblePercentage")]
        public Input<int>? PreemptiblePercentage { get; set; }

        [Input("scalingDownPolicies")]
        private InputList<Inputs.ElastigroupScalingDownPolicyArgs>? _scalingDownPolicies;

        /// <summary>
        /// Contains scaling policies for scaling the Elastigroup down.
        /// </summary>
        public InputList<Inputs.ElastigroupScalingDownPolicyArgs> ScalingDownPolicies
        {
            get => _scalingDownPolicies ?? (_scalingDownPolicies = new InputList<Inputs.ElastigroupScalingDownPolicyArgs>());
            set => _scalingDownPolicies = value;
        }

        [Input("scalingUpPolicies")]
        private InputList<Inputs.ElastigroupScalingUpPolicyArgs>? _scalingUpPolicies;

        /// <summary>
        /// Contains scaling policies for scaling the Elastigroup up.
        /// </summary>
        public InputList<Inputs.ElastigroupScalingUpPolicyArgs> ScalingUpPolicies
        {
            get => _scalingUpPolicies ?? (_scalingUpPolicies = new InputList<Inputs.ElastigroupScalingUpPolicyArgs>());
            set => _scalingUpPolicies = value;
        }

        [Input("scheduledTasks")]
        private InputList<Inputs.ElastigroupScheduledTaskArgs>? _scheduledTasks;
        public InputList<Inputs.ElastigroupScheduledTaskArgs> ScheduledTasks
        {
            get => _scheduledTasks ?? (_scheduledTasks = new InputList<Inputs.ElastigroupScheduledTaskArgs>());
            set => _scheduledTasks = value;
        }

        /// <summary>
        /// The email of the service account in which the group instances will be launched.
        /// </summary>
        [Input("serviceAccount")]
        public Input<string>? ServiceAccount { get; set; }

        /// <summary>
        /// The Base64-encoded shutdown script that executes prior to instance termination, for more information please see: [Shutdown Script](https://api.spotinst.com/integration-docs/elastigroup/concepts/compute-concepts/shutdown-scripts/)
        /// </summary>
        [Input("shutdownScript")]
        public Input<string>? ShutdownScript { get; set; }

        /// <summary>
        /// Create and run your own startup scripts on your virtual machines to perform automated tasks every time your instance boots up.
        /// </summary>
        [Input("startupScript")]
        public Input<string>? StartupScript { get; set; }

        [Input("subnets")]
        private InputList<Inputs.ElastigroupSubnetArgs>? _subnets;

        /// <summary>
        /// A list of regions and subnets.
        /// </summary>
        public InputList<Inputs.ElastigroupSubnetArgs> Subnets
        {
            get => _subnets ?? (_subnets = new InputList<Inputs.ElastigroupSubnetArgs>());
            set => _subnets = value;
        }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Tags to mark created instances.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Period of time (seconds) to remain in an unhealthy status before a replacement is triggered.
        /// </summary>
        [Input("unhealthyDuration")]
        public Input<int>? UnhealthyDuration { get; set; }

        public ElastigroupArgs()
        {
        }
    }

    public sealed class ElastigroupState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable auto-replacement of unhealthy instances.
        /// </summary>
        [Input("autoHealing")]
        public Input<bool>? AutoHealing { get; set; }

        [Input("availabilityZones")]
        private InputList<string>? _availabilityZones;

        /// <summary>
        /// List of availability zones for the group.
        /// </summary>
        [Obsolete(@"This field will soon be handled by Region in Subnets")]
        public InputList<string> AvailabilityZones
        {
            get => _availabilityZones ?? (_availabilityZones = new InputList<string>());
            set => _availabilityZones = value;
        }

        [Input("backendServices")]
        private InputList<Inputs.ElastigroupBackendServiceGetArgs>? _backendServices;

        /// <summary>
        /// Describes the backend service configurations.
        /// </summary>
        public InputList<Inputs.ElastigroupBackendServiceGetArgs> BackendServices
        {
            get => _backendServices ?? (_backendServices = new InputList<Inputs.ElastigroupBackendServiceGetArgs>());
            set => _backendServices = value;
        }

        /// <summary>
        /// The region your GCP group will be created in.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The desired number of instances the group should have at any time.
        /// </summary>
        [Input("desiredCapacity")]
        public Input<int>? DesiredCapacity { get; set; }

        [Input("disks")]
        private InputList<Inputs.ElastigroupDiskGetArgs>? _disks;
        public InputList<Inputs.ElastigroupDiskGetArgs> Disks
        {
            get => _disks ?? (_disks = new InputList<Inputs.ElastigroupDiskGetArgs>());
            set => _disks = value;
        }

        /// <summary>
        /// Time (seconds) the instance is allowed to run after it is detached from the group. This is to allow the instance time to drain all the current TCP connections before terminating it.
        /// </summary>
        [Input("drainingTimeout")]
        public Input<int>? DrainingTimeout { get; set; }

        /// <summary>
        /// Activate fallback-to-on-demand. When provisioning an instance, if no Preemptible market is available, fallback-to-on-demand will provision an On-Demand instance to maintain the group capacity.
        /// </summary>
        [Input("fallbackToOndemand")]
        public Input<bool>? FallbackToOndemand { get; set; }

        [Input("gpu")]
        private InputList<Inputs.ElastigroupGpuGetArgs>? _gpu;

        /// <summary>
        /// Defines the GPU configuration.
        /// </summary>
        public InputList<Inputs.ElastigroupGpuGetArgs> Gpu
        {
            get => _gpu ?? (_gpu = new InputList<Inputs.ElastigroupGpuGetArgs>());
            set => _gpu = value;
        }

        /// <summary>
        /// Period of time (seconds) to wait for VM to reach healthiness before monitoring for unhealthiness.
        /// </summary>
        [Input("healthCheckGracePeriod")]
        public Input<int>? HealthCheckGracePeriod { get; set; }

        /// <summary>
        /// The kind of health check to perform when monitoring for unhealthiness.
        /// </summary>
        [Input("healthCheckType")]
        public Input<string>? HealthCheckType { get; set; }

        [Input("instanceTypesCustoms")]
        private InputList<Inputs.ElastigroupInstanceTypesCustomGetArgs>? _instanceTypesCustoms;

        /// <summary>
        /// Defines a set of custom instance types. Required if instance_types_preemptible and instance_types_ondemand are not set.
        /// </summary>
        public InputList<Inputs.ElastigroupInstanceTypesCustomGetArgs> InstanceTypesCustoms
        {
            get => _instanceTypesCustoms ?? (_instanceTypesCustoms = new InputList<Inputs.ElastigroupInstanceTypesCustomGetArgs>());
            set => _instanceTypesCustoms = value;
        }

        /// <summary>
        /// The regular VM instance type to use for mixed-type groups and when falling back to on-demand. Required if instance_types_preemptible is not set.
        /// </summary>
        [Input("instanceTypesOndemand")]
        public Input<string>? InstanceTypesOndemand { get; set; }

        [Input("instanceTypesPreemptibles")]
        private InputList<string>? _instanceTypesPreemptibles;

        /// <summary>
        /// The preemptible VMs instance type. To maximize cost savings and market availability, select as many types as possible. Required if instance_types_ondemand is not set.
        /// </summary>
        public InputList<string> InstanceTypesPreemptibles
        {
            get => _instanceTypesPreemptibles ?? (_instanceTypesPreemptibles = new InputList<string>());
            set => _instanceTypesPreemptibles = value;
        }

        /// <summary>
        /// Describes the [Docker Swarm](https://api.spotinst.com/integration-docs/elastigroup/container-management/docker-swarm/docker-swarm-integration/) integration.
        /// </summary>
        [Input("integrationDockerSwarm")]
        public Input<Inputs.ElastigroupIntegrationDockerSwarmGetArgs>? IntegrationDockerSwarm { get; set; }

        [Input("integrationGke")]
        public Input<Inputs.ElastigroupIntegrationGkeGetArgs>? IntegrationGke { get; set; }

        [Input("ipForwarding")]
        public Input<bool>? IpForwarding { get; set; }

        [Input("labels")]
        private InputList<Inputs.ElastigroupLabelGetArgs>? _labels;

        /// <summary>
        /// Array of objects with key-value pairs.
        /// </summary>
        public InputList<Inputs.ElastigroupLabelGetArgs> Labels
        {
            get => _labels ?? (_labels = new InputList<Inputs.ElastigroupLabelGetArgs>());
            set => _labels = value;
        }

        /// <summary>
        /// The maximum number of instances the group should have at any time.
        /// </summary>
        [Input("maxSize")]
        public Input<int>? MaxSize { get; set; }

        [Input("metadatas")]
        private InputList<Inputs.ElastigroupMetadataGetArgs>? _metadatas;

        /// <summary>
        /// Array of objects with key-value pairs.
        /// </summary>
        public InputList<Inputs.ElastigroupMetadataGetArgs> Metadatas
        {
            get => _metadatas ?? (_metadatas = new InputList<Inputs.ElastigroupMetadataGetArgs>());
            set => _metadatas = value;
        }

        /// <summary>
        /// The minimum number of instances the group should have at any time.
        /// </summary>
        [Input("minSize")]
        public Input<int>? MinSize { get; set; }

        /// <summary>
        /// The dimension name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("networkInterfaces")]
        private InputList<Inputs.ElastigroupNetworkInterfaceGetArgs>? _networkInterfaces;

        /// <summary>
        /// Array of objects representing the network configuration for the elastigroup.
        /// </summary>
        public InputList<Inputs.ElastigroupNetworkInterfaceGetArgs> NetworkInterfaces
        {
            get => _networkInterfaces ?? (_networkInterfaces = new InputList<Inputs.ElastigroupNetworkInterfaceGetArgs>());
            set => _networkInterfaces = value;
        }

        [Input("ondemandCount")]
        public Input<int>? OndemandCount { get; set; }

        /// <summary>
        /// Percentage of Preemptible VMs to spin up from the "desired_capacity".
        /// </summary>
        [Input("preemptiblePercentage")]
        public Input<int>? PreemptiblePercentage { get; set; }

        [Input("scalingDownPolicies")]
        private InputList<Inputs.ElastigroupScalingDownPolicyGetArgs>? _scalingDownPolicies;

        /// <summary>
        /// Contains scaling policies for scaling the Elastigroup down.
        /// </summary>
        public InputList<Inputs.ElastigroupScalingDownPolicyGetArgs> ScalingDownPolicies
        {
            get => _scalingDownPolicies ?? (_scalingDownPolicies = new InputList<Inputs.ElastigroupScalingDownPolicyGetArgs>());
            set => _scalingDownPolicies = value;
        }

        [Input("scalingUpPolicies")]
        private InputList<Inputs.ElastigroupScalingUpPolicyGetArgs>? _scalingUpPolicies;

        /// <summary>
        /// Contains scaling policies for scaling the Elastigroup up.
        /// </summary>
        public InputList<Inputs.ElastigroupScalingUpPolicyGetArgs> ScalingUpPolicies
        {
            get => _scalingUpPolicies ?? (_scalingUpPolicies = new InputList<Inputs.ElastigroupScalingUpPolicyGetArgs>());
            set => _scalingUpPolicies = value;
        }

        [Input("scheduledTasks")]
        private InputList<Inputs.ElastigroupScheduledTaskGetArgs>? _scheduledTasks;
        public InputList<Inputs.ElastigroupScheduledTaskGetArgs> ScheduledTasks
        {
            get => _scheduledTasks ?? (_scheduledTasks = new InputList<Inputs.ElastigroupScheduledTaskGetArgs>());
            set => _scheduledTasks = value;
        }

        /// <summary>
        /// The email of the service account in which the group instances will be launched.
        /// </summary>
        [Input("serviceAccount")]
        public Input<string>? ServiceAccount { get; set; }

        /// <summary>
        /// The Base64-encoded shutdown script that executes prior to instance termination, for more information please see: [Shutdown Script](https://api.spotinst.com/integration-docs/elastigroup/concepts/compute-concepts/shutdown-scripts/)
        /// </summary>
        [Input("shutdownScript")]
        public Input<string>? ShutdownScript { get; set; }

        /// <summary>
        /// Create and run your own startup scripts on your virtual machines to perform automated tasks every time your instance boots up.
        /// </summary>
        [Input("startupScript")]
        public Input<string>? StartupScript { get; set; }

        [Input("subnets")]
        private InputList<Inputs.ElastigroupSubnetGetArgs>? _subnets;

        /// <summary>
        /// A list of regions and subnets.
        /// </summary>
        public InputList<Inputs.ElastigroupSubnetGetArgs> Subnets
        {
            get => _subnets ?? (_subnets = new InputList<Inputs.ElastigroupSubnetGetArgs>());
            set => _subnets = value;
        }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Tags to mark created instances.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Period of time (seconds) to remain in an unhealthy status before a replacement is triggered.
        /// </summary>
        [Input("unhealthyDuration")]
        public Input<int>? UnhealthyDuration { get; set; }

        public ElastigroupState()
        {
        }
    }
}
