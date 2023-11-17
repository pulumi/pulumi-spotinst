// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class OceanScheduledTaskTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanScheduledTaskTaskArgs Empty = new OceanScheduledTaskTaskArgs();

    /**
     * A valid cron expression. The cron is running in UTC time zone and is in Unix cron format Cron Expression Validator Script. Only one of `frequency` or `cronExpression` should be used at a time. Required for `cluster.scheduling.tasks` object. Example: `0 1 * * *`.
     * 
     */
    @Import(name="cronExpression", required=true)
    private Output<String> cronExpression;

    /**
     * @return A valid cron expression. The cron is running in UTC time zone and is in Unix cron format Cron Expression Validator Script. Only one of `frequency` or `cronExpression` should be used at a time. Required for `cluster.scheduling.tasks` object. Example: `0 1 * * *`.
     * 
     */
    public Output<String> cronExpression() {
        return this.cronExpression;
    }

    /**
     * Describes whether the task is enabled. When true the task should run when false it should not run. Required for `cluster.scheduling.tasks` object.
     * 
     */
    @Import(name="isEnabled", required=true)
    private Output<Boolean> isEnabled;

    /**
     * @return Describes whether the task is enabled. When true the task should run when false it should not run. Required for `cluster.scheduling.tasks` object.
     * 
     */
    public Output<Boolean> isEnabled() {
        return this.isEnabled;
    }

    /**
     * Valid values: &#34;clusterRoll&#34;. Required for `cluster.scheduling.tasks object`. Example: `clusterRoll`.
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *     }
     * }
     * ```
     * 
     * &lt;a id=&#34;attributes-reference&#34;&gt;&lt;/a&gt;
     * 
     */
    @Import(name="taskType", required=true)
    private Output<String> taskType;

    /**
     * @return Valid values: &#34;clusterRoll&#34;. Required for `cluster.scheduling.tasks object`. Example: `clusterRoll`.
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *     }
     * }
     * ```
     * 
     * &lt;a id=&#34;attributes-reference&#34;&gt;&lt;/a&gt;
     * 
     */
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

        /**
         * @param cronExpression A valid cron expression. The cron is running in UTC time zone and is in Unix cron format Cron Expression Validator Script. Only one of `frequency` or `cronExpression` should be used at a time. Required for `cluster.scheduling.tasks` object. Example: `0 1 * * *`.
         * 
         * @return builder
         * 
         */
        public Builder cronExpression(Output<String> cronExpression) {
            $.cronExpression = cronExpression;
            return this;
        }

        /**
         * @param cronExpression A valid cron expression. The cron is running in UTC time zone and is in Unix cron format Cron Expression Validator Script. Only one of `frequency` or `cronExpression` should be used at a time. Required for `cluster.scheduling.tasks` object. Example: `0 1 * * *`.
         * 
         * @return builder
         * 
         */
        public Builder cronExpression(String cronExpression) {
            return cronExpression(Output.of(cronExpression));
        }

        /**
         * @param isEnabled Describes whether the task is enabled. When true the task should run when false it should not run. Required for `cluster.scheduling.tasks` object.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        /**
         * @param isEnabled Describes whether the task is enabled. When true the task should run when false it should not run. Required for `cluster.scheduling.tasks` object.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        /**
         * @param taskType Valid values: &#34;clusterRoll&#34;. Required for `cluster.scheduling.tasks object`. Example: `clusterRoll`.
         * ```java
         * package generated_program;
         * 
         * import com.pulumi.Context;
         * import com.pulumi.Pulumi;
         * import com.pulumi.core.Output;
         * import java.util.List;
         * import java.util.ArrayList;
         * import java.util.Map;
         * import java.io.File;
         * import java.nio.file.Files;
         * import java.nio.file.Paths;
         * 
         * public class App {
         *     public static void main(String[] args) {
         *         Pulumi.run(App::stack);
         *     }
         * 
         *     public static void stack(Context ctx) {
         *     }
         * }
         * ```
         * 
         * &lt;a id=&#34;attributes-reference&#34;&gt;&lt;/a&gt;
         * 
         * @return builder
         * 
         */
        public Builder taskType(Output<String> taskType) {
            $.taskType = taskType;
            return this;
        }

        /**
         * @param taskType Valid values: &#34;clusterRoll&#34;. Required for `cluster.scheduling.tasks object`. Example: `clusterRoll`.
         * ```java
         * package generated_program;
         * 
         * import com.pulumi.Context;
         * import com.pulumi.Pulumi;
         * import com.pulumi.core.Output;
         * import java.util.List;
         * import java.util.ArrayList;
         * import java.util.Map;
         * import java.io.File;
         * import java.nio.file.Files;
         * import java.nio.file.Paths;
         * 
         * public class App {
         *     public static void main(String[] args) {
         *         Pulumi.run(App::stack);
         *     }
         * 
         *     public static void stack(Context ctx) {
         *     }
         * }
         * ```
         * 
         * &lt;a id=&#34;attributes-reference&#34;&gt;&lt;/a&gt;
         * 
         * @return builder
         * 
         */
        public Builder taskType(String taskType) {
            return taskType(Output.of(taskType));
        }

        public OceanScheduledTaskTaskArgs build() {
            $.cronExpression = Objects.requireNonNull($.cronExpression, "expected parameter 'cronExpression' to be non-null");
            $.isEnabled = Objects.requireNonNull($.isEnabled, "expected parameter 'isEnabled' to be non-null");
            $.taskType = Objects.requireNonNull($.taskType, "expected parameter 'taskType' to be non-null");
            return $;
        }
    }

}
