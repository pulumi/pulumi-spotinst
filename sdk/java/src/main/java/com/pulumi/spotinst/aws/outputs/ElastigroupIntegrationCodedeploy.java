// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.spotinst.aws.outputs.ElastigroupIntegrationCodedeployDeploymentGroup;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ElastigroupIntegrationCodedeploy {
    /**
     * @return Cleanup automatically after a failed deploy.
     * 
     */
    private Boolean cleanupOnFailure;
    /**
     * @return Specify the deployment groups details.
     * 
     */
    private List<ElastigroupIntegrationCodedeployDeploymentGroup> deploymentGroups;
    /**
     * @return Terminate the instance automatically after a failed deploy.
     * 
     */
    private Boolean terminateInstanceOnFailure;

    private ElastigroupIntegrationCodedeploy() {}
    /**
     * @return Cleanup automatically after a failed deploy.
     * 
     */
    public Boolean cleanupOnFailure() {
        return this.cleanupOnFailure;
    }
    /**
     * @return Specify the deployment groups details.
     * 
     */
    public List<ElastigroupIntegrationCodedeployDeploymentGroup> deploymentGroups() {
        return this.deploymentGroups;
    }
    /**
     * @return Terminate the instance automatically after a failed deploy.
     * 
     */
    public Boolean terminateInstanceOnFailure() {
        return this.terminateInstanceOnFailure;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupIntegrationCodedeploy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean cleanupOnFailure;
        private List<ElastigroupIntegrationCodedeployDeploymentGroup> deploymentGroups;
        private Boolean terminateInstanceOnFailure;
        public Builder() {}
        public Builder(ElastigroupIntegrationCodedeploy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cleanupOnFailure = defaults.cleanupOnFailure;
    	      this.deploymentGroups = defaults.deploymentGroups;
    	      this.terminateInstanceOnFailure = defaults.terminateInstanceOnFailure;
        }

        @CustomType.Setter
        public Builder cleanupOnFailure(Boolean cleanupOnFailure) {
            this.cleanupOnFailure = Objects.requireNonNull(cleanupOnFailure);
            return this;
        }
        @CustomType.Setter
        public Builder deploymentGroups(List<ElastigroupIntegrationCodedeployDeploymentGroup> deploymentGroups) {
            this.deploymentGroups = Objects.requireNonNull(deploymentGroups);
            return this;
        }
        public Builder deploymentGroups(ElastigroupIntegrationCodedeployDeploymentGroup... deploymentGroups) {
            return deploymentGroups(List.of(deploymentGroups));
        }
        @CustomType.Setter
        public Builder terminateInstanceOnFailure(Boolean terminateInstanceOnFailure) {
            this.terminateInstanceOnFailure = Objects.requireNonNull(terminateInstanceOnFailure);
            return this;
        }
        public ElastigroupIntegrationCodedeploy build() {
            final var o = new ElastigroupIntegrationCodedeploy();
            o.cleanupOnFailure = cleanupOnFailure;
            o.deploymentGroups = deploymentGroups;
            o.terminateInstanceOnFailure = terminateInstanceOnFailure;
            return o;
        }
    }
}