// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class OceanBlockDeviceMappingEbsDynamicVolumeSize {
    private Integer baseSize;
    private String resource;
    private Integer sizePerResourceUnit;

    private OceanBlockDeviceMappingEbsDynamicVolumeSize() {}
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

    public static Builder builder(OceanBlockDeviceMappingEbsDynamicVolumeSize defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer baseSize;
        private String resource;
        private Integer sizePerResourceUnit;
        public Builder() {}
        public Builder(OceanBlockDeviceMappingEbsDynamicVolumeSize defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseSize = defaults.baseSize;
    	      this.resource = defaults.resource;
    	      this.sizePerResourceUnit = defaults.sizePerResourceUnit;
        }

        @CustomType.Setter
        public Builder baseSize(Integer baseSize) {
            if (baseSize == null) {
              throw new MissingRequiredPropertyException("OceanBlockDeviceMappingEbsDynamicVolumeSize", "baseSize");
            }
            this.baseSize = baseSize;
            return this;
        }
        @CustomType.Setter
        public Builder resource(String resource) {
            if (resource == null) {
              throw new MissingRequiredPropertyException("OceanBlockDeviceMappingEbsDynamicVolumeSize", "resource");
            }
            this.resource = resource;
            return this;
        }
        @CustomType.Setter
        public Builder sizePerResourceUnit(Integer sizePerResourceUnit) {
            if (sizePerResourceUnit == null) {
              throw new MissingRequiredPropertyException("OceanBlockDeviceMappingEbsDynamicVolumeSize", "sizePerResourceUnit");
            }
            this.sizePerResourceUnit = sizePerResourceUnit;
            return this;
        }
        public OceanBlockDeviceMappingEbsDynamicVolumeSize build() {
            final var _resultValue = new OceanBlockDeviceMappingEbsDynamicVolumeSize();
            _resultValue.baseSize = baseSize;
            _resultValue.resource = resource;
            _resultValue.sizePerResourceUnit = sizePerResourceUnit;
            return _resultValue;
        }
    }
}
