// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class OceanScheduledTaskTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanScheduledTaskTaskArgs Empty = new OceanScheduledTaskTaskArgs();

    @Import(name="cronExpression", required=true)
    private Output<String> cronExpression;

    public Output<String> cronExpression() {
        return this.cronExpression;
    }

    @Import(name="isEnabled", required=true)
    private Output<Boolean> isEnabled;

    public Output<Boolean> isEnabled() {
        return this.isEnabled;
    }

    @Import(name="taskType", required=true)
    private Output<String> taskType;

    public Output<String> taskType() {
        return this.taskType;
    }

    private OceanScheduledTaskTaskArgs() {}

    private OceanScheduledTaskTaskArgs(OceanScheduledTaskTaskArgs $) {
        this.cronExpression = $.cronExpression;
        this.isEnabled = $.isEnabled;
        this.taskType = $.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanScheduledTaskTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanScheduledTaskTaskArgs $;

        public Builder() {
            $ = new OceanScheduledTaskTaskArgs();
        }

        public Builder(OceanScheduledTaskTaskArgs defaults) {
            $ = new OceanScheduledTaskTaskArgs(Objects.requireNonNull(defaults));
        }

        public Builder cronExpression(Output<String> cronExpression) {
            $.cronExpression = cronExpression;
            return this;
        }

        public Builder cronExpression(String cronExpression) {
            return cronExpression(Output.of(cronExpression));
        }

        public Builder isEnabled(Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        public Builder taskType(Output<String> taskType) {
            $.taskType = taskType;
            return this;
        }

        public Builder taskType(String taskType) {
            return taskType(Output.of(taskType));
        }

        public OceanScheduledTaskTaskArgs build() {
            if ($.cronExpression == null) {
                throw new MissingRequiredPropertyException("OceanScheduledTaskTaskArgs", "cronExpression");
            }
            if ($.isEnabled == null) {
                throw new MissingRequiredPropertyException("OceanScheduledTaskTaskArgs", "isEnabled");
            }
            if ($.taskType == null) {
                throw new MissingRequiredPropertyException("OceanScheduledTaskTaskArgs", "taskType");
            }
            return $;
        }
    }

}
