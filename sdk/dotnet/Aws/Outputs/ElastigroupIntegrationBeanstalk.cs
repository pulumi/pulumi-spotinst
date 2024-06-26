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
    public sealed class ElastigroupIntegrationBeanstalk
    {
        public readonly Outputs.ElastigroupIntegrationBeanstalkDeploymentPreferences? DeploymentPreferences;
        public readonly string? EnvironmentId;
        public readonly Outputs.ElastigroupIntegrationBeanstalkManagedActions? ManagedActions;

        [OutputConstructor]
        private ElastigroupIntegrationBeanstalk(
            Outputs.ElastigroupIntegrationBeanstalkDeploymentPreferences? deploymentPreferences,

            string? environmentId,

            Outputs.ElastigroupIntegrationBeanstalkManagedActions? managedActions)
        {
            DeploymentPreferences = deploymentPreferences;
            EnvironmentId = environmentId;
            ManagedActions = managedActions;
        }
    }
}
