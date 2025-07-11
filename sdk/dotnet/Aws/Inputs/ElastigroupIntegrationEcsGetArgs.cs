// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupIntegrationEcsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("autoscaleAttributes")]
        private InputList<Inputs.ElastigroupIntegrationEcsAutoscaleAttributeGetArgs>? _autoscaleAttributes;

        /// <summary>
        /// A key/value mapping of tags to assign to the resource.
        /// </summary>
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

        /// <summary>
        /// Determines whether to scale down non-service tasks.
        /// </summary>
        [Input("autoscaleScaleDownNonServiceTasks")]
        public Input<bool>? AutoscaleScaleDownNonServiceTasks { get; set; }

        /// <summary>
        /// Batch configuration object:
        /// </summary>
        [Input("batch")]
        public Input<Inputs.ElastigroupIntegrationEcsBatchGetArgs>? Batch { get; set; }

        /// <summary>
        /// The name of the EC2 Container Service cluster.
        /// </summary>
        [Input("clusterName", required: true)]
        public Input<string> ClusterName { get; set; } = null!;

        public ElastigroupIntegrationEcsGetArgs()
        {
        }
        public static new ElastigroupIntegrationEcsGetArgs Empty => new ElastigroupIntegrationEcsGetArgs();
    }
}
