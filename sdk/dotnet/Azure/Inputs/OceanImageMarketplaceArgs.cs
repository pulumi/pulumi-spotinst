// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Inputs
{

    public sealed class OceanImageMarketplaceArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Image name.
        /// </summary>
        [Input("offer")]
        public Input<string>? Offer { get; set; }

        /// <summary>
        /// Image publisher.
        /// </summary>
        [Input("publisher")]
        public Input<string>? Publisher { get; set; }

        /// <summary>
        /// Image Stock Keeping Unit (which is the specific version of the image).
        /// </summary>
        [Input("sku")]
        public Input<string>? Sku { get; set; }

        /// <summary>
        /// Image version.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public OceanImageMarketplaceArgs()
        {
        }
    }
}
