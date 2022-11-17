// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanImportScheduledTaskTask {
    /**
     * @return Value in % to set size of batch in roll. Valid values are 0-100
     * Example: 20.
     * 
     */
    private @Nullable Integer batchSizePercentage;
    /**
     * @return A valid cron expression. For example : &#34; * * * * * &#34;.The cron is running in UTC time zone and is in Unix cron format Cron Expression Validator Script. Only one of ‘frequency’ or ‘cronExpression’ should be used at a time. Required for cluster.scheduling.tasks object
     * Example: 0 1 * * *
     * 
     */
    private String cronExpression;
    /**
     * @return Enable the Ocean Kubernetes Autoscaler.
     * 
     */
    private Boolean isEnabled;
    /**
     * @return Valid values: &#34;clusterRoll&#34;. Required for cluster.scheduling.tasks object.
     * 
     */
    private String taskType;

    private OceanImportScheduledTaskTask() {}
    /**
     * @return Value in % to set size of batch in roll. Valid values are 0-100
     * Example: 20.
     * 
     */
    public Optional<Integer> batchSizePercentage() {
        return Optional.ofNullable(this.batchSizePercentage);
    }
    /**
     * @return A valid cron expression. For example : &#34; * * * * * &#34;.The cron is running in UTC time zone and is in Unix cron format Cron Expression Validator Script. Only one of ‘frequency’ or ‘cronExpression’ should be used at a time. Required for cluster.scheduling.tasks object
     * Example: 0 1 * * *
     * 
     */
    public String cronExpression() {
        return this.cronExpression;
    }
    /**
     * @return Enable the Ocean Kubernetes Autoscaler.
     * 
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }
    /**
     * @return Valid values: &#34;clusterRoll&#34;. Required for cluster.scheduling.tasks object.
     * 
     */
    public String taskType() {
        return this.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanImportScheduledTaskTask defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer batchSizePercentage;
        private String cronExpression;
        private Boolean isEnabled;
        private String taskType;
        public Builder() {}
        public Builder(OceanImportScheduledTaskTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.batchSizePercentage = defaults.batchSizePercentage;
    	      this.cronExpression = defaults.cronExpression;
    	      this.isEnabled = defaults.isEnabled;
    	      this.taskType = defaults.taskType;
        }

        @CustomType.Setter
        public Builder batchSizePercentage(@Nullable Integer batchSizePercentage) {
            this.batchSizePercentage = batchSizePercentage;
            return this;
        }
        @CustomType.Setter
        public Builder cronExpression(String cronExpression) {
            this.cronExpression = Objects.requireNonNull(cronExpression);
            return this;
        }
        @CustomType.Setter
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder taskType(String taskType) {
            this.taskType = Objects.requireNonNull(taskType);
            return this;
        }
        public OceanImportScheduledTaskTask build() {
            final var o = new OceanImportScheduledTaskTask();
            o.batchSizePercentage = batchSizePercentage;
            o.cronExpression = cronExpression;
            o.isEnabled = isEnabled;
            o.taskType = taskType;
            return o;
        }
    }
}
