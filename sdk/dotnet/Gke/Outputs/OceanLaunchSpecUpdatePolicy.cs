// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke.Outputs
{

    [OutputType]
    public sealed class OceanLaunchSpecUpdatePolicy
    {
        /// <summary>
        /// Holds the roll configuration.
        /// </summary>
        public readonly Outputs.OceanLaunchSpecUpdatePolicyRollConfig? RollConfig;
        /// <summary>
        /// Enables the roll.
        /// </summary>
        public readonly bool ShouldRoll;

        [OutputConstructor]
        private OceanLaunchSpecUpdatePolicy(
            Outputs.OceanLaunchSpecUpdatePolicyRollConfig? rollConfig,

            bool shouldRoll)
        {
            RollConfig = rollConfig;
            ShouldRoll = shouldRoll;
        }
    }
}
