// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class StatefulNodeAzureStrategyRevertToSpot {
    private String performAt;

    private StatefulNodeAzureStrategyRevertToSpot() {}
    public String performAt() {
        return this.performAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulNodeAzureStrategyRevertToSpot defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String performAt;
        public Builder() {}
        public Builder(StatefulNodeAzureStrategyRevertToSpot defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.performAt = defaults.performAt;
        }

        @CustomType.Setter
        public Builder performAt(String performAt) {
            if (performAt == null) {
              throw new MissingRequiredPropertyException("StatefulNodeAzureStrategyRevertToSpot", "performAt");
            }
            this.performAt = performAt;
            return this;
        }
        public StatefulNodeAzureStrategyRevertToSpot build() {
            final var _resultValue = new StatefulNodeAzureStrategyRevertToSpot();
            _resultValue.performAt = performAt;
            return _resultValue;
        }
    }
}
