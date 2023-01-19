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
    public sealed class OceanIngressPrivateLink
    {
        public readonly bool? Enabled;
        public readonly string? VpcEndpointService;

        [OutputConstructor]
        private OceanIngressPrivateLink(
            bool? enabled,

            string? vpcEndpointService)
        {
            Enabled = enabled;
            VpcEndpointService = vpcEndpointService;
        }
    }
}
