// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class MrScalarTerminationPolicyStatementArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of periods over which data is compared to the specified threshold.
        /// </summary>
        [Input("evaluationPeriods")]
        public Input<int>? EvaluationPeriods { get; set; }

        /// <summary>
        /// The name of the metric, with or without spaces.
        /// </summary>
        [Input("metricName", required: true)]
        public Input<string> MetricName { get; set; } = null!;

        /// <summary>
        /// The namespace for the metric.
        /// </summary>
        [Input("namespace", required: true)]
        public Input<string> Namespace { get; set; } = null!;

        /// <summary>
        /// The operator to use. Allowed values are : 'gt', 'gte', 'lt' , 'lte'.
        /// </summary>
        [Input("operator")]
        public Input<string>? Operator { get; set; }

        /// <summary>
        /// The granularity, in seconds, of the returned datapoints. Period must be at least 60 seconds and must be a multiple of 60.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// The metric statistics to return. For information about specific statistics go to [Statistics](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/index.html?CHAP_TerminologyandKeyConcepts.html#Statistic) in the Amazon CloudWatch Developer Guide.
        /// </summary>
        [Input("statistic")]
        public Input<string>? Statistic { get; set; }

        /// <summary>
        /// The value against which the specified statistic is compared.
        /// </summary>
        [Input("threshold", required: true)]
        public Input<double> Threshold { get; set; } = null!;

        /// <summary>
        /// The unit for the metric.
        /// </summary>
        [Input("unit")]
        public Input<string>? Unit { get; set; }

        public MrScalarTerminationPolicyStatementArgs()
        {
        }
        public static new MrScalarTerminationPolicyStatementArgs Empty => new MrScalarTerminationPolicyStatementArgs();
    }
}
