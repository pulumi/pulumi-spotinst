// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Inputs
{

    public sealed class ElastigroupAzureV3HealthGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("autoHealing")]
        public Input<bool>? AutoHealing { get; set; }

        [Input("gracePeriod")]
        public Input<int>? GracePeriod { get; set; }

        [Input("healthCheckTypes")]
        private InputList<string>? _healthCheckTypes;
        public InputList<string> HealthCheckTypes
        {
            get => _healthCheckTypes ?? (_healthCheckTypes = new InputList<string>());
            set => _healthCheckTypes = value;
        }

        [Input("unhealthyDuration")]
        public Input<int>? UnhealthyDuration { get; set; }

        public ElastigroupAzureV3HealthGetArgs()
        {
        }
        public static new ElastigroupAzureV3HealthGetArgs Empty => new ElastigroupAzureV3HealthGetArgs();
    }
}