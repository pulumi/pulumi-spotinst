// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Outputs
{

    [OutputType]
    public sealed class VerificationProviderDatadog
    {
        /// <summary>
        /// DataDog API URL.
        /// </summary>
        public readonly string Address;
        /// <summary>
        /// API key required by the Datadog Agent to submit metrics and events to Datadog.
        /// </summary>
        public readonly string ApiKey;
        /// <summary>
        /// API key that gives users access to Datadog’s programmatic API.
        /// </summary>
        public readonly string AppKey;

        [OutputConstructor]
        private VerificationProviderDatadog(
            string address,

            string apiKey,

            string appKey)
        {
            Address = address;
            ApiKey = apiKey;
            AppKey = appKey;
        }
    }
}
