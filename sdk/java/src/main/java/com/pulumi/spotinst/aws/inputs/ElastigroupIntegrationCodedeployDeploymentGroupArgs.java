// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ElastigroupIntegrationCodedeployDeploymentGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupIntegrationCodedeployDeploymentGroupArgs Empty = new ElastigroupIntegrationCodedeployDeploymentGroupArgs();

    /**
     * The application name.
     * 
     */
    @Import(name="applicationName", required=true)
    private Output<String> applicationName;

    /**
     * @return The application name.
     * 
     */
    public Output<String> applicationName() {
        return this.applicationName;
    }

    /**
     * The deployment group name.
     * 
     */
    @Import(name="deploymentGroupName", required=true)
    private Output<String> deploymentGroupName;

    /**
     * @return The deployment group name.
     * 
     */
    public Output<String> deploymentGroupName() {
        return this.deploymentGroupName;
    }

    private ElastigroupIntegrationCodedeployDeploymentGroupArgs() {}

    private ElastigroupIntegrationCodedeployDeploymentGroupArgs(ElastigroupIntegrationCodedeployDeploymentGroupArgs $) {
        this.applicationName = $.applicationName;
        this.deploymentGroupName = $.deploymentGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupIntegrationCodedeployDeploymentGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupIntegrationCodedeployDeploymentGroupArgs $;

        public Builder() {
            $ = new ElastigroupIntegrationCodedeployDeploymentGroupArgs();
        }

        public Builder(ElastigroupIntegrationCodedeployDeploymentGroupArgs defaults) {
            $ = new ElastigroupIntegrationCodedeployDeploymentGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationName The application name.
         * 
         * @return builder
         * 
         */
        public Builder applicationName(Output<String> applicationName) {
            $.applicationName = applicationName;
            return this;
        }

        /**
         * @param applicationName The application name.
         * 
         * @return builder
         * 
         */
        public Builder applicationName(String applicationName) {
            return applicationName(Output.of(applicationName));
        }

        /**
         * @param deploymentGroupName The deployment group name.
         * 
         * @return builder
         * 
         */
        public Builder deploymentGroupName(Output<String> deploymentGroupName) {
            $.deploymentGroupName = deploymentGroupName;
            return this;
        }

        /**
         * @param deploymentGroupName The deployment group name.
         * 
         * @return builder
         * 
         */
        public Builder deploymentGroupName(String deploymentGroupName) {
            return deploymentGroupName(Output.of(deploymentGroupName));
        }

        public ElastigroupIntegrationCodedeployDeploymentGroupArgs build() {
            $.applicationName = Objects.requireNonNull($.applicationName, "expected parameter 'applicationName' to be non-null");
            $.deploymentGroupName = Objects.requireNonNull($.deploymentGroupName, "expected parameter 'deploymentGroupName' to be non-null");
            return $;
        }
    }

}
