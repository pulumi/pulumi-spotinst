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
    public sealed class VerificationTemplateMetricProviderWeb
    {
        /// <summary>
        /// The body of the web metric.
        /// </summary>
        public readonly string? Body;
        /// <summary>
        /// Skips host TLS verification.
        /// </summary>
        public readonly bool? Insecure;
        /// <summary>
        /// A JSON Path to use as the result variable. Default is "{$}"
        /// </summary>
        public readonly string? JsonPath;
        /// <summary>
        /// The method of the web metric.  Enum: "GET" "POST" "PUT"
        /// </summary>
        public readonly string? Method;
        /// <summary>
        /// The timeout for the request in seconds. Default is 10.
        /// </summary>
        public readonly int? TimeoutSeconds;
        /// <summary>
        /// The address of the web metric.
        /// </summary>
        public readonly string Url;
        /// <summary>
        /// Optional HTTP headers to use in the request.
        /// </summary>
        public readonly ImmutableArray<Outputs.VerificationTemplateMetricProviderWebWebHeader> WebHeaders;

        [OutputConstructor]
        private VerificationTemplateMetricProviderWeb(
            string? body,

            bool? insecure,

            string? jsonPath,

            string? method,

            int? timeoutSeconds,

            string url,

            ImmutableArray<Outputs.VerificationTemplateMetricProviderWebWebHeader> webHeaders)
        {
            Body = body;
            Insecure = insecure;
            JsonPath = jsonPath;
            Method = method;
            TimeoutSeconds = timeoutSeconds;
            Url = url;
            WebHeaders = webHeaders;
        }
    }
}