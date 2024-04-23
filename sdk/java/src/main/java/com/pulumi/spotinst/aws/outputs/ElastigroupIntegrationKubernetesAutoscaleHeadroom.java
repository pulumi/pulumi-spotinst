// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupIntegrationKubernetesAutoscaleHeadroom {
    private @Nullable Integer cpuPerUnit;
    private @Nullable Integer memoryPerUnit;
    private @Nullable Integer numOfUnits;

    private ElastigroupIntegrationKubernetesAutoscaleHeadroom() {}
    public Optional<Integer> cpuPerUnit() {
        return Optional.ofNullable(this.cpuPerUnit);
    }
    public Optional<Integer> memoryPerUnit() {
        return Optional.ofNullable(this.memoryPerUnit);
    }
    public Optional<Integer> numOfUnits() {
        return Optional.ofNullable(this.numOfUnits);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupIntegrationKubernetesAutoscaleHeadroom defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer cpuPerUnit;
        private @Nullable Integer memoryPerUnit;
        private @Nullable Integer numOfUnits;
        public Builder() {}
        public Builder(ElastigroupIntegrationKubernetesAutoscaleHeadroom defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuPerUnit = defaults.cpuPerUnit;
    	      this.memoryPerUnit = defaults.memoryPerUnit;
    	      this.numOfUnits = defaults.numOfUnits;
        }

        @CustomType.Setter
        public Builder cpuPerUnit(@Nullable Integer cpuPerUnit) {

            this.cpuPerUnit = cpuPerUnit;
            return this;
        }
        @CustomType.Setter
        public Builder memoryPerUnit(@Nullable Integer memoryPerUnit) {

            this.memoryPerUnit = memoryPerUnit;
            return this;
        }
        @CustomType.Setter
        public Builder numOfUnits(@Nullable Integer numOfUnits) {

            this.numOfUnits = numOfUnits;
            return this;
        }
        public ElastigroupIntegrationKubernetesAutoscaleHeadroom build() {
            final var _resultValue = new ElastigroupIntegrationKubernetesAutoscaleHeadroom();
            _resultValue.cpuPerUnit = cpuPerUnit;
            _resultValue.memoryPerUnit = memoryPerUnit;
            _resultValue.numOfUnits = numOfUnits;
            return _resultValue;
        }
    }
}
