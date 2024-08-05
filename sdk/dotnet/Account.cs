// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst
{
    /// <summary>
    /// Provides a Spotinst account resource.
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
    ///     // Create a Account
    ///     var myAcct = new SpotInst.Account("my_acct", new()
    ///     {
    ///         Name = "my_acct",
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [SpotInstResourceType("spotinst:index/account:Account")]
    public partial class Account : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Provide a name for your account. The account name must contain at least one character that is a-z or A-Z.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a Account resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Account(string name, AccountArgs? args = null, CustomResourceOptions? options = null)
            : base("spotinst:index/account:Account", name, args ?? new AccountArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Account(string name, Input<string> id, AccountState? state = null, CustomResourceOptions? options = null)
            : base("spotinst:index/account:Account", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Account resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Account Get(string name, Input<string> id, AccountState? state = null, CustomResourceOptions? options = null)
        {
            return new Account(name, id, state, options);
        }
    }

    public sealed class AccountArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Provide a name for your account. The account name must contain at least one character that is a-z or A-Z.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public AccountArgs()
        {
        }
        public static new AccountArgs Empty => new AccountArgs();
    }

    public sealed class AccountState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Provide a name for your account. The account name must contain at least one character that is a-z or A-Z.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public AccountState()
        {
        }
        public static new AccountState Empty => new AccountState();
    }
}
