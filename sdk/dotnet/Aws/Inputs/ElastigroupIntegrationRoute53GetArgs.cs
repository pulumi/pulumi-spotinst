// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupIntegrationRoute53GetArgs : global::Pulumi.ResourceArgs
    {
        [Input("domains", required: true)]
        private InputList<Inputs.ElastigroupIntegrationRoute53DomainGetArgs>? _domains;
        public InputList<Inputs.ElastigroupIntegrationRoute53DomainGetArgs> Domains
        {
            get => _domains ?? (_domains = new InputList<Inputs.ElastigroupIntegrationRoute53DomainGetArgs>());
            set => _domains = value;
        }

        public ElastigroupIntegrationRoute53GetArgs()
        {
        }
        public static new ElastigroupIntegrationRoute53GetArgs Empty => new ElastigroupIntegrationRoute53GetArgs();
    }
}
