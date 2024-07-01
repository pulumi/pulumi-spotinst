// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Inputs
{

    public sealed class OceanRightSizingRuleDetachWorkloadNamespaceArgs : global::Pulumi.ResourceArgs
    {
        [Input("labels")]
        private InputList<Inputs.OceanRightSizingRuleDetachWorkloadNamespaceLabelArgs>? _labels;
        public InputList<Inputs.OceanRightSizingRuleDetachWorkloadNamespaceLabelArgs> Labels
        {
            get => _labels ?? (_labels = new InputList<Inputs.OceanRightSizingRuleDetachWorkloadNamespaceLabelArgs>());
            set => _labels = value;
        }

        [Input("namespaceName", required: true)]
        public Input<string> NamespaceName { get; set; } = null!;

        [Input("workloads")]
        private InputList<Inputs.OceanRightSizingRuleDetachWorkloadNamespaceWorkloadArgs>? _workloads;
        public InputList<Inputs.OceanRightSizingRuleDetachWorkloadNamespaceWorkloadArgs> Workloads
        {
            get => _workloads ?? (_workloads = new InputList<Inputs.OceanRightSizingRuleDetachWorkloadNamespaceWorkloadArgs>());
            set => _workloads = value;
        }

        public OceanRightSizingRuleDetachWorkloadNamespaceArgs()
        {
        }
        public static new OceanRightSizingRuleDetachWorkloadNamespaceArgs Empty => new OceanRightSizingRuleDetachWorkloadNamespaceArgs();
    }
}
