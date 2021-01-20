// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupScalingTargetPolicyArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Integer the amount of time, in seconds, after a scaling activity completes and before the next scaling activity can start. If this parameter is not specified, the default cooldown period for the group applies.
        /// </summary>
        [Input("cooldown")]
        public Input<int>? Cooldown { get; set; }

        [Input("dimensions")]
        private InputList<Inputs.ElastigroupScalingTargetPolicyDimensionArgs>? _dimensions;

        /// <summary>
        /// A list of dimensions describing qualities of the metric.
        /// </summary>
        public InputList<Inputs.ElastigroupScalingTargetPolicyDimensionArgs> Dimensions
        {
            get => _dimensions ?? (_dimensions = new InputList<Inputs.ElastigroupScalingTargetPolicyDimensionArgs>());
            set => _dimensions = value;
        }

        /// <summary>
        /// String, restrict the maximal number of instances which can be added in each scale-up action.
        /// </summary>
        [Input("maxCapacityPerScale")]
        public Input<string>? MaxCapacityPerScale { get; set; }

        /// <summary>
        /// String, the name of the metric, with or without spaces.
        /// </summary>
        [Input("metricName", required: true)]
        public Input<string> MetricName { get; set; } = null!;

        /// <summary>
        /// String, the namespace for the alarm's associated metric.
        /// </summary>
        [Input("namespace", required: true)]
        public Input<string> Namespace { get; set; } = null!;

        /// <summary>
        /// String, the name of the policy.
        /// </summary>
        [Input("policyName", required: true)]
        public Input<string> PolicyName { get; set; } = null!;

        /// <summary>
        /// Start a metric prediction process to determine the expected target metric value within the next two days. See [Predictive Autoscaling](https://api.spotinst.com/elastigroup-for-aws/concepts/scaling-concepts/predictive-autoscaling/) documentation for more info. Valid values: `FORECAST_AND_SCALE`, `FORECAST_ONLY`.
        /// </summary>
        [Input("predictiveMode")]
        public Input<string>? PredictiveMode { get; set; }

        /// <summary>
        /// String, the source of the metric. Valid values: `"cloudWatch"`, `"spectrum"`.
        /// </summary>
        [Input("source")]
        public Input<string>? Source { get; set; }

        /// <summary>
        /// String, the metric statistics to return. For information about specific statistics go to [Statistics](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/index.html?CHAP_TerminologyandKeyConcepts.html#Statistic) in the Amazon CloudWatch Developer Guide.
        /// </summary>
        [Input("statistic")]
        public Input<string>? Statistic { get; set; }

        /// <summary>
        /// The target number of instances to have in the group.
        /// </summary>
        [Input("target", required: true)]
        public Input<double> Target { get; set; } = null!;

        /// <summary>
        /// String, tThe unit for the alarm's associated metric. Valid values: `"percent`, `"seconds"`, `"microseconds"`, `"milliseconds"`, `"bytes"`, `"kilobytes"`, `"megabytes"`, `"gigabytes"`, `"terabytes"`, `"bits"`, `"kilobits"`, `"megabits"`, `"gigabits"`, `"terabits"`, `"count"`, `"bytes/second"`, `"kilobytes/second"`, `"megabytes/second"`, `"gigabytes/second"`, `"terabytes/second"`, `"bits/second"`, `"kilobits/second"`, `"megabits/second"`, `"gigabits/second"`, `"terabits/second"`, `"count/second"`, `"none"`.
        /// </summary>
        [Input("unit")]
        public Input<string>? Unit { get; set; }

        public ElastigroupScalingTargetPolicyArgs()
        {
        }
    }
}
