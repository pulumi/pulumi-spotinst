// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.ecs.inputs.OceanAutoscalerDownArgs;
import com.pulumi.spotinst.ecs.inputs.OceanAutoscalerHeadroomArgs;
import com.pulumi.spotinst.ecs.inputs.OceanAutoscalerResourceLimitsArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanAutoscalerArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanAutoscalerArgs Empty = new OceanAutoscalerArgs();

    /**
     * The auto-headroom percentage. Set a number between 0-200 to control the headroom % of the cluster. Relevant when `isAutoConfig`= true.
     * 
     */
    @Import(name="autoHeadroomPercentage")
    private @Nullable Output<Integer> autoHeadroomPercentage;

    /**
     * @return The auto-headroom percentage. Set a number between 0-200 to control the headroom % of the cluster. Relevant when `isAutoConfig`= true.
     * 
     */
    public Optional<Output<Integer>> autoHeadroomPercentage() {
        return Optional.ofNullable(this.autoHeadroomPercentage);
    }

    /**
     * Cooldown period between scaling actions.
     * 
     */
    @Import(name="cooldown")
    private @Nullable Output<Integer> cooldown;

    /**
     * @return Cooldown period between scaling actions.
     * 
     */
    public Optional<Output<Integer>> cooldown() {
        return Optional.ofNullable(this.cooldown);
    }

    /**
     * Auto Scaling scale down operations.
     * 
     */
    @Import(name="down")
    private @Nullable Output<OceanAutoscalerDownArgs> down;

    /**
     * @return Auto Scaling scale down operations.
     * 
     */
    public Optional<Output<OceanAutoscalerDownArgs>> down() {
        return Optional.ofNullable(this.down);
    }

    /**
     * When set to true, both automatic and per custom launch specification manual headroom to be saved concurrently and independently in the cluster. prerequisite: isAutoConfig must be true
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
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
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    @Import(name="enableAutomaticAndManualHeadroom")
    private @Nullable Output<Boolean> enableAutomaticAndManualHeadroom;

    /**
     * @return When set to true, both automatic and per custom launch specification manual headroom to be saved concurrently and independently in the cluster. prerequisite: isAutoConfig must be true
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
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
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public Optional<Output<Boolean>> enableAutomaticAndManualHeadroom() {
        return Optional.ofNullable(this.enableAutomaticAndManualHeadroom);
    }

    /**
     * Spare resource capacity management enabling fast assignment of tasks without waiting for new resources to launch.
     * 
     */
    @Import(name="headroom")
    private @Nullable Output<OceanAutoscalerHeadroomArgs> headroom;

    /**
     * @return Spare resource capacity management enabling fast assignment of tasks without waiting for new resources to launch.
     * 
     */
    public Optional<Output<OceanAutoscalerHeadroomArgs>> headroom() {
        return Optional.ofNullable(this.headroom);
    }

    /**
     * Automatically configure and optimize headroom resources.
     * 
     */
    @Import(name="isAutoConfig")
    private @Nullable Output<Boolean> isAutoConfig;

    /**
     * @return Automatically configure and optimize headroom resources.
     * 
     */
    public Optional<Output<Boolean>> isAutoConfig() {
        return Optional.ofNullable(this.isAutoConfig);
    }

    /**
     * Enable the Ocean ECS autoscaler.
     * 
     */
    @Import(name="isEnabled")
    private @Nullable Output<Boolean> isEnabled;

    /**
     * @return Enable the Ocean ECS autoscaler.
     * 
     */
    public Optional<Output<Boolean>> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }

    /**
     * Optionally set upper and lower bounds on the resource usage of the cluster.
     * 
     */
    @Import(name="resourceLimits")
    private @Nullable Output<OceanAutoscalerResourceLimitsArgs> resourceLimits;

    /**
     * @return Optionally set upper and lower bounds on the resource usage of the cluster.
     * 
     */
    public Optional<Output<OceanAutoscalerResourceLimitsArgs>> resourceLimits() {
        return Optional.ofNullable(this.resourceLimits);
    }

    /**
     * Option to scale down non-service tasks. If not set, Ocean does not scale down standalone tasks.
     * 
     */
    @Import(name="shouldScaleDownNonServiceTasks")
    private @Nullable Output<Boolean> shouldScaleDownNonServiceTasks;

    /**
     * @return Option to scale down non-service tasks. If not set, Ocean does not scale down standalone tasks.
     * 
     */
    public Optional<Output<Boolean>> shouldScaleDownNonServiceTasks() {
        return Optional.ofNullable(this.shouldScaleDownNonServiceTasks);
    }

    private OceanAutoscalerArgs() {}

    private OceanAutoscalerArgs(OceanAutoscalerArgs $) {
        this.autoHeadroomPercentage = $.autoHeadroomPercentage;
        this.cooldown = $.cooldown;
        this.down = $.down;
        this.enableAutomaticAndManualHeadroom = $.enableAutomaticAndManualHeadroom;
        this.headroom = $.headroom;
        this.isAutoConfig = $.isAutoConfig;
        this.isEnabled = $.isEnabled;
        this.resourceLimits = $.resourceLimits;
        this.shouldScaleDownNonServiceTasks = $.shouldScaleDownNonServiceTasks;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanAutoscalerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanAutoscalerArgs $;

        public Builder() {
            $ = new OceanAutoscalerArgs();
        }

        public Builder(OceanAutoscalerArgs defaults) {
            $ = new OceanAutoscalerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoHeadroomPercentage The auto-headroom percentage. Set a number between 0-200 to control the headroom % of the cluster. Relevant when `isAutoConfig`= true.
         * 
         * @return builder
         * 
         */
        public Builder autoHeadroomPercentage(@Nullable Output<Integer> autoHeadroomPercentage) {
            $.autoHeadroomPercentage = autoHeadroomPercentage;
            return this;
        }

        /**
         * @param autoHeadroomPercentage The auto-headroom percentage. Set a number between 0-200 to control the headroom % of the cluster. Relevant when `isAutoConfig`= true.
         * 
         * @return builder
         * 
         */
        public Builder autoHeadroomPercentage(Integer autoHeadroomPercentage) {
            return autoHeadroomPercentage(Output.of(autoHeadroomPercentage));
        }

        /**
         * @param cooldown Cooldown period between scaling actions.
         * 
         * @return builder
         * 
         */
        public Builder cooldown(@Nullable Output<Integer> cooldown) {
            $.cooldown = cooldown;
            return this;
        }

        /**
         * @param cooldown Cooldown period between scaling actions.
         * 
         * @return builder
         * 
         */
        public Builder cooldown(Integer cooldown) {
            return cooldown(Output.of(cooldown));
        }

        /**
         * @param down Auto Scaling scale down operations.
         * 
         * @return builder
         * 
         */
        public Builder down(@Nullable Output<OceanAutoscalerDownArgs> down) {
            $.down = down;
            return this;
        }

        /**
         * @param down Auto Scaling scale down operations.
         * 
         * @return builder
         * 
         */
        public Builder down(OceanAutoscalerDownArgs down) {
            return down(Output.of(down));
        }

        /**
         * @param enableAutomaticAndManualHeadroom When set to true, both automatic and per custom launch specification manual headroom to be saved concurrently and independently in the cluster. prerequisite: isAutoConfig must be true
         * 
         * &lt;!--Start PulumiCodeChooser --&gt;
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
         * &lt;!--End PulumiCodeChooser --&gt;
         * 
         * @return builder
         * 
         */
        public Builder enableAutomaticAndManualHeadroom(@Nullable Output<Boolean> enableAutomaticAndManualHeadroom) {
            $.enableAutomaticAndManualHeadroom = enableAutomaticAndManualHeadroom;
            return this;
        }

        /**
         * @param enableAutomaticAndManualHeadroom When set to true, both automatic and per custom launch specification manual headroom to be saved concurrently and independently in the cluster. prerequisite: isAutoConfig must be true
         * 
         * &lt;!--Start PulumiCodeChooser --&gt;
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
         * &lt;!--End PulumiCodeChooser --&gt;
         * 
         * @return builder
         * 
         */
        public Builder enableAutomaticAndManualHeadroom(Boolean enableAutomaticAndManualHeadroom) {
            return enableAutomaticAndManualHeadroom(Output.of(enableAutomaticAndManualHeadroom));
        }

        /**
         * @param headroom Spare resource capacity management enabling fast assignment of tasks without waiting for new resources to launch.
         * 
         * @return builder
         * 
         */
        public Builder headroom(@Nullable Output<OceanAutoscalerHeadroomArgs> headroom) {
            $.headroom = headroom;
            return this;
        }

        /**
         * @param headroom Spare resource capacity management enabling fast assignment of tasks without waiting for new resources to launch.
         * 
         * @return builder
         * 
         */
        public Builder headroom(OceanAutoscalerHeadroomArgs headroom) {
            return headroom(Output.of(headroom));
        }

        /**
         * @param isAutoConfig Automatically configure and optimize headroom resources.
         * 
         * @return builder
         * 
         */
        public Builder isAutoConfig(@Nullable Output<Boolean> isAutoConfig) {
            $.isAutoConfig = isAutoConfig;
            return this;
        }

        /**
         * @param isAutoConfig Automatically configure and optimize headroom resources.
         * 
         * @return builder
         * 
         */
        public Builder isAutoConfig(Boolean isAutoConfig) {
            return isAutoConfig(Output.of(isAutoConfig));
        }

        /**
         * @param isEnabled Enable the Ocean ECS autoscaler.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(@Nullable Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        /**
         * @param isEnabled Enable the Ocean ECS autoscaler.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        /**
         * @param resourceLimits Optionally set upper and lower bounds on the resource usage of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder resourceLimits(@Nullable Output<OceanAutoscalerResourceLimitsArgs> resourceLimits) {
            $.resourceLimits = resourceLimits;
            return this;
        }

        /**
         * @param resourceLimits Optionally set upper and lower bounds on the resource usage of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder resourceLimits(OceanAutoscalerResourceLimitsArgs resourceLimits) {
            return resourceLimits(Output.of(resourceLimits));
        }

        /**
         * @param shouldScaleDownNonServiceTasks Option to scale down non-service tasks. If not set, Ocean does not scale down standalone tasks.
         * 
         * @return builder
         * 
         */
        public Builder shouldScaleDownNonServiceTasks(@Nullable Output<Boolean> shouldScaleDownNonServiceTasks) {
            $.shouldScaleDownNonServiceTasks = shouldScaleDownNonServiceTasks;
            return this;
        }

        /**
         * @param shouldScaleDownNonServiceTasks Option to scale down non-service tasks. If not set, Ocean does not scale down standalone tasks.
         * 
         * @return builder
         * 
         */
        public Builder shouldScaleDownNonServiceTasks(Boolean shouldScaleDownNonServiceTasks) {
            return shouldScaleDownNonServiceTasks(Output.of(shouldScaleDownNonServiceTasks));
        }

        public OceanAutoscalerArgs build() {
            return $;
        }
    }

}
