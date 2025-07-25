// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Organization.Inputs
{

    public sealed class PolicyPolicyContentArgs : global::Pulumi.ResourceArgs
    {
        [Input("statements", required: true)]
        private InputList<Inputs.PolicyPolicyContentStatementArgs>? _statements;

        /// <summary>
        /// List of permissions statements.
        /// </summary>
        public InputList<Inputs.PolicyPolicyContentStatementArgs> Statements
        {
            get => _statements ?? (_statements = new InputList<Inputs.PolicyPolicyContentStatementArgs>());
            set => _statements = value;
        }

        public PolicyPolicyContentArgs()
        {
        }
        public static new PolicyPolicyContentArgs Empty => new PolicyPolicyContentArgs();
    }
}
