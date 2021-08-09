// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Ecs.Outputs
{

    [OutputType]
    public sealed class OceanInstanceMetadataOptions
    {
        /// <summary>
        /// An integer from 1 through 64. The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further the instance metadata requests can travel.
        /// </summary>
        public readonly int? HttpPutResponseHopLimit;
        /// <summary>
        /// Determines if a signed token is required or not. Valid values: `optional` or `required`.
        /// </summary>
        public readonly string HttpTokens;

        [OutputConstructor]
        private OceanInstanceMetadataOptions(
            int? httpPutResponseHopLimit,

            string httpTokens)
        {
            HttpPutResponseHopLimit = httpPutResponseHopLimit;
            HttpTokens = httpTokens;
        }
    }
}
