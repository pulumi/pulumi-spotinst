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
    public sealed class RolloutSpecStrategy
    {
        /// <summary>
        /// Arguments defined in Verification Templates.
        /// </summary>
        public readonly ImmutableArray<Outputs.RolloutSpecStrategyArg> Args;
        /// <summary>
        /// Ocean CD strategy name identifier.
        /// </summary>
        public readonly string StrategyName;

        [OutputConstructor]
        private RolloutSpecStrategy(
            ImmutableArray<Outputs.RolloutSpecStrategyArg> args,

            string strategyName)
        {
            Args = args;
            StrategyName = strategyName;
        }
    }
}