// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.oceancd.inputs.RolloutSpecTrafficNginxAdditionalIngressAnnotationArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RolloutSpecTrafficNginxArgs extends com.pulumi.resources.ResourceArgs {

    public static final RolloutSpecTrafficNginxArgs Empty = new RolloutSpecTrafficNginxArgs();

    /**
     * Provides additional features to add to the canary ingress (such as routing by header, cookie, etc). You can add these Kubernetes annotations to specific Ingress objects to customize their behavior. Above are found examples of accepted k8s keys.For the full list of supported keys, you may reach the following documentation - https://kubernetes.github.io/ingress-nginx/user-guide/nginx-configuration/annotations/#canary.
     * 
     */
    @Import(name="additionalIngressAnnotation")
    private @Nullable Output<RolloutSpecTrafficNginxAdditionalIngressAnnotationArgs> additionalIngressAnnotation;

    /**
     * @return Provides additional features to add to the canary ingress (such as routing by header, cookie, etc). You can add these Kubernetes annotations to specific Ingress objects to customize their behavior. Above are found examples of accepted k8s keys.For the full list of supported keys, you may reach the following documentation - https://kubernetes.github.io/ingress-nginx/user-guide/nginx-configuration/annotations/#canary.
     * 
     */
    public Optional<Output<RolloutSpecTrafficNginxAdditionalIngressAnnotationArgs>> additionalIngressAnnotation() {
        return Optional.ofNullable(this.additionalIngressAnnotation);
    }

    /**
     * Has to match the configured annotation prefix on the Nginx ingress controller.
     * 
     */
    @Import(name="nginxAnnotationPrefix")
    private @Nullable Output<String> nginxAnnotationPrefix;

    /**
     * @return Has to match the configured annotation prefix on the Nginx ingress controller.
     * 
     */
    public Optional<Output<String>> nginxAnnotationPrefix() {
        return Optional.ofNullable(this.nginxAnnotationPrefix);
    }

    /**
     * Refers to the name of an `Ingress` resource in the same namespace as the `SpotDeployment`.
     * 
     */
    @Import(name="stableIngress", required=true)
    private Output<String> stableIngress;

    /**
     * @return Refers to the name of an `Ingress` resource in the same namespace as the `SpotDeployment`.
     * 
     */
    public Output<String> stableIngress() {
        return this.stableIngress;
    }

    private RolloutSpecTrafficNginxArgs() {}

    private RolloutSpecTrafficNginxArgs(RolloutSpecTrafficNginxArgs $) {
        this.additionalIngressAnnotation = $.additionalIngressAnnotation;
        this.nginxAnnotationPrefix = $.nginxAnnotationPrefix;
        this.stableIngress = $.stableIngress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RolloutSpecTrafficNginxArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RolloutSpecTrafficNginxArgs $;

        public Builder() {
            $ = new RolloutSpecTrafficNginxArgs();
        }

        public Builder(RolloutSpecTrafficNginxArgs defaults) {
            $ = new RolloutSpecTrafficNginxArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalIngressAnnotation Provides additional features to add to the canary ingress (such as routing by header, cookie, etc). You can add these Kubernetes annotations to specific Ingress objects to customize their behavior. Above are found examples of accepted k8s keys.For the full list of supported keys, you may reach the following documentation - https://kubernetes.github.io/ingress-nginx/user-guide/nginx-configuration/annotations/#canary.
         * 
         * @return builder
         * 
         */
        public Builder additionalIngressAnnotation(@Nullable Output<RolloutSpecTrafficNginxAdditionalIngressAnnotationArgs> additionalIngressAnnotation) {
            $.additionalIngressAnnotation = additionalIngressAnnotation;
            return this;
        }

        /**
         * @param additionalIngressAnnotation Provides additional features to add to the canary ingress (such as routing by header, cookie, etc). You can add these Kubernetes annotations to specific Ingress objects to customize their behavior. Above are found examples of accepted k8s keys.For the full list of supported keys, you may reach the following documentation - https://kubernetes.github.io/ingress-nginx/user-guide/nginx-configuration/annotations/#canary.
         * 
         * @return builder
         * 
         */
        public Builder additionalIngressAnnotation(RolloutSpecTrafficNginxAdditionalIngressAnnotationArgs additionalIngressAnnotation) {
            return additionalIngressAnnotation(Output.of(additionalIngressAnnotation));
        }

        /**
         * @param nginxAnnotationPrefix Has to match the configured annotation prefix on the Nginx ingress controller.
         * 
         * @return builder
         * 
         */
        public Builder nginxAnnotationPrefix(@Nullable Output<String> nginxAnnotationPrefix) {
            $.nginxAnnotationPrefix = nginxAnnotationPrefix;
            return this;
        }

        /**
         * @param nginxAnnotationPrefix Has to match the configured annotation prefix on the Nginx ingress controller.
         * 
         * @return builder
         * 
         */
        public Builder nginxAnnotationPrefix(String nginxAnnotationPrefix) {
            return nginxAnnotationPrefix(Output.of(nginxAnnotationPrefix));
        }

        /**
         * @param stableIngress Refers to the name of an `Ingress` resource in the same namespace as the `SpotDeployment`.
         * 
         * @return builder
         * 
         */
        public Builder stableIngress(Output<String> stableIngress) {
            $.stableIngress = stableIngress;
            return this;
        }

        /**
         * @param stableIngress Refers to the name of an `Ingress` resource in the same namespace as the `SpotDeployment`.
         * 
         * @return builder
         * 
         */
        public Builder stableIngress(String stableIngress) {
            return stableIngress(Output.of(stableIngress));
        }

        public RolloutSpecTrafficNginxArgs build() {
            if ($.stableIngress == null) {
                throw new MissingRequiredPropertyException("RolloutSpecTrafficNginxArgs", "stableIngress");
            }
            return $;
        }
    }

}
