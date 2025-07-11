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
    public sealed class ElastigroupIntegrationRoute53
    {
        /// <summary>
        /// Collection of one or more domains to register.
        /// </summary>
        public readonly ImmutableArray<Outputs.ElastigroupIntegrationRoute53Domain> Domains;

        [OutputConstructor]
        private ElastigroupIntegrationRoute53(ImmutableArray<Outputs.ElastigroupIntegrationRoute53Domain> domains)
        {
            Domains = domains;
        }
    }
}
