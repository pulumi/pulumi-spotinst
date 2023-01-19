// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ManagedInstanceResourceTagSpecificationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Tag specification for AMI resources.
        /// </summary>
        [Input("shouldTagAmis")]
        public Input<bool>? ShouldTagAmis { get; set; }

        /// <summary>
        /// Tag specification for ENI resources.
        /// </summary>
        [Input("shouldTagEnis")]
        public Input<bool>? ShouldTagEnis { get; set; }

        /// <summary>
        /// Tag specification for Snapshot resources.
        /// </summary>
        [Input("shouldTagSnapshots")]
        public Input<bool>? ShouldTagSnapshots { get; set; }

        /// <summary>
        /// Tag specification for Volume resources.
        /// </summary>
        [Input("shouldTagVolumes")]
        public Input<bool>? ShouldTagVolumes { get; set; }

        public ManagedInstanceResourceTagSpecificationGetArgs()
        {
        }
        public static new ManagedInstanceResourceTagSpecificationGetArgs Empty => new ManagedInstanceResourceTagSpecificationGetArgs();
    }
}
