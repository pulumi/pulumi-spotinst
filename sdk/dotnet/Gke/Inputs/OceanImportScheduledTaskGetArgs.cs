// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke.Inputs
{

    public sealed class OceanImportScheduledTaskGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Set shutdown hours for cluster object.
        /// </summary>
        [Input("shutdownHours")]
        public Input<Inputs.OceanImportScheduledTaskShutdownHoursGetArgs>? ShutdownHours { get; set; }

        [Input("tasks")]
        private InputList<Inputs.OceanImportScheduledTaskTaskGetArgs>? _tasks;

        /// <summary>
        /// The scheduling tasks for the cluster.
        /// </summary>
        public InputList<Inputs.OceanImportScheduledTaskTaskGetArgs> Tasks
        {
            get => _tasks ?? (_tasks = new InputList<Inputs.OceanImportScheduledTaskTaskGetArgs>());
            set => _tasks = value;
        }

        public OceanImportScheduledTaskGetArgs()
        {
        }
        public static new OceanImportScheduledTaskGetArgs Empty => new OceanImportScheduledTaskGetArgs();
    }
}
