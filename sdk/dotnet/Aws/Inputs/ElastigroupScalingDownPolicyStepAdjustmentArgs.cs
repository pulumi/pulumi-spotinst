// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupScalingDownPolicyStepAdjustmentArgs : global::Pulumi.ResourceArgs
    {
        [Input("action", required: true)]
        public Input<Inputs.ElastigroupScalingDownPolicyStepAdjustmentActionArgs> Action { get; set; } = null!;

        [Input("threshold", required: true)]
        public Input<int> Threshold { get; set; } = null!;

        public ElastigroupScalingDownPolicyStepAdjustmentArgs()
        {
        }
        public static new ElastigroupScalingDownPolicyStepAdjustmentArgs Empty => new ElastigroupScalingDownPolicyStepAdjustmentArgs();
    }
}
