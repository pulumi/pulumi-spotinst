// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Inputs
{

    public sealed class ElastigroupAzureV3NetworkNetworkInterfaceGetArgs : Pulumi.ResourceArgs
    {
        [Input("additionalIpConfigs")]
        private InputList<Inputs.ElastigroupAzureV3NetworkNetworkInterfaceAdditionalIpConfigGetArgs>? _additionalIpConfigs;

        /// <summary>
        /// Array of additional IP configuration objects.
        /// </summary>
        public InputList<Inputs.ElastigroupAzureV3NetworkNetworkInterfaceAdditionalIpConfigGetArgs> AdditionalIpConfigs
        {
            get => _additionalIpConfigs ?? (_additionalIpConfigs = new InputList<Inputs.ElastigroupAzureV3NetworkNetworkInterfaceAdditionalIpConfigGetArgs>());
            set => _additionalIpConfigs = value;
        }

        [Input("applicationSecurityGroups")]
        private InputList<Inputs.ElastigroupAzureV3NetworkNetworkInterfaceApplicationSecurityGroupGetArgs>? _applicationSecurityGroups;

        /// <summary>
        /// - List of Application Security Groups that will be associated to the primary ip configuration of the network interface.
        /// </summary>
        public InputList<Inputs.ElastigroupAzureV3NetworkNetworkInterfaceApplicationSecurityGroupGetArgs> ApplicationSecurityGroups
        {
            get => _applicationSecurityGroups ?? (_applicationSecurityGroups = new InputList<Inputs.ElastigroupAzureV3NetworkNetworkInterfaceApplicationSecurityGroupGetArgs>());
            set => _applicationSecurityGroups = value;
        }

        [Input("assignPublicIp", required: true)]
        public Input<bool> AssignPublicIp { get; set; } = null!;

        [Input("isPrimary", required: true)]
        public Input<bool> IsPrimary { get; set; } = null!;

        /// <summary>
        /// ID of subnet.
        /// </summary>
        [Input("subnetName", required: true)]
        public Input<string> SubnetName { get; set; } = null!;

        public ElastigroupAzureV3NetworkNetworkInterfaceGetArgs()
        {
        }
    }
}
