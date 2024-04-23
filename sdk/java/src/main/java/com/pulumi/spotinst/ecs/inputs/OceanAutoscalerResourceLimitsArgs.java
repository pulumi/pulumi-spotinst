// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanAutoscalerResourceLimitsArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanAutoscalerResourceLimitsArgs Empty = new OceanAutoscalerResourceLimitsArgs();

    @Import(name="maxMemoryGib")
    private @Nullable Output<Integer> maxMemoryGib;

    public Optional<Output<Integer>> maxMemoryGib() {
        return Optional.ofNullable(this.maxMemoryGib);
    }

    @Import(name="maxVcpu")
    private @Nullable Output<Integer> maxVcpu;

    public Optional<Output<Integer>> maxVcpu() {
        return Optional.ofNullable(this.maxVcpu);
    }

    private OceanAutoscalerResourceLimitsArgs() {}

    private OceanAutoscalerResourceLimitsArgs(OceanAutoscalerResourceLimitsArgs $) {
        this.maxMemoryGib = $.maxMemoryGib;
        this.maxVcpu = $.maxVcpu;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanAutoscalerResourceLimitsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanAutoscalerResourceLimitsArgs $;

        public Builder() {
            $ = new OceanAutoscalerResourceLimitsArgs();
        }

        public Builder(OceanAutoscalerResourceLimitsArgs defaults) {
            $ = new OceanAutoscalerResourceLimitsArgs(Objects.requireNonNull(defaults));
        }

        public Builder maxMemoryGib(@Nullable Output<Integer> maxMemoryGib) {
            $.maxMemoryGib = maxMemoryGib;
            return this;
        }

        public Builder maxMemoryGib(Integer maxMemoryGib) {
            return maxMemoryGib(Output.of(maxMemoryGib));
        }

        public Builder maxVcpu(@Nullable Output<Integer> maxVcpu) {
            $.maxVcpu = maxVcpu;
            return this;
        }

        public Builder maxVcpu(Integer maxVcpu) {
            return maxVcpu(Output.of(maxVcpu));
        }

        public OceanAutoscalerResourceLimitsArgs build() {
            return $;
        }
    }

}
