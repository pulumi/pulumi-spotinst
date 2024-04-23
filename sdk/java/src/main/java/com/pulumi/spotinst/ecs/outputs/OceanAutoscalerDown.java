// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanAutoscalerDown {
    private @Nullable Double maxScaleDownPercentage;

    private OceanAutoscalerDown() {}
    public Optional<Double> maxScaleDownPercentage() {
        return Optional.ofNullable(this.maxScaleDownPercentage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanAutoscalerDown defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Double maxScaleDownPercentage;
        public Builder() {}
        public Builder(OceanAutoscalerDown defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxScaleDownPercentage = defaults.maxScaleDownPercentage;
        }

        @CustomType.Setter
        public Builder maxScaleDownPercentage(@Nullable Double maxScaleDownPercentage) {

            this.maxScaleDownPercentage = maxScaleDownPercentage;
            return this;
        }
        public OceanAutoscalerDown build() {
            final var _resultValue = new OceanAutoscalerDown();
            _resultValue.maxScaleDownPercentage = maxScaleDownPercentage;
            return _resultValue;
        }
    }
}
