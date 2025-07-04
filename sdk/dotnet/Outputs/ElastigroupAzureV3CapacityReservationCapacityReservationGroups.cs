// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Outputs
{

    [OutputType]
    public sealed class ElastigroupAzureV3CapacityReservationCapacityReservationGroups
    {
        public readonly string CrgName;
        public readonly string CrgResourceGroupName;
        public readonly bool? CrgShouldPrioritize;

        [OutputConstructor]
        private ElastigroupAzureV3CapacityReservationCapacityReservationGroups(
            string crgName,

            string crgResourceGroupName,

            bool? crgShouldPrioritize)
        {
            CrgName = crgName;
            CrgResourceGroupName = crgResourceGroupName;
            CrgShouldPrioritize = crgShouldPrioritize;
        }
    }
}
