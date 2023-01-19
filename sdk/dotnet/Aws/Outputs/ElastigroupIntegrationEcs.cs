// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Outputs
{

    [OutputType]
    public sealed class ElastigroupIntegrationEcs
    {
        /// <summary>
        /// A key/value mapping of tags to assign to the resource.
        /// </summary>
        public readonly ImmutableArray<Outputs.ElastigroupIntegrationEcsAutoscaleAttribute> AutoscaleAttributes;
        /// <summary>
        /// The amount of time, in seconds, after a scaling activity completes before any further trigger-related scaling activities can start.
        /// </summary>
        public readonly int? AutoscaleCooldown;
        /// <summary>
        /// Enabling scale down.
        /// </summary>
        public readonly Outputs.ElastigroupIntegrationEcsAutoscaleDown? AutoscaleDown;
        /// <summary>
        /// Headroom for the cluster.
        /// </summary>
        public readonly Outputs.ElastigroupIntegrationEcsAutoscaleHeadroom? AutoscaleHeadroom;
        /// <summary>
        /// Enabling the automatic auto-scaler functionality. For more information please see: [ECS auto scaler](https://api.spotinst.com/container-management/amazon-ecs/elastigroup-for-ecs-concepts/autoscaling/).
        /// </summary>
        public readonly bool? AutoscaleIsAutoConfig;
        /// <summary>
        /// Specifies whether the auto scaling feature is enabled.
        /// </summary>
        public readonly bool? AutoscaleIsEnabled;
        /// <summary>
        /// Determines whether to scale down non-service tasks.
        /// </summary>
        public readonly bool? AutoscaleScaleDownNonServiceTasks;
        /// <summary>
        /// Batch configuration object:
        /// </summary>
        public readonly Outputs.ElastigroupIntegrationEcsBatch? Batch;
        /// <summary>
        /// The name of the EC2 Container Service cluster.
        /// </summary>
        public readonly string ClusterName;

        [OutputConstructor]
        private ElastigroupIntegrationEcs(
            ImmutableArray<Outputs.ElastigroupIntegrationEcsAutoscaleAttribute> autoscaleAttributes,

            int? autoscaleCooldown,

            Outputs.ElastigroupIntegrationEcsAutoscaleDown? autoscaleDown,

            Outputs.ElastigroupIntegrationEcsAutoscaleHeadroom? autoscaleHeadroom,

            bool? autoscaleIsAutoConfig,

            bool? autoscaleIsEnabled,

            bool? autoscaleScaleDownNonServiceTasks,

            Outputs.ElastigroupIntegrationEcsBatch? batch,

            string clusterName)
        {
            AutoscaleAttributes = autoscaleAttributes;
            AutoscaleCooldown = autoscaleCooldown;
            AutoscaleDown = autoscaleDown;
            AutoscaleHeadroom = autoscaleHeadroom;
            AutoscaleIsAutoConfig = autoscaleIsAutoConfig;
            AutoscaleIsEnabled = autoscaleIsEnabled;
            AutoscaleScaleDownNonServiceTasks = autoscaleScaleDownNonServiceTasks;
            Batch = batch;
            ClusterName = clusterName;
        }
    }
}
