// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke.Inputs
{

    public sealed class ElastigroupInstanceTypesCustomArgs : Pulumi.ResourceArgs
    {
        [Input("memoryGib", required: true)]
        public Input<int> MemoryGib { get; set; } = null!;

        [Input("vcpu", required: true)]
        public Input<int> Vcpu { get; set; } = null!;

        public ElastigroupInstanceTypesCustomArgs()
        {
        }
    }
}