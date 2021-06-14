// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Outputs
{

    [OutputType]
    public sealed class ElastigroupAzureV3NetworkNetworkInterface
    {
        /// <summary>
        /// Array of additional IP configuration objects.
        /// </summary>
        public readonly ImmutableArray<Outputs.ElastigroupAzureV3NetworkNetworkInterfaceAdditionalIpConfig> AdditionalIpConfigs;
        /// <summary>
        /// - List of Application Security Groups that will be associated to the primary ip configuration of the network interface.
        /// </summary>
        public readonly ImmutableArray<Outputs.ElastigroupAzureV3NetworkNetworkInterfaceApplicationSecurityGroup> ApplicationSecurityGroups;
        public readonly bool AssignPublicIp;
        public readonly bool IsPrimary;
        /// <summary>
        /// ID of subnet.
        /// </summary>
        public readonly string SubnetName;

        [OutputConstructor]
        private ElastigroupAzureV3NetworkNetworkInterface(
            ImmutableArray<Outputs.ElastigroupAzureV3NetworkNetworkInterfaceAdditionalIpConfig> additionalIpConfigs,

            ImmutableArray<Outputs.ElastigroupAzureV3NetworkNetworkInterfaceApplicationSecurityGroup> applicationSecurityGroups,

            bool assignPublicIp,

            bool isPrimary,

            string subnetName)
        {
            AdditionalIpConfigs = additionalIpConfigs;
            ApplicationSecurityGroups = applicationSecurityGroups;
            AssignPublicIp = assignPublicIp;
            IsPrimary = isPrimary;
            SubnetName = subnetName;
        }
    }
}
