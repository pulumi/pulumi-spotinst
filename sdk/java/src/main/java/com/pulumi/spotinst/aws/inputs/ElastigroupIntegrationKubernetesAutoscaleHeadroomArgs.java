// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupIntegrationKubernetesAutoscaleHeadroomArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupIntegrationKubernetesAutoscaleHeadroomArgs Empty = new ElastigroupIntegrationKubernetesAutoscaleHeadroomArgs();

    @Import(name="cpuPerUnit")
    private @Nullable Output<Integer> cpuPerUnit;

    public Optional<Output<Integer>> cpuPerUnit() {
        return Optional.ofNullable(this.cpuPerUnit);
    }

    @Import(name="memoryPerUnit")
    private @Nullable Output<Integer> memoryPerUnit;

    public Optional<Output<Integer>> memoryPerUnit() {
        return Optional.ofNullable(this.memoryPerUnit);
    }

    @Import(name="numOfUnits")
    private @Nullable Output<Integer> numOfUnits;

    public Optional<Output<Integer>> numOfUnits() {
        return Optional.ofNullable(this.numOfUnits);
    }

    private ElastigroupIntegrationKubernetesAutoscaleHeadroomArgs() {}

    private ElastigroupIntegrationKubernetesAutoscaleHeadroomArgs(ElastigroupIntegrationKubernetesAutoscaleHeadroomArgs $) {
        this.cpuPerUnit = $.cpuPerUnit;
        this.memoryPerUnit = $.memoryPerUnit;
        this.numOfUnits = $.numOfUnits;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupIntegrationKubernetesAutoscaleHeadroomArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupIntegrationKubernetesAutoscaleHeadroomArgs $;

        public Builder() {
            $ = new ElastigroupIntegrationKubernetesAutoscaleHeadroomArgs();
        }

        public Builder(ElastigroupIntegrationKubernetesAutoscaleHeadroomArgs defaults) {
            $ = new ElastigroupIntegrationKubernetesAutoscaleHeadroomArgs(Objects.requireNonNull(defaults));
        }

        public Builder cpuPerUnit(@Nullable Output<Integer> cpuPerUnit) {
            $.cpuPerUnit = cpuPerUnit;
            return this;
        }

        public Builder cpuPerUnit(Integer cpuPerUnit) {
            return cpuPerUnit(Output.of(cpuPerUnit));
        }

        public Builder memoryPerUnit(@Nullable Output<Integer> memoryPerUnit) {
            $.memoryPerUnit = memoryPerUnit;
            return this;
        }

        public Builder memoryPerUnit(Integer memoryPerUnit) {
            return memoryPerUnit(Output.of(memoryPerUnit));
        }

        public Builder numOfUnits(@Nullable Output<Integer> numOfUnits) {
            $.numOfUnits = numOfUnits;
            return this;
        }

        public Builder numOfUnits(Integer numOfUnits) {
            return numOfUnits(Output.of(numOfUnits));
        }

        public ElastigroupIntegrationKubernetesAutoscaleHeadroomArgs build() {
            return $;
        }
    }

}
