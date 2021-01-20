// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Outputs
{

    [OutputType]
    public sealed class ElastigroupImageMarketplace
    {
        /// <summary>
        /// Name of the image to use. Required if publisher is specified.
        /// </summary>
        public readonly string Offer;
        /// <summary>
        /// Image publisher. Required if resource_group_name is not specified.
        /// </summary>
        public readonly string Publisher;
        /// <summary>
        /// Image's Stock Keeping Unit, which is the specific version of the image. Required if publisher is specified.
        /// </summary>
        public readonly string Sku;

        [OutputConstructor]
        private ElastigroupImageMarketplace(
            string offer,

            string publisher,

            string sku)
        {
            Offer = offer;
            Publisher = publisher;
            Sku = sku;
        }
    }
}
