// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws
{
    [SpotInstResourceType("spotinst:aws/managedInstance:ManagedInstance")]
    public partial class ManagedInstance : global::Pulumi.CustomResource
    {
        [Output("autoHealing")]
        public Output<bool?> AutoHealing { get; private set; } = null!;

        [Output("blockDeviceMappings")]
        public Output<ImmutableArray<Outputs.ManagedInstanceBlockDeviceMapping>> BlockDeviceMappings { get; private set; } = null!;

        [Output("blockDevicesMode")]
        public Output<string?> BlockDevicesMode { get; private set; } = null!;

        [Output("cpuCredits")]
        public Output<string?> CpuCredits { get; private set; } = null!;

        [Output("deletes")]
        public Output<ImmutableArray<Outputs.ManagedInstanceDelete>> Deletes { get; private set; } = null!;

        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        [Output("drainingTimeout")]
        public Output<int?> DrainingTimeout { get; private set; } = null!;

        [Output("ebsOptimized")]
        public Output<bool> EbsOptimized { get; private set; } = null!;

        [Output("elasticIp")]
        public Output<string?> ElasticIp { get; private set; } = null!;

        [Output("enableMonitoring")]
        public Output<bool?> EnableMonitoring { get; private set; } = null!;

        [Output("fallbackToOndemand")]
        public Output<bool?> FallbackToOndemand { get; private set; } = null!;

        [Output("gracePeriod")]
        public Output<int?> GracePeriod { get; private set; } = null!;

        [Output("healthCheckType")]
        public Output<string?> HealthCheckType { get; private set; } = null!;

        [Output("iamInstanceProfile")]
        public Output<string?> IamInstanceProfile { get; private set; } = null!;

        [Output("imageId")]
        public Output<string> ImageId { get; private set; } = null!;

        [Output("instanceTypes")]
        public Output<ImmutableArray<string>> InstanceTypes { get; private set; } = null!;

        [Output("integrationRoute53")]
        public Output<Outputs.ManagedInstanceIntegrationRoute53?> IntegrationRoute53 { get; private set; } = null!;

        [Output("keyPair")]
        public Output<string?> KeyPair { get; private set; } = null!;

        [Output("lifeCycle")]
        public Output<string?> LifeCycle { get; private set; } = null!;

        [Output("loadBalancers")]
        public Output<ImmutableArray<Outputs.ManagedInstanceLoadBalancer>> LoadBalancers { get; private set; } = null!;

        [Output("managedInstanceAction")]
        public Output<Outputs.ManagedInstanceManagedInstanceAction?> ManagedInstanceAction { get; private set; } = null!;

        [Output("metadataOptions")]
        public Output<Outputs.ManagedInstanceMetadataOptions?> MetadataOptions { get; private set; } = null!;

        [Output("minimumInstanceLifetime")]
        public Output<int?> MinimumInstanceLifetime { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("networkInterfaces")]
        public Output<ImmutableArray<Outputs.ManagedInstanceNetworkInterface>> NetworkInterfaces { get; private set; } = null!;

        [Output("optimizationWindows")]
        public Output<ImmutableArray<string>> OptimizationWindows { get; private set; } = null!;

        [Output("orientation")]
        public Output<string?> Orientation { get; private set; } = null!;

        [Output("persistBlockDevices")]
        public Output<bool> PersistBlockDevices { get; private set; } = null!;

        [Output("persistPrivateIp")]
        public Output<bool?> PersistPrivateIp { get; private set; } = null!;

        [Output("persistRootDevice")]
        public Output<bool?> PersistRootDevice { get; private set; } = null!;

        [Output("placementTenancy")]
        public Output<string?> PlacementTenancy { get; private set; } = null!;

        [Output("preferredType")]
        public Output<string?> PreferredType { get; private set; } = null!;

        [Output("privateIp")]
        public Output<string?> PrivateIp { get; private set; } = null!;

        [Output("product")]
        public Output<string> Product { get; private set; } = null!;

        [Output("region")]
        public Output<string?> Region { get; private set; } = null!;

        [Output("resourceTagSpecifications")]
        public Output<ImmutableArray<Outputs.ManagedInstanceResourceTagSpecification>> ResourceTagSpecifications { get; private set; } = null!;

        [Output("revertToSpot")]
        public Output<Outputs.ManagedInstanceRevertToSpot?> RevertToSpot { get; private set; } = null!;

        [Output("scheduledTasks")]
        public Output<ImmutableArray<Outputs.ManagedInstanceScheduledTask>> ScheduledTasks { get; private set; } = null!;

        [Output("securityGroupIds")]
        public Output<ImmutableArray<string>> SecurityGroupIds { get; private set; } = null!;

        [Output("shutdownScript")]
        public Output<string?> ShutdownScript { get; private set; } = null!;

        [Output("subnetIds")]
        public Output<ImmutableArray<string>> SubnetIds { get; private set; } = null!;

        [Output("tags")]
        public Output<ImmutableArray<Outputs.ManagedInstanceTag>> Tags { get; private set; } = null!;

        [Output("unhealthyDuration")]
        public Output<int?> UnhealthyDuration { get; private set; } = null!;

        [Output("userData")]
        public Output<string?> UserData { get; private set; } = null!;

        [Output("utilizeReservedInstances")]
        public Output<bool?> UtilizeReservedInstances { get; private set; } = null!;

        [Output("vpcId")]
        public Output<string> VpcId { get; private set; } = null!;


        /// <summary>
        /// Create a ManagedInstance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ManagedInstance(string name, ManagedInstanceArgs args, CustomResourceOptions? options = null)
            : base("spotinst:aws/managedInstance:ManagedInstance", name, args ?? new ManagedInstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ManagedInstance(string name, Input<string> id, ManagedInstanceState? state = null, CustomResourceOptions? options = null)
            : base("spotinst:aws/managedInstance:ManagedInstance", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ManagedInstance resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ManagedInstance Get(string name, Input<string> id, ManagedInstanceState? state = null, CustomResourceOptions? options = null)
        {
            return new ManagedInstance(name, id, state, options);
        }
    }

    public sealed class ManagedInstanceArgs : global::Pulumi.ResourceArgs
    {
        [Input("autoHealing")]
        public Input<bool>? AutoHealing { get; set; }

        [Input("blockDeviceMappings")]
        private InputList<Inputs.ManagedInstanceBlockDeviceMappingArgs>? _blockDeviceMappings;
        public InputList<Inputs.ManagedInstanceBlockDeviceMappingArgs> BlockDeviceMappings
        {
            get => _blockDeviceMappings ?? (_blockDeviceMappings = new InputList<Inputs.ManagedInstanceBlockDeviceMappingArgs>());
            set => _blockDeviceMappings = value;
        }

        [Input("blockDevicesMode")]
        public Input<string>? BlockDevicesMode { get; set; }

        [Input("cpuCredits")]
        public Input<string>? CpuCredits { get; set; }

        [Input("deletes")]
        private InputList<Inputs.ManagedInstanceDeleteArgs>? _deletes;
        public InputList<Inputs.ManagedInstanceDeleteArgs> Deletes
        {
            get => _deletes ?? (_deletes = new InputList<Inputs.ManagedInstanceDeleteArgs>());
            set => _deletes = value;
        }

        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("drainingTimeout")]
        public Input<int>? DrainingTimeout { get; set; }

        [Input("ebsOptimized")]
        public Input<bool>? EbsOptimized { get; set; }

        [Input("elasticIp")]
        public Input<string>? ElasticIp { get; set; }

        [Input("enableMonitoring")]
        public Input<bool>? EnableMonitoring { get; set; }

        [Input("fallbackToOndemand")]
        public Input<bool>? FallbackToOndemand { get; set; }

        [Input("gracePeriod")]
        public Input<int>? GracePeriod { get; set; }

        [Input("healthCheckType")]
        public Input<string>? HealthCheckType { get; set; }

        [Input("iamInstanceProfile")]
        public Input<string>? IamInstanceProfile { get; set; }

        [Input("imageId", required: true)]
        public Input<string> ImageId { get; set; } = null!;

        [Input("instanceTypes", required: true)]
        private InputList<string>? _instanceTypes;
        public InputList<string> InstanceTypes
        {
            get => _instanceTypes ?? (_instanceTypes = new InputList<string>());
            set => _instanceTypes = value;
        }

        [Input("integrationRoute53")]
        public Input<Inputs.ManagedInstanceIntegrationRoute53Args>? IntegrationRoute53 { get; set; }

        [Input("keyPair")]
        public Input<string>? KeyPair { get; set; }

        [Input("lifeCycle")]
        public Input<string>? LifeCycle { get; set; }

        [Input("loadBalancers")]
        private InputList<Inputs.ManagedInstanceLoadBalancerArgs>? _loadBalancers;
        public InputList<Inputs.ManagedInstanceLoadBalancerArgs> LoadBalancers
        {
            get => _loadBalancers ?? (_loadBalancers = new InputList<Inputs.ManagedInstanceLoadBalancerArgs>());
            set => _loadBalancers = value;
        }

        [Input("managedInstanceAction")]
        public Input<Inputs.ManagedInstanceManagedInstanceActionArgs>? ManagedInstanceAction { get; set; }

        [Input("metadataOptions")]
        public Input<Inputs.ManagedInstanceMetadataOptionsArgs>? MetadataOptions { get; set; }

        [Input("minimumInstanceLifetime")]
        public Input<int>? MinimumInstanceLifetime { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("networkInterfaces")]
        private InputList<Inputs.ManagedInstanceNetworkInterfaceArgs>? _networkInterfaces;
        public InputList<Inputs.ManagedInstanceNetworkInterfaceArgs> NetworkInterfaces
        {
            get => _networkInterfaces ?? (_networkInterfaces = new InputList<Inputs.ManagedInstanceNetworkInterfaceArgs>());
            set => _networkInterfaces = value;
        }

        [Input("optimizationWindows")]
        private InputList<string>? _optimizationWindows;
        public InputList<string> OptimizationWindows
        {
            get => _optimizationWindows ?? (_optimizationWindows = new InputList<string>());
            set => _optimizationWindows = value;
        }

        [Input("orientation")]
        public Input<string>? Orientation { get; set; }

        [Input("persistBlockDevices", required: true)]
        public Input<bool> PersistBlockDevices { get; set; } = null!;

        [Input("persistPrivateIp")]
        public Input<bool>? PersistPrivateIp { get; set; }

        [Input("persistRootDevice")]
        public Input<bool>? PersistRootDevice { get; set; }

        [Input("placementTenancy")]
        public Input<string>? PlacementTenancy { get; set; }

        [Input("preferredType")]
        public Input<string>? PreferredType { get; set; }

        [Input("privateIp")]
        public Input<string>? PrivateIp { get; set; }

        [Input("product", required: true)]
        public Input<string> Product { get; set; } = null!;

        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("resourceTagSpecifications")]
        private InputList<Inputs.ManagedInstanceResourceTagSpecificationArgs>? _resourceTagSpecifications;
        public InputList<Inputs.ManagedInstanceResourceTagSpecificationArgs> ResourceTagSpecifications
        {
            get => _resourceTagSpecifications ?? (_resourceTagSpecifications = new InputList<Inputs.ManagedInstanceResourceTagSpecificationArgs>());
            set => _resourceTagSpecifications = value;
        }

        [Input("revertToSpot")]
        public Input<Inputs.ManagedInstanceRevertToSpotArgs>? RevertToSpot { get; set; }

        [Input("scheduledTasks")]
        private InputList<Inputs.ManagedInstanceScheduledTaskArgs>? _scheduledTasks;
        public InputList<Inputs.ManagedInstanceScheduledTaskArgs> ScheduledTasks
        {
            get => _scheduledTasks ?? (_scheduledTasks = new InputList<Inputs.ManagedInstanceScheduledTaskArgs>());
            set => _scheduledTasks = value;
        }

        [Input("securityGroupIds")]
        private InputList<string>? _securityGroupIds;
        public InputList<string> SecurityGroupIds
        {
            get => _securityGroupIds ?? (_securityGroupIds = new InputList<string>());
            set => _securityGroupIds = value;
        }

        [Input("shutdownScript")]
        public Input<string>? ShutdownScript { get; set; }

        [Input("subnetIds", required: true)]
        private InputList<string>? _subnetIds;
        public InputList<string> SubnetIds
        {
            get => _subnetIds ?? (_subnetIds = new InputList<string>());
            set => _subnetIds = value;
        }

        [Input("tags")]
        private InputList<Inputs.ManagedInstanceTagArgs>? _tags;
        public InputList<Inputs.ManagedInstanceTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.ManagedInstanceTagArgs>());
            set => _tags = value;
        }

        [Input("unhealthyDuration")]
        public Input<int>? UnhealthyDuration { get; set; }

        [Input("userData")]
        public Input<string>? UserData { get; set; }

        [Input("utilizeReservedInstances")]
        public Input<bool>? UtilizeReservedInstances { get; set; }

        [Input("vpcId", required: true)]
        public Input<string> VpcId { get; set; } = null!;

        public ManagedInstanceArgs()
        {
        }
        public static new ManagedInstanceArgs Empty => new ManagedInstanceArgs();
    }

    public sealed class ManagedInstanceState : global::Pulumi.ResourceArgs
    {
        [Input("autoHealing")]
        public Input<bool>? AutoHealing { get; set; }

        [Input("blockDeviceMappings")]
        private InputList<Inputs.ManagedInstanceBlockDeviceMappingGetArgs>? _blockDeviceMappings;
        public InputList<Inputs.ManagedInstanceBlockDeviceMappingGetArgs> BlockDeviceMappings
        {
            get => _blockDeviceMappings ?? (_blockDeviceMappings = new InputList<Inputs.ManagedInstanceBlockDeviceMappingGetArgs>());
            set => _blockDeviceMappings = value;
        }

        [Input("blockDevicesMode")]
        public Input<string>? BlockDevicesMode { get; set; }

        [Input("cpuCredits")]
        public Input<string>? CpuCredits { get; set; }

        [Input("deletes")]
        private InputList<Inputs.ManagedInstanceDeleteGetArgs>? _deletes;
        public InputList<Inputs.ManagedInstanceDeleteGetArgs> Deletes
        {
            get => _deletes ?? (_deletes = new InputList<Inputs.ManagedInstanceDeleteGetArgs>());
            set => _deletes = value;
        }

        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("drainingTimeout")]
        public Input<int>? DrainingTimeout { get; set; }

        [Input("ebsOptimized")]
        public Input<bool>? EbsOptimized { get; set; }

        [Input("elasticIp")]
        public Input<string>? ElasticIp { get; set; }

        [Input("enableMonitoring")]
        public Input<bool>? EnableMonitoring { get; set; }

        [Input("fallbackToOndemand")]
        public Input<bool>? FallbackToOndemand { get; set; }

        [Input("gracePeriod")]
        public Input<int>? GracePeriod { get; set; }

        [Input("healthCheckType")]
        public Input<string>? HealthCheckType { get; set; }

        [Input("iamInstanceProfile")]
        public Input<string>? IamInstanceProfile { get; set; }

        [Input("imageId")]
        public Input<string>? ImageId { get; set; }

        [Input("instanceTypes")]
        private InputList<string>? _instanceTypes;
        public InputList<string> InstanceTypes
        {
            get => _instanceTypes ?? (_instanceTypes = new InputList<string>());
            set => _instanceTypes = value;
        }

        [Input("integrationRoute53")]
        public Input<Inputs.ManagedInstanceIntegrationRoute53GetArgs>? IntegrationRoute53 { get; set; }

        [Input("keyPair")]
        public Input<string>? KeyPair { get; set; }

        [Input("lifeCycle")]
        public Input<string>? LifeCycle { get; set; }

        [Input("loadBalancers")]
        private InputList<Inputs.ManagedInstanceLoadBalancerGetArgs>? _loadBalancers;
        public InputList<Inputs.ManagedInstanceLoadBalancerGetArgs> LoadBalancers
        {
            get => _loadBalancers ?? (_loadBalancers = new InputList<Inputs.ManagedInstanceLoadBalancerGetArgs>());
            set => _loadBalancers = value;
        }

        [Input("managedInstanceAction")]
        public Input<Inputs.ManagedInstanceManagedInstanceActionGetArgs>? ManagedInstanceAction { get; set; }

        [Input("metadataOptions")]
        public Input<Inputs.ManagedInstanceMetadataOptionsGetArgs>? MetadataOptions { get; set; }

        [Input("minimumInstanceLifetime")]
        public Input<int>? MinimumInstanceLifetime { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("networkInterfaces")]
        private InputList<Inputs.ManagedInstanceNetworkInterfaceGetArgs>? _networkInterfaces;
        public InputList<Inputs.ManagedInstanceNetworkInterfaceGetArgs> NetworkInterfaces
        {
            get => _networkInterfaces ?? (_networkInterfaces = new InputList<Inputs.ManagedInstanceNetworkInterfaceGetArgs>());
            set => _networkInterfaces = value;
        }

        [Input("optimizationWindows")]
        private InputList<string>? _optimizationWindows;
        public InputList<string> OptimizationWindows
        {
            get => _optimizationWindows ?? (_optimizationWindows = new InputList<string>());
            set => _optimizationWindows = value;
        }

        [Input("orientation")]
        public Input<string>? Orientation { get; set; }

        [Input("persistBlockDevices")]
        public Input<bool>? PersistBlockDevices { get; set; }

        [Input("persistPrivateIp")]
        public Input<bool>? PersistPrivateIp { get; set; }

        [Input("persistRootDevice")]
        public Input<bool>? PersistRootDevice { get; set; }

        [Input("placementTenancy")]
        public Input<string>? PlacementTenancy { get; set; }

        [Input("preferredType")]
        public Input<string>? PreferredType { get; set; }

        [Input("privateIp")]
        public Input<string>? PrivateIp { get; set; }

        [Input("product")]
        public Input<string>? Product { get; set; }

        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("resourceTagSpecifications")]
        private InputList<Inputs.ManagedInstanceResourceTagSpecificationGetArgs>? _resourceTagSpecifications;
        public InputList<Inputs.ManagedInstanceResourceTagSpecificationGetArgs> ResourceTagSpecifications
        {
            get => _resourceTagSpecifications ?? (_resourceTagSpecifications = new InputList<Inputs.ManagedInstanceResourceTagSpecificationGetArgs>());
            set => _resourceTagSpecifications = value;
        }

        [Input("revertToSpot")]
        public Input<Inputs.ManagedInstanceRevertToSpotGetArgs>? RevertToSpot { get; set; }

        [Input("scheduledTasks")]
        private InputList<Inputs.ManagedInstanceScheduledTaskGetArgs>? _scheduledTasks;
        public InputList<Inputs.ManagedInstanceScheduledTaskGetArgs> ScheduledTasks
        {
            get => _scheduledTasks ?? (_scheduledTasks = new InputList<Inputs.ManagedInstanceScheduledTaskGetArgs>());
            set => _scheduledTasks = value;
        }

        [Input("securityGroupIds")]
        private InputList<string>? _securityGroupIds;
        public InputList<string> SecurityGroupIds
        {
            get => _securityGroupIds ?? (_securityGroupIds = new InputList<string>());
            set => _securityGroupIds = value;
        }

        [Input("shutdownScript")]
        public Input<string>? ShutdownScript { get; set; }

        [Input("subnetIds")]
        private InputList<string>? _subnetIds;
        public InputList<string> SubnetIds
        {
            get => _subnetIds ?? (_subnetIds = new InputList<string>());
            set => _subnetIds = value;
        }

        [Input("tags")]
        private InputList<Inputs.ManagedInstanceTagGetArgs>? _tags;
        public InputList<Inputs.ManagedInstanceTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.ManagedInstanceTagGetArgs>());
            set => _tags = value;
        }

        [Input("unhealthyDuration")]
        public Input<int>? UnhealthyDuration { get; set; }

        [Input("userData")]
        public Input<string>? UserData { get; set; }

        [Input("utilizeReservedInstances")]
        public Input<bool>? UtilizeReservedInstances { get; set; }

        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        public ManagedInstanceState()
        {
        }
        public static new ManagedInstanceState Empty => new ManagedInstanceState();
    }
}
