// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class OceanLaunchSpecTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanLaunchSpecTagArgs Empty = new OceanLaunchSpecTagArgs();

    /**
     * The label key.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The label key.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The label value.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The label value.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private OceanLaunchSpecTagArgs() {}

    private OceanLaunchSpecTagArgs(OceanLaunchSpecTagArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanLaunchSpecTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanLaunchSpecTagArgs $;

        public Builder() {
            $ = new OceanLaunchSpecTagArgs();
        }

        public Builder(OceanLaunchSpecTagArgs defaults) {
            $ = new OceanLaunchSpecTagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The label key.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The label key.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value The label value.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The label value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public OceanLaunchSpecTagArgs build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("OceanLaunchSpecTagArgs", "key");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("OceanLaunchSpecTagArgs", "value");
            }
            return $;
        }
    }

}
