// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class OceanLaunchSpecBlockDeviceMappingEbsDynamicVolumeSize {
    private Integer baseSize;
    private String resource;
    private Integer sizePerResourceUnit;

    private OceanLaunchSpecBlockDeviceMappingEbsDynamicVolumeSize() {}
    public Integer baseSize() {
        return this.baseSize;
    }
    public String resource() {
        return this.resource;
    }
    public Integer sizePerResourceUnit() {
        return this.sizePerResourceUnit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanLaunchSpecBlockDeviceMappingEbsDynamicVolumeSize defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer baseSize;
        private String resource;
        private Integer sizePerResourceUnit;
        public Builder() {}
        public Builder(OceanLaunchSpecBlockDeviceMappingEbsDynamicVolumeSize defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseSize = defaults.baseSize;
    	      this.resource = defaults.resource;
    	      this.sizePerResourceUnit = defaults.sizePerResourceUnit;
        }

        @CustomType.Setter
        public Builder baseSize(Integer baseSize) {
            this.baseSize = Objects.requireNonNull(baseSize);
            return this;
        }
        @CustomType.Setter
        public Builder resource(String resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }
        @CustomType.Setter
        public Builder sizePerResourceUnit(Integer sizePerResourceUnit) {
            this.sizePerResourceUnit = Objects.requireNonNull(sizePerResourceUnit);
            return this;
        }
        public OceanLaunchSpecBlockDeviceMappingEbsDynamicVolumeSize build() {
            final var o = new OceanLaunchSpecBlockDeviceMappingEbsDynamicVolumeSize();
            o.baseSize = baseSize;
            o.resource = resource;
            o.sizePerResourceUnit = sizePerResourceUnit;
            return o;
        }
    }
}
