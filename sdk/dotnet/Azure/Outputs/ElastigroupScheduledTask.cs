// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Outputs
{

    [OutputType]
    public sealed class ElastigroupScheduledTask
    {
        /// <summary>
        /// The number of instances to add/remove to/from the target capacity when scale is needed.
        /// </summary>
        public readonly string? Adjustment;
        /// <summary>
        /// The percent of instances to add/remove to/from the target capacity when scale is needed.
        /// </summary>
        public readonly string? AdjustmentPercentage;
        /// <summary>
        /// Sets the percentage of the instances to deploy in each batch.
        /// </summary>
        public readonly string? BatchSizePercentage;
        /// <summary>
        /// A valid cron expression (`* * * * *`). The cron is running in UTC time zone and is in Unix cron format Cron Expression Validator Script.
        /// </summary>
        public readonly string CronExpression;
        /// <summary>
        /// Sets the grace period for new instances to become healthy.
        /// </summary>
        public readonly string? GracePeriod;
        /// <summary>
        /// Describes whether the task is enabled. When true the task should run when false it should not run.
        /// </summary>
        public readonly bool? IsEnabled;
        /// <summary>
        /// The max capacity of the group. Required when ‘task_type' is ‘scale'.
        /// </summary>
        public readonly string? ScaleMaxCapacity;
        /// <summary>
        /// The min capacity of the group. Should be used when choosing ‘task_type' of ‘scale'.
        /// </summary>
        public readonly string? ScaleMinCapacity;
        /// <summary>
        /// The target capacity of the group. Should be used when choosing ‘task_type' of ‘scale'.
        /// </summary>
        public readonly string? ScaleTargetCapacity;
        /// <summary>
        /// The task type to run. Valid Values: `backup_ami`, `scale`, `scaleUp`, `roll`, `statefulUpdateCapacity`, `statefulRecycle`.
        /// </summary>
        public readonly string TaskType;

        [OutputConstructor]
        private ElastigroupScheduledTask(
            string? adjustment,

            string? adjustmentPercentage,

            string? batchSizePercentage,

            string cronExpression,

            string? gracePeriod,

            bool? isEnabled,

            string? scaleMaxCapacity,

            string? scaleMinCapacity,

            string? scaleTargetCapacity,

            string taskType)
        {
            Adjustment = adjustment;
            AdjustmentPercentage = adjustmentPercentage;
            BatchSizePercentage = batchSizePercentage;
            CronExpression = cronExpression;
            GracePeriod = gracePeriod;
            IsEnabled = isEnabled;
            ScaleMaxCapacity = scaleMaxCapacity;
            ScaleMinCapacity = scaleMinCapacity;
            ScaleTargetCapacity = scaleTargetCapacity;
            TaskType = taskType;
        }
    }
}
