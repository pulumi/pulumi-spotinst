// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Ecs.Outputs
{

    [OutputType]
    public sealed class OceanAutoscaler
    {
        /// <summary>
        /// The auto-headroom percentage. Set a number between 0-200 to control the headroom % of the cluster. Relevant when `isAutoConfig`= true.
        /// </summary>
        public readonly int? AutoHeadroomPercentage;
        /// <summary>
        /// Cooldown period between scaling actions.
        /// </summary>
        public readonly int? Cooldown;
        /// <summary>
        /// Auto Scaling scale down operations.
        /// </summary>
        public readonly Outputs.OceanAutoscalerDown? Down;
        /// <summary>
        /// When set to true, both automatic and per custom launch specification manual headroom to be saved concurrently and independently in the cluster. prerequisite: isAutoConfig must be true
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        /// });
        /// ```
        /// </summary>
        public readonly bool? EnableAutomaticAndManualHeadroom;
        /// <summary>
        /// Spare resource capacity management enabling fast assignment of tasks without waiting for new resources to launch.
        /// </summary>
        public readonly Outputs.OceanAutoscalerHeadroom? Headroom;
        /// <summary>
        /// Automatically configure and optimize headroom resources.
        /// </summary>
        public readonly bool? IsAutoConfig;
        /// <summary>
        /// Enable the Ocean ECS autoscaler.
        /// </summary>
        public readonly bool? IsEnabled;
        /// <summary>
        /// Optionally set upper and lower bounds on the resource usage of the cluster.
        /// </summary>
        public readonly Outputs.OceanAutoscalerResourceLimits? ResourceLimits;
        /// <summary>
        /// Option to scale down non-service tasks. If not set, Ocean does not scale down standalone tasks.
        /// </summary>
        public readonly bool? ShouldScaleDownNonServiceTasks;

        [OutputConstructor]
        private OceanAutoscaler(
            int? autoHeadroomPercentage,

            int? cooldown,

            Outputs.OceanAutoscalerDown? down,

            bool? enableAutomaticAndManualHeadroom,

            Outputs.OceanAutoscalerHeadroom? headroom,

            bool? isAutoConfig,

            bool? isEnabled,

            Outputs.OceanAutoscalerResourceLimits? resourceLimits,

            bool? shouldScaleDownNonServiceTasks)
        {
            AutoHeadroomPercentage = autoHeadroomPercentage;
            Cooldown = cooldown;
            Down = down;
            EnableAutomaticAndManualHeadroom = enableAutomaticAndManualHeadroom;
            Headroom = headroom;
            IsAutoConfig = isAutoConfig;
            IsEnabled = isEnabled;
            ResourceLimits = resourceLimits;
            ShouldScaleDownNonServiceTasks = shouldScaleDownNonServiceTasks;
        }
    }
}
