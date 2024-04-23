// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupIntegrationEcsArgs : global::Pulumi.ResourceArgs
    {
        [Input("autoscaleAttributes")]
        private InputList<Inputs.ElastigroupIntegrationEcsAutoscaleAttributeArgs>? _autoscaleAttributes;
        public InputList<Inputs.ElastigroupIntegrationEcsAutoscaleAttributeArgs> AutoscaleAttributes
        {
            get => _autoscaleAttributes ?? (_autoscaleAttributes = new InputList<Inputs.ElastigroupIntegrationEcsAutoscaleAttributeArgs>());
            set => _autoscaleAttributes = value;
        }

        [Input("autoscaleCooldown")]
        public Input<int>? AutoscaleCooldown { get; set; }

        [Input("autoscaleDown")]
        public Input<Inputs.ElastigroupIntegrationEcsAutoscaleDownArgs>? AutoscaleDown { get; set; }

        [Input("autoscaleHeadroom")]
        public Input<Inputs.ElastigroupIntegrationEcsAutoscaleHeadroomArgs>? AutoscaleHeadroom { get; set; }

        [Input("autoscaleIsAutoConfig")]
        public Input<bool>? AutoscaleIsAutoConfig { get; set; }

        [Input("autoscaleIsEnabled")]
        public Input<bool>? AutoscaleIsEnabled { get; set; }

        [Input("autoscaleScaleDownNonServiceTasks")]
        public Input<bool>? AutoscaleScaleDownNonServiceTasks { get; set; }

        [Input("batch")]
        public Input<Inputs.ElastigroupIntegrationEcsBatchArgs>? Batch { get; set; }

        [Input("clusterName", required: true)]
        public Input<string> ClusterName { get; set; } = null!;

        public ElastigroupIntegrationEcsArgs()
        {
        }
        public static new ElastigroupIntegrationEcsArgs Empty => new ElastigroupIntegrationEcsArgs();
    }
}
