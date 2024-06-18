// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Outputs
{

    [OutputType]
    public sealed class OceanScheduledTaskTaskParametersParametersClusterRoll
    {
        /// <summary>
        /// Indicates the threshold of minimum healthy instances in single batch. If the amount of healthy instances in single batch is under the threshold, the cluster roll will fail. If exists, the parameter value will be in range of 1-100. In case of null as value, the default value in the backend will be 50%. Value of param should represent the number in percentage (%) of the batch.
        /// </summary>
        public readonly int? BatchMinHealthyPercentage;
        /// <summary>
        /// Value as a percent to set the size of a batch in a roll. Valid values are 0-100.
        /// </summary>
        public readonly int? BatchSizePercentage;
        /// <summary>
        /// Add a `comment` description for the roll. The `comment` is limited to 256 chars
        /// </summary>
        public readonly string? Comment;
        /// <summary>
        /// During the roll, if the parameter is set to true we honor PDB during the instance replacement.
        /// </summary>
        public readonly bool? RespectPdb;

        [OutputConstructor]
        private OceanScheduledTaskTaskParametersParametersClusterRoll(
            int? batchMinHealthyPercentage,

            int? batchSizePercentage,

            string? comment,

            bool? respectPdb)
        {
            BatchMinHealthyPercentage = batchMinHealthyPercentage;
            BatchSizePercentage = batchSizePercentage;
            Comment = comment;
            RespectPdb = respectPdb;
        }
    }
}
