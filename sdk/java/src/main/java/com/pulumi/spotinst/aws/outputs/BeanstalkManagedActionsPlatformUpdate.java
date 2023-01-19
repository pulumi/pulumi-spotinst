// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BeanstalkManagedActionsPlatformUpdate {
    /**
     * @return Actions to perform (options: timeWindow, never)
     * 
     */
    private @Nullable String performAt;
    /**
     * @return Time Window for when action occurs ex. Mon:23:50-Tue:00:20
     * 
     */
    private @Nullable String timeWindow;
    /**
     * @return Level to update
     * 
     */
    private @Nullable String updateLevel;

    private BeanstalkManagedActionsPlatformUpdate() {}
    /**
     * @return Actions to perform (options: timeWindow, never)
     * 
     */
    public Optional<String> performAt() {
        return Optional.ofNullable(this.performAt);
    }
    /**
     * @return Time Window for when action occurs ex. Mon:23:50-Tue:00:20
     * 
     */
    public Optional<String> timeWindow() {
        return Optional.ofNullable(this.timeWindow);
    }
    /**
     * @return Level to update
     * 
     */
    public Optional<String> updateLevel() {
        return Optional.ofNullable(this.updateLevel);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BeanstalkManagedActionsPlatformUpdate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String performAt;
        private @Nullable String timeWindow;
        private @Nullable String updateLevel;
        public Builder() {}
        public Builder(BeanstalkManagedActionsPlatformUpdate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.performAt = defaults.performAt;
    	      this.timeWindow = defaults.timeWindow;
    	      this.updateLevel = defaults.updateLevel;
        }

        @CustomType.Setter
        public Builder performAt(@Nullable String performAt) {
            this.performAt = performAt;
            return this;
        }
        @CustomType.Setter
        public Builder timeWindow(@Nullable String timeWindow) {
            this.timeWindow = timeWindow;
            return this;
        }
        @CustomType.Setter
        public Builder updateLevel(@Nullable String updateLevel) {
            this.updateLevel = updateLevel;
            return this;
        }
        public BeanstalkManagedActionsPlatformUpdate build() {
            final var o = new BeanstalkManagedActionsPlatformUpdate();
            o.performAt = performAt;
            o.timeWindow = timeWindow;
            o.updateLevel = updateLevel;
            return o;
        }
    }
}
