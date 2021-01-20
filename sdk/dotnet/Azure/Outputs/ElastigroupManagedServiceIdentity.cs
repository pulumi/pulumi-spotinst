// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Azure.Outputs
{

    [OutputType]
    public sealed class ElastigroupManagedServiceIdentity
    {
        /// <summary>
        /// The dimension name.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Vnet Resource Group Name.
        /// </summary>
        public readonly string ResourceGroupName;

        [OutputConstructor]
        private ElastigroupManagedServiceIdentity(
            string name,

            string resourceGroupName)
        {
            Name = name;
            ResourceGroupName = resourceGroupName;
        }
    }
}
