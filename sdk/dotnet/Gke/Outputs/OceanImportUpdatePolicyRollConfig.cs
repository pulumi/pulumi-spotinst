// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke.Outputs
{

    [OutputType]
    public sealed class OceanImportUpdatePolicyRollConfig
    {
        /// <summary>
        /// Default: 50. Indicates the threshold of minimum healthy instances in single batch. If the amount of healthy instances in single batch is under the threshold, the cluster roll will fail. If exists, the parameter value will be in range of 1-100. In case of null as value, the default value in the backend will be 50%. Value of param should represent the number in percentage (%) of the batch.
        /// </summary>
        public readonly int? BatchMinHealthyPercentage;
        /// <summary>
        /// Sets the percentage of the instances to deploy in each batch.
        /// </summary>
        public readonly int BatchSizePercentage;
        /// <summary>
        /// List of Virtual Node Group identifiers to be rolled.
        /// </summary>
        public readonly ImmutableArray<string> LaunchSpecIds;
        /// <summary>
        /// Default: `false`. During the roll, if the parameter is set to `true` we honor PDB during the instance replacement.
        /// </summary>
        public readonly bool? RespectPdb;

        [OutputConstructor]
        private OceanImportUpdatePolicyRollConfig(
            int? batchMinHealthyPercentage,

            int batchSizePercentage,

            ImmutableArray<string> launchSpecIds,

            bool? respectPdb)
        {
            BatchMinHealthyPercentage = batchMinHealthyPercentage;
            BatchSizePercentage = batchSizePercentage;
            LaunchSpecIds = launchSpecIds;
            RespectPdb = respectPdb;
        }
    }
}
