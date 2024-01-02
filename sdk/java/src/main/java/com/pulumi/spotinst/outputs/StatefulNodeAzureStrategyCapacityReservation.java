// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.outputs.StatefulNodeAzureStrategyCapacityReservationCapacityReservationGroup;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class StatefulNodeAzureStrategyCapacityReservation {
    private @Nullable List<StatefulNodeAzureStrategyCapacityReservationCapacityReservationGroup> capacityReservationGroups;
    private Boolean shouldUtilize;
    private String utilizationStrategy;

    private StatefulNodeAzureStrategyCapacityReservation() {}
    public List<StatefulNodeAzureStrategyCapacityReservationCapacityReservationGroup> capacityReservationGroups() {
        return this.capacityReservationGroups == null ? List.of() : this.capacityReservationGroups;
    }
    public Boolean shouldUtilize() {
        return this.shouldUtilize;
    }
    public String utilizationStrategy() {
        return this.utilizationStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulNodeAzureStrategyCapacityReservation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<StatefulNodeAzureStrategyCapacityReservationCapacityReservationGroup> capacityReservationGroups;
        private Boolean shouldUtilize;
        private String utilizationStrategy;
        public Builder() {}
        public Builder(StatefulNodeAzureStrategyCapacityReservation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityReservationGroups = defaults.capacityReservationGroups;
    	      this.shouldUtilize = defaults.shouldUtilize;
    	      this.utilizationStrategy = defaults.utilizationStrategy;
        }

        @CustomType.Setter
        public Builder capacityReservationGroups(@Nullable List<StatefulNodeAzureStrategyCapacityReservationCapacityReservationGroup> capacityReservationGroups) {

            this.capacityReservationGroups = capacityReservationGroups;
            return this;
        }
        public Builder capacityReservationGroups(StatefulNodeAzureStrategyCapacityReservationCapacityReservationGroup... capacityReservationGroups) {
            return capacityReservationGroups(List.of(capacityReservationGroups));
        }
        @CustomType.Setter
        public Builder shouldUtilize(Boolean shouldUtilize) {
            if (shouldUtilize == null) {
              throw new MissingRequiredPropertyException("StatefulNodeAzureStrategyCapacityReservation", "shouldUtilize");
            }
            this.shouldUtilize = shouldUtilize;
            return this;
        }
        @CustomType.Setter
        public Builder utilizationStrategy(String utilizationStrategy) {
            if (utilizationStrategy == null) {
              throw new MissingRequiredPropertyException("StatefulNodeAzureStrategyCapacityReservation", "utilizationStrategy");
            }
            this.utilizationStrategy = utilizationStrategy;
            return this;
        }
        public StatefulNodeAzureStrategyCapacityReservation build() {
            final var _resultValue = new StatefulNodeAzureStrategyCapacityReservation();
            _resultValue.capacityReservationGroups = capacityReservationGroups;
            _resultValue.shouldUtilize = shouldUtilize;
            _resultValue.utilizationStrategy = utilizationStrategy;
            return _resultValue;
        }
    }
}
