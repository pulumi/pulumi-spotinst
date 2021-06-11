// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Inputs
{

    public sealed class OceanExtensionArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// API version of the extension.
        /// </summary>
        [Input("apiVersion")]
        public Input<string>? ApiVersion { get; set; }

        /// <summary>
        /// Toggles whether auto upgrades are allowed.
        /// </summary>
        [Input("minorVersionAutoUpgrade")]
        public Input<bool>? MinorVersionAutoUpgrade { get; set; }

        /// <summary>
        /// Name of the Load Balancer.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Image publisher.
        /// </summary>
        [Input("publisher")]
        public Input<string>? Publisher { get; set; }

        /// <summary>
        /// The type of load balancer. Supported value: `loadBalancer`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public OceanExtensionArgs()
        {
        }
    }
}
