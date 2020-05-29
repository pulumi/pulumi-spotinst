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
    public sealed class ElastigroupEphemeralBlockDevice
    {
        public readonly string DeviceName;
        public readonly string VirtualName;

        [OutputConstructor]
        private ElastigroupEphemeralBlockDevice(
            string deviceName,

            string virtualName)
        {
            DeviceName = deviceName;
            VirtualName = virtualName;
        }
    }
}