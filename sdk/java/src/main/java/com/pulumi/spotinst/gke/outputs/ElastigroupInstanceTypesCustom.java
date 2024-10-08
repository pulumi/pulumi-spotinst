// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class ElastigroupInstanceTypesCustom {
    private Integer memoryGib;
    private Integer vcpu;

    private ElastigroupInstanceTypesCustom() {}
    public Integer memoryGib() {
        return this.memoryGib;
    }
    public Integer vcpu() {
        return this.vcpu;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupInstanceTypesCustom defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer memoryGib;
        private Integer vcpu;
        public Builder() {}
        public Builder(ElastigroupInstanceTypesCustom defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.memoryGib = defaults.memoryGib;
    	      this.vcpu = defaults.vcpu;
        }

        @CustomType.Setter
        public Builder memoryGib(Integer memoryGib) {
            if (memoryGib == null) {
              throw new MissingRequiredPropertyException("ElastigroupInstanceTypesCustom", "memoryGib");
            }
            this.memoryGib = memoryGib;
            return this;
        }
        @CustomType.Setter
        public Builder vcpu(Integer vcpu) {
            if (vcpu == null) {
              throw new MissingRequiredPropertyException("ElastigroupInstanceTypesCustom", "vcpu");
            }
            this.vcpu = vcpu;
            return this;
        }
        public ElastigroupInstanceTypesCustom build() {
            final var _resultValue = new ElastigroupInstanceTypesCustom();
            _resultValue.memoryGib = memoryGib;
            _resultValue.vcpu = vcpu;
            return _resultValue;
        }
    }
}