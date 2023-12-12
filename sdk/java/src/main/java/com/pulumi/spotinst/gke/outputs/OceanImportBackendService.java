// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.spotinst.gke.outputs.OceanImportBackendServiceNamedPort;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanImportBackendService {
    /**
     * @return Sets which location the backend services will be active. Valid values: `regional`, `global`.
     * 
     */
    private @Nullable String locationType;
    private @Nullable List<OceanImportBackendServiceNamedPort> namedPorts;
    /**
     * @return Use when `location_type` is `regional`. Set the traffic for the backend service to either between the instances in the vpc or to traffic from the internet. Valid values: `INTERNAL`, `EXTERNAL`.
     * 
     */
    private @Nullable String scheme;
    /**
     * @return The name of the backend service.
     * 
     */
    private String serviceName;

    private OceanImportBackendService() {}
    /**
     * @return Sets which location the backend services will be active. Valid values: `regional`, `global`.
     * 
     */
    public Optional<String> locationType() {
        return Optional.ofNullable(this.locationType);
    }
    public List<OceanImportBackendServiceNamedPort> namedPorts() {
        return this.namedPorts == null ? List.of() : this.namedPorts;
    }
    /**
     * @return Use when `location_type` is `regional`. Set the traffic for the backend service to either between the instances in the vpc or to traffic from the internet. Valid values: `INTERNAL`, `EXTERNAL`.
     * 
     */
    public Optional<String> scheme() {
        return Optional.ofNullable(this.scheme);
    }
    /**
     * @return The name of the backend service.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanImportBackendService defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String locationType;
        private @Nullable List<OceanImportBackendServiceNamedPort> namedPorts;
        private @Nullable String scheme;
        private String serviceName;
        public Builder() {}
        public Builder(OceanImportBackendService defaults) {
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
        public Builder namedPorts(@Nullable List<OceanImportBackendServiceNamedPort> namedPorts) {
            this.namedPorts = namedPorts;
            return this;
        }
        public Builder namedPorts(OceanImportBackendServiceNamedPort... namedPorts) {
            return namedPorts(List.of(namedPorts));
        }
        @CustomType.Setter
        public Builder scheme(@Nullable String scheme) {
            this.scheme = scheme;
            return this;
        }
        @CustomType.Setter
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public OceanImportBackendService build() {
            final var _resultValue = new OceanImportBackendService();
            _resultValue.locationType = locationType;
            _resultValue.namedPorts = namedPorts;
            _resultValue.scheme = scheme;
            _resultValue.serviceName = serviceName;
            return _resultValue;
        }
    }
}
