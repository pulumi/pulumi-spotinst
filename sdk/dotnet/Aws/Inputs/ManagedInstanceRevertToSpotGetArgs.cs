// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ManagedInstanceRevertToSpotGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("performAt", required: true)]
        public Input<string> PerformAt { get; set; } = null!;

        public ManagedInstanceRevertToSpotGetArgs()
        {
        }
        public static new ManagedInstanceRevertToSpotGetArgs Empty => new ManagedInstanceRevertToSpotGetArgs();
    }
}
