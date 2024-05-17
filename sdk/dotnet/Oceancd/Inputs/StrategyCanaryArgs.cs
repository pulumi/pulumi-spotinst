// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Inputs
{

    public sealed class StrategyCanaryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A list of background verifications.
        /// </summary>
        [Input("backgroundVerification")]
        public Input<Inputs.StrategyCanaryBackgroundVerificationArgs>? BackgroundVerification { get; set; }

        [Input("steps", required: true)]
        private InputList<Inputs.StrategyCanaryStepArgs>? _steps;

        /// <summary>
        /// A set of separate conditions of rollout processing.
        /// </summary>
        public InputList<Inputs.StrategyCanaryStepArgs> Steps
        {
            get => _steps ?? (_steps = new InputList<Inputs.StrategyCanaryStepArgs>());
            set => _steps = value;
        }

        public StrategyCanaryArgs()
        {
        }
        public static new StrategyCanaryArgs Empty => new StrategyCanaryArgs();
    }
}
