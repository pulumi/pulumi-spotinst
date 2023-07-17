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
    public sealed class OceanUpdatePolicyRollConfig
    {
        public readonly int? BatchMinHealthyPercentage;
        public readonly int BatchSizePercentage;
        public readonly ImmutableArray<string> LaunchSpecIds;
        public readonly bool? RespectPdb;

        [OutputConstructor]
        private OceanUpdatePolicyRollConfig(
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
