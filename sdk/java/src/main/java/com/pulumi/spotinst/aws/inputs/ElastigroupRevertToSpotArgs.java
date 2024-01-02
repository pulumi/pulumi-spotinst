// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupRevertToSpotArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupRevertToSpotArgs Empty = new ElastigroupRevertToSpotArgs();

    /**
     * In the event of a fallback to On-Demand instances, select the time period to revert back to Spot. Supported Arguments – always (default), timeWindow, never. For timeWindow or never to be valid the group must have availabilityOriented OR persistence defined.
     * 
     */
    @Import(name="performAt", required=true)
    private Output<String> performAt;

    /**
     * @return In the event of a fallback to On-Demand instances, select the time period to revert back to Spot. Supported Arguments – always (default), timeWindow, never. For timeWindow or never to be valid the group must have availabilityOriented OR persistence defined.
     * 
     */
    public Output<String> performAt() {
        return this.performAt;
    }

    /**
     * Specify a list of time windows for to execute revertToSpot strategy. Time window format: `ddd:hh:mm-ddd:hh:mm`. Example: `Mon:03:00-Wed:02:30`
     * 
     */
    @Import(name="timeWindows")
    private @Nullable Output<List<String>> timeWindows;

    /**
     * @return Specify a list of time windows for to execute revertToSpot strategy. Time window format: `ddd:hh:mm-ddd:hh:mm`. Example: `Mon:03:00-Wed:02:30`
     * 
     */
    public Optional<Output<List<String>>> timeWindows() {
        return Optional.ofNullable(this.timeWindows);
    }

    private ElastigroupRevertToSpotArgs() {}

    private ElastigroupRevertToSpotArgs(ElastigroupRevertToSpotArgs $) {
        this.performAt = $.performAt;
        this.timeWindows = $.timeWindows;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupRevertToSpotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupRevertToSpotArgs $;

        public Builder() {
            $ = new ElastigroupRevertToSpotArgs();
        }

        public Builder(ElastigroupRevertToSpotArgs defaults) {
            $ = new ElastigroupRevertToSpotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param performAt In the event of a fallback to On-Demand instances, select the time period to revert back to Spot. Supported Arguments – always (default), timeWindow, never. For timeWindow or never to be valid the group must have availabilityOriented OR persistence defined.
         * 
         * @return builder
         * 
         */
        public Builder performAt(Output<String> performAt) {
            $.performAt = performAt;
            return this;
        }

        /**
         * @param performAt In the event of a fallback to On-Demand instances, select the time period to revert back to Spot. Supported Arguments – always (default), timeWindow, never. For timeWindow or never to be valid the group must have availabilityOriented OR persistence defined.
         * 
         * @return builder
         * 
         */
        public Builder performAt(String performAt) {
            return performAt(Output.of(performAt));
        }

        /**
         * @param timeWindows Specify a list of time windows for to execute revertToSpot strategy. Time window format: `ddd:hh:mm-ddd:hh:mm`. Example: `Mon:03:00-Wed:02:30`
         * 
         * @return builder
         * 
         */
        public Builder timeWindows(@Nullable Output<List<String>> timeWindows) {
            $.timeWindows = timeWindows;
            return this;
        }

        /**
         * @param timeWindows Specify a list of time windows for to execute revertToSpot strategy. Time window format: `ddd:hh:mm-ddd:hh:mm`. Example: `Mon:03:00-Wed:02:30`
         * 
         * @return builder
         * 
         */
        public Builder timeWindows(List<String> timeWindows) {
            return timeWindows(Output.of(timeWindows));
        }

        /**
         * @param timeWindows Specify a list of time windows for to execute revertToSpot strategy. Time window format: `ddd:hh:mm-ddd:hh:mm`. Example: `Mon:03:00-Wed:02:30`
         * 
         * @return builder
         * 
         */
        public Builder timeWindows(String... timeWindows) {
            return timeWindows(List.of(timeWindows));
        }

        public ElastigroupRevertToSpotArgs build() {
            if ($.performAt == null) {
                throw new MissingRequiredPropertyException("ElastigroupRevertToSpotArgs", "performAt");
            }
            return $;
        }
    }

}
