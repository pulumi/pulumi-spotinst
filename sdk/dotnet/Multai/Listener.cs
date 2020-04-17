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
    /// Provides a Spotinst Multai Listener.
    /// </summary>
    public partial class Listener : Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the balancer.
        /// </summary>
        [Output("balancerId")]
        public Output<string> BalancerId { get; private set; } = null!;

        /// <summary>
        /// The port on which the load balancer is listening.
        /// </summary>
        [Output("port")]
        public Output<int> Port { get; private set; } = null!;

        /// <summary>
        /// The protocol to allow connections to the load balancer.
        /// </summary>
        [Output("protocol")]
        public Output<string> Protocol { get; private set; } = null!;

        /// <summary>
        /// A list of key:value paired tags.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<Outputs.ListenerTag>> Tags { get; private set; } = null!;

        /// <summary>
        /// Describes the TLSConfig configuration.
        /// </summary>
        [Output("tlsConfig")]
        public Output<Outputs.ListenerTlsConfig?> TlsConfig { get; private set; } = null!;


        /// <summary>
        /// Create a Listener resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Listener(string name, ListenerArgs args, CustomResourceOptions? options = null)
            : base("spotinst:multai/listener:Listener", name, args ?? new ListenerArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Listener(string name, Input<string> id, ListenerState? state = null, CustomResourceOptions? options = null)
            : base("spotinst:multai/listener:Listener", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Listener resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Listener Get(string name, Input<string> id, ListenerState? state = null, CustomResourceOptions? options = null)
        {
            return new Listener(name, id, state, options);
        }
    }

    public sealed class ListenerArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the balancer.
        /// </summary>
        [Input("balancerId", required: true)]
        public Input<string> BalancerId { get; set; } = null!;

        /// <summary>
        /// The port on which the load balancer is listening.
        /// </summary>
        [Input("port", required: true)]
        public Input<int> Port { get; set; } = null!;

        /// <summary>
        /// The protocol to allow connections to the load balancer.
        /// </summary>
        [Input("protocol", required: true)]
        public Input<string> Protocol { get; set; } = null!;

        [Input("tags")]
        private InputList<Inputs.ListenerTagArgs>? _tags;

        /// <summary>
        /// A list of key:value paired tags.
        /// </summary>
        public InputList<Inputs.ListenerTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.ListenerTagArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// Describes the TLSConfig configuration.
        /// </summary>
        [Input("tlsConfig")]
        public Input<Inputs.ListenerTlsConfigArgs>? TlsConfig { get; set; }

        public ListenerArgs()
        {
        }
    }

    public sealed class ListenerState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the balancer.
        /// </summary>
        [Input("balancerId")]
        public Input<string>? BalancerId { get; set; }

        /// <summary>
        /// The port on which the load balancer is listening.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// The protocol to allow connections to the load balancer.
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        [Input("tags")]
        private InputList<Inputs.ListenerTagGetArgs>? _tags;

        /// <summary>
        /// A list of key:value paired tags.
        /// </summary>
        public InputList<Inputs.ListenerTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.ListenerTagGetArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// Describes the TLSConfig configuration.
        /// </summary>
        [Input("tlsConfig")]
        public Input<Inputs.ListenerTlsConfigGetArgs>? TlsConfig { get; set; }

        public ListenerState()
        {
        }
    }
}
