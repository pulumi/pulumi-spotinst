// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Spark.Outputs
{

    [OutputType]
    public sealed class OceanIngress
    {
        public readonly Outputs.OceanIngressController? Controller;
        public readonly Outputs.OceanIngressCustomEndpoint? CustomEndpoint;
        public readonly Outputs.OceanIngressLoadBalancer? LoadBalancer;
        public readonly Outputs.OceanIngressPrivateLink? PrivateLink;
        /// <summary>
        /// - **DEPRECATED**: Use `load_balancer.service_annotations` instead.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? ServiceAnnotations;

        [OutputConstructor]
        private OceanIngress(
            Outputs.OceanIngressController? controller,

            Outputs.OceanIngressCustomEndpoint? customEndpoint,

            Outputs.OceanIngressLoadBalancer? loadBalancer,

            Outputs.OceanIngressPrivateLink? privateLink,

            ImmutableDictionary<string, string>? serviceAnnotations)
        {
            Controller = controller;
            CustomEndpoint = customEndpoint;
            LoadBalancer = loadBalancer;
            PrivateLink = privateLink;
            ServiceAnnotations = serviceAnnotations;
        }
    }
}
