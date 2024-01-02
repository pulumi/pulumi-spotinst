// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.outputs.StatefulNodeAzureStrategyCapacityReservation;
import com.pulumi.spotinst.outputs.StatefulNodeAzureStrategyRevertToSpot;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StatefulNodeAzureStrategy {
    private @Nullable List<StatefulNodeAzureStrategyCapacityReservation> capacityReservations;
    private @Nullable Integer drainingTimeout;
    private Boolean fallbackToOnDemand;
    private @Nullable List<String> optimizationWindows;
    private @Nullable String preferredLifeCycle;
    private @Nullable StatefulNodeAzureStrategyRevertToSpot revertToSpot;

    private StatefulNodeAzureStrategy() {}
    public List<StatefulNodeAzureStrategyCapacityReservation> capacityReservations() {
        return this.capacityReservations == null ? List.of() : this.capacityReservations;
    }
    public Optional<Integer> drainingTimeout() {
        return Optional.ofNullable(this.drainingTimeout);
    }
    public Boolean fallbackToOnDemand() {
        return this.fallbackToOnDemand;
    }
    public List<String> optimizationWindows() {
        return this.optimizationWindows == null ? List.of() : this.optimizationWindows;
    }
    public Optional<String> preferredLifeCycle() {
        return Optional.ofNullable(this.preferredLifeCycle);
    }
    public Optional<StatefulNodeAzureStrategyRevertToSpot> revertToSpot() {
        return Optional.ofNullable(this.revertToSpot);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulNodeAzureStrategy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<StatefulNodeAzureStrategyCapacityReservation> capacityReservations;
        private @Nullable Integer drainingTimeout;
        private Boolean fallbackToOnDemand;
        private @Nullable List<String> optimizationWindows;
        private @Nullable String preferredLifeCycle;
        private @Nullable StatefulNodeAzureStrategyRevertToSpot revertToSpot;
        public Builder() {}
        public Builder(StatefulNodeAzureStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityReservations = defaults.capacityReservations;
    	      this.drainingTimeout = defaults.drainingTimeout;
    	      this.fallbackToOnDemand = defaults.fallbackToOnDemand;
    	      this.optimizationWindows = defaults.optimizationWindows;
    	      this.preferredLifeCycle = defaults.preferredLifeCycle;
    	      this.revertToSpot = defaults.revertToSpot;
        }

        @CustomType.Setter
        public Builder capacityReservations(@Nullable List<StatefulNodeAzureStrategyCapacityReservation> capacityReservations) {

            this.capacityReservations = capacityReservations;
            return this;
        }
        public Builder capacityReservations(StatefulNodeAzureStrategyCapacityReservation... capacityReservations) {
            return capacityReservations(List.of(capacityReservations));
        }
        @CustomType.Setter
        public Builder drainingTimeout(@Nullable Integer drainingTimeout) {

            this.drainingTimeout = drainingTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder fallbackToOnDemand(Boolean fallbackToOnDemand) {
            if (fallbackToOnDemand == null) {
              throw new MissingRequiredPropertyException("StatefulNodeAzureStrategy", "fallbackToOnDemand");
            }
            this.fallbackToOnDemand = fallbackToOnDemand;
            return this;
        }
        @CustomType.Setter
        public Builder optimizationWindows(@Nullable List<String> optimizationWindows) {

            this.optimizationWindows = optimizationWindows;
            return this;
        }
        public Builder optimizationWindows(String... optimizationWindows) {
            return optimizationWindows(List.of(optimizationWindows));
        }
        @CustomType.Setter
        public Builder preferredLifeCycle(@Nullable String preferredLifeCycle) {

            this.preferredLifeCycle = preferredLifeCycle;
            return this;
        }
        @CustomType.Setter
        public Builder revertToSpot(@Nullable StatefulNodeAzureStrategyRevertToSpot revertToSpot) {

            this.revertToSpot = revertToSpot;
            return this;
        }
        public StatefulNodeAzureStrategy build() {
            final var _resultValue = new StatefulNodeAzureStrategy();
            _resultValue.capacityReservations = capacityReservations;
            _resultValue.drainingTimeout = drainingTimeout;
            _resultValue.fallbackToOnDemand = fallbackToOnDemand;
            _resultValue.optimizationWindows = optimizationWindows;
            _resultValue.preferredLifeCycle = preferredLifeCycle;
            _resultValue.revertToSpot = revertToSpot;
            return _resultValue;
        }
    }
}
