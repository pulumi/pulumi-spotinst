// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class OceanAutoscalerAutoscaleDownGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of evaluation periods that should accumulate before a scale down action takes place.
        /// </summary>
        [Input("evaluationPeriods")]
        public Input<int>? EvaluationPeriods { get; set; }

        /// <summary>
        /// Would represent the maximum % to scale-down. Number between 1-100.
        /// </summary>
        [Input("maxScaleDownPercentage")]
        public Input<int>? MaxScaleDownPercentage { get; set; }

        public OceanAutoscalerAutoscaleDownGetArgs()
        {
        }
    }
}
