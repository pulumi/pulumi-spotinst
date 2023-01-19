// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.spotinst.aws.outputs.ElastigroupIntegrationNomadAutoscaleConstraint;
import com.pulumi.spotinst.aws.outputs.ElastigroupIntegrationNomadAutoscaleDown;
import com.pulumi.spotinst.aws.outputs.ElastigroupIntegrationNomadAutoscaleHeadroom;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupIntegrationNomad {
    /**
     * @return Nomad ACL Token
     * 
     */
    private @Nullable String aclToken;
    /**
     * @return A key/value mapping of tags to assign to the resource.
     * 
     */
    private @Nullable List<ElastigroupIntegrationNomadAutoscaleConstraint> autoscaleConstraints;
    /**
     * @return The amount of time, in seconds, after a scaling activity completes before any further trigger-related scaling activities can start.
     * 
     */
    private @Nullable Integer autoscaleCooldown;
    /**
     * @return Enabling scale down.
     * 
     */
    private @Nullable ElastigroupIntegrationNomadAutoscaleDown autoscaleDown;
    /**
     * @return Headroom for the cluster.
     * 
     */
    private @Nullable ElastigroupIntegrationNomadAutoscaleHeadroom autoscaleHeadroom;
    /**
     * @return Specifies whether the auto scaling feature is enabled.
     * 
     */
    private @Nullable Boolean autoscaleIsEnabled;
    /**
     * @return The URL of the Rancher Master host.
     * 
     */
    private String masterHost;
    /**
     * @return Network port used by your swarm.
     * 
     */
    private Integer masterPort;

    private ElastigroupIntegrationNomad() {}
    /**
     * @return Nomad ACL Token
     * 
     */
    public Optional<String> aclToken() {
        return Optional.ofNullable(this.aclToken);
    }
    /**
     * @return A key/value mapping of tags to assign to the resource.
     * 
     */
    public List<ElastigroupIntegrationNomadAutoscaleConstraint> autoscaleConstraints() {
        return this.autoscaleConstraints == null ? List.of() : this.autoscaleConstraints;
    }
    /**
     * @return The amount of time, in seconds, after a scaling activity completes before any further trigger-related scaling activities can start.
     * 
     */
    public Optional<Integer> autoscaleCooldown() {
        return Optional.ofNullable(this.autoscaleCooldown);
    }
    /**
     * @return Enabling scale down.
     * 
     */
    public Optional<ElastigroupIntegrationNomadAutoscaleDown> autoscaleDown() {
        return Optional.ofNullable(this.autoscaleDown);
    }
    /**
     * @return Headroom for the cluster.
     * 
     */
    public Optional<ElastigroupIntegrationNomadAutoscaleHeadroom> autoscaleHeadroom() {
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
     * @return The URL of the Rancher Master host.
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

    public static Builder builder(ElastigroupIntegrationNomad defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String aclToken;
        private @Nullable List<ElastigroupIntegrationNomadAutoscaleConstraint> autoscaleConstraints;
        private @Nullable Integer autoscaleCooldown;
        private @Nullable ElastigroupIntegrationNomadAutoscaleDown autoscaleDown;
        private @Nullable ElastigroupIntegrationNomadAutoscaleHeadroom autoscaleHeadroom;
        private @Nullable Boolean autoscaleIsEnabled;
        private String masterHost;
        private Integer masterPort;
        public Builder() {}
        public Builder(ElastigroupIntegrationNomad defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aclToken = defaults.aclToken;
    	      this.autoscaleConstraints = defaults.autoscaleConstraints;
    	      this.autoscaleCooldown = defaults.autoscaleCooldown;
    	      this.autoscaleDown = defaults.autoscaleDown;
    	      this.autoscaleHeadroom = defaults.autoscaleHeadroom;
    	      this.autoscaleIsEnabled = defaults.autoscaleIsEnabled;
    	      this.masterHost = defaults.masterHost;
    	      this.masterPort = defaults.masterPort;
        }

        @CustomType.Setter
        public Builder aclToken(@Nullable String aclToken) {
            this.aclToken = aclToken;
            return this;
        }
        @CustomType.Setter
        public Builder autoscaleConstraints(@Nullable List<ElastigroupIntegrationNomadAutoscaleConstraint> autoscaleConstraints) {
            this.autoscaleConstraints = autoscaleConstraints;
            return this;
        }
        public Builder autoscaleConstraints(ElastigroupIntegrationNomadAutoscaleConstraint... autoscaleConstraints) {
            return autoscaleConstraints(List.of(autoscaleConstraints));
        }
        @CustomType.Setter
        public Builder autoscaleCooldown(@Nullable Integer autoscaleCooldown) {
            this.autoscaleCooldown = autoscaleCooldown;
            return this;
        }
        @CustomType.Setter
        public Builder autoscaleDown(@Nullable ElastigroupIntegrationNomadAutoscaleDown autoscaleDown) {
            this.autoscaleDown = autoscaleDown;
            return this;
        }
        @CustomType.Setter
        public Builder autoscaleHeadroom(@Nullable ElastigroupIntegrationNomadAutoscaleHeadroom autoscaleHeadroom) {
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
        public ElastigroupIntegrationNomad build() {
            final var o = new ElastigroupIntegrationNomad();
            o.aclToken = aclToken;
            o.autoscaleConstraints = autoscaleConstraints;
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