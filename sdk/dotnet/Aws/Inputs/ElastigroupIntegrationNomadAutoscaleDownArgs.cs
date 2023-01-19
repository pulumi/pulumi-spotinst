// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupIntegrationNomadAutoscaleDownArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of periods over which data is compared to the specified threshold.
        /// </summary>
        [Input("evaluationPeriods")]
        public Input<int>? EvaluationPeriods { get; set; }

        public ElastigroupIntegrationNomadAutoscaleDownArgs()
        {
        }
        public static new ElastigroupIntegrationNomadAutoscaleDownArgs Empty => new ElastigroupIntegrationNomadAutoscaleDownArgs();
    }
}
