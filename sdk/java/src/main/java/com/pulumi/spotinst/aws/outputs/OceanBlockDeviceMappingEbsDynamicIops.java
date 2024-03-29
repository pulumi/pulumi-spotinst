// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class OceanBlockDeviceMappingEbsDynamicIops {
    /**
     * @return Initial size for IOPS.
     * 
     */
    private Integer baseSize;
    private String resource;
    /**
     * @return Additional size per resource unit (in IOPS). (Example: `baseSize=50`, `sizePerResourceUnit=20`, and an instance with 2 CPU is launched; its IOPS size will be: 90).
     * 
     */
    private Integer sizePerResourceUnit;

    private OceanBlockDeviceMappingEbsDynamicIops() {}
    /**
     * @return Initial size for IOPS.
     * 
     */
    public Integer baseSize() {
        return this.baseSize;
    }
    public String resource() {
        return this.resource;
    }
    /**
     * @return Additional size per resource unit (in IOPS). (Example: `baseSize=50`, `sizePerResourceUnit=20`, and an instance with 2 CPU is launched; its IOPS size will be: 90).
     * 
     */
    public Integer sizePerResourceUnit() {
        return this.sizePerResourceUnit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanBlockDeviceMappingEbsDynamicIops defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer baseSize;
        private String resource;
        private Integer sizePerResourceUnit;
        public Builder() {}
        public Builder(OceanBlockDeviceMappingEbsDynamicIops defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseSize = defaults.baseSize;
    	      this.resource = defaults.resource;
    	      this.sizePerResourceUnit = defaults.sizePerResourceUnit;
        }

        @CustomType.Setter
        public Builder baseSize(Integer baseSize) {
            if (baseSize == null) {
              throw new MissingRequiredPropertyException("OceanBlockDeviceMappingEbsDynamicIops", "baseSize");
            }
            this.baseSize = baseSize;
            return this;
        }
        @CustomType.Setter
        public Builder resource(String resource) {
            if (resource == null) {
              throw new MissingRequiredPropertyException("OceanBlockDeviceMappingEbsDynamicIops", "resource");
            }
            this.resource = resource;
            return this;
        }
        @CustomType.Setter
        public Builder sizePerResourceUnit(Integer sizePerResourceUnit) {
            if (sizePerResourceUnit == null) {
              throw new MissingRequiredPropertyException("OceanBlockDeviceMappingEbsDynamicIops", "sizePerResourceUnit");
            }
            this.sizePerResourceUnit = sizePerResourceUnit;
            return this;
        }
        public OceanBlockDeviceMappingEbsDynamicIops build() {
            final var _resultValue = new OceanBlockDeviceMappingEbsDynamicIops();
            _resultValue.baseSize = baseSize;
            _resultValue.resource = resource;
            _resultValue.sizePerResourceUnit = sizePerResourceUnit;
            return _resultValue;
        }
    }
}
