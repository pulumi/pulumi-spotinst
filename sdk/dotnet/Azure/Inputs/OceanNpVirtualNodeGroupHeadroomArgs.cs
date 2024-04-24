// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Inputs
{

    public sealed class OceanNpVirtualNodeGroupHeadroomArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configure the number of CPUs to allocate the headroom. CPUs are denoted in millicores, where 1000 millicores = 1 vCPU.
        /// </summary>
        [Input("cpuPerUnit")]
        public Input<int>? CpuPerUnit { get; set; }

        /// <summary>
        /// Amount of GPU to allocate for headroom unit.
        /// </summary>
        [Input("gpuPerUnit")]
        public Input<int>? GpuPerUnit { get; set; }

        /// <summary>
        /// Configure the amount of memory (MiB) to allocate the headroom.
        /// </summary>
        [Input("memoryPerUnit")]
        public Input<int>? MemoryPerUnit { get; set; }

        /// <summary>
        /// The number of units to retain as headroom, where each unit has the defined headroom CPU and memory.
        /// </summary>
        [Input("numOfUnits")]
        public Input<int>? NumOfUnits { get; set; }

        public OceanNpVirtualNodeGroupHeadroomArgs()
        {
        }
        public static new OceanNpVirtualNodeGroupHeadroomArgs Empty => new OceanNpVirtualNodeGroupHeadroomArgs();
    }
}
