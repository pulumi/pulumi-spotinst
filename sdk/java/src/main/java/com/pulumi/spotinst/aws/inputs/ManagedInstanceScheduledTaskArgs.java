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


public final class ManagedInstanceScheduledTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedInstanceScheduledTaskArgs Empty = new ManagedInstanceScheduledTaskArgs();

    @Import(name="cronExpression")
    private @Nullable Output<String> cronExpression;

    public Optional<Output<String>> cronExpression() {
        return Optional.ofNullable(this.cronExpression);
    }

    @Import(name="frequency")
    private @Nullable Output<String> frequency;

    public Optional<Output<String>> frequency() {
        return Optional.ofNullable(this.frequency);
    }

    @Import(name="isEnabled")
    private @Nullable Output<Boolean> isEnabled;

    public Optional<Output<Boolean>> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }

    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    @Import(name="taskType", required=true)
    private Output<String> taskType;

    public Output<String> taskType() {
        return this.taskType;
    }

    private ManagedInstanceScheduledTaskArgs() {}

    private ManagedInstanceScheduledTaskArgs(ManagedInstanceScheduledTaskArgs $) {
        this.cronExpression = $.cronExpression;
        this.frequency = $.frequency;
        this.isEnabled = $.isEnabled;
        this.startTime = $.startTime;
        this.taskType = $.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedInstanceScheduledTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedInstanceScheduledTaskArgs $;

        public Builder() {
            $ = new ManagedInstanceScheduledTaskArgs();
        }

        public Builder(ManagedInstanceScheduledTaskArgs defaults) {
            $ = new ManagedInstanceScheduledTaskArgs(Objects.requireNonNull(defaults));
        }

        public Builder cronExpression(@Nullable Output<String> cronExpression) {
            $.cronExpression = cronExpression;
            return this;
        }

        public Builder cronExpression(String cronExpression) {
            return cronExpression(Output.of(cronExpression));
        }

        public Builder frequency(@Nullable Output<String> frequency) {
            $.frequency = frequency;
            return this;
        }

        public Builder frequency(String frequency) {
            return frequency(Output.of(frequency));
        }

        public Builder isEnabled(@Nullable Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        public Builder taskType(Output<String> taskType) {
            $.taskType = taskType;
            return this;
        }

        public Builder taskType(String taskType) {
            return taskType(Output.of(taskType));
        }

        public ManagedInstanceScheduledTaskArgs build() {
            if ($.taskType == null) {
                throw new MissingRequiredPropertyException("ManagedInstanceScheduledTaskArgs", "taskType");
            }
            return $;
        }
    }

}
