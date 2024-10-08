// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Inputs
{

    public sealed class ElastigroupAzureV3ImageGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("customs")]
        private InputList<Inputs.ElastigroupAzureV3ImageCustomGetArgs>? _customs;
        public InputList<Inputs.ElastigroupAzureV3ImageCustomGetArgs> Customs
        {
            get => _customs ?? (_customs = new InputList<Inputs.ElastigroupAzureV3ImageCustomGetArgs>());
            set => _customs = value;
        }

        [Input("galleryImages")]
        private InputList<Inputs.ElastigroupAzureV3ImageGalleryImageGetArgs>? _galleryImages;
        public InputList<Inputs.ElastigroupAzureV3ImageGalleryImageGetArgs> GalleryImages
        {
            get => _galleryImages ?? (_galleryImages = new InputList<Inputs.ElastigroupAzureV3ImageGalleryImageGetArgs>());
            set => _galleryImages = value;
        }

        [Input("marketplaces")]
        private InputList<Inputs.ElastigroupAzureV3ImageMarketplaceGetArgs>? _marketplaces;
        public InputList<Inputs.ElastigroupAzureV3ImageMarketplaceGetArgs> Marketplaces
        {
            get => _marketplaces ?? (_marketplaces = new InputList<Inputs.ElastigroupAzureV3ImageMarketplaceGetArgs>());
            set => _marketplaces = value;
        }

        public ElastigroupAzureV3ImageGetArgs()
        {
        }
        public static new ElastigroupAzureV3ImageGetArgs Empty => new ElastigroupAzureV3ImageGetArgs();
    }
}