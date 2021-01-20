// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ManagedInstanceIntegrationRoute53DomainArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Route 53 Hosted Zone Id for the registered Domain.
        /// </summary>
        [Input("hostedZoneId", required: true)]
        public Input<string> HostedZoneId { get; set; } = null!;

        /// <summary>
        /// The type of the record set. Valid values: `"a"`, `"cname"`.
        /// </summary>
        [Input("recordSetType")]
        public Input<string>? RecordSetType { get; set; }

        [Input("recordSets", required: true)]
        private InputList<Inputs.ManagedInstanceIntegrationRoute53DomainRecordSetArgs>? _recordSets;

        /// <summary>
        /// List of record sets
        /// </summary>
        public InputList<Inputs.ManagedInstanceIntegrationRoute53DomainRecordSetArgs> RecordSets
        {
            get => _recordSets ?? (_recordSets = new InputList<Inputs.ManagedInstanceIntegrationRoute53DomainRecordSetArgs>());
            set => _recordSets = value;
        }

        /// <summary>
        /// The Spotinst account ID that is linked to the AWS account that holds the Route 53 hosted Zone Id. The default is the user Spotinst account provided as a URL parameter.
        /// </summary>
        [Input("spotinstAcctId")]
        public Input<string>? SpotinstAcctId { get; set; }

        public ManagedInstanceIntegrationRoute53DomainArgs()
        {
        }
    }
}
