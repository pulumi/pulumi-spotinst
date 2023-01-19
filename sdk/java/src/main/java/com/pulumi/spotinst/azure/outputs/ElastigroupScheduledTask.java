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
    /**
     * @return Value to which the action type will be adjusted. Required if using `numeric` or `percentage_adjustment` action types.
     * 
     */
    private @Nullable String adjustment;
    /**
     * @return The percent of instances to add/remove to/from the target capacity when scale is needed.
     * 
     */
    private @Nullable String adjustmentPercentage;
    /**
     * @return The percentage size of each batch in the scheduled deployment roll. Required when the &#39;task_type&#39; is &#39;roll&#39;.
     * 
     */
    private @Nullable String batchSizePercentage;
    /**
     * @return A valid cron expression (`* * * * *`). The cron is running in UTC time zone and is in Unix cron format Cron Expression Validator Script.
     * 
     */
    private String cronExpression;
    /**
     * @return Period of time (seconds) to wait for VM to reach healthiness before monitoring for unhealthiness.
     * 
     */
    private @Nullable String gracePeriod;
    /**
     * @return Describes whether the task is enabled. When true the task should run when false it should not run.
     * 
     */
    private @Nullable Boolean isEnabled;
    /**
     * @return The max capacity of the group. Required when ‘task_type&#39; is ‘scale&#39;.
     * 
     */
    private @Nullable String scaleMaxCapacity;
    /**
     * @return The min capacity of the group. Should be used when choosing ‘task_type&#39; of ‘scale&#39;.
     * 
     */
    private @Nullable String scaleMinCapacity;
    /**
     * @return The target capacity of the group. Should be used when choosing ‘task_type&#39; of ‘scale&#39;.
     * 
     */
    private @Nullable String scaleTargetCapacity;
    /**
     * @return The task type to run. Valid Values: `backup_ami`, `scale`, `scaleUp`, `roll`, `statefulUpdateCapacity`, `statefulRecycle`.
     * 
     */
    private String taskType;

    private ElastigroupScheduledTask() {}
    /**
     * @return Value to which the action type will be adjusted. Required if using `numeric` or `percentage_adjustment` action types.
     * 
     */
    public Optional<String> adjustment() {
        return Optional.ofNullable(this.adjustment);
    }
    /**
     * @return The percent of instances to add/remove to/from the target capacity when scale is needed.
     * 
     */
    public Optional<String> adjustmentPercentage() {
        return Optional.ofNullable(this.adjustmentPercentage);
    }
    /**
     * @return The percentage size of each batch in the scheduled deployment roll. Required when the &#39;task_type&#39; is &#39;roll&#39;.
     * 
     */
    public Optional<String> batchSizePercentage() {
        return Optional.ofNullable(this.batchSizePercentage);
    }
    /**
     * @return A valid cron expression (`* * * * *`). The cron is running in UTC time zone and is in Unix cron format Cron Expression Validator Script.
     * 
     */
    public String cronExpression() {
        return this.cronExpression;
    }
    /**
     * @return Period of time (seconds) to wait for VM to reach healthiness before monitoring for unhealthiness.
     * 
     */
    public Optional<String> gracePeriod() {
        return Optional.ofNullable(this.gracePeriod);
    }
    /**
     * @return Describes whether the task is enabled. When true the task should run when false it should not run.
     * 
     */
    public Optional<Boolean> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }
    /**
     * @return The max capacity of the group. Required when ‘task_type&#39; is ‘scale&#39;.
     * 
     */
    public Optional<String> scaleMaxCapacity() {
        return Optional.ofNullable(this.scaleMaxCapacity);
    }
    /**
     * @return The min capacity of the group. Should be used when choosing ‘task_type&#39; of ‘scale&#39;.
     * 
     */
    public Optional<String> scaleMinCapacity() {
        return Optional.ofNullable(this.scaleMinCapacity);
    }
    /**
     * @return The target capacity of the group. Should be used when choosing ‘task_type&#39; of ‘scale&#39;.
     * 
     */
    public Optional<String> scaleTargetCapacity() {
        return Optional.ofNullable(this.scaleTargetCapacity);
    }
    /**
     * @return The task type to run. Valid Values: `backup_ami`, `scale`, `scaleUp`, `roll`, `statefulUpdateCapacity`, `statefulRecycle`.
     * 
     */
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
            final var o = new ElastigroupScheduledTask();
            o.adjustment = adjustment;
            o.adjustmentPercentage = adjustmentPercentage;
            o.batchSizePercentage = batchSizePercentage;
            o.cronExpression = cronExpression;
            o.gracePeriod = gracePeriod;
            o.isEnabled = isEnabled;
            o.scaleMaxCapacity = scaleMaxCapacity;
            o.scaleMinCapacity = scaleMinCapacity;
            o.scaleTargetCapacity = scaleTargetCapacity;
            o.taskType = taskType;
            return o;
        }
    }
}
