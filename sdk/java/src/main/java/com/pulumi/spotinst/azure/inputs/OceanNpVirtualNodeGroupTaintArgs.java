// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class OceanNpVirtualNodeGroupTaintArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanNpVirtualNodeGroupTaintArgs Empty = new OceanNpVirtualNodeGroupTaintArgs();

    /**
     * Set taint effect.
     * 
     */
    @Import(name="effect", required=true)
    private Output<String> effect;

    /**
     * @return Set taint effect.
     * 
     */
    public Output<String> effect() {
        return this.effect;
    }

    /**
     * Set taint key. The following are not allowed: &#34;kubernetes.azure.com/scalesetpriority&#34;.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return Set taint key. The following are not allowed: &#34;kubernetes.azure.com/scalesetpriority&#34;.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * Set taint value.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return Set taint value.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private OceanNpVirtualNodeGroupTaintArgs() {}

    private OceanNpVirtualNodeGroupTaintArgs(OceanNpVirtualNodeGroupTaintArgs $) {
        this.effect = $.effect;
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanNpVirtualNodeGroupTaintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanNpVirtualNodeGroupTaintArgs $;

        public Builder() {
            $ = new OceanNpVirtualNodeGroupTaintArgs();
        }

        public Builder(OceanNpVirtualNodeGroupTaintArgs defaults) {
            $ = new OceanNpVirtualNodeGroupTaintArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param effect Set taint effect.
         * 
         * @return builder
         * 
         */
        public Builder effect(Output<String> effect) {
            $.effect = effect;
            return this;
        }

        /**
         * @param effect Set taint effect.
         * 
         * @return builder
         * 
         */
        public Builder effect(String effect) {
            return effect(Output.of(effect));
        }

        /**
         * @param key Set taint key. The following are not allowed: &#34;kubernetes.azure.com/scalesetpriority&#34;.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Set taint key. The following are not allowed: &#34;kubernetes.azure.com/scalesetpriority&#34;.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value Set taint value.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Set taint value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public OceanNpVirtualNodeGroupTaintArgs build() {
            if ($.effect == null) {
                throw new MissingRequiredPropertyException("OceanNpVirtualNodeGroupTaintArgs", "effect");
            }
            if ($.key == null) {
                throw new MissingRequiredPropertyException("OceanNpVirtualNodeGroupTaintArgs", "key");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("OceanNpVirtualNodeGroupTaintArgs", "value");
            }
            return $;
        }
    }

}