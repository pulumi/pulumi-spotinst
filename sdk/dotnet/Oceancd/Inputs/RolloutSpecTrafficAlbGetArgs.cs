// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Inputs
{

    public sealed class RolloutSpecTrafficAlbGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Has to match the configured annotation prefix on the alb ingress controller.
        /// </summary>
        [Input("albAnnotationPrefix")]
        public Input<string>? AlbAnnotationPrefix { get; set; }

        /// <summary>
        /// Refers to the name of an `Ingress` resource in the same namespace as the `SpotDeployment`.
        /// </summary>
        [Input("albIngress", required: true)]
        public Input<string> AlbIngress { get; set; } = null!;

        /// <summary>
        /// References the service in the ingress to the controller should add the action to.
        /// </summary>
        [Input("albRootService", required: true)]
        public Input<string> AlbRootService { get; set; } = null!;

        /// <summary>
        /// Refers to the port that the Ingress action should route traffic to.
        /// </summary>
        [Input("servicePort", required: true)]
        public Input<int> ServicePort { get; set; } = null!;

        /// <summary>
        /// Allows to specify further settings on the ForwardConfig.
        /// </summary>
        [Input("stickinessConfig")]
        public Input<Inputs.RolloutSpecTrafficAlbStickinessConfigGetArgs>? StickinessConfig { get; set; }

        public RolloutSpecTrafficAlbGetArgs()
        {
        }
        public static new RolloutSpecTrafficAlbGetArgs Empty => new RolloutSpecTrafficAlbGetArgs();
    }
}