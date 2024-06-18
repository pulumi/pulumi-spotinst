// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class OceanAttachLoadBalancerArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If type is "TARGET_GROUP" then an ARN is required. Otherwise is not allowed.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// If type is "CLASSIC" then a name is required. Otherwise is not allowed.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Type of load balancer to use.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public OceanAttachLoadBalancerArgs()
        {
        }
        public static new OceanAttachLoadBalancerArgs Empty => new OceanAttachLoadBalancerArgs();
    }
}
