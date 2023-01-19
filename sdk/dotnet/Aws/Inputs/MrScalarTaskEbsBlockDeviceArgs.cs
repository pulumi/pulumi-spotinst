// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class MrScalarTaskEbsBlockDeviceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// IOPS for the volume. Required in some volume types, such as io1.
        /// </summary>
        [Input("iops")]
        public Input<int>? Iops { get; set; }

        /// <summary>
        /// Size of the volume, in GBs.
        /// </summary>
        [Input("sizeInGb", required: true)]
        public Input<int> SizeInGb { get; set; } = null!;

        /// <summary>
        /// volume type. Allowed values are 'gp2', 'io1' and others.
        /// </summary>
        [Input("volumeType", required: true)]
        public Input<string> VolumeType { get; set; } = null!;

        /// <summary>
        /// Amount of volumes per instance in the task group.
        /// </summary>
        [Input("volumesPerInstance")]
        public Input<int>? VolumesPerInstance { get; set; }

        public MrScalarTaskEbsBlockDeviceArgs()
        {
        }
        public static new MrScalarTaskEbsBlockDeviceArgs Empty => new MrScalarTaskEbsBlockDeviceArgs();
    }
}
