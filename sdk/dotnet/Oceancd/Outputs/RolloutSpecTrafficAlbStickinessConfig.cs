// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Outputs
{

    [OutputType]
    public sealed class RolloutSpecTrafficAlbStickinessConfig
    {
        public readonly int? DurationSeconds;
        public readonly bool? Enabled;

        [OutputConstructor]
        private RolloutSpecTrafficAlbStickinessConfig(
            int? durationSeconds,

            bool? enabled)
        {
            DurationSeconds = durationSeconds;
            Enabled = enabled;
        }
    }
}
