// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Ecs.Outputs
{

    [OutputType]
    public sealed class OceanUpdatePolicy
    {
        public readonly Outputs.OceanUpdatePolicyRollConfig? RollConfig;
        public readonly bool ShouldRoll;

        [OutputConstructor]
        private OceanUpdatePolicy(
            Outputs.OceanUpdatePolicyRollConfig? rollConfig,

            bool shouldRoll)
        {
            RollConfig = rollConfig;
            ShouldRoll = shouldRoll;
        }
    }
}
