// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Inputs
{

    public sealed class OceanNpSchedulingTaskParametersParametersUpgradeConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("applyRoll")]
        public Input<bool>? ApplyRoll { get; set; }

        [Input("rollParameters")]
        public Input<Inputs.OceanNpSchedulingTaskParametersParametersUpgradeConfigRollParametersGetArgs>? RollParameters { get; set; }

        [Input("scopeVersion")]
        public Input<string>? ScopeVersion { get; set; }

        public OceanNpSchedulingTaskParametersParametersUpgradeConfigGetArgs()
        {
        }
        public static new OceanNpSchedulingTaskParametersParametersUpgradeConfigGetArgs Empty => new OceanNpSchedulingTaskParametersParametersUpgradeConfigGetArgs();
    }
}
