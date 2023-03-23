// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class OceanBlockDeviceMappingEbsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Boolean. Flag to delete the EBS on instance termination.
        /// </summary>
        [Input("deleteOnTermination")]
        public Input<bool>? DeleteOnTermination { get; set; }

        /// <summary>
        /// Object. Set dynamic volume size properties. When using this object, you cannot use volumeSize. You must use one or the other.
        /// </summary>
        [Input("dynamicVolumeSize")]
        public Input<Inputs.OceanBlockDeviceMappingEbsDynamicVolumeSizeArgs>? DynamicVolumeSize { get; set; }

        /// <summary>
        /// Boolean. Enables [EBS encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html) on the volume.
        /// </summary>
        [Input("encrypted")]
        public Input<bool>? Encrypted { get; set; }

        /// <summary>
        /// Int. The number of I/O operations per second (IOPS) that the volume supports.
        /// </summary>
        [Input("iops")]
        public Input<int>? Iops { get; set; }

        /// <summary>
        /// String. Identifier (key ID, key alias, ID ARN, or alias ARN) for a customer managed CMK under which the EBS volume is encrypted.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        /// <summary>
        /// (Optional) String. The Snapshot ID to mount by.
        /// </summary>
        [Input("snapshotId")]
        public Input<string>? SnapshotId { get; set; }

        /// <summary>
        /// The amount of data transferred to or from a storage device per second, you can use this param just in a case that `volume_type` = `gp3`.
        /// </summary>
        [Input("throughput")]
        public Input<int>? Throughput { get; set; }

        /// <summary>
        /// Int. The size, in GB of the volume.
        /// </summary>
        [Input("volumeSize")]
        public Input<int>? VolumeSize { get; set; }

        /// <summary>
        /// String. The type of the volume. (Example: `gp2`).
        /// </summary>
        [Input("volumeType")]
        public Input<string>? VolumeType { get; set; }

        public OceanBlockDeviceMappingEbsArgs()
        {
        }
        public static new OceanBlockDeviceMappingEbsArgs Empty => new OceanBlockDeviceMappingEbsArgs();
    }
}
