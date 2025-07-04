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
    public sealed class VerificationTemplateMetricProviderJenkinsJenkinsParameters
    {
        /// <summary>
        /// Key of an argument.
        /// </summary>
        public readonly string ParameterKey;
        /// <summary>
        /// Value of an argument.
        /// </summary>
        public readonly string ParameterValue;

        [OutputConstructor]
        private VerificationTemplateMetricProviderJenkinsJenkinsParameters(
            string parameterKey,

            string parameterValue)
        {
            ParameterKey = parameterKey;
            ParameterValue = parameterValue;
        }
    }
}
