// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanImportScheduledTaskShutdownHoursArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanImportScheduledTaskShutdownHoursArgs Empty = new OceanImportScheduledTaskShutdownHoursArgs();

    /**
     * Flag to enable / disable the shutdown hours.
     * Example: True
     * 
     */
    @Import(name="isEnabled")
    private @Nullable Output<Boolean> isEnabled;

    /**
     * @return Flag to enable / disable the shutdown hours.
     * Example: True
     * 
     */
    public Optional<Output<Boolean>> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }

    /**
     * Set time windows for shutdown hours. specify a list of &#39;timeWindows&#39; with at least one time window Each string is in the format of - ddd:hh:mm-ddd:hh:mm ddd = day of week = Sun | Mon | Tue | Wed | Thu | Fri | Sat hh = hour 24 = 0 -23 mm = minute = 0 - 59. Time windows should not overlap. required on cluster.scheduling.isEnabled = True. API Times are in UTC
     * Example: Fri:15:30-Wed:14:30
     * 
     */
    @Import(name="timeWindows", required=true)
    private Output<List<String>> timeWindows;

    /**
     * @return Set time windows for shutdown hours. specify a list of &#39;timeWindows&#39; with at least one time window Each string is in the format of - ddd:hh:mm-ddd:hh:mm ddd = day of week = Sun | Mon | Tue | Wed | Thu | Fri | Sat hh = hour 24 = 0 -23 mm = minute = 0 - 59. Time windows should not overlap. required on cluster.scheduling.isEnabled = True. API Times are in UTC
     * Example: Fri:15:30-Wed:14:30
     * 
     */
    public Output<List<String>> timeWindows() {
        return this.timeWindows;
    }

    private OceanImportScheduledTaskShutdownHoursArgs() {}

    private OceanImportScheduledTaskShutdownHoursArgs(OceanImportScheduledTaskShutdownHoursArgs $) {
        this.isEnabled = $.isEnabled;
        this.timeWindows = $.timeWindows;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanImportScheduledTaskShutdownHoursArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanImportScheduledTaskShutdownHoursArgs $;

        public Builder() {
            $ = new OceanImportScheduledTaskShutdownHoursArgs();
        }

        public Builder(OceanImportScheduledTaskShutdownHoursArgs defaults) {
            $ = new OceanImportScheduledTaskShutdownHoursArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param isEnabled Flag to enable / disable the shutdown hours.
         * Example: True
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(@Nullable Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        /**
         * @param isEnabled Flag to enable / disable the shutdown hours.
         * Example: True
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        /**
         * @param timeWindows Set time windows for shutdown hours. specify a list of &#39;timeWindows&#39; with at least one time window Each string is in the format of - ddd:hh:mm-ddd:hh:mm ddd = day of week = Sun | Mon | Tue | Wed | Thu | Fri | Sat hh = hour 24 = 0 -23 mm = minute = 0 - 59. Time windows should not overlap. required on cluster.scheduling.isEnabled = True. API Times are in UTC
         * Example: Fri:15:30-Wed:14:30
         * 
         * @return builder
         * 
         */
        public Builder timeWindows(Output<List<String>> timeWindows) {
            $.timeWindows = timeWindows;
            return this;
        }

        /**
         * @param timeWindows Set time windows for shutdown hours. specify a list of &#39;timeWindows&#39; with at least one time window Each string is in the format of - ddd:hh:mm-ddd:hh:mm ddd = day of week = Sun | Mon | Tue | Wed | Thu | Fri | Sat hh = hour 24 = 0 -23 mm = minute = 0 - 59. Time windows should not overlap. required on cluster.scheduling.isEnabled = True. API Times are in UTC
         * Example: Fri:15:30-Wed:14:30
         * 
         * @return builder
         * 
         */
        public Builder timeWindows(List<String> timeWindows) {
            return timeWindows(Output.of(timeWindows));
        }

        /**
         * @param timeWindows Set time windows for shutdown hours. specify a list of &#39;timeWindows&#39; with at least one time window Each string is in the format of - ddd:hh:mm-ddd:hh:mm ddd = day of week = Sun | Mon | Tue | Wed | Thu | Fri | Sat hh = hour 24 = 0 -23 mm = minute = 0 - 59. Time windows should not overlap. required on cluster.scheduling.isEnabled = True. API Times are in UTC
         * Example: Fri:15:30-Wed:14:30
         * 
         * @return builder
         * 
         */
        public Builder timeWindows(String... timeWindows) {
            return timeWindows(List.of(timeWindows));
        }

        public OceanImportScheduledTaskShutdownHoursArgs build() {
            $.timeWindows = Objects.requireNonNull($.timeWindows, "expected parameter 'timeWindows' to be non-null");
            return $;
        }
    }

}