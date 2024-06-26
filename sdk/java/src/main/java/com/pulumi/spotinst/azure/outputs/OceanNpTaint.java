// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class OceanNpTaint {
    /**
     * @return Set taint effect.
     * 
     */
    private String effect;
    /**
     * @return Set taint key. The following taint keys are not allowed: [&#34;node.kubernetes.io/not-ready&#34;,  &#34;node.kubernetes.io/unreachable&#34;, &#34;node.kubernetes.io/unschedulable&#34;,  &#34;node.kubernetes.io/memory-pressure&#34;,  &#34;node.kubernetes.io/disk-pressure&#34;,  &#34;node.kubernetes.io/network-unavailable&#34;,  &#34;node.kubernetes.io/pid-pressure&#34;,  &#34;node.kubernetes.io/out-of-service&#34;,  &#34;node.cloudprovider.kubernetes.io/uninitialized&#34;,  &#34;node.cloudprovider.kubernetes.io/shutdown&#34;, &#34;kubernetes.azure.com/scalesetpriority&#34;]
     * 
     */
    private String key;
    /**
     * @return Set taint value.
     * 
     */
    private String value;

    private OceanNpTaint() {}
    /**
     * @return Set taint effect.
     * 
     */
    public String effect() {
        return this.effect;
    }
    /**
     * @return Set taint key. The following taint keys are not allowed: [&#34;node.kubernetes.io/not-ready&#34;,  &#34;node.kubernetes.io/unreachable&#34;, &#34;node.kubernetes.io/unschedulable&#34;,  &#34;node.kubernetes.io/memory-pressure&#34;,  &#34;node.kubernetes.io/disk-pressure&#34;,  &#34;node.kubernetes.io/network-unavailable&#34;,  &#34;node.kubernetes.io/pid-pressure&#34;,  &#34;node.kubernetes.io/out-of-service&#34;,  &#34;node.cloudprovider.kubernetes.io/uninitialized&#34;,  &#34;node.cloudprovider.kubernetes.io/shutdown&#34;, &#34;kubernetes.azure.com/scalesetpriority&#34;]
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Set taint value.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanNpTaint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String effect;
        private String key;
        private String value;
        public Builder() {}
        public Builder(OceanNpTaint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effect = defaults.effect;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder effect(String effect) {
            if (effect == null) {
              throw new MissingRequiredPropertyException("OceanNpTaint", "effect");
            }
            this.effect = effect;
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("OceanNpTaint", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("OceanNpTaint", "value");
            }
            this.value = value;
            return this;
        }
        public OceanNpTaint build() {
            final var _resultValue = new OceanNpTaint();
            _resultValue.effect = effect;
            _resultValue.key = key;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
