// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Ecs.Outputs
{

    [OutputType]
    public sealed class OceanLoggingExport
    {
        /// <summary>
        /// Exports your cluster's logs to the S3 bucket and subdir configured on the S3 data integration given.
        /// </summary>
        public readonly ImmutableArray<Outputs.OceanLoggingExportS3> S3s;

        [OutputConstructor]
        private OceanLoggingExport(ImmutableArray<Outputs.OceanLoggingExportS3> s3s)
        {
            S3s = s3s;
        }
    }
}
