// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupIntegrationBeanstalkManagedActionsArgs : global::Pulumi.ResourceArgs
    {
        [Input("platformUpdate")]
        public Input<Inputs.ElastigroupIntegrationBeanstalkManagedActionsPlatformUpdateArgs>? PlatformUpdate { get; set; }

        public ElastigroupIntegrationBeanstalkManagedActionsArgs()
        {
        }
        public static new ElastigroupIntegrationBeanstalkManagedActionsArgs Empty => new ElastigroupIntegrationBeanstalkManagedActionsArgs();
    }
}
