// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupIntegrationKubernetesAutoscaleDownArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// How many evaluation periods should accumulate before a scale down action takes place.
        /// </summary>
        [Input("evaluationPeriods")]
        public Input<int>? EvaluationPeriods { get; set; }

        public ElastigroupIntegrationKubernetesAutoscaleDownArgs()
        {
        }
    }
}
