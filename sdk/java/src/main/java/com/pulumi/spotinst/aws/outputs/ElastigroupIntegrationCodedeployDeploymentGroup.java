// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ElastigroupIntegrationCodedeployDeploymentGroup {
    /**
     * @return The application name.
     * 
     */
    private String applicationName;
    /**
     * @return The deployment group name.
     * 
     */
    private String deploymentGroupName;

    private ElastigroupIntegrationCodedeployDeploymentGroup() {}
    /**
     * @return The application name.
     * 
     */
    public String applicationName() {
        return this.applicationName;
    }
    /**
     * @return The deployment group name.
     * 
     */
    public String deploymentGroupName() {
        return this.deploymentGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupIntegrationCodedeployDeploymentGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String applicationName;
        private String deploymentGroupName;
        public Builder() {}
        public Builder(ElastigroupIntegrationCodedeployDeploymentGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationName = defaults.applicationName;
    	      this.deploymentGroupName = defaults.deploymentGroupName;
        }

        @CustomType.Setter
        public Builder applicationName(String applicationName) {
            this.applicationName = Objects.requireNonNull(applicationName);
            return this;
        }
        @CustomType.Setter
        public Builder deploymentGroupName(String deploymentGroupName) {
            this.deploymentGroupName = Objects.requireNonNull(deploymentGroupName);
            return this;
        }
        public ElastigroupIntegrationCodedeployDeploymentGroup build() {
            final var o = new ElastigroupIntegrationCodedeployDeploymentGroup();
            o.applicationName = applicationName;
            o.deploymentGroupName = deploymentGroupName;
            return o;
        }
    }
}
