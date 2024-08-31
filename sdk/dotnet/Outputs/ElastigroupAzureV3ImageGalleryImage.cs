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
    public sealed class ElastigroupAzureV3ImageGalleryImage
    {
        public readonly string GalleryName;
        public readonly string ImageName;
        public readonly string ResourceGroupName;
        public readonly string? SpotAccountId;
        public readonly string Version;

        [OutputConstructor]
        private ElastigroupAzureV3ImageGalleryImage(
            string galleryName,

            string imageName,

            string resourceGroupName,

            string? spotAccountId,

            string version)
        {
            GalleryName = galleryName;
            ImageName = imageName;
            ResourceGroupName = resourceGroupName;
            SpotAccountId = spotAccountId;
            Version = version;
        }
    }
}