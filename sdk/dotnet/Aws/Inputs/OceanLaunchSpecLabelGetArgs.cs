// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class OceanLaunchSpecLabelGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The label key.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// The label value.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public OceanLaunchSpecLabelGetArgs()
        {
        }
        public static new OceanLaunchSpecLabelGetArgs Empty => new OceanLaunchSpecLabelGetArgs();
    }
}
