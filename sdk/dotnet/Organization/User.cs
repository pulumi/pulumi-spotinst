// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Organization
{
    /// <summary>
    /// Provides a Spotinst User in the creator's organization.
    /// </summary>
    [SpotInstResourceType("spotinst:organization/user:User")]
    public partial class User : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Email.
        /// </summary>
        [Output("email")]
        public Output<string> Email { get; private set; } = null!;

        /// <summary>
        /// The first name of the user.
        /// </summary>
        [Output("firstName")]
        public Output<string> FirstName { get; private set; } = null!;

        /// <summary>
        /// The last name of the user.
        /// </summary>
        [Output("lastName")]
        public Output<string> LastName { get; private set; } = null!;

        /// <summary>
        /// Password.
        /// </summary>
        [Output("password")]
        public Output<string> Password { get; private set; } = null!;

        /// <summary>
        /// The policies to register under the given group
        /// (should be existing policies only).
        /// </summary>
        [Output("policies")]
        public Output<ImmutableArray<Outputs.UserPolicy>> Policies { get; private set; } = null!;

        /// <summary>
        /// User's role.
        /// </summary>
        [Output("role")]
        public Output<string?> Role { get; private set; } = null!;

        /// <summary>
        /// A list of the user groups to register the given user to (should be existing user groups only)
        /// </summary>
        [Output("userGroupIds")]
        public Output<ImmutableArray<string>> UserGroupIds { get; private set; } = null!;


        /// <summary>
        /// Create a User resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public User(string name, UserArgs args, CustomResourceOptions? options = null)
            : base("spotinst:organization/user:User", name, args ?? new UserArgs(), MakeResourceOptions(options, ""))
        {
        }

        private User(string name, Input<string> id, UserState? state = null, CustomResourceOptions? options = null)
            : base("spotinst:organization/user:User", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing User resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static User Get(string name, Input<string> id, UserState? state = null, CustomResourceOptions? options = null)
        {
            return new User(name, id, state, options);
        }
    }

    public sealed class UserArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Email.
        /// </summary>
        [Input("email", required: true)]
        public Input<string> Email { get; set; } = null!;

        /// <summary>
        /// The first name of the user.
        /// </summary>
        [Input("firstName", required: true)]
        public Input<string> FirstName { get; set; } = null!;

        /// <summary>
        /// The last name of the user.
        /// </summary>
        [Input("lastName", required: true)]
        public Input<string> LastName { get; set; } = null!;

        /// <summary>
        /// Password.
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        [Input("policies")]
        private InputList<Inputs.UserPolicyArgs>? _policies;

        /// <summary>
        /// The policies to register under the given group
        /// (should be existing policies only).
        /// </summary>
        public InputList<Inputs.UserPolicyArgs> Policies
        {
            get => _policies ?? (_policies = new InputList<Inputs.UserPolicyArgs>());
            set => _policies = value;
        }

        /// <summary>
        /// User's role.
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        [Input("userGroupIds")]
        private InputList<string>? _userGroupIds;

        /// <summary>
        /// A list of the user groups to register the given user to (should be existing user groups only)
        /// </summary>
        public InputList<string> UserGroupIds
        {
            get => _userGroupIds ?? (_userGroupIds = new InputList<string>());
            set => _userGroupIds = value;
        }

        public UserArgs()
        {
        }
        public static new UserArgs Empty => new UserArgs();
    }

    public sealed class UserState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Email.
        /// </summary>
        [Input("email")]
        public Input<string>? Email { get; set; }

        /// <summary>
        /// The first name of the user.
        /// </summary>
        [Input("firstName")]
        public Input<string>? FirstName { get; set; }

        /// <summary>
        /// The last name of the user.
        /// </summary>
        [Input("lastName")]
        public Input<string>? LastName { get; set; }

        /// <summary>
        /// Password.
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        [Input("policies")]
        private InputList<Inputs.UserPolicyGetArgs>? _policies;

        /// <summary>
        /// The policies to register under the given group
        /// (should be existing policies only).
        /// </summary>
        public InputList<Inputs.UserPolicyGetArgs> Policies
        {
            get => _policies ?? (_policies = new InputList<Inputs.UserPolicyGetArgs>());
            set => _policies = value;
        }

        /// <summary>
        /// User's role.
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        [Input("userGroupIds")]
        private InputList<string>? _userGroupIds;

        /// <summary>
        /// A list of the user groups to register the given user to (should be existing user groups only)
        /// </summary>
        public InputList<string> UserGroupIds
        {
            get => _userGroupIds ?? (_userGroupIds = new InputList<string>());
            set => _userGroupIds = value;
        }

        public UserState()
        {
        }
        public static new UserState Empty => new UserState();
    }
}
