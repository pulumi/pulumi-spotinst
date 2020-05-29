// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class BeanstalkScheduledTaskGetArgs : Pulumi.ResourceArgs
    {
        [Input("adjustment")]
        public Input<string>? Adjustment { get; set; }

        [Input("adjustmentPercentage")]
        public Input<string>? AdjustmentPercentage { get; set; }

        /// <summary>
        /// Percent size of each batch
        /// </summary>
        [Input("batchSizePercentage")]
        public Input<string>? BatchSizePercentage { get; set; }

        [Input("cronExpression")]
        public Input<string>? CronExpression { get; set; }

        [Input("frequency")]
        public Input<string>? Frequency { get; set; }

        /// <summary>
        /// Amount of time to wait between batches
        /// </summary>
        [Input("gracePeriod")]
        public Input<string>? GracePeriod { get; set; }

        [Input("isEnabled")]
        public Input<bool>? IsEnabled { get; set; }

        [Input("maxCapacity")]
        public Input<string>? MaxCapacity { get; set; }

        [Input("minCapacity")]
        public Input<string>? MinCapacity { get; set; }

        [Input("scaleMaxCapacity")]
        public Input<string>? ScaleMaxCapacity { get; set; }

        [Input("scaleMinCapacity")]
        public Input<string>? ScaleMinCapacity { get; set; }

        [Input("scaleTargetCapacity")]
        public Input<string>? ScaleTargetCapacity { get; set; }

        [Input("startTime")]
        public Input<string>? StartTime { get; set; }

        [Input("targetCapacity")]
        public Input<string>? TargetCapacity { get; set; }

        [Input("taskType", required: true)]
        public Input<string> TaskType { get; set; } = null!;

        public BeanstalkScheduledTaskGetArgs()
        {
        }
    }
}