// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupIntegrationNomadAutoscaleHeadroomArgs : Pulumi.ResourceArgs
    {
        [Input("cpuPerUnit")]
        public Input<int>? CpuPerUnit { get; set; }

        [Input("memoryPerUnit")]
        public Input<int>? MemoryPerUnit { get; set; }

        [Input("numOfUnits")]
        public Input<int>? NumOfUnits { get; set; }

        public ElastigroupIntegrationNomadAutoscaleHeadroomArgs()
        {
        }
    }
}
