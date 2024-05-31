// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Outputs
{

    [OutputType]
    public sealed class StatefulNodeAzureImportVm
    {
        public readonly int? DrainingTimeout;
        public readonly string OriginalVmName;
        public readonly string ResourceGroupName;
        public readonly int? ResourcesRetentionTime;

        [OutputConstructor]
        private StatefulNodeAzureImportVm(
            int? drainingTimeout,

            string originalVmName,

            string resourceGroupName,

            int? resourcesRetentionTime)
        {
            DrainingTimeout = drainingTimeout;
            OriginalVmName = originalVmName;
            ResourceGroupName = resourceGroupName;
            ResourcesRetentionTime = resourcesRetentionTime;
        }
    }
}