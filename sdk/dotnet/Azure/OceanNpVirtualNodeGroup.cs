// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure
{
    [SpotInstResourceType("spotinst:azure/oceanNpVirtualNodeGroup:OceanNpVirtualNodeGroup")]
    public partial class OceanNpVirtualNodeGroup : global::Pulumi.CustomResource
    {
        [Output("availabilityZones")]
        public Output<ImmutableArray<string>> AvailabilityZones { get; private set; } = null!;

        [Output("enableNodePublicIp")]
        public Output<bool?> EnableNodePublicIp { get; private set; } = null!;

        [Output("fallbackToOndemand")]
        public Output<bool?> FallbackToOndemand { get; private set; } = null!;

        [Output("filters")]
        public Output<Outputs.OceanNpVirtualNodeGroupFilters?> Filters { get; private set; } = null!;

        [Output("headrooms")]
        public Output<ImmutableArray<Outputs.OceanNpVirtualNodeGroupHeadroom>> Headrooms { get; private set; } = null!;

        [Output("labels")]
        public Output<ImmutableDictionary<string, object>?> Labels { get; private set; } = null!;

        [Output("maxCount")]
        public Output<int?> MaxCount { get; private set; } = null!;

        [Output("maxPodsPerNode")]
        public Output<int?> MaxPodsPerNode { get; private set; } = null!;

        [Output("minCount")]
        public Output<int?> MinCount { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("oceanId")]
        public Output<string> OceanId { get; private set; } = null!;

        [Output("osDiskSizeGb")]
        public Output<int?> OsDiskSizeGb { get; private set; } = null!;

        [Output("osDiskType")]
        public Output<string?> OsDiskType { get; private set; } = null!;

        [Output("osSku")]
        public Output<string?> OsSku { get; private set; } = null!;

        [Output("osType")]
        public Output<string?> OsType { get; private set; } = null!;

        [Output("spotPercentage")]
        public Output<int?> SpotPercentage { get; private set; } = null!;

        [Output("tags")]
        public Output<ImmutableDictionary<string, object>?> Tags { get; private set; } = null!;

        [Output("taints")]
        public Output<ImmutableArray<Outputs.OceanNpVirtualNodeGroupTaint>> Taints { get; private set; } = null!;


        /// <summary>
        /// Create a OceanNpVirtualNodeGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OceanNpVirtualNodeGroup(string name, OceanNpVirtualNodeGroupArgs args, CustomResourceOptions? options = null)
            : base("spotinst:azure/oceanNpVirtualNodeGroup:OceanNpVirtualNodeGroup", name, args ?? new OceanNpVirtualNodeGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OceanNpVirtualNodeGroup(string name, Input<string> id, OceanNpVirtualNodeGroupState? state = null, CustomResourceOptions? options = null)
            : base("spotinst:azure/oceanNpVirtualNodeGroup:OceanNpVirtualNodeGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing OceanNpVirtualNodeGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OceanNpVirtualNodeGroup Get(string name, Input<string> id, OceanNpVirtualNodeGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new OceanNpVirtualNodeGroup(name, id, state, options);
        }
    }

    public sealed class OceanNpVirtualNodeGroupArgs : global::Pulumi.ResourceArgs
    {
        [Input("availabilityZones")]
        private InputList<string>? _availabilityZones;
        public InputList<string> AvailabilityZones
        {
            get => _availabilityZones ?? (_availabilityZones = new InputList<string>());
            set => _availabilityZones = value;
        }

        [Input("enableNodePublicIp")]
        public Input<bool>? EnableNodePublicIp { get; set; }

        [Input("fallbackToOndemand")]
        public Input<bool>? FallbackToOndemand { get; set; }

        [Input("filters")]
        public Input<Inputs.OceanNpVirtualNodeGroupFiltersArgs>? Filters { get; set; }

        [Input("headrooms")]
        private InputList<Inputs.OceanNpVirtualNodeGroupHeadroomArgs>? _headrooms;
        public InputList<Inputs.OceanNpVirtualNodeGroupHeadroomArgs> Headrooms
        {
            get => _headrooms ?? (_headrooms = new InputList<Inputs.OceanNpVirtualNodeGroupHeadroomArgs>());
            set => _headrooms = value;
        }

        [Input("labels")]
        private InputMap<object>? _labels;
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        [Input("maxCount")]
        public Input<int>? MaxCount { get; set; }

        [Input("maxPodsPerNode")]
        public Input<int>? MaxPodsPerNode { get; set; }

        [Input("minCount")]
        public Input<int>? MinCount { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("oceanId", required: true)]
        public Input<string> OceanId { get; set; } = null!;

        [Input("osDiskSizeGb")]
        public Input<int>? OsDiskSizeGb { get; set; }

        [Input("osDiskType")]
        public Input<string>? OsDiskType { get; set; }

        [Input("osSku")]
        public Input<string>? OsSku { get; set; }

        [Input("osType")]
        public Input<string>? OsType { get; set; }

        [Input("spotPercentage")]
        public Input<int>? SpotPercentage { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        [Input("taints")]
        private InputList<Inputs.OceanNpVirtualNodeGroupTaintArgs>? _taints;
        public InputList<Inputs.OceanNpVirtualNodeGroupTaintArgs> Taints
        {
            get => _taints ?? (_taints = new InputList<Inputs.OceanNpVirtualNodeGroupTaintArgs>());
            set => _taints = value;
        }

        public OceanNpVirtualNodeGroupArgs()
        {
        }
        public static new OceanNpVirtualNodeGroupArgs Empty => new OceanNpVirtualNodeGroupArgs();
    }

    public sealed class OceanNpVirtualNodeGroupState : global::Pulumi.ResourceArgs
    {
        [Input("availabilityZones")]
        private InputList<string>? _availabilityZones;
        public InputList<string> AvailabilityZones
        {
            get => _availabilityZones ?? (_availabilityZones = new InputList<string>());
            set => _availabilityZones = value;
        }

        [Input("enableNodePublicIp")]
        public Input<bool>? EnableNodePublicIp { get; set; }

        [Input("fallbackToOndemand")]
        public Input<bool>? FallbackToOndemand { get; set; }

        [Input("filters")]
        public Input<Inputs.OceanNpVirtualNodeGroupFiltersGetArgs>? Filters { get; set; }

        [Input("headrooms")]
        private InputList<Inputs.OceanNpVirtualNodeGroupHeadroomGetArgs>? _headrooms;
        public InputList<Inputs.OceanNpVirtualNodeGroupHeadroomGetArgs> Headrooms
        {
            get => _headrooms ?? (_headrooms = new InputList<Inputs.OceanNpVirtualNodeGroupHeadroomGetArgs>());
            set => _headrooms = value;
        }

        [Input("labels")]
        private InputMap<object>? _labels;
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        [Input("maxCount")]
        public Input<int>? MaxCount { get; set; }

        [Input("maxPodsPerNode")]
        public Input<int>? MaxPodsPerNode { get; set; }

        [Input("minCount")]
        public Input<int>? MinCount { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("oceanId")]
        public Input<string>? OceanId { get; set; }

        [Input("osDiskSizeGb")]
        public Input<int>? OsDiskSizeGb { get; set; }

        [Input("osDiskType")]
        public Input<string>? OsDiskType { get; set; }

        [Input("osSku")]
        public Input<string>? OsSku { get; set; }

        [Input("osType")]
        public Input<string>? OsType { get; set; }

        [Input("spotPercentage")]
        public Input<int>? SpotPercentage { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        [Input("taints")]
        private InputList<Inputs.OceanNpVirtualNodeGroupTaintGetArgs>? _taints;
        public InputList<Inputs.OceanNpVirtualNodeGroupTaintGetArgs> Taints
        {
            get => _taints ?? (_taints = new InputList<Inputs.OceanNpVirtualNodeGroupTaintGetArgs>());
            set => _taints = value;
        }

        public OceanNpVirtualNodeGroupState()
        {
        }
        public static new OceanNpVirtualNodeGroupState Empty => new OceanNpVirtualNodeGroupState();
    }
}
