// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gcp.Inputs
{

    public sealed class ElastigroupBackendServiceGetArgs : Pulumi.ResourceArgs
    {
        [Input("locationType")]
        public Input<string>? LocationType { get; set; }

        [Input("namedPorts")]
        private InputList<Inputs.ElastigroupBackendServiceNamedPortGetArgs>? _namedPorts;
        public InputList<Inputs.ElastigroupBackendServiceNamedPortGetArgs> NamedPorts
        {
            get => _namedPorts ?? (_namedPorts = new InputList<Inputs.ElastigroupBackendServiceNamedPortGetArgs>());
            set => _namedPorts = value;
        }

        [Input("scheme")]
        public Input<string>? Scheme { get; set; }

        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        public ElastigroupBackendServiceGetArgs()
        {
        }
    }
}
