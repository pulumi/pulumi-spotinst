// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class OceanAutoscalerAutoscaleDownGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("evaluationPeriods")]
        public Input<int>? EvaluationPeriods { get; set; }

        [Input("maxScaleDownPercentage")]
        public Input<double>? MaxScaleDownPercentage { get; set; }

        public OceanAutoscalerAutoscaleDownGetArgs()
        {
        }
        public static new OceanAutoscalerAutoscaleDownGetArgs Empty => new OceanAutoscalerAutoscaleDownGetArgs();
    }
}
