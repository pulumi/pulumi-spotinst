// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupIntegrationNomadAutoscaleHeadroom {
    /**
     * @return Cpu units for compute.
     * 
     */
    private @Nullable Integer cpuPerUnit;
    /**
     * @return RAM units for compute.
     * 
     */
    private @Nullable Integer memoryPerUnit;
    /**
     * @return Amount of units for compute.
     * 
     */
    private @Nullable Integer numOfUnits;

    private ElastigroupIntegrationNomadAutoscaleHeadroom() {}
    /**
     * @return Cpu units for compute.
     * 
     */
    public Optional<Integer> cpuPerUnit() {
        return Optional.ofNullable(this.cpuPerUnit);
    }
    /**
     * @return RAM units for compute.
     * 
     */
    public Optional<Integer> memoryPerUnit() {
        return Optional.ofNullable(this.memoryPerUnit);
    }
    /**
     * @return Amount of units for compute.
     * 
     */
    public Optional<Integer> numOfUnits() {
        return Optional.ofNullable(this.numOfUnits);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupIntegrationNomadAutoscaleHeadroom defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer cpuPerUnit;
        private @Nullable Integer memoryPerUnit;
        private @Nullable Integer numOfUnits;
        public Builder() {}
        public Builder(ElastigroupIntegrationNomadAutoscaleHeadroom defaults) {
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
        public ElastigroupIntegrationNomadAutoscaleHeadroom build() {
            final var o = new ElastigroupIntegrationNomadAutoscaleHeadroom();
            o.cpuPerUnit = cpuPerUnit;
            o.memoryPerUnit = memoryPerUnit;
            o.numOfUnits = numOfUnits;
            return o;
        }
    }
}
