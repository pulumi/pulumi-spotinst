// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Inputs
{

    public sealed class OceanNpSchedulingTaskArgs : global::Pulumi.ResourceArgs
    {
        [Input("cronExpression", required: true)]
        public Input<string> CronExpression { get; set; } = null!;

        /// <summary>
        /// Enable automatic headroom. When set to `true`, Ocean configures and optimizes headroom automatically.
        /// </summary>
        [Input("isEnabled", required: true)]
        public Input<bool> IsEnabled { get; set; } = null!;

        [Input("parameters")]
        public Input<Inputs.OceanNpSchedulingTaskParametersArgs>? Parameters { get; set; }

        [Input("taskType", required: true)]
        public Input<string> TaskType { get; set; } = null!;

        public OceanNpSchedulingTaskArgs()
        {
        }
        public static new OceanNpSchedulingTaskArgs Empty => new OceanNpSchedulingTaskArgs();
    }
}
