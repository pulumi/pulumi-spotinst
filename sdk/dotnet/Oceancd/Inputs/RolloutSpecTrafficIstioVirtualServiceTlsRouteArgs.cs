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
        [Input("port")]
        public Input<int>? Port { get; set; }

        [Input("sniHosts")]
        private InputList<string>? _sniHosts;
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
