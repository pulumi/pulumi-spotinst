// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Inputs
{

    public sealed class OceanRightSizingRuleRecommendationApplicationIntervalMonthlyRepetitionBaseWeeklyRepetitionBaseArgs : global::Pulumi.ResourceArgs
    {
        [Input("intervalDays", required: true)]
        private InputList<string>? _intervalDays;
        public InputList<string> IntervalDays
        {
            get => _intervalDays ?? (_intervalDays = new InputList<string>());
            set => _intervalDays = value;
        }

        [Input("intervalHoursEndTime", required: true)]
        public Input<string> IntervalHoursEndTime { get; set; } = null!;

        [Input("intervalHoursStartTime", required: true)]
        public Input<string> IntervalHoursStartTime { get; set; } = null!;

        public OceanRightSizingRuleRecommendationApplicationIntervalMonthlyRepetitionBaseWeeklyRepetitionBaseArgs()
        {
        }
        public static new OceanRightSizingRuleRecommendationApplicationIntervalMonthlyRepetitionBaseWeeklyRepetitionBaseArgs Empty => new OceanRightSizingRuleRecommendationApplicationIntervalMonthlyRepetitionBaseWeeklyRepetitionBaseArgs();
    }
}