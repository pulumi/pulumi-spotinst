// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupItfTargetGroupConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("healthCheckIntervalSeconds")]
        public Input<int>? HealthCheckIntervalSeconds { get; set; }

        [Input("healthCheckPath", required: true)]
        public Input<string> HealthCheckPath { get; set; } = null!;

        [Input("healthCheckPort")]
        public Input<string>? HealthCheckPort { get; set; }

        [Input("healthCheckProtocol")]
        public Input<string>? HealthCheckProtocol { get; set; }

        [Input("healthCheckTimeoutSeconds")]
        public Input<int>? HealthCheckTimeoutSeconds { get; set; }

        [Input("healthyThresholdCount")]
        public Input<int>? HealthyThresholdCount { get; set; }

        [Input("matchers")]
        private InputList<Inputs.ElastigroupItfTargetGroupConfigMatcherGetArgs>? _matchers;
        public InputList<Inputs.ElastigroupItfTargetGroupConfigMatcherGetArgs> Matchers
        {
            get => _matchers ?? (_matchers = new InputList<Inputs.ElastigroupItfTargetGroupConfigMatcherGetArgs>());
            set => _matchers = value;
        }

        [Input("port", required: true)]
        public Input<int> Port { get; set; } = null!;

        [Input("protocol", required: true)]
        public Input<string> Protocol { get; set; } = null!;

        [Input("protocolVersion")]
        public Input<string>? ProtocolVersion { get; set; }

        [Input("tags")]
        private InputList<Inputs.ElastigroupItfTargetGroupConfigTagGetArgs>? _tags;

        /// <summary>
        /// A key/value mapping of tags to assign to the resource.
        /// </summary>
        public InputList<Inputs.ElastigroupItfTargetGroupConfigTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.ElastigroupItfTargetGroupConfigTagGetArgs>());
            set => _tags = value;
        }

        [Input("unhealthyThresholdCount")]
        public Input<int>? UnhealthyThresholdCount { get; set; }

        [Input("vpcId", required: true)]
        public Input<string> VpcId { get; set; } = null!;

        public ElastigroupItfTargetGroupConfigGetArgs()
        {
        }
        public static new ElastigroupItfTargetGroupConfigGetArgs Empty => new ElastigroupItfTargetGroupConfigGetArgs();
    }
}
