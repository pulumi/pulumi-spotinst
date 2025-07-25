// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ManagedInstanceResourceTagSpecificationArgs : global::Pulumi.ResourceArgs
    {
        [Input("shouldTagAmis")]
        public Input<bool>? ShouldTagAmis { get; set; }

        [Input("shouldTagEnis")]
        public Input<bool>? ShouldTagEnis { get; set; }

        [Input("shouldTagSnapshots")]
        public Input<bool>? ShouldTagSnapshots { get; set; }

        [Input("shouldTagVolumes")]
        public Input<bool>? ShouldTagVolumes { get; set; }

        public ManagedInstanceResourceTagSpecificationArgs()
        {
        }
        public static new ManagedInstanceResourceTagSpecificationArgs Empty => new ManagedInstanceResourceTagSpecificationArgs();
    }
}
