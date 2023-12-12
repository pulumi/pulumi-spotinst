// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class OceanVirtualNodeGroupTaint {
    /**
     * @return The effect of the taint. Valid values: `&#34;NoSchedule&#34;`, `&#34;PreferNoSchedule&#34;`, `&#34;NoExecute&#34;`, `&#34;PreferNoExecute&#34;`.
     * 
     */
    private String effect;
    /**
     * @return Tag Key for Vms in the cluster.
     * 
     */
    private String key;
    /**
     * @return Tag Value for VMs in the cluster.
     * 
     */
    private String value;

    private OceanVirtualNodeGroupTaint() {}
    /**
     * @return The effect of the taint. Valid values: `&#34;NoSchedule&#34;`, `&#34;PreferNoSchedule&#34;`, `&#34;NoExecute&#34;`, `&#34;PreferNoExecute&#34;`.
     * 
     */
    public String effect() {
        return this.effect;
    }
    /**
     * @return Tag Key for Vms in the cluster.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Tag Value for VMs in the cluster.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanVirtualNodeGroupTaint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String effect;
        private String key;
        private String value;
        public Builder() {}
        public Builder(OceanVirtualNodeGroupTaint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effect = defaults.effect;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder effect(String effect) {
            this.effect = Objects.requireNonNull(effect);
            return this;
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
        public OceanVirtualNodeGroupTaint build() {
            final var _resultValue = new OceanVirtualNodeGroupTaint();
            _resultValue.effect = effect;
            _resultValue.key = key;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
