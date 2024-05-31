// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class OceanLoggingExportS3GetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The identifier of The S3 data integration to export the logs to.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public OceanLoggingExportS3GetArgs()
        {
        }
        public static new OceanLoggingExportS3GetArgs Empty => new OceanLoggingExportS3GetArgs();
    }
}