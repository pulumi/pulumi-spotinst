// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;


public final class ElastigroupInstanceTypesCustomArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupInstanceTypesCustomArgs Empty = new ElastigroupInstanceTypesCustomArgs();

    @Import(name="memoryGib", required=true)
    private Output<Integer> memoryGib;

    public Output<Integer> memoryGib() {
        return this.memoryGib;
    }

    @Import(name="vcpu", required=true)
    private Output<Integer> vcpu;

    public Output<Integer> vcpu() {
        return this.vcpu;
    }

    private ElastigroupInstanceTypesCustomArgs() {}

    private ElastigroupInstanceTypesCustomArgs(ElastigroupInstanceTypesCustomArgs $) {
        this.memoryGib = $.memoryGib;
        this.vcpu = $.vcpu;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupInstanceTypesCustomArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupInstanceTypesCustomArgs $;

        public Builder() {
            $ = new ElastigroupInstanceTypesCustomArgs();
        }

        public Builder(ElastigroupInstanceTypesCustomArgs defaults) {
            $ = new ElastigroupInstanceTypesCustomArgs(Objects.requireNonNull(defaults));
        }

        public Builder memoryGib(Output<Integer> memoryGib) {
            $.memoryGib = memoryGib;
            return this;
        }

        public Builder memoryGib(Integer memoryGib) {
            return memoryGib(Output.of(memoryGib));
        }

        public Builder vcpu(Output<Integer> vcpu) {
            $.vcpu = vcpu;
            return this;
        }

        public Builder vcpu(Integer vcpu) {
            return vcpu(Output.of(vcpu));
        }

        public ElastigroupInstanceTypesCustomArgs build() {
            if ($.memoryGib == null) {
                throw new MissingRequiredPropertyException("ElastigroupInstanceTypesCustomArgs", "memoryGib");
            }
            if ($.vcpu == null) {
                throw new MissingRequiredPropertyException("ElastigroupInstanceTypesCustomArgs", "vcpu");
            }
            return $;
        }
    }

}