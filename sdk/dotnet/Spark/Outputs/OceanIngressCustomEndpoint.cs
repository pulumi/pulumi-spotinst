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
    public sealed class OceanIngressCustomEndpoint
    {
        /// <summary>
        /// - The address the Ocean for Apache Spark control plane will use when addressing the cluster.
        /// </summary>
        public readonly string? Address;
        /// <summary>
        /// - Should the Ocean for Apache Spark control plane address the cluster using a custom endpoint. Use this to specify the DNS address of an externally provisioned (unmanaged) load balancer.
        /// </summary>
        public readonly bool? Enabled;

        [OutputConstructor]
        private OceanIngressCustomEndpoint(
            string? address,

            bool? enabled)
        {
            Address = address;
            Enabled = enabled;
        }
    }
}
