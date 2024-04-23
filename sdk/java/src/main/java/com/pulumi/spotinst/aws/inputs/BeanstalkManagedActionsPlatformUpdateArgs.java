// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BeanstalkManagedActionsPlatformUpdateArgs extends com.pulumi.resources.ResourceArgs {

    public static final BeanstalkManagedActionsPlatformUpdateArgs Empty = new BeanstalkManagedActionsPlatformUpdateArgs();

    @Import(name="performAt")
    private @Nullable Output<String> performAt;

    public Optional<Output<String>> performAt() {
        return Optional.ofNullable(this.performAt);
    }

    @Import(name="timeWindow")
    private @Nullable Output<String> timeWindow;

    public Optional<Output<String>> timeWindow() {
        return Optional.ofNullable(this.timeWindow);
    }

    @Import(name="updateLevel")
    private @Nullable Output<String> updateLevel;

    public Optional<Output<String>> updateLevel() {
        return Optional.ofNullable(this.updateLevel);
    }

    private BeanstalkManagedActionsPlatformUpdateArgs() {}

    private BeanstalkManagedActionsPlatformUpdateArgs(BeanstalkManagedActionsPlatformUpdateArgs $) {
        this.performAt = $.performAt;
        this.timeWindow = $.timeWindow;
        this.updateLevel = $.updateLevel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BeanstalkManagedActionsPlatformUpdateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BeanstalkManagedActionsPlatformUpdateArgs $;

        public Builder() {
            $ = new BeanstalkManagedActionsPlatformUpdateArgs();
        }

        public Builder(BeanstalkManagedActionsPlatformUpdateArgs defaults) {
            $ = new BeanstalkManagedActionsPlatformUpdateArgs(Objects.requireNonNull(defaults));
        }

        public Builder performAt(@Nullable Output<String> performAt) {
            $.performAt = performAt;
            return this;
        }

        public Builder performAt(String performAt) {
            return performAt(Output.of(performAt));
        }

        public Builder timeWindow(@Nullable Output<String> timeWindow) {
            $.timeWindow = timeWindow;
            return this;
        }

        public Builder timeWindow(String timeWindow) {
            return timeWindow(Output.of(timeWindow));
        }

        public Builder updateLevel(@Nullable Output<String> updateLevel) {
            $.updateLevel = updateLevel;
            return this;
        }

        public Builder updateLevel(String updateLevel) {
            return updateLevel(Output.of(updateLevel));
        }

        public BeanstalkManagedActionsPlatformUpdateArgs build() {
            return $;
        }
    }

}
