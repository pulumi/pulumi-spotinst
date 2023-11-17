// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanOsDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanOsDiskArgs Empty = new OceanOsDiskArgs();

    /**
     * The size of the OS disk in GB.
     * 
     */
    @Import(name="sizeGb", required=true)
    private Output<Integer> sizeGb;

    /**
     * @return The size of the OS disk in GB.
     * 
     */
    public Output<Integer> sizeGb() {
        return this.sizeGb;
    }

    /**
     * The type of the OS disk. Supported values: `Standard_LRS`, `Premium_LRS`, `StandardSSD_LRS`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the OS disk. Supported values: `Standard_LRS`, `Premium_LRS`, `StandardSSD_LRS`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private OceanOsDiskArgs() {}

    private OceanOsDiskArgs(OceanOsDiskArgs $) {
        this.sizeGb = $.sizeGb;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanOsDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanOsDiskArgs $;

        public Builder() {
            $ = new OceanOsDiskArgs();
        }

        public Builder(OceanOsDiskArgs defaults) {
            $ = new OceanOsDiskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param sizeGb The size of the OS disk in GB.
         * 
         * @return builder
         * 
         */
        public Builder sizeGb(Output<Integer> sizeGb) {
            $.sizeGb = sizeGb;
            return this;
        }

        /**
         * @param sizeGb The size of the OS disk in GB.
         * 
         * @return builder
         * 
         */
        public Builder sizeGb(Integer sizeGb) {
            return sizeGb(Output.of(sizeGb));
        }

        /**
         * @param type The type of the OS disk. Supported values: `Standard_LRS`, `Premium_LRS`, `StandardSSD_LRS`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the OS disk. Supported values: `Standard_LRS`, `Premium_LRS`, `StandardSSD_LRS`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public OceanOsDiskArgs build() {
            $.sizeGb = Objects.requireNonNull($.sizeGb, "expected parameter 'sizeGb' to be non-null");
            return $;
        }
    }

}
