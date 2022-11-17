// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.spotinst.aws.outputs.BeanstalkManagedActionsPlatformUpdate;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BeanstalkManagedActions {
    /**
     * @return Platform Update parameters
     * 
     */
    private @Nullable BeanstalkManagedActionsPlatformUpdate platformUpdate;

    private BeanstalkManagedActions() {}
    /**
     * @return Platform Update parameters
     * 
     */
    public Optional<BeanstalkManagedActionsPlatformUpdate> platformUpdate() {
        return Optional.ofNullable(this.platformUpdate);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BeanstalkManagedActions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable BeanstalkManagedActionsPlatformUpdate platformUpdate;
        public Builder() {}
        public Builder(BeanstalkManagedActions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.platformUpdate = defaults.platformUpdate;
        }

        @CustomType.Setter
        public Builder platformUpdate(@Nullable BeanstalkManagedActionsPlatformUpdate platformUpdate) {
            this.platformUpdate = platformUpdate;
            return this;
        }
        public BeanstalkManagedActions build() {
            final var o = new BeanstalkManagedActions();
            o.platformUpdate = platformUpdate;
            return o;
        }
    }
}
