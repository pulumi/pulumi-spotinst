// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupNetworkInterfaceGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("associateIpv6Address")]
        public Input<bool>? AssociateIpv6Address { get; set; }

        [Input("associatePublicIpAddress")]
        public Input<bool>? AssociatePublicIpAddress { get; set; }

        [Input("deleteOnTermination")]
        public Input<bool>? DeleteOnTermination { get; set; }

        /// <summary>
        /// The group description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("deviceIndex", required: true)]
        public Input<string> DeviceIndex { get; set; } = null!;

        [Input("networkInterfaceId")]
        public Input<string>? NetworkInterfaceId { get; set; }

        [Input("privateIpAddress")]
        public Input<string>? PrivateIpAddress { get; set; }

        [Input("secondaryPrivateIpAddressCount")]
        public Input<string>? SecondaryPrivateIpAddressCount { get; set; }

        public ElastigroupNetworkInterfaceGetArgs()
        {
        }
        public static new ElastigroupNetworkInterfaceGetArgs Empty => new ElastigroupNetworkInterfaceGetArgs();
    }
}
