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
    public sealed class VerificationTemplateMetricProviderJobSpec
    {
        /// <summary>
        /// Specifies the number of retries before marking this job failed.
        /// </summary>
        public readonly int? BackoffLimit;
        /// <summary>
        /// Describes the pod that will be created when executing a job.
        /// </summary>
        public readonly ImmutableArray<Outputs.VerificationTemplateMetricProviderJobSpecJobTemplate> JobTemplates;

        [OutputConstructor]
        private VerificationTemplateMetricProviderJobSpec(
            int? backoffLimit,

            ImmutableArray<Outputs.VerificationTemplateMetricProviderJobSpecJobTemplate> jobTemplates)
        {
            BackoffLimit = backoffLimit;
            JobTemplates = jobTemplates;
        }
    }
}