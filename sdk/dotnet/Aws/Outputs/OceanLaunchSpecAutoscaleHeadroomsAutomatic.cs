// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Outputs
{

    [OutputType]
    public sealed class OceanLaunchSpecAutoscaleHeadroomsAutomatic
    {
        /// <summary>
        /// Number between 0-200 to control the headroom %!o(MISSING)f the specific Virtual Node Group. Effective when cluster.autoScaler.headroom.automatic.`is_enabled` = true is set on the Ocean cluster.
        /// </summary>
        public readonly int? AutoHeadroomPercentage;

        [OutputConstructor]
        private OceanLaunchSpecAutoscaleHeadroomsAutomatic(int? autoHeadroomPercentage)
        {
            AutoHeadroomPercentage = autoHeadroomPercentage;
        }
    }
}
