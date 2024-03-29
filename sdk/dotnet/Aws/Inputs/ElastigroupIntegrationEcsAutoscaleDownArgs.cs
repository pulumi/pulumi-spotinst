// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupIntegrationEcsAutoscaleDownArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of periods over which data is compared to the specified threshold.
        /// </summary>
        [Input("evaluationPeriods")]
        public Input<int>? EvaluationPeriods { get; set; }

        /// <summary>
        /// Represents the maximum percent to scale-down. Number between 1-100.
        /// </summary>
        [Input("maxScaleDownPercentage")]
        public Input<double>? MaxScaleDownPercentage { get; set; }

        public ElastigroupIntegrationEcsAutoscaleDownArgs()
        {
        }
        public static new ElastigroupIntegrationEcsAutoscaleDownArgs Empty => new ElastigroupIntegrationEcsAutoscaleDownArgs();
    }
}
