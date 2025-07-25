// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupSignalArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the signal defined for the group. Valid Values: `"INSTANCE_READY"`, `"INSTANCE_READY_TO_SHUTDOWN"`
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The signals defined timeout- default is 40 minutes (1800 seconds).
        /// 
        /// Usage:
        /// </summary>
        [Input("timeout")]
        public Input<int>? Timeout { get; set; }

        public ElastigroupSignalArgs()
        {
        }
        public static new ElastigroupSignalArgs Empty => new ElastigroupSignalArgs();
    }
}
