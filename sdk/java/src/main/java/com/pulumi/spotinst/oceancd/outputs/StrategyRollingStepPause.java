// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StrategyRollingStepPause {
    private @Nullable String duration;

    private StrategyRollingStepPause() {}
    public Optional<String> duration() {
        return Optional.ofNullable(this.duration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StrategyRollingStepPause defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String duration;
        public Builder() {}
        public Builder(StrategyRollingStepPause defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
        }

        @CustomType.Setter
        public Builder duration(@Nullable String duration) {

            this.duration = duration;
            return this;
        }
        public StrategyRollingStepPause build() {
            final var _resultValue = new StrategyRollingStepPause();
            _resultValue.duration = duration;
            return _resultValue;
        }
    }
}
