// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupScalingUpPolicyDimension {
    private String name;
    private @Nullable String value;

    private ElastigroupScalingUpPolicyDimension() {}
    public String name() {
        return this.name;
    }
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupScalingUpPolicyDimension defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private @Nullable String value;
        public Builder() {}
        public Builder(ElastigroupScalingUpPolicyDimension defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public ElastigroupScalingUpPolicyDimension build() {
            final var o = new ElastigroupScalingUpPolicyDimension();
            o.name = name;
            o.value = value;
            return o;
        }
    }
}
