// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke.Outputs
{

    [OutputType]
    public sealed class OceanImportScheduledTaskTaskTaskParametersClusterRoll
    {
        public readonly int? BatchMinHealthyPercentage;
        /// <summary>
        /// Value in % to set size of batch in roll. Valid values are 0-100
        /// Example: 20.
        /// </summary>
        public readonly int? BatchSizePercentage;
        public readonly string? Comment;
        public readonly bool? RespectPdb;

        [OutputConstructor]
        private OceanImportScheduledTaskTaskTaskParametersClusterRoll(
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
