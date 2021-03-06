// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ManagedInstanceIntegrationRoute53GetArgs : Pulumi.ResourceArgs
    {
        [Input("domains", required: true)]
        private InputList<Inputs.ManagedInstanceIntegrationRoute53DomainGetArgs>? _domains;

        /// <summary>
        /// Route 53 Domain configurations.
        /// </summary>
        public InputList<Inputs.ManagedInstanceIntegrationRoute53DomainGetArgs> Domains
        {
            get => _domains ?? (_domains = new InputList<Inputs.ManagedInstanceIntegrationRoute53DomainGetArgs>());
            set => _domains = value;
        }

        public ManagedInstanceIntegrationRoute53GetArgs()
        {
        }
    }
}
