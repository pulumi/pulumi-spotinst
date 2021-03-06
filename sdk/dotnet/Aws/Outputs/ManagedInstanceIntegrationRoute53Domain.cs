// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Outputs
{

    [OutputType]
    public sealed class ManagedInstanceIntegrationRoute53Domain
    {
        /// <summary>
        /// The Route 53 Hosted Zone Id for the registered Domain.
        /// </summary>
        public readonly string HostedZoneId;
        /// <summary>
        /// The type of the record set. Valid values: `"a"`, `"cname"`.
        /// </summary>
        public readonly string? RecordSetType;
        /// <summary>
        /// List of record sets
        /// </summary>
        public readonly ImmutableArray<Outputs.ManagedInstanceIntegrationRoute53DomainRecordSet> RecordSets;
        /// <summary>
        /// The Spotinst account ID that is linked to the AWS account that holds the Route 53 hosted Zone Id. The default is the user Spotinst account provided as a URL parameter.
        /// </summary>
        public readonly string? SpotinstAcctId;

        [OutputConstructor]
        private ManagedInstanceIntegrationRoute53Domain(
            string hostedZoneId,

            string? recordSetType,

            ImmutableArray<Outputs.ManagedInstanceIntegrationRoute53DomainRecordSet> recordSets,

            string? spotinstAcctId)
        {
            HostedZoneId = hostedZoneId;
            RecordSetType = recordSetType;
            RecordSets = recordSets;
            SpotinstAcctId = spotinstAcctId;
        }
    }
}
