// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Inputs
{

    public sealed class StatefulNodeAzureVmSizesSpotSizeAttributesArgs : global::Pulumi.ResourceArgs
    {
        [Input("maxCpu")]
        public Input<int>? MaxCpu { get; set; }

        [Input("maxMemory")]
        public Input<int>? MaxMemory { get; set; }

        [Input("maxStorage")]
        public Input<int>? MaxStorage { get; set; }

        [Input("minCpu")]
        public Input<int>? MinCpu { get; set; }

        [Input("minMemory")]
        public Input<int>? MinMemory { get; set; }

        [Input("minStorage")]
        public Input<int>? MinStorage { get; set; }

        public StatefulNodeAzureVmSizesSpotSizeAttributesArgs()
        {
        }
        public static new StatefulNodeAzureVmSizesSpotSizeAttributesArgs Empty => new StatefulNodeAzureVmSizesSpotSizeAttributesArgs();
    }
}
