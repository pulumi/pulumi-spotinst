// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gcp.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.gcp.outputs.ElastigroupBackendServiceNamedPort;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupBackendService {
    private @Nullable String locationType;
    private @Nullable List<ElastigroupBackendServiceNamedPort> namedPorts;
    private @Nullable String scheme;
    private String serviceName;

    private ElastigroupBackendService() {}
    public Optional<String> locationType() {
        return Optional.ofNullable(this.locationType);
    }
    public List<ElastigroupBackendServiceNamedPort> namedPorts() {
        return this.namedPorts == null ? List.of() : this.namedPorts;
    }
    public Optional<String> scheme() {
        return Optional.ofNullable(this.scheme);
    }
    public String serviceName() {
        return this.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupBackendService defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String locationType;
        private @Nullable List<ElastigroupBackendServiceNamedPort> namedPorts;
        private @Nullable String scheme;
        private String serviceName;
        public Builder() {}
        public Builder(ElastigroupBackendService defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locationType = defaults.locationType;
    	      this.namedPorts = defaults.namedPorts;
    	      this.scheme = defaults.scheme;
    	      this.serviceName = defaults.serviceName;
        }

        @CustomType.Setter
        public Builder locationType(@Nullable String locationType) {

            this.locationType = locationType;
            return this;
        }
        @CustomType.Setter
        public Builder namedPorts(@Nullable List<ElastigroupBackendServiceNamedPort> namedPorts) {

            this.namedPorts = namedPorts;
            return this;
        }
        public Builder namedPorts(ElastigroupBackendServiceNamedPort... namedPorts) {
            return namedPorts(List.of(namedPorts));
        }
        @CustomType.Setter
        public Builder scheme(@Nullable String scheme) {

            this.scheme = scheme;
            return this;
        }
        @CustomType.Setter
        public Builder serviceName(String serviceName) {
            if (serviceName == null) {
              throw new MissingRequiredPropertyException("ElastigroupBackendService", "serviceName");
            }
            this.serviceName = serviceName;
            return this;
        }
        public ElastigroupBackendService build() {
            final var _resultValue = new ElastigroupBackendService();
            _resultValue.locationType = locationType;
            _resultValue.namedPorts = namedPorts;
            _resultValue.scheme = scheme;
            _resultValue.serviceName = serviceName;
            return _resultValue;
        }
    }
}
