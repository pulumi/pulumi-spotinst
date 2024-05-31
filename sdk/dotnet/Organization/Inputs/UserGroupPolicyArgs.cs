// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Organization.Inputs
{

    public sealed class UserGroupPolicyArgs : global::Pulumi.ResourceArgs
    {
        [Input("accountIds", required: true)]
        private InputList<string>? _accountIds;

        /// <summary>
        /// A list of accounts to register with the assigned under the
        /// given group (should be existing accounts only).
        /// </summary>
        public InputList<string> AccountIds
        {
            get => _accountIds ?? (_accountIds = new InputList<string>());
            set => _accountIds = value;
        }

        /// <summary>
        /// A policy to register under the given group
        /// (should be existing policy only).
        /// </summary>
        [Input("policyId", required: true)]
        public Input<string> PolicyId { get; set; } = null!;

        public UserGroupPolicyArgs()
        {
        }
        public static new UserGroupPolicyArgs Empty => new UserGroupPolicyArgs();
    }
}