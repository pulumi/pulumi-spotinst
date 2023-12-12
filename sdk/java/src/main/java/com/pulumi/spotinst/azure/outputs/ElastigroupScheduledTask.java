// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupScheduledTask {
    private @Nullable String adjustment;
    private @Nullable String adjustmentPercentage;
    private @Nullable String batchSizePercentage;
    private String cronExpression;
    private @Nullable String gracePeriod;
    private @Nullable Boolean isEnabled;
    private @Nullable String scaleMaxCapacity;
    private @Nullable String scaleMinCapacity;
    private @Nullable String scaleTargetCapacity;
    private String taskType;

    private ElastigroupScheduledTask() {}
    public Optional<String> adjustment() {
        return Optional.ofNullable(this.adjustment);
    }
    public Optional<String> adjustmentPercentage() {
        return Optional.ofNullable(this.adjustmentPercentage);
    }
    public Optional<String> batchSizePercentage() {
        return Optional.ofNullable(this.batchSizePercentage);
    }
    public String cronExpression() {
        return this.cronExpression;
    }
    public Optional<String> gracePeriod() {
        return Optional.ofNullable(this.gracePeriod);
    }
    public Optional<Boolean> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }
    public Optional<String> scaleMaxCapacity() {
        return Optional.ofNullable(this.scaleMaxCapacity);
    }
    public Optional<String> scaleMinCapacity() {
        return Optional.ofNullable(this.scaleMinCapacity);
    }
    public Optional<String> scaleTargetCapacity() {
        return Optional.ofNullable(this.scaleTargetCapacity);
    }
    public String taskType() {
        return this.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupScheduledTask defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String adjustment;
        private @Nullable String adjustmentPercentage;
        private @Nullable String batchSizePercentage;
        private String cronExpression;
        private @Nullable String gracePeriod;
        private @Nullable Boolean isEnabled;
        private @Nullable String scaleMaxCapacity;
        private @Nullable String scaleMinCapacity;
        private @Nullable String scaleTargetCapacity;
        private String taskType;
        public Builder() {}
        public Builder(ElastigroupScheduledTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adjustment = defaults.adjustment;
    	      this.adjustmentPercentage = defaults.adjustmentPercentage;
    	      this.batchSizePercentage = defaults.batchSizePercentage;
    	      this.cronExpression = defaults.cronExpression;
    	      this.gracePeriod = defaults.gracePeriod;
    	      this.isEnabled = defaults.isEnabled;
    	      this.scaleMaxCapacity = defaults.scaleMaxCapacity;
    	      this.scaleMinCapacity = defaults.scaleMinCapacity;
    	      this.scaleTargetCapacity = defaults.scaleTargetCapacity;
    	      this.taskType = defaults.taskType;
        }

        @CustomType.Setter
        public Builder adjustment(@Nullable String adjustment) {
            this.adjustment = adjustment;
            return this;
        }
        @CustomType.Setter
        public Builder adjustmentPercentage(@Nullable String adjustmentPercentage) {
            this.adjustmentPercentage = adjustmentPercentage;
            return this;
        }
        @CustomType.Setter
        public Builder batchSizePercentage(@Nullable String batchSizePercentage) {
            this.batchSizePercentage = batchSizePercentage;
            return this;
        }
        @CustomType.Setter
        public Builder cronExpression(String cronExpression) {
            this.cronExpression = Objects.requireNonNull(cronExpression);
            return this;
        }
        @CustomType.Setter
        public Builder gracePeriod(@Nullable String gracePeriod) {
            this.gracePeriod = gracePeriod;
            return this;
        }
        @CustomType.Setter
        public Builder isEnabled(@Nullable Boolean isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder scaleMaxCapacity(@Nullable String scaleMaxCapacity) {
            this.scaleMaxCapacity = scaleMaxCapacity;
            return this;
        }
        @CustomType.Setter
        public Builder scaleMinCapacity(@Nullable String scaleMinCapacity) {
            this.scaleMinCapacity = scaleMinCapacity;
            return this;
        }
        @CustomType.Setter
        public Builder scaleTargetCapacity(@Nullable String scaleTargetCapacity) {
            this.scaleTargetCapacity = scaleTargetCapacity;
            return this;
        }
        @CustomType.Setter
        public Builder taskType(String taskType) {
            this.taskType = Objects.requireNonNull(taskType);
            return this;
        }
        public ElastigroupScheduledTask build() {
            final var _resultValue = new ElastigroupScheduledTask();
            _resultValue.adjustment = adjustment;
            _resultValue.adjustmentPercentage = adjustmentPercentage;
            _resultValue.batchSizePercentage = batchSizePercentage;
            _resultValue.cronExpression = cronExpression;
            _resultValue.gracePeriod = gracePeriod;
            _resultValue.isEnabled = isEnabled;
            _resultValue.scaleMaxCapacity = scaleMaxCapacity;
            _resultValue.scaleMinCapacity = scaleMinCapacity;
            _resultValue.scaleTargetCapacity = scaleTargetCapacity;
            _resultValue.taskType = taskType;
            return _resultValue;
        }
    }
}
