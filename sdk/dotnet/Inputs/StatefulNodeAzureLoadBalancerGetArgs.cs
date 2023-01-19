// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Inputs
{

    public sealed class StatefulNodeAzureLoadBalancerGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("backendPoolNames", required: true)]
        private InputList<string>? _backendPoolNames;
        public InputList<string> BackendPoolNames
        {
            get => _backendPoolNames ?? (_backendPoolNames = new InputList<string>());
            set => _backendPoolNames = value;
        }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        [Input("sku")]
        public Input<string>? Sku { get; set; }

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public StatefulNodeAzureLoadBalancerGetArgs()
        {
        }
        public static new StatefulNodeAzureLoadBalancerGetArgs Empty => new StatefulNodeAzureLoadBalancerGetArgs();
    }
}
