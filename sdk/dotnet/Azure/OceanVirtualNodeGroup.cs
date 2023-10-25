// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure
{
    /// <summary>
    /// Manages a Spotinst Ocean AKS Virtual Node Group resource.
    /// </summary>
    [SpotInstResourceType("spotinst:azure/oceanVirtualNodeGroup:OceanVirtualNodeGroup")]
    public partial class OceanVirtualNodeGroup : global::Pulumi.CustomResource
    {
        /// <summary>
        /// .
        /// </summary>
        [Output("autoscales")]
        public Output<ImmutableArray<Outputs.OceanVirtualNodeGroupAutoscale>> Autoscales { get; private set; } = null!;

        /// <summary>
        /// Additional labels for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableArray<Outputs.OceanVirtualNodeGroupLabel>> Labels { get; private set; } = null!;

        /// <summary>
        /// .
        /// </summary>
        [Output("launchSpecifications")]
        public Output<ImmutableArray<Outputs.OceanVirtualNodeGroupLaunchSpecification>> LaunchSpecifications { get; private set; } = null!;

        /// <summary>
        /// Set name for the virtual node group.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The Ocean cluster ID.
        /// </summary>
        [Output("oceanId")]
        public Output<string> OceanId { get; private set; } = null!;

        /// <summary>
        /// .
        /// </summary>
        [Output("resourceLimits")]
        public Output<ImmutableArray<Outputs.OceanVirtualNodeGroupResourceLimit>> ResourceLimits { get; private set; } = null!;

        /// <summary>
        /// Additional taints for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
        /// </summary>
        [Output("taints")]
        public Output<ImmutableArray<Outputs.OceanVirtualNodeGroupTaint>> Taints { get; private set; } = null!;

        /// <summary>
        /// An Array holding Availability Zones, this configures the availability zones the Ocean may launch instances in per VNG.
        /// </summary>
        [Output("zones")]
        public Output<ImmutableArray<string>> Zones { get; private set; } = null!;


        /// <summary>
        /// Create a OceanVirtualNodeGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OceanVirtualNodeGroup(string name, OceanVirtualNodeGroupArgs args, CustomResourceOptions? options = null)
            : base("spotinst:azure/oceanVirtualNodeGroup:OceanVirtualNodeGroup", name, args ?? new OceanVirtualNodeGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OceanVirtualNodeGroup(string name, Input<string> id, OceanVirtualNodeGroupState? state = null, CustomResourceOptions? options = null)
            : base("spotinst:azure/oceanVirtualNodeGroup:OceanVirtualNodeGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing OceanVirtualNodeGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OceanVirtualNodeGroup Get(string name, Input<string> id, OceanVirtualNodeGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new OceanVirtualNodeGroup(name, id, state, options);
        }
    }

    public sealed class OceanVirtualNodeGroupArgs : global::Pulumi.ResourceArgs
    {
        [Input("autoscales")]
        private InputList<Inputs.OceanVirtualNodeGroupAutoscaleArgs>? _autoscales;

        /// <summary>
        /// .
        /// </summary>
        public InputList<Inputs.OceanVirtualNodeGroupAutoscaleArgs> Autoscales
        {
            get => _autoscales ?? (_autoscales = new InputList<Inputs.OceanVirtualNodeGroupAutoscaleArgs>());
            set => _autoscales = value;
        }

        [Input("labels")]
        private InputList<Inputs.OceanVirtualNodeGroupLabelArgs>? _labels;

        /// <summary>
        /// Additional labels for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
        /// </summary>
        public InputList<Inputs.OceanVirtualNodeGroupLabelArgs> Labels
        {
            get => _labels ?? (_labels = new InputList<Inputs.OceanVirtualNodeGroupLabelArgs>());
            set => _labels = value;
        }

        [Input("launchSpecifications")]
        private InputList<Inputs.OceanVirtualNodeGroupLaunchSpecificationArgs>? _launchSpecifications;

        /// <summary>
        /// .
        /// </summary>
        public InputList<Inputs.OceanVirtualNodeGroupLaunchSpecificationArgs> LaunchSpecifications
        {
            get => _launchSpecifications ?? (_launchSpecifications = new InputList<Inputs.OceanVirtualNodeGroupLaunchSpecificationArgs>());
            set => _launchSpecifications = value;
        }

        /// <summary>
        /// Set name for the virtual node group.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Ocean cluster ID.
        /// </summary>
        [Input("oceanId", required: true)]
        public Input<string> OceanId { get; set; } = null!;

        [Input("resourceLimits")]
        private InputList<Inputs.OceanVirtualNodeGroupResourceLimitArgs>? _resourceLimits;

        /// <summary>
        /// .
        /// </summary>
        public InputList<Inputs.OceanVirtualNodeGroupResourceLimitArgs> ResourceLimits
        {
            get => _resourceLimits ?? (_resourceLimits = new InputList<Inputs.OceanVirtualNodeGroupResourceLimitArgs>());
            set => _resourceLimits = value;
        }

        [Input("taints")]
        private InputList<Inputs.OceanVirtualNodeGroupTaintArgs>? _taints;

        /// <summary>
        /// Additional taints for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
        /// </summary>
        public InputList<Inputs.OceanVirtualNodeGroupTaintArgs> Taints
        {
            get => _taints ?? (_taints = new InputList<Inputs.OceanVirtualNodeGroupTaintArgs>());
            set => _taints = value;
        }

        [Input("zones")]
        private InputList<string>? _zones;

        /// <summary>
        /// An Array holding Availability Zones, this configures the availability zones the Ocean may launch instances in per VNG.
        /// </summary>
        public InputList<string> Zones
        {
            get => _zones ?? (_zones = new InputList<string>());
            set => _zones = value;
        }

        public OceanVirtualNodeGroupArgs()
        {
        }
        public static new OceanVirtualNodeGroupArgs Empty => new OceanVirtualNodeGroupArgs();
    }

    public sealed class OceanVirtualNodeGroupState : global::Pulumi.ResourceArgs
    {
        [Input("autoscales")]
        private InputList<Inputs.OceanVirtualNodeGroupAutoscaleGetArgs>? _autoscales;

        /// <summary>
        /// .
        /// </summary>
        public InputList<Inputs.OceanVirtualNodeGroupAutoscaleGetArgs> Autoscales
        {
            get => _autoscales ?? (_autoscales = new InputList<Inputs.OceanVirtualNodeGroupAutoscaleGetArgs>());
            set => _autoscales = value;
        }

        [Input("labels")]
        private InputList<Inputs.OceanVirtualNodeGroupLabelGetArgs>? _labels;

        /// <summary>
        /// Additional labels for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
        /// </summary>
        public InputList<Inputs.OceanVirtualNodeGroupLabelGetArgs> Labels
        {
            get => _labels ?? (_labels = new InputList<Inputs.OceanVirtualNodeGroupLabelGetArgs>());
            set => _labels = value;
        }

        [Input("launchSpecifications")]
        private InputList<Inputs.OceanVirtualNodeGroupLaunchSpecificationGetArgs>? _launchSpecifications;

        /// <summary>
        /// .
        /// </summary>
        public InputList<Inputs.OceanVirtualNodeGroupLaunchSpecificationGetArgs> LaunchSpecifications
        {
            get => _launchSpecifications ?? (_launchSpecifications = new InputList<Inputs.OceanVirtualNodeGroupLaunchSpecificationGetArgs>());
            set => _launchSpecifications = value;
        }

        /// <summary>
        /// Set name for the virtual node group.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Ocean cluster ID.
        /// </summary>
        [Input("oceanId")]
        public Input<string>? OceanId { get; set; }

        [Input("resourceLimits")]
        private InputList<Inputs.OceanVirtualNodeGroupResourceLimitGetArgs>? _resourceLimits;

        /// <summary>
        /// .
        /// </summary>
        public InputList<Inputs.OceanVirtualNodeGroupResourceLimitGetArgs> ResourceLimits
        {
            get => _resourceLimits ?? (_resourceLimits = new InputList<Inputs.OceanVirtualNodeGroupResourceLimitGetArgs>());
            set => _resourceLimits = value;
        }

        [Input("taints")]
        private InputList<Inputs.OceanVirtualNodeGroupTaintGetArgs>? _taints;

        /// <summary>
        /// Additional taints for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
        /// </summary>
        public InputList<Inputs.OceanVirtualNodeGroupTaintGetArgs> Taints
        {
            get => _taints ?? (_taints = new InputList<Inputs.OceanVirtualNodeGroupTaintGetArgs>());
            set => _taints = value;
        }

        [Input("zones")]
        private InputList<string>? _zones;

        /// <summary>
        /// An Array holding Availability Zones, this configures the availability zones the Ocean may launch instances in per VNG.
        /// </summary>
        public InputList<string> Zones
        {
            get => _zones ?? (_zones = new InputList<string>());
            set => _zones = value;
        }

        public OceanVirtualNodeGroupState()
        {
        }
        public static new OceanVirtualNodeGroupState Empty => new OceanVirtualNodeGroupState();
    }
}
