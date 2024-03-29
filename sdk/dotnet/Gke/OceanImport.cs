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
    /// ## Prerequisites
    /// 
    /// Installation of the Ocean controller is required by this resource. You can accomplish this by using the spotinst/ocean-controller module as follows:
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// &gt; You must configure the same `cluster_identifier` both for the Ocean controller and for the `spotinst.gke.OceanImport` resource.
    /// 
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using SpotInst = Pulumi.SpotInst;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new SpotInst.Gke.OceanImport("example", new()
    ///     {
    ///         BackendServices = new[]
    ///         {
    ///             new SpotInst.Gke.Inputs.OceanImportBackendServiceArgs
    ///             {
    ///                 LocationType = "regional",
    ///                 NamedPorts = new[]
    ///                 {
    ///                     new SpotInst.Gke.Inputs.OceanImportBackendServiceNamedPortArgs
    ///                     {
    ///                         Name = "http",
    ///                         Ports = new[]
    ///                         {
    ///                             "80",
    ///                             "8080",
    ///                         },
    ///                     },
    ///                 },
    ///                 Scheme = "INTERNAL",
    ///                 ServiceName = "example-backend-service",
    ///             },
    ///         },
    ///         ClusterName = "example-cluster-name",
    ///         ControllerClusterId = "example-controller-123124",
    ///         DesiredCapacity = 0,
    ///         Location = "us-central1-a",
    ///         MaxSize = 2,
    ///         MinSize = 0,
    ///         RootVolumeType = "pd-ssd",
    ///         ShieldedInstanceConfig = new SpotInst.Gke.Inputs.OceanImportShieldedInstanceConfigArgs
    ///         {
    ///             EnableIntegrityMonitoring = true,
    ///             EnableSecureBoot = true,
    ///         },
    ///         UseAsTemplateOnly = false,
    ///         Whitelists = new[]
    ///         {
    ///             "n1-standard-1",
    ///             "n1-standard-2",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["oceanId"] = spotinst_ocean_gke_import.Example.Id,
    ///     };
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Strategy
    /// 
    /// * `strategy` - (Optional) Strategy object.
    ///     * `draining_timeout` - (Optional) The draining timeout (in seconds) before terminating the instance. If no draining timeout is defined, the default draining timeout will be used.
    ///     * `provisioning_model` - (Optional) Define the provisioning model of the launched instances. Valid values: `SPOT`, `PREEMPTIBLE`.
    ///     * `preemptible_percentage`- (Optional) Defines the desired preemptible percentage for the cluster.
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// &lt;a id="update-policy"&gt;&lt;/a&gt;
    /// ## Update Policy
    /// 
    /// * `update_policy` - (Optional)
    ///     * `should_roll` - (Required) Enables the roll.
    ///     * `conditioned_roll` - (Optional, Default: false) Spot will perform a cluster Roll in accordance with a relevant modification of the cluster’s settings. When set to true , only specific changes in the cluster’s configuration will trigger a cluster roll (such as AMI, Key Pair, user data, instance types, load balancers, etc).
    ///   
    ///     * `roll_config` - (Required) Holds the roll configuration.
    ///         * `batch_size_percentage` - (Required) Sets the percentage of the instances to deploy in each batch.
    ///         * `launch_spec_ids` - (Optional) List of Virtual Node Group identifiers to be rolled.
    ///         * `batch_min_healthy_percentage` - (Optional) Default: 50. Indicates the threshold of minimum healthy instances in single batch. If the amount of healthy instances in single batch is under the threshold, the cluster roll will fail. If exists, the parameter value will be in range of 1-100. In case of null as value, the default value in the backend will be 50%! (MISSING)Value of param should represent the number in percentage (%!)(MISSING) of the batch.
    ///         * `respect_pdb` - (Optional) Default: False. During the roll, if the parameter is set to True we honor PDB during the instance replacement.
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// </summary>
    [SpotInstResourceType("spotinst:gke/oceanImport:OceanImport")]
    public partial class OceanImport : global::Pulumi.CustomResource
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

        /// <summary>
        /// Instance types to avoid launching in the Ocean cluster. Cannot be configured if whitelist list is configured.
        /// </summary>
        [Output("blacklists")]
        public Output<ImmutableArray<string>> Blacklists { get; private set; } = null!;

        [Output("clusterControllerId")]
        public Output<string> ClusterControllerId { get; private set; } = null!;

        /// <summary>
        /// The GKE cluster name.
        /// </summary>
        [Output("clusterName")]
        public Output<string> ClusterName { get; private set; } = null!;

        /// <summary>
        /// A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
        /// </summary>
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
        /// The root volume disk type.
        /// </summary>
        [Output("rootVolumeType")]
        public Output<string?> RootVolumeType { get; private set; } = null!;

        /// <summary>
        /// Set scheduling object.
        /// </summary>
        [Output("scheduledTasks")]
        public Output<ImmutableArray<Outputs.OceanImportScheduledTask>> ScheduledTasks { get; private set; } = null!;

        /// <summary>
        /// The Ocean shielded instance configuration object.
        /// </summary>
        [Output("shieldedInstanceConfig")]
        public Output<Outputs.OceanImportShieldedInstanceConfig> ShieldedInstanceConfig { get; private set; } = null!;

        [Output("strategies")]
        public Output<ImmutableArray<Outputs.OceanImportStrategy>> Strategies { get; private set; } = null!;

        [Output("updatePolicy")]
        public Output<Outputs.OceanImportUpdatePolicy?> UpdatePolicy { get; private set; } = null!;

        /// <summary>
        /// launch specification defined on the Ocean object will function only as a template for virtual node groups.
        /// </summary>
        [Output("useAsTemplateOnly")]
        public Output<bool?> UseAsTemplateOnly { get; private set; } = null!;

        /// <summary>
        /// Instance types allowed in the Ocean cluster. Cannot be configured if blacklist list is configured.
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

    public sealed class OceanImportArgs : global::Pulumi.ResourceArgs
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

        [Input("blacklists")]
        private InputList<string>? _blacklists;

        /// <summary>
        /// Instance types to avoid launching in the Ocean cluster. Cannot be configured if whitelist list is configured.
        /// </summary>
        public InputList<string> Blacklists
        {
            get => _blacklists ?? (_blacklists = new InputList<string>());
            set => _blacklists = value;
        }

        /// <summary>
        /// The GKE cluster name.
        /// </summary>
        [Input("clusterName", required: true)]
        public Input<string> ClusterName { get; set; } = null!;

        /// <summary>
        /// A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
        /// </summary>
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

        /// <summary>
        /// The root volume disk type.
        /// </summary>
        [Input("rootVolumeType")]
        public Input<string>? RootVolumeType { get; set; }

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

        /// <summary>
        /// The Ocean shielded instance configuration object.
        /// </summary>
        [Input("shieldedInstanceConfig")]
        public Input<Inputs.OceanImportShieldedInstanceConfigArgs>? ShieldedInstanceConfig { get; set; }

        [Input("strategies")]
        private InputList<Inputs.OceanImportStrategyArgs>? _strategies;
        public InputList<Inputs.OceanImportStrategyArgs> Strategies
        {
            get => _strategies ?? (_strategies = new InputList<Inputs.OceanImportStrategyArgs>());
            set => _strategies = value;
        }

        [Input("updatePolicy")]
        public Input<Inputs.OceanImportUpdatePolicyArgs>? UpdatePolicy { get; set; }

        /// <summary>
        /// launch specification defined on the Ocean object will function only as a template for virtual node groups.
        /// </summary>
        [Input("useAsTemplateOnly")]
        public Input<bool>? UseAsTemplateOnly { get; set; }

        [Input("whitelists")]
        private InputList<string>? _whitelists;

        /// <summary>
        /// Instance types allowed in the Ocean cluster. Cannot be configured if blacklist list is configured.
        /// </summary>
        public InputList<string> Whitelists
        {
            get => _whitelists ?? (_whitelists = new InputList<string>());
            set => _whitelists = value;
        }

        public OceanImportArgs()
        {
        }
        public static new OceanImportArgs Empty => new OceanImportArgs();
    }

    public sealed class OceanImportState : global::Pulumi.ResourceArgs
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

        [Input("blacklists")]
        private InputList<string>? _blacklists;

        /// <summary>
        /// Instance types to avoid launching in the Ocean cluster. Cannot be configured if whitelist list is configured.
        /// </summary>
        public InputList<string> Blacklists
        {
            get => _blacklists ?? (_blacklists = new InputList<string>());
            set => _blacklists = value;
        }

        [Input("clusterControllerId")]
        public Input<string>? ClusterControllerId { get; set; }

        /// <summary>
        /// The GKE cluster name.
        /// </summary>
        [Input("clusterName")]
        public Input<string>? ClusterName { get; set; }

        /// <summary>
        /// A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
        /// </summary>
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

        /// <summary>
        /// The root volume disk type.
        /// </summary>
        [Input("rootVolumeType")]
        public Input<string>? RootVolumeType { get; set; }

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

        /// <summary>
        /// The Ocean shielded instance configuration object.
        /// </summary>
        [Input("shieldedInstanceConfig")]
        public Input<Inputs.OceanImportShieldedInstanceConfigGetArgs>? ShieldedInstanceConfig { get; set; }

        [Input("strategies")]
        private InputList<Inputs.OceanImportStrategyGetArgs>? _strategies;
        public InputList<Inputs.OceanImportStrategyGetArgs> Strategies
        {
            get => _strategies ?? (_strategies = new InputList<Inputs.OceanImportStrategyGetArgs>());
            set => _strategies = value;
        }

        [Input("updatePolicy")]
        public Input<Inputs.OceanImportUpdatePolicyGetArgs>? UpdatePolicy { get; set; }

        /// <summary>
        /// launch specification defined on the Ocean object will function only as a template for virtual node groups.
        /// </summary>
        [Input("useAsTemplateOnly")]
        public Input<bool>? UseAsTemplateOnly { get; set; }

        [Input("whitelists")]
        private InputList<string>? _whitelists;

        /// <summary>
        /// Instance types allowed in the Ocean cluster. Cannot be configured if blacklist list is configured.
        /// </summary>
        public InputList<string> Whitelists
        {
            get => _whitelists ?? (_whitelists = new InputList<string>());
            set => _whitelists = value;
        }

        public OceanImportState()
        {
        }
        public static new OceanImportState Empty => new OceanImportState();
    }
}
