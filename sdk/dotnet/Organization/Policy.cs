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
    /// Provides a Spotinst access policy.
    /// 
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using SpotInst = Pulumi.SpotInst;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var terraformPolicy = new SpotInst.Organization.Policy("terraform_policy", new()
    ///     {
    ///         Name = "test-policy",
    ///         Description = "policy by terraform",
    ///         PolicyContents = new[]
    ///         {
    ///             new SpotInst.Organization.Inputs.PolicyPolicyContentArgs
    ///             {
    ///                 Statements = new[]
    ///                 {
    ///                     new SpotInst.Organization.Inputs.PolicyPolicyContentStatementArgs
    ///                     {
    ///                         Actions = new[]
    ///                         {
    ///                             "ocean:deleteCluster",
    ///                         },
    ///                         Effect = "DENY",
    ///                         Resources = new[]
    ///                         {
    ///                             "o-abcd1234",
    ///                             "o-defg6789",
    ///                         },
    ///                     },
    ///                     new SpotInst.Organization.Inputs.PolicyPolicyContentStatementArgs
    ///                     {
    ///                         Actions = new[]
    ///                         {
    ///                             "ocean:createCluster",
    ///                         },
    ///                         Effect = "DENY",
    ///                         Resources = new[]
    ///                         {
    ///                             "o-fhau4752",
    ///                             "o-761owf4r3",
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// </summary>
    [SpotInstResourceType("spotinst:organization/policy:Policy")]
    public partial class Policy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Short description of policy.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Name of the Policy.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Set permissions objects list.
        /// </summary>
        [Output("policyContents")]
        public Output<ImmutableArray<Outputs.PolicyPolicyContent>> PolicyContents { get; private set; } = null!;


        /// <summary>
        /// Create a Policy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Policy(string name, PolicyArgs args, CustomResourceOptions? options = null)
            : base("spotinst:organization/policy:Policy", name, args ?? new PolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Policy(string name, Input<string> id, PolicyState? state = null, CustomResourceOptions? options = null)
            : base("spotinst:organization/policy:Policy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Policy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Policy Get(string name, Input<string> id, PolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new Policy(name, id, state, options);
        }
    }

    public sealed class PolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Short description of policy.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of the Policy.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("policyContents", required: true)]
        private InputList<Inputs.PolicyPolicyContentArgs>? _policyContents;

        /// <summary>
        /// Set permissions objects list.
        /// </summary>
        public InputList<Inputs.PolicyPolicyContentArgs> PolicyContents
        {
            get => _policyContents ?? (_policyContents = new InputList<Inputs.PolicyPolicyContentArgs>());
            set => _policyContents = value;
        }

        public PolicyArgs()
        {
        }
        public static new PolicyArgs Empty => new PolicyArgs();
    }

    public sealed class PolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Short description of policy.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of the Policy.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("policyContents")]
        private InputList<Inputs.PolicyPolicyContentGetArgs>? _policyContents;

        /// <summary>
        /// Set permissions objects list.
        /// </summary>
        public InputList<Inputs.PolicyPolicyContentGetArgs> PolicyContents
        {
            get => _policyContents ?? (_policyContents = new InputList<Inputs.PolicyPolicyContentGetArgs>());
            set => _policyContents = value;
        }

        public PolicyState()
        {
        }
        public static new PolicyState Empty => new PolicyState();
    }
}
