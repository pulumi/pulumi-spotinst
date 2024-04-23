// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.aws.inputs.ElastigroupIntegrationBeanstalkManagedActionsPlatformUpdateArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupIntegrationBeanstalkManagedActionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupIntegrationBeanstalkManagedActionsArgs Empty = new ElastigroupIntegrationBeanstalkManagedActionsArgs();

    @Import(name="platformUpdate")
    private @Nullable Output<ElastigroupIntegrationBeanstalkManagedActionsPlatformUpdateArgs> platformUpdate;

    public Optional<Output<ElastigroupIntegrationBeanstalkManagedActionsPlatformUpdateArgs>> platformUpdate() {
        return Optional.ofNullable(this.platformUpdate);
    }

    private ElastigroupIntegrationBeanstalkManagedActionsArgs() {}

    private ElastigroupIntegrationBeanstalkManagedActionsArgs(ElastigroupIntegrationBeanstalkManagedActionsArgs $) {
        this.platformUpdate = $.platformUpdate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupIntegrationBeanstalkManagedActionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupIntegrationBeanstalkManagedActionsArgs $;

        public Builder() {
            $ = new ElastigroupIntegrationBeanstalkManagedActionsArgs();
        }

        public Builder(ElastigroupIntegrationBeanstalkManagedActionsArgs defaults) {
            $ = new ElastigroupIntegrationBeanstalkManagedActionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder platformUpdate(@Nullable Output<ElastigroupIntegrationBeanstalkManagedActionsPlatformUpdateArgs> platformUpdate) {
            $.platformUpdate = platformUpdate;
            return this;
        }

        public Builder platformUpdate(ElastigroupIntegrationBeanstalkManagedActionsPlatformUpdateArgs platformUpdate) {
            return platformUpdate(Output.of(platformUpdate));
        }

        public ElastigroupIntegrationBeanstalkManagedActionsArgs build() {
            return $;
        }
    }

}
