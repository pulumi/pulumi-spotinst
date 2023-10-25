// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gcp.Outputs
{

    [OutputType]
    public sealed class ElastigroupDiskInitializeParam
    {
        /// <summary>
        /// Specifies disk size in gigabytes. Must be in increments of 2.
        /// </summary>
        public readonly string? DiskSizeGb;
        /// <summary>
        /// Specifies the disk type to use to create the instance. Valid values: pd-ssd, local-ssd.
        /// </summary>
        public readonly string? DiskType;
        /// <summary>
        /// A source image used to create the disk. You can provide a private (custom) image, and Compute Engine will use the corresponding image from your project.
        /// 
        /// Usage:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        /// });
        /// ```
        /// </summary>
        public readonly string SourceImage;

        [OutputConstructor]
        private ElastigroupDiskInitializeParam(
            string? diskSizeGb,

            string? diskType,

            string sourceImage)
        {
            DiskSizeGb = diskSizeGb;
            DiskType = diskType;
            SourceImage = sourceImage;
        }
    }
}
