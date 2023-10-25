// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class BeanstalkScheduledTaskArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of instances to add or remove.
        /// </summary>
        [Input("adjustment")]
        public Input<string>? Adjustment { get; set; }

        /// <summary>
        /// The percentage of instances to add or remove.
        /// 
        /// Usage:
        /// </summary>
        [Input("adjustmentPercentage")]
        public Input<string>? AdjustmentPercentage { get; set; }

        /// <summary>
        /// The percentage size of each batch in the scheduled deployment roll.
        /// </summary>
        [Input("batchSizePercentage")]
        public Input<string>? BatchSizePercentage { get; set; }

        /// <summary>
        /// A valid cron expression. The cron is running in UTC time zone and is in [Unix cron format](https://en.wikipedia.org/wiki/Cron).
        /// </summary>
        [Input("cronExpression")]
        public Input<string>? CronExpression { get; set; }

        /// <summary>
        /// The recurrence frequency to run this task. Supported values are `"hourly"`, `"daily"`, `"weekly"` and `"continuous"`.
        /// </summary>
        [Input("frequency")]
        public Input<string>? Frequency { get; set; }

        /// <summary>
        /// The period of time (seconds) to wait before checking a batch's health after it's deployment.
        /// </summary>
        [Input("gracePeriod")]
        public Input<string>? GracePeriod { get; set; }

        /// <summary>
        /// Setting the task to being enabled or disabled.
        /// </summary>
        [Input("isEnabled")]
        public Input<bool>? IsEnabled { get; set; }

        /// <summary>
        /// The maximum number of instances the group should have.
        /// </summary>
        [Input("maxCapacity")]
        public Input<string>? MaxCapacity { get; set; }

        /// <summary>
        /// The minimum number of instances the group should have.
        /// </summary>
        [Input("minCapacity")]
        public Input<string>? MinCapacity { get; set; }

        /// <summary>
        /// The maximum number of instances the group should have.
        /// </summary>
        [Input("scaleMaxCapacity")]
        public Input<string>? ScaleMaxCapacity { get; set; }

        /// <summary>
        /// The minimum number of instances the group should have.
        /// </summary>
        [Input("scaleMinCapacity")]
        public Input<string>? ScaleMinCapacity { get; set; }

        /// <summary>
        /// The desired number of instances the group should have.
        /// </summary>
        [Input("scaleTargetCapacity")]
        public Input<string>? ScaleTargetCapacity { get; set; }

        /// <summary>
        /// Set a start time for one time tasks.
        /// </summary>
        [Input("startTime")]
        public Input<string>? StartTime { get; set; }

        /// <summary>
        /// The desired number of instances the group should have.
        /// </summary>
        [Input("targetCapacity")]
        public Input<string>? TargetCapacity { get; set; }

        /// <summary>
        /// The task type to run. Supported task types are: `"scale"`, `"backup_ami"`, `"roll"`, `"scaleUp"`, `"percentageScaleUp"`, `"scaleDown"`, `"percentageScaleDown"`, `"statefulUpdateCapacity"`.
        /// </summary>
        [Input("taskType", required: true)]
        public Input<string> TaskType { get; set; } = null!;

        public BeanstalkScheduledTaskArgs()
        {
        }
        public static new BeanstalkScheduledTaskArgs Empty => new BeanstalkScheduledTaskArgs();
    }
}
