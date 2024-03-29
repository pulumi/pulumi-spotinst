// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Outputs
{

    [OutputType]
    public sealed class StatefulNodeAzureStrategy
    {
        public readonly int? AvailabilityVsCost;
        public readonly ImmutableArray<Outputs.StatefulNodeAzureStrategyCapacityReservation> CapacityReservations;
        public readonly int? DrainingTimeout;
        public readonly bool FallbackToOnDemand;
        public readonly ImmutableArray<string> OdWindows;
        public readonly ImmutableArray<string> OptimizationWindows;
        public readonly string? PreferredLifeCycle;
        public readonly Outputs.StatefulNodeAzureStrategyRevertToSpot? RevertToSpot;

        [OutputConstructor]
        private StatefulNodeAzureStrategy(
            int? availabilityVsCost,

            ImmutableArray<Outputs.StatefulNodeAzureStrategyCapacityReservation> capacityReservations,

            int? drainingTimeout,

            bool fallbackToOnDemand,

            ImmutableArray<string> odWindows,

            ImmutableArray<string> optimizationWindows,

            string? preferredLifeCycle,

            Outputs.StatefulNodeAzureStrategyRevertToSpot? revertToSpot)
        {
            AvailabilityVsCost = availabilityVsCost;
            CapacityReservations = capacityReservations;
            DrainingTimeout = drainingTimeout;
            FallbackToOnDemand = fallbackToOnDemand;
            OdWindows = odWindows;
            OptimizationWindows = optimizationWindows;
            PreferredLifeCycle = preferredLifeCycle;
            RevertToSpot = revertToSpot;
        }
    }
}
