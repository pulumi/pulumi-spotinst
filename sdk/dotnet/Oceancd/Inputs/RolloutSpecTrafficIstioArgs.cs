// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Inputs
{

    public sealed class RolloutSpecTrafficIstioArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// It references to an Istio DestinationRule to modify and shape traffic. `DestinationRule` field belongs only to the Subset Level approach.
        /// </summary>
        [Input("destinationRule")]
        public Input<Inputs.RolloutSpecTrafficIstioDestinationRuleArgs>? DestinationRule { get; set; }

        [Input("virtualServices", required: true)]
        private InputList<Inputs.RolloutSpecTrafficIstioVirtualServiceArgs>? _virtualServices;

        /// <summary>
        /// Defines a set of traffic routing rules to apply when a host is addressed.
        /// </summary>
        public InputList<Inputs.RolloutSpecTrafficIstioVirtualServiceArgs> VirtualServices
        {
            get => _virtualServices ?? (_virtualServices = new InputList<Inputs.RolloutSpecTrafficIstioVirtualServiceArgs>());
            set => _virtualServices = value;
        }

        public RolloutSpecTrafficIstioArgs()
        {
        }
        public static new RolloutSpecTrafficIstioArgs Empty => new RolloutSpecTrafficIstioArgs();
    }
}
