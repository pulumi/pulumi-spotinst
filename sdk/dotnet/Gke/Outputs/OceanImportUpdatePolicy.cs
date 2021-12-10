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
    public sealed class OceanImportUpdatePolicy
    {
        public readonly bool? ConditionedRoll;
        public readonly Outputs.OceanImportUpdatePolicyRollConfig? RollConfig;
        public readonly bool ShouldRoll;

        [OutputConstructor]
        private OceanImportUpdatePolicy(
            bool? conditionedRoll,

            Outputs.OceanImportUpdatePolicyRollConfig? rollConfig,

            bool shouldRoll)
        {
            ConditionedRoll = conditionedRoll;
            RollConfig = rollConfig;
            ShouldRoll = shouldRoll;
        }
    }
}