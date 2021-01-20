// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ManagedInstanceNetworkInterfaceArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether to assign an IPv6 address. Amazon EC2 chooses the IPv6 addresses from the range of the subnet.
        /// Default: false
        /// </summary>
        [Input("associateIpv6Address")]
        public Input<bool>? AssociateIpv6Address { get; set; }

        /// <summary>
        /// Indicates whether to assign a public IPv4 address to an instance you launch in a VPC. The public IP address can only be assigned to a network interface for eth0, and can only be assigned to a new network interface, not an existing one. You cannot specify more than one network interface in the request. If launching into a default subnet, the default value is true.
        /// </summary>
        [Input("associatePublicIpAddress")]
        public Input<bool>? AssociatePublicIpAddress { get; set; }

        /// <summary>
        /// The position of the network interface in the attachment order. A primary network interface has a device index of 0. If you specify a network interface when launching an instance, you must specify the device index.
        /// </summary>
        [Input("deviceIndex", required: true)]
        public Input<string> DeviceIndex { get; set; } = null!;

        public ManagedInstanceNetworkInterfaceArgs()
        {
        }
    }
}
