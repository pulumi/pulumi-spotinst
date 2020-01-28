// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke
{
    /// <summary>
    /// Provides a custom Spotinst Ocean GKE Launch Spec resource.
    /// 
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-spotinst/blob/master/website/docs/r/ocean_gke_launch_spec.html.markdown.
    /// </summary>
    public partial class OceanLaunchSpec : Pulumi.CustomResource
    {
        /// <summary>
        /// Set custom headroom per launch spec. provide list of headrooms object.
        /// </summary>
        [Output("autoscaleHeadrooms")]
        public Output<ImmutableArray<Outputs.OceanLaunchSpecAutoscaleHeadrooms>> AutoscaleHeadrooms { get; private set; } = null!;

        /// <summary>
        /// Cluster's labels.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableArray<Outputs.OceanLaunchSpecLabels>> Labels { get; private set; } = null!;

        /// <summary>
        /// Cluster's metadata.
        /// </summary>
        [Output("metadatas")]
        public Output<ImmutableArray<Outputs.OceanLaunchSpecMetadatas>> Metadatas { get; private set; } = null!;

        /// <summary>
        /// The Ocean cluster ID required for launchSpec create. 
        /// </summary>
        [Output("oceanId")]
        public Output<string> OceanId { get; private set; } = null!;

        /// <summary>
        /// Image URL.
        /// </summary>
        [Output("sourceImage")]
        public Output<string> SourceImage { get; private set; } = null!;

        /// <summary>
        /// Cluster's taints.
        /// </summary>
        [Output("taints")]
        public Output<ImmutableArray<Outputs.OceanLaunchSpecTaints>> Taints { get; private set; } = null!;


        /// <summary>
        /// Create a OceanLaunchSpec resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OceanLaunchSpec(string name, OceanLaunchSpecArgs args, CustomResourceOptions? options = null)
            : base("spotinst:gke/oceanLaunchSpec:OceanLaunchSpec", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
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
        private InputList<Inputs.OceanLaunchSpecAutoscaleHeadroomsArgs>? _autoscaleHeadrooms;

        /// <summary>
        /// Set custom headroom per launch spec. provide list of headrooms object.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecAutoscaleHeadroomsArgs> AutoscaleHeadrooms
        {
            get => _autoscaleHeadrooms ?? (_autoscaleHeadrooms = new InputList<Inputs.OceanLaunchSpecAutoscaleHeadroomsArgs>());
            set => _autoscaleHeadrooms = value;
        }

        [Input("labels")]
        private InputList<Inputs.OceanLaunchSpecLabelsArgs>? _labels;

        /// <summary>
        /// Cluster's labels.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecLabelsArgs> Labels
        {
            get => _labels ?? (_labels = new InputList<Inputs.OceanLaunchSpecLabelsArgs>());
            set => _labels = value;
        }

        [Input("metadatas", required: true)]
        private InputList<Inputs.OceanLaunchSpecMetadatasArgs>? _metadatas;

        /// <summary>
        /// Cluster's metadata.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecMetadatasArgs> Metadatas
        {
            get => _metadatas ?? (_metadatas = new InputList<Inputs.OceanLaunchSpecMetadatasArgs>());
            set => _metadatas = value;
        }

        /// <summary>
        /// The Ocean cluster ID required for launchSpec create. 
        /// </summary>
        [Input("oceanId", required: true)]
        public Input<string> OceanId { get; set; } = null!;

        /// <summary>
        /// Image URL.
        /// </summary>
        [Input("sourceImage", required: true)]
        public Input<string> SourceImage { get; set; } = null!;

        [Input("taints")]
        private InputList<Inputs.OceanLaunchSpecTaintsArgs>? _taints;

        /// <summary>
        /// Cluster's taints.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecTaintsArgs> Taints
        {
            get => _taints ?? (_taints = new InputList<Inputs.OceanLaunchSpecTaintsArgs>());
            set => _taints = value;
        }

        public OceanLaunchSpecArgs()
        {
        }
    }

    public sealed class OceanLaunchSpecState : Pulumi.ResourceArgs
    {
        [Input("autoscaleHeadrooms")]
        private InputList<Inputs.OceanLaunchSpecAutoscaleHeadroomsGetArgs>? _autoscaleHeadrooms;

        /// <summary>
        /// Set custom headroom per launch spec. provide list of headrooms object.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecAutoscaleHeadroomsGetArgs> AutoscaleHeadrooms
        {
            get => _autoscaleHeadrooms ?? (_autoscaleHeadrooms = new InputList<Inputs.OceanLaunchSpecAutoscaleHeadroomsGetArgs>());
            set => _autoscaleHeadrooms = value;
        }

        [Input("labels")]
        private InputList<Inputs.OceanLaunchSpecLabelsGetArgs>? _labels;

        /// <summary>
        /// Cluster's labels.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecLabelsGetArgs> Labels
        {
            get => _labels ?? (_labels = new InputList<Inputs.OceanLaunchSpecLabelsGetArgs>());
            set => _labels = value;
        }

        [Input("metadatas")]
        private InputList<Inputs.OceanLaunchSpecMetadatasGetArgs>? _metadatas;

        /// <summary>
        /// Cluster's metadata.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecMetadatasGetArgs> Metadatas
        {
            get => _metadatas ?? (_metadatas = new InputList<Inputs.OceanLaunchSpecMetadatasGetArgs>());
            set => _metadatas = value;
        }

        /// <summary>
        /// The Ocean cluster ID required for launchSpec create. 
        /// </summary>
        [Input("oceanId")]
        public Input<string>? OceanId { get; set; }

        /// <summary>
        /// Image URL.
        /// </summary>
        [Input("sourceImage")]
        public Input<string>? SourceImage { get; set; }

        [Input("taints")]
        private InputList<Inputs.OceanLaunchSpecTaintsGetArgs>? _taints;

        /// <summary>
        /// Cluster's taints.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecTaintsGetArgs> Taints
        {
            get => _taints ?? (_taints = new InputList<Inputs.OceanLaunchSpecTaintsGetArgs>());
            set => _taints = value;
        }

        public OceanLaunchSpecState()
        {
        }
    }

    namespace Inputs
    {

    public sealed class OceanLaunchSpecAutoscaleHeadroomsArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optionally configure the number of CPUs to allocate for each headroom unit. CPUs are denoted in millicores, where 1000 millicores = 1 vCPU.
        /// </summary>
        [Input("cpuPerUnit")]
        public Input<int>? CpuPerUnit { get; set; }

        /// <summary>
        /// Optionally configure the number of GPUS to allocate for each headroom unit.
        /// </summary>
        [Input("gpuPerUnit")]
        public Input<int>? GpuPerUnit { get; set; }

        /// <summary>
        /// Optionally configure the amount of memory (MB) to allocate for each headroom unit.
        /// </summary>
        [Input("memoryPerUnit")]
        public Input<int>? MemoryPerUnit { get; set; }

        /// <summary>
        /// The number of units to retain as headroom, where each unit has the defined headroom CPU, memory and GPU.
        /// </summary>
        [Input("numOfUnits", required: true)]
        public Input<int> NumOfUnits { get; set; } = null!;

        public OceanLaunchSpecAutoscaleHeadroomsArgs()
        {
        }
    }

    public sealed class OceanLaunchSpecAutoscaleHeadroomsGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optionally configure the number of CPUs to allocate for each headroom unit. CPUs are denoted in millicores, where 1000 millicores = 1 vCPU.
        /// </summary>
        [Input("cpuPerUnit")]
        public Input<int>? CpuPerUnit { get; set; }

        /// <summary>
        /// Optionally configure the number of GPUS to allocate for each headroom unit.
        /// </summary>
        [Input("gpuPerUnit")]
        public Input<int>? GpuPerUnit { get; set; }

        /// <summary>
        /// Optionally configure the amount of memory (MB) to allocate for each headroom unit.
        /// </summary>
        [Input("memoryPerUnit")]
        public Input<int>? MemoryPerUnit { get; set; }

        /// <summary>
        /// The number of units to retain as headroom, where each unit has the defined headroom CPU, memory and GPU.
        /// </summary>
        [Input("numOfUnits", required: true)]
        public Input<int> NumOfUnits { get; set; } = null!;

        public OceanLaunchSpecAutoscaleHeadroomsGetArgs()
        {
        }
    }

    public sealed class OceanLaunchSpecLabelsArgs : Pulumi.ResourceArgs
    {
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public OceanLaunchSpecLabelsArgs()
        {
        }
    }

    public sealed class OceanLaunchSpecLabelsGetArgs : Pulumi.ResourceArgs
    {
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public OceanLaunchSpecLabelsGetArgs()
        {
        }
    }

    public sealed class OceanLaunchSpecMetadatasArgs : Pulumi.ResourceArgs
    {
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public OceanLaunchSpecMetadatasArgs()
        {
        }
    }

    public sealed class OceanLaunchSpecMetadatasGetArgs : Pulumi.ResourceArgs
    {
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public OceanLaunchSpecMetadatasGetArgs()
        {
        }
    }

    public sealed class OceanLaunchSpecTaintsArgs : Pulumi.ResourceArgs
    {
        [Input("effect", required: true)]
        public Input<string> Effect { get; set; } = null!;

        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public OceanLaunchSpecTaintsArgs()
        {
        }
    }

    public sealed class OceanLaunchSpecTaintsGetArgs : Pulumi.ResourceArgs
    {
        [Input("effect", required: true)]
        public Input<string> Effect { get; set; } = null!;

        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public OceanLaunchSpecTaintsGetArgs()
        {
        }
    }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class OceanLaunchSpecAutoscaleHeadrooms
    {
        /// <summary>
        /// Optionally configure the number of CPUs to allocate for each headroom unit. CPUs are denoted in millicores, where 1000 millicores = 1 vCPU.
        /// </summary>
        public readonly int? CpuPerUnit;
        /// <summary>
        /// Optionally configure the number of GPUS to allocate for each headroom unit.
        /// </summary>
        public readonly int? GpuPerUnit;
        /// <summary>
        /// Optionally configure the amount of memory (MB) to allocate for each headroom unit.
        /// </summary>
        public readonly int? MemoryPerUnit;
        /// <summary>
        /// The number of units to retain as headroom, where each unit has the defined headroom CPU, memory and GPU.
        /// </summary>
        public readonly int NumOfUnits;

        [OutputConstructor]
        private OceanLaunchSpecAutoscaleHeadrooms(
            int? cpuPerUnit,
            int? gpuPerUnit,
            int? memoryPerUnit,
            int numOfUnits)
        {
            CpuPerUnit = cpuPerUnit;
            GpuPerUnit = gpuPerUnit;
            MemoryPerUnit = memoryPerUnit;
            NumOfUnits = numOfUnits;
        }
    }

    [OutputType]
    public sealed class OceanLaunchSpecLabels
    {
        public readonly string Key;
        public readonly string Value;

        [OutputConstructor]
        private OceanLaunchSpecLabels(
            string key,
            string value)
        {
            Key = key;
            Value = value;
        }
    }

    [OutputType]
    public sealed class OceanLaunchSpecMetadatas
    {
        public readonly string Key;
        public readonly string Value;

        [OutputConstructor]
        private OceanLaunchSpecMetadatas(
            string key,
            string value)
        {
            Key = key;
            Value = value;
        }
    }

    [OutputType]
    public sealed class OceanLaunchSpecTaints
    {
        public readonly string Effect;
        public readonly string Key;
        public readonly string Value;

        [OutputConstructor]
        private OceanLaunchSpecTaints(
            string effect,
            string key,
            string value)
        {
            Effect = effect;
            Key = key;
            Value = value;
        }
    }
    }
}
