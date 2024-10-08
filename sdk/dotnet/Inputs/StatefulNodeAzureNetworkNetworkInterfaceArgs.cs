// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Inputs
{

    public sealed class StatefulNodeAzureNetworkNetworkInterfaceArgs : global::Pulumi.ResourceArgs
    {
        [Input("additionalIpConfigurations")]
        private InputList<Inputs.StatefulNodeAzureNetworkNetworkInterfaceAdditionalIpConfigurationArgs>? _additionalIpConfigurations;
        public InputList<Inputs.StatefulNodeAzureNetworkNetworkInterfaceAdditionalIpConfigurationArgs> AdditionalIpConfigurations
        {
            get => _additionalIpConfigurations ?? (_additionalIpConfigurations = new InputList<Inputs.StatefulNodeAzureNetworkNetworkInterfaceAdditionalIpConfigurationArgs>());
            set => _additionalIpConfigurations = value;
        }

        [Input("applicationSecurityGroups")]
        private InputList<Inputs.StatefulNodeAzureNetworkNetworkInterfaceApplicationSecurityGroupArgs>? _applicationSecurityGroups;
        public InputList<Inputs.StatefulNodeAzureNetworkNetworkInterfaceApplicationSecurityGroupArgs> ApplicationSecurityGroups
        {
            get => _applicationSecurityGroups ?? (_applicationSecurityGroups = new InputList<Inputs.StatefulNodeAzureNetworkNetworkInterfaceApplicationSecurityGroupArgs>());
            set => _applicationSecurityGroups = value;
        }

        [Input("assignPublicIp")]
        public Input<bool>? AssignPublicIp { get; set; }

        [Input("enableIpForwarding")]
        public Input<bool>? EnableIpForwarding { get; set; }

        [Input("isPrimary", required: true)]
        public Input<bool> IsPrimary { get; set; } = null!;

        [Input("networkSecurityGroups")]
        private InputList<Inputs.StatefulNodeAzureNetworkNetworkInterfaceNetworkSecurityGroupArgs>? _networkSecurityGroups;
        public InputList<Inputs.StatefulNodeAzureNetworkNetworkInterfaceNetworkSecurityGroupArgs> NetworkSecurityGroups
        {
            get => _networkSecurityGroups ?? (_networkSecurityGroups = new InputList<Inputs.StatefulNodeAzureNetworkNetworkInterfaceNetworkSecurityGroupArgs>());
            set => _networkSecurityGroups = value;
        }

        [Input("privateIpAddresses")]
        private InputList<string>? _privateIpAddresses;
        public InputList<string> PrivateIpAddresses
        {
            get => _privateIpAddresses ?? (_privateIpAddresses = new InputList<string>());
            set => _privateIpAddresses = value;
        }

        [Input("publicIpSku")]
        public Input<string>? PublicIpSku { get; set; }

        [Input("publicIps")]
        private InputList<Inputs.StatefulNodeAzureNetworkNetworkInterfacePublicIpArgs>? _publicIps;
        public InputList<Inputs.StatefulNodeAzureNetworkNetworkInterfacePublicIpArgs> PublicIps
        {
            get => _publicIps ?? (_publicIps = new InputList<Inputs.StatefulNodeAzureNetworkNetworkInterfacePublicIpArgs>());
            set => _publicIps = value;
        }

        [Input("subnetName", required: true)]
        public Input<string> SubnetName { get; set; } = null!;

        public StatefulNodeAzureNetworkNetworkInterfaceArgs()
        {
        }
        public static new StatefulNodeAzureNetworkNetworkInterfaceArgs Empty => new StatefulNodeAzureNetworkNetworkInterfaceArgs();
    }
}