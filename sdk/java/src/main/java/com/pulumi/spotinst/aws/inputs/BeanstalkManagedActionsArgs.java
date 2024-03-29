// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.aws.inputs.BeanstalkManagedActionsPlatformUpdateArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BeanstalkManagedActionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final BeanstalkManagedActionsArgs Empty = new BeanstalkManagedActionsArgs();

    /**
     * Platform Update parameters
     * 
     */
    @Import(name="platformUpdate")
    private @Nullable Output<BeanstalkManagedActionsPlatformUpdateArgs> platformUpdate;

    /**
     * @return Platform Update parameters
     * 
     */
    public Optional<Output<BeanstalkManagedActionsPlatformUpdateArgs>> platformUpdate() {
        return Optional.ofNullable(this.platformUpdate);
    }

    private BeanstalkManagedActionsArgs() {}

    private BeanstalkManagedActionsArgs(BeanstalkManagedActionsArgs $) {
        this.platformUpdate = $.platformUpdate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BeanstalkManagedActionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BeanstalkManagedActionsArgs $;

        public Builder() {
            $ = new BeanstalkManagedActionsArgs();
        }

        public Builder(BeanstalkManagedActionsArgs defaults) {
            $ = new BeanstalkManagedActionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param platformUpdate Platform Update parameters
         * 
         * @return builder
         * 
         */
        public Builder platformUpdate(@Nullable Output<BeanstalkManagedActionsPlatformUpdateArgs> platformUpdate) {
            $.platformUpdate = platformUpdate;
            return this;
        }

        /**
         * @param platformUpdate Platform Update parameters
         * 
         * @return builder
         * 
         */
        public Builder platformUpdate(BeanstalkManagedActionsPlatformUpdateArgs platformUpdate) {
            return platformUpdate(Output.of(platformUpdate));
        }

        public BeanstalkManagedActionsArgs build() {
            return $;
        }
    }

}
