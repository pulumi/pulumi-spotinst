// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst
{
    [SpotInstResourceType("spotinst:index/notificationCenter:NotificationCenter")]
    public partial class NotificationCenter : global::Pulumi.CustomResource
    {
        [Output("computePolicyConfig")]
        public Output<Outputs.NotificationCenterComputePolicyConfig> ComputePolicyConfig { get; private set; } = null!;

        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        [Output("isActive")]
        public Output<bool?> IsActive { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("privacyLevel")]
        public Output<string> PrivacyLevel { get; private set; } = null!;

        [Output("registeredUsers")]
        public Output<ImmutableArray<Outputs.NotificationCenterRegisteredUser>> RegisteredUsers { get; private set; } = null!;

        [Output("subscriptions")]
        public Output<ImmutableArray<Outputs.NotificationCenterSubscription>> Subscriptions { get; private set; } = null!;


        /// <summary>
        /// Create a NotificationCenter resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NotificationCenter(string name, NotificationCenterArgs args, CustomResourceOptions? options = null)
            : base("spotinst:index/notificationCenter:NotificationCenter", name, args ?? new NotificationCenterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NotificationCenter(string name, Input<string> id, NotificationCenterState? state = null, CustomResourceOptions? options = null)
            : base("spotinst:index/notificationCenter:NotificationCenter", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing NotificationCenter resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NotificationCenter Get(string name, Input<string> id, NotificationCenterState? state = null, CustomResourceOptions? options = null)
        {
            return new NotificationCenter(name, id, state, options);
        }
    }

    public sealed class NotificationCenterArgs : global::Pulumi.ResourceArgs
    {
        [Input("computePolicyConfig", required: true)]
        public Input<Inputs.NotificationCenterComputePolicyConfigArgs> ComputePolicyConfig { get; set; } = null!;

        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("isActive")]
        public Input<bool>? IsActive { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("privacyLevel", required: true)]
        public Input<string> PrivacyLevel { get; set; } = null!;

        [Input("registeredUsers")]
        private InputList<Inputs.NotificationCenterRegisteredUserArgs>? _registeredUsers;
        public InputList<Inputs.NotificationCenterRegisteredUserArgs> RegisteredUsers
        {
            get => _registeredUsers ?? (_registeredUsers = new InputList<Inputs.NotificationCenterRegisteredUserArgs>());
            set => _registeredUsers = value;
        }

        [Input("subscriptions")]
        private InputList<Inputs.NotificationCenterSubscriptionArgs>? _subscriptions;
        public InputList<Inputs.NotificationCenterSubscriptionArgs> Subscriptions
        {
            get => _subscriptions ?? (_subscriptions = new InputList<Inputs.NotificationCenterSubscriptionArgs>());
            set => _subscriptions = value;
        }

        public NotificationCenterArgs()
        {
        }
        public static new NotificationCenterArgs Empty => new NotificationCenterArgs();
    }

    public sealed class NotificationCenterState : global::Pulumi.ResourceArgs
    {
        [Input("computePolicyConfig")]
        public Input<Inputs.NotificationCenterComputePolicyConfigGetArgs>? ComputePolicyConfig { get; set; }

        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("isActive")]
        public Input<bool>? IsActive { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("privacyLevel")]
        public Input<string>? PrivacyLevel { get; set; }

        [Input("registeredUsers")]
        private InputList<Inputs.NotificationCenterRegisteredUserGetArgs>? _registeredUsers;
        public InputList<Inputs.NotificationCenterRegisteredUserGetArgs> RegisteredUsers
        {
            get => _registeredUsers ?? (_registeredUsers = new InputList<Inputs.NotificationCenterRegisteredUserGetArgs>());
            set => _registeredUsers = value;
        }

        [Input("subscriptions")]
        private InputList<Inputs.NotificationCenterSubscriptionGetArgs>? _subscriptions;
        public InputList<Inputs.NotificationCenterSubscriptionGetArgs> Subscriptions
        {
            get => _subscriptions ?? (_subscriptions = new InputList<Inputs.NotificationCenterSubscriptionGetArgs>());
            set => _subscriptions = value;
        }

        public NotificationCenterState()
        {
        }
        public static new NotificationCenterState Empty => new NotificationCenterState();
    }
}
