// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.outputs.ElastigroupAzureV3CapacityReservationCapacityReservationGroups;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupAzureV3CapacityReservation {
    private @Nullable ElastigroupAzureV3CapacityReservationCapacityReservationGroups capacityReservationGroups;
    private Boolean shouldUtilize;
    private String utilizationStrategy;

    private ElastigroupAzureV3CapacityReservation() {}
    public Optional<ElastigroupAzureV3CapacityReservationCapacityReservationGroups> capacityReservationGroups() {
        return Optional.ofNullable(this.capacityReservationGroups);
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

    public static Builder builder(ElastigroupAzureV3CapacityReservation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ElastigroupAzureV3CapacityReservationCapacityReservationGroups capacityReservationGroups;
        private Boolean shouldUtilize;
        private String utilizationStrategy;
        public Builder() {}
        public Builder(ElastigroupAzureV3CapacityReservation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityReservationGroups = defaults.capacityReservationGroups;
    	      this.shouldUtilize = defaults.shouldUtilize;
    	      this.utilizationStrategy = defaults.utilizationStrategy;
        }

        @CustomType.Setter
        public Builder capacityReservationGroups(@Nullable ElastigroupAzureV3CapacityReservationCapacityReservationGroups capacityReservationGroups) {

            this.capacityReservationGroups = capacityReservationGroups;
            return this;
        }
        @CustomType.Setter
        public Builder shouldUtilize(Boolean shouldUtilize) {
            if (shouldUtilize == null) {
              throw new MissingRequiredPropertyException("ElastigroupAzureV3CapacityReservation", "shouldUtilize");
            }
            this.shouldUtilize = shouldUtilize;
            return this;
        }
        @CustomType.Setter
        public Builder utilizationStrategy(String utilizationStrategy) {
            if (utilizationStrategy == null) {
              throw new MissingRequiredPropertyException("ElastigroupAzureV3CapacityReservation", "utilizationStrategy");
            }
            this.utilizationStrategy = utilizationStrategy;
            return this;
        }
        public ElastigroupAzureV3CapacityReservation build() {
            final var _resultValue = new ElastigroupAzureV3CapacityReservation();
            _resultValue.capacityReservationGroups = capacityReservationGroups;
            _resultValue.shouldUtilize = shouldUtilize;
            _resultValue.utilizationStrategy = utilizationStrategy;
            return _resultValue;
        }
    }
}
