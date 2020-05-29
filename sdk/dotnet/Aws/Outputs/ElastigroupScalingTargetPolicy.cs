// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Outputs
{

    [OutputType]
    public sealed class ElastigroupScalingTargetPolicy
    {
        public readonly int? Cooldown;
        public readonly ImmutableArray<Outputs.ElastigroupScalingTargetPolicyDimension> Dimensions;
        public readonly string MetricName;
        public readonly string Namespace;
        public readonly string PolicyName;
        public readonly string? PredictiveMode;
        public readonly string? Source;
        public readonly string? Statistic;
        public readonly double Target;
        public readonly string Unit;

        [OutputConstructor]
        private ElastigroupScalingTargetPolicy(
            int? cooldown,

            ImmutableArray<Outputs.ElastigroupScalingTargetPolicyDimension> dimensions,

            string metricName,

            string @namespace,

            string policyName,

            string? predictiveMode,

            string? source,

            string? statistic,

            double target,

            string unit)
        {
            Cooldown = cooldown;
            Dimensions = dimensions;
            MetricName = metricName;
            Namespace = @namespace;
            PolicyName = policyName;
            PredictiveMode = predictiveMode;
            Source = source;
            Statistic = statistic;
            Target = target;
            Unit = unit;
        }
    }
}