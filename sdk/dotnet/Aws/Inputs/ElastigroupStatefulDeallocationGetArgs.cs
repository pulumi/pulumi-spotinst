// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupStatefulDeallocationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// For stateful groups: remove persistent images.
        /// </summary>
        [Input("shouldDeleteImages")]
        public Input<bool>? ShouldDeleteImages { get; set; }

        /// <summary>
        /// For stateful groups: remove network interfaces.
        /// </summary>
        [Input("shouldDeleteNetworkInterfaces")]
        public Input<bool>? ShouldDeleteNetworkInterfaces { get; set; }

        /// <summary>
        /// For stateful groups: remove snapshots.
        /// 
        /// Usage:
        /// </summary>
        [Input("shouldDeleteSnapshots")]
        public Input<bool>? ShouldDeleteSnapshots { get; set; }

        /// <summary>
        /// For stateful groups: remove persistent volumes.
        /// </summary>
        [Input("shouldDeleteVolumes")]
        public Input<bool>? ShouldDeleteVolumes { get; set; }

        public ElastigroupStatefulDeallocationGetArgs()
        {
        }
        public static new ElastigroupStatefulDeallocationGetArgs Empty => new ElastigroupStatefulDeallocationGetArgs();
    }
}
