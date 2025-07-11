// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Organization
{
    /// <summary>
    /// Provides a Spotinst programmatic user in the creator's organization.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using SpotInst = Pulumi.SpotInst;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var terraformProgUser = new SpotInst.Organization.ProgrammaticUser("terraform_prog_user", new()
    ///     {
    ///         Name = "test-prog-user",
    ///         Description = "creating programmatic user",
    ///         Policies = new[]
    ///         {
    ///             new SpotInst.Organization.Inputs.ProgrammaticUserPolicyArgs
    ///             {
    ///                 PolicyId = "pol-g75d8c06",
    ///                 PolicyAccountIds = new[]
    ///                 {
    ///                     "act-a1b2c3d4",
    ///                 },
    ///             },
    ///         },
    ///         UserGroupIds = new[]
    ///         {
    ///             "ugr-abcd1234",
    ///             "ugr-defg8763",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [SpotInstResourceType("spotinst:organization/programmaticUser:ProgrammaticUser")]
    public partial class ProgrammaticUser : global::Pulumi.CustomResource
    {
        /// <summary>
        /// All the accounts the programmatic user will have access to.
        /// If used - Cannot be empty.
        /// </summary>
        [Output("accounts")]
        public Output<ImmutableArray<Outputs.ProgrammaticUserAccount>> Accounts { get; private set; } = null!;

        /// <summary>
        /// Brief description of the user.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Name of the programmatic user.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// All the policies the programmatic user will have access to.
        /// If used - Cannot be empty.
        /// </summary>
        [Output("policies")]
        public Output<ImmutableArray<Outputs.ProgrammaticUserPolicy>> Policies { get; private set; } = null!;

        /// <summary>
        /// A list of the user groups to register the given user to (should be existing user groups only)
        /// </summary>
        [Output("userGroupIds")]
        public Output<ImmutableArray<string>> UserGroupIds { get; private set; } = null!;


        /// <summary>
        /// Create a ProgrammaticUser resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ProgrammaticUser(string name, ProgrammaticUserArgs? args = null, CustomResourceOptions? options = null)
            : base("spotinst:organization/programmaticUser:ProgrammaticUser", name, args ?? new ProgrammaticUserArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ProgrammaticUser(string name, Input<string> id, ProgrammaticUserState? state = null, CustomResourceOptions? options = null)
            : base("spotinst:organization/programmaticUser:ProgrammaticUser", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ProgrammaticUser resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ProgrammaticUser Get(string name, Input<string> id, ProgrammaticUserState? state = null, CustomResourceOptions? options = null)
        {
            return new ProgrammaticUser(name, id, state, options);
        }
    }

    public sealed class ProgrammaticUserArgs : global::Pulumi.ResourceArgs
    {
        [Input("accounts")]
        private InputList<Inputs.ProgrammaticUserAccountArgs>? _accounts;

        /// <summary>
        /// All the accounts the programmatic user will have access to.
        /// If used - Cannot be empty.
        /// </summary>
        public InputList<Inputs.ProgrammaticUserAccountArgs> Accounts
        {
            get => _accounts ?? (_accounts = new InputList<Inputs.ProgrammaticUserAccountArgs>());
            set => _accounts = value;
        }

        /// <summary>
        /// Brief description of the user.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of the programmatic user.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("policies")]
        private InputList<Inputs.ProgrammaticUserPolicyArgs>? _policies;

        /// <summary>
        /// All the policies the programmatic user will have access to.
        /// If used - Cannot be empty.
        /// </summary>
        public InputList<Inputs.ProgrammaticUserPolicyArgs> Policies
        {
            get => _policies ?? (_policies = new InputList<Inputs.ProgrammaticUserPolicyArgs>());
            set => _policies = value;
        }

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

        public ProgrammaticUserArgs()
        {
        }
        public static new ProgrammaticUserArgs Empty => new ProgrammaticUserArgs();
    }

    public sealed class ProgrammaticUserState : global::Pulumi.ResourceArgs
    {
        [Input("accounts")]
        private InputList<Inputs.ProgrammaticUserAccountGetArgs>? _accounts;

        /// <summary>
        /// All the accounts the programmatic user will have access to.
        /// If used - Cannot be empty.
        /// </summary>
        public InputList<Inputs.ProgrammaticUserAccountGetArgs> Accounts
        {
            get => _accounts ?? (_accounts = new InputList<Inputs.ProgrammaticUserAccountGetArgs>());
            set => _accounts = value;
        }

        /// <summary>
        /// Brief description of the user.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of the programmatic user.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("policies")]
        private InputList<Inputs.ProgrammaticUserPolicyGetArgs>? _policies;

        /// <summary>
        /// All the policies the programmatic user will have access to.
        /// If used - Cannot be empty.
        /// </summary>
        public InputList<Inputs.ProgrammaticUserPolicyGetArgs> Policies
        {
            get => _policies ?? (_policies = new InputList<Inputs.ProgrammaticUserPolicyGetArgs>());
            set => _policies = value;
        }

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

        public ProgrammaticUserState()
        {
        }
        public static new ProgrammaticUserState Empty => new ProgrammaticUserState();
    }
}
