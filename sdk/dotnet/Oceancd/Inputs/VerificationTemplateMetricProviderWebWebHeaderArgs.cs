// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Inputs
{

    public sealed class VerificationTemplateMetricProviderWebWebHeaderArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of a header
        /// </summary>
        [Input("webHeaderKey", required: true)]
        public Input<string> WebHeaderKey { get; set; } = null!;

        /// <summary>
        /// The value of a header
        /// </summary>
        [Input("webHeaderValue", required: true)]
        public Input<string> WebHeaderValue { get; set; } = null!;

        public VerificationTemplateMetricProviderWebWebHeaderArgs()
        {
        }
        public static new VerificationTemplateMetricProviderWebWebHeaderArgs Empty => new VerificationTemplateMetricProviderWebWebHeaderArgs();
    }
}
