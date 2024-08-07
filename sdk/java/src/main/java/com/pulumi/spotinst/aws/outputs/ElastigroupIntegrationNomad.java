// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
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
     * Usage:
     * 
     */
    private @Nullable List<ElastigroupIntegrationNomadAutoscaleConstraint> autoscaleConstraints;
    private @Nullable Integer autoscaleCooldown;
    private @Nullable ElastigroupIntegrationNomadAutoscaleDown autoscaleDown;
    private @Nullable ElastigroupIntegrationNomadAutoscaleHeadroom autoscaleHeadroom;
    private @Nullable Boolean autoscaleIsEnabled;
    private String masterHost;
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
     * Usage:
     * 
     */
    public List<ElastigroupIntegrationNomadAutoscaleConstraint> autoscaleConstraints() {
        return this.autoscaleConstraints == null ? List.of() : this.autoscaleConstraints;
    }
    public Optional<Integer> autoscaleCooldown() {
        return Optional.ofNullable(this.autoscaleCooldown);
    }
    public Optional<ElastigroupIntegrationNomadAutoscaleDown> autoscaleDown() {
        return Optional.ofNullable(this.autoscaleDown);
    }
    public Optional<ElastigroupIntegrationNomadAutoscaleHeadroom> autoscaleHeadroom() {
        return Optional.ofNullable(this.autoscaleHeadroom);
    }
    public Optional<Boolean> autoscaleIsEnabled() {
        return Optional.ofNullable(this.autoscaleIsEnabled);
    }
    public String masterHost() {
        return this.masterHost;
    }
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
            if (masterHost == null) {
              throw new MissingRequiredPropertyException("ElastigroupIntegrationNomad", "masterHost");
            }
            this.masterHost = masterHost;
            return this;
        }
        @CustomType.Setter
        public Builder masterPort(Integer masterPort) {
            if (masterPort == null) {
              throw new MissingRequiredPropertyException("ElastigroupIntegrationNomad", "masterPort");
            }
            this.masterPort = masterPort;
            return this;
        }
        public ElastigroupIntegrationNomad build() {
            final var _resultValue = new ElastigroupIntegrationNomad();
            _resultValue.aclToken = aclToken;
            _resultValue.autoscaleConstraints = autoscaleConstraints;
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
