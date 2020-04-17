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
    /// Provides a Spotinst AWS ManagedInstance resource.
    /// 
    /// 
    /// ## Load Balancers
    /// 
    ///    * `loadBalancersConfig` - (Optional) LB integration object.
    ///        * `load_balancers` - (Optional) List of load balancers configs.
    ///             * `name` - The AWS resource name. Required for Classic Load Balancer. Optional for Application Load Balancer.
    ///             * `arn` - The AWS resource ARN (Required only for ALB target groups).
    ///             * `balancer_id` - The Multai load balancer ID.
    ///             Default: lb-123456
    ///             * `target_set_id` - The Multai load target set ID.
    ///             Default: ts-123456
    ///             * `auto_weight` - “Auto Weight” will automatically provide a higher weight for instances that are larger as appropriate. For example, if you have configured your Elastigroup with m4.large and m4.xlarge instances the m4.large will have half the weight of an m4.xlarge. This ensures that larger instances receive a higher number of MLB requests.
    ///             * `zone_awareness` - “AZ Awareness” will ensure that instances within the same AZ are using the corresponding MLB runtime instance in the same AZ. This feature reduces multi-zone data transfer fees.
    ///             * `type` - The resource type. Valid Values: CLASSIC, TARGET_GROUP, MULTAI_TARGET_SET.
    /// 
    /// Usage:
    /// 
    ///    ```hcl
    ///    load_balancers {
    ///        arn  = "arn"
    ///        type = "CLASSIC"
    ///        balancer_id   = "lb-123"
    ///        target_set_id = "ts-123"
    ///        auto_weight   = "true"
    ///        az_awareness = "true"
    ///      }
    ///    ```
    /// 
    /// &lt;a id="route53"&gt;&lt;/a&gt;
    /// </summary>
    public partial class ManagedInstance : Pulumi.CustomResource
    {
        /// <summary>
        /// Enable the auto healing which auto replaces the instance in case the health check fails, default: `“true”`. 
        /// </summary>
        [Output("autoHealing")]
        public Output<bool?> AutoHealing { get; private set; } = null!;

        /// <summary>
        /// Determine the way we attach the data volumes to the data devices. Valid values: `"reattach"`, `"onLaunch"`.
        /// Default: `"onLaunch"`.
        /// </summary>
        [Output("blockDevicesMode")]
        public Output<string?> BlockDevicesMode { get; private set; } = null!;

        /// <summary>
        /// cpuCredits can have one of two values: “unlimited”, “standard”.
        /// Default: unlimited
        /// </summary>
        [Output("cpuCredits")]
        public Output<string?> CpuCredits { get; private set; } = null!;

        /// <summary>
        /// The ManagedInstance description.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The time in seconds to allow the instance be drained from incoming TCP connections and detached from ELB before terminating it, during a scale down operation.
        /// </summary>
        [Output("drainingTimeout")]
        public Output<int?> DrainingTimeout { get; private set; } = null!;

        /// <summary>
        /// Enable EBS optimization for supported instance which is not enabled by default. Note - additional charges will be applied.
        /// Default: false
        /// </summary>
        [Output("ebsOptimized")]
        public Output<bool> EbsOptimized { get; private set; } = null!;

        /// <summary>
        /// Elastic IP Allocation Id to associate to the instance.
        /// </summary>
        [Output("elasticIp")]
        public Output<string?> ElasticIp { get; private set; } = null!;

        /// <summary>
        /// Describes whether instance Enhanced Monitoring is enabled.
        /// Default: false
        /// </summary>
        [Output("enableMonitoring")]
        public Output<bool?> EnableMonitoring { get; private set; } = null!;

        [Output("fallBackToOd")]
        public Output<bool?> FallBackToOd { get; private set; } = null!;

        /// <summary>
        /// The amount of time, in seconds, after the instance has launched to starts and check its health, default `“120"`.
        /// </summary>
        [Output("gracePeriod")]
        public Output<int?> GracePeriod { get; private set; } = null!;

        /// <summary>
        /// The service to use for the health check. Valid values: `“EC2”`, `“ELB”`, `“TARGET_GROUP”`, `“MULTAI_TARGET_SET”`.
        /// Default: `“EC2”`.
        /// </summary>
        [Output("healthCheckType")]
        public Output<string?> HealthCheckType { get; private set; } = null!;

        /// <summary>
        /// Set IAM profile to instance. Set only one of ARN or Name.
        /// </summary>
        [Output("iamInstanceProfile")]
        public Output<string?> IamInstanceProfile { get; private set; } = null!;

        /// <summary>
        /// The ID of the image used to launch the instance.
        /// </summary>
        [Output("imageId")]
        public Output<string> ImageId { get; private set; } = null!;

        /// <summary>
        /// Comma separated list of available instance types for instance.
        /// </summary>
        [Output("instanceTypes")]
        public Output<ImmutableArray<string>> InstanceTypes { get; private set; } = null!;

        [Output("integrationRoute53")]
        public Output<Outputs.ManagedInstanceIntegrationRoute53?> IntegrationRoute53 { get; private set; } = null!;

        /// <summary>
        /// Specify a Key Pair to attach to the instances.
        /// </summary>
        [Output("keyPair")]
        public Output<string?> KeyPair { get; private set; } = null!;

        /// <summary>
        /// Set lifecycle, valid values: `“spot”`, `“on_demand”`.
        /// Default `"spot"`.
        /// </summary>
        [Output("lifeCycle")]
        public Output<string?> LifeCycle { get; private set; } = null!;

        [Output("loadBalancers")]
        public Output<ImmutableArray<Outputs.ManagedInstanceLoadBalancer>> LoadBalancers { get; private set; } = null!;

        /// <summary>
        /// The ManagedInstance name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("networkInterfaces")]
        public Output<ImmutableArray<Outputs.ManagedInstanceNetworkInterface>> NetworkInterfaces { get; private set; } = null!;

        /// <summary>
        /// When performAt is 'timeWindow': must specify a list of 'timeWindows' with at least one time window Each string is in the format of - ddd:hh:mm-ddd:hh:mm ddd = day of week = Sun | Mon | Tue | Wed | Thu | Fri | Sat hh = hour 24 = 0 -23 mm = minute = 0 - 59.
        /// </summary>
        [Output("optimizationWindows")]
        public Output<ImmutableArray<string>> OptimizationWindows { get; private set; } = null!;

        /// <summary>
        /// Select a prediction strategy. Valid values: `"balanced"`, `"costOriented"`, `"availabilityOriented"`, `"cheapest"`.
        /// Default: `"availabilityOriented"`.
        /// </summary>
        [Output("orientation")]
        public Output<string?> Orientation { get; private set; } = null!;

        /// <summary>
        /// Should the instance maintain its Data volumes. 
        /// </summary>
        [Output("persistBlockDevices")]
        public Output<bool> PersistBlockDevices { get; private set; } = null!;

        /// <summary>
        /// Should the instance maintain its private IP.  
        /// </summary>
        [Output("persistPrivateIp")]
        public Output<bool?> PersistPrivateIp { get; private set; } = null!;

        /// <summary>
        /// Should the instance maintain its root device volumes.
        /// </summary>
        [Output("persistRootDevice")]
        public Output<bool?> PersistRootDevice { get; private set; } = null!;

        /// <summary>
        /// Valid values: "default", "dedicated"
        /// Default: default
        /// </summary>
        [Output("placementTenancy")]
        public Output<string?> PlacementTenancy { get; private set; } = null!;

        /// <summary>
        /// Preferred instance types for the instance. We will automatically select optional similar instance types to ensure optimized cost efficiency
        /// </summary>
        [Output("preferredType")]
        public Output<string?> PreferredType { get; private set; } = null!;

        /// <summary>
        /// Private IP Allocation Id to associate to the instance. 
        /// </summary>
        [Output("privateIp")]
        public Output<string?> PrivateIp { get; private set; } = null!;

        /// <summary>
        /// Operation system type. Valid values: `"Linux/UNIX"`, `"SUSE Linux"`, `"Windows"`, `"Red Hat Enterprise Linux"`, `"Linux/UNIX (Amazon VPC)"`, `"SUSE Linux (Amazon VPC)"`, `"Windows (Amazon VPC)"`,  `"Red Hat Enterprise Linux (Amazon VPC)"`.    
        /// </summary>
        [Output("product")]
        public Output<string> Product { get; private set; } = null!;

        /// <summary>
        /// The AWS region your group will be created in.
        /// </summary>
        [Output("region")]
        public Output<string?> Region { get; private set; } = null!;

        [Output("revertToSpot")]
        public Output<Outputs.ManagedInstanceRevertToSpot?> RevertToSpot { get; private set; } = null!;

        [Output("scheduledTasks")]
        public Output<ImmutableArray<Outputs.ManagedInstanceScheduledTask>> ScheduledTasks { get; private set; } = null!;

        /// <summary>
        /// One or more security group IDs.
        /// </summary>
        [Output("securityGroupIds")]
        public Output<ImmutableArray<string>> SecurityGroupIds { get; private set; } = null!;

        /// <summary>
        /// The Base64-encoded shutdown script to execute prior to instance termination.
        /// </summary>
        [Output("shutdownScript")]
        public Output<string?> ShutdownScript { get; private set; } = null!;

        /// <summary>
        /// A comma-separated list of subnet identifiers for your instance.
        /// </summary>
        [Output("subnetIds")]
        public Output<ImmutableArray<string>> SubnetIds { get; private set; } = null!;

        /// <summary>
        /// Set tags for the instance. Items should be unique.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<Outputs.ManagedInstanceTag>> Tags { get; private set; } = null!;

        /// <summary>
        /// The amount of time, in seconds, an existing instance should remain active after becoming unhealthy. After the set time out the instance will be replaced, default `“120"`.
        /// </summary>
        [Output("unhealthyDuration")]
        public Output<int?> UnhealthyDuration { get; private set; } = null!;

        /// <summary>
        /// The Base64-encoded MIME user data to make available to the instances.
        /// </summary>
        [Output("userData")]
        public Output<string?> UserData { get; private set; } = null!;

        /// <summary>
        /// In case of any available Reserved Instances, Managed Instance will utilize them before purchasing Spot instances.
        /// Default: `"false"`.
        /// </summary>
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

    public sealed class ManagedInstanceArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable the auto healing which auto replaces the instance in case the health check fails, default: `“true”`. 
        /// </summary>
        [Input("autoHealing")]
        public Input<bool>? AutoHealing { get; set; }

        /// <summary>
        /// Determine the way we attach the data volumes to the data devices. Valid values: `"reattach"`, `"onLaunch"`.
        /// Default: `"onLaunch"`.
        /// </summary>
        [Input("blockDevicesMode")]
        public Input<string>? BlockDevicesMode { get; set; }

        /// <summary>
        /// cpuCredits can have one of two values: “unlimited”, “standard”.
        /// Default: unlimited
        /// </summary>
        [Input("cpuCredits")]
        public Input<string>? CpuCredits { get; set; }

        /// <summary>
        /// The ManagedInstance description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The time in seconds to allow the instance be drained from incoming TCP connections and detached from ELB before terminating it, during a scale down operation.
        /// </summary>
        [Input("drainingTimeout")]
        public Input<int>? DrainingTimeout { get; set; }

        /// <summary>
        /// Enable EBS optimization for supported instance which is not enabled by default. Note - additional charges will be applied.
        /// Default: false
        /// </summary>
        [Input("ebsOptimized")]
        public Input<bool>? EbsOptimized { get; set; }

        /// <summary>
        /// Elastic IP Allocation Id to associate to the instance.
        /// </summary>
        [Input("elasticIp")]
        public Input<string>? ElasticIp { get; set; }

        /// <summary>
        /// Describes whether instance Enhanced Monitoring is enabled.
        /// Default: false
        /// </summary>
        [Input("enableMonitoring")]
        public Input<bool>? EnableMonitoring { get; set; }

        [Input("fallBackToOd")]
        public Input<bool>? FallBackToOd { get; set; }

        /// <summary>
        /// The amount of time, in seconds, after the instance has launched to starts and check its health, default `“120"`.
        /// </summary>
        [Input("gracePeriod")]
        public Input<int>? GracePeriod { get; set; }

        /// <summary>
        /// The service to use for the health check. Valid values: `“EC2”`, `“ELB”`, `“TARGET_GROUP”`, `“MULTAI_TARGET_SET”`.
        /// Default: `“EC2”`.
        /// </summary>
        [Input("healthCheckType")]
        public Input<string>? HealthCheckType { get; set; }

        /// <summary>
        /// Set IAM profile to instance. Set only one of ARN or Name.
        /// </summary>
        [Input("iamInstanceProfile")]
        public Input<string>? IamInstanceProfile { get; set; }

        /// <summary>
        /// The ID of the image used to launch the instance.
        /// </summary>
        [Input("imageId", required: true)]
        public Input<string> ImageId { get; set; } = null!;

        [Input("instanceTypes", required: true)]
        private InputList<string>? _instanceTypes;

        /// <summary>
        /// Comma separated list of available instance types for instance.
        /// </summary>
        public InputList<string> InstanceTypes
        {
            get => _instanceTypes ?? (_instanceTypes = new InputList<string>());
            set => _instanceTypes = value;
        }

        [Input("integrationRoute53")]
        public Input<Inputs.ManagedInstanceIntegrationRoute53Args>? IntegrationRoute53 { get; set; }

        /// <summary>
        /// Specify a Key Pair to attach to the instances.
        /// </summary>
        [Input("keyPair")]
        public Input<string>? KeyPair { get; set; }

        /// <summary>
        /// Set lifecycle, valid values: `“spot”`, `“on_demand”`.
        /// Default `"spot"`.
        /// </summary>
        [Input("lifeCycle")]
        public Input<string>? LifeCycle { get; set; }

        [Input("loadBalancers")]
        private InputList<Inputs.ManagedInstanceLoadBalancerArgs>? _loadBalancers;
        public InputList<Inputs.ManagedInstanceLoadBalancerArgs> LoadBalancers
        {
            get => _loadBalancers ?? (_loadBalancers = new InputList<Inputs.ManagedInstanceLoadBalancerArgs>());
            set => _loadBalancers = value;
        }

        /// <summary>
        /// The ManagedInstance name.
        /// </summary>
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

        /// <summary>
        /// When performAt is 'timeWindow': must specify a list of 'timeWindows' with at least one time window Each string is in the format of - ddd:hh:mm-ddd:hh:mm ddd = day of week = Sun | Mon | Tue | Wed | Thu | Fri | Sat hh = hour 24 = 0 -23 mm = minute = 0 - 59.
        /// </summary>
        public InputList<string> OptimizationWindows
        {
            get => _optimizationWindows ?? (_optimizationWindows = new InputList<string>());
            set => _optimizationWindows = value;
        }

        /// <summary>
        /// Select a prediction strategy. Valid values: `"balanced"`, `"costOriented"`, `"availabilityOriented"`, `"cheapest"`.
        /// Default: `"availabilityOriented"`.
        /// </summary>
        [Input("orientation")]
        public Input<string>? Orientation { get; set; }

        /// <summary>
        /// Should the instance maintain its Data volumes. 
        /// </summary>
        [Input("persistBlockDevices", required: true)]
        public Input<bool> PersistBlockDevices { get; set; } = null!;

        /// <summary>
        /// Should the instance maintain its private IP.  
        /// </summary>
        [Input("persistPrivateIp")]
        public Input<bool>? PersistPrivateIp { get; set; }

        /// <summary>
        /// Should the instance maintain its root device volumes.
        /// </summary>
        [Input("persistRootDevice")]
        public Input<bool>? PersistRootDevice { get; set; }

        /// <summary>
        /// Valid values: "default", "dedicated"
        /// Default: default
        /// </summary>
        [Input("placementTenancy")]
        public Input<string>? PlacementTenancy { get; set; }

        /// <summary>
        /// Preferred instance types for the instance. We will automatically select optional similar instance types to ensure optimized cost efficiency
        /// </summary>
        [Input("preferredType")]
        public Input<string>? PreferredType { get; set; }

        /// <summary>
        /// Private IP Allocation Id to associate to the instance. 
        /// </summary>
        [Input("privateIp")]
        public Input<string>? PrivateIp { get; set; }

        /// <summary>
        /// Operation system type. Valid values: `"Linux/UNIX"`, `"SUSE Linux"`, `"Windows"`, `"Red Hat Enterprise Linux"`, `"Linux/UNIX (Amazon VPC)"`, `"SUSE Linux (Amazon VPC)"`, `"Windows (Amazon VPC)"`,  `"Red Hat Enterprise Linux (Amazon VPC)"`.    
        /// </summary>
        [Input("product", required: true)]
        public Input<string> Product { get; set; } = null!;

        /// <summary>
        /// The AWS region your group will be created in.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

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

        /// <summary>
        /// One or more security group IDs.
        /// </summary>
        public InputList<string> SecurityGroupIds
        {
            get => _securityGroupIds ?? (_securityGroupIds = new InputList<string>());
            set => _securityGroupIds = value;
        }

        /// <summary>
        /// The Base64-encoded shutdown script to execute prior to instance termination.
        /// </summary>
        [Input("shutdownScript")]
        public Input<string>? ShutdownScript { get; set; }

        [Input("subnetIds", required: true)]
        private InputList<string>? _subnetIds;

        /// <summary>
        /// A comma-separated list of subnet identifiers for your instance.
        /// </summary>
        public InputList<string> SubnetIds
        {
            get => _subnetIds ?? (_subnetIds = new InputList<string>());
            set => _subnetIds = value;
        }

        [Input("tags")]
        private InputList<Inputs.ManagedInstanceTagArgs>? _tags;

        /// <summary>
        /// Set tags for the instance. Items should be unique.
        /// </summary>
        public InputList<Inputs.ManagedInstanceTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.ManagedInstanceTagArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// The amount of time, in seconds, an existing instance should remain active after becoming unhealthy. After the set time out the instance will be replaced, default `“120"`.
        /// </summary>
        [Input("unhealthyDuration")]
        public Input<int>? UnhealthyDuration { get; set; }

        /// <summary>
        /// The Base64-encoded MIME user data to make available to the instances.
        /// </summary>
        [Input("userData")]
        public Input<string>? UserData { get; set; }

        /// <summary>
        /// In case of any available Reserved Instances, Managed Instance will utilize them before purchasing Spot instances.
        /// Default: `"false"`.
        /// </summary>
        [Input("utilizeReservedInstances")]
        public Input<bool>? UtilizeReservedInstances { get; set; }

        [Input("vpcId", required: true)]
        public Input<string> VpcId { get; set; } = null!;

        public ManagedInstanceArgs()
        {
        }
    }

    public sealed class ManagedInstanceState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable the auto healing which auto replaces the instance in case the health check fails, default: `“true”`. 
        /// </summary>
        [Input("autoHealing")]
        public Input<bool>? AutoHealing { get; set; }

        /// <summary>
        /// Determine the way we attach the data volumes to the data devices. Valid values: `"reattach"`, `"onLaunch"`.
        /// Default: `"onLaunch"`.
        /// </summary>
        [Input("blockDevicesMode")]
        public Input<string>? BlockDevicesMode { get; set; }

        /// <summary>
        /// cpuCredits can have one of two values: “unlimited”, “standard”.
        /// Default: unlimited
        /// </summary>
        [Input("cpuCredits")]
        public Input<string>? CpuCredits { get; set; }

        /// <summary>
        /// The ManagedInstance description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The time in seconds to allow the instance be drained from incoming TCP connections and detached from ELB before terminating it, during a scale down operation.
        /// </summary>
        [Input("drainingTimeout")]
        public Input<int>? DrainingTimeout { get; set; }

        /// <summary>
        /// Enable EBS optimization for supported instance which is not enabled by default. Note - additional charges will be applied.
        /// Default: false
        /// </summary>
        [Input("ebsOptimized")]
        public Input<bool>? EbsOptimized { get; set; }

        /// <summary>
        /// Elastic IP Allocation Id to associate to the instance.
        /// </summary>
        [Input("elasticIp")]
        public Input<string>? ElasticIp { get; set; }

        /// <summary>
        /// Describes whether instance Enhanced Monitoring is enabled.
        /// Default: false
        /// </summary>
        [Input("enableMonitoring")]
        public Input<bool>? EnableMonitoring { get; set; }

        [Input("fallBackToOd")]
        public Input<bool>? FallBackToOd { get; set; }

        /// <summary>
        /// The amount of time, in seconds, after the instance has launched to starts and check its health, default `“120"`.
        /// </summary>
        [Input("gracePeriod")]
        public Input<int>? GracePeriod { get; set; }

        /// <summary>
        /// The service to use for the health check. Valid values: `“EC2”`, `“ELB”`, `“TARGET_GROUP”`, `“MULTAI_TARGET_SET”`.
        /// Default: `“EC2”`.
        /// </summary>
        [Input("healthCheckType")]
        public Input<string>? HealthCheckType { get; set; }

        /// <summary>
        /// Set IAM profile to instance. Set only one of ARN or Name.
        /// </summary>
        [Input("iamInstanceProfile")]
        public Input<string>? IamInstanceProfile { get; set; }

        /// <summary>
        /// The ID of the image used to launch the instance.
        /// </summary>
        [Input("imageId")]
        public Input<string>? ImageId { get; set; }

        [Input("instanceTypes")]
        private InputList<string>? _instanceTypes;

        /// <summary>
        /// Comma separated list of available instance types for instance.
        /// </summary>
        public InputList<string> InstanceTypes
        {
            get => _instanceTypes ?? (_instanceTypes = new InputList<string>());
            set => _instanceTypes = value;
        }

        [Input("integrationRoute53")]
        public Input<Inputs.ManagedInstanceIntegrationRoute53GetArgs>? IntegrationRoute53 { get; set; }

        /// <summary>
        /// Specify a Key Pair to attach to the instances.
        /// </summary>
        [Input("keyPair")]
        public Input<string>? KeyPair { get; set; }

        /// <summary>
        /// Set lifecycle, valid values: `“spot”`, `“on_demand”`.
        /// Default `"spot"`.
        /// </summary>
        [Input("lifeCycle")]
        public Input<string>? LifeCycle { get; set; }

        [Input("loadBalancers")]
        private InputList<Inputs.ManagedInstanceLoadBalancerGetArgs>? _loadBalancers;
        public InputList<Inputs.ManagedInstanceLoadBalancerGetArgs> LoadBalancers
        {
            get => _loadBalancers ?? (_loadBalancers = new InputList<Inputs.ManagedInstanceLoadBalancerGetArgs>());
            set => _loadBalancers = value;
        }

        /// <summary>
        /// The ManagedInstance name.
        /// </summary>
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

        /// <summary>
        /// When performAt is 'timeWindow': must specify a list of 'timeWindows' with at least one time window Each string is in the format of - ddd:hh:mm-ddd:hh:mm ddd = day of week = Sun | Mon | Tue | Wed | Thu | Fri | Sat hh = hour 24 = 0 -23 mm = minute = 0 - 59.
        /// </summary>
        public InputList<string> OptimizationWindows
        {
            get => _optimizationWindows ?? (_optimizationWindows = new InputList<string>());
            set => _optimizationWindows = value;
        }

        /// <summary>
        /// Select a prediction strategy. Valid values: `"balanced"`, `"costOriented"`, `"availabilityOriented"`, `"cheapest"`.
        /// Default: `"availabilityOriented"`.
        /// </summary>
        [Input("orientation")]
        public Input<string>? Orientation { get; set; }

        /// <summary>
        /// Should the instance maintain its Data volumes. 
        /// </summary>
        [Input("persistBlockDevices")]
        public Input<bool>? PersistBlockDevices { get; set; }

        /// <summary>
        /// Should the instance maintain its private IP.  
        /// </summary>
        [Input("persistPrivateIp")]
        public Input<bool>? PersistPrivateIp { get; set; }

        /// <summary>
        /// Should the instance maintain its root device volumes.
        /// </summary>
        [Input("persistRootDevice")]
        public Input<bool>? PersistRootDevice { get; set; }

        /// <summary>
        /// Valid values: "default", "dedicated"
        /// Default: default
        /// </summary>
        [Input("placementTenancy")]
        public Input<string>? PlacementTenancy { get; set; }

        /// <summary>
        /// Preferred instance types for the instance. We will automatically select optional similar instance types to ensure optimized cost efficiency
        /// </summary>
        [Input("preferredType")]
        public Input<string>? PreferredType { get; set; }

        /// <summary>
        /// Private IP Allocation Id to associate to the instance. 
        /// </summary>
        [Input("privateIp")]
        public Input<string>? PrivateIp { get; set; }

        /// <summary>
        /// Operation system type. Valid values: `"Linux/UNIX"`, `"SUSE Linux"`, `"Windows"`, `"Red Hat Enterprise Linux"`, `"Linux/UNIX (Amazon VPC)"`, `"SUSE Linux (Amazon VPC)"`, `"Windows (Amazon VPC)"`,  `"Red Hat Enterprise Linux (Amazon VPC)"`.    
        /// </summary>
        [Input("product")]
        public Input<string>? Product { get; set; }

        /// <summary>
        /// The AWS region your group will be created in.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

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

        /// <summary>
        /// One or more security group IDs.
        /// </summary>
        public InputList<string> SecurityGroupIds
        {
            get => _securityGroupIds ?? (_securityGroupIds = new InputList<string>());
            set => _securityGroupIds = value;
        }

        /// <summary>
        /// The Base64-encoded shutdown script to execute prior to instance termination.
        /// </summary>
        [Input("shutdownScript")]
        public Input<string>? ShutdownScript { get; set; }

        [Input("subnetIds")]
        private InputList<string>? _subnetIds;

        /// <summary>
        /// A comma-separated list of subnet identifiers for your instance.
        /// </summary>
        public InputList<string> SubnetIds
        {
            get => _subnetIds ?? (_subnetIds = new InputList<string>());
            set => _subnetIds = value;
        }

        [Input("tags")]
        private InputList<Inputs.ManagedInstanceTagGetArgs>? _tags;

        /// <summary>
        /// Set tags for the instance. Items should be unique.
        /// </summary>
        public InputList<Inputs.ManagedInstanceTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.ManagedInstanceTagGetArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// The amount of time, in seconds, an existing instance should remain active after becoming unhealthy. After the set time out the instance will be replaced, default `“120"`.
        /// </summary>
        [Input("unhealthyDuration")]
        public Input<int>? UnhealthyDuration { get; set; }

        /// <summary>
        /// The Base64-encoded MIME user data to make available to the instances.
        /// </summary>
        [Input("userData")]
        public Input<string>? UserData { get; set; }

        /// <summary>
        /// In case of any available Reserved Instances, Managed Instance will utilize them before purchasing Spot instances.
        /// Default: `"false"`.
        /// </summary>
        [Input("utilizeReservedInstances")]
        public Input<bool>? UtilizeReservedInstances { get; set; }

        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        public ManagedInstanceState()
        {
        }
    }
}
