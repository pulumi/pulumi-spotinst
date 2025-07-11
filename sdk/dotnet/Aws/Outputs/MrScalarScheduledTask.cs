// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Outputs
{

    [OutputType]
    public sealed class MrScalarScheduledTask
    {
        /// <summary>
        /// A cron expression representing the schedule for the task.
        /// </summary>
        public readonly string Cron;
        /// <summary>
        /// New desired capacity for the elastigroup.
        /// </summary>
        public readonly string? DesiredCapacity;
        /// <summary>
        /// Select the EMR instance groups to execute the scheduled task on. Valid values: `task`.
        /// </summary>
        public readonly string InstanceGroupType;
        /// <summary>
        /// Enable/Disable the specified scheduling task.
        /// </summary>
        public readonly bool? IsEnabled;
        /// <summary>
        /// New max capacity for the elastigroup.
        /// </summary>
        public readonly string? MaxCapacity;
        /// <summary>
        /// New min capacity for the elastigroup.
        /// </summary>
        public readonly string? MinCapacity;
        /// <summary>
        /// The type of task to be scheduled. Valid values: `setCapacity`.
        /// </summary>
        public readonly string TaskType;

        [OutputConstructor]
        private MrScalarScheduledTask(
            string cron,

            string? desiredCapacity,

            string instanceGroupType,

            bool? isEnabled,

            string? maxCapacity,

            string? minCapacity,

            string taskType)
        {
            Cron = cron;
            DesiredCapacity = desiredCapacity;
            InstanceGroupType = instanceGroupType;
            IsEnabled = isEnabled;
            MaxCapacity = maxCapacity;
            MinCapacity = minCapacity;
            TaskType = taskType;
        }
    }
}
