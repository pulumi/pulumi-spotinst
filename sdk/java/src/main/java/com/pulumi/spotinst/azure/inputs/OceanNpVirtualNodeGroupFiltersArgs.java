// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanNpVirtualNodeGroupFiltersArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanNpVirtualNodeGroupFiltersArgs Empty = new OceanNpVirtualNodeGroupFiltersArgs();

    @Import(name="acceleratedNetworking")
    private @Nullable Output<String> acceleratedNetworking;

    public Optional<Output<String>> acceleratedNetworking() {
        return Optional.ofNullable(this.acceleratedNetworking);
    }

    @Import(name="architectures")
    private @Nullable Output<List<String>> architectures;

    public Optional<Output<List<String>>> architectures() {
        return Optional.ofNullable(this.architectures);
    }

    @Import(name="diskPerformance")
    private @Nullable Output<String> diskPerformance;

    public Optional<Output<String>> diskPerformance() {
        return Optional.ofNullable(this.diskPerformance);
    }

    @Import(name="excludeSeries")
    private @Nullable Output<List<String>> excludeSeries;

    public Optional<Output<List<String>>> excludeSeries() {
        return Optional.ofNullable(this.excludeSeries);
    }

    @Import(name="maxGpu")
    private @Nullable Output<Double> maxGpu;

    public Optional<Output<Double>> maxGpu() {
        return Optional.ofNullable(this.maxGpu);
    }

    @Import(name="maxMemoryGib")
    private @Nullable Output<Double> maxMemoryGib;

    public Optional<Output<Double>> maxMemoryGib() {
        return Optional.ofNullable(this.maxMemoryGib);
    }

    @Import(name="maxVcpu")
    private @Nullable Output<Integer> maxVcpu;

    public Optional<Output<Integer>> maxVcpu() {
        return Optional.ofNullable(this.maxVcpu);
    }

    @Import(name="minData")
    private @Nullable Output<Integer> minData;

    public Optional<Output<Integer>> minData() {
        return Optional.ofNullable(this.minData);
    }

    @Import(name="minGpu")
    private @Nullable Output<Double> minGpu;

    public Optional<Output<Double>> minGpu() {
        return Optional.ofNullable(this.minGpu);
    }

    @Import(name="minMemoryGib")
    private @Nullable Output<Double> minMemoryGib;

    public Optional<Output<Double>> minMemoryGib() {
        return Optional.ofNullable(this.minMemoryGib);
    }

    @Import(name="minNics")
    private @Nullable Output<Integer> minNics;

    public Optional<Output<Integer>> minNics() {
        return Optional.ofNullable(this.minNics);
    }

    @Import(name="minVcpu")
    private @Nullable Output<Integer> minVcpu;

    public Optional<Output<Integer>> minVcpu() {
        return Optional.ofNullable(this.minVcpu);
    }

    @Import(name="series")
    private @Nullable Output<List<String>> series;

    public Optional<Output<List<String>>> series() {
        return Optional.ofNullable(this.series);
    }

    @Import(name="vmTypes")
    private @Nullable Output<List<String>> vmTypes;

    public Optional<Output<List<String>>> vmTypes() {
        return Optional.ofNullable(this.vmTypes);
    }

    private OceanNpVirtualNodeGroupFiltersArgs() {}

    private OceanNpVirtualNodeGroupFiltersArgs(OceanNpVirtualNodeGroupFiltersArgs $) {
        this.acceleratedNetworking = $.acceleratedNetworking;
        this.architectures = $.architectures;
        this.diskPerformance = $.diskPerformance;
        this.excludeSeries = $.excludeSeries;
        this.maxGpu = $.maxGpu;
        this.maxMemoryGib = $.maxMemoryGib;
        this.maxVcpu = $.maxVcpu;
        this.minData = $.minData;
        this.minGpu = $.minGpu;
        this.minMemoryGib = $.minMemoryGib;
        this.minNics = $.minNics;
        this.minVcpu = $.minVcpu;
        this.series = $.series;
        this.vmTypes = $.vmTypes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanNpVirtualNodeGroupFiltersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanNpVirtualNodeGroupFiltersArgs $;

        public Builder() {
            $ = new OceanNpVirtualNodeGroupFiltersArgs();
        }

        public Builder(OceanNpVirtualNodeGroupFiltersArgs defaults) {
            $ = new OceanNpVirtualNodeGroupFiltersArgs(Objects.requireNonNull(defaults));
        }

        public Builder acceleratedNetworking(@Nullable Output<String> acceleratedNetworking) {
            $.acceleratedNetworking = acceleratedNetworking;
            return this;
        }

        public Builder acceleratedNetworking(String acceleratedNetworking) {
            return acceleratedNetworking(Output.of(acceleratedNetworking));
        }

        public Builder architectures(@Nullable Output<List<String>> architectures) {
            $.architectures = architectures;
            return this;
        }

        public Builder architectures(List<String> architectures) {
            return architectures(Output.of(architectures));
        }

        public Builder architectures(String... architectures) {
            return architectures(List.of(architectures));
        }

        public Builder diskPerformance(@Nullable Output<String> diskPerformance) {
            $.diskPerformance = diskPerformance;
            return this;
        }

        public Builder diskPerformance(String diskPerformance) {
            return diskPerformance(Output.of(diskPerformance));
        }

        public Builder excludeSeries(@Nullable Output<List<String>> excludeSeries) {
            $.excludeSeries = excludeSeries;
            return this;
        }

        public Builder excludeSeries(List<String> excludeSeries) {
            return excludeSeries(Output.of(excludeSeries));
        }

        public Builder excludeSeries(String... excludeSeries) {
            return excludeSeries(List.of(excludeSeries));
        }

        public Builder maxGpu(@Nullable Output<Double> maxGpu) {
            $.maxGpu = maxGpu;
            return this;
        }

        public Builder maxGpu(Double maxGpu) {
            return maxGpu(Output.of(maxGpu));
        }

        public Builder maxMemoryGib(@Nullable Output<Double> maxMemoryGib) {
            $.maxMemoryGib = maxMemoryGib;
            return this;
        }

        public Builder maxMemoryGib(Double maxMemoryGib) {
            return maxMemoryGib(Output.of(maxMemoryGib));
        }

        public Builder maxVcpu(@Nullable Output<Integer> maxVcpu) {
            $.maxVcpu = maxVcpu;
            return this;
        }

        public Builder maxVcpu(Integer maxVcpu) {
            return maxVcpu(Output.of(maxVcpu));
        }

        public Builder minData(@Nullable Output<Integer> minData) {
            $.minData = minData;
            return this;
        }

        public Builder minData(Integer minData) {
            return minData(Output.of(minData));
        }

        public Builder minGpu(@Nullable Output<Double> minGpu) {
            $.minGpu = minGpu;
            return this;
        }

        public Builder minGpu(Double minGpu) {
            return minGpu(Output.of(minGpu));
        }

        public Builder minMemoryGib(@Nullable Output<Double> minMemoryGib) {
            $.minMemoryGib = minMemoryGib;
            return this;
        }

        public Builder minMemoryGib(Double minMemoryGib) {
            return minMemoryGib(Output.of(minMemoryGib));
        }

        public Builder minNics(@Nullable Output<Integer> minNics) {
            $.minNics = minNics;
            return this;
        }

        public Builder minNics(Integer minNics) {
            return minNics(Output.of(minNics));
        }

        public Builder minVcpu(@Nullable Output<Integer> minVcpu) {
            $.minVcpu = minVcpu;
            return this;
        }

        public Builder minVcpu(Integer minVcpu) {
            return minVcpu(Output.of(minVcpu));
        }

        public Builder series(@Nullable Output<List<String>> series) {
            $.series = series;
            return this;
        }

        public Builder series(List<String> series) {
            return series(Output.of(series));
        }

        public Builder series(String... series) {
            return series(List.of(series));
        }

        public Builder vmTypes(@Nullable Output<List<String>> vmTypes) {
            $.vmTypes = vmTypes;
            return this;
        }

        public Builder vmTypes(List<String> vmTypes) {
            return vmTypes(Output.of(vmTypes));
        }

        public Builder vmTypes(String... vmTypes) {
            return vmTypes(List.of(vmTypes));
        }

        public OceanNpVirtualNodeGroupFiltersArgs build() {
            return $;
        }
    }

}
