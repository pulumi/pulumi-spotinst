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
    public sealed class OceanScheduledTaskTask
    {
        public readonly string CronExpression;
        public readonly bool IsEnabled;
        public readonly Outputs.OceanScheduledTaskTaskParameters? Parameters;
        public readonly string TaskType;

        [OutputConstructor]
        private OceanScheduledTaskTask(
            string cronExpression,

            bool isEnabled,

            Outputs.OceanScheduledTaskTaskParameters? parameters,

            string taskType)
        {
            CronExpression = cronExpression;
            IsEnabled = isEnabled;
            Parameters = parameters;
            TaskType = taskType;
        }
    }
}
