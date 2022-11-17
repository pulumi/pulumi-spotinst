// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanImportAutoscalerDown {
    /**
     * @return The number of evaluation periods that should accumulate before a scale down action takes place.
     * 
     */
    private @Nullable Integer evaluationPeriods;
    /**
     * @return Would represent the maximum % to scale-down. Number between 1-100.
     * 
     */
    private @Nullable Double maxScaleDownPercentage;

    private OceanImportAutoscalerDown() {}
    /**
     * @return The number of evaluation periods that should accumulate before a scale down action takes place.
     * 
     */
    public Optional<Integer> evaluationPeriods() {
        return Optional.ofNullable(this.evaluationPeriods);
    }
    /**
     * @return Would represent the maximum % to scale-down. Number between 1-100.
     * 
     */
    public Optional<Double> maxScaleDownPercentage() {
        return Optional.ofNullable(this.maxScaleDownPercentage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanImportAutoscalerDown defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer evaluationPeriods;
        private @Nullable Double maxScaleDownPercentage;
        public Builder() {}
        public Builder(OceanImportAutoscalerDown defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.evaluationPeriods = defaults.evaluationPeriods;
    	      this.maxScaleDownPercentage = defaults.maxScaleDownPercentage;
        }

        @CustomType.Setter
        public Builder evaluationPeriods(@Nullable Integer evaluationPeriods) {
            this.evaluationPeriods = evaluationPeriods;
            return this;
        }
        @CustomType.Setter
        public Builder maxScaleDownPercentage(@Nullable Double maxScaleDownPercentage) {
            this.maxScaleDownPercentage = maxScaleDownPercentage;
            return this;
        }
        public OceanImportAutoscalerDown build() {
            final var o = new OceanImportAutoscalerDown();
            o.evaluationPeriods = evaluationPeriods;
            o.maxScaleDownPercentage = maxScaleDownPercentage;
            return o;
        }
    }
}
