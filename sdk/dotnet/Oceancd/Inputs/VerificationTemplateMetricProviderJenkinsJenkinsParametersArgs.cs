// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Inputs
{

    public sealed class VerificationTemplateMetricProviderJenkinsJenkinsParametersArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Key of an argument.
        /// </summary>
        [Input("parameterKey", required: true)]
        public Input<string> ParameterKey { get; set; } = null!;

        /// <summary>
        /// Value of an argument.
        /// </summary>
        [Input("parameterValue", required: true)]
        public Input<string> ParameterValue { get; set; } = null!;

        public VerificationTemplateMetricProviderJenkinsJenkinsParametersArgs()
        {
        }
        public static new VerificationTemplateMetricProviderJenkinsJenkinsParametersArgs Empty => new VerificationTemplateMetricProviderJenkinsJenkinsParametersArgs();
    }
}
