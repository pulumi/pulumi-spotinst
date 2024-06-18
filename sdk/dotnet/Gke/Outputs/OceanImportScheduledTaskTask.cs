// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke.Outputs
{

    [OutputType]
    public sealed class OceanImportScheduledTaskTask
    {
        /// <summary>
        /// A valid cron expression. For example : " * * * * * ".The cron is running in UTC time zone and is in Unix cron format Cron Expression Validator Script. Only one of ‘frequency’ or ‘cronExpression’ should be used at a time. Required for cluster.scheduling.tasks object
        /// Example: 0 1 * * *
        /// </summary>
        public readonly string CronExpression;
        /// <summary>
        /// Describes whether the task is enabled. When true the task should run when false it should not run. Required for cluster.scheduling.tasks object.
        /// </summary>
        public readonly bool IsEnabled;
        /// <summary>
        /// The scheduling parameters for the cluster.
        /// </summary>
        public readonly Outputs.OceanImportScheduledTaskTaskTaskParameters? TaskParameters;
        /// <summary>
        /// Valid values: "clusterRoll". Required for cluster.scheduling.tasks object.
        /// </summary>
        public readonly string TaskType;

        [OutputConstructor]
        private OceanImportScheduledTaskTask(
            string cronExpression,

            bool isEnabled,

            Outputs.OceanImportScheduledTaskTaskTaskParameters? taskParameters,

            string taskType)
        {
            CronExpression = cronExpression;
            IsEnabled = isEnabled;
            TaskParameters = taskParameters;
            TaskType = taskType;
        }
    }
}
