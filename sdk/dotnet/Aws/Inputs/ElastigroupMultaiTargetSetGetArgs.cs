// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupMultaiTargetSetGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ID of Multai Load Balancer.
        /// 
        /// Usage:
        /// </summary>
        [Input("balancerId", required: true)]
        public Input<string> BalancerId { get; set; } = null!;

        /// <summary>
        /// ID of Multai target set.
        /// </summary>
        [Input("targetSetId", required: true)]
        public Input<string> TargetSetId { get; set; } = null!;

        public ElastigroupMultaiTargetSetGetArgs()
        {
        }
        public static new ElastigroupMultaiTargetSetGetArgs Empty => new ElastigroupMultaiTargetSetGetArgs();
    }
}
