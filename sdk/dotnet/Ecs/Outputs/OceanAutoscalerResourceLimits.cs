// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Ecs.Outputs
{

    [OutputType]
    public sealed class OceanAutoscalerResourceLimits
    {
        /// <summary>
        /// The maximum memory in GiB units that can be allocated to the cluster.
        /// </summary>
        public readonly int? MaxMemoryGib;
        /// <summary>
        /// The maximum cpu in vCPU units that can be allocated to the cluster.
        /// </summary>
        public readonly int? MaxVcpu;

        [OutputConstructor]
        private OceanAutoscalerResourceLimits(
            int? maxMemoryGib,

            int? maxVcpu)
        {
            MaxMemoryGib = maxMemoryGib;
            MaxVcpu = maxVcpu;
        }
    }
}
