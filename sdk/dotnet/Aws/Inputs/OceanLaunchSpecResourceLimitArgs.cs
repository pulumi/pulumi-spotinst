// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class OceanLaunchSpecResourceLimitArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Set a maximum number of instances per Virtual Node Group. Can be null. If set, value must be greater than or equal to 0.
        /// </summary>
        [Input("maxInstanceCount")]
        public Input<int>? MaxInstanceCount { get; set; }

        /// <summary>
        /// Set a minimum number of instances per Virtual Node Group. Can be null. If set, value must be greater than or equal to 0.
        /// </summary>
        [Input("minInstanceCount")]
        public Input<int>? MinInstanceCount { get; set; }

        public OceanLaunchSpecResourceLimitArgs()
        {
        }
        public static new OceanLaunchSpecResourceLimitArgs Empty => new OceanLaunchSpecResourceLimitArgs();
    }
}
