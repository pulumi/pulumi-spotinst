// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.aws.outputs.ElastigroupIntegrationDockerSwarmAutoscaleDown;
import com.pulumi.spotinst.aws.outputs.ElastigroupIntegrationDockerSwarmAutoscaleHeadroom;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupIntegrationDockerSwarm {
    /**
     * @return The amount of time, in seconds, after a scaling activity completes before any further trigger-related scaling activities can start.
     * 
     */
    private @Nullable Integer autoscaleCooldown;
    /**
     * @return Settings for scale down actions.
     * 
     */
    private @Nullable ElastigroupIntegrationDockerSwarmAutoscaleDown autoscaleDown;
    /**
     * @return An option to set compute reserve for the cluster.
     * 
     */
    private @Nullable ElastigroupIntegrationDockerSwarmAutoscaleHeadroom autoscaleHeadroom;
    /**
     * @return Specifies whether the auto scaling feature is enabled.
     * 
     */
    private @Nullable Boolean autoscaleIsEnabled;
    /**
     * @return The URL for the Nomad master host.
     * 
     */
    private String masterHost;
    /**
     * @return The network port for the master host.
     * 
     */
    private Integer masterPort;

    private ElastigroupIntegrationDockerSwarm() {}
    /**
     * @return The amount of time, in seconds, after a scaling activity completes before any further trigger-related scaling activities can start.
     * 
     */
    public Optional<Integer> autoscaleCooldown() {
        return Optional.ofNullable(this.autoscaleCooldown);
    }
    /**
     * @return Settings for scale down actions.
     * 
     */
    public Optional<ElastigroupIntegrationDockerSwarmAutoscaleDown> autoscaleDown() {
        return Optional.ofNullable(this.autoscaleDown);
    }
    /**
     * @return An option to set compute reserve for the cluster.
     * 
     */
    public Optional<ElastigroupIntegrationDockerSwarmAutoscaleHeadroom> autoscaleHeadroom() {
        return Optional.ofNullable(this.autoscaleHeadroom);
    }
    /**
     * @return Specifies whether the auto scaling feature is enabled.
     * 
     */
    public Optional<Boolean> autoscaleIsEnabled() {
        return Optional.ofNullable(this.autoscaleIsEnabled);
    }
    /**
     * @return The URL for the Nomad master host.
     * 
     */
    public String masterHost() {
        return this.masterHost;
    }
    /**
     * @return The network port for the master host.
     * 
     */
    public Integer masterPort() {
        return this.masterPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupIntegrationDockerSwarm defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer autoscaleCooldown;
        private @Nullable ElastigroupIntegrationDockerSwarmAutoscaleDown autoscaleDown;
        private @Nullable ElastigroupIntegrationDockerSwarmAutoscaleHeadroom autoscaleHeadroom;
        private @Nullable Boolean autoscaleIsEnabled;
        private String masterHost;
        private Integer masterPort;
        public Builder() {}
        public Builder(ElastigroupIntegrationDockerSwarm defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscaleCooldown = defaults.autoscaleCooldown;
    	      this.autoscaleDown = defaults.autoscaleDown;
    	      this.autoscaleHeadroom = defaults.autoscaleHeadroom;
    	      this.autoscaleIsEnabled = defaults.autoscaleIsEnabled;
    	      this.masterHost = defaults.masterHost;
    	      this.masterPort = defaults.masterPort;
        }

        @CustomType.Setter
        public Builder autoscaleCooldown(@Nullable Integer autoscaleCooldown) {

            this.autoscaleCooldown = autoscaleCooldown;
            return this;
        }
        @CustomType.Setter
        public Builder autoscaleDown(@Nullable ElastigroupIntegrationDockerSwarmAutoscaleDown autoscaleDown) {

            this.autoscaleDown = autoscaleDown;
            return this;
        }
        @CustomType.Setter
        public Builder autoscaleHeadroom(@Nullable ElastigroupIntegrationDockerSwarmAutoscaleHeadroom autoscaleHeadroom) {

            this.autoscaleHeadroom = autoscaleHeadroom;
            return this;
        }
        @CustomType.Setter
        public Builder autoscaleIsEnabled(@Nullable Boolean autoscaleIsEnabled) {

            this.autoscaleIsEnabled = autoscaleIsEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder masterHost(String masterHost) {
            if (masterHost == null) {
              throw new MissingRequiredPropertyException("ElastigroupIntegrationDockerSwarm", "masterHost");
            }
            this.masterHost = masterHost;
            return this;
        }
        @CustomType.Setter
        public Builder masterPort(Integer masterPort) {
            if (masterPort == null) {
              throw new MissingRequiredPropertyException("ElastigroupIntegrationDockerSwarm", "masterPort");
            }
            this.masterPort = masterPort;
            return this;
        }
        public ElastigroupIntegrationDockerSwarm build() {
            final var _resultValue = new ElastigroupIntegrationDockerSwarm();
            _resultValue.autoscaleCooldown = autoscaleCooldown;
            _resultValue.autoscaleDown = autoscaleDown;
            _resultValue.autoscaleHeadroom = autoscaleHeadroom;
            _resultValue.autoscaleIsEnabled = autoscaleIsEnabled;
            _resultValue.masterHost = masterHost;
            _resultValue.masterPort = masterPort;
            return _resultValue;
        }
    }
}
