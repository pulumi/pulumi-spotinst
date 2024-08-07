// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class OceanLaunchSpecStrategyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The configurable amount of time that Ocean will wait for the draining process to complete before terminating an instance. If you have not defined a draining timeout, the default of 300 seconds will be used.
        /// </summary>
        [Input("drainingTimeout")]
        public Input<int>? DrainingTimeout { get; set; }

        /// <summary>
        /// The desired percentage of the Spot instances out of all running instances for this VNG. Only available when the field is not set in the cluster directly (cluster.strategy.spotPercentage).
        /// </summary>
        [Input("spotPercentage")]
        public Input<int>? SpotPercentage { get; set; }

        public OceanLaunchSpecStrategyGetArgs()
        {
        }
        public static new OceanLaunchSpecStrategyGetArgs Empty => new OceanLaunchSpecStrategyGetArgs();
    }
}
