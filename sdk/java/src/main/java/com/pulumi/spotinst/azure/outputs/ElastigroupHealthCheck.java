// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupHealthCheck {
    private @Nullable Boolean autoHealing;
    private @Nullable Integer gracePeriod;
    private String healthCheckType;

    private ElastigroupHealthCheck() {}
    public Optional<Boolean> autoHealing() {
        return Optional.ofNullable(this.autoHealing);
    }
    public Optional<Integer> gracePeriod() {
        return Optional.ofNullable(this.gracePeriod);
    }
    public String healthCheckType() {
        return this.healthCheckType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupHealthCheck defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean autoHealing;
        private @Nullable Integer gracePeriod;
        private String healthCheckType;
        public Builder() {}
        public Builder(ElastigroupHealthCheck defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoHealing = defaults.autoHealing;
    	      this.gracePeriod = defaults.gracePeriod;
    	      this.healthCheckType = defaults.healthCheckType;
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
        public Builder healthCheckType(String healthCheckType) {
            if (healthCheckType == null) {
              throw new MissingRequiredPropertyException("ElastigroupHealthCheck", "healthCheckType");
            }
            this.healthCheckType = healthCheckType;
            return this;
        }
        public ElastigroupHealthCheck build() {
            final var _resultValue = new ElastigroupHealthCheck();
            _resultValue.autoHealing = autoHealing;
            _resultValue.gracePeriod = gracePeriod;
            _resultValue.healthCheckType = healthCheckType;
            return _resultValue;
        }
    }
}
