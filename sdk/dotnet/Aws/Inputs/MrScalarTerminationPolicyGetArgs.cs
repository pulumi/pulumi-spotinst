// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class MrScalarTerminationPolicyGetArgs : Pulumi.ResourceArgs
    {
        [Input("statements", required: true)]
        private InputList<Inputs.MrScalarTerminationPolicyStatementGetArgs>? _statements;
        public InputList<Inputs.MrScalarTerminationPolicyStatementGetArgs> Statements
        {
            get => _statements ?? (_statements = new InputList<Inputs.MrScalarTerminationPolicyStatementGetArgs>());
            set => _statements = value;
        }

        public MrScalarTerminationPolicyGetArgs()
        {
        }
    }
}