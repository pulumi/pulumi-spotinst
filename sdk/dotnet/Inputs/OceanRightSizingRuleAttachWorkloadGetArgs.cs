// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Inputs
{

    public sealed class OceanRightSizingRuleAttachWorkloadGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("namespaces", required: true)]
        private InputList<Inputs.OceanRightSizingRuleAttachWorkloadNamespaceGetArgs>? _namespaces;
        public InputList<Inputs.OceanRightSizingRuleAttachWorkloadNamespaceGetArgs> Namespaces
        {
            get => _namespaces ?? (_namespaces = new InputList<Inputs.OceanRightSizingRuleAttachWorkloadNamespaceGetArgs>());
            set => _namespaces = value;
        }

        public OceanRightSizingRuleAttachWorkloadGetArgs()
        {
        }
        public static new OceanRightSizingRuleAttachWorkloadGetArgs Empty => new OceanRightSizingRuleAttachWorkloadGetArgs();
    }
}
