// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke.Inputs
{

    public sealed class OceanLaunchSpecLabelArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The label key.
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// The label value.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public OceanLaunchSpecLabelArgs()
        {
        }
        public static new OceanLaunchSpecLabelArgs Empty => new OceanLaunchSpecLabelArgs();
    }
}
