// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke
{
    /// <summary>
    /// Provides a Spotinst Ocean GKE import resource.
    /// 
    /// ## Example Usage
    /// 
    /// 
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using SpotInst = Pulumi.SpotInst;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var example = new SpotInst.Gke.OceanImport("example", new SpotInst.Gke.OceanImportArgs
    ///         {
    ///             BackendServices = 
    ///             {
    ///                 new SpotInst.Gke.Inputs.OceanImportBackendServiceArgs
    ///                 {
    ///                     LocationType = "regional",
    ///                     NamedPorts = 
    ///                     {
    ///                         new SpotInst.Gke.Inputs.OceanImportBackendServiceNamedPortArgs
    ///                         {
    ///                             Name = "http",
    ///                             Ports = 
    ///                             {
    ///                                 "80",
    ///                                 "8080",
    ///                             },
    ///                         },
    ///                     },
    ///                     Scheme = "INTERNAL",
    ///                     ServiceName = "example-backend-service",
    ///                 },
    ///             },
    ///             ClusterName = "example-cluster-name",
    ///             DesiredCapacity = 0,
    ///             Location = "us-central1-a",
    ///             MaxSize = 2,
    ///             MinSize = 0,
    ///             Whitelists = 
    ///             {
    ///                 "n1-standard-1",
    ///                 "n1-standard-2",
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## scheduled task
    /// 
    /// * `scheduled_task` - (Optional) Set scheduling object.
    ///     * `shutdown_hours` - (Optional) Set shutdown hours for cluster object.
    ///         * `is_enabled` - (Optional)  Flag to enable / disable the shutdown hours.
    ///                                      Example: True
    ///         * `time_windows` - (Required) Set time windows for shutdown hours. specify a list of 'timeWindows' with at least one time window Each string is in the format of - ddd:hh:mm-ddd:hh:mm ddd = day of week = Sun | Mon | Tue | Wed | Thu | Fri | Sat hh = hour 24 = 0 -23 mm = minute = 0 - 59. Time windows should not overlap. required on cluster.scheduling.isEnabled = True. API Times are in UTC
    ///                                       Example: Fri:15:30-Wed:14:30
    ///     * `tasks` - (Optional) The scheduling tasks for the cluster.
    ///         * `is_enabled` - (Required)  Describes whether the task is enabled. When true the task should run when false it should not run. Required for cluster.scheduling.tasks object.
    ///         * `cron_expression` - (Required) A valid cron expression. For example : " * * * * * ".The cron is running in UTC time zone and is in Unix cron format Cron Expression Validator Script. Only one of ‘frequency’ or ‘cronExpression’ should be used at a time. Required for cluster.scheduling.tasks object
    ///                                          Example: 0 1 * * *
    ///         * `task_type` - (Required) Valid values: "clusterRoll". Required for cluster.scheduling.tasks object.
    ///         * `batch_size_percentage` - (Optional)  Value in % to set size of batch in roll. Valid values are 0-100
    ///                                                 Example: 20.
    ///                           
    ///              
    /// ```csharp
    /// using Pulumi;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// &lt;a id="autoscaler"&gt;&lt;/a&gt;
    /// ## Autoscaler
    /// 
    /// * `autoscaler` - (Optional) The Ocean Kubernetes Autoscaler object.
    /// * `is_enabled` - (Optional, Default: `true`) Enable the Ocean Kubernetes Autoscaler.
    /// * `is_auto_config` - (Optional, Default: `true`) Automatically configure and optimize headroom resources.
    /// * `auto_headroom_percentage` - Optionally set the auto headroom percentage, set a number between 0-200 to control the headroom % from the cluster. Relevant when isAutoConfig=true.
    /// * `cooldown` - (Optional, Default: `null`) Cooldown period between scaling actions.
    /// * `headroom` - (Optional) Spare resource capacity management enabling fast assignment of Pods without waiting for new resources to launch.
    /// * `cpu_per_unit` - (Optional) Optionally configure the number of CPUs to allocate the headroom. CPUs are denoted in millicores, where 1000 millicores = 1 vCPU.
    /// * `memory_per_unit` - (Optional) Optionally configure the amount of memory (MiB) to allocate the headroom.
    /// * `gpu_per_unit` - (Optional) How much GPU allocate for headroom unit.
    /// * `num_of_units` - (Optional) The number of units to retain as headroom, where each unit has the defined headroom CPU and memory.
    /// * `down` - (Optional) Auto Scaling scale down operations.
    /// * `evaluation_periods` - (Optional, Default: `null`) The number of evaluation periods that should accumulate before a scale down action takes place.
    /// * `max_scale_down_percentage` - (Optional) Would represent the maximum % to scale-down. Number between 1-100.
    /// * `resource_limits` - (Optional) Optionally set upper and lower bounds on the resource usage of the cluster.
    /// * `max_vcpu` - (Optional) The maximum cpu in vCpu units that can be allocated to the cluster.
    /// * `max_memory_gib` - (Optional) The maximum memory in GiB units that can be allocated to the cluster.
    /// 
    /// ```csharp
    /// using Pulumi;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class OceanImport : Pulumi.CustomResource
    {
        [Output("autoscaler")]
        public Output<Outputs.OceanImportAutoscaler> Autoscaler { get; private set; } = null!;

        /// <summary>
        /// Describes the backend service configurations.
        /// </summary>
        [Output("backendServices")]
        public Output<ImmutableArray<Outputs.OceanImportBackendService>> BackendServices { get; private set; } = null!;

        [Output("clusterControllerId")]
        public Output<string> ClusterControllerId { get; private set; } = null!;

        /// <summary>
        /// The GKE cluster name.
        /// </summary>
        [Output("clusterName")]
        public Output<string> ClusterName { get; private set; } = null!;

        /// <summary>
        /// The number of instances to launch and maintain in the cluster. 
        /// </summary>
        [Output("desiredCapacity")]
        public Output<int> DesiredCapacity { get; private set; } = null!;

        /// <summary>
        /// The zone the master cluster is located in. 
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

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

        [Output("scheduledTasks")]
        public Output<ImmutableArray<Outputs.OceanImportScheduledTask>> ScheduledTasks { get; private set; } = null!;

        [Output("whitelists")]
        public Output<ImmutableArray<string>> Whitelists { get; private set; } = null!;


        /// <summary>
        /// Create a OceanImport resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OceanImport(string name, OceanImportArgs args, CustomResourceOptions? options = null)
            : base("spotinst:gke/oceanImport:OceanImport", name, args ?? new OceanImportArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OceanImport(string name, Input<string> id, OceanImportState? state = null, CustomResourceOptions? options = null)
            : base("spotinst:gke/oceanImport:OceanImport", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing OceanImport resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OceanImport Get(string name, Input<string> id, OceanImportState? state = null, CustomResourceOptions? options = null)
        {
            return new OceanImport(name, id, state, options);
        }
    }

    public sealed class OceanImportArgs : Pulumi.ResourceArgs
    {
        [Input("autoscaler")]
        public Input<Inputs.OceanImportAutoscalerArgs>? Autoscaler { get; set; }

        [Input("backendServices")]
        private InputList<Inputs.OceanImportBackendServiceArgs>? _backendServices;

        /// <summary>
        /// Describes the backend service configurations.
        /// </summary>
        public InputList<Inputs.OceanImportBackendServiceArgs> BackendServices
        {
            get => _backendServices ?? (_backendServices = new InputList<Inputs.OceanImportBackendServiceArgs>());
            set => _backendServices = value;
        }

        /// <summary>
        /// The GKE cluster name.
        /// </summary>
        [Input("clusterName", required: true)]
        public Input<string> ClusterName { get; set; } = null!;

        /// <summary>
        /// The number of instances to launch and maintain in the cluster. 
        /// </summary>
        [Input("desiredCapacity")]
        public Input<int>? DesiredCapacity { get; set; }

        /// <summary>
        /// The zone the master cluster is located in. 
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

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

        [Input("scheduledTasks")]
        private InputList<Inputs.OceanImportScheduledTaskArgs>? _scheduledTasks;
        public InputList<Inputs.OceanImportScheduledTaskArgs> ScheduledTasks
        {
            get => _scheduledTasks ?? (_scheduledTasks = new InputList<Inputs.OceanImportScheduledTaskArgs>());
            set => _scheduledTasks = value;
        }

        [Input("whitelists")]
        private InputList<string>? _whitelists;
        public InputList<string> Whitelists
        {
            get => _whitelists ?? (_whitelists = new InputList<string>());
            set => _whitelists = value;
        }

        public OceanImportArgs()
        {
        }
    }

    public sealed class OceanImportState : Pulumi.ResourceArgs
    {
        [Input("autoscaler")]
        public Input<Inputs.OceanImportAutoscalerGetArgs>? Autoscaler { get; set; }

        [Input("backendServices")]
        private InputList<Inputs.OceanImportBackendServiceGetArgs>? _backendServices;

        /// <summary>
        /// Describes the backend service configurations.
        /// </summary>
        public InputList<Inputs.OceanImportBackendServiceGetArgs> BackendServices
        {
            get => _backendServices ?? (_backendServices = new InputList<Inputs.OceanImportBackendServiceGetArgs>());
            set => _backendServices = value;
        }

        [Input("clusterControllerId")]
        public Input<string>? ClusterControllerId { get; set; }

        /// <summary>
        /// The GKE cluster name.
        /// </summary>
        [Input("clusterName")]
        public Input<string>? ClusterName { get; set; }

        /// <summary>
        /// The number of instances to launch and maintain in the cluster. 
        /// </summary>
        [Input("desiredCapacity")]
        public Input<int>? DesiredCapacity { get; set; }

        /// <summary>
        /// The zone the master cluster is located in. 
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

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

        [Input("scheduledTasks")]
        private InputList<Inputs.OceanImportScheduledTaskGetArgs>? _scheduledTasks;
        public InputList<Inputs.OceanImportScheduledTaskGetArgs> ScheduledTasks
        {
            get => _scheduledTasks ?? (_scheduledTasks = new InputList<Inputs.OceanImportScheduledTaskGetArgs>());
            set => _scheduledTasks = value;
        }

        [Input("whitelists")]
        private InputList<string>? _whitelists;
        public InputList<string> Whitelists
        {
            get => _whitelists ?? (_whitelists = new InputList<string>());
            set => _whitelists = value;
        }

        public OceanImportState()
        {
        }
    }
}
