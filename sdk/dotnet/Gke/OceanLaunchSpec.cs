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
    /// Manages a custom Spotinst Ocean GKE Launch Spec resource.
    /// 
    /// &gt; This resource can be imported from GKE node pool or not. If you want to import the node pool and create the VNG from it, please provide `node_pool_name`.
    /// </summary>
    [SpotInstResourceType("spotinst:gke/oceanLaunchSpec:OceanLaunchSpec")]
    public partial class OceanLaunchSpec : Pulumi.CustomResource
    {
        /// <summary>
        /// Set custom headroom per launch spec. provide list of headrooms object.
        /// </summary>
        [Output("autoscaleHeadrooms")]
        public Output<ImmutableArray<Outputs.OceanLaunchSpecAutoscaleHeadroom>> AutoscaleHeadrooms { get; private set; } = null!;

        /// <summary>
        /// List of supported machine types for the Launch Spec.
        /// </summary>
        [Output("instanceTypes")]
        public Output<ImmutableArray<string>> InstanceTypes { get; private set; } = null!;

        /// <summary>
        /// Optionally adds labels to instances launched in an Ocean cluster.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableArray<Outputs.OceanLaunchSpecLabel>> Labels { get; private set; } = null!;

        /// <summary>
        /// Cluster's metadata.
        /// </summary>
        [Output("metadatas")]
        public Output<ImmutableArray<Outputs.OceanLaunchSpecMetadata>> Metadatas { get; private set; } = null!;

        /// <summary>
        /// The launch specification name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The node pool you wish to use in your Launch Spec.
        /// </summary>
        [Output("nodePoolName")]
        public Output<string?> NodePoolName { get; private set; } = null!;

        /// <summary>
        /// The Ocean cluster ID.
        /// </summary>
        [Output("oceanId")]
        public Output<string> OceanId { get; private set; } = null!;

        /// <summary>
        /// The Ocean virtual node group resource limits object.
        /// </summary>
        [Output("resourceLimits")]
        public Output<Outputs.OceanLaunchSpecResourceLimits?> ResourceLimits { get; private set; } = null!;

        /// <summary>
        /// Boolean. When set to `true`, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
        /// </summary>
        [Output("restrictScaleDown")]
        public Output<bool> RestrictScaleDown { get; private set; } = null!;

        /// <summary>
        /// Root volume size (in GB).
        /// </summary>
        [Output("rootVolumeSize")]
        public Output<int> RootVolumeSize { get; private set; } = null!;

        /// <summary>
        /// Root volume disk type. Valid values: `"pd-standard"`, `"pd-ssd"`.
        /// </summary>
        [Output("rootVolumeType")]
        public Output<string> RootVolumeType { get; private set; } = null!;

        /// <summary>
        /// The account used by applications running on the VM to call GCP APIs.
        /// </summary>
        [Output("serviceAccount")]
        public Output<string> ServiceAccount { get; private set; } = null!;

        /// <summary>
        /// The Ocean shielded instance configuration object.
        /// </summary>
        [Output("shieldedInstanceConfig")]
        public Output<Outputs.OceanLaunchSpecShieldedInstanceConfig> ShieldedInstanceConfig { get; private set; } = null!;

        /// <summary>
        /// Image URL.
        /// </summary>
        [Output("sourceImage")]
        public Output<string> SourceImage { get; private set; } = null!;

        /// <summary>
        /// The Ocean virtual node group storage object.
        /// </summary>
        [Output("storage")]
        public Output<Outputs.OceanLaunchSpecStorage> Storage { get; private set; } = null!;

        /// <summary>
        /// The Ocean Launch Spec Strategy object.
        /// </summary>
        [Output("strategies")]
        public Output<ImmutableArray<Outputs.OceanLaunchSpecStrategy>> Strategies { get; private set; } = null!;

        /// <summary>
        /// Optionally adds labels to instances launched in an Ocean cluster.
        /// </summary>
        [Output("taints")]
        public Output<ImmutableArray<Outputs.OceanLaunchSpecTaint>> Taints { get; private set; } = null!;


        /// <summary>
        /// Create a OceanLaunchSpec resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OceanLaunchSpec(string name, OceanLaunchSpecArgs args, CustomResourceOptions? options = null)
            : base("spotinst:gke/oceanLaunchSpec:OceanLaunchSpec", name, args ?? new OceanLaunchSpecArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OceanLaunchSpec(string name, Input<string> id, OceanLaunchSpecState? state = null, CustomResourceOptions? options = null)
            : base("spotinst:gke/oceanLaunchSpec:OceanLaunchSpec", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing OceanLaunchSpec resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OceanLaunchSpec Get(string name, Input<string> id, OceanLaunchSpecState? state = null, CustomResourceOptions? options = null)
        {
            return new OceanLaunchSpec(name, id, state, options);
        }
    }

    public sealed class OceanLaunchSpecArgs : Pulumi.ResourceArgs
    {
        [Input("autoscaleHeadrooms")]
        private InputList<Inputs.OceanLaunchSpecAutoscaleHeadroomArgs>? _autoscaleHeadrooms;

        /// <summary>
        /// Set custom headroom per launch spec. provide list of headrooms object.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecAutoscaleHeadroomArgs> AutoscaleHeadrooms
        {
            get => _autoscaleHeadrooms ?? (_autoscaleHeadrooms = new InputList<Inputs.OceanLaunchSpecAutoscaleHeadroomArgs>());
            set => _autoscaleHeadrooms = value;
        }

        [Input("instanceTypes")]
        private InputList<string>? _instanceTypes;

        /// <summary>
        /// List of supported machine types for the Launch Spec.
        /// </summary>
        public InputList<string> InstanceTypes
        {
            get => _instanceTypes ?? (_instanceTypes = new InputList<string>());
            set => _instanceTypes = value;
        }

        [Input("labels")]
        private InputList<Inputs.OceanLaunchSpecLabelArgs>? _labels;

        /// <summary>
        /// Optionally adds labels to instances launched in an Ocean cluster.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecLabelArgs> Labels
        {
            get => _labels ?? (_labels = new InputList<Inputs.OceanLaunchSpecLabelArgs>());
            set => _labels = value;
        }

        [Input("metadatas")]
        private InputList<Inputs.OceanLaunchSpecMetadataArgs>? _metadatas;

        /// <summary>
        /// Cluster's metadata.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecMetadataArgs> Metadatas
        {
            get => _metadatas ?? (_metadatas = new InputList<Inputs.OceanLaunchSpecMetadataArgs>());
            set => _metadatas = value;
        }

        /// <summary>
        /// The launch specification name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The node pool you wish to use in your Launch Spec.
        /// </summary>
        [Input("nodePoolName")]
        public Input<string>? NodePoolName { get; set; }

        /// <summary>
        /// The Ocean cluster ID.
        /// </summary>
        [Input("oceanId", required: true)]
        public Input<string> OceanId { get; set; } = null!;

        /// <summary>
        /// The Ocean virtual node group resource limits object.
        /// </summary>
        [Input("resourceLimits")]
        public Input<Inputs.OceanLaunchSpecResourceLimitsArgs>? ResourceLimits { get; set; }

        /// <summary>
        /// Boolean. When set to `true`, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
        /// </summary>
        [Input("restrictScaleDown")]
        public Input<bool>? RestrictScaleDown { get; set; }

        /// <summary>
        /// Root volume size (in GB).
        /// </summary>
        [Input("rootVolumeSize")]
        public Input<int>? RootVolumeSize { get; set; }

        /// <summary>
        /// Root volume disk type. Valid values: `"pd-standard"`, `"pd-ssd"`.
        /// </summary>
        [Input("rootVolumeType")]
        public Input<string>? RootVolumeType { get; set; }

        /// <summary>
        /// The account used by applications running on the VM to call GCP APIs.
        /// </summary>
        [Input("serviceAccount")]
        public Input<string>? ServiceAccount { get; set; }

        /// <summary>
        /// The Ocean shielded instance configuration object.
        /// </summary>
        [Input("shieldedInstanceConfig")]
        public Input<Inputs.OceanLaunchSpecShieldedInstanceConfigArgs>? ShieldedInstanceConfig { get; set; }

        /// <summary>
        /// Image URL.
        /// </summary>
        [Input("sourceImage")]
        public Input<string>? SourceImage { get; set; }

        /// <summary>
        /// The Ocean virtual node group storage object.
        /// </summary>
        [Input("storage")]
        public Input<Inputs.OceanLaunchSpecStorageArgs>? Storage { get; set; }

        [Input("strategies")]
        private InputList<Inputs.OceanLaunchSpecStrategyArgs>? _strategies;

        /// <summary>
        /// The Ocean Launch Spec Strategy object.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecStrategyArgs> Strategies
        {
            get => _strategies ?? (_strategies = new InputList<Inputs.OceanLaunchSpecStrategyArgs>());
            set => _strategies = value;
        }

        [Input("taints")]
        private InputList<Inputs.OceanLaunchSpecTaintArgs>? _taints;

        /// <summary>
        /// Optionally adds labels to instances launched in an Ocean cluster.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecTaintArgs> Taints
        {
            get => _taints ?? (_taints = new InputList<Inputs.OceanLaunchSpecTaintArgs>());
            set => _taints = value;
        }

        public OceanLaunchSpecArgs()
        {
        }
    }

    public sealed class OceanLaunchSpecState : Pulumi.ResourceArgs
    {
        [Input("autoscaleHeadrooms")]
        private InputList<Inputs.OceanLaunchSpecAutoscaleHeadroomGetArgs>? _autoscaleHeadrooms;

        /// <summary>
        /// Set custom headroom per launch spec. provide list of headrooms object.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecAutoscaleHeadroomGetArgs> AutoscaleHeadrooms
        {
            get => _autoscaleHeadrooms ?? (_autoscaleHeadrooms = new InputList<Inputs.OceanLaunchSpecAutoscaleHeadroomGetArgs>());
            set => _autoscaleHeadrooms = value;
        }

        [Input("instanceTypes")]
        private InputList<string>? _instanceTypes;

        /// <summary>
        /// List of supported machine types for the Launch Spec.
        /// </summary>
        public InputList<string> InstanceTypes
        {
            get => _instanceTypes ?? (_instanceTypes = new InputList<string>());
            set => _instanceTypes = value;
        }

        [Input("labels")]
        private InputList<Inputs.OceanLaunchSpecLabelGetArgs>? _labels;

        /// <summary>
        /// Optionally adds labels to instances launched in an Ocean cluster.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecLabelGetArgs> Labels
        {
            get => _labels ?? (_labels = new InputList<Inputs.OceanLaunchSpecLabelGetArgs>());
            set => _labels = value;
        }

        [Input("metadatas")]
        private InputList<Inputs.OceanLaunchSpecMetadataGetArgs>? _metadatas;

        /// <summary>
        /// Cluster's metadata.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecMetadataGetArgs> Metadatas
        {
            get => _metadatas ?? (_metadatas = new InputList<Inputs.OceanLaunchSpecMetadataGetArgs>());
            set => _metadatas = value;
        }

        /// <summary>
        /// The launch specification name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The node pool you wish to use in your Launch Spec.
        /// </summary>
        [Input("nodePoolName")]
        public Input<string>? NodePoolName { get; set; }

        /// <summary>
        /// The Ocean cluster ID.
        /// </summary>
        [Input("oceanId")]
        public Input<string>? OceanId { get; set; }

        /// <summary>
        /// The Ocean virtual node group resource limits object.
        /// </summary>
        [Input("resourceLimits")]
        public Input<Inputs.OceanLaunchSpecResourceLimitsGetArgs>? ResourceLimits { get; set; }

        /// <summary>
        /// Boolean. When set to `true`, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
        /// </summary>
        [Input("restrictScaleDown")]
        public Input<bool>? RestrictScaleDown { get; set; }

        /// <summary>
        /// Root volume size (in GB).
        /// </summary>
        [Input("rootVolumeSize")]
        public Input<int>? RootVolumeSize { get; set; }

        /// <summary>
        /// Root volume disk type. Valid values: `"pd-standard"`, `"pd-ssd"`.
        /// </summary>
        [Input("rootVolumeType")]
        public Input<string>? RootVolumeType { get; set; }

        /// <summary>
        /// The account used by applications running on the VM to call GCP APIs.
        /// </summary>
        [Input("serviceAccount")]
        public Input<string>? ServiceAccount { get; set; }

        /// <summary>
        /// The Ocean shielded instance configuration object.
        /// </summary>
        [Input("shieldedInstanceConfig")]
        public Input<Inputs.OceanLaunchSpecShieldedInstanceConfigGetArgs>? ShieldedInstanceConfig { get; set; }

        /// <summary>
        /// Image URL.
        /// </summary>
        [Input("sourceImage")]
        public Input<string>? SourceImage { get; set; }

        /// <summary>
        /// The Ocean virtual node group storage object.
        /// </summary>
        [Input("storage")]
        public Input<Inputs.OceanLaunchSpecStorageGetArgs>? Storage { get; set; }

        [Input("strategies")]
        private InputList<Inputs.OceanLaunchSpecStrategyGetArgs>? _strategies;

        /// <summary>
        /// The Ocean Launch Spec Strategy object.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecStrategyGetArgs> Strategies
        {
            get => _strategies ?? (_strategies = new InputList<Inputs.OceanLaunchSpecStrategyGetArgs>());
            set => _strategies = value;
        }

        [Input("taints")]
        private InputList<Inputs.OceanLaunchSpecTaintGetArgs>? _taints;

        /// <summary>
        /// Optionally adds labels to instances launched in an Ocean cluster.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecTaintGetArgs> Taints
        {
            get => _taints ?? (_taints = new InputList<Inputs.OceanLaunchSpecTaintGetArgs>());
            set => _taints = value;
        }

        public OceanLaunchSpecState()
        {
        }
    }
}
