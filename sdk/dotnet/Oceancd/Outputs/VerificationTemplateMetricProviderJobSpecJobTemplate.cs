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
    public sealed class VerificationTemplateMetricProviderJobSpecJobTemplate
    {
        /// <summary>
        /// Specification of the desired behavior of the pod.
        /// </summary>
        public readonly ImmutableArray<Outputs.VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpec> TemplateSpecs;

        [OutputConstructor]
        private VerificationTemplateMetricProviderJobSpecJobTemplate(ImmutableArray<Outputs.VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpec> templateSpecs)
        {
            TemplateSpecs = templateSpecs;
        }
    }
}