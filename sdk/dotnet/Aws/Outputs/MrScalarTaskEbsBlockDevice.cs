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
    public sealed class MrScalarTaskEbsBlockDevice
    {
        /// <summary>
        /// IOPS for the volume. Required in some volume types, such as io1.
        /// </summary>
        public readonly int? Iops;
        /// <summary>
        /// Size of the volume, in GBs.
        /// </summary>
        public readonly int SizeInGb;
        /// <summary>
        /// volume type. Allowed values are 'gp2', 'io1' and others.
        /// </summary>
        public readonly string VolumeType;
        /// <summary>
        /// Amount of volumes per instance in the core group.
        /// </summary>
        public readonly int? VolumesPerInstance;

        [OutputConstructor]
        private MrScalarTaskEbsBlockDevice(
            int? iops,

            int sizeInGb,

            string volumeType,

            int? volumesPerInstance)
        {
            Iops = iops;
            SizeInGb = sizeInGb;
            VolumeType = volumeType;
            VolumesPerInstance = volumesPerInstance;
        }
    }
}
