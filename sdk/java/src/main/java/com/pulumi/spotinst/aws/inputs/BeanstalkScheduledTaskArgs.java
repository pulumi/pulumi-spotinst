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


public final class BeanstalkScheduledTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final BeanstalkScheduledTaskArgs Empty = new BeanstalkScheduledTaskArgs();

    /**
     * The number of instances to add or remove.
     * 
     */
    @Import(name="adjustment")
    private @Nullable Output<String> adjustment;

    /**
     * @return The number of instances to add or remove.
     * 
     */
    public Optional<Output<String>> adjustment() {
        return Optional.ofNullable(this.adjustment);
    }

    /**
     * The percentage of instances to add or remove.
     * 
     * Usage:
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
     */
    @Import(name="adjustmentPercentage")
    private @Nullable Output<String> adjustmentPercentage;

    /**
     * @return The percentage of instances to add or remove.
     * 
     * Usage:
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
     */
    public Optional<Output<String>> adjustmentPercentage() {
        return Optional.ofNullable(this.adjustmentPercentage);
    }

    /**
     * The percentage size of each batch in the scheduled deployment roll.
     * 
     */
    @Import(name="batchSizePercentage")
    private @Nullable Output<String> batchSizePercentage;

    /**
     * @return The percentage size of each batch in the scheduled deployment roll.
     * 
     */
    public Optional<Output<String>> batchSizePercentage() {
        return Optional.ofNullable(this.batchSizePercentage);
    }

    /**
     * A valid cron expression. The cron is running in UTC time zone and is in [Unix cron format](https://en.wikipedia.org/wiki/Cron).
     * 
     */
    @Import(name="cronExpression")
    private @Nullable Output<String> cronExpression;

    /**
     * @return A valid cron expression. The cron is running in UTC time zone and is in [Unix cron format](https://en.wikipedia.org/wiki/Cron).
     * 
     */
    public Optional<Output<String>> cronExpression() {
        return Optional.ofNullable(this.cronExpression);
    }

    /**
     * The recurrence frequency to run this task. Supported values are `&#34;hourly&#34;`, `&#34;daily&#34;`, `&#34;weekly&#34;` and `&#34;continuous&#34;`.
     * 
     */
    @Import(name="frequency")
    private @Nullable Output<String> frequency;

    /**
     * @return The recurrence frequency to run this task. Supported values are `&#34;hourly&#34;`, `&#34;daily&#34;`, `&#34;weekly&#34;` and `&#34;continuous&#34;`.
     * 
     */
    public Optional<Output<String>> frequency() {
        return Optional.ofNullable(this.frequency);
    }

    /**
     * The period of time (seconds) to wait before checking a batch&#39;s health after it&#39;s deployment.
     * 
     */
    @Import(name="gracePeriod")
    private @Nullable Output<String> gracePeriod;

    /**
     * @return The period of time (seconds) to wait before checking a batch&#39;s health after it&#39;s deployment.
     * 
     */
    public Optional<Output<String>> gracePeriod() {
        return Optional.ofNullable(this.gracePeriod);
    }

    /**
     * Setting the task to being enabled or disabled.
     * 
     */
    @Import(name="isEnabled")
    private @Nullable Output<Boolean> isEnabled;

    /**
     * @return Setting the task to being enabled or disabled.
     * 
     */
    public Optional<Output<Boolean>> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }

    /**
     * The maximum number of instances the group should have.
     * 
     */
    @Import(name="maxCapacity")
    private @Nullable Output<String> maxCapacity;

    /**
     * @return The maximum number of instances the group should have.
     * 
     */
    public Optional<Output<String>> maxCapacity() {
        return Optional.ofNullable(this.maxCapacity);
    }

    /**
     * The minimum number of instances the group should have.
     * 
     */
    @Import(name="minCapacity")
    private @Nullable Output<String> minCapacity;

    /**
     * @return The minimum number of instances the group should have.
     * 
     */
    public Optional<Output<String>> minCapacity() {
        return Optional.ofNullable(this.minCapacity);
    }

    /**
     * The maximum number of instances the group should have.
     * 
     */
    @Import(name="scaleMaxCapacity")
    private @Nullable Output<String> scaleMaxCapacity;

    /**
     * @return The maximum number of instances the group should have.
     * 
     */
    public Optional<Output<String>> scaleMaxCapacity() {
        return Optional.ofNullable(this.scaleMaxCapacity);
    }

    /**
     * The minimum number of instances the group should have.
     * 
     */
    @Import(name="scaleMinCapacity")
    private @Nullable Output<String> scaleMinCapacity;

    /**
     * @return The minimum number of instances the group should have.
     * 
     */
    public Optional<Output<String>> scaleMinCapacity() {
        return Optional.ofNullable(this.scaleMinCapacity);
    }

    /**
     * The desired number of instances the group should have.
     * 
     */
    @Import(name="scaleTargetCapacity")
    private @Nullable Output<String> scaleTargetCapacity;

    /**
     * @return The desired number of instances the group should have.
     * 
     */
    public Optional<Output<String>> scaleTargetCapacity() {
        return Optional.ofNullable(this.scaleTargetCapacity);
    }

    /**
     * Set a start time for one time tasks.
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    /**
     * @return Set a start time for one time tasks.
     * 
     */
    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    /**
     * The desired number of instances the group should have.
     * 
     */
    @Import(name="targetCapacity")
    private @Nullable Output<String> targetCapacity;

    /**
     * @return The desired number of instances the group should have.
     * 
     */
    public Optional<Output<String>> targetCapacity() {
        return Optional.ofNullable(this.targetCapacity);
    }

    /**
     * The task type to run. Supported task types are: `&#34;scale&#34;`, `&#34;backup_ami&#34;`, `&#34;roll&#34;`, `&#34;scaleUp&#34;`, `&#34;percentageScaleUp&#34;`, `&#34;scaleDown&#34;`, `&#34;percentageScaleDown&#34;`, `&#34;statefulUpdateCapacity&#34;`.
     * 
     */
    @Import(name="taskType", required=true)
    private Output<String> taskType;

    /**
     * @return The task type to run. Supported task types are: `&#34;scale&#34;`, `&#34;backup_ami&#34;`, `&#34;roll&#34;`, `&#34;scaleUp&#34;`, `&#34;percentageScaleUp&#34;`, `&#34;scaleDown&#34;`, `&#34;percentageScaleDown&#34;`, `&#34;statefulUpdateCapacity&#34;`.
     * 
     */
    public Output<String> taskType() {
        return this.taskType;
    }

    private BeanstalkScheduledTaskArgs() {}

    private BeanstalkScheduledTaskArgs(BeanstalkScheduledTaskArgs $) {
        this.adjustment = $.adjustment;
        this.adjustmentPercentage = $.adjustmentPercentage;
        this.batchSizePercentage = $.batchSizePercentage;
        this.cronExpression = $.cronExpression;
        this.frequency = $.frequency;
        this.gracePeriod = $.gracePeriod;
        this.isEnabled = $.isEnabled;
        this.maxCapacity = $.maxCapacity;
        this.minCapacity = $.minCapacity;
        this.scaleMaxCapacity = $.scaleMaxCapacity;
        this.scaleMinCapacity = $.scaleMinCapacity;
        this.scaleTargetCapacity = $.scaleTargetCapacity;
        this.startTime = $.startTime;
        this.targetCapacity = $.targetCapacity;
        this.taskType = $.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BeanstalkScheduledTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BeanstalkScheduledTaskArgs $;

        public Builder() {
            $ = new BeanstalkScheduledTaskArgs();
        }

        public Builder(BeanstalkScheduledTaskArgs defaults) {
            $ = new BeanstalkScheduledTaskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param adjustment The number of instances to add or remove.
         * 
         * @return builder
         * 
         */
        public Builder adjustment(@Nullable Output<String> adjustment) {
            $.adjustment = adjustment;
            return this;
        }

        /**
         * @param adjustment The number of instances to add or remove.
         * 
         * @return builder
         * 
         */
        public Builder adjustment(String adjustment) {
            return adjustment(Output.of(adjustment));
        }

        /**
         * @param adjustmentPercentage The percentage of instances to add or remove.
         * 
         * Usage:
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
         * @return builder
         * 
         */
        public Builder adjustmentPercentage(@Nullable Output<String> adjustmentPercentage) {
            $.adjustmentPercentage = adjustmentPercentage;
            return this;
        }

        /**
         * @param adjustmentPercentage The percentage of instances to add or remove.
         * 
         * Usage:
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
         * @return builder
         * 
         */
        public Builder adjustmentPercentage(String adjustmentPercentage) {
            return adjustmentPercentage(Output.of(adjustmentPercentage));
        }

        /**
         * @param batchSizePercentage The percentage size of each batch in the scheduled deployment roll.
         * 
         * @return builder
         * 
         */
        public Builder batchSizePercentage(@Nullable Output<String> batchSizePercentage) {
            $.batchSizePercentage = batchSizePercentage;
            return this;
        }

        /**
         * @param batchSizePercentage The percentage size of each batch in the scheduled deployment roll.
         * 
         * @return builder
         * 
         */
        public Builder batchSizePercentage(String batchSizePercentage) {
            return batchSizePercentage(Output.of(batchSizePercentage));
        }

        /**
         * @param cronExpression A valid cron expression. The cron is running in UTC time zone and is in [Unix cron format](https://en.wikipedia.org/wiki/Cron).
         * 
         * @return builder
         * 
         */
        public Builder cronExpression(@Nullable Output<String> cronExpression) {
            $.cronExpression = cronExpression;
            return this;
        }

        /**
         * @param cronExpression A valid cron expression. The cron is running in UTC time zone and is in [Unix cron format](https://en.wikipedia.org/wiki/Cron).
         * 
         * @return builder
         * 
         */
        public Builder cronExpression(String cronExpression) {
            return cronExpression(Output.of(cronExpression));
        }

        /**
         * @param frequency The recurrence frequency to run this task. Supported values are `&#34;hourly&#34;`, `&#34;daily&#34;`, `&#34;weekly&#34;` and `&#34;continuous&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder frequency(@Nullable Output<String> frequency) {
            $.frequency = frequency;
            return this;
        }

        /**
         * @param frequency The recurrence frequency to run this task. Supported values are `&#34;hourly&#34;`, `&#34;daily&#34;`, `&#34;weekly&#34;` and `&#34;continuous&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder frequency(String frequency) {
            return frequency(Output.of(frequency));
        }

        /**
         * @param gracePeriod The period of time (seconds) to wait before checking a batch&#39;s health after it&#39;s deployment.
         * 
         * @return builder
         * 
         */
        public Builder gracePeriod(@Nullable Output<String> gracePeriod) {
            $.gracePeriod = gracePeriod;
            return this;
        }

        /**
         * @param gracePeriod The period of time (seconds) to wait before checking a batch&#39;s health after it&#39;s deployment.
         * 
         * @return builder
         * 
         */
        public Builder gracePeriod(String gracePeriod) {
            return gracePeriod(Output.of(gracePeriod));
        }

        /**
         * @param isEnabled Setting the task to being enabled or disabled.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(@Nullable Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        /**
         * @param isEnabled Setting the task to being enabled or disabled.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        /**
         * @param maxCapacity The maximum number of instances the group should have.
         * 
         * @return builder
         * 
         */
        public Builder maxCapacity(@Nullable Output<String> maxCapacity) {
            $.maxCapacity = maxCapacity;
            return this;
        }

        /**
         * @param maxCapacity The maximum number of instances the group should have.
         * 
         * @return builder
         * 
         */
        public Builder maxCapacity(String maxCapacity) {
            return maxCapacity(Output.of(maxCapacity));
        }

        /**
         * @param minCapacity The minimum number of instances the group should have.
         * 
         * @return builder
         * 
         */
        public Builder minCapacity(@Nullable Output<String> minCapacity) {
            $.minCapacity = minCapacity;
            return this;
        }

        /**
         * @param minCapacity The minimum number of instances the group should have.
         * 
         * @return builder
         * 
         */
        public Builder minCapacity(String minCapacity) {
            return minCapacity(Output.of(minCapacity));
        }

        /**
         * @param scaleMaxCapacity The maximum number of instances the group should have.
         * 
         * @return builder
         * 
         */
        public Builder scaleMaxCapacity(@Nullable Output<String> scaleMaxCapacity) {
            $.scaleMaxCapacity = scaleMaxCapacity;
            return this;
        }

        /**
         * @param scaleMaxCapacity The maximum number of instances the group should have.
         * 
         * @return builder
         * 
         */
        public Builder scaleMaxCapacity(String scaleMaxCapacity) {
            return scaleMaxCapacity(Output.of(scaleMaxCapacity));
        }

        /**
         * @param scaleMinCapacity The minimum number of instances the group should have.
         * 
         * @return builder
         * 
         */
        public Builder scaleMinCapacity(@Nullable Output<String> scaleMinCapacity) {
            $.scaleMinCapacity = scaleMinCapacity;
            return this;
        }

        /**
         * @param scaleMinCapacity The minimum number of instances the group should have.
         * 
         * @return builder
         * 
         */
        public Builder scaleMinCapacity(String scaleMinCapacity) {
            return scaleMinCapacity(Output.of(scaleMinCapacity));
        }

        /**
         * @param scaleTargetCapacity The desired number of instances the group should have.
         * 
         * @return builder
         * 
         */
        public Builder scaleTargetCapacity(@Nullable Output<String> scaleTargetCapacity) {
            $.scaleTargetCapacity = scaleTargetCapacity;
            return this;
        }

        /**
         * @param scaleTargetCapacity The desired number of instances the group should have.
         * 
         * @return builder
         * 
         */
        public Builder scaleTargetCapacity(String scaleTargetCapacity) {
            return scaleTargetCapacity(Output.of(scaleTargetCapacity));
        }

        /**
         * @param startTime Set a start time for one time tasks.
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime Set a start time for one time tasks.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        /**
         * @param targetCapacity The desired number of instances the group should have.
         * 
         * @return builder
         * 
         */
        public Builder targetCapacity(@Nullable Output<String> targetCapacity) {
            $.targetCapacity = targetCapacity;
            return this;
        }

        /**
         * @param targetCapacity The desired number of instances the group should have.
         * 
         * @return builder
         * 
         */
        public Builder targetCapacity(String targetCapacity) {
            return targetCapacity(Output.of(targetCapacity));
        }

        /**
         * @param taskType The task type to run. Supported task types are: `&#34;scale&#34;`, `&#34;backup_ami&#34;`, `&#34;roll&#34;`, `&#34;scaleUp&#34;`, `&#34;percentageScaleUp&#34;`, `&#34;scaleDown&#34;`, `&#34;percentageScaleDown&#34;`, `&#34;statefulUpdateCapacity&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder taskType(Output<String> taskType) {
            $.taskType = taskType;
            return this;
        }

        /**
         * @param taskType The task type to run. Supported task types are: `&#34;scale&#34;`, `&#34;backup_ami&#34;`, `&#34;roll&#34;`, `&#34;scaleUp&#34;`, `&#34;percentageScaleUp&#34;`, `&#34;scaleDown&#34;`, `&#34;percentageScaleDown&#34;`, `&#34;statefulUpdateCapacity&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder taskType(String taskType) {
            return taskType(Output.of(taskType));
        }

        public BeanstalkScheduledTaskArgs build() {
            if ($.taskType == null) {
                throw new MissingRequiredPropertyException("BeanstalkScheduledTaskArgs", "taskType");
            }
            return $;
        }
    }

}
