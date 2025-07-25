// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke.Outputs
{

    [OutputType]
    public sealed class ElastigroupBackendServiceNamedPort
    {
        public readonly string Name;
        public readonly ImmutableArray<string> Ports;

        [OutputConstructor]
        private ElastigroupBackendServiceNamedPort(
            string name,

            ImmutableArray<string> ports)
        {
            Name = name;
            Ports = ports;
        }
    }
}
