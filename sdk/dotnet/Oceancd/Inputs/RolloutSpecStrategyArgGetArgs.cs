// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Inputs
{

    public sealed class RolloutSpecStrategyArgGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("argName", required: true)]
        public Input<string> ArgName { get; set; } = null!;

        [Input("argValue")]
        public Input<string>? ArgValue { get; set; }

        [Input("valueFrom")]
        public Input<Inputs.RolloutSpecStrategyArgValueFromGetArgs>? ValueFrom { get; set; }

        public RolloutSpecStrategyArgGetArgs()
        {
        }
        public static new RolloutSpecStrategyArgGetArgs Empty => new RolloutSpecStrategyArgGetArgs();
    }
}
