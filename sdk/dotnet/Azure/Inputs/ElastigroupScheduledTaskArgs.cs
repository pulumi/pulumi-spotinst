// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Inputs
{

    public sealed class ElastigroupScheduledTaskArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Value to which the action type will be adjusted. Required if using `numeric` or `percentage_adjustment` action types.
        /// </summary>
        [Input("adjustment")]
        public Input<string>? Adjustment { get; set; }

        /// <summary>
        /// The percent of instances to add/remove to/from the target capacity when scale is needed.
        /// </summary>
        [Input("adjustmentPercentage")]
        public Input<string>? AdjustmentPercentage { get; set; }

        /// <summary>
        /// The percentage size of each batch in the scheduled deployment roll. Required when the 'task_type' is 'roll'.
        /// </summary>
        [Input("batchSizePercentage")]
        public Input<string>? BatchSizePercentage { get; set; }

        /// <summary>
        /// A valid cron expression (`* * * * *`). The cron is running in UTC time zone and is in Unix cron format Cron Expression Validator Script.
        /// </summary>
        [Input("cronExpression", required: true)]
        public Input<string> CronExpression { get; set; } = null!;

        /// <summary>
        /// Period of time (seconds) to wait for VM to reach healthiness before monitoring for unhealthiness.
        /// </summary>
        [Input("gracePeriod")]
        public Input<string>? GracePeriod { get; set; }

        /// <summary>
        /// Describes whether the task is enabled. When true the task should run when false it should not run.
        /// </summary>
        [Input("isEnabled")]
        public Input<bool>? IsEnabled { get; set; }

        /// <summary>
        /// The max capacity of the group. Required when ‘task_type' is ‘scale'.
        /// </summary>
        [Input("scaleMaxCapacity")]
        public Input<string>? ScaleMaxCapacity { get; set; }

        /// <summary>
        /// The min capacity of the group. Should be used when choosing ‘task_type' of ‘scale'.
        /// </summary>
        [Input("scaleMinCapacity")]
        public Input<string>? ScaleMinCapacity { get; set; }

        /// <summary>
        /// The target capacity of the group. Should be used when choosing ‘task_type' of ‘scale'.
        /// </summary>
        [Input("scaleTargetCapacity")]
        public Input<string>? ScaleTargetCapacity { get; set; }

        /// <summary>
        /// The task type to run. Valid Values: `backup_ami`, `scale`, `scaleUp`, `roll`, `statefulUpdateCapacity`, `statefulRecycle`.
        /// </summary>
        [Input("taskType", required: true)]
        public Input<string> TaskType { get; set; } = null!;

        public ElastigroupScheduledTaskArgs()
        {
        }
        public static new ElastigroupScheduledTaskArgs Empty => new ElastigroupScheduledTaskArgs();
    }
}
