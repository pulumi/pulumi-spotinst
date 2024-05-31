// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Outputs
{

    [OutputType]
    public sealed class OceanNpTaint
    {
        /// <summary>
        /// Set taint effect.
        /// </summary>
        public readonly string Effect;
        /// <summary>
        /// Set taint key. The following taint keys are not allowed: ["node.kubernetes.io/not-ready",  "node.kubernetes.io/unreachable", "node.kubernetes.io/unschedulable",  "node.kubernetes.io/memory-pressure",  "node.kubernetes.io/disk-pressure",  "node.kubernetes.io/network-unavailable",  "node.kubernetes.io/pid-pressure",  "node.kubernetes.io/out-of-service",  "node.cloudprovider.kubernetes.io/uninitialized",  "node.cloudprovider.kubernetes.io/shutdown", "kubernetes.azure.com/scalesetpriority"]
        /// </summary>
        public readonly string Key;
        /// <summary>
        /// Set taint value.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private OceanNpTaint(
            string effect,

            string key,

            string value)
        {
            Effect = effect;
            Key = key;
            Value = value;
        }
    }
}