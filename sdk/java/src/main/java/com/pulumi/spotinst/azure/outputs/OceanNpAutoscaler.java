// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.spotinst.azure.outputs.OceanNpAutoscalerAutoscaleDown;
import com.pulumi.spotinst.azure.outputs.OceanNpAutoscalerAutoscaleHeadroom;
import com.pulumi.spotinst.azure.outputs.OceanNpAutoscalerResourceLimits;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanNpAutoscaler {
    private @Nullable OceanNpAutoscalerAutoscaleDown autoscaleDown;
    private @Nullable OceanNpAutoscalerAutoscaleHeadroom autoscaleHeadroom;
    private @Nullable Boolean autoscaleIsEnabled;
    private @Nullable OceanNpAutoscalerResourceLimits resourceLimits;

    private OceanNpAutoscaler() {}
    public Optional<OceanNpAutoscalerAutoscaleDown> autoscaleDown() {
        return Optional.ofNullable(this.autoscaleDown);
    }
    public Optional<OceanNpAutoscalerAutoscaleHeadroom> autoscaleHeadroom() {
        return Optional.ofNullable(this.autoscaleHeadroom);
    }
    public Optional<Boolean> autoscaleIsEnabled() {
        return Optional.ofNullable(this.autoscaleIsEnabled);
    }
    public Optional<OceanNpAutoscalerResourceLimits> resourceLimits() {
        return Optional.ofNullable(this.resourceLimits);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanNpAutoscaler defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable OceanNpAutoscalerAutoscaleDown autoscaleDown;
        private @Nullable OceanNpAutoscalerAutoscaleHeadroom autoscaleHeadroom;
        private @Nullable Boolean autoscaleIsEnabled;
        private @Nullable OceanNpAutoscalerResourceLimits resourceLimits;
        public Builder() {}
        public Builder(OceanNpAutoscaler defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscaleDown = defaults.autoscaleDown;
    	      this.autoscaleHeadroom = defaults.autoscaleHeadroom;
    	      this.autoscaleIsEnabled = defaults.autoscaleIsEnabled;
    	      this.resourceLimits = defaults.resourceLimits;
        }

        @CustomType.Setter
        public Builder autoscaleDown(@Nullable OceanNpAutoscalerAutoscaleDown autoscaleDown) {
            this.autoscaleDown = autoscaleDown;
            return this;
        }
        @CustomType.Setter
        public Builder autoscaleHeadroom(@Nullable OceanNpAutoscalerAutoscaleHeadroom autoscaleHeadroom) {
            this.autoscaleHeadroom = autoscaleHeadroom;
            return this;
        }
        @CustomType.Setter
        public Builder autoscaleIsEnabled(@Nullable Boolean autoscaleIsEnabled) {
            this.autoscaleIsEnabled = autoscaleIsEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder resourceLimits(@Nullable OceanNpAutoscalerResourceLimits resourceLimits) {
            this.resourceLimits = resourceLimits;
            return this;
        }
        public OceanNpAutoscaler build() {
            final var _resultValue = new OceanNpAutoscaler();
            _resultValue.autoscaleDown = autoscaleDown;
            _resultValue.autoscaleHeadroom = autoscaleHeadroom;
            _resultValue.autoscaleIsEnabled = autoscaleIsEnabled;
            _resultValue.resourceLimits = resourceLimits;
            return _resultValue;
        }
    }
}
