// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.ecs.outputs.OceanLaunchSpecSchedulingTaskTaskHeadroom;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class OceanLaunchSpecSchedulingTask {
    /**
     * @return A valid cron expression. For example : &#34; * * * * * &#34;. The cron job runs in UTC time and is in Unix cron format.
     * 
     */
    private String cronExpression;
    /**
     * @return Describes whether the task is enabled. When `true`, the task runs. When `false`, it does not run.
     * 
     */
    private Boolean isEnabled;
    /**
     * @return The config of this scheduled task. Depends on the value of taskType.
     * 
     */
    private @Nullable List<OceanLaunchSpecSchedulingTaskTaskHeadroom> taskHeadrooms;
    /**
     * @return The activity that you are scheduling. Valid values: &#34;manualHeadroomUpdate&#34;.
     * 
     */
    private String taskType;

    private OceanLaunchSpecSchedulingTask() {}
    /**
     * @return A valid cron expression. For example : &#34; * * * * * &#34;. The cron job runs in UTC time and is in Unix cron format.
     * 
     */
    public String cronExpression() {
        return this.cronExpression;
    }
    /**
     * @return Describes whether the task is enabled. When `true`, the task runs. When `false`, it does not run.
     * 
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }
    /**
     * @return The config of this scheduled task. Depends on the value of taskType.
     * 
     */
    public List<OceanLaunchSpecSchedulingTaskTaskHeadroom> taskHeadrooms() {
        return this.taskHeadrooms == null ? List.of() : this.taskHeadrooms;
    }
    /**
     * @return The activity that you are scheduling. Valid values: &#34;manualHeadroomUpdate&#34;.
     * 
     */
    public String taskType() {
        return this.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanLaunchSpecSchedulingTask defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cronExpression;
        private Boolean isEnabled;
        private @Nullable List<OceanLaunchSpecSchedulingTaskTaskHeadroom> taskHeadrooms;
        private String taskType;
        public Builder() {}
        public Builder(OceanLaunchSpecSchedulingTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cronExpression = defaults.cronExpression;
    	      this.isEnabled = defaults.isEnabled;
    	      this.taskHeadrooms = defaults.taskHeadrooms;
    	      this.taskType = defaults.taskType;
        }

        @CustomType.Setter
        public Builder cronExpression(String cronExpression) {
            if (cronExpression == null) {
              throw new MissingRequiredPropertyException("OceanLaunchSpecSchedulingTask", "cronExpression");
            }
            this.cronExpression = cronExpression;
            return this;
        }
        @CustomType.Setter
        public Builder isEnabled(Boolean isEnabled) {
            if (isEnabled == null) {
              throw new MissingRequiredPropertyException("OceanLaunchSpecSchedulingTask", "isEnabled");
            }
            this.isEnabled = isEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder taskHeadrooms(@Nullable List<OceanLaunchSpecSchedulingTaskTaskHeadroom> taskHeadrooms) {

            this.taskHeadrooms = taskHeadrooms;
            return this;
        }
        public Builder taskHeadrooms(OceanLaunchSpecSchedulingTaskTaskHeadroom... taskHeadrooms) {
            return taskHeadrooms(List.of(taskHeadrooms));
        }
        @CustomType.Setter
        public Builder taskType(String taskType) {
            if (taskType == null) {
              throw new MissingRequiredPropertyException("OceanLaunchSpecSchedulingTask", "taskType");
            }
            this.taskType = taskType;
            return this;
        }
        public OceanLaunchSpecSchedulingTask build() {
            final var _resultValue = new OceanLaunchSpecSchedulingTask();
            _resultValue.cronExpression = cronExpression;
            _resultValue.isEnabled = isEnabled;
            _resultValue.taskHeadrooms = taskHeadrooms;
            _resultValue.taskType = taskType;
            return _resultValue;
        }
    }
}
