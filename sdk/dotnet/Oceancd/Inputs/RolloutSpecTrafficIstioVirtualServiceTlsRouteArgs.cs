// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Inputs
{

    public sealed class RolloutSpecTrafficIstioVirtualServiceTlsRouteArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The port of the TLS Route desired to be matched in the given Istio VirtualService.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        [Input("sniHosts")]
        private InputList<string>? _sniHosts;

        /// <summary>
        /// A list of all the SNI Hosts of the TLS Route desired to be matched in the given Istio VirtualService.
        /// </summary>
        public InputList<string> SniHosts
        {
            get => _sniHosts ?? (_sniHosts = new InputList<string>());
            set => _sniHosts = value;
        }

        public RolloutSpecTrafficIstioVirtualServiceTlsRouteArgs()
        {
        }
        public static new RolloutSpecTrafficIstioVirtualServiceTlsRouteArgs Empty => new RolloutSpecTrafficIstioVirtualServiceTlsRouteArgs();
    }
}