// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupIntegrationGkeAutoscaleDown {
    /**
     * @return Amount of cooldown evaluation periods for scale down.
     * 
     */
    private @Nullable Integer evaluationPeriods;

    private ElastigroupIntegrationGkeAutoscaleDown() {}
    /**
     * @return Amount of cooldown evaluation periods for scale down.
     * 
     */
    public Optional<Integer> evaluationPeriods() {
        return Optional.ofNullable(this.evaluationPeriods);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupIntegrationGkeAutoscaleDown defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer evaluationPeriods;
        public Builder() {}
        public Builder(ElastigroupIntegrationGkeAutoscaleDown defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.evaluationPeriods = defaults.evaluationPeriods;
        }

        @CustomType.Setter
        public Builder evaluationPeriods(@Nullable Integer evaluationPeriods) {

            this.evaluationPeriods = evaluationPeriods;
            return this;
        }
        public ElastigroupIntegrationGkeAutoscaleDown build() {
            final var _resultValue = new ElastigroupIntegrationGkeAutoscaleDown();
            _resultValue.evaluationPeriods = evaluationPeriods;
            return _resultValue;
        }
    }
}
