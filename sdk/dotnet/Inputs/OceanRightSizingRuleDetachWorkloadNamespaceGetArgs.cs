// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Inputs
{

    public sealed class OceanRightSizingRuleDetachWorkloadNamespaceGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("labels")]
        private InputList<Inputs.OceanRightSizingRuleDetachWorkloadNamespaceLabelGetArgs>? _labels;
        public InputList<Inputs.OceanRightSizingRuleDetachWorkloadNamespaceLabelGetArgs> Labels
        {
            get => _labels ?? (_labels = new InputList<Inputs.OceanRightSizingRuleDetachWorkloadNamespaceLabelGetArgs>());
            set => _labels = value;
        }

        [Input("namespaceName", required: true)]
        public Input<string> NamespaceName { get; set; } = null!;

        [Input("workloads")]
        private InputList<Inputs.OceanRightSizingRuleDetachWorkloadNamespaceWorkloadGetArgs>? _workloads;
        public InputList<Inputs.OceanRightSizingRuleDetachWorkloadNamespaceWorkloadGetArgs> Workloads
        {
            get => _workloads ?? (_workloads = new InputList<Inputs.OceanRightSizingRuleDetachWorkloadNamespaceWorkloadGetArgs>());
            set => _workloads = value;
        }

        public OceanRightSizingRuleDetachWorkloadNamespaceGetArgs()
        {
        }
        public static new OceanRightSizingRuleDetachWorkloadNamespaceGetArgs Empty => new OceanRightSizingRuleDetachWorkloadNamespaceGetArgs();
    }
}
