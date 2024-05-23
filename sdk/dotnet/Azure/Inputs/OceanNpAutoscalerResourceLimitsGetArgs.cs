// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Inputs
{

    public sealed class OceanNpAutoscalerResourceLimitsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The maximum memory in GiB units that can be allocated to the cluster.
        /// </summary>
        [Input("maxMemoryGib")]
        public Input<int>? MaxMemoryGib { get; set; }

        /// <summary>
        /// The maximum cpu in vCpu units that can be allocated to the cluster.
        /// </summary>
        [Input("maxVcpu")]
        public Input<int>? MaxVcpu { get; set; }

        public OceanNpAutoscalerResourceLimitsGetArgs()
        {
        }
        public static new OceanNpAutoscalerResourceLimitsGetArgs Empty => new OceanNpAutoscalerResourceLimitsGetArgs();
    }
}
