// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Inputs
{

    public sealed class OceanRightSizingRuleAttachWorkloadArgs : global::Pulumi.ResourceArgs
    {
        [Input("namespaces", required: true)]
        private InputList<Inputs.OceanRightSizingRuleAttachWorkloadNamespaceArgs>? _namespaces;
        public InputList<Inputs.OceanRightSizingRuleAttachWorkloadNamespaceArgs> Namespaces
        {
            get => _namespaces ?? (_namespaces = new InputList<Inputs.OceanRightSizingRuleAttachWorkloadNamespaceArgs>());
            set => _namespaces = value;
        }

        public OceanRightSizingRuleAttachWorkloadArgs()
        {
        }
        public static new OceanRightSizingRuleAttachWorkloadArgs Empty => new OceanRightSizingRuleAttachWorkloadArgs();
    }
}
