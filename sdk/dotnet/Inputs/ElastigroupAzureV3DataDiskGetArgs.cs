// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Inputs
{

    public sealed class ElastigroupAzureV3DataDiskGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("lun", required: true)]
        public Input<int> Lun { get; set; } = null!;

        [Input("sizeGb", required: true)]
        public Input<int> SizeGb { get; set; } = null!;

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public ElastigroupAzureV3DataDiskGetArgs()
        {
        }
        public static new ElastigroupAzureV3DataDiskGetArgs Empty => new ElastigroupAzureV3DataDiskGetArgs();
    }
}
