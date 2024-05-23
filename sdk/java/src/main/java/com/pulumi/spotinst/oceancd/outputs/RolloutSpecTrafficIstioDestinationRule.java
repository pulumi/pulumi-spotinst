// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RolloutSpecTrafficIstioDestinationRule {
    /**
     * @return The subset name to modify labels with the canary version.
     * 
     */
    private String canarySubsetName;
    /**
     * @return Holds the name of the DestinationRule.
     * 
     */
    private String destinationRuleName;
    /**
     * @return The subset name to modify labels with the stable version.
     * 
     */
    private String stableSubsetName;

    private RolloutSpecTrafficIstioDestinationRule() {}
    /**
     * @return The subset name to modify labels with the canary version.
     * 
     */
    public String canarySubsetName() {
        return this.canarySubsetName;
    }
    /**
     * @return Holds the name of the DestinationRule.
     * 
     */
    public String destinationRuleName() {
        return this.destinationRuleName;
    }
    /**
     * @return The subset name to modify labels with the stable version.
     * 
     */
    public String stableSubsetName() {
        return this.stableSubsetName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RolloutSpecTrafficIstioDestinationRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String canarySubsetName;
        private String destinationRuleName;
        private String stableSubsetName;
        public Builder() {}
        public Builder(RolloutSpecTrafficIstioDestinationRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canarySubsetName = defaults.canarySubsetName;
    	      this.destinationRuleName = defaults.destinationRuleName;
    	      this.stableSubsetName = defaults.stableSubsetName;
        }

        @CustomType.Setter
        public Builder canarySubsetName(String canarySubsetName) {
            if (canarySubsetName == null) {
              throw new MissingRequiredPropertyException("RolloutSpecTrafficIstioDestinationRule", "canarySubsetName");
            }
            this.canarySubsetName = canarySubsetName;
            return this;
        }
        @CustomType.Setter
        public Builder destinationRuleName(String destinationRuleName) {
            if (destinationRuleName == null) {
              throw new MissingRequiredPropertyException("RolloutSpecTrafficIstioDestinationRule", "destinationRuleName");
            }
            this.destinationRuleName = destinationRuleName;
            return this;
        }
        @CustomType.Setter
        public Builder stableSubsetName(String stableSubsetName) {
            if (stableSubsetName == null) {
              throw new MissingRequiredPropertyException("RolloutSpecTrafficIstioDestinationRule", "stableSubsetName");
            }
            this.stableSubsetName = stableSubsetName;
            return this;
        }
        public RolloutSpecTrafficIstioDestinationRule build() {
            final var _resultValue = new RolloutSpecTrafficIstioDestinationRule();
            _resultValue.canarySubsetName = canarySubsetName;
            _resultValue.destinationRuleName = destinationRuleName;
            _resultValue.stableSubsetName = stableSubsetName;
            return _resultValue;
        }
    }
}
