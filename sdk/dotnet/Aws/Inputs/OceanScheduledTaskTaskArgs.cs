// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class OceanScheduledTaskTaskArgs : global::Pulumi.ResourceArgs
    {
        [Input("cronExpression", required: true)]
        public Input<string> CronExpression { get; set; } = null!;

        [Input("isEnabled", required: true)]
        public Input<bool> IsEnabled { get; set; } = null!;

        [Input("taskType", required: true)]
        public Input<string> TaskType { get; set; } = null!;

        public OceanScheduledTaskTaskArgs()
        {
        }
        public static new OceanScheduledTaskTaskArgs Empty => new OceanScheduledTaskTaskArgs();
    }
}
