// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Inputs
{

    public sealed class StatefulNodeAzureStrategyGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("drainingTimeout")]
        public Input<int>? DrainingTimeout { get; set; }

        [Input("fallbackToOnDemand", required: true)]
        public Input<bool> FallbackToOnDemand { get; set; } = null!;

        [Input("optimizationWindows")]
        private InputList<string>? _optimizationWindows;
        public InputList<string> OptimizationWindows
        {
            get => _optimizationWindows ?? (_optimizationWindows = new InputList<string>());
            set => _optimizationWindows = value;
        }

        [Input("preferredLifeCycle")]
        public Input<string>? PreferredLifeCycle { get; set; }

        [Input("revertToSpot")]
        public Input<Inputs.StatefulNodeAzureStrategyRevertToSpotGetArgs>? RevertToSpot { get; set; }

        public StatefulNodeAzureStrategyGetArgs()
        {
        }
        public static new StatefulNodeAzureStrategyGetArgs Empty => new StatefulNodeAzureStrategyGetArgs();
    }
}
