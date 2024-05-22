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
        [Input("albAnnotationPrefix")]
        public Input<string>? AlbAnnotationPrefix { get; set; }

        [Input("albIngress", required: true)]
        public Input<string> AlbIngress { get; set; } = null!;

        [Input("albRootService", required: true)]
        public Input<string> AlbRootService { get; set; } = null!;

        [Input("servicePort", required: true)]
        public Input<int> ServicePort { get; set; } = null!;

        [Input("stickinessConfig")]
        public Input<Inputs.RolloutSpecTrafficAlbStickinessConfigGetArgs>? StickinessConfig { get; set; }

        public RolloutSpecTrafficAlbGetArgs()
        {
        }
        public static new RolloutSpecTrafficAlbGetArgs Empty => new RolloutSpecTrafficAlbGetArgs();
    }
}
