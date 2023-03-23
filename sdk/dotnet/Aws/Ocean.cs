// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws
{
    /// <summary>
    /// ## Scheduled Task
    /// 
    /// * `scheduled_task` - (Optional) Set scheduling object.
    ///     * `shutdown_hours` - (Optional) Set shutdown hours for cluster object.
    ///         * `is_enabled` - (Optional) Toggle the shutdown hours task. (Example: `true`).
    ///         * `time_windows` - (Required) Set time windows for shutdown hours. Specify a list of `timeWindows` with at least one time window Each string is in the format of: `ddd:hh:mm-ddd:hh:mm` where `ddd` = day of week = Sun | Mon | Tue | Wed | Thu | Fri | Sat, `hh` = hour 24 = 0 -23, `mm` = minute = 0 - 59. Time windows should not overlap. Required if `cluster.scheduling.isEnabled` is `true`. (Example: `Fri:15:30-Wed:14:30`).
    ///     * `tasks` - (Optional) The scheduling tasks for the cluster.
    ///         * `is_enabled` - (Required)  Describes whether the task is enabled. When true the task should run when false it should not run. Required for `cluster.scheduling.tasks` object.
    ///         * `cron_expression` - (Required) A valid cron expression. The cron is running in UTC time zone and is in Unix cron format Cron Expression Validator Script. Only one of `frequency` or `cronExpression` should be used at a time. Required for `cluster.scheduling.tasks` object. (Example: `0 1 * * *`).
    ///         * `task_type` - (Required) Valid values: `clusterRoll`. Required for `cluster.scheduling.tasks` object. (Example: `clusterRoll`).
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    /// });
    /// ```
    /// 
    /// &lt;a id="attributes-reference"&gt;&lt;/a&gt;
    /// 
    /// ## Import
    /// 
    /// Clusters can be imported using the Ocean `id`, e.g., hcl
    /// 
    /// ```sh
    ///  $ pulumi import spotinst:aws/ocean:Ocean this o-12345678
    /// ```
    /// </summary>
    [SpotInstResourceType("spotinst:aws/ocean:Ocean")]
    public partial class Ocean : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Configure IPv6 address allocation.
        /// </summary>
        [Output("associateIpv6Address")]
        public Output<bool?> AssociateIpv6Address { get; private set; } = null!;

        /// <summary>
        /// Configure public IP address allocation.
        /// </summary>
        [Output("associatePublicIpAddress")]
        public Output<bool?> AssociatePublicIpAddress { get; private set; } = null!;

        /// <summary>
        /// Describes the Ocean Kubernetes Auto Scaler.
        /// </summary>
        [Output("autoscaler")]
        public Output<Outputs.OceanAutoscaler?> Autoscaler { get; private set; } = null!;

        /// <summary>
        /// Instance types not allowed in the Ocean cluster. Cannot be configured if `whitelist` is configured.
        /// </summary>
        [Output("blacklists")]
        public Output<ImmutableArray<string>> Blacklists { get; private set; } = null!;

        /// <summary>
        /// Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
        /// </summary>
        [Output("blockDeviceMappings")]
        public Output<ImmutableArray<Outputs.OceanBlockDeviceMapping>> BlockDeviceMappings { get; private set; } = null!;

        [Output("clusterOrientations")]
        public Output<ImmutableArray<Outputs.OceanClusterOrientation>> ClusterOrientations { get; private set; } = null!;

        /// <summary>
        /// A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
        /// </summary>
        [Output("controllerId")]
        public Output<string?> ControllerId { get; private set; } = null!;

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
        /// If not Spot instance markets are available, enable Ocean to launch On-Demand instances instead.
        /// </summary>
        [Output("fallbackToOndemand")]
        public Output<bool?> FallbackToOndemand { get; private set; } = null!;

        /// <summary>
        /// List of filters. The Instance types that match with all filters compose the Ocean's whitelist parameter. Cannot be configured together with whitelist/blacklist.
        /// </summary>
        [Output("filters")]
        public Output<Outputs.OceanFilters?> Filters { get; private set; } = null!;

        /// <summary>
        /// The amount of time, in seconds, after the instance has launched to start checking its health.
        /// </summary>
        [Output("gracePeriod")]
        public Output<int?> GracePeriod { get; private set; } = null!;

        /// <summary>
        /// The instance profile iam role.
        /// </summary>
        [Output("iamInstanceProfile")]
        public Output<string?> IamInstanceProfile { get; private set; } = null!;

        /// <summary>
        /// ID of the image used to launch the instances.
        /// </summary>
        [Output("imageId")]
        public Output<string?> ImageId { get; private set; } = null!;

        /// <summary>
        /// Ocean instance metadata options object for IMDSv2.
        /// </summary>
        [Output("instanceMetadataOptions")]
        public Output<Outputs.OceanInstanceMetadataOptions?> InstanceMetadataOptions { get; private set; } = null!;

        /// <summary>
        /// The key pair to attach the instances.
        /// </summary>
        [Output("keyName")]
        public Output<string?> KeyName { get; private set; } = null!;

        /// <summary>
        /// Array of load balancer objects to add to ocean cluster
        /// </summary>
        [Output("loadBalancers")]
        public Output<ImmutableArray<Outputs.OceanLoadBalancer>> LoadBalancers { get; private set; } = null!;

        /// <summary>
        /// Logging configuration.
        /// </summary>
        [Output("logging")]
        public Output<Outputs.OceanLogging?> Logging { get; private set; } = null!;

        /// <summary>
        /// The upper limit of instances the cluster can scale up to.
        /// </summary>
        [Output("maxSize")]
        public Output<int?> MaxSize { get; private set; } = null!;

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
        /// Required if type is set to `CLASSIC`
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The region the cluster will run in.
        /// </summary>
        [Output("region")]
        public Output<string?> Region { get; private set; } = null!;

        /// <summary>
        /// The size (in Gb) to allocate for the root volume. Minimum `20`.
        /// </summary>
        [Output("rootVolumeSize")]
        public Output<int?> RootVolumeSize { get; private set; } = null!;

        [Output("scheduledTasks")]
        public Output<ImmutableArray<Outputs.OceanScheduledTask>> ScheduledTasks { get; private set; } = null!;

        /// <summary>
        /// One or more security group ids.
        /// </summary>
        [Output("securityGroups")]
        public Output<ImmutableArray<string>> SecurityGroups { get; private set; } = null!;

        /// <summary>
        /// The percentage of Spot instances that would spin up from the `desired_capacity` number.
        /// </summary>
        [Output("spotPercentage")]
        public Output<int?> SpotPercentage { get; private set; } = null!;

        /// <summary>
        /// Ocean will spread the nodes across markets by this value. Possible values: `vcpu` or `count`.
        /// </summary>
        [Output("spreadNodesBy")]
        public Output<string?> SpreadNodesBy { get; private set; } = null!;

        /// <summary>
        /// A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public IP.
        /// </summary>
        [Output("subnetIds")]
        public Output<ImmutableArray<string>> SubnetIds { get; private set; } = null!;

        /// <summary>
        /// Optionally adds tags to instances launched in an Ocean cluster.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<Outputs.OceanTag>> Tags { get; private set; } = null!;

        [Output("updatePolicy")]
        public Output<Outputs.OceanUpdatePolicy?> UpdatePolicy { get; private set; } = null!;

        /// <summary>
        /// launch specification defined on the Ocean object will function only as a template for virtual node groups.
        /// When set to true, on Ocean resource creation please make sure your custom VNG has an initial_nodes parameter to create nodes for your VNG.
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

        /// <summary>
        /// Instance types allowed in the Ocean cluster. Cannot be configured if `blacklist` is configured.
        /// </summary>
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
            : base("spotinst:aws/ocean:Ocean", name, args ?? new OceanArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Ocean(string name, Input<string> id, OceanState? state = null, CustomResourceOptions? options = null)
            : base("spotinst:aws/ocean:Ocean", name, state, MakeResourceOptions(options, id))
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
        /// Configure IPv6 address allocation.
        /// </summary>
        [Input("associateIpv6Address")]
        public Input<bool>? AssociateIpv6Address { get; set; }

        /// <summary>
        /// Configure public IP address allocation.
        /// </summary>
        [Input("associatePublicIpAddress")]
        public Input<bool>? AssociatePublicIpAddress { get; set; }

        /// <summary>
        /// Describes the Ocean Kubernetes Auto Scaler.
        /// </summary>
        [Input("autoscaler")]
        public Input<Inputs.OceanAutoscalerArgs>? Autoscaler { get; set; }

        [Input("blacklists")]
        private InputList<string>? _blacklists;

        /// <summary>
        /// Instance types not allowed in the Ocean cluster. Cannot be configured if `whitelist` is configured.
        /// </summary>
        public InputList<string> Blacklists
        {
            get => _blacklists ?? (_blacklists = new InputList<string>());
            set => _blacklists = value;
        }

        [Input("blockDeviceMappings")]
        private InputList<Inputs.OceanBlockDeviceMappingArgs>? _blockDeviceMappings;

        /// <summary>
        /// Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
        /// </summary>
        public InputList<Inputs.OceanBlockDeviceMappingArgs> BlockDeviceMappings
        {
            get => _blockDeviceMappings ?? (_blockDeviceMappings = new InputList<Inputs.OceanBlockDeviceMappingArgs>());
            set => _blockDeviceMappings = value;
        }

        [Input("clusterOrientations")]
        private InputList<Inputs.OceanClusterOrientationArgs>? _clusterOrientations;
        public InputList<Inputs.OceanClusterOrientationArgs> ClusterOrientations
        {
            get => _clusterOrientations ?? (_clusterOrientations = new InputList<Inputs.OceanClusterOrientationArgs>());
            set => _clusterOrientations = value;
        }

        /// <summary>
        /// A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
        /// </summary>
        [Input("controllerId")]
        public Input<string>? ControllerId { get; set; }

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
        /// If not Spot instance markets are available, enable Ocean to launch On-Demand instances instead.
        /// </summary>
        [Input("fallbackToOndemand")]
        public Input<bool>? FallbackToOndemand { get; set; }

        /// <summary>
        /// List of filters. The Instance types that match with all filters compose the Ocean's whitelist parameter. Cannot be configured together with whitelist/blacklist.
        /// </summary>
        [Input("filters")]
        public Input<Inputs.OceanFiltersArgs>? Filters { get; set; }

        /// <summary>
        /// The amount of time, in seconds, after the instance has launched to start checking its health.
        /// </summary>
        [Input("gracePeriod")]
        public Input<int>? GracePeriod { get; set; }

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
        public Input<Inputs.OceanInstanceMetadataOptionsArgs>? InstanceMetadataOptions { get; set; }

        /// <summary>
        /// The key pair to attach the instances.
        /// </summary>
        [Input("keyName")]
        public Input<string>? KeyName { get; set; }

        [Input("loadBalancers")]
        private InputList<Inputs.OceanLoadBalancerArgs>? _loadBalancers;

        /// <summary>
        /// Array of load balancer objects to add to ocean cluster
        /// </summary>
        public InputList<Inputs.OceanLoadBalancerArgs> LoadBalancers
        {
            get => _loadBalancers ?? (_loadBalancers = new InputList<Inputs.OceanLoadBalancerArgs>());
            set => _loadBalancers = value;
        }

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
        /// Required if type is set to `CLASSIC`
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The region the cluster will run in.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The size (in Gb) to allocate for the root volume. Minimum `20`.
        /// </summary>
        [Input("rootVolumeSize")]
        public Input<int>? RootVolumeSize { get; set; }

        [Input("scheduledTasks")]
        private InputList<Inputs.OceanScheduledTaskArgs>? _scheduledTasks;
        public InputList<Inputs.OceanScheduledTaskArgs> ScheduledTasks
        {
            get => _scheduledTasks ?? (_scheduledTasks = new InputList<Inputs.OceanScheduledTaskArgs>());
            set => _scheduledTasks = value;
        }

        [Input("securityGroups", required: true)]
        private InputList<string>? _securityGroups;

        /// <summary>
        /// One or more security group ids.
        /// </summary>
        public InputList<string> SecurityGroups
        {
            get => _securityGroups ?? (_securityGroups = new InputList<string>());
            set => _securityGroups = value;
        }

        /// <summary>
        /// The percentage of Spot instances that would spin up from the `desired_capacity` number.
        /// </summary>
        [Input("spotPercentage")]
        public Input<int>? SpotPercentage { get; set; }

        /// <summary>
        /// Ocean will spread the nodes across markets by this value. Possible values: `vcpu` or `count`.
        /// </summary>
        [Input("spreadNodesBy")]
        public Input<string>? SpreadNodesBy { get; set; }

        [Input("subnetIds", required: true)]
        private InputList<string>? _subnetIds;

        /// <summary>
        /// A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public IP.
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

        [Input("updatePolicy")]
        public Input<Inputs.OceanUpdatePolicyArgs>? UpdatePolicy { get; set; }

        /// <summary>
        /// launch specification defined on the Ocean object will function only as a template for virtual node groups.
        /// When set to true, on Ocean resource creation please make sure your custom VNG has an initial_nodes parameter to create nodes for your VNG.
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

        /// <summary>
        /// Instance types allowed in the Ocean cluster. Cannot be configured if `blacklist` is configured.
        /// </summary>
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
        /// Configure IPv6 address allocation.
        /// </summary>
        [Input("associateIpv6Address")]
        public Input<bool>? AssociateIpv6Address { get; set; }

        /// <summary>
        /// Configure public IP address allocation.
        /// </summary>
        [Input("associatePublicIpAddress")]
        public Input<bool>? AssociatePublicIpAddress { get; set; }

        /// <summary>
        /// Describes the Ocean Kubernetes Auto Scaler.
        /// </summary>
        [Input("autoscaler")]
        public Input<Inputs.OceanAutoscalerGetArgs>? Autoscaler { get; set; }

        [Input("blacklists")]
        private InputList<string>? _blacklists;

        /// <summary>
        /// Instance types not allowed in the Ocean cluster. Cannot be configured if `whitelist` is configured.
        /// </summary>
        public InputList<string> Blacklists
        {
            get => _blacklists ?? (_blacklists = new InputList<string>());
            set => _blacklists = value;
        }

        [Input("blockDeviceMappings")]
        private InputList<Inputs.OceanBlockDeviceMappingGetArgs>? _blockDeviceMappings;

        /// <summary>
        /// Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
        /// </summary>
        public InputList<Inputs.OceanBlockDeviceMappingGetArgs> BlockDeviceMappings
        {
            get => _blockDeviceMappings ?? (_blockDeviceMappings = new InputList<Inputs.OceanBlockDeviceMappingGetArgs>());
            set => _blockDeviceMappings = value;
        }

        [Input("clusterOrientations")]
        private InputList<Inputs.OceanClusterOrientationGetArgs>? _clusterOrientations;
        public InputList<Inputs.OceanClusterOrientationGetArgs> ClusterOrientations
        {
            get => _clusterOrientations ?? (_clusterOrientations = new InputList<Inputs.OceanClusterOrientationGetArgs>());
            set => _clusterOrientations = value;
        }

        /// <summary>
        /// A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
        /// </summary>
        [Input("controllerId")]
        public Input<string>? ControllerId { get; set; }

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
        /// If not Spot instance markets are available, enable Ocean to launch On-Demand instances instead.
        /// </summary>
        [Input("fallbackToOndemand")]
        public Input<bool>? FallbackToOndemand { get; set; }

        /// <summary>
        /// List of filters. The Instance types that match with all filters compose the Ocean's whitelist parameter. Cannot be configured together with whitelist/blacklist.
        /// </summary>
        [Input("filters")]
        public Input<Inputs.OceanFiltersGetArgs>? Filters { get; set; }

        /// <summary>
        /// The amount of time, in seconds, after the instance has launched to start checking its health.
        /// </summary>
        [Input("gracePeriod")]
        public Input<int>? GracePeriod { get; set; }

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
        [Input("keyName")]
        public Input<string>? KeyName { get; set; }

        [Input("loadBalancers")]
        private InputList<Inputs.OceanLoadBalancerGetArgs>? _loadBalancers;

        /// <summary>
        /// Array of load balancer objects to add to ocean cluster
        /// </summary>
        public InputList<Inputs.OceanLoadBalancerGetArgs> LoadBalancers
        {
            get => _loadBalancers ?? (_loadBalancers = new InputList<Inputs.OceanLoadBalancerGetArgs>());
            set => _loadBalancers = value;
        }

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
        /// Required if type is set to `CLASSIC`
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The region the cluster will run in.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The size (in Gb) to allocate for the root volume. Minimum `20`.
        /// </summary>
        [Input("rootVolumeSize")]
        public Input<int>? RootVolumeSize { get; set; }

        [Input("scheduledTasks")]
        private InputList<Inputs.OceanScheduledTaskGetArgs>? _scheduledTasks;
        public InputList<Inputs.OceanScheduledTaskGetArgs> ScheduledTasks
        {
            get => _scheduledTasks ?? (_scheduledTasks = new InputList<Inputs.OceanScheduledTaskGetArgs>());
            set => _scheduledTasks = value;
        }

        [Input("securityGroups")]
        private InputList<string>? _securityGroups;

        /// <summary>
        /// One or more security group ids.
        /// </summary>
        public InputList<string> SecurityGroups
        {
            get => _securityGroups ?? (_securityGroups = new InputList<string>());
            set => _securityGroups = value;
        }

        /// <summary>
        /// The percentage of Spot instances that would spin up from the `desired_capacity` number.
        /// </summary>
        [Input("spotPercentage")]
        public Input<int>? SpotPercentage { get; set; }

        /// <summary>
        /// Ocean will spread the nodes across markets by this value. Possible values: `vcpu` or `count`.
        /// </summary>
        [Input("spreadNodesBy")]
        public Input<string>? SpreadNodesBy { get; set; }

        [Input("subnetIds")]
        private InputList<string>? _subnetIds;

        /// <summary>
        /// A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public IP.
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

        [Input("updatePolicy")]
        public Input<Inputs.OceanUpdatePolicyGetArgs>? UpdatePolicy { get; set; }

        /// <summary>
        /// launch specification defined on the Ocean object will function only as a template for virtual node groups.
        /// When set to true, on Ocean resource creation please make sure your custom VNG has an initial_nodes parameter to create nodes for your VNG.
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

        /// <summary>
        /// Instance types allowed in the Ocean cluster. Cannot be configured if `blacklist` is configured.
        /// </summary>
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
