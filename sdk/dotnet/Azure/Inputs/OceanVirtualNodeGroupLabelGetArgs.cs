// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Inputs
{

    public sealed class OceanVirtualNodeGroupLabelGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Tag Key for Vms in the cluster.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// Tag Value for VMs in the cluster.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public OceanVirtualNodeGroupLabelGetArgs()
        {
        }
    }
}
