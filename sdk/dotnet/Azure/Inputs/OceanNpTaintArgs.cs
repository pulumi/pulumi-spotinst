// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Inputs
{

    public sealed class OceanNpTaintArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Set taint effect.
        /// </summary>
        [Input("effect", required: true)]
        public Input<string> Effect { get; set; } = null!;

        /// <summary>
        /// Set taint key. The following taint keys are not allowed: ["node.kubernetes.io/not-ready",  "node.kubernetes.io/unreachable", "node.kubernetes.io/unschedulable",  "node.kubernetes.io/memory-pressure",  "node.kubernetes.io/disk-pressure",  "node.kubernetes.io/network-unavailable",  "node.kubernetes.io/pid-pressure",  "node.kubernetes.io/out-of-service",  "node.cloudprovider.kubernetes.io/uninitialized",  "node.cloudprovider.kubernetes.io/shutdown", "kubernetes.azure.com/scalesetpriority"]
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// Set taint value.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public OceanNpTaintArgs()
        {
        }
        public static new OceanNpTaintArgs Empty => new OceanNpTaintArgs();
    }
}
