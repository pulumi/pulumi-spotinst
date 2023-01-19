// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupScheduledTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupScheduledTaskArgs Empty = new ElastigroupScheduledTaskArgs();

    /**
     * Value to which the action type will be adjusted. Required if using `numeric` or `percentage_adjustment` action types.
     * 
     */
    @Import(name="adjustment")
    private @Nullable Output<String> adjustment;

    /**
     * @return Value to which the action type will be adjusted. Required if using `numeric` or `percentage_adjustment` action types.
     * 
     */
    public Optional<Output<String>> adjustment() {
        return Optional.ofNullable(this.adjustment);
    }

    /**
     * The percent of instances to add/remove to/from the target capacity when scale is needed.
     * 
     */
    @Import(name="adjustmentPercentage")
    private @Nullable Output<String> adjustmentPercentage;

    /**
     * @return The percent of instances to add/remove to/from the target capacity when scale is needed.
     * 
     */
    public Optional<Output<String>> adjustmentPercentage() {
        return Optional.ofNullable(this.adjustmentPercentage);
    }

    /**
     * The percentage size of each batch in the scheduled deployment roll. Required when the &#39;task_type&#39; is &#39;roll&#39;.
     * 
     */
    @Import(name="batchSizePercentage")
    private @Nullable Output<String> batchSizePercentage;

    /**
     * @return The percentage size of each batch in the scheduled deployment roll. Required when the &#39;task_type&#39; is &#39;roll&#39;.
     * 
     */
    public Optional<Output<String>> batchSizePercentage() {
        return Optional.ofNullable(this.batchSizePercentage);
    }

    /**
     * A valid cron expression (`* * * * *`). The cron is running in UTC time zone and is in Unix cron format Cron Expression Validator Script.
     * 
     */
    @Import(name="cronExpression", required=true)
    private Output<String> cronExpression;

    /**
     * @return A valid cron expression (`* * * * *`). The cron is running in UTC time zone and is in Unix cron format Cron Expression Validator Script.
     * 
     */
    public Output<String> cronExpression() {
        return this.cronExpression;
    }

    /**
     * Period of time (seconds) to wait for VM to reach healthiness before monitoring for unhealthiness.
     * 
     */
    @Import(name="gracePeriod")
    private @Nullable Output<String> gracePeriod;

    /**
     * @return Period of time (seconds) to wait for VM to reach healthiness before monitoring for unhealthiness.
     * 
     */
    public Optional<Output<String>> gracePeriod() {
        return Optional.ofNullable(this.gracePeriod);
    }

    /**
     * Describes whether the task is enabled. When true the task should run when false it should not run.
     * 
     */
    @Import(name="isEnabled")
    private @Nullable Output<Boolean> isEnabled;

    /**
     * @return Describes whether the task is enabled. When true the task should run when false it should not run.
     * 
     */
    public Optional<Output<Boolean>> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }

    /**
     * The max capacity of the group. Required when ‘task_type&#39; is ‘scale&#39;.
     * 
     */
    @Import(name="scaleMaxCapacity")
    private @Nullable Output<String> scaleMaxCapacity;

    /**
     * @return The max capacity of the group. Required when ‘task_type&#39; is ‘scale&#39;.
     * 
     */
    public Optional<Output<String>> scaleMaxCapacity() {
        return Optional.ofNullable(this.scaleMaxCapacity);
    }

    /**
     * The min capacity of the group. Should be used when choosing ‘task_type&#39; of ‘scale&#39;.
     * 
     */
    @Import(name="scaleMinCapacity")
    private @Nullable Output<String> scaleMinCapacity;

    /**
     * @return The min capacity of the group. Should be used when choosing ‘task_type&#39; of ‘scale&#39;.
     * 
     */
    public Optional<Output<String>> scaleMinCapacity() {
        return Optional.ofNullable(this.scaleMinCapacity);
    }

    /**
     * The target capacity of the group. Should be used when choosing ‘task_type&#39; of ‘scale&#39;.
     * 
     */
    @Import(name="scaleTargetCapacity")
    private @Nullable Output<String> scaleTargetCapacity;

    /**
     * @return The target capacity of the group. Should be used when choosing ‘task_type&#39; of ‘scale&#39;.
     * 
     */
    public Optional<Output<String>> scaleTargetCapacity() {
        return Optional.ofNullable(this.scaleTargetCapacity);
    }

    /**
     * The task type to run. Valid Values: `backup_ami`, `scale`, `scaleUp`, `roll`, `statefulUpdateCapacity`, `statefulRecycle`.
     * 
     */
    @Import(name="taskType", required=true)
    private Output<String> taskType;

    /**
     * @return The task type to run. Valid Values: `backup_ami`, `scale`, `scaleUp`, `roll`, `statefulUpdateCapacity`, `statefulRecycle`.
     * 
     */
    public Output<String> taskType() {
        return this.taskType;
    }

    private ElastigroupScheduledTaskArgs() {}

    private ElastigroupScheduledTaskArgs(ElastigroupScheduledTaskArgs $) {
        this.adjustment = $.adjustment;
        this.adjustmentPercentage = $.adjustmentPercentage;
        this.batchSizePercentage = $.batchSizePercentage;
        this.cronExpression = $.cronExpression;
        this.gracePeriod = $.gracePeriod;
        this.isEnabled = $.isEnabled;
        this.scaleMaxCapacity = $.scaleMaxCapacity;
        this.scaleMinCapacity = $.scaleMinCapacity;
        this.scaleTargetCapacity = $.scaleTargetCapacity;
        this.taskType = $.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupScheduledTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupScheduledTaskArgs $;

        public Builder() {
            $ = new ElastigroupScheduledTaskArgs();
        }

        public Builder(ElastigroupScheduledTaskArgs defaults) {
            $ = new ElastigroupScheduledTaskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param adjustment Value to which the action type will be adjusted. Required if using `numeric` or `percentage_adjustment` action types.
         * 
         * @return builder
         * 
         */
        public Builder adjustment(@Nullable Output<String> adjustment) {
            $.adjustment = adjustment;
            return this;
        }

        /**
         * @param adjustment Value to which the action type will be adjusted. Required if using `numeric` or `percentage_adjustment` action types.
         * 
         * @return builder
         * 
         */
        public Builder adjustment(String adjustment) {
            return adjustment(Output.of(adjustment));
        }

        /**
         * @param adjustmentPercentage The percent of instances to add/remove to/from the target capacity when scale is needed.
         * 
         * @return builder
         * 
         */
        public Builder adjustmentPercentage(@Nullable Output<String> adjustmentPercentage) {
            $.adjustmentPercentage = adjustmentPercentage;
            return this;
        }

        /**
         * @param adjustmentPercentage The percent of instances to add/remove to/from the target capacity when scale is needed.
         * 
         * @return builder
         * 
         */
        public Builder adjustmentPercentage(String adjustmentPercentage) {
            return adjustmentPercentage(Output.of(adjustmentPercentage));
        }

        /**
         * @param batchSizePercentage The percentage size of each batch in the scheduled deployment roll. Required when the &#39;task_type&#39; is &#39;roll&#39;.
         * 
         * @return builder
         * 
         */
        public Builder batchSizePercentage(@Nullable Output<String> batchSizePercentage) {
            $.batchSizePercentage = batchSizePercentage;
            return this;
        }

        /**
         * @param batchSizePercentage The percentage size of each batch in the scheduled deployment roll. Required when the &#39;task_type&#39; is &#39;roll&#39;.
         * 
         * @return builder
         * 
         */
        public Builder batchSizePercentage(String batchSizePercentage) {
            return batchSizePercentage(Output.of(batchSizePercentage));
        }

        /**
         * @param cronExpression A valid cron expression (`* * * * *`). The cron is running in UTC time zone and is in Unix cron format Cron Expression Validator Script.
         * 
         * @return builder
         * 
         */
        public Builder cronExpression(Output<String> cronExpression) {
            $.cronExpression = cronExpression;
            return this;
        }

        /**
         * @param cronExpression A valid cron expression (`* * * * *`). The cron is running in UTC time zone and is in Unix cron format Cron Expression Validator Script.
         * 
         * @return builder
         * 
         */
        public Builder cronExpression(String cronExpression) {
            return cronExpression(Output.of(cronExpression));
        }

        /**
         * @param gracePeriod Period of time (seconds) to wait for VM to reach healthiness before monitoring for unhealthiness.
         * 
         * @return builder
         * 
         */
        public Builder gracePeriod(@Nullable Output<String> gracePeriod) {
            $.gracePeriod = gracePeriod;
            return this;
        }

        /**
         * @param gracePeriod Period of time (seconds) to wait for VM to reach healthiness before monitoring for unhealthiness.
         * 
         * @return builder
         * 
         */
        public Builder gracePeriod(String gracePeriod) {
            return gracePeriod(Output.of(gracePeriod));
        }

        /**
         * @param isEnabled Describes whether the task is enabled. When true the task should run when false it should not run.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(@Nullable Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        /**
         * @param isEnabled Describes whether the task is enabled. When true the task should run when false it should not run.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        /**
         * @param scaleMaxCapacity The max capacity of the group. Required when ‘task_type&#39; is ‘scale&#39;.
         * 
         * @return builder
         * 
         */
        public Builder scaleMaxCapacity(@Nullable Output<String> scaleMaxCapacity) {
            $.scaleMaxCapacity = scaleMaxCapacity;
            return this;
        }

        /**
         * @param scaleMaxCapacity The max capacity of the group. Required when ‘task_type&#39; is ‘scale&#39;.
         * 
         * @return builder
         * 
         */
        public Builder scaleMaxCapacity(String scaleMaxCapacity) {
            return scaleMaxCapacity(Output.of(scaleMaxCapacity));
        }

        /**
         * @param scaleMinCapacity The min capacity of the group. Should be used when choosing ‘task_type&#39; of ‘scale&#39;.
         * 
         * @return builder
         * 
         */
        public Builder scaleMinCapacity(@Nullable Output<String> scaleMinCapacity) {
            $.scaleMinCapacity = scaleMinCapacity;
            return this;
        }

        /**
         * @param scaleMinCapacity The min capacity of the group. Should be used when choosing ‘task_type&#39; of ‘scale&#39;.
         * 
         * @return builder
         * 
         */
        public Builder scaleMinCapacity(String scaleMinCapacity) {
            return scaleMinCapacity(Output.of(scaleMinCapacity));
        }

        /**
         * @param scaleTargetCapacity The target capacity of the group. Should be used when choosing ‘task_type&#39; of ‘scale&#39;.
         * 
         * @return builder
         * 
         */
        public Builder scaleTargetCapacity(@Nullable Output<String> scaleTargetCapacity) {
            $.scaleTargetCapacity = scaleTargetCapacity;
            return this;
        }

        /**
         * @param scaleTargetCapacity The target capacity of the group. Should be used when choosing ‘task_type&#39; of ‘scale&#39;.
         * 
         * @return builder
         * 
         */
        public Builder scaleTargetCapacity(String scaleTargetCapacity) {
            return scaleTargetCapacity(Output.of(scaleTargetCapacity));
        }

        /**
         * @param taskType The task type to run. Valid Values: `backup_ami`, `scale`, `scaleUp`, `roll`, `statefulUpdateCapacity`, `statefulRecycle`.
         * 
         * @return builder
         * 
         */
        public Builder taskType(Output<String> taskType) {
            $.taskType = taskType;
            return this;
        }

        /**
         * @param taskType The task type to run. Valid Values: `backup_ami`, `scale`, `scaleUp`, `roll`, `statefulUpdateCapacity`, `statefulRecycle`.
         * 
         * @return builder
         * 
         */
        public Builder taskType(String taskType) {
            return taskType(Output.of(taskType));
        }

        public ElastigroupScheduledTaskArgs build() {
            $.cronExpression = Objects.requireNonNull($.cronExpression, "expected parameter 'cronExpression' to be non-null");
            $.taskType = Objects.requireNonNull($.taskType, "expected parameter 'taskType' to be non-null");
            return $;
        }
    }

}
