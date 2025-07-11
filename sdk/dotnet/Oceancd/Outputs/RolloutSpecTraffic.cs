// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Outputs
{

    [OutputType]
    public sealed class RolloutSpecTraffic
    {
        /// <summary>
        /// Holds ALB Ingress specific configuration to route traffic.
        /// </summary>
        public readonly Outputs.RolloutSpecTrafficAlb? Alb;
        /// <summary>
        /// Holds specific configuration to use Ambassador to route traffic.
        /// </summary>
        public readonly Outputs.RolloutSpecTrafficAmbassador? Ambassador;
        /// <summary>
        /// The canary service name.
        /// </summary>
        public readonly string? CanaryService;
        /// <summary>
        /// Holds Istio specific configuration to route traffic.
        /// </summary>
        public readonly Outputs.RolloutSpecTrafficIstio? Istio;
        /// <summary>
        /// Holds Nginx Ingress specific configuration to route traffic.
        /// </summary>
        public readonly Outputs.RolloutSpecTrafficNginx? Nginx;
        /// <summary>
        /// Holds the ping and pong services. You can use `pingPong` field only when using ALB as a traffic manager with the IP Mode approach.
        /// </summary>
        public readonly Outputs.RolloutSpecTrafficPingPong? PingPong;
        /// <summary>
        /// Holds TrafficSplit specific configuration to route traffic.
        /// </summary>
        public readonly Outputs.RolloutSpecTrafficSmi? Smi;
        /// <summary>
        /// The stable service name.
        /// </summary>
        public readonly string? StableService;

        [OutputConstructor]
        private RolloutSpecTraffic(
            Outputs.RolloutSpecTrafficAlb? alb,

            Outputs.RolloutSpecTrafficAmbassador? ambassador,

            string? canaryService,

            Outputs.RolloutSpecTrafficIstio? istio,

            Outputs.RolloutSpecTrafficNginx? nginx,

            Outputs.RolloutSpecTrafficPingPong? pingPong,

            Outputs.RolloutSpecTrafficSmi? smi,

            string? stableService)
        {
            Alb = alb;
            Ambassador = ambassador;
            CanaryService = canaryService;
            Istio = istio;
            Nginx = nginx;
            PingPong = pingPong;
            Smi = smi;
            StableService = stableService;
        }
    }
}
