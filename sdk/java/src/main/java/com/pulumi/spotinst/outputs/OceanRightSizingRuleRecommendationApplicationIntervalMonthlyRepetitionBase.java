// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.outputs.OceanRightSizingRuleRecommendationApplicationIntervalMonthlyRepetitionBaseWeeklyRepetitionBase;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class OceanRightSizingRuleRecommendationApplicationIntervalMonthlyRepetitionBase {
    private List<Integer> intervalMonths;
    private List<String> weekOfTheMonths;
    private @Nullable List<OceanRightSizingRuleRecommendationApplicationIntervalMonthlyRepetitionBaseWeeklyRepetitionBase> weeklyRepetitionBases;

    private OceanRightSizingRuleRecommendationApplicationIntervalMonthlyRepetitionBase() {}
    public List<Integer> intervalMonths() {
        return this.intervalMonths;
    }
    public List<String> weekOfTheMonths() {
        return this.weekOfTheMonths;
    }
    public List<OceanRightSizingRuleRecommendationApplicationIntervalMonthlyRepetitionBaseWeeklyRepetitionBase> weeklyRepetitionBases() {
        return this.weeklyRepetitionBases == null ? List.of() : this.weeklyRepetitionBases;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanRightSizingRuleRecommendationApplicationIntervalMonthlyRepetitionBase defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<Integer> intervalMonths;
        private List<String> weekOfTheMonths;
        private @Nullable List<OceanRightSizingRuleRecommendationApplicationIntervalMonthlyRepetitionBaseWeeklyRepetitionBase> weeklyRepetitionBases;
        public Builder() {}
        public Builder(OceanRightSizingRuleRecommendationApplicationIntervalMonthlyRepetitionBase defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.intervalMonths = defaults.intervalMonths;
    	      this.weekOfTheMonths = defaults.weekOfTheMonths;
    	      this.weeklyRepetitionBases = defaults.weeklyRepetitionBases;
        }

        @CustomType.Setter
        public Builder intervalMonths(List<Integer> intervalMonths) {
            if (intervalMonths == null) {
              throw new MissingRequiredPropertyException("OceanRightSizingRuleRecommendationApplicationIntervalMonthlyRepetitionBase", "intervalMonths");
            }
            this.intervalMonths = intervalMonths;
            return this;
        }
        public Builder intervalMonths(Integer... intervalMonths) {
            return intervalMonths(List.of(intervalMonths));
        }
        @CustomType.Setter
        public Builder weekOfTheMonths(List<String> weekOfTheMonths) {
            if (weekOfTheMonths == null) {
              throw new MissingRequiredPropertyException("OceanRightSizingRuleRecommendationApplicationIntervalMonthlyRepetitionBase", "weekOfTheMonths");
            }
            this.weekOfTheMonths = weekOfTheMonths;
            return this;
        }
        public Builder weekOfTheMonths(String... weekOfTheMonths) {
            return weekOfTheMonths(List.of(weekOfTheMonths));
        }
        @CustomType.Setter
        public Builder weeklyRepetitionBases(@Nullable List<OceanRightSizingRuleRecommendationApplicationIntervalMonthlyRepetitionBaseWeeklyRepetitionBase> weeklyRepetitionBases) {

            this.weeklyRepetitionBases = weeklyRepetitionBases;
            return this;
        }
        public Builder weeklyRepetitionBases(OceanRightSizingRuleRecommendationApplicationIntervalMonthlyRepetitionBaseWeeklyRepetitionBase... weeklyRepetitionBases) {
            return weeklyRepetitionBases(List.of(weeklyRepetitionBases));
        }
        public OceanRightSizingRuleRecommendationApplicationIntervalMonthlyRepetitionBase build() {
            final var _resultValue = new OceanRightSizingRuleRecommendationApplicationIntervalMonthlyRepetitionBase();
            _resultValue.intervalMonths = intervalMonths;
            _resultValue.weekOfTheMonths = weekOfTheMonths;
            _resultValue.weeklyRepetitionBases = weeklyRepetitionBases;
            return _resultValue;
        }
    }
}
