// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke.Inputs
{

    public sealed class OceanLaunchSpecNetworkInterfaceAccessConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the access configuration.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The type of the access configuration.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public OceanLaunchSpecNetworkInterfaceAccessConfigGetArgs()
        {
        }
        public static new OceanLaunchSpecNetworkInterfaceAccessConfigGetArgs Empty => new OceanLaunchSpecNetworkInterfaceAccessConfigGetArgs();
    }
}
