// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Inputs
{

    public sealed class StrategyCanaryStepSetCanaryScaleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Defines whether a rollout should match the current canary's setWeight step.
        /// </summary>
        [Input("matchTrafficWeight")]
        public Input<bool>? MatchTrafficWeight { get; set; }

        /// <summary>
        /// Sets the number of replicas the new version should have.
        /// </summary>
        [Input("replicas")]
        public Input<int>? Replicas { get; set; }

        /// <summary>
        /// Sets the percentage of replicas the new version should have.
        /// </summary>
        [Input("weight")]
        public Input<int>? Weight { get; set; }

        public StrategyCanaryStepSetCanaryScaleGetArgs()
        {
        }
        public static new StrategyCanaryStepSetCanaryScaleGetArgs Empty => new StrategyCanaryStepSetCanaryScaleGetArgs();
    }
}
