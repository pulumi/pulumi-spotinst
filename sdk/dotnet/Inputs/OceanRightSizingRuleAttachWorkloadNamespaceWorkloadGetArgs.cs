// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Inputs
{

    public sealed class OceanRightSizingRuleAttachWorkloadNamespaceWorkloadGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("regexName")]
        public Input<string>? RegexName { get; set; }

        [Input("workloadName")]
        public Input<string>? WorkloadName { get; set; }

        [Input("workloadType", required: true)]
        public Input<string> WorkloadType { get; set; } = null!;

        public OceanRightSizingRuleAttachWorkloadNamespaceWorkloadGetArgs()
        {
        }
        public static new OceanRightSizingRuleAttachWorkloadNamespaceWorkloadGetArgs Empty => new OceanRightSizingRuleAttachWorkloadNamespaceWorkloadGetArgs();
    }
}
