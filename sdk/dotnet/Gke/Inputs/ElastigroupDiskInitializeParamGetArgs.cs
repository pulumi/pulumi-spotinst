// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke.Inputs
{

    public sealed class ElastigroupDiskInitializeParamGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("diskSizeGb")]
        public Input<string>? DiskSizeGb { get; set; }

        [Input("diskType")]
        public Input<string>? DiskType { get; set; }

        [Input("sourceImage", required: true)]
        public Input<string> SourceImage { get; set; } = null!;

        public ElastigroupDiskInitializeParamGetArgs()
        {
        }
        public static new ElastigroupDiskInitializeParamGetArgs Empty => new ElastigroupDiskInitializeParamGetArgs();
    }
}
