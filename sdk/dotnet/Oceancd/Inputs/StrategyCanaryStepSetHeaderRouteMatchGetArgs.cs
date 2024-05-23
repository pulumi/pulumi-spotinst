// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Inputs
{

    public sealed class StrategyCanaryStepSetHeaderRouteMatchGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the header.
        /// </summary>
        [Input("headerName", required: true)]
        public Input<string> HeaderName { get; set; } = null!;

        /// <summary>
        /// Defines a single header to add to the Rollout. Must be only one initialized from the following (exact, prefix, regex).
        /// </summary>
        [Input("headerValue", required: true)]
        public Input<Inputs.StrategyCanaryStepSetHeaderRouteMatchHeaderValueGetArgs> HeaderValue { get; set; } = null!;

        public StrategyCanaryStepSetHeaderRouteMatchGetArgs()
        {
        }
        public static new StrategyCanaryStepSetHeaderRouteMatchGetArgs Empty => new StrategyCanaryStepSetHeaderRouteMatchGetArgs();
    }
}
