// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class OceanLaunchSpecStartupTaintGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Set startup taint effect.
        /// </summary>
        [Input("effect")]
        public Input<string>? Effect { get; set; }

        /// <summary>
        /// Set startup taint key.
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// Set startup taint value.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public OceanLaunchSpecStartupTaintGetArgs()
        {
        }
        public static new OceanLaunchSpecStartupTaintGetArgs Empty => new OceanLaunchSpecStartupTaintGetArgs();
    }
}
