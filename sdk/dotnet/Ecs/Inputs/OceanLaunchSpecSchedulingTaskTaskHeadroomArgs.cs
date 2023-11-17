// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Ecs.Inputs
{

    public sealed class OceanLaunchSpecSchedulingTaskTaskHeadroomArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optionally configure the number of CPUs to allocate for each headroom unit. CPUs are denoted in CPU units, where 1024 units = 1 vCPU.
        /// </summary>
        [Input("cpuPerUnit")]
        public Input<int>? CpuPerUnit { get; set; }

        /// <summary>
        /// Optionally configure the amount of memory (MiB) to allocate for each headroom unit.
        /// </summary>
        [Input("memoryPerUnit")]
        public Input<int>? MemoryPerUnit { get; set; }

        /// <summary>
        /// The number of units to retain as headroom, where each unit has the defined headroom CPU and memory.
        /// </summary>
        [Input("numOfUnits", required: true)]
        public Input<int> NumOfUnits { get; set; } = null!;

        public OceanLaunchSpecSchedulingTaskTaskHeadroomArgs()
        {
        }
        public static new OceanLaunchSpecSchedulingTaskTaskHeadroomArgs Empty => new OceanLaunchSpecSchedulingTaskTaskHeadroomArgs();
    }
}
