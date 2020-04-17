// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Aws.Inputs
{

    public sealed class BeanstalkDeploymentPreferencesGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Should roll perform automatically
        /// </summary>
        [Input("automaticRoll")]
        public Input<bool>? AutomaticRoll { get; set; }

        /// <summary>
        /// Percent size of each batch
        /// </summary>
        [Input("batchSizePercentage")]
        public Input<int>? BatchSizePercentage { get; set; }

        /// <summary>
        /// Amount of time to wait between batches
        /// </summary>
        [Input("gracePeriod")]
        public Input<int>? GracePeriod { get; set; }

        [Input("strategies")]
        private InputList<Inputs.BeanstalkDeploymentPreferencesStrategyGetArgs>? _strategies;

        /// <summary>
        /// Strategy parameters
        /// </summary>
        public InputList<Inputs.BeanstalkDeploymentPreferencesStrategyGetArgs> Strategies
        {
            get => _strategies ?? (_strategies = new InputList<Inputs.BeanstalkDeploymentPreferencesStrategyGetArgs>());
            set => _strategies = value;
        }

        public BeanstalkDeploymentPreferencesGetArgs()
        {
        }
    }
}
