// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Outputs
{

    [OutputType]
    public sealed class ManagedInstanceNetworkInterface
    {
        public readonly bool? AssociateIpv6Address;
        public readonly bool? AssociatePublicIpAddress;
        public readonly string DeviceIndex;

        [OutputConstructor]
        private ManagedInstanceNetworkInterface(
            bool? associateIpv6Address,

            bool? associatePublicIpAddress,

            string deviceIndex)
        {
            AssociateIpv6Address = associateIpv6Address;
            AssociatePublicIpAddress = associatePublicIpAddress;
            DeviceIndex = deviceIndex;
        }
    }
}