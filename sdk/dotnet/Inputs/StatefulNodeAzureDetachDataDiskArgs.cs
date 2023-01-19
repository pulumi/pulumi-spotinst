// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Inputs
{

    public sealed class StatefulNodeAzureDetachDataDiskArgs : global::Pulumi.ResourceArgs
    {
        [Input("dataDiskName", required: true)]
        public Input<string> DataDiskName { get; set; } = null!;

        [Input("dataDiskResourceGroupName", required: true)]
        public Input<string> DataDiskResourceGroupName { get; set; } = null!;

        [Input("shouldDeallocate", required: true)]
        public Input<bool> ShouldDeallocate { get; set; } = null!;

        [Input("ttlInHours")]
        public Input<int>? TtlInHours { get; set; }

        public StatefulNodeAzureDetachDataDiskArgs()
        {
        }
        public static new StatefulNodeAzureDetachDataDiskArgs Empty => new StatefulNodeAzureDetachDataDiskArgs();
    }
}
