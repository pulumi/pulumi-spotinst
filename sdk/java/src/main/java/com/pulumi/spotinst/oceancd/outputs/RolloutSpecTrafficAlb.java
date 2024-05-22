// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.oceancd.outputs.RolloutSpecTrafficAlbStickinessConfig;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RolloutSpecTrafficAlb {
    private @Nullable String albAnnotationPrefix;
    private String albIngress;
    private String albRootService;
    private Integer servicePort;
    private @Nullable RolloutSpecTrafficAlbStickinessConfig stickinessConfig;

    private RolloutSpecTrafficAlb() {}
    public Optional<String> albAnnotationPrefix() {
        return Optional.ofNullable(this.albAnnotationPrefix);
    }
    public String albIngress() {
        return this.albIngress;
    }
    public String albRootService() {
        return this.albRootService;
    }
    public Integer servicePort() {
        return this.servicePort;
    }
    public Optional<RolloutSpecTrafficAlbStickinessConfig> stickinessConfig() {
        return Optional.ofNullable(this.stickinessConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RolloutSpecTrafficAlb defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String albAnnotationPrefix;
        private String albIngress;
        private String albRootService;
        private Integer servicePort;
        private @Nullable RolloutSpecTrafficAlbStickinessConfig stickinessConfig;
        public Builder() {}
        public Builder(RolloutSpecTrafficAlb defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.albAnnotationPrefix = defaults.albAnnotationPrefix;
    	      this.albIngress = defaults.albIngress;
    	      this.albRootService = defaults.albRootService;
    	      this.servicePort = defaults.servicePort;
    	      this.stickinessConfig = defaults.stickinessConfig;
        }

        @CustomType.Setter
        public Builder albAnnotationPrefix(@Nullable String albAnnotationPrefix) {

            this.albAnnotationPrefix = albAnnotationPrefix;
            return this;
        }
        @CustomType.Setter
        public Builder albIngress(String albIngress) {
            if (albIngress == null) {
              throw new MissingRequiredPropertyException("RolloutSpecTrafficAlb", "albIngress");
            }
            this.albIngress = albIngress;
            return this;
        }
        @CustomType.Setter
        public Builder albRootService(String albRootService) {
            if (albRootService == null) {
              throw new MissingRequiredPropertyException("RolloutSpecTrafficAlb", "albRootService");
            }
            this.albRootService = albRootService;
            return this;
        }
        @CustomType.Setter
        public Builder servicePort(Integer servicePort) {
            if (servicePort == null) {
              throw new MissingRequiredPropertyException("RolloutSpecTrafficAlb", "servicePort");
            }
            this.servicePort = servicePort;
            return this;
        }
        @CustomType.Setter
        public Builder stickinessConfig(@Nullable RolloutSpecTrafficAlbStickinessConfig stickinessConfig) {

            this.stickinessConfig = stickinessConfig;
            return this;
        }
        public RolloutSpecTrafficAlb build() {
            final var _resultValue = new RolloutSpecTrafficAlb();
            _resultValue.albAnnotationPrefix = albAnnotationPrefix;
            _resultValue.albIngress = albIngress;
            _resultValue.albRootService = albRootService;
            _resultValue.servicePort = servicePort;
            _resultValue.stickinessConfig = stickinessConfig;
            return _resultValue;
        }
    }
}
