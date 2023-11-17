// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.gke.inputs.OceanImportScheduledTaskTaskTaskParametersArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanImportScheduledTaskTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanImportScheduledTaskTaskArgs Empty = new OceanImportScheduledTaskTaskArgs();

    /**
     * A valid cron expression. For example : &#34; * * * * * &#34;.The cron is running in UTC time zone and is in Unix cron format Cron Expression Validator Script. Only one of ‘frequency’ or ‘cronExpression’ should be used at a time. Required for cluster.scheduling.tasks object
     * Example: 0 1 * * *
     * 
     */
    @Import(name="cronExpression", required=true)
    private Output<String> cronExpression;

    /**
     * @return A valid cron expression. For example : &#34; * * * * * &#34;.The cron is running in UTC time zone and is in Unix cron format Cron Expression Validator Script. Only one of ‘frequency’ or ‘cronExpression’ should be used at a time. Required for cluster.scheduling.tasks object
     * Example: 0 1 * * *
     * 
     */
    public Output<String> cronExpression() {
        return this.cronExpression;
    }

    /**
     * Describes whether the task is enabled. When true the task should run when false it should not run. Required for cluster.scheduling.tasks object.
     * 
     */
    @Import(name="isEnabled", required=true)
    private Output<Boolean> isEnabled;

    /**
     * @return Describes whether the task is enabled. When true the task should run when false it should not run. Required for cluster.scheduling.tasks object.
     * 
     */
    public Output<Boolean> isEnabled() {
        return this.isEnabled;
    }

    @Import(name="taskParameters")
    private @Nullable Output<OceanImportScheduledTaskTaskTaskParametersArgs> taskParameters;

    public Optional<Output<OceanImportScheduledTaskTaskTaskParametersArgs>> taskParameters() {
        return Optional.ofNullable(this.taskParameters);
    }

    /**
     * Valid values: &#34;clusterRoll&#34;. Required for cluster.scheduling.tasks object.
     * 
     */
    @Import(name="taskType", required=true)
    private Output<String> taskType;

    /**
     * @return Valid values: &#34;clusterRoll&#34;. Required for cluster.scheduling.tasks object.
     * 
     */
    public Output<String> taskType() {
        return this.taskType;
    }

    private OceanImportScheduledTaskTaskArgs() {}

    private OceanImportScheduledTaskTaskArgs(OceanImportScheduledTaskTaskArgs $) {
        this.cronExpression = $.cronExpression;
        this.isEnabled = $.isEnabled;
        this.taskParameters = $.taskParameters;
        this.taskType = $.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanImportScheduledTaskTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanImportScheduledTaskTaskArgs $;

        public Builder() {
            $ = new OceanImportScheduledTaskTaskArgs();
        }

        public Builder(OceanImportScheduledTaskTaskArgs defaults) {
            $ = new OceanImportScheduledTaskTaskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cronExpression A valid cron expression. For example : &#34; * * * * * &#34;.The cron is running in UTC time zone and is in Unix cron format Cron Expression Validator Script. Only one of ‘frequency’ or ‘cronExpression’ should be used at a time. Required for cluster.scheduling.tasks object
         * Example: 0 1 * * *
         * 
         * @return builder
         * 
         */
        public Builder cronExpression(Output<String> cronExpression) {
            $.cronExpression = cronExpression;
            return this;
        }

        /**
         * @param cronExpression A valid cron expression. For example : &#34; * * * * * &#34;.The cron is running in UTC time zone and is in Unix cron format Cron Expression Validator Script. Only one of ‘frequency’ or ‘cronExpression’ should be used at a time. Required for cluster.scheduling.tasks object
         * Example: 0 1 * * *
         * 
         * @return builder
         * 
         */
        public Builder cronExpression(String cronExpression) {
            return cronExpression(Output.of(cronExpression));
        }

        /**
         * @param isEnabled Describes whether the task is enabled. When true the task should run when false it should not run. Required for cluster.scheduling.tasks object.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        /**
         * @param isEnabled Describes whether the task is enabled. When true the task should run when false it should not run. Required for cluster.scheduling.tasks object.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        public Builder taskParameters(@Nullable Output<OceanImportScheduledTaskTaskTaskParametersArgs> taskParameters) {
            $.taskParameters = taskParameters;
            return this;
        }

        public Builder taskParameters(OceanImportScheduledTaskTaskTaskParametersArgs taskParameters) {
            return taskParameters(Output.of(taskParameters));
        }

        /**
         * @param taskType Valid values: &#34;clusterRoll&#34;. Required for cluster.scheduling.tasks object.
         * 
         * @return builder
         * 
         */
        public Builder taskType(Output<String> taskType) {
            $.taskType = taskType;
            return this;
        }

        /**
         * @param taskType Valid values: &#34;clusterRoll&#34;. Required for cluster.scheduling.tasks object.
         * 
         * @return builder
         * 
         */
        public Builder taskType(String taskType) {
            return taskType(Output.of(taskType));
        }

        public OceanImportScheduledTaskTaskArgs build() {
            $.cronExpression = Objects.requireNonNull($.cronExpression, "expected parameter 'cronExpression' to be non-null");
            $.isEnabled = Objects.requireNonNull($.isEnabled, "expected parameter 'isEnabled' to be non-null");
            $.taskType = Objects.requireNonNull($.taskType, "expected parameter 'taskType' to be non-null");
            return $;
        }
    }

}
