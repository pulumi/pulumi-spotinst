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
    public sealed class OceanRightSizingRuleDetachWorkloadNamespaceWorkload
    {
        public readonly string? RegexName;
        public readonly string? WorkloadName;
        public readonly string WorkloadType;

        [OutputConstructor]
        private OceanRightSizingRuleDetachWorkloadNamespaceWorkload(
            string? regexName,

            string? workloadName,

            string workloadType)
        {
            RegexName = regexName;
            WorkloadName = workloadName;
            WorkloadType = workloadType;
        }
    }
}
