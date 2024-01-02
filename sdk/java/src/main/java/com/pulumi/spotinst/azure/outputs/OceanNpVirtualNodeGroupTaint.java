// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class OceanNpVirtualNodeGroupTaint {
    private String effect;
    private String key;
    private String value;

    private OceanNpVirtualNodeGroupTaint() {}
    public String effect() {
        return this.effect;
    }
    public String key() {
        return this.key;
    }
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanNpVirtualNodeGroupTaint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String effect;
        private String key;
        private String value;
        public Builder() {}
        public Builder(OceanNpVirtualNodeGroupTaint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effect = defaults.effect;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder effect(String effect) {
            if (effect == null) {
              throw new MissingRequiredPropertyException("OceanNpVirtualNodeGroupTaint", "effect");
            }
            this.effect = effect;
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("OceanNpVirtualNodeGroupTaint", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("OceanNpVirtualNodeGroupTaint", "value");
            }
            this.value = value;
            return this;
        }
        public OceanNpVirtualNodeGroupTaint build() {
            final var _resultValue = new OceanNpVirtualNodeGroupTaint();
            _resultValue.effect = effect;
            _resultValue.key = key;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
