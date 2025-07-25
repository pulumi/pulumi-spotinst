// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupStatefulInstanceActionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// String, Stateful Instance ID on which the action should be performed.
        /// </summary>
        [Input("statefulInstanceId", required: true)]
        public Input<string> StatefulInstanceId { get; set; } = null!;

        /// <summary>
        /// String, Action type. Supported action types: `pause`, `resume`, `recycle`, `deallocate`.
        /// 
        /// Usage:
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public ElastigroupStatefulInstanceActionArgs()
        {
        }
        public static new ElastigroupStatefulInstanceActionArgs Empty => new ElastigroupStatefulInstanceActionArgs();
    }
}
