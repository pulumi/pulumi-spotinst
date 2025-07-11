// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Inputs
{

    public sealed class RolloutSpecFailurePolicyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Choose an action to perform on failure. Default is `abort`.  Enum: "abort" "pause" "promote".
        /// </summary>
        [Input("action", required: true)]
        public Input<string> Action { get; set; } = null!;

        public RolloutSpecFailurePolicyGetArgs()
        {
        }
        public static new RolloutSpecFailurePolicyGetArgs Empty => new RolloutSpecFailurePolicyGetArgs();
    }
}
