// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class BeanstalkDeploymentPreferencesStrategyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Action to take
        /// </summary>
        [Input("action")]
        public Input<string>? Action { get; set; }

        /// <summary>
        /// Bool value if to wait to drain instance
        /// </summary>
        [Input("shouldDrainInstances")]
        public Input<bool>? ShouldDrainInstances { get; set; }

        public BeanstalkDeploymentPreferencesStrategyArgs()
        {
        }
        public static new BeanstalkDeploymentPreferencesStrategyArgs Empty => new BeanstalkDeploymentPreferencesStrategyArgs();
    }
}
