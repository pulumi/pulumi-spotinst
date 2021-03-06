// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Ecs.Inputs
{

    public sealed class OceanUpdatePolicyArgs : Pulumi.ResourceArgs
    {
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
