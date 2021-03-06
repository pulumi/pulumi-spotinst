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
    public sealed class OceanImage
    {
        /// <summary>
        /// Select an image from Azure's Marketplace image catalogue.
        /// </summary>
        public readonly ImmutableArray<Outputs.OceanImageMarketplace> Marketplaces;

        [OutputConstructor]
        private OceanImage(ImmutableArray<Outputs.OceanImageMarketplace> marketplaces)
        {
            Marketplaces = marketplaces;
        }
    }
}
