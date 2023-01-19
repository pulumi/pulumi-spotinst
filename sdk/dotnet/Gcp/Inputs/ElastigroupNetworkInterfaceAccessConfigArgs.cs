// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gcp.Inputs
{

    public sealed class ElastigroupNetworkInterfaceAccessConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The group name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The type of GPU instance. Valid values: `nvidia-tesla-v100`, `nvidia-tesla-p100`, `nvidia-tesla-k80`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public ElastigroupNetworkInterfaceAccessConfigArgs()
        {
        }
        public static new ElastigroupNetworkInterfaceAccessConfigArgs Empty => new ElastigroupNetworkInterfaceAccessConfigArgs();
    }
}
