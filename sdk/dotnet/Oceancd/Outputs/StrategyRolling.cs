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
    public sealed class StrategyRolling
    {
        /// <summary>
        /// A set of separate conditions of rollout processing.
        /// </summary>
        public readonly ImmutableArray<Outputs.StrategyRollingStep> Steps;

        [OutputConstructor]
        private StrategyRolling(ImmutableArray<Outputs.StrategyRollingStep> steps)
        {
            Steps = steps;
        }
    }
}
