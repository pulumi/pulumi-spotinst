// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Inputs
{

    public sealed class StrategyCanaryStepSetHeaderRouteGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("headerRouteName", required: true)]
        public Input<string> HeaderRouteName { get; set; } = null!;

        [Input("matches", required: true)]
        private InputList<Inputs.StrategyCanaryStepSetHeaderRouteMatchGetArgs>? _matches;
        public InputList<Inputs.StrategyCanaryStepSetHeaderRouteMatchGetArgs> Matches
        {
            get => _matches ?? (_matches = new InputList<Inputs.StrategyCanaryStepSetHeaderRouteMatchGetArgs>());
            set => _matches = value;
        }

        public StrategyCanaryStepSetHeaderRouteGetArgs()
        {
        }
        public static new StrategyCanaryStepSetHeaderRouteGetArgs Empty => new StrategyCanaryStepSetHeaderRouteGetArgs();
    }
}
