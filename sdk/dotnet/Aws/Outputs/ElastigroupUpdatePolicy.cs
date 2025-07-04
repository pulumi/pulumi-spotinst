// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Outputs
{

    [OutputType]
    public sealed class ElastigroupUpdatePolicy
    {
        /// <summary>
        /// Enables updates to tags without rolling the group when set to `true`.
        /// </summary>
        public readonly bool? AutoApplyTags;
        /// <summary>
        /// While used, you can control whether the group should perform a deployment after an update to the configuration.
        /// </summary>
        public readonly Outputs.ElastigroupUpdatePolicyRollConfig? RollConfig;
        /// <summary>
        /// This will apply resuming action for Stateful instances in the Elastigroup upon scale up or capacity changes. Example usage will be for Elastigroups that will have scheduling rules to set a target capacity of 0 instances in the night and automatically restore the same state of the instances in the morning.
        /// </summary>
        public readonly bool ShouldResumeStateful;
        /// <summary>
        /// Sets the enablement of the roll option.
        /// </summary>
        public readonly bool ShouldRoll;

        [OutputConstructor]
        private ElastigroupUpdatePolicy(
            bool? autoApplyTags,

            Outputs.ElastigroupUpdatePolicyRollConfig? rollConfig,

            bool shouldResumeStateful,

            bool shouldRoll)
        {
            AutoApplyTags = autoApplyTags;
            RollConfig = rollConfig;
            ShouldResumeStateful = shouldResumeStateful;
            ShouldRoll = shouldRoll;
        }
    }
}
