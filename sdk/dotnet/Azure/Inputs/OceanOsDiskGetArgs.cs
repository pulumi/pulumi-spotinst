// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Inputs
{

    public sealed class OceanOsDiskGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The size of the OS disk in GB.
        /// </summary>
        [Input("sizeGb", required: true)]
        public Input<int> SizeGb { get; set; } = null!;

        /// <summary>
        /// The type of load balancer. Supported value: `loadBalancer`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public OceanOsDiskGetArgs()
        {
        }
        public static new OceanOsDiskGetArgs Empty => new OceanOsDiskGetArgs();
    }
}
