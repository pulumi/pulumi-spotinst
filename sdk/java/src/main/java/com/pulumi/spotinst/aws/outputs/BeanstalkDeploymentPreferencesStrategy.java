// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BeanstalkDeploymentPreferencesStrategy {
    /**
     * @return Action to take
     * 
     */
    private @Nullable String action;
    /**
     * @return Bool value if to wait to drain instance
     * 
     */
    private @Nullable Boolean shouldDrainInstances;

    private BeanstalkDeploymentPreferencesStrategy() {}
    /**
     * @return Action to take
     * 
     */
    public Optional<String> action() {
        return Optional.ofNullable(this.action);
    }
    /**
     * @return Bool value if to wait to drain instance
     * 
     */
    public Optional<Boolean> shouldDrainInstances() {
        return Optional.ofNullable(this.shouldDrainInstances);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BeanstalkDeploymentPreferencesStrategy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String action;
        private @Nullable Boolean shouldDrainInstances;
        public Builder() {}
        public Builder(BeanstalkDeploymentPreferencesStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.shouldDrainInstances = defaults.shouldDrainInstances;
        }

        @CustomType.Setter
        public Builder action(@Nullable String action) {
            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder shouldDrainInstances(@Nullable Boolean shouldDrainInstances) {
            this.shouldDrainInstances = shouldDrainInstances;
            return this;
        }
        public BeanstalkDeploymentPreferencesStrategy build() {
            final var o = new BeanstalkDeploymentPreferencesStrategy();
            o.action = action;
            o.shouldDrainInstances = shouldDrainInstances;
            return o;
        }
    }
}