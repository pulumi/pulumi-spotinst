// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Inputs
{

    public sealed class OceanAutoscalerAutoscaleHeadroomArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Automatic headroom configuration.
        /// </summary>
        [Input("automatic")]
        public Input<Inputs.OceanAutoscalerAutoscaleHeadroomAutomaticArgs>? Automatic { get; set; }

        public OceanAutoscalerAutoscaleHeadroomArgs()
        {
        }
        public static new OceanAutoscalerAutoscaleHeadroomArgs Empty => new OceanAutoscalerAutoscaleHeadroomArgs();
    }
}
