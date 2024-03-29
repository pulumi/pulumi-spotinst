// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.aws.inputs.ElastigroupIntegrationBeanstalkDeploymentPreferencesArgs;
import com.pulumi.spotinst.aws.inputs.ElastigroupIntegrationBeanstalkManagedActionsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupIntegrationBeanstalkArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupIntegrationBeanstalkArgs Empty = new ElastigroupIntegrationBeanstalkArgs();

    /**
     * Preferences when performing a roll
     * 
     */
    @Import(name="deploymentPreferences")
    private @Nullable Output<ElastigroupIntegrationBeanstalkDeploymentPreferencesArgs> deploymentPreferences;

    /**
     * @return Preferences when performing a roll
     * 
     */
    public Optional<Output<ElastigroupIntegrationBeanstalkDeploymentPreferencesArgs>> deploymentPreferences() {
        return Optional.ofNullable(this.deploymentPreferences);
    }

    @Import(name="environmentId")
    private @Nullable Output<String> environmentId;

    public Optional<Output<String>> environmentId() {
        return Optional.ofNullable(this.environmentId);
    }

    /**
     * Managed Actions parameters
     * 
     */
    @Import(name="managedActions")
    private @Nullable Output<ElastigroupIntegrationBeanstalkManagedActionsArgs> managedActions;

    /**
     * @return Managed Actions parameters
     * 
     */
    public Optional<Output<ElastigroupIntegrationBeanstalkManagedActionsArgs>> managedActions() {
        return Optional.ofNullable(this.managedActions);
    }

    private ElastigroupIntegrationBeanstalkArgs() {}

    private ElastigroupIntegrationBeanstalkArgs(ElastigroupIntegrationBeanstalkArgs $) {
        this.deploymentPreferences = $.deploymentPreferences;
        this.environmentId = $.environmentId;
        this.managedActions = $.managedActions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupIntegrationBeanstalkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupIntegrationBeanstalkArgs $;

        public Builder() {
            $ = new ElastigroupIntegrationBeanstalkArgs();
        }

        public Builder(ElastigroupIntegrationBeanstalkArgs defaults) {
            $ = new ElastigroupIntegrationBeanstalkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deploymentPreferences Preferences when performing a roll
         * 
         * @return builder
         * 
         */
        public Builder deploymentPreferences(@Nullable Output<ElastigroupIntegrationBeanstalkDeploymentPreferencesArgs> deploymentPreferences) {
            $.deploymentPreferences = deploymentPreferences;
            return this;
        }

        /**
         * @param deploymentPreferences Preferences when performing a roll
         * 
         * @return builder
         * 
         */
        public Builder deploymentPreferences(ElastigroupIntegrationBeanstalkDeploymentPreferencesArgs deploymentPreferences) {
            return deploymentPreferences(Output.of(deploymentPreferences));
        }

        public Builder environmentId(@Nullable Output<String> environmentId) {
            $.environmentId = environmentId;
            return this;
        }

        public Builder environmentId(String environmentId) {
            return environmentId(Output.of(environmentId));
        }

        /**
         * @param managedActions Managed Actions parameters
         * 
         * @return builder
         * 
         */
        public Builder managedActions(@Nullable Output<ElastigroupIntegrationBeanstalkManagedActionsArgs> managedActions) {
            $.managedActions = managedActions;
            return this;
        }

        /**
         * @param managedActions Managed Actions parameters
         * 
         * @return builder
         * 
         */
        public Builder managedActions(ElastigroupIntegrationBeanstalkManagedActionsArgs managedActions) {
            return managedActions(Output.of(managedActions));
        }

        public ElastigroupIntegrationBeanstalkArgs build() {
            return $;
        }
    }

}
