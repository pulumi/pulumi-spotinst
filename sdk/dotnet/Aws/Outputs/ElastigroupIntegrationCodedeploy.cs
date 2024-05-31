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
    public sealed class ElastigroupIntegrationCodedeploy
    {
        public readonly bool CleanupOnFailure;
        public readonly ImmutableArray<Outputs.ElastigroupIntegrationCodedeployDeploymentGroup> DeploymentGroups;
        public readonly bool TerminateInstanceOnFailure;

        [OutputConstructor]
        private ElastigroupIntegrationCodedeploy(
            bool cleanupOnFailure,

            ImmutableArray<Outputs.ElastigroupIntegrationCodedeployDeploymentGroup> deploymentGroups,

            bool terminateInstanceOnFailure)
        {
            CleanupOnFailure = cleanupOnFailure;
            DeploymentGroups = deploymentGroups;
            TerminateInstanceOnFailure = terminateInstanceOnFailure;
        }
    }
}