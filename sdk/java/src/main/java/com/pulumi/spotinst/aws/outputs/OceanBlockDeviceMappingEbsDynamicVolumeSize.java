// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class OceanBlockDeviceMappingEbsDynamicVolumeSize {
    /**
     * @return Int. Initial size for volume. (Example: 50)
     * 
     */
    private Integer baseSize;
    /**
     * @return String. Resource type to increase volume size dynamically by. (Valid values: `CPU`)
     * 
     */
    private String resource;
    /**
     * @return Int. Additional size (in GB) per resource unit. (Example: `baseSize=50`, `sizePerResourceUnit=20`, and instance with 2 CPU is launched; its total disk size will be: 90GB).
     * 
     */
    private Integer sizePerResourceUnit;

    private OceanBlockDeviceMappingEbsDynamicVolumeSize() {}
    /**
     * @return Int. Initial size for volume. (Example: 50)
     * 
     */
    public Integer baseSize() {
        return this.baseSize;
    }
    /**
     * @return String. Resource type to increase volume size dynamically by. (Valid values: `CPU`)
     * 
     */
    public String resource() {
        return this.resource;
    }
    /**
     * @return Int. Additional size (in GB) per resource unit. (Example: `baseSize=50`, `sizePerResourceUnit=20`, and instance with 2 CPU is launched; its total disk size will be: 90GB).
     * 
     */
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
