// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class OceanLaunchSpecBlockDeviceMappingEbsDynamicVolumeSizeArgs : global::Pulumi.ResourceArgs
    {
        [Input("baseSize", required: true)]
        public Input<int> BaseSize { get; set; } = null!;

        [Input("resource", required: true)]
        public Input<string> Resource { get; set; } = null!;

        [Input("sizePerResourceUnit", required: true)]
        public Input<int> SizePerResourceUnit { get; set; } = null!;

        public OceanLaunchSpecBlockDeviceMappingEbsDynamicVolumeSizeArgs()
        {
        }
        public static new OceanLaunchSpecBlockDeviceMappingEbsDynamicVolumeSizeArgs Empty => new OceanLaunchSpecBlockDeviceMappingEbsDynamicVolumeSizeArgs();
    }
}
