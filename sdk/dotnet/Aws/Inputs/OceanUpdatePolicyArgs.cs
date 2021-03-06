// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class OceanUpdatePolicyArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// While used, you can control whether the group should perform a deployment after an update to the configuration.
        /// </summary>
        [Input("rollConfig")]
        public Input<Inputs.OceanUpdatePolicyRollConfigArgs>? RollConfig { get; set; }

        /// <summary>
        /// Enables the roll.
        /// </summary>
        [Input("shouldRoll", required: true)]
        public Input<bool> ShouldRoll { get; set; } = null!;

        public OceanUpdatePolicyArgs()
        {
        }
    }
}
