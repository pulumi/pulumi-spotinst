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
        /// Cooldown period between scaling actions.
        /// </summary>
        public readonly int? Cooldown;
        /// <summary>
        /// Auto Scaling scale down operations.
        /// </summary>
        public readonly Outputs.OceanAutoscalerDown? Down;
        /// <summary>
        /// Spare resource capacity management enabling fast assignment of tasks without waiting for new resources to launch.
        /// </summary>
        public readonly Outputs.OceanAutoscalerHeadroom? Headroom;
        /// <summary>
        /// Automatically configure and optimize headroom resources.
        /// </summary>
        public readonly bool? IsAutoConfig;
        /// <summary>
        /// Describes whether the task is enabled. When true the task should run when false it should not run. Required for `cluster.scheduling.tasks` object.
        /// </summary>
        public readonly bool? IsEnabled;
        /// <summary>
        /// Optionally set upper and lower bounds on the resource usage of the cluster.
        /// </summary>
        public readonly Outputs.OceanAutoscalerResourceLimits? ResourceLimits;

        [OutputConstructor]
        private OceanAutoscaler(
            int? cooldown,

            Outputs.OceanAutoscalerDown? down,

            Outputs.OceanAutoscalerHeadroom? headroom,

            bool? isAutoConfig,

            bool? isEnabled,

            Outputs.OceanAutoscalerResourceLimits? resourceLimits)
        {
            Cooldown = cooldown;
            Down = down;
            Headroom = headroom;
            IsAutoConfig = isAutoConfig;
            IsEnabled = isEnabled;
            ResourceLimits = resourceLimits;
        }
    }
}
