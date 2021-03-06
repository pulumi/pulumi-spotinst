// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Outputs
{

    [OutputType]
    public sealed class OceanLoadBalancer
    {
        /// <summary>
        /// Names of the Backend Pools to register the Cluster VMs to. Each Backend Pool is a separate load balancer.
        /// </summary>
        public readonly ImmutableArray<string> BackendPoolNames;
        /// <summary>
        /// Supported values: `Standard`, `Basic`.
        /// </summary>
        public readonly string? LoadBalancerSku;
        /// <summary>
        /// Name of the Load Balancer.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The Resource Group name of the Load Balancer.
        /// </summary>
        public readonly string? ResourceGroupName;
        /// <summary>
        /// The type of load balancer. Supported value: `loadBalancer`
        /// </summary>
        public readonly string? Type;

        [OutputConstructor]
        private OceanLoadBalancer(
            ImmutableArray<string> backendPoolNames,

            string? loadBalancerSku,

            string? name,

            string? resourceGroupName,

            string? type)
        {
            BackendPoolNames = backendPoolNames;
            LoadBalancerSku = loadBalancerSku;
            Name = name;
            ResourceGroupName = resourceGroupName;
            Type = type;
        }
    }
}
