// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupIntegrationEcsAutoscaleHeadroomGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Cpu units for compute.
        /// </summary>
        [Input("cpuPerUnit")]
        public Input<int>? CpuPerUnit { get; set; }

        /// <summary>
        /// RAM units for compute.
        /// </summary>
        [Input("memoryPerUnit")]
        public Input<int>? MemoryPerUnit { get; set; }

        /// <summary>
        /// Amount of units for compute.
        /// </summary>
        [Input("numOfUnits")]
        public Input<int>? NumOfUnits { get; set; }

        public ElastigroupIntegrationEcsAutoscaleHeadroomGetArgs()
        {
        }
        public static new ElastigroupIntegrationEcsAutoscaleHeadroomGetArgs Empty => new ElastigroupIntegrationEcsAutoscaleHeadroomGetArgs();
    }
}
