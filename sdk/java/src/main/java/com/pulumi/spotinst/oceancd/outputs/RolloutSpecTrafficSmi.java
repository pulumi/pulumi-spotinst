// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RolloutSpecTrafficSmi {
    /**
     * @return Holds the name of service that clients use to communicate.
     * 
     */
    private @Nullable String smiRootService;
    /**
     * @return Holds the name of the TrafficSplit.
     * 
     */
    private @Nullable String trafficSplitName;

    private RolloutSpecTrafficSmi() {}
    /**
     * @return Holds the name of service that clients use to communicate.
     * 
     */
    public Optional<String> smiRootService() {
        return Optional.ofNullable(this.smiRootService);
    }
    /**
     * @return Holds the name of the TrafficSplit.
     * 
     */
    public Optional<String> trafficSplitName() {
        return Optional.ofNullable(this.trafficSplitName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RolloutSpecTrafficSmi defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String smiRootService;
        private @Nullable String trafficSplitName;
        public Builder() {}
        public Builder(RolloutSpecTrafficSmi defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.smiRootService = defaults.smiRootService;
    	      this.trafficSplitName = defaults.trafficSplitName;
        }

        @CustomType.Setter
        public Builder smiRootService(@Nullable String smiRootService) {

            this.smiRootService = smiRootService;
            return this;
        }
        @CustomType.Setter
        public Builder trafficSplitName(@Nullable String trafficSplitName) {

            this.trafficSplitName = trafficSplitName;
            return this;
        }
        public RolloutSpecTrafficSmi build() {
            final var _resultValue = new RolloutSpecTrafficSmi();
            _resultValue.smiRootService = smiRootService;
            _resultValue.trafficSplitName = trafficSplitName;
            return _resultValue;
        }
    }
}
