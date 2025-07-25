// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Inputs
{

    public sealed class StatefulNodeAzureStrategyArgs : global::Pulumi.ResourceArgs
    {
        [Input("availabilityVsCost")]
        public Input<int>? AvailabilityVsCost { get; set; }

        [Input("capacityReservations")]
        private InputList<Inputs.StatefulNodeAzureStrategyCapacityReservationArgs>? _capacityReservations;
        public InputList<Inputs.StatefulNodeAzureStrategyCapacityReservationArgs> CapacityReservations
        {
            get => _capacityReservations ?? (_capacityReservations = new InputList<Inputs.StatefulNodeAzureStrategyCapacityReservationArgs>());
            set => _capacityReservations = value;
        }

        [Input("drainingTimeout")]
        public Input<int>? DrainingTimeout { get; set; }

        [Input("fallbackToOnDemand", required: true)]
        public Input<bool> FallbackToOnDemand { get; set; } = null!;

        [Input("odWindows")]
        private InputList<string>? _odWindows;
        public InputList<string> OdWindows
        {
            get => _odWindows ?? (_odWindows = new InputList<string>());
            set => _odWindows = value;
        }

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
        public Input<Inputs.StatefulNodeAzureStrategyRevertToSpotArgs>? RevertToSpot { get; set; }

        [Input("vmAdmins")]
        private InputList<string>? _vmAdmins;
        public InputList<string> VmAdmins
        {
            get => _vmAdmins ?? (_vmAdmins = new InputList<string>());
            set => _vmAdmins = value;
        }

        public StatefulNodeAzureStrategyArgs()
        {
        }
        public static new StatefulNodeAzureStrategyArgs Empty => new StatefulNodeAzureStrategyArgs();
    }
}
