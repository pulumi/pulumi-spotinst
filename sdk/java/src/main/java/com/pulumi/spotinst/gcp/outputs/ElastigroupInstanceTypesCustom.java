// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gcp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class ElastigroupInstanceTypesCustom {
    /**
     * @return The memory (in GiB) in the custom instance types. GCP has a number of limitations on accepted memory values.For more information, see the GCP documentation (here.)[https://cloud.google.com/compute/docs/instances/creating-instance-with-custom-machine-type#specifications]
     * 
     */
    private Integer memoryGib;
    private Integer vcpu;

    private ElastigroupInstanceTypesCustom() {}
    /**
     * @return The memory (in GiB) in the custom instance types. GCP has a number of limitations on accepted memory values.For more information, see the GCP documentation (here.)[https://cloud.google.com/compute/docs/instances/creating-instance-with-custom-machine-type#specifications]
     * 
     */
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
            this.memoryGib = Objects.requireNonNull(memoryGib);
            return this;
        }
        @CustomType.Setter
        public Builder vcpu(Integer vcpu) {
            this.vcpu = Objects.requireNonNull(vcpu);
            return this;
        }
        public ElastigroupInstanceTypesCustom build() {
            final var o = new ElastigroupInstanceTypesCustom();
            o.memoryGib = memoryGib;
            o.vcpu = vcpu;
            return o;
        }
    }
}