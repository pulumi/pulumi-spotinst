// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanFilters {
    /**
     * @return The filtered instance types will support at least one of the architectures from this list.
     * 
     */
    private @Nullable List<String> architectures;
    /**
     * @return The filtered instance types will belong to one of the categories types from this list.
     * 
     */
    private @Nullable List<String> categories;
    /**
     * @return The filtered instance types will have one of the disk type from this list.
     * 
     */
    private @Nullable List<String> diskTypes;
    /**
     * @return Types belonging to a family from the ExcludeFamilies will not be available for scaling (asterisk wildcard is also supported). For example, C* will exclude instance types from these families: c5, c4, c4a, etc.
     * 
     */
    private @Nullable List<String> excludeFamilies;
    /**
     * @return In case excludeMetal is set to true, metal types will not be available for scaling.
     * 
     */
    private @Nullable Boolean excludeMetal;
    /**
     * @return The filtered instance types will have a hypervisor type from this list.
     * 
     */
    private @Nullable List<String> hypervisors;
    /**
     * @return Types belonging to a family from the IncludeFamilies will be available for scaling (asterisk wildcard is also supported). For example, C* will include instance types from these families: c5, c4, c4a, etc.
     * 
     */
    private @Nullable List<String> includeFamilies;
    /**
     * @return Ena is supported or not.
     * 
     */
    private @Nullable String isEnaSupported;
    /**
     * @return Maximum total number of GPUs.
     * 
     */
    private @Nullable Integer maxGpu;
    /**
     * @return Maximum amount of Memory (GiB).
     * 
     */
    private @Nullable Double maxMemoryGib;
    /**
     * @return Maximum Bandwidth in Gib/s of network performance.
     * 
     */
    private @Nullable Integer maxNetworkPerformance;
    /**
     * @return Maximum number of vcpus available.
     * 
     */
    private @Nullable Integer maxVcpu;
    /**
     * @return Minimum number of network interfaces (ENIs).
     * 
     */
    private @Nullable Integer minEnis;
    /**
     * @return Minimum total number of GPUs.
     * 
     */
    private @Nullable Integer minGpu;
    /**
     * @return Minimum amount of Memory (GiB).
     * 
     */
    private @Nullable Double minMemoryGib;
    /**
     * @return Minimum Bandwidth in Gib/s of network performance.
     * 
     */
    private @Nullable Integer minNetworkPerformance;
    /**
     * @return Minimum number of vcpus available.
     * 
     */
    private @Nullable Integer minVcpu;
    /**
     * @return The filtered instance types will have a root device types from this list.
     * 
     */
    private @Nullable List<String> rootDeviceTypes;
    /**
     * @return The filtered instance types will support at least one of the virtualization types from this list.
     * 
     */
    private @Nullable List<String> virtualizationTypes;

    private OceanFilters() {}
    /**
     * @return The filtered instance types will support at least one of the architectures from this list.
     * 
     */
    public List<String> architectures() {
        return this.architectures == null ? List.of() : this.architectures;
    }
    /**
     * @return The filtered instance types will belong to one of the categories types from this list.
     * 
     */
    public List<String> categories() {
        return this.categories == null ? List.of() : this.categories;
    }
    /**
     * @return The filtered instance types will have one of the disk type from this list.
     * 
     */
    public List<String> diskTypes() {
        return this.diskTypes == null ? List.of() : this.diskTypes;
    }
    /**
     * @return Types belonging to a family from the ExcludeFamilies will not be available for scaling (asterisk wildcard is also supported). For example, C* will exclude instance types from these families: c5, c4, c4a, etc.
     * 
     */
    public List<String> excludeFamilies() {
        return this.excludeFamilies == null ? List.of() : this.excludeFamilies;
    }
    /**
     * @return In case excludeMetal is set to true, metal types will not be available for scaling.
     * 
     */
    public Optional<Boolean> excludeMetal() {
        return Optional.ofNullable(this.excludeMetal);
    }
    /**
     * @return The filtered instance types will have a hypervisor type from this list.
     * 
     */
    public List<String> hypervisors() {
        return this.hypervisors == null ? List.of() : this.hypervisors;
    }
    /**
     * @return Types belonging to a family from the IncludeFamilies will be available for scaling (asterisk wildcard is also supported). For example, C* will include instance types from these families: c5, c4, c4a, etc.
     * 
     */
    public List<String> includeFamilies() {
        return this.includeFamilies == null ? List.of() : this.includeFamilies;
    }
    /**
     * @return Ena is supported or not.
     * 
     */
    public Optional<String> isEnaSupported() {
        return Optional.ofNullable(this.isEnaSupported);
    }
    /**
     * @return Maximum total number of GPUs.
     * 
     */
    public Optional<Integer> maxGpu() {
        return Optional.ofNullable(this.maxGpu);
    }
    /**
     * @return Maximum amount of Memory (GiB).
     * 
     */
    public Optional<Double> maxMemoryGib() {
        return Optional.ofNullable(this.maxMemoryGib);
    }
    /**
     * @return Maximum Bandwidth in Gib/s of network performance.
     * 
     */
    public Optional<Integer> maxNetworkPerformance() {
        return Optional.ofNullable(this.maxNetworkPerformance);
    }
    /**
     * @return Maximum number of vcpus available.
     * 
     */
    public Optional<Integer> maxVcpu() {
        return Optional.ofNullable(this.maxVcpu);
    }
    /**
     * @return Minimum number of network interfaces (ENIs).
     * 
     */
    public Optional<Integer> minEnis() {
        return Optional.ofNullable(this.minEnis);
    }
    /**
     * @return Minimum total number of GPUs.
     * 
     */
    public Optional<Integer> minGpu() {
        return Optional.ofNullable(this.minGpu);
    }
    /**
     * @return Minimum amount of Memory (GiB).
     * 
     */
    public Optional<Double> minMemoryGib() {
        return Optional.ofNullable(this.minMemoryGib);
    }
    /**
     * @return Minimum Bandwidth in Gib/s of network performance.
     * 
     */
    public Optional<Integer> minNetworkPerformance() {
        return Optional.ofNullable(this.minNetworkPerformance);
    }
    /**
     * @return Minimum number of vcpus available.
     * 
     */
    public Optional<Integer> minVcpu() {
        return Optional.ofNullable(this.minVcpu);
    }
    /**
     * @return The filtered instance types will have a root device types from this list.
     * 
     */
    public List<String> rootDeviceTypes() {
        return this.rootDeviceTypes == null ? List.of() : this.rootDeviceTypes;
    }
    /**
     * @return The filtered instance types will support at least one of the virtualization types from this list.
     * 
     */
    public List<String> virtualizationTypes() {
        return this.virtualizationTypes == null ? List.of() : this.virtualizationTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanFilters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> architectures;
        private @Nullable List<String> categories;
        private @Nullable List<String> diskTypes;
        private @Nullable List<String> excludeFamilies;
        private @Nullable Boolean excludeMetal;
        private @Nullable List<String> hypervisors;
        private @Nullable List<String> includeFamilies;
        private @Nullable String isEnaSupported;
        private @Nullable Integer maxGpu;
        private @Nullable Double maxMemoryGib;
        private @Nullable Integer maxNetworkPerformance;
        private @Nullable Integer maxVcpu;
        private @Nullable Integer minEnis;
        private @Nullable Integer minGpu;
        private @Nullable Double minMemoryGib;
        private @Nullable Integer minNetworkPerformance;
        private @Nullable Integer minVcpu;
        private @Nullable List<String> rootDeviceTypes;
        private @Nullable List<String> virtualizationTypes;
        public Builder() {}
        public Builder(OceanFilters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architectures = defaults.architectures;
    	      this.categories = defaults.categories;
    	      this.diskTypes = defaults.diskTypes;
    	      this.excludeFamilies = defaults.excludeFamilies;
    	      this.excludeMetal = defaults.excludeMetal;
    	      this.hypervisors = defaults.hypervisors;
    	      this.includeFamilies = defaults.includeFamilies;
    	      this.isEnaSupported = defaults.isEnaSupported;
    	      this.maxGpu = defaults.maxGpu;
    	      this.maxMemoryGib = defaults.maxMemoryGib;
    	      this.maxNetworkPerformance = defaults.maxNetworkPerformance;
    	      this.maxVcpu = defaults.maxVcpu;
    	      this.minEnis = defaults.minEnis;
    	      this.minGpu = defaults.minGpu;
    	      this.minMemoryGib = defaults.minMemoryGib;
    	      this.minNetworkPerformance = defaults.minNetworkPerformance;
    	      this.minVcpu = defaults.minVcpu;
    	      this.rootDeviceTypes = defaults.rootDeviceTypes;
    	      this.virtualizationTypes = defaults.virtualizationTypes;
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
        public Builder categories(@Nullable List<String> categories) {

            this.categories = categories;
            return this;
        }
        public Builder categories(String... categories) {
            return categories(List.of(categories));
        }
        @CustomType.Setter
        public Builder diskTypes(@Nullable List<String> diskTypes) {

            this.diskTypes = diskTypes;
            return this;
        }
        public Builder diskTypes(String... diskTypes) {
            return diskTypes(List.of(diskTypes));
        }
        @CustomType.Setter
        public Builder excludeFamilies(@Nullable List<String> excludeFamilies) {

            this.excludeFamilies = excludeFamilies;
            return this;
        }
        public Builder excludeFamilies(String... excludeFamilies) {
            return excludeFamilies(List.of(excludeFamilies));
        }
        @CustomType.Setter
        public Builder excludeMetal(@Nullable Boolean excludeMetal) {

            this.excludeMetal = excludeMetal;
            return this;
        }
        @CustomType.Setter
        public Builder hypervisors(@Nullable List<String> hypervisors) {

            this.hypervisors = hypervisors;
            return this;
        }
        public Builder hypervisors(String... hypervisors) {
            return hypervisors(List.of(hypervisors));
        }
        @CustomType.Setter
        public Builder includeFamilies(@Nullable List<String> includeFamilies) {

            this.includeFamilies = includeFamilies;
            return this;
        }
        public Builder includeFamilies(String... includeFamilies) {
            return includeFamilies(List.of(includeFamilies));
        }
        @CustomType.Setter
        public Builder isEnaSupported(@Nullable String isEnaSupported) {

            this.isEnaSupported = isEnaSupported;
            return this;
        }
        @CustomType.Setter
        public Builder maxGpu(@Nullable Integer maxGpu) {

            this.maxGpu = maxGpu;
            return this;
        }
        @CustomType.Setter
        public Builder maxMemoryGib(@Nullable Double maxMemoryGib) {

            this.maxMemoryGib = maxMemoryGib;
            return this;
        }
        @CustomType.Setter
        public Builder maxNetworkPerformance(@Nullable Integer maxNetworkPerformance) {

            this.maxNetworkPerformance = maxNetworkPerformance;
            return this;
        }
        @CustomType.Setter
        public Builder maxVcpu(@Nullable Integer maxVcpu) {

            this.maxVcpu = maxVcpu;
            return this;
        }
        @CustomType.Setter
        public Builder minEnis(@Nullable Integer minEnis) {

            this.minEnis = minEnis;
            return this;
        }
        @CustomType.Setter
        public Builder minGpu(@Nullable Integer minGpu) {

            this.minGpu = minGpu;
            return this;
        }
        @CustomType.Setter
        public Builder minMemoryGib(@Nullable Double minMemoryGib) {

            this.minMemoryGib = minMemoryGib;
            return this;
        }
        @CustomType.Setter
        public Builder minNetworkPerformance(@Nullable Integer minNetworkPerformance) {

            this.minNetworkPerformance = minNetworkPerformance;
            return this;
        }
        @CustomType.Setter
        public Builder minVcpu(@Nullable Integer minVcpu) {

            this.minVcpu = minVcpu;
            return this;
        }
        @CustomType.Setter
        public Builder rootDeviceTypes(@Nullable List<String> rootDeviceTypes) {

            this.rootDeviceTypes = rootDeviceTypes;
            return this;
        }
        public Builder rootDeviceTypes(String... rootDeviceTypes) {
            return rootDeviceTypes(List.of(rootDeviceTypes));
        }
        @CustomType.Setter
        public Builder virtualizationTypes(@Nullable List<String> virtualizationTypes) {

            this.virtualizationTypes = virtualizationTypes;
            return this;
        }
        public Builder virtualizationTypes(String... virtualizationTypes) {
            return virtualizationTypes(List.of(virtualizationTypes));
        }
        public OceanFilters build() {
            final var _resultValue = new OceanFilters();
            _resultValue.architectures = architectures;
            _resultValue.categories = categories;
            _resultValue.diskTypes = diskTypes;
            _resultValue.excludeFamilies = excludeFamilies;
            _resultValue.excludeMetal = excludeMetal;
            _resultValue.hypervisors = hypervisors;
            _resultValue.includeFamilies = includeFamilies;
            _resultValue.isEnaSupported = isEnaSupported;
            _resultValue.maxGpu = maxGpu;
            _resultValue.maxMemoryGib = maxMemoryGib;
            _resultValue.maxNetworkPerformance = maxNetworkPerformance;
            _resultValue.maxVcpu = maxVcpu;
            _resultValue.minEnis = minEnis;
            _resultValue.minGpu = minGpu;
            _resultValue.minMemoryGib = minMemoryGib;
            _resultValue.minNetworkPerformance = minNetworkPerformance;
            _resultValue.minVcpu = minVcpu;
            _resultValue.rootDeviceTypes = rootDeviceTypes;
            _resultValue.virtualizationTypes = virtualizationTypes;
            return _resultValue;
        }
    }
}
