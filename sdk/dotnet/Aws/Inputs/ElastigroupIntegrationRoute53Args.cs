// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupIntegrationRoute53Args : global::Pulumi.ResourceArgs
    {
        [Input("domains", required: true)]
        private InputList<Inputs.ElastigroupIntegrationRoute53DomainArgs>? _domains;

        /// <summary>
        /// Collection of one or more domains to register.
        /// </summary>
        public InputList<Inputs.ElastigroupIntegrationRoute53DomainArgs> Domains
        {
            get => _domains ?? (_domains = new InputList<Inputs.ElastigroupIntegrationRoute53DomainArgs>());
            set => _domains = value;
        }

        public ElastigroupIntegrationRoute53Args()
        {
        }
        public static new ElastigroupIntegrationRoute53Args Empty => new ElastigroupIntegrationRoute53Args();
    }
}
