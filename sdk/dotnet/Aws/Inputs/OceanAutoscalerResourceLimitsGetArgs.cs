// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class OceanAutoscalerResourceLimitsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("maxMemoryGib")]
        public Input<int>? MaxMemoryGib { get; set; }

        [Input("maxVcpu")]
        public Input<int>? MaxVcpu { get; set; }

        public OceanAutoscalerResourceLimitsGetArgs()
        {
        }
        public static new OceanAutoscalerResourceLimitsGetArgs Empty => new OceanAutoscalerResourceLimitsGetArgs();
    }
}
