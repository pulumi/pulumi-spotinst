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
    public sealed class OceanIngressLoadBalancer
    {
        public readonly bool? Managed;
        public readonly ImmutableDictionary<string, string>? ServiceAnnotations;
        public readonly string? TargetGroupArn;

        [OutputConstructor]
        private OceanIngressLoadBalancer(
            bool? managed,

            ImmutableDictionary<string, string>? serviceAnnotations,

            string? targetGroupArn)
        {
            Managed = managed;
            ServiceAnnotations = serviceAnnotations;
            TargetGroupArn = targetGroupArn;
        }
    }
}