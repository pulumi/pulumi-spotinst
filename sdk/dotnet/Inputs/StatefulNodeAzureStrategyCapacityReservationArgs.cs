// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Inputs
{

    public sealed class StatefulNodeAzureStrategyCapacityReservationArgs : global::Pulumi.ResourceArgs
    {
        [Input("capacityReservationGroups")]
        private InputList<Inputs.StatefulNodeAzureStrategyCapacityReservationCapacityReservationGroupArgs>? _capacityReservationGroups;
        public InputList<Inputs.StatefulNodeAzureStrategyCapacityReservationCapacityReservationGroupArgs> CapacityReservationGroups
        {
            get => _capacityReservationGroups ?? (_capacityReservationGroups = new InputList<Inputs.StatefulNodeAzureStrategyCapacityReservationCapacityReservationGroupArgs>());
            set => _capacityReservationGroups = value;
        }

        [Input("shouldUtilize", required: true)]
        public Input<bool> ShouldUtilize { get; set; } = null!;

        [Input("utilizationStrategy", required: true)]
        public Input<string> UtilizationStrategy { get; set; } = null!;

        public StatefulNodeAzureStrategyCapacityReservationArgs()
        {
        }
        public static new StatefulNodeAzureStrategyCapacityReservationArgs Empty => new StatefulNodeAzureStrategyCapacityReservationArgs();
    }
}
