// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke.Inputs
{

    public sealed class OceanLaunchSpecTaintGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The effect of the taint. Valid values: `"NoSchedule"`, `"PreferNoSchedule"`, `"NoExecute"`.
        /// </summary>
        [Input("effect")]
        public Input<string>? Effect { get; set; }

        /// <summary>
        /// The taint key.
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// The taint value.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public OceanLaunchSpecTaintGetArgs()
        {
        }
        public static new OceanLaunchSpecTaintGetArgs Empty => new OceanLaunchSpecTaintGetArgs();
    }
}
