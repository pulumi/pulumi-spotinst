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

    @Import(name="additionalIngressAnnotation")
    private @Nullable Output<RolloutSpecTrafficNginxAdditionalIngressAnnotationArgs> additionalIngressAnnotation;

    public Optional<Output<RolloutSpecTrafficNginxAdditionalIngressAnnotationArgs>> additionalIngressAnnotation() {
        return Optional.ofNullable(this.additionalIngressAnnotation);
    }

    @Import(name="nginxAnnotationPrefix")
    private @Nullable Output<String> nginxAnnotationPrefix;

    public Optional<Output<String>> nginxAnnotationPrefix() {
        return Optional.ofNullable(this.nginxAnnotationPrefix);
    }

    @Import(name="stableIngress", required=true)
    private Output<String> stableIngress;

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

        public Builder additionalIngressAnnotation(@Nullable Output<RolloutSpecTrafficNginxAdditionalIngressAnnotationArgs> additionalIngressAnnotation) {
            $.additionalIngressAnnotation = additionalIngressAnnotation;
            return this;
        }

        public Builder additionalIngressAnnotation(RolloutSpecTrafficNginxAdditionalIngressAnnotationArgs additionalIngressAnnotation) {
            return additionalIngressAnnotation(Output.of(additionalIngressAnnotation));
        }

        public Builder nginxAnnotationPrefix(@Nullable Output<String> nginxAnnotationPrefix) {
            $.nginxAnnotationPrefix = nginxAnnotationPrefix;
            return this;
        }

        public Builder nginxAnnotationPrefix(String nginxAnnotationPrefix) {
            return nginxAnnotationPrefix(Output.of(nginxAnnotationPrefix));
        }

        public Builder stableIngress(Output<String> stableIngress) {
            $.stableIngress = stableIngress;
            return this;
        }

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
