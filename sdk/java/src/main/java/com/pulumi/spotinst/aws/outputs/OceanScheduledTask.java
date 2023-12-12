// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.spotinst.aws.outputs.OceanScheduledTaskShutdownHours;
import com.pulumi.spotinst.aws.outputs.OceanScheduledTaskTask;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanScheduledTask {
    private @Nullable OceanScheduledTaskShutdownHours shutdownHours;
    private @Nullable List<OceanScheduledTaskTask> tasks;

    private OceanScheduledTask() {}
    public Optional<OceanScheduledTaskShutdownHours> shutdownHours() {
        return Optional.ofNullable(this.shutdownHours);
    }
    public List<OceanScheduledTaskTask> tasks() {
        return this.tasks == null ? List.of() : this.tasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanScheduledTask defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable OceanScheduledTaskShutdownHours shutdownHours;
        private @Nullable List<OceanScheduledTaskTask> tasks;
        public Builder() {}
        public Builder(OceanScheduledTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.shutdownHours = defaults.shutdownHours;
    	      this.tasks = defaults.tasks;
        }

        @CustomType.Setter
        public Builder shutdownHours(@Nullable OceanScheduledTaskShutdownHours shutdownHours) {
            this.shutdownHours = shutdownHours;
            return this;
        }
        @CustomType.Setter
        public Builder tasks(@Nullable List<OceanScheduledTaskTask> tasks) {
            this.tasks = tasks;
            return this;
        }
        public Builder tasks(OceanScheduledTaskTask... tasks) {
            return tasks(List.of(tasks));
        }
        public OceanScheduledTask build() {
            final var _resultValue = new OceanScheduledTask();
            _resultValue.shutdownHours = shutdownHours;
            _resultValue.tasks = tasks;
            return _resultValue;
        }
    }
}
