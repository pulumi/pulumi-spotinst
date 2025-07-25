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
    public sealed class StatefulNodeAzureDetachDataDisk
    {
        public readonly string DataDiskName;
        public readonly string DataDiskResourceGroupName;
        public readonly bool ShouldDeallocate;
        public readonly int? TtlInHours;

        [OutputConstructor]
        private StatefulNodeAzureDetachDataDisk(
            string dataDiskName,

            string dataDiskResourceGroupName,

            bool shouldDeallocate,

            int? ttlInHours)
        {
            DataDiskName = dataDiskName;
            DataDiskResourceGroupName = dataDiskResourceGroupName;
            ShouldDeallocate = shouldDeallocate;
            TtlInHours = ttlInHours;
        }
    }
}
