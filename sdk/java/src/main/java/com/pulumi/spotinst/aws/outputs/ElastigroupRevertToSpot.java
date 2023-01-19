// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupRevertToSpot {
    /**
     * @return In the event of a fallback to On-Demand instances, select the time period to revert back to Spot. Supported Arguments – always (default), timeWindow, never. For timeWindow or never to be valid the group must have availabilityOriented OR persistence defined.
     * 
     */
    private String performAt;
    /**
     * @return Specify a list of time windows for to execute revertToSpot strategy. Time window format: `ddd:hh:mm-ddd:hh:mm`. Example: `Mon:03:00-Wed:02:30`
     * 
     */
    private @Nullable List<String> timeWindows;

    private ElastigroupRevertToSpot() {}
    /**
     * @return In the event of a fallback to On-Demand instances, select the time period to revert back to Spot. Supported Arguments – always (default), timeWindow, never. For timeWindow or never to be valid the group must have availabilityOriented OR persistence defined.
     * 
     */
    public String performAt() {
        return this.performAt;
    }
    /**
     * @return Specify a list of time windows for to execute revertToSpot strategy. Time window format: `ddd:hh:mm-ddd:hh:mm`. Example: `Mon:03:00-Wed:02:30`
     * 
     */
    public List<String> timeWindows() {
        return this.timeWindows == null ? List.of() : this.timeWindows;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupRevertToSpot defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String performAt;
        private @Nullable List<String> timeWindows;
        public Builder() {}
        public Builder(ElastigroupRevertToSpot defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.performAt = defaults.performAt;
    	      this.timeWindows = defaults.timeWindows;
        }

        @CustomType.Setter
        public Builder performAt(String performAt) {
            this.performAt = Objects.requireNonNull(performAt);
            return this;
        }
        @CustomType.Setter
        public Builder timeWindows(@Nullable List<String> timeWindows) {
            this.timeWindows = timeWindows;
            return this;
        }
        public Builder timeWindows(String... timeWindows) {
            return timeWindows(List.of(timeWindows));
        }
        public ElastigroupRevertToSpot build() {
            final var o = new ElastigroupRevertToSpot();
            o.performAt = performAt;
            o.timeWindows = timeWindows;
            return o;
        }
    }
}
