// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class OceanLaunchSpecSchedulingTaskGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A valid cron expression. For example : " * * * * * ". The cron job runs in UTC time and is in Unix cron format.
        /// </summary>
        [Input("cronExpression", required: true)]
        public Input<string> CronExpression { get; set; } = null!;

        /// <summary>
        /// Flag to enable or disable the shutdown hours mechanism. When False, the mechanism is deactivated, and the virtual node group remains in its current state.
        /// </summary>
        [Input("isEnabled", required: true)]
        public Input<bool> IsEnabled { get; set; } = null!;

        [Input("taskHeadrooms")]
        private InputList<Inputs.OceanLaunchSpecSchedulingTaskTaskHeadroomGetArgs>? _taskHeadrooms;

        /// <summary>
        /// The config of this scheduled task. Depends on the value of taskType.
        /// </summary>
        public InputList<Inputs.OceanLaunchSpecSchedulingTaskTaskHeadroomGetArgs> TaskHeadrooms
        {
            get => _taskHeadrooms ?? (_taskHeadrooms = new InputList<Inputs.OceanLaunchSpecSchedulingTaskTaskHeadroomGetArgs>());
            set => _taskHeadrooms = value;
        }

        /// <summary>
        /// The activity that you are scheduling. Valid values: "manualHeadroomUpdate".
        /// </summary>
        [Input("taskType", required: true)]
        public Input<string> TaskType { get; set; } = null!;

        public OceanLaunchSpecSchedulingTaskGetArgs()
        {
        }
        public static new OceanLaunchSpecSchedulingTaskGetArgs Empty => new OceanLaunchSpecSchedulingTaskGetArgs();
    }
}
