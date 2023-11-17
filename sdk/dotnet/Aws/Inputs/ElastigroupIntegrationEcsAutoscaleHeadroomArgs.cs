// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupIntegrationEcsAutoscaleHeadroomArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// How much CPU to allocate for headroom unit.
        /// </summary>
        [Input("cpuPerUnit")]
        public Input<int>? CpuPerUnit { get; set; }

        /// <summary>
        /// The amount of memory in each headroom unit. Measured in MiB.
        /// </summary>
        [Input("memoryPerUnit")]
        public Input<int>? MemoryPerUnit { get; set; }

        /// <summary>
        /// How many units to allocate for headroom unit.
        /// </summary>
        [Input("numOfUnits")]
        public Input<int>? NumOfUnits { get; set; }

        public ElastigroupIntegrationEcsAutoscaleHeadroomArgs()
        {
        }
        public static new ElastigroupIntegrationEcsAutoscaleHeadroomArgs Empty => new ElastigroupIntegrationEcsAutoscaleHeadroomArgs();
    }
}
