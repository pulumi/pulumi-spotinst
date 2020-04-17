// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Inputs
{

    public sealed class ElastigroupImageGetArgs : Pulumi.ResourceArgs
    {
        [Input("customs")]
        private InputList<Inputs.ElastigroupImageCustomGetArgs>? _customs;
        public InputList<Inputs.ElastigroupImageCustomGetArgs> Customs
        {
            get => _customs ?? (_customs = new InputList<Inputs.ElastigroupImageCustomGetArgs>());
            set => _customs = value;
        }

        [Input("marketplaces")]
        private InputList<Inputs.ElastigroupImageMarketplaceGetArgs>? _marketplaces;
        public InputList<Inputs.ElastigroupImageMarketplaceGetArgs> Marketplaces
        {
            get => _marketplaces ?? (_marketplaces = new InputList<Inputs.ElastigroupImageMarketplaceGetArgs>());
            set => _marketplaces = value;
        }

        public ElastigroupImageGetArgs()
        {
        }
    }
}
