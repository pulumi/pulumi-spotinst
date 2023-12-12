// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanScheduledTaskShutdownHours {
    private @Nullable Boolean isEnabled;
    private List<String> timeWindows;

    private OceanScheduledTaskShutdownHours() {}
    public Optional<Boolean> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }
    public List<String> timeWindows() {
        return this.timeWindows;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanScheduledTaskShutdownHours defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean isEnabled;
        private List<String> timeWindows;
        public Builder() {}
        public Builder(OceanScheduledTaskShutdownHours defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isEnabled = defaults.isEnabled;
    	      this.timeWindows = defaults.timeWindows;
        }

        @CustomType.Setter
        public Builder isEnabled(@Nullable Boolean isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder timeWindows(List<String> timeWindows) {
            this.timeWindows = Objects.requireNonNull(timeWindows);
            return this;
        }
        public Builder timeWindows(String... timeWindows) {
            return timeWindows(List.of(timeWindows));
        }
        public OceanScheduledTaskShutdownHours build() {
            final var _resultValue = new OceanScheduledTaskShutdownHours();
            _resultValue.isEnabled = isEnabled;
            _resultValue.timeWindows = timeWindows;
            return _resultValue;
        }
    }
}
