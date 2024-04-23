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
    /// Provides a Spotinst Elastigroup GKE resource. Please see [Importing a GKE cluster](https://api.spotinst.com/elastigroup-for-google-cloud/tutorials/import-a-gke-cluster-as-an-elastigroup/) for detailed information.
    /// 
    /// ## Example Usage
    /// 
    /// A spotinst.gke.Elastigroup supports all of the fields defined in spotinst_elastigroup_gcp.
    /// 
    /// There are two main differences:
    /// 
    /// * you must include `cluster_zone_name` and `cluster_id`
    /// * a handful of parameters are created remotely and will not appear in the diff. A complete list can be found below.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using SpotInst = Pulumi.SpotInst;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example_gke_elastigroup = new SpotInst.Gke.Elastigroup("example-gke-elastigroup", new()
    ///     {
    ///         Name = "example-gke",
    ///         ClusterZoneName = "us-central1-a",
    ///         NodeImage = "COS",
    ///         MaxSize = 5,
    ///         MinSize = 1,
    ///         DesiredCapacity = 3,
    ///         InstanceTypesOndemand = "n1-standard-1",
    ///         InstanceTypesPreemptibles = new[]
    ///         {
    ///             "n1-standard-1",
    ///             "n1-standard-2",
    ///         },
    ///         PreemptiblePercentage = 100,
    ///         IntegrationGke = new SpotInst.Gke.Inputs.ElastigroupIntegrationGkeArgs
    ///         {
    ///             Location = "us-central1-a",
    ///             ClusterId = "example-cluster-id",
    ///             AutoscaleIsEnabled = true,
    ///             AutoscaleIsAutoConfig = false,
    ///             AutoscaleCooldown = 300,
    ///             AutoscaleHeadroom = new SpotInst.Gke.Inputs.ElastigroupIntegrationGkeAutoscaleHeadroomArgs
    ///             {
    ///                 CpuPerUnit = 1024,
    ///                 MemoryPerUnit = 512,
    ///                 NumOfUnits = 2,
    ///             },
    ///             AutoscaleDown = new SpotInst.Gke.Inputs.ElastigroupIntegrationGkeAutoscaleDownArgs
    ///             {
    ///                 EvaluationPeriods = 300,
    ///             },
    ///             AutoscaleLabels = new[]
    ///             {
    ///                 new SpotInst.Gke.Inputs.ElastigroupIntegrationGkeAutoscaleLabelArgs
    ///                 {
    ///                     Key = "label_key",
    ///                     Value = "label_value",
    ///                 },
    ///             },
    ///         },
    ///         BackendServices = new[]
    ///         {
    ///             new SpotInst.Gke.Inputs.ElastigroupBackendServiceArgs
    ///             {
    ///                 ServiceName = "backend-service",
    ///                 LocationType = "global",
    ///                 NamedPorts = new[]
    ///                 {
    ///                     new SpotInst.Gke.Inputs.ElastigroupBackendServiceNamedPortArgs
    ///                     {
    ///                         Name = "http",
    ///                         Ports = new[]
    ///                         {
    ///                             "80",
    ///                             "8080",
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [SpotInstResourceType("spotinst:gke/elastigroup:Elastigroup")]
    public partial class Elastigroup : global::Pulumi.CustomResource
    {
        [Output("backendServices")]
        public Output<ImmutableArray<Outputs.ElastigroupBackendService>> BackendServices { get; private set; } = null!;

        [Output("clusterId")]
        public Output<string?> ClusterId { get; private set; } = null!;

        [Output("clusterZoneName")]
        public Output<string> ClusterZoneName { get; private set; } = null!;

        [Output("desiredCapacity")]
        public Output<int> DesiredCapacity { get; private set; } = null!;

        [Output("disks")]
        public Output<ImmutableArray<Outputs.ElastigroupDisk>> Disks { get; private set; } = null!;

        [Output("drainingTimeout")]
        public Output<int?> DrainingTimeout { get; private set; } = null!;

        [Output("fallbackToOndemand")]
        public Output<bool?> FallbackToOndemand { get; private set; } = null!;

        [Output("gpu")]
        public Output<ImmutableArray<Outputs.ElastigroupGpu>> Gpu { get; private set; } = null!;

        [Output("instanceNamePrefix")]
        public Output<string?> InstanceNamePrefix { get; private set; } = null!;

        [Output("instanceTypesCustoms")]
        public Output<ImmutableArray<Outputs.ElastigroupInstanceTypesCustom>> InstanceTypesCustoms { get; private set; } = null!;

        [Output("instanceTypesOndemand")]
        public Output<string?> InstanceTypesOndemand { get; private set; } = null!;

        [Output("instanceTypesPreemptibles")]
        public Output<ImmutableArray<string>> InstanceTypesPreemptibles { get; private set; } = null!;

        [Output("integrationDockerSwarm")]
        public Output<Outputs.ElastigroupIntegrationDockerSwarm?> IntegrationDockerSwarm { get; private set; } = null!;

        [Output("integrationGke")]
        public Output<Outputs.ElastigroupIntegrationGke?> IntegrationGke { get; private set; } = null!;

        [Output("ipForwarding")]
        public Output<bool?> IpForwarding { get; private set; } = null!;

        [Output("labels")]
        public Output<ImmutableArray<Outputs.ElastigroupLabel>> Labels { get; private set; } = null!;

        [Output("maxSize")]
        public Output<int> MaxSize { get; private set; } = null!;

        [Output("metadatas")]
        public Output<ImmutableArray<Outputs.ElastigroupMetadata>> Metadatas { get; private set; } = null!;

        [Output("minSize")]
        public Output<int> MinSize { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("networkInterfaces")]
        public Output<ImmutableArray<Outputs.ElastigroupNetworkInterface>> NetworkInterfaces { get; private set; } = null!;

        [Output("nodeImage")]
        public Output<string?> NodeImage { get; private set; } = null!;

        [Output("ondemandCount")]
        public Output<int?> OndemandCount { get; private set; } = null!;

        [Output("preemptiblePercentage")]
        public Output<int?> PreemptiblePercentage { get; private set; } = null!;

        [Output("provisioningModel")]
        public Output<string?> ProvisioningModel { get; private set; } = null!;

        [Output("scalingDownPolicies")]
        public Output<ImmutableArray<Outputs.ElastigroupScalingDownPolicy>> ScalingDownPolicies { get; private set; } = null!;

        [Output("scalingUpPolicies")]
        public Output<ImmutableArray<Outputs.ElastigroupScalingUpPolicy>> ScalingUpPolicies { get; private set; } = null!;

        [Output("serviceAccount")]
        public Output<string?> ServiceAccount { get; private set; } = null!;

        [Output("shutdownScript")]
        public Output<string?> ShutdownScript { get; private set; } = null!;

        [Output("startupScript")]
        public Output<string?> StartupScript { get; private set; } = null!;

        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a Elastigroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Elastigroup(string name, ElastigroupArgs args, CustomResourceOptions? options = null)
            : base("spotinst:gke/elastigroup:Elastigroup", name, args ?? new ElastigroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Elastigroup(string name, Input<string> id, ElastigroupState? state = null, CustomResourceOptions? options = null)
            : base("spotinst:gke/elastigroup:Elastigroup", name, state, MakeResourceOptions(options, id))
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

    public sealed class ElastigroupArgs : global::Pulumi.ResourceArgs
    {
        [Input("backendServices")]
        private InputList<Inputs.ElastigroupBackendServiceArgs>? _backendServices;
        public InputList<Inputs.ElastigroupBackendServiceArgs> BackendServices
        {
            get => _backendServices ?? (_backendServices = new InputList<Inputs.ElastigroupBackendServiceArgs>());
            set => _backendServices = value;
        }

        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        [Input("clusterZoneName", required: true)]
        public Input<string> ClusterZoneName { get; set; } = null!;

        [Input("desiredCapacity", required: true)]
        public Input<int> DesiredCapacity { get; set; } = null!;

        [Input("disks")]
        private InputList<Inputs.ElastigroupDiskArgs>? _disks;
        public InputList<Inputs.ElastigroupDiskArgs> Disks
        {
            get => _disks ?? (_disks = new InputList<Inputs.ElastigroupDiskArgs>());
            set => _disks = value;
        }

        [Input("drainingTimeout")]
        public Input<int>? DrainingTimeout { get; set; }

        [Input("fallbackToOndemand")]
        public Input<bool>? FallbackToOndemand { get; set; }

        [Input("gpu")]
        private InputList<Inputs.ElastigroupGpuArgs>? _gpu;
        public InputList<Inputs.ElastigroupGpuArgs> Gpu
        {
            get => _gpu ?? (_gpu = new InputList<Inputs.ElastigroupGpuArgs>());
            set => _gpu = value;
        }

        [Input("instanceNamePrefix")]
        public Input<string>? InstanceNamePrefix { get; set; }

        [Input("instanceTypesCustoms")]
        private InputList<Inputs.ElastigroupInstanceTypesCustomArgs>? _instanceTypesCustoms;
        public InputList<Inputs.ElastigroupInstanceTypesCustomArgs> InstanceTypesCustoms
        {
            get => _instanceTypesCustoms ?? (_instanceTypesCustoms = new InputList<Inputs.ElastigroupInstanceTypesCustomArgs>());
            set => _instanceTypesCustoms = value;
        }

        [Input("instanceTypesOndemand")]
        public Input<string>? InstanceTypesOndemand { get; set; }

        [Input("instanceTypesPreemptibles")]
        private InputList<string>? _instanceTypesPreemptibles;
        public InputList<string> InstanceTypesPreemptibles
        {
            get => _instanceTypesPreemptibles ?? (_instanceTypesPreemptibles = new InputList<string>());
            set => _instanceTypesPreemptibles = value;
        }

        [Input("integrationDockerSwarm")]
        public Input<Inputs.ElastigroupIntegrationDockerSwarmArgs>? IntegrationDockerSwarm { get; set; }

        [Input("integrationGke")]
        public Input<Inputs.ElastigroupIntegrationGkeArgs>? IntegrationGke { get; set; }

        [Input("ipForwarding")]
        public Input<bool>? IpForwarding { get; set; }

        [Input("labels")]
        private InputList<Inputs.ElastigroupLabelArgs>? _labels;
        public InputList<Inputs.ElastigroupLabelArgs> Labels
        {
            get => _labels ?? (_labels = new InputList<Inputs.ElastigroupLabelArgs>());
            set => _labels = value;
        }

        [Input("maxSize")]
        public Input<int>? MaxSize { get; set; }

        [Input("metadatas")]
        private InputList<Inputs.ElastigroupMetadataArgs>? _metadatas;
        public InputList<Inputs.ElastigroupMetadataArgs> Metadatas
        {
            get => _metadatas ?? (_metadatas = new InputList<Inputs.ElastigroupMetadataArgs>());
            set => _metadatas = value;
        }

        [Input("minSize")]
        public Input<int>? MinSize { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("networkInterfaces")]
        private InputList<Inputs.ElastigroupNetworkInterfaceArgs>? _networkInterfaces;
        public InputList<Inputs.ElastigroupNetworkInterfaceArgs> NetworkInterfaces
        {
            get => _networkInterfaces ?? (_networkInterfaces = new InputList<Inputs.ElastigroupNetworkInterfaceArgs>());
            set => _networkInterfaces = value;
        }

        [Input("nodeImage")]
        public Input<string>? NodeImage { get; set; }

        [Input("ondemandCount")]
        public Input<int>? OndemandCount { get; set; }

        [Input("preemptiblePercentage")]
        public Input<int>? PreemptiblePercentage { get; set; }

        [Input("provisioningModel")]
        public Input<string>? ProvisioningModel { get; set; }

        [Input("scalingDownPolicies")]
        private InputList<Inputs.ElastigroupScalingDownPolicyArgs>? _scalingDownPolicies;
        public InputList<Inputs.ElastigroupScalingDownPolicyArgs> ScalingDownPolicies
        {
            get => _scalingDownPolicies ?? (_scalingDownPolicies = new InputList<Inputs.ElastigroupScalingDownPolicyArgs>());
            set => _scalingDownPolicies = value;
        }

        [Input("scalingUpPolicies")]
        private InputList<Inputs.ElastigroupScalingUpPolicyArgs>? _scalingUpPolicies;
        public InputList<Inputs.ElastigroupScalingUpPolicyArgs> ScalingUpPolicies
        {
            get => _scalingUpPolicies ?? (_scalingUpPolicies = new InputList<Inputs.ElastigroupScalingUpPolicyArgs>());
            set => _scalingUpPolicies = value;
        }

        [Input("serviceAccount")]
        public Input<string>? ServiceAccount { get; set; }

        [Input("shutdownScript")]
        public Input<string>? ShutdownScript { get; set; }

        [Input("startupScript")]
        public Input<string>? StartupScript { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public ElastigroupArgs()
        {
        }
        public static new ElastigroupArgs Empty => new ElastigroupArgs();
    }

    public sealed class ElastigroupState : global::Pulumi.ResourceArgs
    {
        [Input("backendServices")]
        private InputList<Inputs.ElastigroupBackendServiceGetArgs>? _backendServices;
        public InputList<Inputs.ElastigroupBackendServiceGetArgs> BackendServices
        {
            get => _backendServices ?? (_backendServices = new InputList<Inputs.ElastigroupBackendServiceGetArgs>());
            set => _backendServices = value;
        }

        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        [Input("clusterZoneName")]
        public Input<string>? ClusterZoneName { get; set; }

        [Input("desiredCapacity")]
        public Input<int>? DesiredCapacity { get; set; }

        [Input("disks")]
        private InputList<Inputs.ElastigroupDiskGetArgs>? _disks;
        public InputList<Inputs.ElastigroupDiskGetArgs> Disks
        {
            get => _disks ?? (_disks = new InputList<Inputs.ElastigroupDiskGetArgs>());
            set => _disks = value;
        }

        [Input("drainingTimeout")]
        public Input<int>? DrainingTimeout { get; set; }

        [Input("fallbackToOndemand")]
        public Input<bool>? FallbackToOndemand { get; set; }

        [Input("gpu")]
        private InputList<Inputs.ElastigroupGpuGetArgs>? _gpu;
        public InputList<Inputs.ElastigroupGpuGetArgs> Gpu
        {
            get => _gpu ?? (_gpu = new InputList<Inputs.ElastigroupGpuGetArgs>());
            set => _gpu = value;
        }

        [Input("instanceNamePrefix")]
        public Input<string>? InstanceNamePrefix { get; set; }

        [Input("instanceTypesCustoms")]
        private InputList<Inputs.ElastigroupInstanceTypesCustomGetArgs>? _instanceTypesCustoms;
        public InputList<Inputs.ElastigroupInstanceTypesCustomGetArgs> InstanceTypesCustoms
        {
            get => _instanceTypesCustoms ?? (_instanceTypesCustoms = new InputList<Inputs.ElastigroupInstanceTypesCustomGetArgs>());
            set => _instanceTypesCustoms = value;
        }

        [Input("instanceTypesOndemand")]
        public Input<string>? InstanceTypesOndemand { get; set; }

        [Input("instanceTypesPreemptibles")]
        private InputList<string>? _instanceTypesPreemptibles;
        public InputList<string> InstanceTypesPreemptibles
        {
            get => _instanceTypesPreemptibles ?? (_instanceTypesPreemptibles = new InputList<string>());
            set => _instanceTypesPreemptibles = value;
        }

        [Input("integrationDockerSwarm")]
        public Input<Inputs.ElastigroupIntegrationDockerSwarmGetArgs>? IntegrationDockerSwarm { get; set; }

        [Input("integrationGke")]
        public Input<Inputs.ElastigroupIntegrationGkeGetArgs>? IntegrationGke { get; set; }

        [Input("ipForwarding")]
        public Input<bool>? IpForwarding { get; set; }

        [Input("labels")]
        private InputList<Inputs.ElastigroupLabelGetArgs>? _labels;
        public InputList<Inputs.ElastigroupLabelGetArgs> Labels
        {
            get => _labels ?? (_labels = new InputList<Inputs.ElastigroupLabelGetArgs>());
            set => _labels = value;
        }

        [Input("maxSize")]
        public Input<int>? MaxSize { get; set; }

        [Input("metadatas")]
        private InputList<Inputs.ElastigroupMetadataGetArgs>? _metadatas;
        public InputList<Inputs.ElastigroupMetadataGetArgs> Metadatas
        {
            get => _metadatas ?? (_metadatas = new InputList<Inputs.ElastigroupMetadataGetArgs>());
            set => _metadatas = value;
        }

        [Input("minSize")]
        public Input<int>? MinSize { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("networkInterfaces")]
        private InputList<Inputs.ElastigroupNetworkInterfaceGetArgs>? _networkInterfaces;
        public InputList<Inputs.ElastigroupNetworkInterfaceGetArgs> NetworkInterfaces
        {
            get => _networkInterfaces ?? (_networkInterfaces = new InputList<Inputs.ElastigroupNetworkInterfaceGetArgs>());
            set => _networkInterfaces = value;
        }

        [Input("nodeImage")]
        public Input<string>? NodeImage { get; set; }

        [Input("ondemandCount")]
        public Input<int>? OndemandCount { get; set; }

        [Input("preemptiblePercentage")]
        public Input<int>? PreemptiblePercentage { get; set; }

        [Input("provisioningModel")]
        public Input<string>? ProvisioningModel { get; set; }

        [Input("scalingDownPolicies")]
        private InputList<Inputs.ElastigroupScalingDownPolicyGetArgs>? _scalingDownPolicies;
        public InputList<Inputs.ElastigroupScalingDownPolicyGetArgs> ScalingDownPolicies
        {
            get => _scalingDownPolicies ?? (_scalingDownPolicies = new InputList<Inputs.ElastigroupScalingDownPolicyGetArgs>());
            set => _scalingDownPolicies = value;
        }

        [Input("scalingUpPolicies")]
        private InputList<Inputs.ElastigroupScalingUpPolicyGetArgs>? _scalingUpPolicies;
        public InputList<Inputs.ElastigroupScalingUpPolicyGetArgs> ScalingUpPolicies
        {
            get => _scalingUpPolicies ?? (_scalingUpPolicies = new InputList<Inputs.ElastigroupScalingUpPolicyGetArgs>());
            set => _scalingUpPolicies = value;
        }

        [Input("serviceAccount")]
        public Input<string>? ServiceAccount { get; set; }

        [Input("shutdownScript")]
        public Input<string>? ShutdownScript { get; set; }

        [Input("startupScript")]
        public Input<string>? StartupScript { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public ElastigroupState()
        {
        }
        public static new ElastigroupState Empty => new ElastigroupState();
    }
}
