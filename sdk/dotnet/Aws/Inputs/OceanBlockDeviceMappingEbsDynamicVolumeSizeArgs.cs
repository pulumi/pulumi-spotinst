// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class OceanBlockDeviceMappingEbsDynamicVolumeSizeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Initial size for IOPS.
        /// </summary>
        [Input("baseSize", required: true)]
        public Input<int> BaseSize { get; set; } = null!;

        [Input("resource", required: true)]
        public Input<string> Resource { get; set; } = null!;

        /// <summary>
        /// Additional size per resource unit (in IOPS). (Example: `baseSize=50`, `sizePerResourceUnit=20`, and an instance with 2 CPU is launched; its IOPS size will be: 90).
        /// </summary>
        [Input("sizePerResourceUnit", required: true)]
        public Input<int> SizePerResourceUnit { get; set; } = null!;

        public OceanBlockDeviceMappingEbsDynamicVolumeSizeArgs()
        {
        }
        public static new OceanBlockDeviceMappingEbsDynamicVolumeSizeArgs Empty => new OceanBlockDeviceMappingEbsDynamicVolumeSizeArgs();
    }
}
