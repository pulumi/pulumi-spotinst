// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Inputs
{

    public sealed class StrategyCanaryStepSetCanaryScaleArgs : global::Pulumi.ResourceArgs
    {
        [Input("matchTrafficWeight")]
        public Input<bool>? MatchTrafficWeight { get; set; }

        [Input("replicas")]
        public Input<int>? Replicas { get; set; }

        [Input("weight")]
        public Input<int>? Weight { get; set; }

        public StrategyCanaryStepSetCanaryScaleArgs()
        {
        }
        public static new StrategyCanaryStepSetCanaryScaleArgs Empty => new StrategyCanaryStepSetCanaryScaleArgs();
    }
}
