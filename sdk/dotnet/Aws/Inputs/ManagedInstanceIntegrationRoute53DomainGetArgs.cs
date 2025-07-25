// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ManagedInstanceIntegrationRoute53DomainGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("hostedZoneId", required: true)]
        public Input<string> HostedZoneId { get; set; } = null!;

        [Input("recordSetType")]
        public Input<string>? RecordSetType { get; set; }

        [Input("recordSets", required: true)]
        private InputList<Inputs.ManagedInstanceIntegrationRoute53DomainRecordSetGetArgs>? _recordSets;
        public InputList<Inputs.ManagedInstanceIntegrationRoute53DomainRecordSetGetArgs> RecordSets
        {
            get => _recordSets ?? (_recordSets = new InputList<Inputs.ManagedInstanceIntegrationRoute53DomainRecordSetGetArgs>());
            set => _recordSets = value;
        }

        [Input("spotinstAcctId")]
        public Input<string>? SpotinstAcctId { get; set; }

        public ManagedInstanceIntegrationRoute53DomainGetArgs()
        {
        }
        public static new ManagedInstanceIntegrationRoute53DomainGetArgs Empty => new ManagedInstanceIntegrationRoute53DomainGetArgs();
    }
}
