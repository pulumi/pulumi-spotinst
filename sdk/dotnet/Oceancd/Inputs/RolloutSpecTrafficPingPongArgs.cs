// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Inputs
{

    public sealed class RolloutSpecTrafficPingPongArgs : global::Pulumi.ResourceArgs
    {
        [Input("pingService", required: true)]
        public Input<string> PingService { get; set; } = null!;

        [Input("pongService", required: true)]
        public Input<string> PongService { get; set; } = null!;

        public RolloutSpecTrafficPingPongArgs()
        {
        }
        public static new RolloutSpecTrafficPingPongArgs Empty => new RolloutSpecTrafficPingPongArgs();
    }
}
