// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.spotinst.aws.outputs.ElastigroupItfTargetGroupConfigMatcher;
import com.pulumi.spotinst.aws.outputs.ElastigroupItfTargetGroupConfigTag;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupItfTargetGroupConfig {
    private @Nullable Integer healthCheckIntervalSeconds;
    private String healthCheckPath;
    private @Nullable String healthCheckPort;
    private @Nullable String healthCheckProtocol;
    private @Nullable Integer healthCheckTimeoutSeconds;
    private @Nullable Integer healthyThresholdCount;
    private @Nullable List<ElastigroupItfTargetGroupConfigMatcher> matchers;
    private Integer port;
    private String protocol;
    private @Nullable String protocolVersion;
    /**
     * @return A key/value mapping of tags to assign to the resource.
     * 
     */
    private @Nullable List<ElastigroupItfTargetGroupConfigTag> tags;
    private @Nullable Integer unhealthyThresholdCount;
    private String vpcId;

    private ElastigroupItfTargetGroupConfig() {}
    public Optional<Integer> healthCheckIntervalSeconds() {
        return Optional.ofNullable(this.healthCheckIntervalSeconds);
    }
    public String healthCheckPath() {
        return this.healthCheckPath;
    }
    public Optional<String> healthCheckPort() {
        return Optional.ofNullable(this.healthCheckPort);
    }
    public Optional<String> healthCheckProtocol() {
        return Optional.ofNullable(this.healthCheckProtocol);
    }
    public Optional<Integer> healthCheckTimeoutSeconds() {
        return Optional.ofNullable(this.healthCheckTimeoutSeconds);
    }
    public Optional<Integer> healthyThresholdCount() {
        return Optional.ofNullable(this.healthyThresholdCount);
    }
    public List<ElastigroupItfTargetGroupConfigMatcher> matchers() {
        return this.matchers == null ? List.of() : this.matchers;
    }
    public Integer port() {
        return this.port;
    }
    public String protocol() {
        return this.protocol;
    }
    public Optional<String> protocolVersion() {
        return Optional.ofNullable(this.protocolVersion);
    }
    /**
     * @return A key/value mapping of tags to assign to the resource.
     * 
     */
    public List<ElastigroupItfTargetGroupConfigTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public Optional<Integer> unhealthyThresholdCount() {
        return Optional.ofNullable(this.unhealthyThresholdCount);
    }
    public String vpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupItfTargetGroupConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer healthCheckIntervalSeconds;
        private String healthCheckPath;
        private @Nullable String healthCheckPort;
        private @Nullable String healthCheckProtocol;
        private @Nullable Integer healthCheckTimeoutSeconds;
        private @Nullable Integer healthyThresholdCount;
        private @Nullable List<ElastigroupItfTargetGroupConfigMatcher> matchers;
        private Integer port;
        private String protocol;
        private @Nullable String protocolVersion;
        private @Nullable List<ElastigroupItfTargetGroupConfigTag> tags;
        private @Nullable Integer unhealthyThresholdCount;
        private String vpcId;
        public Builder() {}
        public Builder(ElastigroupItfTargetGroupConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthCheckIntervalSeconds = defaults.healthCheckIntervalSeconds;
    	      this.healthCheckPath = defaults.healthCheckPath;
    	      this.healthCheckPort = defaults.healthCheckPort;
    	      this.healthCheckProtocol = defaults.healthCheckProtocol;
    	      this.healthCheckTimeoutSeconds = defaults.healthCheckTimeoutSeconds;
    	      this.healthyThresholdCount = defaults.healthyThresholdCount;
    	      this.matchers = defaults.matchers;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.protocolVersion = defaults.protocolVersion;
    	      this.tags = defaults.tags;
    	      this.unhealthyThresholdCount = defaults.unhealthyThresholdCount;
    	      this.vpcId = defaults.vpcId;
        }

        @CustomType.Setter
        public Builder healthCheckIntervalSeconds(@Nullable Integer healthCheckIntervalSeconds) {
            this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder healthCheckPath(String healthCheckPath) {
            this.healthCheckPath = Objects.requireNonNull(healthCheckPath);
            return this;
        }
        @CustomType.Setter
        public Builder healthCheckPort(@Nullable String healthCheckPort) {
            this.healthCheckPort = healthCheckPort;
            return this;
        }
        @CustomType.Setter
        public Builder healthCheckProtocol(@Nullable String healthCheckProtocol) {
            this.healthCheckProtocol = healthCheckProtocol;
            return this;
        }
        @CustomType.Setter
        public Builder healthCheckTimeoutSeconds(@Nullable Integer healthCheckTimeoutSeconds) {
            this.healthCheckTimeoutSeconds = healthCheckTimeoutSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder healthyThresholdCount(@Nullable Integer healthyThresholdCount) {
            this.healthyThresholdCount = healthyThresholdCount;
            return this;
        }
        @CustomType.Setter
        public Builder matchers(@Nullable List<ElastigroupItfTargetGroupConfigMatcher> matchers) {
            this.matchers = matchers;
            return this;
        }
        public Builder matchers(ElastigroupItfTargetGroupConfigMatcher... matchers) {
            return matchers(List.of(matchers));
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        @CustomType.Setter
        public Builder protocolVersion(@Nullable String protocolVersion) {
            this.protocolVersion = protocolVersion;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<ElastigroupItfTargetGroupConfigTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(ElastigroupItfTargetGroupConfigTag... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder unhealthyThresholdCount(@Nullable Integer unhealthyThresholdCount) {
            this.unhealthyThresholdCount = unhealthyThresholdCount;
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public ElastigroupItfTargetGroupConfig build() {
            final var o = new ElastigroupItfTargetGroupConfig();
            o.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
            o.healthCheckPath = healthCheckPath;
            o.healthCheckPort = healthCheckPort;
            o.healthCheckProtocol = healthCheckProtocol;
            o.healthCheckTimeoutSeconds = healthCheckTimeoutSeconds;
            o.healthyThresholdCount = healthyThresholdCount;
            o.matchers = matchers;
            o.port = port;
            o.protocol = protocol;
            o.protocolVersion = protocolVersion;
            o.tags = tags;
            o.unhealthyThresholdCount = unhealthyThresholdCount;
            o.vpcId = vpcId;
            return o;
        }
    }
}
