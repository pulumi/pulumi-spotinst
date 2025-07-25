// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Outputs
{

    [OutputType]
    public sealed class OceanLaunchSpecEphemeralStorage
    {
        /// <summary>
        /// Specify an alternative device name from which ephemeral storage calculations should be derived. This parameter is used when the ephemeral storage should not utilize the root device. Provide the device name configured in the VNG's BDM or AMI's BDM that differs from the default root device.
        /// </summary>
        public readonly string? EphemeralStorageDeviceName;

        [OutputConstructor]
        private OceanLaunchSpecEphemeralStorage(string? ephemeralStorageDeviceName)
        {
            EphemeralStorageDeviceName = ephemeralStorageDeviceName;
        }
    }
}
