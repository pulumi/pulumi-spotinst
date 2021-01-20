// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gcp.Inputs
{

    public sealed class ElastigroupIntegrationGkeAutoscaleDownArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Number of consecutive periods in which the threshold must be met in order to trigger a scaling action.
        /// </summary>
        [Input("evaluationPeriods")]
        public Input<int>? EvaluationPeriods { get; set; }

        public ElastigroupIntegrationGkeAutoscaleDownArgs()
        {
        }
    }
}
