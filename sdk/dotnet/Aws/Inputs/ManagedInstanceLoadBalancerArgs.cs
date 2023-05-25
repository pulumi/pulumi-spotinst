// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ManagedInstanceLoadBalancerArgs : global::Pulumi.ResourceArgs
    {
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        [Input("autoWeight")]
        public Input<bool>? AutoWeight { get; set; }

        [Input("azAwareness")]
        public Input<bool>? AzAwareness { get; set; }

        [Input("balancerId")]
        public Input<string>? BalancerId { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("targetSetId")]
        public Input<string>? TargetSetId { get; set; }

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public ManagedInstanceLoadBalancerArgs()
        {
        }
        public static new ManagedInstanceLoadBalancerArgs Empty => new ManagedInstanceLoadBalancerArgs();
    }
}
