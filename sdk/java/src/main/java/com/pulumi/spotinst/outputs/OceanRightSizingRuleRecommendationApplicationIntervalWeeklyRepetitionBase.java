// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class OceanRightSizingRuleRecommendationApplicationIntervalWeeklyRepetitionBase {
    private List<String> intervalDays;
    private String intervalHoursEndTime;
    private String intervalHoursStartTime;

    private OceanRightSizingRuleRecommendationApplicationIntervalWeeklyRepetitionBase() {}
    public List<String> intervalDays() {
        return this.intervalDays;
    }
    public String intervalHoursEndTime() {
        return this.intervalHoursEndTime;
    }
    public String intervalHoursStartTime() {
        return this.intervalHoursStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanRightSizingRuleRecommendationApplicationIntervalWeeklyRepetitionBase defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> intervalDays;
        private String intervalHoursEndTime;
        private String intervalHoursStartTime;
        public Builder() {}
        public Builder(OceanRightSizingRuleRecommendationApplicationIntervalWeeklyRepetitionBase defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.intervalDays = defaults.intervalDays;
    	      this.intervalHoursEndTime = defaults.intervalHoursEndTime;
    	      this.intervalHoursStartTime = defaults.intervalHoursStartTime;
        }

        @CustomType.Setter
        public Builder intervalDays(List<String> intervalDays) {
            if (intervalDays == null) {
              throw new MissingRequiredPropertyException("OceanRightSizingRuleRecommendationApplicationIntervalWeeklyRepetitionBase", "intervalDays");
            }
            this.intervalDays = intervalDays;
            return this;
        }
        public Builder intervalDays(String... intervalDays) {
            return intervalDays(List.of(intervalDays));
        }
        @CustomType.Setter
        public Builder intervalHoursEndTime(String intervalHoursEndTime) {
            if (intervalHoursEndTime == null) {
              throw new MissingRequiredPropertyException("OceanRightSizingRuleRecommendationApplicationIntervalWeeklyRepetitionBase", "intervalHoursEndTime");
            }
            this.intervalHoursEndTime = intervalHoursEndTime;
            return this;
        }
        @CustomType.Setter
        public Builder intervalHoursStartTime(String intervalHoursStartTime) {
            if (intervalHoursStartTime == null) {
              throw new MissingRequiredPropertyException("OceanRightSizingRuleRecommendationApplicationIntervalWeeklyRepetitionBase", "intervalHoursStartTime");
            }
            this.intervalHoursStartTime = intervalHoursStartTime;
            return this;
        }
        public OceanRightSizingRuleRecommendationApplicationIntervalWeeklyRepetitionBase build() {
            final var _resultValue = new OceanRightSizingRuleRecommendationApplicationIntervalWeeklyRepetitionBase();
            _resultValue.intervalDays = intervalDays;
            _resultValue.intervalHoursEndTime = intervalHoursEndTime;
            _resultValue.intervalHoursStartTime = intervalHoursStartTime;
            return _resultValue;
        }
    }
}