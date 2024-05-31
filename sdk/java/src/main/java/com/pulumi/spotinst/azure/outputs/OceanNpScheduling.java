// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.spotinst.azure.outputs.OceanNpSchedulingShutdownHours;
import com.pulumi.spotinst.azure.outputs.OceanNpSchedulingTask;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanNpScheduling {
    private @Nullable OceanNpSchedulingShutdownHours shutdownHours;
    private @Nullable List<OceanNpSchedulingTask> tasks;

    private OceanNpScheduling() {}
    public Optional<OceanNpSchedulingShutdownHours> shutdownHours() {
        return Optional.ofNullable(this.shutdownHours);
    }
    public List<OceanNpSchedulingTask> tasks() {
        return this.tasks == null ? List.of() : this.tasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanNpScheduling defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable OceanNpSchedulingShutdownHours shutdownHours;
        private @Nullable List<OceanNpSchedulingTask> tasks;
        public Builder() {}
        public Builder(OceanNpScheduling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.shutdownHours = defaults.shutdownHours;
    	      this.tasks = defaults.tasks;
        }

        @CustomType.Setter
        public Builder shutdownHours(@Nullable OceanNpSchedulingShutdownHours shutdownHours) {

            this.shutdownHours = shutdownHours;
            return this;
        }
        @CustomType.Setter
        public Builder tasks(@Nullable List<OceanNpSchedulingTask> tasks) {

            this.tasks = tasks;
            return this;
        }
        public Builder tasks(OceanNpSchedulingTask... tasks) {
            return tasks(List.of(tasks));
        }
        public OceanNpScheduling build() {
            final var _resultValue = new OceanNpScheduling();
            _resultValue.shutdownHours = shutdownHours;
            _resultValue.tasks = tasks;
            return _resultValue;
        }
    }
}