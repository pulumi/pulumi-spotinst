// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.spark.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanIngressLoadBalancer {
    private @Nullable Boolean managed;
    private @Nullable Map<String,String> serviceAnnotations;
    private @Nullable String targetGroupArn;

    private OceanIngressLoadBalancer() {}
    public Optional<Boolean> managed() {
        return Optional.ofNullable(this.managed);
    }
    public Map<String,String> serviceAnnotations() {
        return this.serviceAnnotations == null ? Map.of() : this.serviceAnnotations;
    }
    public Optional<String> targetGroupArn() {
        return Optional.ofNullable(this.targetGroupArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanIngressLoadBalancer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean managed;
        private @Nullable Map<String,String> serviceAnnotations;
        private @Nullable String targetGroupArn;
        public Builder() {}
        public Builder(OceanIngressLoadBalancer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managed = defaults.managed;
    	      this.serviceAnnotations = defaults.serviceAnnotations;
    	      this.targetGroupArn = defaults.targetGroupArn;
        }

        @CustomType.Setter
        public Builder managed(@Nullable Boolean managed) {
            this.managed = managed;
            return this;
        }
        @CustomType.Setter
        public Builder serviceAnnotations(@Nullable Map<String,String> serviceAnnotations) {
            this.serviceAnnotations = serviceAnnotations;
            return this;
        }
        @CustomType.Setter
        public Builder targetGroupArn(@Nullable String targetGroupArn) {
            this.targetGroupArn = targetGroupArn;
            return this;
        }
        public OceanIngressLoadBalancer build() {
            final var o = new OceanIngressLoadBalancer();
            o.managed = managed;
            o.serviceAnnotations = serviceAnnotations;
            o.targetGroupArn = targetGroupArn;
            return o;
        }
    }
}
