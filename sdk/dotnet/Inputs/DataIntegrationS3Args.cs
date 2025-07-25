// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Inputs
{

    public sealed class DataIntegrationS3Args : global::Pulumi.ResourceArgs
    {
        [Input("bucketName", required: true)]
        public Input<string> BucketName { get; set; } = null!;

        /// <summary>
        /// The subdirectory in which your files will be stored within the bucket. Adds the prefix subdir/ to new objects' keys. Can't be null or contain '/'.
        /// </summary>
        [Input("subdir")]
        public Input<string>? Subdir { get; set; }

        public DataIntegrationS3Args()
        {
        }
        public static new DataIntegrationS3Args Empty => new DataIntegrationS3Args();
    }
}
