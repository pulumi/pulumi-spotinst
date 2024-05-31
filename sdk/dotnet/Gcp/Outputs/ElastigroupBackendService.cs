// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gcp.Outputs
{

    [OutputType]
    public sealed class ElastigroupBackendService
    {
        public readonly string? LocationType;
        public readonly ImmutableArray<Outputs.ElastigroupBackendServiceNamedPort> NamedPorts;
        public readonly string? Scheme;
        public readonly string ServiceName;

        [OutputConstructor]
        private ElastigroupBackendService(
            string? locationType,

            ImmutableArray<Outputs.ElastigroupBackendServiceNamedPort> namedPorts,

            string? scheme,

            string serviceName)
        {
            LocationType = locationType;
            NamedPorts = namedPorts;
            Scheme = scheme;
            ServiceName = serviceName;
        }
    }
}