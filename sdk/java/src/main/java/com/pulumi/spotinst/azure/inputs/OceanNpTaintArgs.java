// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class OceanNpTaintArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanNpTaintArgs Empty = new OceanNpTaintArgs();

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
     * Set taint key. The following taint keys are not allowed: [&#34;node.kubernetes.io/not-ready&#34;,  &#34;node.kubernetes.io/unreachable&#34;, &#34;node.kubernetes.io/unschedulable&#34;,  &#34;node.kubernetes.io/memory-pressure&#34;,  &#34;node.kubernetes.io/disk-pressure&#34;,  &#34;node.kubernetes.io/network-unavailable&#34;,  &#34;node.kubernetes.io/pid-pressure&#34;,  &#34;node.kubernetes.io/out-of-service&#34;,  &#34;node.cloudprovider.kubernetes.io/uninitialized&#34;,  &#34;node.cloudprovider.kubernetes.io/shutdown&#34;, &#34;kubernetes.azure.com/scalesetpriority&#34;]
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return Set taint key. The following taint keys are not allowed: [&#34;node.kubernetes.io/not-ready&#34;,  &#34;node.kubernetes.io/unreachable&#34;, &#34;node.kubernetes.io/unschedulable&#34;,  &#34;node.kubernetes.io/memory-pressure&#34;,  &#34;node.kubernetes.io/disk-pressure&#34;,  &#34;node.kubernetes.io/network-unavailable&#34;,  &#34;node.kubernetes.io/pid-pressure&#34;,  &#34;node.kubernetes.io/out-of-service&#34;,  &#34;node.cloudprovider.kubernetes.io/uninitialized&#34;,  &#34;node.cloudprovider.kubernetes.io/shutdown&#34;, &#34;kubernetes.azure.com/scalesetpriority&#34;]
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

    private OceanNpTaintArgs() {}

    private OceanNpTaintArgs(OceanNpTaintArgs $) {
        this.effect = $.effect;
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanNpTaintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanNpTaintArgs $;

        public Builder() {
            $ = new OceanNpTaintArgs();
        }

        public Builder(OceanNpTaintArgs defaults) {
            $ = new OceanNpTaintArgs(Objects.requireNonNull(defaults));
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
         * @param key Set taint key. The following taint keys are not allowed: [&#34;node.kubernetes.io/not-ready&#34;,  &#34;node.kubernetes.io/unreachable&#34;, &#34;node.kubernetes.io/unschedulable&#34;,  &#34;node.kubernetes.io/memory-pressure&#34;,  &#34;node.kubernetes.io/disk-pressure&#34;,  &#34;node.kubernetes.io/network-unavailable&#34;,  &#34;node.kubernetes.io/pid-pressure&#34;,  &#34;node.kubernetes.io/out-of-service&#34;,  &#34;node.cloudprovider.kubernetes.io/uninitialized&#34;,  &#34;node.cloudprovider.kubernetes.io/shutdown&#34;, &#34;kubernetes.azure.com/scalesetpriority&#34;]
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Set taint key. The following taint keys are not allowed: [&#34;node.kubernetes.io/not-ready&#34;,  &#34;node.kubernetes.io/unreachable&#34;, &#34;node.kubernetes.io/unschedulable&#34;,  &#34;node.kubernetes.io/memory-pressure&#34;,  &#34;node.kubernetes.io/disk-pressure&#34;,  &#34;node.kubernetes.io/network-unavailable&#34;,  &#34;node.kubernetes.io/pid-pressure&#34;,  &#34;node.kubernetes.io/out-of-service&#34;,  &#34;node.cloudprovider.kubernetes.io/uninitialized&#34;,  &#34;node.cloudprovider.kubernetes.io/shutdown&#34;, &#34;kubernetes.azure.com/scalesetpriority&#34;]
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

        public OceanNpTaintArgs build() {
            if ($.effect == null) {
                throw new MissingRequiredPropertyException("OceanNpTaintArgs", "effect");
            }
            if ($.key == null) {
                throw new MissingRequiredPropertyException("OceanNpTaintArgs", "key");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("OceanNpTaintArgs", "value");
            }
            return $;
        }
    }

}
