// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Inputs
{

    public sealed class OceanNpSchedulingShutdownHoursArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable automatic headroom. When set to True, Ocean configures and optimizes headroom automatically.
        /// </summary>
        [Input("isEnabled")]
        public Input<bool>? IsEnabled { get; set; }

        [Input("timeWindows")]
        private InputList<string>? _timeWindows;
        public InputList<string> TimeWindows
        {
            get => _timeWindows ?? (_timeWindows = new InputList<string>());
            set => _timeWindows = value;
        }

        public OceanNpSchedulingShutdownHoursArgs()
        {
        }
        public static new OceanNpSchedulingShutdownHoursArgs Empty => new OceanNpSchedulingShutdownHoursArgs();
    }
}
