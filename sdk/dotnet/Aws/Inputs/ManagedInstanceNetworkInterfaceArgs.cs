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
        [Input("associateIpv6Address")]
        public Input<bool>? AssociateIpv6Address { get; set; }

        [Input("associatePublicIpAddress")]
        public Input<bool>? AssociatePublicIpAddress { get; set; }

        [Input("deviceIndex", required: true)]
        public Input<string> DeviceIndex { get; set; } = null!;

        public ManagedInstanceNetworkInterfaceArgs()
        {
        }
    }
}
