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
    /// Provides a Spotinst Multai Balancer.
    /// 
    /// 
    /// 
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-spotinst/blob/master/website/docs/r/multai_balancer.html.markdown.
    /// </summary>
    public partial class Balancer : Pulumi.CustomResource
    {
        [Output("connectionTimeouts")]
        public Output<Outputs.BalancerConnectionTimeouts?> ConnectionTimeouts { get; private set; } = null!;

        [Output("dnsCnameAliases")]
        public Output<ImmutableArray<string>> DnsCnameAliases { get; private set; } = null!;

        /// <summary>
        /// The balancer name. May contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("scheme")]
        public Output<string?> Scheme { get; private set; } = null!;

        /// <summary>
        /// A list of key:value paired tags.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<Outputs.BalancerTags>> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a Balancer resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Balancer(string name, BalancerArgs? args = null, CustomResourceOptions? options = null)
            : base("spotinst:multai/balancer:Balancer", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
        {
        }

        private Balancer(string name, Input<string> id, BalancerState? state = null, CustomResourceOptions? options = null)
            : base("spotinst:multai/balancer:Balancer", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Balancer resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Balancer Get(string name, Input<string> id, BalancerState? state = null, CustomResourceOptions? options = null)
        {
            return new Balancer(name, id, state, options);
        }
    }

    public sealed class BalancerArgs : Pulumi.ResourceArgs
    {
        [Input("connectionTimeouts")]
        public Input<Inputs.BalancerConnectionTimeoutsArgs>? ConnectionTimeouts { get; set; }

        [Input("dnsCnameAliases")]
        private InputList<string>? _dnsCnameAliases;
        public InputList<string> DnsCnameAliases
        {
            get => _dnsCnameAliases ?? (_dnsCnameAliases = new InputList<string>());
            set => _dnsCnameAliases = value;
        }

        /// <summary>
        /// The balancer name. May contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("scheme")]
        public Input<string>? Scheme { get; set; }

        [Input("tags")]
        private InputList<Inputs.BalancerTagsArgs>? _tags;

        /// <summary>
        /// A list of key:value paired tags.
        /// </summary>
        public InputList<Inputs.BalancerTagsArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.BalancerTagsArgs>());
            set => _tags = value;
        }

        public BalancerArgs()
        {
        }
    }

    public sealed class BalancerState : Pulumi.ResourceArgs
    {
        [Input("connectionTimeouts")]
        public Input<Inputs.BalancerConnectionTimeoutsGetArgs>? ConnectionTimeouts { get; set; }

        [Input("dnsCnameAliases")]
        private InputList<string>? _dnsCnameAliases;
        public InputList<string> DnsCnameAliases
        {
            get => _dnsCnameAliases ?? (_dnsCnameAliases = new InputList<string>());
            set => _dnsCnameAliases = value;
        }

        /// <summary>
        /// The balancer name. May contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("scheme")]
        public Input<string>? Scheme { get; set; }

        [Input("tags")]
        private InputList<Inputs.BalancerTagsGetArgs>? _tags;

        /// <summary>
        /// A list of key:value paired tags.
        /// </summary>
        public InputList<Inputs.BalancerTagsGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.BalancerTagsGetArgs>());
            set => _tags = value;
        }

        public BalancerState()
        {
        }
    }

    namespace Inputs
    {

    public sealed class BalancerConnectionTimeoutsArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The time for the load balancer to keep connections alive before reporting the target as de-registered, in seconds (range: 1 - 3600).
        /// </summary>
        [Input("draining")]
        public Input<int>? Draining { get; set; }

        /// <summary>
        /// The idle timeout value, in seconds. (range: 1 - 3600).
        /// </summary>
        [Input("idle")]
        public Input<int>? Idle { get; set; }

        public BalancerConnectionTimeoutsArgs()
        {
        }
    }

    public sealed class BalancerConnectionTimeoutsGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The time for the load balancer to keep connections alive before reporting the target as de-registered, in seconds (range: 1 - 3600).
        /// </summary>
        [Input("draining")]
        public Input<int>? Draining { get; set; }

        /// <summary>
        /// The idle timeout value, in seconds. (range: 1 - 3600).
        /// </summary>
        [Input("idle")]
        public Input<int>? Idle { get; set; }

        public BalancerConnectionTimeoutsGetArgs()
        {
        }
    }

    public sealed class BalancerTagsArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The tag's key.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// The tag's value.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public BalancerTagsArgs()
        {
        }
    }

    public sealed class BalancerTagsGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The tag's key.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// The tag's value.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public BalancerTagsGetArgs()
        {
        }
    }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class BalancerConnectionTimeouts
    {
        /// <summary>
        /// The time for the load balancer to keep connections alive before reporting the target as de-registered, in seconds (range: 1 - 3600).
        /// </summary>
        public readonly int? Draining;
        /// <summary>
        /// The idle timeout value, in seconds. (range: 1 - 3600).
        /// </summary>
        public readonly int? Idle;

        [OutputConstructor]
        private BalancerConnectionTimeouts(
            int? draining,
            int? idle)
        {
            Draining = draining;
            Idle = idle;
        }
    }

    [OutputType]
    public sealed class BalancerTags
    {
        /// <summary>
        /// The tag's key.
        /// </summary>
        public readonly string Key;
        /// <summary>
        /// The tag's value.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private BalancerTags(
            string key,
            string value)
        {
            Key = key;
            Value = value;
        }
    }
    }
}
