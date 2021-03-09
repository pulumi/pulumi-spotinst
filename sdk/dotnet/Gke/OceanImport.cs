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
    /// Manages a Spotinst Ocean GKE resource.
    /// 
    /// ## Example Usage
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
    /// ```csharp
    /// using Pulumi;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         this.OceanId = spotinst_ocean_gke_import.Example.Id;
    ///     }
    /// 
    ///     [Output("oceanId")]
    ///     public Output&lt;string&gt; OceanId { get; set; }
    /// }
    /// ```
    /// </summary>
    [SpotInstResourceType("spotinst:gke/oceanImport:OceanImport")]
    public partial class OceanImport : Pulumi.CustomResource
    {
        /// <summary>
        /// The Ocean Kubernetes Autoscaler object.
        /// </summary>
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

        [Output("controllerClusterId")]
        public Output<string> ControllerClusterId { get; private set; } = null!;

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

        /// <summary>
        /// Set scheduling object.
        /// </summary>
        [Output("scheduledTasks")]
        public Output<ImmutableArray<Outputs.OceanImportScheduledTask>> ScheduledTasks { get; private set; } = null!;

        /// <summary>
        /// Instance types allowed in the Ocean cluster.
        /// </summary>
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
        /// <summary>
        /// The Ocean Kubernetes Autoscaler object.
        /// </summary>
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

        [Input("controllerClusterId")]
        public Input<string>? ControllerClusterId { get; set; }

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

        /// <summary>
        /// Set scheduling object.
        /// </summary>
        public InputList<Inputs.OceanImportScheduledTaskArgs> ScheduledTasks
        {
            get => _scheduledTasks ?? (_scheduledTasks = new InputList<Inputs.OceanImportScheduledTaskArgs>());
            set => _scheduledTasks = value;
        }

        [Input("whitelists")]
        private InputList<string>? _whitelists;

        /// <summary>
        /// Instance types allowed in the Ocean cluster.
        /// </summary>
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
        /// <summary>
        /// The Ocean Kubernetes Autoscaler object.
        /// </summary>
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

        [Input("controllerClusterId")]
        public Input<string>? ControllerClusterId { get; set; }

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

        /// <summary>
        /// Set scheduling object.
        /// </summary>
        public InputList<Inputs.OceanImportScheduledTaskGetArgs> ScheduledTasks
        {
            get => _scheduledTasks ?? (_scheduledTasks = new InputList<Inputs.OceanImportScheduledTaskGetArgs>());
            set => _scheduledTasks = value;
        }

        [Input("whitelists")]
        private InputList<string>? _whitelists;

        /// <summary>
        /// Instance types allowed in the Ocean cluster.
        /// </summary>
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
