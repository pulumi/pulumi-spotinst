// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Inputs
{

    public sealed class OceanNpVirtualNodeGroupSchedulingShutdownHoursArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Flag to enable or disable the shutdown hours mechanism. When `false`, the mechanism is deactivated, and the virtual node gorup remains in its current state.
        /// </summary>
        [Input("isEnabled")]
        public Input<bool>? IsEnabled { get; set; }

        [Input("timeWindows")]
        private InputList<string>? _timeWindows;

        /// <summary>
        /// The times that the shutdown hours will apply. Required if isEnabled is true.
        /// </summary>
        public InputList<string> TimeWindows
        {
            get => _timeWindows ?? (_timeWindows = new InputList<string>());
            set => _timeWindows = value;
        }

        public OceanNpVirtualNodeGroupSchedulingShutdownHoursArgs()
        {
        }
        public static new OceanNpVirtualNodeGroupSchedulingShutdownHoursArgs Empty => new OceanNpVirtualNodeGroupSchedulingShutdownHoursArgs();
    }
}
