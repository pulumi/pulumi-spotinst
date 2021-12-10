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
    public sealed class OceanLaunchSpecSchedulingTask
    {
        /// <summary>
        /// A valid cron expression. For example : " * * * * * ". The cron job runs in UTC time and is in Unix cron format.
        /// </summary>
        public readonly string CronExpression;
        /// <summary>
        /// Describes whether the task is enabled. When True, the task runs. When False, it does not run.
        /// </summary>
        public readonly bool IsEnabled;
        /// <summary>
        /// The config of this scheduled task. Depends on the value of taskType.
        /// </summary>
        public readonly ImmutableArray<Outputs.OceanLaunchSpecSchedulingTaskTaskHeadroom> TaskHeadrooms;
        /// <summary>
        /// The activity that you are scheduling. Valid values: "manualHeadroomUpdate".
        /// </summary>
        public readonly string TaskType;

        [OutputConstructor]
        private OceanLaunchSpecSchedulingTask(
            string cronExpression,

            bool isEnabled,

            ImmutableArray<Outputs.OceanLaunchSpecSchedulingTaskTaskHeadroom> taskHeadrooms,

            string taskType)
        {
            CronExpression = cronExpression;
            IsEnabled = isEnabled;
            TaskHeadrooms = taskHeadrooms;
            TaskType = taskType;
        }
    }
}