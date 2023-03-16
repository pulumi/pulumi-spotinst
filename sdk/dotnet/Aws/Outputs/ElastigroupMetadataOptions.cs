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
    public sealed class ElastigroupMetadataOptions
    {
        /// <summary>
        /// The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further instance metadata requests can travel. Valid values: Integers from `1` to `64`.
        /// </summary>
        public readonly int? HttpPutResponseHopLimit;
        /// <summary>
        /// The state of token usage for your instance metadata requests. Valid values: `optional` or `required`.
        /// </summary>
        public readonly string HttpTokens;
        /// <summary>
        /// Indicates whether access to instance tags from the instance metadata is enabled or disabled. Can’t be null.
        /// </summary>
        public readonly string? InstanceMetadataTags;

        [OutputConstructor]
        private ElastigroupMetadataOptions(
            int? httpPutResponseHopLimit,

            string httpTokens,

            string? instanceMetadataTags)
        {
            HttpPutResponseHopLimit = httpPutResponseHopLimit;
            HttpTokens = httpTokens;
            InstanceMetadataTags = instanceMetadataTags;
        }
    }
}
