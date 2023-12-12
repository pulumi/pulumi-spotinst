// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ManagedInstanceRevertToSpot {
    private String performAt;

    private ManagedInstanceRevertToSpot() {}
    public String performAt() {
        return this.performAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedInstanceRevertToSpot defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String performAt;
        public Builder() {}
        public Builder(ManagedInstanceRevertToSpot defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.performAt = defaults.performAt;
        }

        @CustomType.Setter
        public Builder performAt(String performAt) {
            this.performAt = Objects.requireNonNull(performAt);
            return this;
        }
        public ManagedInstanceRevertToSpot build() {
            final var _resultValue = new ManagedInstanceRevertToSpot();
            _resultValue.performAt = performAt;
            return _resultValue;
        }
    }
}
