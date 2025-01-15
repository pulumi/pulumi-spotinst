// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Outputs
{

    [OutputType]
    public sealed class OceanNpVngTemplateSchedulingVngTemplateShutdownHours
    {
        public readonly bool? IsEnabled;
        /// <summary>
        /// The times that the shutdown hours will apply. Required if `is_enabled` is true.
        /// </summary>
        public readonly ImmutableArray<string> TimeWindows;

        [OutputConstructor]
        private OceanNpVngTemplateSchedulingVngTemplateShutdownHours(
            bool? isEnabled,

            ImmutableArray<string> timeWindows)
        {
            IsEnabled = isEnabled;
            TimeWindows = timeWindows;
        }
    }
}
