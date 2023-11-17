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
    public sealed class ElastigroupIntegrationBeanstalkDeploymentPreferences
    {
        /// <summary>
        /// Should roll perform automatically
        /// </summary>
        public readonly bool? AutomaticRoll;
        /// <summary>
        /// Percent size of each batch
        /// </summary>
        public readonly int? BatchSizePercentage;
        /// <summary>
        /// Amount of time to wait between batches
        /// </summary>
        public readonly int? GracePeriod;
        /// <summary>
        /// Strategy parameters
        /// </summary>
        public readonly Outputs.ElastigroupIntegrationBeanstalkDeploymentPreferencesStrategy? Strategy;

        [OutputConstructor]
        private ElastigroupIntegrationBeanstalkDeploymentPreferences(
            bool? automaticRoll,

            int? batchSizePercentage,

            int? gracePeriod,

            Outputs.ElastigroupIntegrationBeanstalkDeploymentPreferencesStrategy? strategy)
        {
            AutomaticRoll = automaticRoll;
            BatchSizePercentage = batchSizePercentage;
            GracePeriod = gracePeriod;
            Strategy = strategy;
        }
    }
}
