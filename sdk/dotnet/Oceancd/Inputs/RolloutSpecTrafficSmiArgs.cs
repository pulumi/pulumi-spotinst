// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Inputs
{

    public sealed class RolloutSpecTrafficSmiArgs : global::Pulumi.ResourceArgs
    {
        [Input("smiRootService")]
        public Input<string>? SmiRootService { get; set; }

        [Input("trafficSplitName")]
        public Input<string>? TrafficSplitName { get; set; }

        public RolloutSpecTrafficSmiArgs()
        {
        }
        public static new RolloutSpecTrafficSmiArgs Empty => new RolloutSpecTrafficSmiArgs();
    }
}
