// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class OceanBlockDeviceMappingGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// String. Set device name. (Example: `/dev/xvda`).
        /// </summary>
        [Input("deviceName")]
        public Input<string>? DeviceName { get; set; }

        /// <summary>
        /// Object. Set Elastic Block Store properties .
        /// </summary>
        [Input("ebs")]
        public Input<Inputs.OceanBlockDeviceMappingEbsGetArgs>? Ebs { get; set; }

        public OceanBlockDeviceMappingGetArgs()
        {
        }
        public static new OceanBlockDeviceMappingGetArgs Empty => new OceanBlockDeviceMappingGetArgs();
    }
}
