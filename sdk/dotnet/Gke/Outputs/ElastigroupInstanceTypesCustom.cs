// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke.Outputs
{

    [OutputType]
    public sealed class ElastigroupInstanceTypesCustom
    {
        public readonly int MemoryGib;
        public readonly int Vcpu;

        [OutputConstructor]
        private ElastigroupInstanceTypesCustom(
            int memoryGib,

            int vcpu)
        {
            MemoryGib = memoryGib;
            Vcpu = vcpu;
        }
    }
}
