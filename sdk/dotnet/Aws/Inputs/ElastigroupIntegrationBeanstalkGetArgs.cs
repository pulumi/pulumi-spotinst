// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupIntegrationBeanstalkGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("deploymentPreferences")]
        public Input<Inputs.ElastigroupIntegrationBeanstalkDeploymentPreferencesGetArgs>? DeploymentPreferences { get; set; }

        [Input("environmentId")]
        public Input<string>? EnvironmentId { get; set; }

        [Input("managedActions")]
        public Input<Inputs.ElastigroupIntegrationBeanstalkManagedActionsGetArgs>? ManagedActions { get; set; }

        public ElastigroupIntegrationBeanstalkGetArgs()
        {
        }
        public static new ElastigroupIntegrationBeanstalkGetArgs Empty => new ElastigroupIntegrationBeanstalkGetArgs();
    }
}
