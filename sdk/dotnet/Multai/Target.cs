// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Multai
{
    [SpotInstResourceType("spotinst:multai/target:Target")]
    public partial class Target : Pulumi.CustomResource
    {
        [Output("balancerId")]
        public Output<string> BalancerId { get; private set; } = null!;

        [Output("host")]
        public Output<string> Host { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("port")]
        public Output<int?> Port { get; private set; } = null!;

        [Output("tags")]
        public Output<ImmutableArray<Outputs.TargetTag>> Tags { get; private set; } = null!;

        [Output("targetSetId")]
        public Output<string> TargetSetId { get; private set; } = null!;

        [Output("weight")]
        public Output<int> Weight { get; private set; } = null!;


        /// <summary>
        /// Create a Target resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Target(string name, TargetArgs args, CustomResourceOptions? options = null)
            : base("spotinst:multai/target:Target", name, args ?? new TargetArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Target(string name, Input<string> id, TargetState? state = null, CustomResourceOptions? options = null)
            : base("spotinst:multai/target:Target", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Target resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Target Get(string name, Input<string> id, TargetState? state = null, CustomResourceOptions? options = null)
        {
            return new Target(name, id, state, options);
        }
    }

    public sealed class TargetArgs : Pulumi.ResourceArgs
    {
        [Input("balancerId", required: true)]
        public Input<string> BalancerId { get; set; } = null!;

        [Input("host", required: true)]
        public Input<string> Host { get; set; } = null!;

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("port")]
        public Input<int>? Port { get; set; }

        [Input("tags")]
        private InputList<Inputs.TargetTagArgs>? _tags;
        public InputList<Inputs.TargetTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.TargetTagArgs>());
            set => _tags = value;
        }

        [Input("targetSetId", required: true)]
        public Input<string> TargetSetId { get; set; } = null!;

        [Input("weight", required: true)]
        public Input<int> Weight { get; set; } = null!;

        public TargetArgs()
        {
        }
    }

    public sealed class TargetState : Pulumi.ResourceArgs
    {
        [Input("balancerId")]
        public Input<string>? BalancerId { get; set; }

        [Input("host")]
        public Input<string>? Host { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("port")]
        public Input<int>? Port { get; set; }

        [Input("tags")]
        private InputList<Inputs.TargetTagGetArgs>? _tags;
        public InputList<Inputs.TargetTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.TargetTagGetArgs>());
            set => _tags = value;
        }

        [Input("targetSetId")]
        public Input<string>? TargetSetId { get; set; }

        [Input("weight")]
        public Input<int>? Weight { get; set; }

        public TargetState()
        {
        }
    }
}
