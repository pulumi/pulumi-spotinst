// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Ecs.Inputs
{

    public sealed class OceanUpdatePolicyGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Spot will perform a cluster Roll in accordance with a relevant modification of the cluster’s settings. When set to true , only specific changes in the cluster’s configuration will trigger a cluster roll (such as AMI, Key Pair, user data, instance types, load balancers, etc).
        /// </summary>
        [Input("conditionedRoll")]
        public Input<bool>? ConditionedRoll { get; set; }

        [Input("rollConfig")]
        public Input<Inputs.OceanUpdatePolicyRollConfigGetArgs>? RollConfig { get; set; }

        /// <summary>
        /// Enables the roll.
        /// </summary>
        [Input("shouldRoll", required: true)]
        public Input<bool> ShouldRoll { get; set; } = null!;

        public OceanUpdatePolicyGetArgs()
        {
        }
    }
}
