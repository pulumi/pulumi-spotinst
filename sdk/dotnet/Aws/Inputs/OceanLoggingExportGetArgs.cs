// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class OceanLoggingExportGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("s3s")]
        private InputList<Inputs.OceanLoggingExportS3GetArgs>? _s3s;
        public InputList<Inputs.OceanLoggingExportS3GetArgs> S3s
        {
            get => _s3s ?? (_s3s = new InputList<Inputs.OceanLoggingExportS3GetArgs>());
            set => _s3s = value;
        }

        public OceanLoggingExportGetArgs()
        {
        }
        public static new OceanLoggingExportGetArgs Empty => new OceanLoggingExportGetArgs();
    }
}
