// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupAzureV3Health {
    private @Nullable Boolean autoHealing;
    private @Nullable Integer gracePeriod;
    private @Nullable List<String> healthCheckTypes;
    private @Nullable Integer unhealthyDuration;

    private ElastigroupAzureV3Health() {}
    public Optional<Boolean> autoHealing() {
        return Optional.ofNullable(this.autoHealing);
    }
    public Optional<Integer> gracePeriod() {
        return Optional.ofNullable(this.gracePeriod);
    }
    public List<String> healthCheckTypes() {
        return this.healthCheckTypes == null ? List.of() : this.healthCheckTypes;
    }
    public Optional<Integer> unhealthyDuration() {
        return Optional.ofNullable(this.unhealthyDuration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupAzureV3Health defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean autoHealing;
        private @Nullable Integer gracePeriod;
        private @Nullable List<String> healthCheckTypes;
        private @Nullable Integer unhealthyDuration;
        public Builder() {}
        public Builder(ElastigroupAzureV3Health defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoHealing = defaults.autoHealing;
    	      this.gracePeriod = defaults.gracePeriod;
    	      this.healthCheckTypes = defaults.healthCheckTypes;
    	      this.unhealthyDuration = defaults.unhealthyDuration;
        }

        @CustomType.Setter
        public Builder autoHealing(@Nullable Boolean autoHealing) {

            this.autoHealing = autoHealing;
            return this;
        }
        @CustomType.Setter
        public Builder gracePeriod(@Nullable Integer gracePeriod) {

            this.gracePeriod = gracePeriod;
            return this;
        }
        @CustomType.Setter
        public Builder healthCheckTypes(@Nullable List<String> healthCheckTypes) {

            this.healthCheckTypes = healthCheckTypes;
            return this;
        }
        public Builder healthCheckTypes(String... healthCheckTypes) {
            return healthCheckTypes(List.of(healthCheckTypes));
        }
        @CustomType.Setter
        public Builder unhealthyDuration(@Nullable Integer unhealthyDuration) {

            this.unhealthyDuration = unhealthyDuration;
            return this;
        }
        public ElastigroupAzureV3Health build() {
            final var _resultValue = new ElastigroupAzureV3Health();
            _resultValue.autoHealing = autoHealing;
            _resultValue.gracePeriod = gracePeriod;
            _resultValue.healthCheckTypes = healthCheckTypes;
            _resultValue.unhealthyDuration = unhealthyDuration;
            return _resultValue;
        }
    }
}
