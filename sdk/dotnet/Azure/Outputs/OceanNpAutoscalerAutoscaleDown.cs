// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Outputs
{

    [OutputType]
    public sealed class OceanNpAutoscalerAutoscaleDown
    {
        /// <summary>
        /// The maximum percentage allowed to scale down in a single scaling action.
        /// </summary>
        public readonly int? MaxScaleDownPercentage;

        [OutputConstructor]
        private OceanNpAutoscalerAutoscaleDown(int? maxScaleDownPercentage)
        {
            MaxScaleDownPercentage = maxScaleDownPercentage;
        }
    }
}
