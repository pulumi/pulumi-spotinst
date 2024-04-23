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
        public readonly Outputs.OceanImportScheduledTaskShutdownHours? ShutdownHours;
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
