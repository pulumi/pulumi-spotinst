// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class MrScalarTerminationPolicyArgs : Pulumi.ResourceArgs
    {
        [Input("statements", required: true)]
        private InputList<Inputs.MrScalarTerminationPolicyStatementArgs>? _statements;
        public InputList<Inputs.MrScalarTerminationPolicyStatementArgs> Statements
        {
            get => _statements ?? (_statements = new InputList<Inputs.MrScalarTerminationPolicyStatementArgs>());
            set => _statements = value;
        }

        public MrScalarTerminationPolicyArgs()
        {
        }
    }
}
