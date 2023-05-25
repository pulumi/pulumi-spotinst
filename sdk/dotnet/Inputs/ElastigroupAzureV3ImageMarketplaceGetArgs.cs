// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Inputs
{

    public sealed class ElastigroupAzureV3ImageMarketplaceGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("offer", required: true)]
        public Input<string> Offer { get; set; } = null!;

        [Input("publisher", required: true)]
        public Input<string> Publisher { get; set; } = null!;

        [Input("sku", required: true)]
        public Input<string> Sku { get; set; } = null!;

        [Input("version", required: true)]
        public Input<string> Version { get; set; } = null!;

        public ElastigroupAzureV3ImageMarketplaceGetArgs()
        {
        }
        public static new ElastigroupAzureV3ImageMarketplaceGetArgs Empty => new ElastigroupAzureV3ImageMarketplaceGetArgs();
    }
}
