// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupScalingUpPolicyStepAdjustmentGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("action", required: true)]
        public Input<Inputs.ElastigroupScalingUpPolicyStepAdjustmentActionGetArgs> Action { get; set; } = null!;

        [Input("threshold", required: true)]
        public Input<int> Threshold { get; set; } = null!;

        public ElastigroupScalingUpPolicyStepAdjustmentGetArgs()
        {
        }
        public static new ElastigroupScalingUpPolicyStepAdjustmentGetArgs Empty => new ElastigroupScalingUpPolicyStepAdjustmentGetArgs();
    }
}
