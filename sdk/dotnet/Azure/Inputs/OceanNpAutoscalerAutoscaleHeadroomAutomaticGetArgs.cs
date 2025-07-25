// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Inputs
{

    public sealed class OceanNpAutoscalerAutoscaleHeadroomAutomaticGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable automatic headroom. When set to `true`, Ocean configures and optimizes headroom automatically.
        /// </summary>
        [Input("isEnabled")]
        public Input<bool>? IsEnabled { get; set; }

        /// <summary>
        /// Optionally set a number between 0-100 to control the percentage of total cluster resources dedicated to headroom.
        /// </summary>
        [Input("percentage")]
        public Input<int>? Percentage { get; set; }

        public OceanNpAutoscalerAutoscaleHeadroomAutomaticGetArgs()
        {
        }
        public static new OceanNpAutoscalerAutoscaleHeadroomAutomaticGetArgs Empty => new OceanNpAutoscalerAutoscaleHeadroomAutomaticGetArgs();
    }
}
