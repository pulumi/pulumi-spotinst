// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ManagedInstanceScheduledTaskArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A valid cron expression. For example: " * * * * * ". The cron is running in UTC time zone and is in Unix cron format Cron Expression Validator Script. Only one of ‘frequency’ or ‘cronExpression’ should be used at a time.
        /// Example: 0 1 * * *
        /// </summary>
        [Input("cronExpression")]
        public Input<string>? CronExpression { get; set; }

        /// <summary>
        /// Set frequency for the task. Valid values: "hourly", "daily", "weekly", "continuous".
        /// </summary>
        [Input("frequency")]
        public Input<string>? Frequency { get; set; }

        /// <summary>
        /// Describes whether the task is enabled. When true the task should run when false it should not run.
        /// </summary>
        [Input("isEnabled")]
        public Input<bool>? IsEnabled { get; set; }

        /// <summary>
        /// DATETIME in ISO-8601 format. Sets a start time for scheduled actions. If "frequency" or "cronExpression" are not used - the task will run only once at the start time and will then be deleted from the instance configuration.
        /// Example: 2019-05-23T10:55:09Z
        /// </summary>
        [Input("startTime")]
        public Input<string>? StartTime { get; set; }

        /// <summary>
        /// The task type to run. Valid values: "pause", "resume", "recycle".
        /// </summary>
        [Input("taskType", required: true)]
        public Input<string> TaskType { get; set; } = null!;

        public ManagedInstanceScheduledTaskArgs()
        {
        }
    }
}
