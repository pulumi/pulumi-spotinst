// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.spark.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanCompute {
    /**
     * @return - Enable/disable the creation of Ocean Spark VNGs during cluster creation.
     * 
     */
    private @Nullable Boolean createVngs;
    /**
     * @return - Enable/disable Ocean Spark taints on the Ocean Spark VNGs. By default, Ocean Spark uses taints to prevent non-Spark workloads from running on Ocean Spark VNGs.
     * 
     */
    private @Nullable Boolean useTaints;

    private OceanCompute() {}
    /**
     * @return - Enable/disable the creation of Ocean Spark VNGs during cluster creation.
     * 
     */
    public Optional<Boolean> createVngs() {
        return Optional.ofNullable(this.createVngs);
    }
    /**
     * @return - Enable/disable Ocean Spark taints on the Ocean Spark VNGs. By default, Ocean Spark uses taints to prevent non-Spark workloads from running on Ocean Spark VNGs.
     * 
     */
    public Optional<Boolean> useTaints() {
        return Optional.ofNullable(this.useTaints);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanCompute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean createVngs;
        private @Nullable Boolean useTaints;
        public Builder() {}
        public Builder(OceanCompute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createVngs = defaults.createVngs;
    	      this.useTaints = defaults.useTaints;
        }

        @CustomType.Setter
        public Builder createVngs(@Nullable Boolean createVngs) {
            this.createVngs = createVngs;
            return this;
        }
        @CustomType.Setter
        public Builder useTaints(@Nullable Boolean useTaints) {
            this.useTaints = useTaints;
            return this;
        }
        public OceanCompute build() {
            final var _resultValue = new OceanCompute();
            _resultValue.createVngs = createVngs;
            _resultValue.useTaints = useTaints;
            return _resultValue;
        }
    }
}
