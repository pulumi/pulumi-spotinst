// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Ecs
{
    /// <summary>
    /// Manages a Spotinst Ocean ECS resource.
    /// 
    /// ## Import
    /// 
    /// Clusters can be imported using the Ocean `id`, e.g.,
    /// 
    /// hcl
    /// 
    /// ```sh
    /// $ pulumi import spotinst:ecs/ocean:Ocean nameOfTheResource o-12345678
    /// ```
    /// </summary>
    [SpotInstResourceType("spotinst:ecs/ocean:Ocean")]
    public partial class Ocean : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Configure public IP address allocation.
        /// </summary>
        [Output("associatePublicIpAddress")]
        public Output<bool?> AssociatePublicIpAddress { get; private set; } = null!;

        /// <summary>
        /// Describes the Ocean ECS autoscaler.
        /// </summary>
        [Output("autoscaler")]
        public Output<Outputs.OceanAutoscaler?> Autoscaler { get; private set; } = null!;

        [Output("blacklists")]
        public Output<ImmutableArray<string>> Blacklists { get; private set; } = null!;

        /// <summary>
        /// Object. List of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
        /// </summary>
        [Output("blockDeviceMappings")]
        public Output<ImmutableArray<Outputs.OceanBlockDeviceMapping>> BlockDeviceMappings { get; private set; } = null!;

        /// <summary>
        /// The name of the ECS cluster.
        /// </summary>
        [Output("clusterName")]
        public Output<string> ClusterName { get; private set; } = null!;

        [Output("clusterOrientations")]
        public Output<ImmutableArray<Outputs.OceanClusterOrientation>> ClusterOrientations { get; private set; } = null!;

        /// <summary>
        /// The number of instances to launch and maintain in the cluster.
        /// </summary>
        [Output("desiredCapacity")]
        public Output<int> DesiredCapacity { get; private set; } = null!;

        /// <summary>
        /// The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
        /// </summary>
        [Output("drainingTimeout")]
        public Output<int?> DrainingTimeout { get; private set; } = null!;

        /// <summary>
        /// Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
        /// </summary>
        [Output("ebsOptimized")]
        public Output<bool?> EbsOptimized { get; private set; } = null!;

        /// <summary>
        /// If no Spot instance markets are available, enable Ocean to launch On-Demand instances instead.
        /// </summary>
        [Output("fallbackToOndemand")]
        public Output<bool?> FallbackToOndemand { get; private set; } = null!;

        [Output("filters")]
        public Output<Outputs.OceanFilters?> Filters { get; private set; } = null!;

        /// <summary>
        /// The instance profile iam role.
        /// </summary>
        [Output("iamInstanceProfile")]
        public Output<string?> IamInstanceProfile { get; private set; } = null!;

        /// <summary>
        /// ID of the image used to launch the instances.
        /// </summary>
        [Output("imageId")]
        public Output<string> ImageId { get; private set; } = null!;

        /// <summary>
        /// Ocean instance metadata options object for IMDSv2.
        /// </summary>
        [Output("instanceMetadataOptions")]
        public Output<Outputs.OceanInstanceMetadataOptions?> InstanceMetadataOptions { get; private set; } = null!;

        /// <summary>
        /// The key pair to attach the instances.
        /// </summary>
        [Output("keyPair")]
        public Output<string?> KeyPair { get; private set; } = null!;

        /// <summary>
        /// Logging configuration.
        /// </summary>
        [Output("logging")]
        public Output<Outputs.OceanLogging?> Logging { get; private set; } = null!;

        /// <summary>
        /// The upper limit of instances the cluster can scale up to.
        /// </summary>
        [Output("maxSize")]
        public Output<int> MaxSize { get; private set; } = null!;

        /// <summary>
        /// The lower limit of instances the cluster can scale down to.
        /// </summary>
        [Output("minSize")]
        public Output<int> MinSize { get; private set; } = null!;

        /// <summary>
        /// Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
        /// </summary>
        [Output("monitoring")]
        public Output<bool?> Monitoring { get; private set; } = null!;

        /// <summary>
        /// The Ocean cluster name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Object. Set auto image update settings.
        /// </summary>
        [Output("optimizeImages")]
        public Output<Outputs.OceanOptimizeImages?> OptimizeImages { get; private set; } = null!;

        /// <summary>
        /// The region the cluster will run in.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// While used, you can control whether the group should perform a deployment after an update to the configuration.
        /// </summary>
        [Output("scheduledTasks")]
        public Output<ImmutableArray<Outputs.OceanScheduledTask>> ScheduledTasks { get; private set; } = null!;

        /// <summary>
        /// One or more security group ids.
        /// </summary>
        [Output("securityGroupIds")]
        public Output<ImmutableArray<string>> SecurityGroupIds { get; private set; } = null!;

        /// <summary>
        /// The percentage of Spot instances that would spin up from the `desired_capacity` number.
        /// </summary>
        [Output("spotPercentage")]
        public Output<int?> SpotPercentage { get; private set; } = null!;

        /// <summary>
        /// A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public ip.
        /// </summary>
        [Output("subnetIds")]
        public Output<ImmutableArray<string>> SubnetIds { get; private set; } = null!;

        /// <summary>
        /// Optionally adds tags to instances launched in an Ocean cluster.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<Outputs.OceanTag>> Tags { get; private set; } = null!;

        /// <summary>
        /// While used, you can control whether the group should perform a deployment after an update to the configuration.
        /// </summary>
        [Output("updatePolicy")]
        public Output<Outputs.OceanUpdatePolicy?> UpdatePolicy { get; private set; } = null!;

        /// <summary>
        /// launch specification defined on the Ocean object will function only as a template for virtual node groups.
        /// </summary>
        [Output("useAsTemplateOnly")]
        public Output<bool?> UseAsTemplateOnly { get; private set; } = null!;

        /// <summary>
        /// Base64-encoded MIME user data to make available to the instances.
        /// </summary>
        [Output("userData")]
        public Output<string?> UserData { get; private set; } = null!;

        /// <summary>
        /// If savings plans exist, Ocean will utilize them before launching Spot instances.
        /// </summary>
        [Output("utilizeCommitments")]
        public Output<bool?> UtilizeCommitments { get; private set; } = null!;

        /// <summary>
        /// If Reserved instances exist, Ocean will utilize them before launching Spot instances.
        /// </summary>
        [Output("utilizeReservedInstances")]
        public Output<bool?> UtilizeReservedInstances { get; private set; } = null!;

        [Output("whitelists")]
        public Output<ImmutableArray<string>> Whitelists { get; private set; } = null!;


        /// <summary>
        /// Create a Ocean resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Ocean(string name, OceanArgs args, CustomResourceOptions? options = null)
            : base("spotinst:ecs/ocean:Ocean", name, args ?? new OceanArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Ocean(string name, Input<string> id, OceanState? state = null, CustomResourceOptions? options = null)
            : base("spotinst:ecs/ocean:Ocean", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Ocean resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Ocean Get(string name, Input<string> id, OceanState? state = null, CustomResourceOptions? options = null)
        {
            return new Ocean(name, id, state, options);
        }
    }

    public sealed class OceanArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configure public IP address allocation.
        /// </summary>
        [Input("associatePublicIpAddress")]
        public Input<bool>? AssociatePublicIpAddress { get; set; }

        /// <summary>
        /// Describes the Ocean ECS autoscaler.
        /// </summary>
        [Input("autoscaler")]
        public Input<Inputs.OceanAutoscalerArgs>? Autoscaler { get; set; }

        [Input("blacklists")]
        private InputList<string>? _blacklists;
        public InputList<string> Blacklists
        {
            get => _blacklists ?? (_blacklists = new InputList<string>());
            set => _blacklists = value;
        }

        [Input("blockDeviceMappings")]
        private InputList<Inputs.OceanBlockDeviceMappingArgs>? _blockDeviceMappings;

        /// <summary>
        /// Object. List of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
        /// </summary>
        public InputList<Inputs.OceanBlockDeviceMappingArgs> BlockDeviceMappings
        {
            get => _blockDeviceMappings ?? (_blockDeviceMappings = new InputList<Inputs.OceanBlockDeviceMappingArgs>());
            set => _blockDeviceMappings = value;
        }

        /// <summary>
        /// The name of the ECS cluster.
        /// </summary>
        [Input("clusterName", required: true)]
        public Input<string> ClusterName { get; set; } = null!;

        [Input("clusterOrientations")]
        private InputList<Inputs.OceanClusterOrientationArgs>? _clusterOrientations;
        public InputList<Inputs.OceanClusterOrientationArgs> ClusterOrientations
        {
            get => _clusterOrientations ?? (_clusterOrientations = new InputList<Inputs.OceanClusterOrientationArgs>());
            set => _clusterOrientations = value;
        }

        /// <summary>
        /// The number of instances to launch and maintain in the cluster.
        /// </summary>
        [Input("desiredCapacity")]
        public Input<int>? DesiredCapacity { get; set; }

        /// <summary>
        /// The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
        /// </summary>
        [Input("drainingTimeout")]
        public Input<int>? DrainingTimeout { get; set; }

        /// <summary>
        /// Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
        /// </summary>
        [Input("ebsOptimized")]
        public Input<bool>? EbsOptimized { get; set; }

        /// <summary>
        /// If no Spot instance markets are available, enable Ocean to launch On-Demand instances instead.
        /// </summary>
        [Input("fallbackToOndemand")]
        public Input<bool>? FallbackToOndemand { get; set; }

        [Input("filters")]
        public Input<Inputs.OceanFiltersArgs>? Filters { get; set; }

        /// <summary>
        /// The instance profile iam role.
        /// </summary>
        [Input("iamInstanceProfile")]
        public Input<string>? IamInstanceProfile { get; set; }

        /// <summary>
        /// ID of the image used to launch the instances.
        /// </summary>
        [Input("imageId", required: true)]
        public Input<string> ImageId { get; set; } = null!;

        /// <summary>
        /// Ocean instance metadata options object for IMDSv2.
        /// </summary>
        [Input("instanceMetadataOptions")]
        public Input<Inputs.OceanInstanceMetadataOptionsArgs>? InstanceMetadataOptions { get; set; }

        /// <summary>
        /// The key pair to attach the instances.
        /// </summary>
        [Input("keyPair")]
        public Input<string>? KeyPair { get; set; }

        /// <summary>
        /// Logging configuration.
        /// </summary>
        [Input("logging")]
        public Input<Inputs.OceanLoggingArgs>? Logging { get; set; }

        /// <summary>
        /// The upper limit of instances the cluster can scale up to.
        /// </summary>
        [Input("maxSize")]
        public Input<int>? MaxSize { get; set; }

        /// <summary>
        /// The lower limit of instances the cluster can scale down to.
        /// </summary>
        [Input("minSize")]
        public Input<int>? MinSize { get; set; }

        /// <summary>
        /// Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
        /// </summary>
        [Input("monitoring")]
        public Input<bool>? Monitoring { get; set; }

        /// <summary>
        /// The Ocean cluster name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Object. Set auto image update settings.
        /// </summary>
        [Input("optimizeImages")]
        public Input<Inputs.OceanOptimizeImagesArgs>? OptimizeImages { get; set; }

        /// <summary>
        /// The region the cluster will run in.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        [Input("scheduledTasks")]
        private InputList<Inputs.OceanScheduledTaskArgs>? _scheduledTasks;

        /// <summary>
        /// While used, you can control whether the group should perform a deployment after an update to the configuration.
        /// </summary>
        public InputList<Inputs.OceanScheduledTaskArgs> ScheduledTasks
        {
            get => _scheduledTasks ?? (_scheduledTasks = new InputList<Inputs.OceanScheduledTaskArgs>());
            set => _scheduledTasks = value;
        }

        [Input("securityGroupIds", required: true)]
        private InputList<string>? _securityGroupIds;

        /// <summary>
        /// One or more security group ids.
        /// </summary>
        public InputList<string> SecurityGroupIds
        {
            get => _securityGroupIds ?? (_securityGroupIds = new InputList<string>());
            set => _securityGroupIds = value;
        }

        /// <summary>
        /// The percentage of Spot instances that would spin up from the `desired_capacity` number.
        /// </summary>
        [Input("spotPercentage")]
        public Input<int>? SpotPercentage { get; set; }

        [Input("subnetIds", required: true)]
        private InputList<string>? _subnetIds;

        /// <summary>
        /// A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public ip.
        /// </summary>
        public InputList<string> SubnetIds
        {
            get => _subnetIds ?? (_subnetIds = new InputList<string>());
            set => _subnetIds = value;
        }

        [Input("tags")]
        private InputList<Inputs.OceanTagArgs>? _tags;

        /// <summary>
        /// Optionally adds tags to instances launched in an Ocean cluster.
        /// </summary>
        public InputList<Inputs.OceanTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.OceanTagArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// While used, you can control whether the group should perform a deployment after an update to the configuration.
        /// </summary>
        [Input("updatePolicy")]
        public Input<Inputs.OceanUpdatePolicyArgs>? UpdatePolicy { get; set; }

        /// <summary>
        /// launch specification defined on the Ocean object will function only as a template for virtual node groups.
        /// </summary>
        [Input("useAsTemplateOnly")]
        public Input<bool>? UseAsTemplateOnly { get; set; }

        /// <summary>
        /// Base64-encoded MIME user data to make available to the instances.
        /// </summary>
        [Input("userData")]
        public Input<string>? UserData { get; set; }

        /// <summary>
        /// If savings plans exist, Ocean will utilize them before launching Spot instances.
        /// </summary>
        [Input("utilizeCommitments")]
        public Input<bool>? UtilizeCommitments { get; set; }

        /// <summary>
        /// If Reserved instances exist, Ocean will utilize them before launching Spot instances.
        /// </summary>
        [Input("utilizeReservedInstances")]
        public Input<bool>? UtilizeReservedInstances { get; set; }

        [Input("whitelists")]
        private InputList<string>? _whitelists;
        public InputList<string> Whitelists
        {
            get => _whitelists ?? (_whitelists = new InputList<string>());
            set => _whitelists = value;
        }

        public OceanArgs()
        {
        }
        public static new OceanArgs Empty => new OceanArgs();
    }

    public sealed class OceanState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configure public IP address allocation.
        /// </summary>
        [Input("associatePublicIpAddress")]
        public Input<bool>? AssociatePublicIpAddress { get; set; }

        /// <summary>
        /// Describes the Ocean ECS autoscaler.
        /// </summary>
        [Input("autoscaler")]
        public Input<Inputs.OceanAutoscalerGetArgs>? Autoscaler { get; set; }

        [Input("blacklists")]
        private InputList<string>? _blacklists;
        public InputList<string> Blacklists
        {
            get => _blacklists ?? (_blacklists = new InputList<string>());
            set => _blacklists = value;
        }

        [Input("blockDeviceMappings")]
        private InputList<Inputs.OceanBlockDeviceMappingGetArgs>? _blockDeviceMappings;

        /// <summary>
        /// Object. List of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
        /// </summary>
        public InputList<Inputs.OceanBlockDeviceMappingGetArgs> BlockDeviceMappings
        {
            get => _blockDeviceMappings ?? (_blockDeviceMappings = new InputList<Inputs.OceanBlockDeviceMappingGetArgs>());
            set => _blockDeviceMappings = value;
        }

        /// <summary>
        /// The name of the ECS cluster.
        /// </summary>
        [Input("clusterName")]
        public Input<string>? ClusterName { get; set; }

        [Input("clusterOrientations")]
        private InputList<Inputs.OceanClusterOrientationGetArgs>? _clusterOrientations;
        public InputList<Inputs.OceanClusterOrientationGetArgs> ClusterOrientations
        {
            get => _clusterOrientations ?? (_clusterOrientations = new InputList<Inputs.OceanClusterOrientationGetArgs>());
            set => _clusterOrientations = value;
        }

        /// <summary>
        /// The number of instances to launch and maintain in the cluster.
        /// </summary>
        [Input("desiredCapacity")]
        public Input<int>? DesiredCapacity { get; set; }

        /// <summary>
        /// The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
        /// </summary>
        [Input("drainingTimeout")]
        public Input<int>? DrainingTimeout { get; set; }

        /// <summary>
        /// Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
        /// </summary>
        [Input("ebsOptimized")]
        public Input<bool>? EbsOptimized { get; set; }

        /// <summary>
        /// If no Spot instance markets are available, enable Ocean to launch On-Demand instances instead.
        /// </summary>
        [Input("fallbackToOndemand")]
        public Input<bool>? FallbackToOndemand { get; set; }

        [Input("filters")]
        public Input<Inputs.OceanFiltersGetArgs>? Filters { get; set; }

        /// <summary>
        /// The instance profile iam role.
        /// </summary>
        [Input("iamInstanceProfile")]
        public Input<string>? IamInstanceProfile { get; set; }

        /// <summary>
        /// ID of the image used to launch the instances.
        /// </summary>
        [Input("imageId")]
        public Input<string>? ImageId { get; set; }

        /// <summary>
        /// Ocean instance metadata options object for IMDSv2.
        /// </summary>
        [Input("instanceMetadataOptions")]
        public Input<Inputs.OceanInstanceMetadataOptionsGetArgs>? InstanceMetadataOptions { get; set; }

        /// <summary>
        /// The key pair to attach the instances.
        /// </summary>
        [Input("keyPair")]
        public Input<string>? KeyPair { get; set; }

        /// <summary>
        /// Logging configuration.
        /// </summary>
        [Input("logging")]
        public Input<Inputs.OceanLoggingGetArgs>? Logging { get; set; }

        /// <summary>
        /// The upper limit of instances the cluster can scale up to.
        /// </summary>
        [Input("maxSize")]
        public Input<int>? MaxSize { get; set; }

        /// <summary>
        /// The lower limit of instances the cluster can scale down to.
        /// </summary>
        [Input("minSize")]
        public Input<int>? MinSize { get; set; }

        /// <summary>
        /// Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
        /// </summary>
        [Input("monitoring")]
        public Input<bool>? Monitoring { get; set; }

        /// <summary>
        /// The Ocean cluster name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Object. Set auto image update settings.
        /// </summary>
        [Input("optimizeImages")]
        public Input<Inputs.OceanOptimizeImagesGetArgs>? OptimizeImages { get; set; }

        /// <summary>
        /// The region the cluster will run in.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("scheduledTasks")]
        private InputList<Inputs.OceanScheduledTaskGetArgs>? _scheduledTasks;

        /// <summary>
        /// While used, you can control whether the group should perform a deployment after an update to the configuration.
        /// </summary>
        public InputList<Inputs.OceanScheduledTaskGetArgs> ScheduledTasks
        {
            get => _scheduledTasks ?? (_scheduledTasks = new InputList<Inputs.OceanScheduledTaskGetArgs>());
            set => _scheduledTasks = value;
        }

        [Input("securityGroupIds")]
        private InputList<string>? _securityGroupIds;

        /// <summary>
        /// One or more security group ids.
        /// </summary>
        public InputList<string> SecurityGroupIds
        {
            get => _securityGroupIds ?? (_securityGroupIds = new InputList<string>());
            set => _securityGroupIds = value;
        }

        /// <summary>
        /// The percentage of Spot instances that would spin up from the `desired_capacity` number.
        /// </summary>
        [Input("spotPercentage")]
        public Input<int>? SpotPercentage { get; set; }

        [Input("subnetIds")]
        private InputList<string>? _subnetIds;

        /// <summary>
        /// A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public ip.
        /// </summary>
        public InputList<string> SubnetIds
        {
            get => _subnetIds ?? (_subnetIds = new InputList<string>());
            set => _subnetIds = value;
        }

        [Input("tags")]
        private InputList<Inputs.OceanTagGetArgs>? _tags;

        /// <summary>
        /// Optionally adds tags to instances launched in an Ocean cluster.
        /// </summary>
        public InputList<Inputs.OceanTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.OceanTagGetArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// While used, you can control whether the group should perform a deployment after an update to the configuration.
        /// </summary>
        [Input("updatePolicy")]
        public Input<Inputs.OceanUpdatePolicyGetArgs>? UpdatePolicy { get; set; }

        /// <summary>
        /// launch specification defined on the Ocean object will function only as a template for virtual node groups.
        /// </summary>
        [Input("useAsTemplateOnly")]
        public Input<bool>? UseAsTemplateOnly { get; set; }

        /// <summary>
        /// Base64-encoded MIME user data to make available to the instances.
        /// </summary>
        [Input("userData")]
        public Input<string>? UserData { get; set; }

        /// <summary>
        /// If savings plans exist, Ocean will utilize them before launching Spot instances.
        /// </summary>
        [Input("utilizeCommitments")]
        public Input<bool>? UtilizeCommitments { get; set; }

        /// <summary>
        /// If Reserved instances exist, Ocean will utilize them before launching Spot instances.
        /// </summary>
        [Input("utilizeReservedInstances")]
        public Input<bool>? UtilizeReservedInstances { get; set; }

        [Input("whitelists")]
        private InputList<string>? _whitelists;
        public InputList<string> Whitelists
        {
            get => _whitelists ?? (_whitelists = new InputList<string>());
            set => _whitelists = value;
        }

        public OceanState()
        {
        }
        public static new OceanState Empty => new OceanState();
    }
}
