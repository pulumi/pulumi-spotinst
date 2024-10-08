// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Outputs
{

    [OutputType]
    public sealed class RolloutSpecTrafficAlbStickinessConfig
    {
        /// <summary>
        /// Defines how long the load balancer should consistently route the user's request to the same target.
        /// </summary>
        public readonly int? DurationSeconds;
        /// <summary>
        /// Enables the load balancer to bind a user's session to a specific target.
        /// </summary>
        public readonly bool? Enabled;

        [OutputConstructor]
        private RolloutSpecTrafficAlbStickinessConfig(
            int? durationSeconds,

            bool? enabled)
        {
            DurationSeconds = durationSeconds;
            Enabled = enabled;
        }
    }
}