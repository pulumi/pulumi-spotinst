// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class MrScalarScheduledTaskArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A cron expression representing the schedule for the task.
        /// </summary>
        [Input("cron", required: true)]
        public Input<string> Cron { get; set; } = null!;

        /// <summary>
        /// New desired capacity for the elastigroup.
        /// </summary>
        [Input("desiredCapacity")]
        public Input<string>? DesiredCapacity { get; set; }

        /// <summary>
        /// Select the EMR instance groups to execute the scheduled task on. Valid values: `task`.
        /// </summary>
        [Input("instanceGroupType", required: true)]
        public Input<string> InstanceGroupType { get; set; } = null!;

        /// <summary>
        /// Enable/Disable the specified scheduling task.
        /// </summary>
        [Input("isEnabled")]
        public Input<bool>? IsEnabled { get; set; }

        /// <summary>
        /// New max capacity for the elastigroup.
        /// </summary>
        [Input("maxCapacity")]
        public Input<string>? MaxCapacity { get; set; }

        /// <summary>
        /// New min capacity for the elastigroup.
        /// </summary>
        [Input("minCapacity")]
        public Input<string>? MinCapacity { get; set; }

        /// <summary>
        /// The type of task to be scheduled. Valid values: `setCapacity`.
        /// </summary>
        [Input("taskType", required: true)]
        public Input<string> TaskType { get; set; } = null!;

        public MrScalarScheduledTaskArgs()
        {
        }
        public static new MrScalarScheduledTaskArgs Empty => new MrScalarScheduledTaskArgs();
    }
}
