// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.oceancd.outputs.StrategyCanaryStepSetHeaderRouteMatch;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class StrategyCanaryStepSetHeaderRoute {
    private String headerRouteName;
    private List<StrategyCanaryStepSetHeaderRouteMatch> matches;

    private StrategyCanaryStepSetHeaderRoute() {}
    public String headerRouteName() {
        return this.headerRouteName;
    }
    public List<StrategyCanaryStepSetHeaderRouteMatch> matches() {
        return this.matches;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StrategyCanaryStepSetHeaderRoute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String headerRouteName;
        private List<StrategyCanaryStepSetHeaderRouteMatch> matches;
        public Builder() {}
        public Builder(StrategyCanaryStepSetHeaderRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerRouteName = defaults.headerRouteName;
    	      this.matches = defaults.matches;
        }

        @CustomType.Setter
        public Builder headerRouteName(String headerRouteName) {
            if (headerRouteName == null) {
              throw new MissingRequiredPropertyException("StrategyCanaryStepSetHeaderRoute", "headerRouteName");
            }
            this.headerRouteName = headerRouteName;
            return this;
        }
        @CustomType.Setter
        public Builder matches(List<StrategyCanaryStepSetHeaderRouteMatch> matches) {
            if (matches == null) {
              throw new MissingRequiredPropertyException("StrategyCanaryStepSetHeaderRoute", "matches");
            }
            this.matches = matches;
            return this;
        }
        public Builder matches(StrategyCanaryStepSetHeaderRouteMatch... matches) {
            return matches(List.of(matches));
        }
        public StrategyCanaryStepSetHeaderRoute build() {
            final var _resultValue = new StrategyCanaryStepSetHeaderRoute();
            _resultValue.headerRouteName = headerRouteName;
            _resultValue.matches = matches;
            return _resultValue;
        }
    }
}
