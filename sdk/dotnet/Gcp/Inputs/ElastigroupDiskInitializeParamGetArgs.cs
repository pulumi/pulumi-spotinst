// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gcp.Inputs
{

    public sealed class ElastigroupDiskInitializeParamGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies disk size in gigabytes. Must be in increments of 2.
        /// </summary>
        [Input("diskSizeGb")]
        public Input<string>? DiskSizeGb { get; set; }

        /// <summary>
        /// Specifies the disk type to use to create the instance. Valid values: pd-ssd, local-ssd.
        /// </summary>
        [Input("diskType")]
        public Input<string>? DiskType { get; set; }

        /// <summary>
        /// A source image used to create the disk. You can provide a private (custom) image, and Compute Engine will use the corresponding image from your project.
        /// 
        /// Usage:
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        [Input("sourceImage", required: true)]
        public Input<string> SourceImage { get; set; } = null!;

        public ElastigroupDiskInitializeParamGetArgs()
        {
        }
        public static new ElastigroupDiskInitializeParamGetArgs Empty => new ElastigroupDiskInitializeParamGetArgs();
    }
}
