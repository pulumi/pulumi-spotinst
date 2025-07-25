// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Inputs
{

    public sealed class StrategyRollingGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("steps", required: true)]
        private InputList<Inputs.StrategyRollingStepGetArgs>? _steps;

        /// <summary>
        /// A set of separate conditions of rollout processing.
        /// </summary>
        public InputList<Inputs.StrategyRollingStepGetArgs> Steps
        {
            get => _steps ?? (_steps = new InputList<Inputs.StrategyRollingStepGetArgs>());
            set => _steps = value;
        }

        public StrategyRollingGetArgs()
        {
        }
        public static new StrategyRollingGetArgs Empty => new StrategyRollingGetArgs();
    }
}
