// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
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
     * @return The amount of time, in seconds, after a scaling activity completes before any further trigger-related scaling activities can start. Minimum 180, must be a multiple of 60.
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
     * @return IP or FQDN of one of your swarm managers.
     * 
     */
    private String masterHost;
    /**
     * @return Network port used by your swarm.
     * 
     */
    private Integer masterPort;

    private ElastigroupIntegrationDockerSwarm() {}
    /**
     * @return The amount of time, in seconds, after a scaling activity completes before any further trigger-related scaling activities can start. Minimum 180, must be a multiple of 60.
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
     * @return IP or FQDN of one of your swarm managers.
     * 
     */
    public String masterHost() {
        return this.masterHost;
    }
    /**
     * @return Network port used by your swarm.
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
            this.masterHost = Objects.requireNonNull(masterHost);
            return this;
        }
        @CustomType.Setter
        public Builder masterPort(Integer masterPort) {
            this.masterPort = Objects.requireNonNull(masterPort);
            return this;
        }
        public ElastigroupIntegrationDockerSwarm build() {
            final var o = new ElastigroupIntegrationDockerSwarm();
            o.autoscaleCooldown = autoscaleCooldown;
            o.autoscaleDown = autoscaleDown;
            o.autoscaleHeadroom = autoscaleHeadroom;
            o.autoscaleIsEnabled = autoscaleIsEnabled;
            o.masterHost = masterHost;
            o.masterPort = masterPort;
            return o;
        }
    }
}
