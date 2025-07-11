// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Inputs
{

    public sealed class OceanNpUpdatePolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Spot will perform a cluster Roll in accordance with a relevant modification of the cluster’s settings. When set to true , only specific changes in the cluster’s configuration will trigger a cluster roll (such as availability_zones, max_pods_per_node, enable_node_public_ip, os_disk_size_gb, os_disk_type, os_sku, kubernetes_version, vnet_subnet_ids, pod_subnet_ids, labels, taints and tags).
        /// </summary>
        [Input("conditionedRoll")]
        public Input<bool>? ConditionedRoll { get; set; }

        /// <summary>
        /// While used, you can control whether the group should perform a deployment after an update to the configuration.
        /// </summary>
        [Input("rollConfig")]
        public Input<Inputs.OceanNpUpdatePolicyRollConfigArgs>? RollConfig { get; set; }

        /// <summary>
        /// If set to true along with the cluster update, roll will be triggered.
        /// </summary>
        [Input("shouldRoll", required: true)]
        public Input<bool> ShouldRoll { get; set; } = null!;

        public OceanNpUpdatePolicyArgs()
        {
        }
        public static new OceanNpUpdatePolicyArgs Empty => new OceanNpUpdatePolicyArgs();
    }
}
