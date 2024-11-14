// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst
{
    [SpotInstResourceType("spotinst:index/oceanRightSizingRule:OceanRightSizingRule")]
    public partial class OceanRightSizingRule : global::Pulumi.CustomResource
    {
        [Output("attachWorkloads")]
        public Output<ImmutableArray<Outputs.OceanRightSizingRuleAttachWorkload>> AttachWorkloads { get; private set; } = null!;

        [Output("detachWorkloads")]
        public Output<ImmutableArray<Outputs.OceanRightSizingRuleDetachWorkload>> DetachWorkloads { get; private set; } = null!;

        [Output("excludePreliminaryRecommendations")]
        public Output<bool?> ExcludePreliminaryRecommendations { get; private set; } = null!;

        [Output("oceanId")]
        public Output<string?> OceanId { get; private set; } = null!;

        [Output("recommendationApplicationBoundaries")]
        public Output<ImmutableArray<Outputs.OceanRightSizingRuleRecommendationApplicationBoundary>> RecommendationApplicationBoundaries { get; private set; } = null!;

        [Output("recommendationApplicationHpas")]
        public Output<ImmutableArray<Outputs.OceanRightSizingRuleRecommendationApplicationHpa>> RecommendationApplicationHpas { get; private set; } = null!;

        [Output("recommendationApplicationIntervals")]
        public Output<ImmutableArray<Outputs.OceanRightSizingRuleRecommendationApplicationInterval>> RecommendationApplicationIntervals { get; private set; } = null!;

        [Output("recommendationApplicationMinThresholds")]
        public Output<ImmutableArray<Outputs.OceanRightSizingRuleRecommendationApplicationMinThreshold>> RecommendationApplicationMinThresholds { get; private set; } = null!;

        [Output("recommendationApplicationOverheadValues")]
        public Output<ImmutableArray<Outputs.OceanRightSizingRuleRecommendationApplicationOverheadValue>> RecommendationApplicationOverheadValues { get; private set; } = null!;

        [Output("restartReplicas")]
        public Output<string?> RestartReplicas { get; private set; } = null!;

        [Output("ruleName")]
        public Output<string> RuleName { get; private set; } = null!;


        /// <summary>
        /// Create a OceanRightSizingRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OceanRightSizingRule(string name, OceanRightSizingRuleArgs args, CustomResourceOptions? options = null)
            : base("spotinst:index/oceanRightSizingRule:OceanRightSizingRule", name, args ?? new OceanRightSizingRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OceanRightSizingRule(string name, Input<string> id, OceanRightSizingRuleState? state = null, CustomResourceOptions? options = null)
            : base("spotinst:index/oceanRightSizingRule:OceanRightSizingRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing OceanRightSizingRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OceanRightSizingRule Get(string name, Input<string> id, OceanRightSizingRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new OceanRightSizingRule(name, id, state, options);
        }
    }

    public sealed class OceanRightSizingRuleArgs : global::Pulumi.ResourceArgs
    {
        [Input("attachWorkloads")]
        private InputList<Inputs.OceanRightSizingRuleAttachWorkloadArgs>? _attachWorkloads;
        public InputList<Inputs.OceanRightSizingRuleAttachWorkloadArgs> AttachWorkloads
        {
            get => _attachWorkloads ?? (_attachWorkloads = new InputList<Inputs.OceanRightSizingRuleAttachWorkloadArgs>());
            set => _attachWorkloads = value;
        }

        [Input("detachWorkloads")]
        private InputList<Inputs.OceanRightSizingRuleDetachWorkloadArgs>? _detachWorkloads;
        public InputList<Inputs.OceanRightSizingRuleDetachWorkloadArgs> DetachWorkloads
        {
            get => _detachWorkloads ?? (_detachWorkloads = new InputList<Inputs.OceanRightSizingRuleDetachWorkloadArgs>());
            set => _detachWorkloads = value;
        }

        [Input("excludePreliminaryRecommendations")]
        public Input<bool>? ExcludePreliminaryRecommendations { get; set; }

        [Input("oceanId")]
        public Input<string>? OceanId { get; set; }

        [Input("recommendationApplicationBoundaries")]
        private InputList<Inputs.OceanRightSizingRuleRecommendationApplicationBoundaryArgs>? _recommendationApplicationBoundaries;
        public InputList<Inputs.OceanRightSizingRuleRecommendationApplicationBoundaryArgs> RecommendationApplicationBoundaries
        {
            get => _recommendationApplicationBoundaries ?? (_recommendationApplicationBoundaries = new InputList<Inputs.OceanRightSizingRuleRecommendationApplicationBoundaryArgs>());
            set => _recommendationApplicationBoundaries = value;
        }

        [Input("recommendationApplicationHpas")]
        private InputList<Inputs.OceanRightSizingRuleRecommendationApplicationHpaArgs>? _recommendationApplicationHpas;
        public InputList<Inputs.OceanRightSizingRuleRecommendationApplicationHpaArgs> RecommendationApplicationHpas
        {
            get => _recommendationApplicationHpas ?? (_recommendationApplicationHpas = new InputList<Inputs.OceanRightSizingRuleRecommendationApplicationHpaArgs>());
            set => _recommendationApplicationHpas = value;
        }

        [Input("recommendationApplicationIntervals", required: true)]
        private InputList<Inputs.OceanRightSizingRuleRecommendationApplicationIntervalArgs>? _recommendationApplicationIntervals;
        public InputList<Inputs.OceanRightSizingRuleRecommendationApplicationIntervalArgs> RecommendationApplicationIntervals
        {
            get => _recommendationApplicationIntervals ?? (_recommendationApplicationIntervals = new InputList<Inputs.OceanRightSizingRuleRecommendationApplicationIntervalArgs>());
            set => _recommendationApplicationIntervals = value;
        }

        [Input("recommendationApplicationMinThresholds")]
        private InputList<Inputs.OceanRightSizingRuleRecommendationApplicationMinThresholdArgs>? _recommendationApplicationMinThresholds;
        public InputList<Inputs.OceanRightSizingRuleRecommendationApplicationMinThresholdArgs> RecommendationApplicationMinThresholds
        {
            get => _recommendationApplicationMinThresholds ?? (_recommendationApplicationMinThresholds = new InputList<Inputs.OceanRightSizingRuleRecommendationApplicationMinThresholdArgs>());
            set => _recommendationApplicationMinThresholds = value;
        }

        [Input("recommendationApplicationOverheadValues")]
        private InputList<Inputs.OceanRightSizingRuleRecommendationApplicationOverheadValueArgs>? _recommendationApplicationOverheadValues;
        public InputList<Inputs.OceanRightSizingRuleRecommendationApplicationOverheadValueArgs> RecommendationApplicationOverheadValues
        {
            get => _recommendationApplicationOverheadValues ?? (_recommendationApplicationOverheadValues = new InputList<Inputs.OceanRightSizingRuleRecommendationApplicationOverheadValueArgs>());
            set => _recommendationApplicationOverheadValues = value;
        }

        [Input("restartReplicas")]
        public Input<string>? RestartReplicas { get; set; }

        [Input("ruleName", required: true)]
        public Input<string> RuleName { get; set; } = null!;

        public OceanRightSizingRuleArgs()
        {
        }
        public static new OceanRightSizingRuleArgs Empty => new OceanRightSizingRuleArgs();
    }

    public sealed class OceanRightSizingRuleState : global::Pulumi.ResourceArgs
    {
        [Input("attachWorkloads")]
        private InputList<Inputs.OceanRightSizingRuleAttachWorkloadGetArgs>? _attachWorkloads;
        public InputList<Inputs.OceanRightSizingRuleAttachWorkloadGetArgs> AttachWorkloads
        {
            get => _attachWorkloads ?? (_attachWorkloads = new InputList<Inputs.OceanRightSizingRuleAttachWorkloadGetArgs>());
            set => _attachWorkloads = value;
        }

        [Input("detachWorkloads")]
        private InputList<Inputs.OceanRightSizingRuleDetachWorkloadGetArgs>? _detachWorkloads;
        public InputList<Inputs.OceanRightSizingRuleDetachWorkloadGetArgs> DetachWorkloads
        {
            get => _detachWorkloads ?? (_detachWorkloads = new InputList<Inputs.OceanRightSizingRuleDetachWorkloadGetArgs>());
            set => _detachWorkloads = value;
        }

        [Input("excludePreliminaryRecommendations")]
        public Input<bool>? ExcludePreliminaryRecommendations { get; set; }

        [Input("oceanId")]
        public Input<string>? OceanId { get; set; }

        [Input("recommendationApplicationBoundaries")]
        private InputList<Inputs.OceanRightSizingRuleRecommendationApplicationBoundaryGetArgs>? _recommendationApplicationBoundaries;
        public InputList<Inputs.OceanRightSizingRuleRecommendationApplicationBoundaryGetArgs> RecommendationApplicationBoundaries
        {
            get => _recommendationApplicationBoundaries ?? (_recommendationApplicationBoundaries = new InputList<Inputs.OceanRightSizingRuleRecommendationApplicationBoundaryGetArgs>());
            set => _recommendationApplicationBoundaries = value;
        }

        [Input("recommendationApplicationHpas")]
        private InputList<Inputs.OceanRightSizingRuleRecommendationApplicationHpaGetArgs>? _recommendationApplicationHpas;
        public InputList<Inputs.OceanRightSizingRuleRecommendationApplicationHpaGetArgs> RecommendationApplicationHpas
        {
            get => _recommendationApplicationHpas ?? (_recommendationApplicationHpas = new InputList<Inputs.OceanRightSizingRuleRecommendationApplicationHpaGetArgs>());
            set => _recommendationApplicationHpas = value;
        }

        [Input("recommendationApplicationIntervals")]
        private InputList<Inputs.OceanRightSizingRuleRecommendationApplicationIntervalGetArgs>? _recommendationApplicationIntervals;
        public InputList<Inputs.OceanRightSizingRuleRecommendationApplicationIntervalGetArgs> RecommendationApplicationIntervals
        {
            get => _recommendationApplicationIntervals ?? (_recommendationApplicationIntervals = new InputList<Inputs.OceanRightSizingRuleRecommendationApplicationIntervalGetArgs>());
            set => _recommendationApplicationIntervals = value;
        }

        [Input("recommendationApplicationMinThresholds")]
        private InputList<Inputs.OceanRightSizingRuleRecommendationApplicationMinThresholdGetArgs>? _recommendationApplicationMinThresholds;
        public InputList<Inputs.OceanRightSizingRuleRecommendationApplicationMinThresholdGetArgs> RecommendationApplicationMinThresholds
        {
            get => _recommendationApplicationMinThresholds ?? (_recommendationApplicationMinThresholds = new InputList<Inputs.OceanRightSizingRuleRecommendationApplicationMinThresholdGetArgs>());
            set => _recommendationApplicationMinThresholds = value;
        }

        [Input("recommendationApplicationOverheadValues")]
        private InputList<Inputs.OceanRightSizingRuleRecommendationApplicationOverheadValueGetArgs>? _recommendationApplicationOverheadValues;
        public InputList<Inputs.OceanRightSizingRuleRecommendationApplicationOverheadValueGetArgs> RecommendationApplicationOverheadValues
        {
            get => _recommendationApplicationOverheadValues ?? (_recommendationApplicationOverheadValues = new InputList<Inputs.OceanRightSizingRuleRecommendationApplicationOverheadValueGetArgs>());
            set => _recommendationApplicationOverheadValues = value;
        }

        [Input("restartReplicas")]
        public Input<string>? RestartReplicas { get; set; }

        [Input("ruleName")]
        public Input<string>? RuleName { get; set; }

        public OceanRightSizingRuleState()
        {
        }
        public static new OceanRightSizingRuleState Empty => new OceanRightSizingRuleState();
    }
}
