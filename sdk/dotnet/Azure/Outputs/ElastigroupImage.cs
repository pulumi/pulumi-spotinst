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
    public sealed class ElastigroupImage
    {
        public readonly ImmutableArray<Outputs.ElastigroupImageCustom> Customs;
        public readonly ImmutableArray<Outputs.ElastigroupImageMarketplace> Marketplaces;

        [OutputConstructor]
        private ElastigroupImage(
            ImmutableArray<Outputs.ElastigroupImageCustom> customs,

            ImmutableArray<Outputs.ElastigroupImageMarketplace> marketplaces)
        {
            Customs = customs;
            Marketplaces = marketplaces;
        }
    }
}
