// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Outputs
{

    [OutputType]
    public sealed class RolloutSpecTrafficSmi
    {
        /// <summary>
        /// Holds the name of service that clients use to communicate.
        /// </summary>
        public readonly string? SmiRootService;
        /// <summary>
        /// Holds the name of the TrafficSplit.
        /// </summary>
        public readonly string? TrafficSplitName;

        [OutputConstructor]
        private RolloutSpecTrafficSmi(
            string? smiRootService,

            string? trafficSplitName)
        {
            SmiRootService = smiRootService;
            TrafficSplitName = trafficSplitName;
        }
    }
}