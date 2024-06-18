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
    public sealed class OceanNpVirtualNodeGroupUpdatePolicyRollConfig
    {
        /// <summary>
        /// Indicates the threshold of minimum healthy nodes in single batch. If the amount of healthy nodes in single batch is under the threshold, the roll will fail. If exists, the parameter value will be in range of 1-100. In case of null as value, the default value in the backend will be 50%. Value of param should represent the number in percentage (%) of the batch.
        /// </summary>
        public readonly int? BatchMinHealthyPercentage;
        /// <summary>
        /// Value as a percent to set the size of a batch in a roll. Valid values are 0-100. In case of null as value, the default value in the backend will be 20%.
        /// </summary>
        public readonly int? BatchSizePercentage;
        /// <summary>
        /// Add a comment description for the roll. The comment is limited to 256 chars and optional.
        /// </summary>
        public readonly string? Comment;
        /// <summary>
        /// List of node names to be rolled. Each identifier is a string. nodeNames can be null, and cannot be used together with nodePoolNames and vngIds.
        /// </summary>
        public readonly ImmutableArray<string> NodeNames;
        /// <summary>
        /// List of node pools to be rolled. Each node pool name is a string. nodePoolNames can be null, and cannot be used together with nodeNames and vngIds.
        /// </summary>
        public readonly ImmutableArray<string> NodePoolNames;
        /// <summary>
        /// During the roll, if the parameter is set to true we honor PDB during the nodes replacement.
        /// </summary>
        public readonly bool? RespectPdb;
        /// <summary>
        /// During the roll, if the parameter is set to true we honor Restrict Scale Down label during the nodes replacement.
        /// </summary>
        public readonly bool? RespectRestrictScaleDown;
        /// <summary>
        /// List of virtual node group identifiers to be rolled. Each identifier is a string. vngIds can be null, and cannot be used together with nodeNames and nodePoolNames.
        /// </summary>
        public readonly ImmutableArray<string> VngIds;

        [OutputConstructor]
        private OceanNpVirtualNodeGroupUpdatePolicyRollConfig(
            int? batchMinHealthyPercentage,

            int? batchSizePercentage,

            string? comment,

            ImmutableArray<string> nodeNames,

            ImmutableArray<string> nodePoolNames,

            bool? respectPdb,

            bool? respectRestrictScaleDown,

            ImmutableArray<string> vngIds)
        {
            BatchMinHealthyPercentage = batchMinHealthyPercentage;
            BatchSizePercentage = batchSizePercentage;
            Comment = comment;
            NodeNames = nodeNames;
            NodePoolNames = nodePoolNames;
            RespectPdb = respectPdb;
            RespectRestrictScaleDown = respectRestrictScaleDown;
            VngIds = vngIds;
        }
    }
}
