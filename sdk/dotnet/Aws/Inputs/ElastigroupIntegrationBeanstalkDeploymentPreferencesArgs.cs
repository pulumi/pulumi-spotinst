// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class ElastigroupIntegrationBeanstalkDeploymentPreferencesArgs : global::Pulumi.ResourceArgs
    {
        [Input("automaticRoll")]
        public Input<bool>? AutomaticRoll { get; set; }

        [Input("batchSizePercentage")]
        public Input<int>? BatchSizePercentage { get; set; }

        [Input("gracePeriod")]
        public Input<int>? GracePeriod { get; set; }

        [Input("strategy")]
        public Input<Inputs.ElastigroupIntegrationBeanstalkDeploymentPreferencesStrategyArgs>? Strategy { get; set; }

        public ElastigroupIntegrationBeanstalkDeploymentPreferencesArgs()
        {
        }
        public static new ElastigroupIntegrationBeanstalkDeploymentPreferencesArgs Empty => new ElastigroupIntegrationBeanstalkDeploymentPreferencesArgs();
    }
}
