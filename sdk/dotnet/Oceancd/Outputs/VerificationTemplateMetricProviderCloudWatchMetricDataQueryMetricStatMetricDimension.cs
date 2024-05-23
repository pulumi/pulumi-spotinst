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
    public sealed class VerificationTemplateMetricProviderCloudWatchMetricDataQueryMetricStatMetricDimension
    {
        /// <summary>
        /// The name of the dimensions. These values must contain only ASCII characters and must include at least one non-whitespace characte
        /// </summary>
        public readonly string DimensionName;
        /// <summary>
        /// The value of the dimensions.These values must contain only ASCII characters and must include at least one non-whitespace characte
        /// </summary>
        public readonly string DimensionValue;

        [OutputConstructor]
        private VerificationTemplateMetricProviderCloudWatchMetricDataQueryMetricStatMetricDimension(
            string dimensionName,

            string dimensionValue)
        {
            DimensionName = dimensionName;
            DimensionValue = dimensionValue;
        }
    }
}
