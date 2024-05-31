// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class OceanTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanTagArgs Empty = new OceanTagArgs();

    /**
     * The tag key.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The tag key.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The tag value.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The tag value.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private OceanTagArgs() {}

    private OceanTagArgs(OceanTagArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanTagArgs $;

        public Builder() {
            $ = new OceanTagArgs();
        }

        public Builder(OceanTagArgs defaults) {
            $ = new OceanTagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The tag key.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The tag key.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value The tag value.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The tag value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public OceanTagArgs build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("OceanTagArgs", "key");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("OceanTagArgs", "value");
            }
            return $;
        }
    }

}