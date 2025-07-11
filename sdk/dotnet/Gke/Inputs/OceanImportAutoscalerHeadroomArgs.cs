// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke.Inputs
{

    public sealed class OceanImportAutoscalerHeadroomArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optionally configure the number of CPUs to allocate the headroom. CPUs are denoted in millicores, where 1000 millicores = 1 vCPU.
        /// </summary>
        [Input("cpuPerUnit")]
        public Input<int>? CpuPerUnit { get; set; }

        /// <summary>
        /// How much GPU allocate for headroom unit.
        /// </summary>
        [Input("gpuPerUnit")]
        public Input<int>? GpuPerUnit { get; set; }

        /// <summary>
        /// Optionally configure the amount of memory (MiB) to allocate the headroom.
        /// </summary>
        [Input("memoryPerUnit")]
        public Input<int>? MemoryPerUnit { get; set; }

        /// <summary>
        /// The number of units to retain as headroom, where each unit has the defined headroom CPU and memory.
        /// </summary>
        [Input("numOfUnits")]
        public Input<int>? NumOfUnits { get; set; }

        public OceanImportAutoscalerHeadroomArgs()
        {
        }
        public static new OceanImportAutoscalerHeadroomArgs Empty => new OceanImportAutoscalerHeadroomArgs();
    }
}
