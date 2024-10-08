// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Outputs
{

    [OutputType]
    public sealed class VerificationProviderNewRelic
    {
        public readonly string AccountId;
        /// <summary>
        /// The base URL for NerdGraph for a proxy.
        /// </summary>
        public readonly string? BaseUrlNerdGraph;
        /// <summary>
        /// The base URL of the New Relic REST API for a proxy.
        /// </summary>
        public readonly string? BaseUrlRest;
        /// <summary>
        /// The NewRelic user key
        /// </summary>
        public readonly string PersonalApiKey;
        /// <summary>
        /// A region which the account is attached to. Default is "us".
        /// </summary>
        public readonly string? Region;

        [OutputConstructor]
        private VerificationProviderNewRelic(
            string accountId,

            string? baseUrlNerdGraph,

            string? baseUrlRest,

            string personalApiKey,

            string? region)
        {
            AccountId = accountId;
            BaseUrlNerdGraph = baseUrlNerdGraph;
            BaseUrlRest = baseUrlRest;
            PersonalApiKey = personalApiKey;
            Region = region;
        }
    }
}