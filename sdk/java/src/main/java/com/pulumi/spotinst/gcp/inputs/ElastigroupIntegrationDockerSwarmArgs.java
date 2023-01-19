// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gcp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class ElastigroupIntegrationDockerSwarmArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupIntegrationDockerSwarmArgs Empty = new ElastigroupIntegrationDockerSwarmArgs();

    /**
     * IP or FQDN of one of your swarm managers.
     * 
     */
    @Import(name="masterHost", required=true)
    private Output<String> masterHost;

    /**
     * @return IP or FQDN of one of your swarm managers.
     * 
     */
    public Output<String> masterHost() {
        return this.masterHost;
    }

    /**
     * Network port used by your swarm.
     * 
     */
    @Import(name="masterPort", required=true)
    private Output<Integer> masterPort;

    /**
     * @return Network port used by your swarm.
     * 
     */
    public Output<Integer> masterPort() {
        return this.masterPort;
    }

    private ElastigroupIntegrationDockerSwarmArgs() {}

    private ElastigroupIntegrationDockerSwarmArgs(ElastigroupIntegrationDockerSwarmArgs $) {
        this.masterHost = $.masterHost;
        this.masterPort = $.masterPort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupIntegrationDockerSwarmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupIntegrationDockerSwarmArgs $;

        public Builder() {
            $ = new ElastigroupIntegrationDockerSwarmArgs();
        }

        public Builder(ElastigroupIntegrationDockerSwarmArgs defaults) {
            $ = new ElastigroupIntegrationDockerSwarmArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param masterHost IP or FQDN of one of your swarm managers.
         * 
         * @return builder
         * 
         */
        public Builder masterHost(Output<String> masterHost) {
            $.masterHost = masterHost;
            return this;
        }

        /**
         * @param masterHost IP or FQDN of one of your swarm managers.
         * 
         * @return builder
         * 
         */
        public Builder masterHost(String masterHost) {
            return masterHost(Output.of(masterHost));
        }

        /**
         * @param masterPort Network port used by your swarm.
         * 
         * @return builder
         * 
         */
        public Builder masterPort(Output<Integer> masterPort) {
            $.masterPort = masterPort;
            return this;
        }

        /**
         * @param masterPort Network port used by your swarm.
         * 
         * @return builder
         * 
         */
        public Builder masterPort(Integer masterPort) {
            return masterPort(Output.of(masterPort));
        }

        public ElastigroupIntegrationDockerSwarmArgs build() {
            $.masterHost = Objects.requireNonNull($.masterHost, "expected parameter 'masterHost' to be non-null");
            $.masterPort = Objects.requireNonNull($.masterPort, "expected parameter 'masterPort' to be non-null");
            return $;
        }
    }

}