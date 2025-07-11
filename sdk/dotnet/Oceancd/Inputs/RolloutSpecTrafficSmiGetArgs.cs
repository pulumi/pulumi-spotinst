// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Inputs
{

    public sealed class RolloutSpecTrafficSmiGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Holds the name of service that clients use to communicate.
        /// </summary>
        [Input("smiRootService")]
        public Input<string>? SmiRootService { get; set; }

        /// <summary>
        /// Holds the name of the TrafficSplit.
        /// </summary>
        [Input("trafficSplitName")]
        public Input<string>? TrafficSplitName { get; set; }

        public RolloutSpecTrafficSmiGetArgs()
        {
        }
        public static new RolloutSpecTrafficSmiGetArgs Empty => new RolloutSpecTrafficSmiGetArgs();
    }
}
