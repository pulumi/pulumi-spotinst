// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupIntegrationRancherArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupIntegrationRancherArgs Empty = new ElastigroupIntegrationRancherArgs();

    /**
     * The access key of the Rancher API.
     * 
     */
    @Import(name="accessKey", required=true)
    private Output<String> accessKey;

    /**
     * @return The access key of the Rancher API.
     * 
     */
    public Output<String> accessKey() {
        return this.accessKey;
    }

    /**
     * The URL for the Nomad master host.
     * 
     */
    @Import(name="masterHost", required=true)
    private Output<String> masterHost;

    /**
     * @return The URL for the Nomad master host.
     * 
     */
    public Output<String> masterHost() {
        return this.masterHost;
    }

    /**
     * The secret key of the Rancher API.
     * 
     */
    @Import(name="secretKey", required=true)
    private Output<String> secretKey;

    /**
     * @return The secret key of the Rancher API.
     * 
     */
    public Output<String> secretKey() {
        return this.secretKey;
    }

    /**
     * The Rancher version. Must be `&#34;1&#34;` or `&#34;2&#34;`. If this field is omitted, it’s assumed that the Rancher cluster is version 1. Note that Kubernetes is required when using Rancher version 2^.
     * Usage:
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The Rancher version. Must be `&#34;1&#34;` or `&#34;2&#34;`. If this field is omitted, it’s assumed that the Rancher cluster is version 1. Note that Kubernetes is required when using Rancher version 2^.
     * Usage:
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private ElastigroupIntegrationRancherArgs() {}

    private ElastigroupIntegrationRancherArgs(ElastigroupIntegrationRancherArgs $) {
        this.accessKey = $.accessKey;
        this.masterHost = $.masterHost;
        this.secretKey = $.secretKey;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupIntegrationRancherArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupIntegrationRancherArgs $;

        public Builder() {
            $ = new ElastigroupIntegrationRancherArgs();
        }

        public Builder(ElastigroupIntegrationRancherArgs defaults) {
            $ = new ElastigroupIntegrationRancherArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessKey The access key of the Rancher API.
         * 
         * @return builder
         * 
         */
        public Builder accessKey(Output<String> accessKey) {
            $.accessKey = accessKey;
            return this;
        }

        /**
         * @param accessKey The access key of the Rancher API.
         * 
         * @return builder
         * 
         */
        public Builder accessKey(String accessKey) {
            return accessKey(Output.of(accessKey));
        }

        /**
         * @param masterHost The URL for the Nomad master host.
         * 
         * @return builder
         * 
         */
        public Builder masterHost(Output<String> masterHost) {
            $.masterHost = masterHost;
            return this;
        }

        /**
         * @param masterHost The URL for the Nomad master host.
         * 
         * @return builder
         * 
         */
        public Builder masterHost(String masterHost) {
            return masterHost(Output.of(masterHost));
        }

        /**
         * @param secretKey The secret key of the Rancher API.
         * 
         * @return builder
         * 
         */
        public Builder secretKey(Output<String> secretKey) {
            $.secretKey = secretKey;
            return this;
        }

        /**
         * @param secretKey The secret key of the Rancher API.
         * 
         * @return builder
         * 
         */
        public Builder secretKey(String secretKey) {
            return secretKey(Output.of(secretKey));
        }

        /**
         * @param version The Rancher version. Must be `&#34;1&#34;` or `&#34;2&#34;`. If this field is omitted, it’s assumed that the Rancher cluster is version 1. Note that Kubernetes is required when using Rancher version 2^.
         * Usage:
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The Rancher version. Must be `&#34;1&#34;` or `&#34;2&#34;`. If this field is omitted, it’s assumed that the Rancher cluster is version 1. Note that Kubernetes is required when using Rancher version 2^.
         * Usage:
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public ElastigroupIntegrationRancherArgs build() {
            $.accessKey = Objects.requireNonNull($.accessKey, "expected parameter 'accessKey' to be non-null");
            $.masterHost = Objects.requireNonNull($.masterHost, "expected parameter 'masterHost' to be non-null");
            $.secretKey = Objects.requireNonNull($.secretKey, "expected parameter 'secretKey' to be non-null");
            return $;
        }
    }

}
