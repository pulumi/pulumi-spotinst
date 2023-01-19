// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Ecs.Inputs
{

    public sealed class OceanScheduledTaskShutdownHoursGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable the Ocean ECS autoscaler.
        /// </summary>
        [Input("isEnabled")]
        public Input<bool>? IsEnabled { get; set; }

        [Input("timeWindows", required: true)]
        private InputList<string>? _timeWindows;

        /// <summary>
        /// Array of strings. Set time windows for image update, at least one time window. Each string is in the format of ddd:hh:mm-ddd:hh:mm ddd. Time windows should not overlap.
        /// </summary>
        public InputList<string> TimeWindows
        {
            get => _timeWindows ?? (_timeWindows = new InputList<string>());
            set => _timeWindows = value;
        }

        public OceanScheduledTaskShutdownHoursGetArgs()
        {
        }
        public static new OceanScheduledTaskShutdownHoursGetArgs Empty => new OceanScheduledTaskShutdownHoursGetArgs();
    }
}
