// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd
{
    /// <summary>
    /// Manages a Spotinst OceanCD Rollout Spec resource.
    /// </summary>
    [SpotInstResourceType("spotinst:oceancd/rolloutSpec:RolloutSpec")]
    public partial class RolloutSpec : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Holds information on how to react when failure happens.
        /// </summary>
        [Output("failurePolicy")]
        public Output<Outputs.RolloutSpecFailurePolicy?> FailurePolicy { get; private set; } = null!;

        /// <summary>
        /// Identifier name for Ocean CD Rollout Spec. Must be unique
        /// </summary>
        [Output("rolloutSpecName")]
        public Output<string> RolloutSpecName { get; private set; } = null!;

        /// <summary>
        /// Represents the SpotDeployment selector.
        /// </summary>
        [Output("spotDeployment")]
        public Output<Outputs.RolloutSpecSpotDeployment?> SpotDeployment { get; private set; } = null!;

        /// <summary>
        /// You must specify either `spotDeployment` OR `spotDeployments` but not both. Every SpotDeployment has to be unique. If more than one `SpotDeployment` has been configured, no `traffic` managers can be set as part of the RolloutSpec.For such case ensure that each of the chosen SpotDeployments are being exposed with different Kubernetes services.
        /// </summary>
        [Output("spotDeployments")]
        public Output<ImmutableArray<Outputs.RolloutSpecSpotDeployment>> SpotDeployments { get; private set; } = null!;

        /// <summary>
        /// Determines the Ocean CD strategy
        /// </summary>
        [Output("strategy")]
        public Output<Outputs.RolloutSpecStrategy> Strategy { get; private set; } = null!;

        /// <summary>
        /// Hosts all of the supported service meshes needed to enable more fine-grained traffic routing. In case `SpotDeployments` contains more than one SpotDeployment the `traffic` manager may not be configured.
        /// </summary>
        [Output("traffic")]
        public Output<Outputs.RolloutSpecTraffic?> Traffic { get; private set; } = null!;


        /// <summary>
        /// Create a RolloutSpec resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RolloutSpec(string name, RolloutSpecArgs args, CustomResourceOptions? options = null)
            : base("spotinst:oceancd/rolloutSpec:RolloutSpec", name, args ?? new RolloutSpecArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RolloutSpec(string name, Input<string> id, RolloutSpecState? state = null, CustomResourceOptions? options = null)
            : base("spotinst:oceancd/rolloutSpec:RolloutSpec", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RolloutSpec resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RolloutSpec Get(string name, Input<string> id, RolloutSpecState? state = null, CustomResourceOptions? options = null)
        {
            return new RolloutSpec(name, id, state, options);
        }
    }

    public sealed class RolloutSpecArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Holds information on how to react when failure happens.
        /// </summary>
        [Input("failurePolicy")]
        public Input<Inputs.RolloutSpecFailurePolicyArgs>? FailurePolicy { get; set; }

        /// <summary>
        /// Identifier name for Ocean CD Rollout Spec. Must be unique
        /// </summary>
        [Input("rolloutSpecName", required: true)]
        public Input<string> RolloutSpecName { get; set; } = null!;

        /// <summary>
        /// Represents the SpotDeployment selector.
        /// </summary>
        [Input("spotDeployment")]
        public Input<Inputs.RolloutSpecSpotDeploymentArgs>? SpotDeployment { get; set; }

        [Input("spotDeployments")]
        private InputList<Inputs.RolloutSpecSpotDeploymentArgs>? _spotDeployments;

        /// <summary>
        /// You must specify either `spotDeployment` OR `spotDeployments` but not both. Every SpotDeployment has to be unique. If more than one `SpotDeployment` has been configured, no `traffic` managers can be set as part of the RolloutSpec.For such case ensure that each of the chosen SpotDeployments are being exposed with different Kubernetes services.
        /// </summary>
        public InputList<Inputs.RolloutSpecSpotDeploymentArgs> SpotDeployments
        {
            get => _spotDeployments ?? (_spotDeployments = new InputList<Inputs.RolloutSpecSpotDeploymentArgs>());
            set => _spotDeployments = value;
        }

        /// <summary>
        /// Determines the Ocean CD strategy
        /// </summary>
        [Input("strategy", required: true)]
        public Input<Inputs.RolloutSpecStrategyArgs> Strategy { get; set; } = null!;

        /// <summary>
        /// Hosts all of the supported service meshes needed to enable more fine-grained traffic routing. In case `SpotDeployments` contains more than one SpotDeployment the `traffic` manager may not be configured.
        /// </summary>
        [Input("traffic")]
        public Input<Inputs.RolloutSpecTrafficArgs>? Traffic { get; set; }

        public RolloutSpecArgs()
        {
        }
        public static new RolloutSpecArgs Empty => new RolloutSpecArgs();
    }

    public sealed class RolloutSpecState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Holds information on how to react when failure happens.
        /// </summary>
        [Input("failurePolicy")]
        public Input<Inputs.RolloutSpecFailurePolicyGetArgs>? FailurePolicy { get; set; }

        /// <summary>
        /// Identifier name for Ocean CD Rollout Spec. Must be unique
        /// </summary>
        [Input("rolloutSpecName")]
        public Input<string>? RolloutSpecName { get; set; }

        /// <summary>
        /// Represents the SpotDeployment selector.
        /// </summary>
        [Input("spotDeployment")]
        public Input<Inputs.RolloutSpecSpotDeploymentGetArgs>? SpotDeployment { get; set; }

        [Input("spotDeployments")]
        private InputList<Inputs.RolloutSpecSpotDeploymentGetArgs>? _spotDeployments;

        /// <summary>
        /// You must specify either `spotDeployment` OR `spotDeployments` but not both. Every SpotDeployment has to be unique. If more than one `SpotDeployment` has been configured, no `traffic` managers can be set as part of the RolloutSpec.For such case ensure that each of the chosen SpotDeployments are being exposed with different Kubernetes services.
        /// </summary>
        public InputList<Inputs.RolloutSpecSpotDeploymentGetArgs> SpotDeployments
        {
            get => _spotDeployments ?? (_spotDeployments = new InputList<Inputs.RolloutSpecSpotDeploymentGetArgs>());
            set => _spotDeployments = value;
        }

        /// <summary>
        /// Determines the Ocean CD strategy
        /// </summary>
        [Input("strategy")]
        public Input<Inputs.RolloutSpecStrategyGetArgs>? Strategy { get; set; }

        /// <summary>
        /// Hosts all of the supported service meshes needed to enable more fine-grained traffic routing. In case `SpotDeployments` contains more than one SpotDeployment the `traffic` manager may not be configured.
        /// </summary>
        [Input("traffic")]
        public Input<Inputs.RolloutSpecTrafficGetArgs>? Traffic { get; set; }

        public RolloutSpecState()
        {
        }
        public static new RolloutSpecState Empty => new RolloutSpecState();
    }
}