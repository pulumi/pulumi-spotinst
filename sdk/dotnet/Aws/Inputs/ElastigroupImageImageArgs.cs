// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupImageImageArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The group ID.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public ElastigroupImageImageArgs()
        {
        }
        public static new ElastigroupImageImageArgs Empty => new ElastigroupImageImageArgs();
    }
}
