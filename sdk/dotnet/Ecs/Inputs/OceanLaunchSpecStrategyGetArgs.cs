// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Ecs.Inputs
{

    public sealed class OceanLaunchSpecStrategyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// When set, Ocean will proactively try to maintain as close as possible to the percentage of Spot instances out of all the Virtual Node Group instances.
        /// </summary>
        [Input("spotPercentage")]
        public Input<int>? SpotPercentage { get; set; }

        public OceanLaunchSpecStrategyGetArgs()
        {
        }
        public static new OceanLaunchSpecStrategyGetArgs Empty => new OceanLaunchSpecStrategyGetArgs();
    }
}
