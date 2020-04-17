// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class MrScalarCoreEbsBlockDeviceArgs : Pulumi.ResourceArgs
    {
        [Input("iops")]
        public Input<int>? Iops { get; set; }

        [Input("sizeInGb", required: true)]
        public Input<int> SizeInGb { get; set; } = null!;

        [Input("volumeType", required: true)]
        public Input<string> VolumeType { get; set; } = null!;

        [Input("volumesPerInstance")]
        public Input<int>? VolumesPerInstance { get; set; }

        public MrScalarCoreEbsBlockDeviceArgs()
        {
        }
    }
}
