// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Inputs
{

    public sealed class OceanVirtualNodeGroupResourceLimitArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Option to set a maximum number of instances per virtual node group. If set, value must be greater than or equal to 0.
        /// </summary>
        [Input("maxInstanceCount")]
        public Input<int>? MaxInstanceCount { get; set; }

        public OceanVirtualNodeGroupResourceLimitArgs()
        {
        }
    }
}
