// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Gcp.Inputs
{

    public sealed class ElastigroupBackendServiceNamedPortArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The group name.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("ports", required: true)]
        private InputList<string>? _ports;

        /// <summary>
        /// A list of ports.
        /// 
        /// Usage:
        /// </summary>
        public InputList<string> Ports
        {
            get => _ports ?? (_ports = new InputList<string>());
            set => _ports = value;
        }

        public ElastigroupBackendServiceNamedPortArgs()
        {
        }
        public static new ElastigroupBackendServiceNamedPortArgs Empty => new ElastigroupBackendServiceNamedPortArgs();
    }
}
