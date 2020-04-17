// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Multai
{
    /// <summary>
    /// Provides a Spotinst Multai Target Set.
    /// </summary>
    public partial class TargetSet : Pulumi.CustomResource
    {
        /// <summary>
        /// The id of the balancer.
        /// </summary>
        [Output("balancerId")]
        public Output<string> BalancerId { get; private set; } = null!;

        /// <summary>
        /// The id of the deployment.
        /// </summary>
        [Output("deploymentId")]
        public Output<string> DeploymentId { get; private set; } = null!;

        [Output("healthCheck")]
        public Output<Outputs.TargetSetHealthCheck> HealthCheck { get; private set; } = null!;

        /// <summary>
        /// The name of the Target Set. Must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The port on which the load balancer is listening.
        /// </summary>
        [Output("port")]
        public Output<int?> Port { get; private set; } = null!;

        /// <summary>
        /// The protocol to allow connections to the target for the health check.
        /// </summary>
        [Output("protocol")]
        public Output<string> Protocol { get; private set; } = null!;

        /// <summary>
        /// A list of key:value paired tags.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<Outputs.TargetSetTag>> Tags { get; private set; } = null!;

        /// <summary>
        /// Defines how traffic is distributed between the Target Set.
        /// </summary>
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
        /// <summary>
        /// The id of the balancer.
        /// </summary>
        [Input("balancerId", required: true)]
        public Input<string> BalancerId { get; set; } = null!;

        /// <summary>
        /// The id of the deployment.
        /// </summary>
        [Input("deploymentId", required: true)]
        public Input<string> DeploymentId { get; set; } = null!;

        [Input("healthCheck", required: true)]
        public Input<Inputs.TargetSetHealthCheckArgs> HealthCheck { get; set; } = null!;

        /// <summary>
        /// The name of the Target Set. Must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The port on which the load balancer is listening.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// The protocol to allow connections to the target for the health check.
        /// </summary>
        [Input("protocol", required: true)]
        public Input<string> Protocol { get; set; } = null!;

        [Input("tags")]
        private InputList<Inputs.TargetSetTagArgs>? _tags;

        /// <summary>
        /// A list of key:value paired tags.
        /// </summary>
        public InputList<Inputs.TargetSetTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.TargetSetTagArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// Defines how traffic is distributed between the Target Set.
        /// </summary>
        [Input("weight", required: true)]
        public Input<int> Weight { get; set; } = null!;

        public TargetSetArgs()
        {
        }
    }

    public sealed class TargetSetState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The id of the balancer.
        /// </summary>
        [Input("balancerId")]
        public Input<string>? BalancerId { get; set; }

        /// <summary>
        /// The id of the deployment.
        /// </summary>
        [Input("deploymentId")]
        public Input<string>? DeploymentId { get; set; }

        [Input("healthCheck")]
        public Input<Inputs.TargetSetHealthCheckGetArgs>? HealthCheck { get; set; }

        /// <summary>
        /// The name of the Target Set. Must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The port on which the load balancer is listening.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// The protocol to allow connections to the target for the health check.
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        [Input("tags")]
        private InputList<Inputs.TargetSetTagGetArgs>? _tags;

        /// <summary>
        /// A list of key:value paired tags.
        /// </summary>
        public InputList<Inputs.TargetSetTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.TargetSetTagGetArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// Defines how traffic is distributed between the Target Set.
        /// </summary>
        [Input("weight")]
        public Input<int>? Weight { get; set; }

        public TargetSetState()
        {
        }
    }
}
