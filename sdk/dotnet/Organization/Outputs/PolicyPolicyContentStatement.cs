// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Organization.Outputs
{

    [OutputType]
    public sealed class PolicyPolicyContentStatement
    {
        /// <summary>
        /// Set a list of required actions for this permissions statement.
        /// Full list of actions can be found in [https://docs.spot.io/account-user-management/user-management/access-policies-actions/](https://docs.spot.io/account-user-management/user-management/access-policies-actions/).
        /// </summary>
        public readonly ImmutableArray<string> Actions;
        /// <summary>
        /// Valid values "ALLOW", "DENY".
        /// </summary>
        public readonly string Effect;
        /// <summary>
        /// Set a list of resources IDs. In order to include all resources in this statement - use "*".
        /// </summary>
        public readonly ImmutableArray<string> Resources;

        [OutputConstructor]
        private PolicyPolicyContentStatement(
            ImmutableArray<string> actions,

            string effect,

            ImmutableArray<string> resources)
        {
            Actions = actions;
            Effect = effect;
            Resources = resources;
        }
    }
}