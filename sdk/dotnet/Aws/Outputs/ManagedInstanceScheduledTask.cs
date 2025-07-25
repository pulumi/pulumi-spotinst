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
    public sealed class ManagedInstanceScheduledTask
    {
        public readonly string? CronExpression;
        public readonly string? Frequency;
        public readonly bool? IsEnabled;
        public readonly string? StartTime;
        public readonly string TaskType;

        [OutputConstructor]
        private ManagedInstanceScheduledTask(
            string? cronExpression,

            string? frequency,

            bool? isEnabled,

            string? startTime,

            string taskType)
        {
            CronExpression = cronExpression;
            Frequency = frequency;
            IsEnabled = isEnabled;
            StartTime = startTime;
            TaskType = taskType;
        }
    }
}
