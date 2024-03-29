// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanNpAutoscalerAutoscaleHeadroomAutomatic {
    private @Nullable Boolean isEnabled;
    private @Nullable Integer percentage;

    private OceanNpAutoscalerAutoscaleHeadroomAutomatic() {}
    public Optional<Boolean> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }
    public Optional<Integer> percentage() {
        return Optional.ofNullable(this.percentage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanNpAutoscalerAutoscaleHeadroomAutomatic defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean isEnabled;
        private @Nullable Integer percentage;
        public Builder() {}
        public Builder(OceanNpAutoscalerAutoscaleHeadroomAutomatic defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isEnabled = defaults.isEnabled;
    	      this.percentage = defaults.percentage;
        }

        @CustomType.Setter
        public Builder isEnabled(@Nullable Boolean isEnabled) {

            this.isEnabled = isEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder percentage(@Nullable Integer percentage) {

            this.percentage = percentage;
            return this;
        }
        public OceanNpAutoscalerAutoscaleHeadroomAutomatic build() {
            final var _resultValue = new OceanNpAutoscalerAutoscaleHeadroomAutomatic();
            _resultValue.isEnabled = isEnabled;
            _resultValue.percentage = percentage;
            return _resultValue;
        }
    }
}
