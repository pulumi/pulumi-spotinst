// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gcp.Inputs
{

    public sealed class ElastigroupScheduledTaskGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A valid cron expression. The cron is running in UTC time zone and is in [Unix cron format](https://en.wikipedia.org/wiki/Cron).
        /// </summary>
        [Input("cronExpression")]
        public Input<string>? CronExpression { get; set; }

        /// <summary>
        /// Setting the task to being enabled or disabled.
        /// </summary>
        [Input("isEnabled")]
        public Input<bool>? IsEnabled { get; set; }

        /// <summary>
        /// The maximum number of instances the group should have.
        /// 
        /// Usage:
        /// </summary>
        [Input("maxCapacity")]
        public Input<string>? MaxCapacity { get; set; }

        /// <summary>
        /// The minimum number of instances the group should have.
        /// </summary>
        [Input("minCapacity")]
        public Input<string>? MinCapacity { get; set; }

        /// <summary>
        /// The desired number of instances the group should have.
        /// </summary>
        [Input("targetCapacity")]
        public Input<string>? TargetCapacity { get; set; }

        /// <summary>
        /// The task type to run. Valid values: `"setCapacity"`.
        /// </summary>
        [Input("taskType", required: true)]
        public Input<string> TaskType { get; set; } = null!;

        public ElastigroupScheduledTaskGetArgs()
        {
        }
        public static new ElastigroupScheduledTaskGetArgs Empty => new ElastigroupScheduledTaskGetArgs();
    }
}
