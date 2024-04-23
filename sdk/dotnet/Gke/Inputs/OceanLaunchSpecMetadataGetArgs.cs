// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke.Inputs
{

    public sealed class OceanLaunchSpecMetadataGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The metadata key.
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// The metadata value.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public OceanLaunchSpecMetadataGetArgs()
        {
        }
        public static new OceanLaunchSpecMetadataGetArgs Empty => new OceanLaunchSpecMetadataGetArgs();
    }
}
