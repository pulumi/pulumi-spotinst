// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Inputs
{

    public sealed class StatefulNodeAzureStrategyCapacityReservationCapacityReservationGroupGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("crgName", required: true)]
        public Input<string> CrgName { get; set; } = null!;

        [Input("crgResourceGroupName", required: true)]
        public Input<string> CrgResourceGroupName { get; set; } = null!;

        [Input("crgShouldPrioritize")]
        public Input<bool>? CrgShouldPrioritize { get; set; }

        public StatefulNodeAzureStrategyCapacityReservationCapacityReservationGroupGetArgs()
        {
        }
        public static new StatefulNodeAzureStrategyCapacityReservationCapacityReservationGroupGetArgs Empty => new StatefulNodeAzureStrategyCapacityReservationCapacityReservationGroupGetArgs();
    }
}
