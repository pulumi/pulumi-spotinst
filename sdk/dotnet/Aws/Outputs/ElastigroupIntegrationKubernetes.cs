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
    public sealed class ElastigroupIntegrationKubernetes
    {
        public readonly string? ApiServer;
        public readonly int? AutoscaleCooldown;
        public readonly Outputs.ElastigroupIntegrationKubernetesAutoscaleDown? AutoscaleDown;
        public readonly Outputs.ElastigroupIntegrationKubernetesAutoscaleHeadroom? AutoscaleHeadroom;
        public readonly bool? AutoscaleIsAutoConfig;
        public readonly bool? AutoscaleIsEnabled;
        public readonly ImmutableArray<Outputs.ElastigroupIntegrationKubernetesAutoscaleLabel> AutoscaleLabels;
        public readonly string? ClusterIdentifier;
        public readonly string? IntegrationMode;
        public readonly string? Token;

        [OutputConstructor]
        private ElastigroupIntegrationKubernetes(
            string? apiServer,

            int? autoscaleCooldown,

            Outputs.ElastigroupIntegrationKubernetesAutoscaleDown? autoscaleDown,

            Outputs.ElastigroupIntegrationKubernetesAutoscaleHeadroom? autoscaleHeadroom,

            bool? autoscaleIsAutoConfig,

            bool? autoscaleIsEnabled,

            ImmutableArray<Outputs.ElastigroupIntegrationKubernetesAutoscaleLabel> autoscaleLabels,

            string? clusterIdentifier,

            string? integrationMode,

            string? token)
        {
            ApiServer = apiServer;
            AutoscaleCooldown = autoscaleCooldown;
            AutoscaleDown = autoscaleDown;
            AutoscaleHeadroom = autoscaleHeadroom;
            AutoscaleIsAutoConfig = autoscaleIsAutoConfig;
            AutoscaleIsEnabled = autoscaleIsEnabled;
            AutoscaleLabels = autoscaleLabels;
            ClusterIdentifier = clusterIdentifier;
            IntegrationMode = integrationMode;
            Token = token;
        }
    }
}