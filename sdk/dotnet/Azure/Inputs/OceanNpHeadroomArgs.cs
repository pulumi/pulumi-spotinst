// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Inputs
{

    public sealed class OceanNpHeadroomArgs : global::Pulumi.ResourceArgs
    {
        [Input("cpuPerUnit")]
        public Input<int>? CpuPerUnit { get; set; }

        [Input("gpuPerUnit")]
        public Input<int>? GpuPerUnit { get; set; }

        [Input("memoryPerUnit")]
        public Input<int>? MemoryPerUnit { get; set; }

        [Input("numOfUnits")]
        public Input<int>? NumOfUnits { get; set; }

        public OceanNpHeadroomArgs()
        {
        }
        public static new OceanNpHeadroomArgs Empty => new OceanNpHeadroomArgs();
    }
}
