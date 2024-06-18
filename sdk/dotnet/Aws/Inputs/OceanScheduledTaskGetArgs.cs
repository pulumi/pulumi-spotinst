// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class OceanScheduledTaskGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Set shutdown hours for cluster object.
        /// </summary>
        [Input("shutdownHours")]
        public Input<Inputs.OceanScheduledTaskShutdownHoursGetArgs>? ShutdownHours { get; set; }

        [Input("tasks")]
        private InputList<Inputs.OceanScheduledTaskTaskGetArgs>? _tasks;

        /// <summary>
        /// The scheduling tasks for the cluster.
        /// </summary>
        public InputList<Inputs.OceanScheduledTaskTaskGetArgs> Tasks
        {
            get => _tasks ?? (_tasks = new InputList<Inputs.OceanScheduledTaskTaskGetArgs>());
            set => _tasks = value;
        }

        public OceanScheduledTaskGetArgs()
        {
        }
        public static new OceanScheduledTaskGetArgs Empty => new OceanScheduledTaskGetArgs();
    }
}
