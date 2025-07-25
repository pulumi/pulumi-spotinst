// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst.Oceancd.Outputs
{

    [OutputType]
    public sealed class RolloutSpecTrafficNginx
    {
        /// <summary>
        /// Provides additional features to add to the canary ingress (such as routing by header, cookie, etc). You can add these Kubernetes annotations to specific Ingress objects to customize their behavior. Above are found examples of accepted k8s keys.For the full list of supported keys, you may reach the following documentation - https://kubernetes.github.io/ingress-nginx/user-guide/nginx-configuration/annotations/#canary.
        /// </summary>
        public readonly Outputs.RolloutSpecTrafficNginxAdditionalIngressAnnotation? AdditionalIngressAnnotation;
        /// <summary>
        /// Has to match the configured annotation prefix on the Nginx ingress controller.
        /// </summary>
        public readonly string? NginxAnnotationPrefix;
        /// <summary>
        /// Refers to the name of an `Ingress` resource in the same namespace as the `SpotDeployment`.
        /// </summary>
        public readonly string StableIngress;

        [OutputConstructor]
        private RolloutSpecTrafficNginx(
            Outputs.RolloutSpecTrafficNginxAdditionalIngressAnnotation? additionalIngressAnnotation,

            string? nginxAnnotationPrefix,

            string stableIngress)
        {
            AdditionalIngressAnnotation = additionalIngressAnnotation;
            NginxAnnotationPrefix = nginxAnnotationPrefix;
            StableIngress = stableIngress;
        }
    }
}
