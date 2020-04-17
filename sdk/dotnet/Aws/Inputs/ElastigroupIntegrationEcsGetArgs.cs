// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupIntegrationEcsGetArgs : Pulumi.ResourceArgs
    {
        [Input("autoscaleAttributes")]
        private InputList<Inputs.ElastigroupIntegrationEcsAutoscaleAttributeGetArgs>? _autoscaleAttributes;
        public InputList<Inputs.ElastigroupIntegrationEcsAutoscaleAttributeGetArgs> AutoscaleAttributes
        {
            get => _autoscaleAttributes ?? (_autoscaleAttributes = new InputList<Inputs.ElastigroupIntegrationEcsAutoscaleAttributeGetArgs>());
            set => _autoscaleAttributes = value;
        }

        [Input("autoscaleCooldown")]
        public Input<int>? AutoscaleCooldown { get; set; }

        [Input("autoscaleDown")]
        public Input<Inputs.ElastigroupIntegrationEcsAutoscaleDownGetArgs>? AutoscaleDown { get; set; }

        [Input("autoscaleHeadroom")]
        public Input<Inputs.ElastigroupIntegrationEcsAutoscaleHeadroomGetArgs>? AutoscaleHeadroom { get; set; }

        [Input("autoscaleIsAutoConfig")]
        public Input<bool>? AutoscaleIsAutoConfig { get; set; }

        [Input("autoscaleIsEnabled")]
        public Input<bool>? AutoscaleIsEnabled { get; set; }

        [Input("autoscaleScaleDownNonServiceTasks")]
        public Input<bool>? AutoscaleScaleDownNonServiceTasks { get; set; }

        [Input("clusterName", required: true)]
        public Input<string> ClusterName { get; set; } = null!;

        public ElastigroupIntegrationEcsGetArgs()
        {
        }
    }
}
