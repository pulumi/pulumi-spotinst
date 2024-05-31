// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Inputs
{

    public sealed class StrategyCanaryStepArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Defines the duration of time to freeze the rollout.
        /// </summary>
        [Input("pause")]
        public Input<Inputs.StrategyCanaryStepPauseArgs>? Pause { get; set; }

        /// <summary>
        /// Defines how to scale the version without traffic weight changing.
        /// </summary>
        [Input("setCanaryScale")]
        public Input<Inputs.StrategyCanaryStepSetCanaryScaleArgs>? SetCanaryScale { get; set; }

        /// <summary>
        /// Defines the list of HeaderRoutes to add to the Rollout.
        /// </summary>
        [Input("setHeaderRoute")]
        public Input<Inputs.StrategyCanaryStepSetHeaderRouteArgs>? SetHeaderRoute { get; set; }

        /// <summary>
        /// Defines the percentage that the new version should receive.
        /// </summary>
        [Input("setWeight")]
        public Input<int>? SetWeight { get; set; }

        [Input("stepName")]
        public Input<string>? StepName { get; set; }

        /// <summary>
        /// Represents the list of verifications to run in a step.
        /// </summary>
        [Input("verification")]
        public Input<Inputs.StrategyCanaryStepVerificationArgs>? Verification { get; set; }

        public StrategyCanaryStepArgs()
        {
        }
        public static new StrategyCanaryStepArgs Empty => new StrategyCanaryStepArgs();
    }
}