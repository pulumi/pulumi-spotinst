// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.azure.outputs.OceanNpSchedulingTaskParameters;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanNpSchedulingTask {
    private String cronExpression;
    private Boolean isEnabled;
    private @Nullable OceanNpSchedulingTaskParameters parameters;
    private String taskType;

    private OceanNpSchedulingTask() {}
    public String cronExpression() {
        return this.cronExpression;
    }
    public Boolean isEnabled() {
        return this.isEnabled;
    }
    public Optional<OceanNpSchedulingTaskParameters> parameters() {
        return Optional.ofNullable(this.parameters);
    }
    public String taskType() {
        return this.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanNpSchedulingTask defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cronExpression;
        private Boolean isEnabled;
        private @Nullable OceanNpSchedulingTaskParameters parameters;
        private String taskType;
        public Builder() {}
        public Builder(OceanNpSchedulingTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cronExpression = defaults.cronExpression;
    	      this.isEnabled = defaults.isEnabled;
    	      this.parameters = defaults.parameters;
    	      this.taskType = defaults.taskType;
        }

        @CustomType.Setter
        public Builder cronExpression(String cronExpression) {
            if (cronExpression == null) {
              throw new MissingRequiredPropertyException("OceanNpSchedulingTask", "cronExpression");
            }
            this.cronExpression = cronExpression;
            return this;
        }
        @CustomType.Setter
        public Builder isEnabled(Boolean isEnabled) {
            if (isEnabled == null) {
              throw new MissingRequiredPropertyException("OceanNpSchedulingTask", "isEnabled");
            }
            this.isEnabled = isEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder parameters(@Nullable OceanNpSchedulingTaskParameters parameters) {

            this.parameters = parameters;
            return this;
        }
        @CustomType.Setter
        public Builder taskType(String taskType) {
            if (taskType == null) {
              throw new MissingRequiredPropertyException("OceanNpSchedulingTask", "taskType");
            }
            this.taskType = taskType;
            return this;
        }
        public OceanNpSchedulingTask build() {
            final var _resultValue = new OceanNpSchedulingTask();
            _resultValue.cronExpression = cronExpression;
            _resultValue.isEnabled = isEnabled;
            _resultValue.parameters = parameters;
            _resultValue.taskType = taskType;
            return _resultValue;
        }
    }
}
