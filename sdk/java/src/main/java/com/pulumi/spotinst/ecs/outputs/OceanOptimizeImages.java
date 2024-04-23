// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class OceanOptimizeImages {
    private String performAt;
    private Boolean shouldOptimizeEcsAmi;
    private @Nullable List<String> timeWindows;

    private OceanOptimizeImages() {}
    public String performAt() {
        return this.performAt;
    }
    public Boolean shouldOptimizeEcsAmi() {
        return this.shouldOptimizeEcsAmi;
    }
    public List<String> timeWindows() {
        return this.timeWindows == null ? List.of() : this.timeWindows;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanOptimizeImages defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String performAt;
        private Boolean shouldOptimizeEcsAmi;
        private @Nullable List<String> timeWindows;
        public Builder() {}
        public Builder(OceanOptimizeImages defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.performAt = defaults.performAt;
    	      this.shouldOptimizeEcsAmi = defaults.shouldOptimizeEcsAmi;
    	      this.timeWindows = defaults.timeWindows;
        }

        @CustomType.Setter
        public Builder performAt(String performAt) {
            if (performAt == null) {
              throw new MissingRequiredPropertyException("OceanOptimizeImages", "performAt");
            }
            this.performAt = performAt;
            return this;
        }
        @CustomType.Setter
        public Builder shouldOptimizeEcsAmi(Boolean shouldOptimizeEcsAmi) {
            if (shouldOptimizeEcsAmi == null) {
              throw new MissingRequiredPropertyException("OceanOptimizeImages", "shouldOptimizeEcsAmi");
            }
            this.shouldOptimizeEcsAmi = shouldOptimizeEcsAmi;
            return this;
        }
        @CustomType.Setter
        public Builder timeWindows(@Nullable List<String> timeWindows) {

            this.timeWindows = timeWindows;
            return this;
        }
        public Builder timeWindows(String... timeWindows) {
            return timeWindows(List.of(timeWindows));
        }
        public OceanOptimizeImages build() {
            final var _resultValue = new OceanOptimizeImages();
            _resultValue.performAt = performAt;
            _resultValue.shouldOptimizeEcsAmi = shouldOptimizeEcsAmi;
            _resultValue.timeWindows = timeWindows;
            return _resultValue;
        }
    }
}
