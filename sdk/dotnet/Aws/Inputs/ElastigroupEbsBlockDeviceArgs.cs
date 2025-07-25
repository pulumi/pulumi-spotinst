// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupEbsBlockDeviceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether the volume should be destroyed on instance termination.
        /// </summary>
        [Input("deleteOnTermination")]
        public Input<bool>? DeleteOnTermination { get; set; }

        /// <summary>
        /// The name of the device to mount.
        /// </summary>
        [Input("deviceName", required: true)]
        public Input<string> DeviceName { get; set; } = null!;

        /// <summary>
        /// Set dynamic IOPS properties. When using this object, you cannot use the `iops` object. You must use one or the other.
        /// </summary>
        [Input("dynamicIops")]
        public Input<Inputs.ElastigroupEbsBlockDeviceDynamicIopsArgs>? DynamicIops { get; set; }

        /// <summary>
        /// Set dynamic volume size properties. When using this object, you cannot use `volume_size`. You must use one or the other.
        /// </summary>
        [Input("dynamicVolumeSize")]
        public Input<Inputs.ElastigroupEbsBlockDeviceDynamicVolumeSizeArgs>? DynamicVolumeSize { get; set; }

        /// <summary>
        /// Enables [EBS encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html) on the volume.
        /// </summary>
        [Input("encrypted")]
        public Input<bool>? Encrypted { get; set; }

        /// <summary>
        /// The amount of provisioned [IOPS](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-io-characteristics.html). This must be set with a `volume_type` of `"io1"`.
        /// </summary>
        [Input("iops")]
        public Input<int>? Iops { get; set; }

        /// <summary>
        /// ID for a user managed CMK under which the EBS Volume is encrypted
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        /// <summary>
        /// The Snapshot ID to mount.
        /// </summary>
        [Input("snapshotId")]
        public Input<string>? SnapshotId { get; set; }

        /// <summary>
        /// The amount of data transferred to or from a storage device per second, you can use this param just in a case that `volume_type` = gp3.
        /// </summary>
        [Input("throughput")]
        public Input<int>? Throughput { get; set; }

        /// <summary>
        /// The size of the volume in gigabytes.
        /// </summary>
        [Input("volumeSize")]
        public Input<int>? VolumeSize { get; set; }

        /// <summary>
        /// The type of volume. Can be `"standard"`, `"gp2"`, `"gp3"`, `"io1"`, `"st1"` or `"sc1"`.
        /// </summary>
        [Input("volumeType")]
        public Input<string>? VolumeType { get; set; }

        public ElastigroupEbsBlockDeviceArgs()
        {
        }
        public static new ElastigroupEbsBlockDeviceArgs Empty => new ElastigroupEbsBlockDeviceArgs();
    }
}
