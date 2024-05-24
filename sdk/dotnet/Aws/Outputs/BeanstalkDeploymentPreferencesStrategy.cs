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
    public sealed class BeanstalkDeploymentPreferencesStrategy
    {
        /// <summary>
        /// Action to take
        /// </summary>
        public readonly string? Action;
        /// <summary>
        /// Bool value if to wait to drain instance
        /// </summary>
        public readonly bool? ShouldDrainInstances;

        [OutputConstructor]
        private BeanstalkDeploymentPreferencesStrategy(
            string? action,

            bool? shouldDrainInstances)
        {
            Action = action;
            ShouldDrainInstances = shouldDrainInstances;
        }
    }
}
