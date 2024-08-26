// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanImportScheduledTaskShutdownHours {
    /**
     * @return Flag to enable / disable the shutdown hours.
     * Example: `true`
     * 
     */
    private @Nullable Boolean isEnabled;
    /**
     * @return Set time windows for shutdown hours. specify a list of &#39;timeWindows&#39; with at least one time window Each string is in the format of - ddd:hh:mm-ddd:hh:mm ddd = day of week = Sun | Mon | Tue | Wed | Thu | Fri | Sat hh = hour 24 = 0 -23 mm = minute = 0 - 59. Time windows should not overlap. required on cluster.scheduling.isEnabled = `true`. API Times are in UTC
     * Example: Fri:15:30-Wed:14:30
     * 
     */
    private List<String> timeWindows;

    private OceanImportScheduledTaskShutdownHours() {}
    /**
     * @return Flag to enable / disable the shutdown hours.
     * Example: `true`
     * 
     */
    public Optional<Boolean> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }
    /**
     * @return Set time windows for shutdown hours. specify a list of &#39;timeWindows&#39; with at least one time window Each string is in the format of - ddd:hh:mm-ddd:hh:mm ddd = day of week = Sun | Mon | Tue | Wed | Thu | Fri | Sat hh = hour 24 = 0 -23 mm = minute = 0 - 59. Time windows should not overlap. required on cluster.scheduling.isEnabled = `true`. API Times are in UTC
     * Example: Fri:15:30-Wed:14:30
     * 
     */
    public List<String> timeWindows() {
        return this.timeWindows;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanImportScheduledTaskShutdownHours defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean isEnabled;
        private List<String> timeWindows;
        public Builder() {}
        public Builder(OceanImportScheduledTaskShutdownHours defaults) {
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
            if (timeWindows == null) {
              throw new MissingRequiredPropertyException("OceanImportScheduledTaskShutdownHours", "timeWindows");
            }
            this.timeWindows = timeWindows;
            return this;
        }
        public Builder timeWindows(String... timeWindows) {
            return timeWindows(List.of(timeWindows));
        }
        public OceanImportScheduledTaskShutdownHours build() {
            final var _resultValue = new OceanImportScheduledTaskShutdownHours();
            _resultValue.isEnabled = isEnabled;
            _resultValue.timeWindows = timeWindows;
            return _resultValue;
        }
    }
}
