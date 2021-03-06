// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Multai
{
    [SpotInstResourceType("spotinst:multai/targetSet:TargetSet")]
    public partial class TargetSet : Pulumi.CustomResource
    {
        [Output("balancerId")]
        public Output<string> BalancerId { get; private set; } = null!;

        [Output("deploymentId")]
        public Output<string> DeploymentId { get; private set; } = null!;

        [Output("healthCheck")]
        public Output<Outputs.TargetSetHealthCheck> HealthCheck { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("port")]
        public Output<int?> Port { get; private set; } = null!;

        [Output("protocol")]
        public Output<string> Protocol { get; private set; } = null!;

        [Output("tags")]
        public Output<ImmutableArray<Outputs.TargetSetTag>> Tags { get; private set; } = null!;

        [Output("weight")]
        public Output<int> Weight { get; private set; } = null!;


        /// <summary>
        /// Create a TargetSet resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TargetSet(string name, TargetSetArgs args, CustomResourceOptions? options = null)
            : base("spotinst:multai/targetSet:TargetSet", name, args ?? new TargetSetArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TargetSet(string name, Input<string> id, TargetSetState? state = null, CustomResourceOptions? options = null)
            : base("spotinst:multai/targetSet:TargetSet", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TargetSet resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TargetSet Get(string name, Input<string> id, TargetSetState? state = null, CustomResourceOptions? options = null)
        {
            return new TargetSet(name, id, state, options);
        }
    }

    public sealed class TargetSetArgs : Pulumi.ResourceArgs
    {
        [Input("balancerId", required: true)]
        public Input<string> BalancerId { get; set; } = null!;

        [Input("deploymentId", required: true)]
        public Input<string> DeploymentId { get; set; } = null!;

        [Input("healthCheck", required: true)]
        public Input<Inputs.TargetSetHealthCheckArgs> HealthCheck { get; set; } = null!;

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("port")]
        public Input<int>? Port { get; set; }

        [Input("protocol", required: true)]
        public Input<string> Protocol { get; set; } = null!;

        [Input("tags")]
        private InputList<Inputs.TargetSetTagArgs>? _tags;
        public InputList<Inputs.TargetSetTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.TargetSetTagArgs>());
            set => _tags = value;
        }

        [Input("weight", required: true)]
        public Input<int> Weight { get; set; } = null!;

        public TargetSetArgs()
        {
        }
    }

    public sealed class TargetSetState : Pulumi.ResourceArgs
    {
        [Input("balancerId")]
        public Input<string>? BalancerId { get; set; }

        [Input("deploymentId")]
        public Input<string>? DeploymentId { get; set; }

        [Input("healthCheck")]
        public Input<Inputs.TargetSetHealthCheckGetArgs>? HealthCheck { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("port")]
        public Input<int>? Port { get; set; }

        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        [Input("tags")]
        private InputList<Inputs.TargetSetTagGetArgs>? _tags;
        public InputList<Inputs.TargetSetTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.TargetSetTagGetArgs>());
            set => _tags = value;
        }

        [Input("weight")]
        public Input<int>? Weight { get; set; }

        public TargetSetState()
        {
        }
    }
}
