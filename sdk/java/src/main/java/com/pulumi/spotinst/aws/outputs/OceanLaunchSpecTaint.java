// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class OceanLaunchSpecTaint {
    /**
     * @return The effect of the taint. Valid values: `&#34;NoSchedule&#34;`, `&#34;PreferNoSchedule&#34;`, `&#34;NoExecute&#34;`.
     * 
     */
    private String effect;
    /**
     * @return The taint key.
     * 
     */
    private String key;
    /**
     * @return The taint value.
     * 
     */
    private String value;

    private OceanLaunchSpecTaint() {}
    /**
     * @return The effect of the taint. Valid values: `&#34;NoSchedule&#34;`, `&#34;PreferNoSchedule&#34;`, `&#34;NoExecute&#34;`.
     * 
     */
    public String effect() {
        return this.effect;
    }
    /**
     * @return The taint key.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return The taint value.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanLaunchSpecTaint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String effect;
        private String key;
        private String value;
        public Builder() {}
        public Builder(OceanLaunchSpecTaint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effect = defaults.effect;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder effect(String effect) {
            if (effect == null) {
              throw new MissingRequiredPropertyException("OceanLaunchSpecTaint", "effect");
            }
            this.effect = effect;
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("OceanLaunchSpecTaint", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("OceanLaunchSpecTaint", "value");
            }
            this.value = value;
            return this;
        }
        public OceanLaunchSpecTaint build() {
            final var _resultValue = new OceanLaunchSpecTaint();
            _resultValue.effect = effect;
            _resultValue.key = key;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
