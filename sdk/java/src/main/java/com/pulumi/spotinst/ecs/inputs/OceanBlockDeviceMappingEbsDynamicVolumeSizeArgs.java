// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class OceanBlockDeviceMappingEbsDynamicVolumeSizeArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanBlockDeviceMappingEbsDynamicVolumeSizeArgs Empty = new OceanBlockDeviceMappingEbsDynamicVolumeSizeArgs();

    @Import(name="baseSize", required=true)
    private Output<Integer> baseSize;

    public Output<Integer> baseSize() {
        return this.baseSize;
    }

    @Import(name="resource", required=true)
    private Output<String> resource;

    public Output<String> resource() {
        return this.resource;
    }

    @Import(name="sizePerResourceUnit", required=true)
    private Output<Integer> sizePerResourceUnit;

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

        public Builder baseSize(Output<Integer> baseSize) {
            $.baseSize = baseSize;
            return this;
        }

        public Builder baseSize(Integer baseSize) {
            return baseSize(Output.of(baseSize));
        }

        public Builder resource(Output<String> resource) {
            $.resource = resource;
            return this;
        }

        public Builder resource(String resource) {
            return resource(Output.of(resource));
        }

        public Builder sizePerResourceUnit(Output<Integer> sizePerResourceUnit) {
            $.sizePerResourceUnit = sizePerResourceUnit;
            return this;
        }

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
