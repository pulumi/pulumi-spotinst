// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke.Inputs
{

    public sealed class OceanLaunchSpecAutoscaleHeadroomsAutomaticArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Number between 0-200 to control the headroom %!o(MISSING)f the specific Virtual Node Group. Effective when cluster.autoScaler.headroom.automatic.`is_enabled` = true is set on the Ocean cluster.
        /// </summary>
        [Input("autoHeadroomPercentage")]
        public Input<int>? AutoHeadroomPercentage { get; set; }

        public OceanLaunchSpecAutoscaleHeadroomsAutomaticArgs()
        {
        }
        public static new OceanLaunchSpecAutoscaleHeadroomsAutomaticArgs Empty => new OceanLaunchSpecAutoscaleHeadroomsAutomaticArgs();
    }
}
