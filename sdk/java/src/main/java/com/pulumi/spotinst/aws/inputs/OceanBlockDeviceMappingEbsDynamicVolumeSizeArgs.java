// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class OceanBlockDeviceMappingEbsDynamicVolumeSizeArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanBlockDeviceMappingEbsDynamicVolumeSizeArgs Empty = new OceanBlockDeviceMappingEbsDynamicVolumeSizeArgs();

    /**
     * Int. Initial size for volume. (Example: 50)
     * 
     */
    @Import(name="baseSize", required=true)
    private Output<Integer> baseSize;

    /**
     * @return Int. Initial size for volume. (Example: 50)
     * 
     */
    public Output<Integer> baseSize() {
        return this.baseSize;
    }

    /**
     * String. Resource type to increase volume size dynamically by. (Valid values: `CPU`)
     * 
     */
    @Import(name="resource", required=true)
    private Output<String> resource;

    /**
     * @return String. Resource type to increase volume size dynamically by. (Valid values: `CPU`)
     * 
     */
    public Output<String> resource() {
        return this.resource;
    }

    /**
     * Int. Additional size (in GB) per resource unit. (Example: `baseSize=50`, `sizePerResourceUnit=20`, and instance with 2 CPU is launched; its total disk size will be: 90GB).
     * 
     */
    @Import(name="sizePerResourceUnit", required=true)
    private Output<Integer> sizePerResourceUnit;

    /**
     * @return Int. Additional size (in GB) per resource unit. (Example: `baseSize=50`, `sizePerResourceUnit=20`, and instance with 2 CPU is launched; its total disk size will be: 90GB).
     * 
     */
    public Output<Integer> sizePerResourceUnit() {
        return this.sizePerResourceUnit;
    }

    private OceanBlockDeviceMappingEbsDynamicVolumeSizeArgs() {}

    private OceanBlockDeviceMappingEbsDynamicVolumeSizeArgs(OceanBlockDeviceMappingEbsDynamicVolumeSizeArgs $) {
        this.baseSize = $.baseSize;
        this.resource = $.resource;
        this.sizePerResourceUnit = $.sizePerResourceUnit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanBlockDeviceMappingEbsDynamicVolumeSizeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanBlockDeviceMappingEbsDynamicVolumeSizeArgs $;

        public Builder() {
            $ = new OceanBlockDeviceMappingEbsDynamicVolumeSizeArgs();
        }

        public Builder(OceanBlockDeviceMappingEbsDynamicVolumeSizeArgs defaults) {
            $ = new OceanBlockDeviceMappingEbsDynamicVolumeSizeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param baseSize Int. Initial size for volume. (Example: 50)
         * 
         * @return builder
         * 
         */
        public Builder baseSize(Output<Integer> baseSize) {
            $.baseSize = baseSize;
            return this;
        }

        /**
         * @param baseSize Int. Initial size for volume. (Example: 50)
         * 
         * @return builder
         * 
         */
        public Builder baseSize(Integer baseSize) {
            return baseSize(Output.of(baseSize));
        }

        /**
         * @param resource String. Resource type to increase volume size dynamically by. (Valid values: `CPU`)
         * 
         * @return builder
         * 
         */
        public Builder resource(Output<String> resource) {
            $.resource = resource;
            return this;
        }

        /**
         * @param resource String. Resource type to increase volume size dynamically by. (Valid values: `CPU`)
         * 
         * @return builder
         * 
         */
        public Builder resource(String resource) {
            return resource(Output.of(resource));
        }

        /**
         * @param sizePerResourceUnit Int. Additional size (in GB) per resource unit. (Example: `baseSize=50`, `sizePerResourceUnit=20`, and instance with 2 CPU is launched; its total disk size will be: 90GB).
         * 
         * @return builder
         * 
         */
        public Builder sizePerResourceUnit(Output<Integer> sizePerResourceUnit) {
            $.sizePerResourceUnit = sizePerResourceUnit;
            return this;
        }

        /**
         * @param sizePerResourceUnit Int. Additional size (in GB) per resource unit. (Example: `baseSize=50`, `sizePerResourceUnit=20`, and instance with 2 CPU is launched; its total disk size will be: 90GB).
         * 
         * @return builder
         * 
         */
        public Builder sizePerResourceUnit(Integer sizePerResourceUnit) {
            return sizePerResourceUnit(Output.of(sizePerResourceUnit));
        }

        public OceanBlockDeviceMappingEbsDynamicVolumeSizeArgs build() {
            if ($.baseSize == null) {
                throw new MissingRequiredPropertyException("OceanBlockDeviceMappingEbsDynamicVolumeSizeArgs", "baseSize");
            }
            if ($.resource == null) {
                throw new MissingRequiredPropertyException("OceanBlockDeviceMappingEbsDynamicVolumeSizeArgs", "resource");
            }
            if ($.sizePerResourceUnit == null) {
                throw new MissingRequiredPropertyException("OceanBlockDeviceMappingEbsDynamicVolumeSizeArgs", "sizePerResourceUnit");
            }
            return $;
        }
    }

}
