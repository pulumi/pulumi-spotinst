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
    public sealed class OceanLaunchSpecBlockDeviceMapping
    {
        /// <summary>
        /// String. Set device name. (Example: `/dev/xvda1`).
        /// </summary>
        public readonly string DeviceName;
        /// <summary>
        /// Object. Set Elastic Block Store properties .
        /// </summary>
        public readonly Outputs.OceanLaunchSpecBlockDeviceMappingEbs? Ebs;
        /// <summary>
        /// String. Suppresses the specified device included in the block device mapping of the AMI.
        /// </summary>
        public readonly string? NoDevice;
        public readonly string? VirtualName;

        [OutputConstructor]
        private OceanLaunchSpecBlockDeviceMapping(
            string deviceName,

            Outputs.OceanLaunchSpecBlockDeviceMappingEbs? ebs,

            string? noDevice,

            string? virtualName)
        {
            DeviceName = deviceName;
            Ebs = ebs;
            NoDevice = noDevice;
            VirtualName = virtualName;
        }
    }
}
