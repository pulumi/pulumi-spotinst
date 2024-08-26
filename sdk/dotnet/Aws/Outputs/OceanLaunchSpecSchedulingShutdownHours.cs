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
    public sealed class OceanLaunchSpecSchedulingShutdownHours
    {
        /// <summary>
        /// Flag to enable or disable the shutdown hours mechanism. When `false`, the mechanism is deactivated, and the virtual node group remains in its current state.
        /// </summary>
        public readonly bool? IsEnabled;
        /// <summary>
        /// The times that the shutdown hours will apply.
        /// </summary>
        public readonly ImmutableArray<string> TimeWindows;

        [OutputConstructor]
        private OceanLaunchSpecSchedulingShutdownHours(
            bool? isEnabled,

            ImmutableArray<string> timeWindows)
        {
            IsEnabled = isEnabled;
            TimeWindows = timeWindows;
        }
    }
}
