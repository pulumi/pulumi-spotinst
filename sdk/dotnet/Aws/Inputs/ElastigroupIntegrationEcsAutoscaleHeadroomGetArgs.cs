// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupIntegrationEcsAutoscaleHeadroomGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// How much CPU (MHz) to allocate for headroom unit.
        /// </summary>
        [Input("cpuPerUnit")]
        public Input<int>? CpuPerUnit { get; set; }

        /// <summary>
        /// How much Memory allocate for headroom unit.
        /// </summary>
        [Input("memoryPerUnit")]
        public Input<int>? MemoryPerUnit { get; set; }

        /// <summary>
        /// How many units of headroom to allocate.
        /// </summary>
        [Input("numOfUnits")]
        public Input<int>? NumOfUnits { get; set; }

        public ElastigroupIntegrationEcsAutoscaleHeadroomGetArgs()
        {
        }
    }
}
