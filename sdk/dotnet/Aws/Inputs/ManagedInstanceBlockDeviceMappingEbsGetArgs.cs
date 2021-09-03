// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ManagedInstanceBlockDeviceMappingEbsGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether the volume should be destroyed on instance termination.
        /// </summary>
        [Input("deleteOnTermination")]
        public Input<bool>? DeleteOnTermination { get; set; }

        /// <summary>
        /// The amount of provisioned [IOPS](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-io-characteristics.html). This must be set with a `volume_type` of `"io1"`.
        /// </summary>
        [Input("iops")]
        public Input<int>? Iops { get; set; }

        /// <summary>
        /// The throughput that the volume supports, in MiB/s. Minimum value of 125. Maximum value of 1000. Valid only if `volume_type` is set to `"gp3"`.
        /// </summary>
        [Input("throughput")]
        public Input<int>? Throughput { get; set; }

        /// <summary>
        /// The size of the volume, in GiBs.
        /// </summary>
        [Input("volumeSize")]
        public Input<int>? VolumeSize { get; set; }

        /// <summary>
        /// The type of volume. Can be `"standard"`, `"gp2"`, `"gp3"`, `"io1"`, `"st1"` or `"sc1"`.
        /// </summary>
        [Input("volumeType")]
        public Input<string>? VolumeType { get; set; }

        public ManagedInstanceBlockDeviceMappingEbsGetArgs()
        {
        }
    }
}
