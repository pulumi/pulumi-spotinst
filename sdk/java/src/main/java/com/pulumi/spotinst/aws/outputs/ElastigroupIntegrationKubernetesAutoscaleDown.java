// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupIntegrationKubernetesAutoscaleDown {
    private @Nullable Integer evaluationPeriods;
    private @Nullable Double maxScaleDownPercentage;

    private ElastigroupIntegrationKubernetesAutoscaleDown() {}
    public Optional<Integer> evaluationPeriods() {
        return Optional.ofNullable(this.evaluationPeriods);
    }
    public Optional<Double> maxScaleDownPercentage() {
        return Optional.ofNullable(this.maxScaleDownPercentage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupIntegrationKubernetesAutoscaleDown defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer evaluationPeriods;
        private @Nullable Double maxScaleDownPercentage;
        public Builder() {}
        public Builder(ElastigroupIntegrationKubernetesAutoscaleDown defaults) {
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
        public ElastigroupIntegrationKubernetesAutoscaleDown build() {
            final var _resultValue = new ElastigroupIntegrationKubernetesAutoscaleDown();
            _resultValue.evaluationPeriods = evaluationPeriods;
            _resultValue.maxScaleDownPercentage = maxScaleDownPercentage;
            return _resultValue;
        }
    }
}
