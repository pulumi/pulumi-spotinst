// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Outputs
{

    [OutputType]
    public sealed class OceanExtension
    {
        /// <summary>
        /// API version of the extension.
        /// </summary>
        public readonly string? ApiVersion;
        /// <summary>
        /// Toggles whether auto upgrades are allowed.
        /// </summary>
        public readonly bool? MinorVersionAutoUpgrade;
        /// <summary>
        /// Name of the Load Balancer.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Image publisher.
        /// </summary>
        public readonly string? Publisher;
        /// <summary>
        /// The type of load balancer. Supported value: `loadBalancer`
        /// </summary>
        public readonly string? Type;

        [OutputConstructor]
        private OceanExtension(
            string? apiVersion,

            bool? minorVersionAutoUpgrade,

            string? name,

            string? publisher,

            string? type)
        {
            ApiVersion = apiVersion;
            MinorVersionAutoUpgrade = minorVersionAutoUpgrade;
            Name = name;
            Publisher = publisher;
            Type = type;
        }
    }
}
