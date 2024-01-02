// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanNpFilters {
    private @Nullable String acceleratedNetworking;
    private @Nullable List<String> architectures;
    private @Nullable String diskPerformance;
    private @Nullable List<String> excludeSeries;
    private @Nullable Double maxGpu;
    private @Nullable Double maxMemoryGib;
    private @Nullable Integer maxVcpu;
    private @Nullable Integer minDisk;
    private @Nullable Double minGpu;
    private @Nullable Double minMemoryGib;
    private @Nullable Integer minNics;
    private @Nullable Integer minVcpu;
    private @Nullable List<String> series;
    private @Nullable List<String> vmTypes;

    private OceanNpFilters() {}
    public Optional<String> acceleratedNetworking() {
        return Optional.ofNullable(this.acceleratedNetworking);
    }
    public List<String> architectures() {
        return this.architectures == null ? List.of() : this.architectures;
    }
    public Optional<String> diskPerformance() {
        return Optional.ofNullable(this.diskPerformance);
    }
    public List<String> excludeSeries() {
        return this.excludeSeries == null ? List.of() : this.excludeSeries;
    }
    public Optional<Double> maxGpu() {
        return Optional.ofNullable(this.maxGpu);
    }
    public Optional<Double> maxMemoryGib() {
        return Optional.ofNullable(this.maxMemoryGib);
    }
    public Optional<Integer> maxVcpu() {
        return Optional.ofNullable(this.maxVcpu);
    }
    public Optional<Integer> minDisk() {
        return Optional.ofNullable(this.minDisk);
    }
    public Optional<Double> minGpu() {
        return Optional.ofNullable(this.minGpu);
    }
    public Optional<Double> minMemoryGib() {
        return Optional.ofNullable(this.minMemoryGib);
    }
    public Optional<Integer> minNics() {
        return Optional.ofNullable(this.minNics);
    }
    public Optional<Integer> minVcpu() {
        return Optional.ofNullable(this.minVcpu);
    }
    public List<String> series() {
        return this.series == null ? List.of() : this.series;
    }
    public List<String> vmTypes() {
        return this.vmTypes == null ? List.of() : this.vmTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanNpFilters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String acceleratedNetworking;
        private @Nullable List<String> architectures;
        private @Nullable String diskPerformance;
        private @Nullable List<String> excludeSeries;
        private @Nullable Double maxGpu;
        private @Nullable Double maxMemoryGib;
        private @Nullable Integer maxVcpu;
        private @Nullable Integer minDisk;
        private @Nullable Double minGpu;
        private @Nullable Double minMemoryGib;
        private @Nullable Integer minNics;
        private @Nullable Integer minVcpu;
        private @Nullable List<String> series;
        private @Nullable List<String> vmTypes;
        public Builder() {}
        public Builder(OceanNpFilters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratedNetworking = defaults.acceleratedNetworking;
    	      this.architectures = defaults.architectures;
    	      this.diskPerformance = defaults.diskPerformance;
    	      this.excludeSeries = defaults.excludeSeries;
    	      this.maxGpu = defaults.maxGpu;
    	      this.maxMemoryGib = defaults.maxMemoryGib;
    	      this.maxVcpu = defaults.maxVcpu;
    	      this.minDisk = defaults.minDisk;
    	      this.minGpu = defaults.minGpu;
    	      this.minMemoryGib = defaults.minMemoryGib;
    	      this.minNics = defaults.minNics;
    	      this.minVcpu = defaults.minVcpu;
    	      this.series = defaults.series;
    	      this.vmTypes = defaults.vmTypes;
        }

        @CustomType.Setter
        public Builder acceleratedNetworking(@Nullable String acceleratedNetworking) {

            this.acceleratedNetworking = acceleratedNetworking;
            return this;
        }
        @CustomType.Setter
        public Builder architectures(@Nullable List<String> architectures) {

            this.architectures = architectures;
            return this;
        }
        public Builder architectures(String... architectures) {
            return architectures(List.of(architectures));
        }
        @CustomType.Setter
        public Builder diskPerformance(@Nullable String diskPerformance) {

            this.diskPerformance = diskPerformance;
            return this;
        }
        @CustomType.Setter
        public Builder excludeSeries(@Nullable List<String> excludeSeries) {

            this.excludeSeries = excludeSeries;
            return this;
        }
        public Builder excludeSeries(String... excludeSeries) {
            return excludeSeries(List.of(excludeSeries));
        }
        @CustomType.Setter
        public Builder maxGpu(@Nullable Double maxGpu) {

            this.maxGpu = maxGpu;
            return this;
        }
        @CustomType.Setter
        public Builder maxMemoryGib(@Nullable Double maxMemoryGib) {

            this.maxMemoryGib = maxMemoryGib;
            return this;
        }
        @CustomType.Setter
        public Builder maxVcpu(@Nullable Integer maxVcpu) {

            this.maxVcpu = maxVcpu;
            return this;
        }
        @CustomType.Setter
        public Builder minDisk(@Nullable Integer minDisk) {

            this.minDisk = minDisk;
            return this;
        }
        @CustomType.Setter
        public Builder minGpu(@Nullable Double minGpu) {

            this.minGpu = minGpu;
            return this;
        }
        @CustomType.Setter
        public Builder minMemoryGib(@Nullable Double minMemoryGib) {

            this.minMemoryGib = minMemoryGib;
            return this;
        }
        @CustomType.Setter
        public Builder minNics(@Nullable Integer minNics) {

            this.minNics = minNics;
            return this;
        }
        @CustomType.Setter
        public Builder minVcpu(@Nullable Integer minVcpu) {

            this.minVcpu = minVcpu;
            return this;
        }
        @CustomType.Setter
        public Builder series(@Nullable List<String> series) {

            this.series = series;
            return this;
        }
        public Builder series(String... series) {
            return series(List.of(series));
        }
        @CustomType.Setter
        public Builder vmTypes(@Nullable List<String> vmTypes) {

            this.vmTypes = vmTypes;
            return this;
        }
        public Builder vmTypes(String... vmTypes) {
            return vmTypes(List.of(vmTypes));
        }
        public OceanNpFilters build() {
            final var _resultValue = new OceanNpFilters();
            _resultValue.acceleratedNetworking = acceleratedNetworking;
            _resultValue.architectures = architectures;
            _resultValue.diskPerformance = diskPerformance;
            _resultValue.excludeSeries = excludeSeries;
            _resultValue.maxGpu = maxGpu;
            _resultValue.maxMemoryGib = maxMemoryGib;
            _resultValue.maxVcpu = maxVcpu;
            _resultValue.minDisk = minDisk;
            _resultValue.minGpu = minGpu;
            _resultValue.minMemoryGib = minMemoryGib;
            _resultValue.minNics = minNics;
            _resultValue.minVcpu = minVcpu;
            _resultValue.series = series;
            _resultValue.vmTypes = vmTypes;
            return _resultValue;
        }
    }
}
