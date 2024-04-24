// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Outputs
{

    [OutputType]
    public sealed class OceanNpScheduling
    {
        /// <summary>
        /// [Shutdown Hours](https://docs.spot.io/ocean/features/running-hours?id=shutdown-hours)An object used to specify times that the nodes in the cluster will be taken down.
        /// </summary>
        public readonly Outputs.OceanNpSchedulingShutdownHours? ShutdownHours;

        [OutputConstructor]
        private OceanNpScheduling(Outputs.OceanNpSchedulingShutdownHours? shutdownHours)
        {
            ShutdownHours = shutdownHours;
        }
    }
}
