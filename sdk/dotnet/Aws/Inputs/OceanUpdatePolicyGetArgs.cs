// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class OceanUpdatePolicyGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("autoApplyTags")]
        public Input<bool>? AutoApplyTags { get; set; }

        [Input("conditionedRoll")]
        public Input<bool>? ConditionedRoll { get; set; }

        [Input("conditionedRollParams")]
        private InputList<string>? _conditionedRollParams;
        public InputList<string> ConditionedRollParams
        {
            get => _conditionedRollParams ?? (_conditionedRollParams = new InputList<string>());
            set => _conditionedRollParams = value;
        }

        [Input("rollConfig")]
        public Input<Inputs.OceanUpdatePolicyRollConfigGetArgs>? RollConfig { get; set; }

        [Input("shouldRoll", required: true)]
        public Input<bool> ShouldRoll { get; set; } = null!;

        public OceanUpdatePolicyGetArgs()
        {
        }
        public static new OceanUpdatePolicyGetArgs Empty => new OceanUpdatePolicyGetArgs();
    }
}
