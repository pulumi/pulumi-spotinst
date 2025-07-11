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
    public sealed class VerificationTemplateMetricBaseline
    {
        /// <summary>
        /// The name of the monitoring tool chosen for the metric.
        /// </summary>
        public readonly ImmutableArray<Outputs.VerificationTemplateMetricBaselineBaselineProvider> BaselineProviders;
        /// <summary>
        /// Number in percent we allow the new version’s data result to be under baseline data result.
        /// </summary>
        public readonly int? MaxRange;
        /// <summary>
        /// Number in percent we allow the new version’s data result to be under baseline data result.*
        /// </summary>
        public readonly int? MinRange;
        /// <summary>
        /// A mathematical expression needed for the comparison. Enum: "&lt;" "&gt;" "&lt;=" "&gt;=" "=" "range"
        /// </summary>
        public readonly string Threshold;

        [OutputConstructor]
        private VerificationTemplateMetricBaseline(
            ImmutableArray<Outputs.VerificationTemplateMetricBaselineBaselineProvider> baselineProviders,

            int? maxRange,

            int? minRange,

            string threshold)
        {
            BaselineProviders = baselineProviders;
            MaxRange = maxRange;
            MinRange = minRange;
            Threshold = threshold;
        }
    }
}
