// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class OceanScheduledTaskShutdownHoursArgs : global::Pulumi.ResourceArgs
    {
        [Input("isEnabled")]
        public Input<bool>? IsEnabled { get; set; }

        [Input("timeWindows", required: true)]
        private InputList<string>? _timeWindows;
        public InputList<string> TimeWindows
        {
            get => _timeWindows ?? (_timeWindows = new InputList<string>());
            set => _timeWindows = value;
        }

        public OceanScheduledTaskShutdownHoursArgs()
        {
        }
        public static new OceanScheduledTaskShutdownHoursArgs Empty => new OceanScheduledTaskShutdownHoursArgs();
    }
}
