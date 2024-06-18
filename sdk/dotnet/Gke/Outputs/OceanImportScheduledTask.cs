// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke.Outputs
{

    [OutputType]
    public sealed class OceanImportScheduledTask
    {
        /// <summary>
        /// Set shutdown hours for cluster object.
        /// </summary>
        public readonly Outputs.OceanImportScheduledTaskShutdownHours? ShutdownHours;
        /// <summary>
        /// The scheduling tasks for the cluster.
        /// </summary>
        public readonly ImmutableArray<Outputs.OceanImportScheduledTaskTask> Tasks;

        [OutputConstructor]
        private OceanImportScheduledTask(
            Outputs.OceanImportScheduledTaskShutdownHours? shutdownHours,

            ImmutableArray<Outputs.OceanImportScheduledTaskTask> tasks)
        {
            ShutdownHours = shutdownHours;
            Tasks = tasks;
        }
    }
}
