// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Outputs
{

    [OutputType]
    public sealed class ElastigroupIntegrationRancher
    {
        /// <summary>
        /// The access key of the Rancher API.
        /// </summary>
        public readonly string AccessKey;
        public readonly string MasterHost;
        /// <summary>
        /// The secret key of the Rancher API.
        /// </summary>
        public readonly string SecretKey;
        /// <summary>
        /// The Rancher version. Must be `"1"` or `"2"`. If this field is omitted, it’s assumed that the Rancher cluster is version 1. Note that Kubernetes is required when using Rancher version 2^.
        /// Usage:
        /// </summary>
        public readonly string? Version;

        [OutputConstructor]
        private ElastigroupIntegrationRancher(
            string accessKey,

            string masterHost,

            string secretKey,

            string? version)
        {
            AccessKey = accessKey;
            MasterHost = masterHost;
            SecretKey = secretKey;
            Version = version;
        }
    }
}
