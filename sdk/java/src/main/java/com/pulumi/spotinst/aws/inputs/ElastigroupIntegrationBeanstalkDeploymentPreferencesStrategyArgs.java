// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupIntegrationBeanstalkDeploymentPreferencesStrategyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupIntegrationBeanstalkDeploymentPreferencesStrategyArgs Empty = new ElastigroupIntegrationBeanstalkDeploymentPreferencesStrategyArgs();

    @Import(name="action")
    private @Nullable Output<String> action;

    public Optional<Output<String>> action() {
        return Optional.ofNullable(this.action);
    }

    @Import(name="shouldDrainInstances")
    private @Nullable Output<Boolean> shouldDrainInstances;

    public Optional<Output<Boolean>> shouldDrainInstances() {
        return Optional.ofNullable(this.shouldDrainInstances);
    }

    private ElastigroupIntegrationBeanstalkDeploymentPreferencesStrategyArgs() {}

    private ElastigroupIntegrationBeanstalkDeploymentPreferencesStrategyArgs(ElastigroupIntegrationBeanstalkDeploymentPreferencesStrategyArgs $) {
        this.action = $.action;
        this.shouldDrainInstances = $.shouldDrainInstances;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupIntegrationBeanstalkDeploymentPreferencesStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupIntegrationBeanstalkDeploymentPreferencesStrategyArgs $;

        public Builder() {
            $ = new ElastigroupIntegrationBeanstalkDeploymentPreferencesStrategyArgs();
        }

        public Builder(ElastigroupIntegrationBeanstalkDeploymentPreferencesStrategyArgs defaults) {
            $ = new ElastigroupIntegrationBeanstalkDeploymentPreferencesStrategyArgs(Objects.requireNonNull(defaults));
        }

        public Builder action(@Nullable Output<String> action) {
            $.action = action;
            return this;
        }

        public Builder action(String action) {
            return action(Output.of(action));
        }

        public Builder shouldDrainInstances(@Nullable Output<Boolean> shouldDrainInstances) {
            $.shouldDrainInstances = shouldDrainInstances;
            return this;
        }

        public Builder shouldDrainInstances(Boolean shouldDrainInstances) {
            return shouldDrainInstances(Output.of(shouldDrainInstances));
        }

        public ElastigroupIntegrationBeanstalkDeploymentPreferencesStrategyArgs build() {
            return $;
        }
    }

}
