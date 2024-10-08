// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
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
            _resultValue.masterHost = masterHost;
            _resultValue.masterPort = masterPort;
            return _resultValue;
        }
    }
}