// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Inputs
{

    public sealed class OceanVirtualNodeGroupTaintArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The effect of the taint. Valid values: `"NoSchedule"`, `"PreferNoSchedule"`, `"NoExecute"`, `"PreferNoExecute"`.
        /// </summary>
        [Input("effect", required: true)]
        public Input<string> Effect { get; set; } = null!;

        /// <summary>
        /// Tag Key for Vms in the cluster.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// Tag Value for VMs in the cluster.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public OceanVirtualNodeGroupTaintArgs()
        {
        }
    }
}
