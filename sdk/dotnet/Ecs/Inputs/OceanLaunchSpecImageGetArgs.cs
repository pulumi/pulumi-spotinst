// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Ecs.Inputs
{

    public sealed class OceanLaunchSpecImageGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Identifier of the image in AWS. Valid values: any string which is not empty or null.
        /// </summary>
        [Input("imageId")]
        public Input<string>? ImageId { get; set; }

        public OceanLaunchSpecImageGetArgs()
        {
        }
        public static new OceanLaunchSpecImageGetArgs Empty => new OceanLaunchSpecImageGetArgs();
    }
}
