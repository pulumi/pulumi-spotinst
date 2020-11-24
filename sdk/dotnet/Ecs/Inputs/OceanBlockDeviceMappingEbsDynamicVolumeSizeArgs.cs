// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Ecs.Inputs
{

    public sealed class OceanBlockDeviceMappingEbsDynamicVolumeSizeArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Int. Initial size for volume. Example: `50`.
        /// </summary>
        [Input("baseSize", required: true)]
        public Input<int> BaseSize { get; set; } = null!;

        /// <summary>
        /// String. Resource type to increase volume size dynamically by. Valid values: `CPU`.
        /// </summary>
        [Input("resource", required: true)]
        public Input<string> Resource { get; set; } = null!;

        /// <summary>
        /// Int. Additional size (in GB) per resource unit. Example: When the `baseSize=50`, `sizePerResourceUnit=20`, and instance with two CPUs is launched, its total disk size will be: 90GB.
        /// </summary>
        [Input("sizePerResourceUnit", required: true)]
        public Input<int> SizePerResourceUnit { get; set; } = null!;

        public OceanBlockDeviceMappingEbsDynamicVolumeSizeArgs()
        {
        }
    }
}
