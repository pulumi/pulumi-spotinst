// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class OceanLaunchSpecAttribute {
    /**
     * @return The label key.
     * 
     */
    private String key;
    /**
     * @return The label value.
     * 
     */
    private String value;

    private OceanLaunchSpecAttribute() {}
    /**
     * @return The label key.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return The label value.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanLaunchSpecAttribute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private String value;
        public Builder() {}
        public Builder(OceanLaunchSpecAttribute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public OceanLaunchSpecAttribute build() {
            final var _resultValue = new OceanLaunchSpecAttribute();
            _resultValue.key = key;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
