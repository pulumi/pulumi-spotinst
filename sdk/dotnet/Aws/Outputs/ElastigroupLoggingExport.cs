// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Outputs
{

    [OutputType]
    public sealed class ElastigroupLoggingExport
    {
        public readonly ImmutableArray<Outputs.ElastigroupLoggingExportS3> S3s;

        [OutputConstructor]
        private ElastigroupLoggingExport(ImmutableArray<Outputs.ElastigroupLoggingExportS3> s3s)
        {
            S3s = s3s;
        }
    }
}
