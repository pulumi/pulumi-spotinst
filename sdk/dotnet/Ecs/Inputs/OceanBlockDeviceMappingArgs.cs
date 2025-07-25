// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Ecs.Inputs
{

    public sealed class OceanBlockDeviceMappingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// String. Set device name. Example: `/dev/xvda1`.
        /// </summary>
        [Input("deviceName", required: true)]
        public Input<string> DeviceName { get; set; } = null!;

        /// <summary>
        /// Object. Set Elastic Block Store properties.
        /// </summary>
        [Input("ebs")]
        public Input<Inputs.OceanBlockDeviceMappingEbsArgs>? Ebs { get; set; }

        /// <summary>
        /// String. Suppresses the specified device included in the block device mapping of the AMI.
        /// </summary>
        [Input("noDevice")]
        public Input<string>? NoDevice { get; set; }

        [Input("virtualName")]
        public Input<string>? VirtualName { get; set; }

        public OceanBlockDeviceMappingArgs()
        {
        }
        public static new OceanBlockDeviceMappingArgs Empty => new OceanBlockDeviceMappingArgs();
    }
}
