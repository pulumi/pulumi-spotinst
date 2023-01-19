// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gke.Inputs
{

    public sealed class ElastigroupBackendServiceArgs : global::Pulumi.ResourceArgs
    {
        [Input("locationType")]
        public Input<string>? LocationType { get; set; }

        [Input("namedPorts")]
        private InputList<Inputs.ElastigroupBackendServiceNamedPortArgs>? _namedPorts;
        public InputList<Inputs.ElastigroupBackendServiceNamedPortArgs> NamedPorts
        {
            get => _namedPorts ?? (_namedPorts = new InputList<Inputs.ElastigroupBackendServiceNamedPortArgs>());
            set => _namedPorts = value;
        }

        [Input("scheme")]
        public Input<string>? Scheme { get; set; }

        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        public ElastigroupBackendServiceArgs()
        {
        }
        public static new ElastigroupBackendServiceArgs Empty => new ElastigroupBackendServiceArgs();
    }
}
