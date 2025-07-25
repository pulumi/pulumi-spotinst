// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke.Inputs
{

    public sealed class OceanImportScheduledTaskTaskGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A valid cron expression. For example : " * * * * * ".The cron is running in UTC time zone and is in Unix cron format Cron Expression Validator Script. Only one of ‘frequency’ or ‘cronExpression’ should be used at a time. Required for cluster.scheduling.tasks object
        /// Example: 0 1 * * *
        /// </summary>
        [Input("cronExpression", required: true)]
        public Input<string> CronExpression { get; set; } = null!;

        /// <summary>
        /// Describes whether the task is enabled. When true the task should run when false it should not run. Required for cluster.scheduling.tasks object.
        /// </summary>
        [Input("isEnabled", required: true)]
        public Input<bool> IsEnabled { get; set; } = null!;

        /// <summary>
        /// The scheduling parameters for the cluster.
        /// </summary>
        [Input("taskParameters")]
        public Input<Inputs.OceanImportScheduledTaskTaskTaskParametersGetArgs>? TaskParameters { get; set; }

        /// <summary>
        /// Valid values: "clusterRoll". Required for cluster.scheduling.tasks object.
        /// </summary>
        [Input("taskType", required: true)]
        public Input<string> TaskType { get; set; } = null!;

        public OceanImportScheduledTaskTaskGetArgs()
        {
        }
        public static new OceanImportScheduledTaskTaskGetArgs Empty => new OceanImportScheduledTaskTaskGetArgs();
    }
}
