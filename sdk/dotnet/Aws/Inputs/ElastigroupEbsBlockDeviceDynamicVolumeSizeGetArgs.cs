// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupEbsBlockDeviceDynamicVolumeSizeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Initial size for volume.
        /// </summary>
        [Input("baseSize")]
        public Input<int>? BaseSize { get; set; }

        /// <summary>
        /// Type of resource, valid values: `"CPU", "MEMORY"`.
        /// </summary>
        [Input("resource")]
        public Input<string>? Resource { get; set; }

        /// <summary>
        /// Additional size per resource unit (in GB).
        /// </summary>
        [Input("sizePerResourceUnit")]
        public Input<int>? SizePerResourceUnit { get; set; }

        public ElastigroupEbsBlockDeviceDynamicVolumeSizeGetArgs()
        {
        }
        public static new ElastigroupEbsBlockDeviceDynamicVolumeSizeGetArgs Empty => new ElastigroupEbsBlockDeviceDynamicVolumeSizeGetArgs();
    }
}