// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gcp.Inputs
{

    public sealed class ElastigroupNetworkInterfaceAccessConfigGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The dimension name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Type of scaling action to take when the scaling policy is triggered. Valid values: "adjustment", "setMinTarget", "updateCapacity", "percentageAdjustment"
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public ElastigroupNetworkInterfaceAccessConfigGetArgs()
        {
        }
    }
}
