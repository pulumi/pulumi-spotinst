// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Inputs
{

    public sealed class ElastigroupAzureV3ImageCustomGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("imageName", required: true)]
        public Input<string> ImageName { get; set; } = null!;

        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        public ElastigroupAzureV3ImageCustomGetArgs()
        {
        }
        public static new ElastigroupAzureV3ImageCustomGetArgs Empty => new ElastigroupAzureV3ImageCustomGetArgs();
    }
}
