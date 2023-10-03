// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class MrScalarBootstrapActionsFileArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// S3 Bucket name for bootstrap actions.
        /// </summary>
        [Input("bucket", required: true)]
        public Input<string> Bucket { get; set; } = null!;

        /// <summary>
        /// S3 key for bootstrap actions.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        public MrScalarBootstrapActionsFileArgs()
        {
        }
        public static new MrScalarBootstrapActionsFileArgs Empty => new MrScalarBootstrapActionsFileArgs();
    }
}
