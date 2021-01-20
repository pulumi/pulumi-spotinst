// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke.Inputs
{

    public sealed class OceanImportScheduledTaskTaskGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Value in % to set size of batch in roll. Valid values are 0-100
        /// Example: 20.
        /// </summary>
        [Input("batchSizePercentage")]
        public Input<int>? BatchSizePercentage { get; set; }

        /// <summary>
        /// A valid cron expression. For example : " * * * * * ".The cron is running in UTC time zone and is in Unix cron format Cron Expression Validator Script. Only one of ‘frequency’ or ‘cronExpression’ should be used at a time. Required for cluster.scheduling.tasks object
        /// Example: 0 1 * * *
        /// </summary>
        [Input("cronExpression", required: true)]
        public Input<string> CronExpression { get; set; } = null!;

        /// <summary>
        /// Enable the Ocean Kubernetes Autoscaler.
        /// </summary>
        [Input("isEnabled", required: true)]
        public Input<bool> IsEnabled { get; set; } = null!;

        /// <summary>
        /// Valid values: "clusterRoll". Required for cluster.scheduling.tasks object.
        /// </summary>
        [Input("taskType", required: true)]
        public Input<string> TaskType { get; set; } = null!;

        public OceanImportScheduledTaskTaskGetArgs()
        {
        }
    }
}
