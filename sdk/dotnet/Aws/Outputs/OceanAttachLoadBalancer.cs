// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Outputs
{

    [OutputType]
    public sealed class OceanAttachLoadBalancer
    {
        /// <summary>
        /// If type is "TARGET_GROUP" then an ARN is required. Otherwise is not allowed.
        /// </summary>
        public readonly string? Arn;
        /// <summary>
        /// If type is "CLASSIC" then a name is required. Otherwise is not allowed.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Type of load balancer to use.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private OceanAttachLoadBalancer(
            string? arn,

            string? name,

            string type)
        {
            Arn = arn;
            Name = name;
            Type = type;
        }
    }
}
