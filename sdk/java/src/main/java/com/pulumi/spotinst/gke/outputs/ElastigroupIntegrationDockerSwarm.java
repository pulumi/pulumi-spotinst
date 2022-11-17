// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ElastigroupIntegrationDockerSwarm {
    private String masterHost;
    private Integer masterPort;

    private ElastigroupIntegrationDockerSwarm() {}
    public String masterHost() {
        return this.masterHost;
    }
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
        private String masterHost;
        private Integer masterPort;
        public Builder() {}
        public Builder(ElastigroupIntegrationDockerSwarm defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.masterHost = defaults.masterHost;
    	      this.masterPort = defaults.masterPort;
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
            o.masterHost = masterHost;
            o.masterPort = masterPort;
            return o;
        }
    }
}
