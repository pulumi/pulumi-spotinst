// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.oceancd.outputs.RolloutSpecTrafficNginxAdditionalIngressAnnotation;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RolloutSpecTrafficNginx {
    private @Nullable RolloutSpecTrafficNginxAdditionalIngressAnnotation additionalIngressAnnotation;
    private @Nullable String nginxAnnotationPrefix;
    private String stableIngress;

    private RolloutSpecTrafficNginx() {}
    public Optional<RolloutSpecTrafficNginxAdditionalIngressAnnotation> additionalIngressAnnotation() {
        return Optional.ofNullable(this.additionalIngressAnnotation);
    }
    public Optional<String> nginxAnnotationPrefix() {
        return Optional.ofNullable(this.nginxAnnotationPrefix);
    }
    public String stableIngress() {
        return this.stableIngress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RolloutSpecTrafficNginx defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable RolloutSpecTrafficNginxAdditionalIngressAnnotation additionalIngressAnnotation;
        private @Nullable String nginxAnnotationPrefix;
        private String stableIngress;
        public Builder() {}
        public Builder(RolloutSpecTrafficNginx defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalIngressAnnotation = defaults.additionalIngressAnnotation;
    	      this.nginxAnnotationPrefix = defaults.nginxAnnotationPrefix;
    	      this.stableIngress = defaults.stableIngress;
        }

        @CustomType.Setter
        public Builder additionalIngressAnnotation(@Nullable RolloutSpecTrafficNginxAdditionalIngressAnnotation additionalIngressAnnotation) {

            this.additionalIngressAnnotation = additionalIngressAnnotation;
            return this;
        }
        @CustomType.Setter
        public Builder nginxAnnotationPrefix(@Nullable String nginxAnnotationPrefix) {

            this.nginxAnnotationPrefix = nginxAnnotationPrefix;
            return this;
        }
        @CustomType.Setter
        public Builder stableIngress(String stableIngress) {
            if (stableIngress == null) {
              throw new MissingRequiredPropertyException("RolloutSpecTrafficNginx", "stableIngress");
            }
            this.stableIngress = stableIngress;
            return this;
        }
        public RolloutSpecTrafficNginx build() {
            final var _resultValue = new RolloutSpecTrafficNginx();
            _resultValue.additionalIngressAnnotation = additionalIngressAnnotation;
            _resultValue.nginxAnnotationPrefix = nginxAnnotationPrefix;
            _resultValue.stableIngress = stableIngress;
            return _resultValue;
        }
    }
}
