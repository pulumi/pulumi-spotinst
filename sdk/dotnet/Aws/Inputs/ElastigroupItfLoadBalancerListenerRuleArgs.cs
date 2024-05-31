// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupItfLoadBalancerListenerRuleArgs : global::Pulumi.ResourceArgs
    {
        [Input("ruleArn", required: true)]
        public Input<string> RuleArn { get; set; } = null!;

        [Input("staticTargetGroup")]
        public Input<Inputs.ElastigroupItfLoadBalancerListenerRuleStaticTargetGroupArgs>? StaticTargetGroup { get; set; }

        public ElastigroupItfLoadBalancerListenerRuleArgs()
        {
        }
        public static new ElastigroupItfLoadBalancerListenerRuleArgs Empty => new ElastigroupItfLoadBalancerListenerRuleArgs();
    }
}