// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.aws.inputs.ElastigroupItfTargetGroupConfigMatcherArgs;
import com.pulumi.spotinst.aws.inputs.ElastigroupItfTargetGroupConfigTagArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupItfTargetGroupConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupItfTargetGroupConfigArgs Empty = new ElastigroupItfTargetGroupConfigArgs();

    @Import(name="healthCheckIntervalSeconds")
    private @Nullable Output<Integer> healthCheckIntervalSeconds;

    public Optional<Output<Integer>> healthCheckIntervalSeconds() {
        return Optional.ofNullable(this.healthCheckIntervalSeconds);
    }

    @Import(name="healthCheckPath", required=true)
    private Output<String> healthCheckPath;

    public Output<String> healthCheckPath() {
        return this.healthCheckPath;
    }

    @Import(name="healthCheckPort")
    private @Nullable Output<String> healthCheckPort;

    public Optional<Output<String>> healthCheckPort() {
        return Optional.ofNullable(this.healthCheckPort);
    }

    @Import(name="healthCheckProtocol")
    private @Nullable Output<String> healthCheckProtocol;

    public Optional<Output<String>> healthCheckProtocol() {
        return Optional.ofNullable(this.healthCheckProtocol);
    }

    @Import(name="healthCheckTimeoutSeconds")
    private @Nullable Output<Integer> healthCheckTimeoutSeconds;

    public Optional<Output<Integer>> healthCheckTimeoutSeconds() {
        return Optional.ofNullable(this.healthCheckTimeoutSeconds);
    }

    @Import(name="healthyThresholdCount")
    private @Nullable Output<Integer> healthyThresholdCount;

    public Optional<Output<Integer>> healthyThresholdCount() {
        return Optional.ofNullable(this.healthyThresholdCount);
    }

    @Import(name="matchers")
    private @Nullable Output<List<ElastigroupItfTargetGroupConfigMatcherArgs>> matchers;

    public Optional<Output<List<ElastigroupItfTargetGroupConfigMatcherArgs>>> matchers() {
        return Optional.ofNullable(this.matchers);
    }

    @Import(name="port", required=true)
    private Output<Integer> port;

    public Output<Integer> port() {
        return this.port;
    }

    @Import(name="protocol", required=true)
    private Output<String> protocol;

    public Output<String> protocol() {
        return this.protocol;
    }

    @Import(name="protocolVersion")
    private @Nullable Output<String> protocolVersion;

    public Optional<Output<String>> protocolVersion() {
        return Optional.ofNullable(this.protocolVersion);
    }

    /**
     * A key/value mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<ElastigroupItfTargetGroupConfigTagArgs>> tags;

    /**
     * @return A key/value mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<List<ElastigroupItfTargetGroupConfigTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="unhealthyThresholdCount")
    private @Nullable Output<Integer> unhealthyThresholdCount;

    public Optional<Output<Integer>> unhealthyThresholdCount() {
        return Optional.ofNullable(this.unhealthyThresholdCount);
    }

    @Import(name="vpcId", required=true)
    private Output<String> vpcId;

    public Output<String> vpcId() {
        return this.vpcId;
    }

    private ElastigroupItfTargetGroupConfigArgs() {}

    private ElastigroupItfTargetGroupConfigArgs(ElastigroupItfTargetGroupConfigArgs $) {
        this.healthCheckIntervalSeconds = $.healthCheckIntervalSeconds;
        this.healthCheckPath = $.healthCheckPath;
        this.healthCheckPort = $.healthCheckPort;
        this.healthCheckProtocol = $.healthCheckProtocol;
        this.healthCheckTimeoutSeconds = $.healthCheckTimeoutSeconds;
        this.healthyThresholdCount = $.healthyThresholdCount;
        this.matchers = $.matchers;
        this.port = $.port;
        this.protocol = $.protocol;
        this.protocolVersion = $.protocolVersion;
        this.tags = $.tags;
        this.unhealthyThresholdCount = $.unhealthyThresholdCount;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupItfTargetGroupConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupItfTargetGroupConfigArgs $;

        public Builder() {
            $ = new ElastigroupItfTargetGroupConfigArgs();
        }

        public Builder(ElastigroupItfTargetGroupConfigArgs defaults) {
            $ = new ElastigroupItfTargetGroupConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder healthCheckIntervalSeconds(@Nullable Output<Integer> healthCheckIntervalSeconds) {
            $.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
            return this;
        }

        public Builder healthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
            return healthCheckIntervalSeconds(Output.of(healthCheckIntervalSeconds));
        }

        public Builder healthCheckPath(Output<String> healthCheckPath) {
            $.healthCheckPath = healthCheckPath;
            return this;
        }

        public Builder healthCheckPath(String healthCheckPath) {
            return healthCheckPath(Output.of(healthCheckPath));
        }

        public Builder healthCheckPort(@Nullable Output<String> healthCheckPort) {
            $.healthCheckPort = healthCheckPort;
            return this;
        }

        public Builder healthCheckPort(String healthCheckPort) {
            return healthCheckPort(Output.of(healthCheckPort));
        }

        public Builder healthCheckProtocol(@Nullable Output<String> healthCheckProtocol) {
            $.healthCheckProtocol = healthCheckProtocol;
            return this;
        }

        public Builder healthCheckProtocol(String healthCheckProtocol) {
            return healthCheckProtocol(Output.of(healthCheckProtocol));
        }

        public Builder healthCheckTimeoutSeconds(@Nullable Output<Integer> healthCheckTimeoutSeconds) {
            $.healthCheckTimeoutSeconds = healthCheckTimeoutSeconds;
            return this;
        }

        public Builder healthCheckTimeoutSeconds(Integer healthCheckTimeoutSeconds) {
            return healthCheckTimeoutSeconds(Output.of(healthCheckTimeoutSeconds));
        }

        public Builder healthyThresholdCount(@Nullable Output<Integer> healthyThresholdCount) {
            $.healthyThresholdCount = healthyThresholdCount;
            return this;
        }

        public Builder healthyThresholdCount(Integer healthyThresholdCount) {
            return healthyThresholdCount(Output.of(healthyThresholdCount));
        }

        public Builder matchers(@Nullable Output<List<ElastigroupItfTargetGroupConfigMatcherArgs>> matchers) {
            $.matchers = matchers;
            return this;
        }

        public Builder matchers(List<ElastigroupItfTargetGroupConfigMatcherArgs> matchers) {
            return matchers(Output.of(matchers));
        }

        public Builder matchers(ElastigroupItfTargetGroupConfigMatcherArgs... matchers) {
            return matchers(List.of(matchers));
        }

        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public Builder protocol(Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        public Builder protocolVersion(@Nullable Output<String> protocolVersion) {
            $.protocolVersion = protocolVersion;
            return this;
        }

        public Builder protocolVersion(String protocolVersion) {
            return protocolVersion(Output.of(protocolVersion));
        }

        /**
         * @param tags A key/value mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<ElastigroupItfTargetGroupConfigTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A key/value mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<ElastigroupItfTargetGroupConfigTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A key/value mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(ElastigroupItfTargetGroupConfigTagArgs... tags) {
            return tags(List.of(tags));
        }

        public Builder unhealthyThresholdCount(@Nullable Output<Integer> unhealthyThresholdCount) {
            $.unhealthyThresholdCount = unhealthyThresholdCount;
            return this;
        }

        public Builder unhealthyThresholdCount(Integer unhealthyThresholdCount) {
            return unhealthyThresholdCount(Output.of(unhealthyThresholdCount));
        }

        public Builder vpcId(Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public ElastigroupItfTargetGroupConfigArgs build() {
            $.healthCheckPath = Objects.requireNonNull($.healthCheckPath, "expected parameter 'healthCheckPath' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            $.protocol = Objects.requireNonNull($.protocol, "expected parameter 'protocol' to be non-null");
            $.vpcId = Objects.requireNonNull($.vpcId, "expected parameter 'vpcId' to be non-null");
            return $;
        }
    }

}
