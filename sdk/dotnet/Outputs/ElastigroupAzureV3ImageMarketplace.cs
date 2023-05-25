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
    public sealed class ElastigroupAzureV3ImageMarketplace
    {
        public readonly string Offer;
        public readonly string Publisher;
        public readonly string Sku;
        public readonly string Version;

        [OutputConstructor]
        private ElastigroupAzureV3ImageMarketplace(
            string offer,

            string publisher,

            string sku,

            string version)
        {
            Offer = offer;
            Publisher = publisher;
            Sku = sku;
            Version = version;
        }
    }
}
