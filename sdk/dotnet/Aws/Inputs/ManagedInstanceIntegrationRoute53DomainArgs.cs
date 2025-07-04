// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ManagedInstanceIntegrationRoute53DomainArgs : global::Pulumi.ResourceArgs
    {
        [Input("hostedZoneId", required: true)]
        public Input<string> HostedZoneId { get; set; } = null!;

        [Input("recordSetType")]
        public Input<string>? RecordSetType { get; set; }

        [Input("recordSets", required: true)]
        private InputList<Inputs.ManagedInstanceIntegrationRoute53DomainRecordSetArgs>? _recordSets;
        public InputList<Inputs.ManagedInstanceIntegrationRoute53DomainRecordSetArgs> RecordSets
        {
            get => _recordSets ?? (_recordSets = new InputList<Inputs.ManagedInstanceIntegrationRoute53DomainRecordSetArgs>());
            set => _recordSets = value;
        }

        [Input("spotinstAcctId")]
        public Input<string>? SpotinstAcctId { get; set; }

        public ManagedInstanceIntegrationRoute53DomainArgs()
        {
        }
        public static new ManagedInstanceIntegrationRoute53DomainArgs Empty => new ManagedInstanceIntegrationRoute53DomainArgs();
    }
}
