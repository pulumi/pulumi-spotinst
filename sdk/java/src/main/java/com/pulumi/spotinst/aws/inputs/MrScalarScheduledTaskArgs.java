// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MrScalarScheduledTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final MrScalarScheduledTaskArgs Empty = new MrScalarScheduledTaskArgs();

    /**
     * A cron expression representing the schedule for the task.
     * 
     */
    @Import(name="cron", required=true)
    private Output<String> cron;

    /**
     * @return A cron expression representing the schedule for the task.
     * 
     */
    public Output<String> cron() {
        return this.cron;
    }

    /**
     * New desired capacity for the elastigroup.
     * 
     */
    @Import(name="desiredCapacity")
    private @Nullable Output<String> desiredCapacity;

    /**
     * @return New desired capacity for the elastigroup.
     * 
     */
    public Optional<Output<String>> desiredCapacity() {
        return Optional.ofNullable(this.desiredCapacity);
    }

    /**
     * Select the EMR instance groups to execute the scheduled task on. Valid values: `task`.
     * 
     */
    @Import(name="instanceGroupType", required=true)
    private Output<String> instanceGroupType;

    /**
     * @return Select the EMR instance groups to execute the scheduled task on. Valid values: `task`.
     * 
     */
    public Output<String> instanceGroupType() {
        return this.instanceGroupType;
    }

    /**
     * Enable/Disable the specified scheduling task.
     * 
     */
    @Import(name="isEnabled")
    private @Nullable Output<Boolean> isEnabled;

    /**
     * @return Enable/Disable the specified scheduling task.
     * 
     */
    public Optional<Output<Boolean>> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }

    /**
     * New max capacity for the elastigroup.
     * 
     */
    @Import(name="maxCapacity")
    private @Nullable Output<String> maxCapacity;

    /**
     * @return New max capacity for the elastigroup.
     * 
     */
    public Optional<Output<String>> maxCapacity() {
        return Optional.ofNullable(this.maxCapacity);
    }

    /**
     * New min capacity for the elastigroup.
     * 
     */
    @Import(name="minCapacity")
    private @Nullable Output<String> minCapacity;

    /**
     * @return New min capacity for the elastigroup.
     * 
     */
    public Optional<Output<String>> minCapacity() {
        return Optional.ofNullable(this.minCapacity);
    }

    /**
     * The type of task to be scheduled. Valid values: `setCapacity`.
     * 
     */
    @Import(name="taskType", required=true)
    private Output<String> taskType;

    /**
     * @return The type of task to be scheduled. Valid values: `setCapacity`.
     * 
     */
    public Output<String> taskType() {
        return this.taskType;
    }

    private MrScalarScheduledTaskArgs() {}

    private MrScalarScheduledTaskArgs(MrScalarScheduledTaskArgs $) {
        this.cron = $.cron;
        this.desiredCapacity = $.desiredCapacity;
        this.instanceGroupType = $.instanceGroupType;
        this.isEnabled = $.isEnabled;
        this.maxCapacity = $.maxCapacity;
        this.minCapacity = $.minCapacity;
        this.taskType = $.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MrScalarScheduledTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MrScalarScheduledTaskArgs $;

        public Builder() {
            $ = new MrScalarScheduledTaskArgs();
        }

        public Builder(MrScalarScheduledTaskArgs defaults) {
            $ = new MrScalarScheduledTaskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cron A cron expression representing the schedule for the task.
         * 
         * @return builder
         * 
         */
        public Builder cron(Output<String> cron) {
            $.cron = cron;
            return this;
        }

        /**
         * @param cron A cron expression representing the schedule for the task.
         * 
         * @return builder
         * 
         */
        public Builder cron(String cron) {
            return cron(Output.of(cron));
        }

        /**
         * @param desiredCapacity New desired capacity for the elastigroup.
         * 
         * @return builder
         * 
         */
        public Builder desiredCapacity(@Nullable Output<String> desiredCapacity) {
            $.desiredCapacity = desiredCapacity;
            return this;
        }

        /**
         * @param desiredCapacity New desired capacity for the elastigroup.
         * 
         * @return builder
         * 
         */
        public Builder desiredCapacity(String desiredCapacity) {
            return desiredCapacity(Output.of(desiredCapacity));
        }

        /**
         * @param instanceGroupType Select the EMR instance groups to execute the scheduled task on. Valid values: `task`.
         * 
         * @return builder
         * 
         */
        public Builder instanceGroupType(Output<String> instanceGroupType) {
            $.instanceGroupType = instanceGroupType;
            return this;
        }

        /**
         * @param instanceGroupType Select the EMR instance groups to execute the scheduled task on. Valid values: `task`.
         * 
         * @return builder
         * 
         */
        public Builder instanceGroupType(String instanceGroupType) {
            return instanceGroupType(Output.of(instanceGroupType));
        }

        /**
         * @param isEnabled Enable/Disable the specified scheduling task.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(@Nullable Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        /**
         * @param isEnabled Enable/Disable the specified scheduling task.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        /**
         * @param maxCapacity New max capacity for the elastigroup.
         * 
         * @return builder
         * 
         */
        public Builder maxCapacity(@Nullable Output<String> maxCapacity) {
            $.maxCapacity = maxCapacity;
            return this;
        }

        /**
         * @param maxCapacity New max capacity for the elastigroup.
         * 
         * @return builder
         * 
         */
        public Builder maxCapacity(String maxCapacity) {
            return maxCapacity(Output.of(maxCapacity));
        }

        /**
         * @param minCapacity New min capacity for the elastigroup.
         * 
         * @return builder
         * 
         */
        public Builder minCapacity(@Nullable Output<String> minCapacity) {
            $.minCapacity = minCapacity;
            return this;
        }

        /**
         * @param minCapacity New min capacity for the elastigroup.
         * 
         * @return builder
         * 
         */
        public Builder minCapacity(String minCapacity) {
            return minCapacity(Output.of(minCapacity));
        }

        /**
         * @param taskType The type of task to be scheduled. Valid values: `setCapacity`.
         * 
         * @return builder
         * 
         */
        public Builder taskType(Output<String> taskType) {
            $.taskType = taskType;
            return this;
        }

        /**
         * @param taskType The type of task to be scheduled. Valid values: `setCapacity`.
         * 
         * @return builder
         * 
         */
        public Builder taskType(String taskType) {
            return taskType(Output.of(taskType));
        }

        public MrScalarScheduledTaskArgs build() {
            if ($.cron == null) {
                throw new MissingRequiredPropertyException("MrScalarScheduledTaskArgs", "cron");
            }
            if ($.instanceGroupType == null) {
                throw new MissingRequiredPropertyException("MrScalarScheduledTaskArgs", "instanceGroupType");
            }
            if ($.taskType == null) {
                throw new MissingRequiredPropertyException("MrScalarScheduledTaskArgs", "taskType");
            }
            return $;
        }
    }

}
