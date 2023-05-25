// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.aws.inputs.OceanAutoscalerAutoscaleDownArgs;
import com.pulumi.spotinst.aws.inputs.OceanAutoscalerAutoscaleHeadroomArgs;
import com.pulumi.spotinst.aws.inputs.OceanAutoscalerResourceLimitsArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanAutoscalerArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanAutoscalerArgs Empty = new OceanAutoscalerArgs();

    /**
     * Set the auto headroom percentage (a number in the range [0, 200]) which controls the percentage of headroom from the cluster. Relevant only when `autoscale_is_auto_config` toggled on.
     * 
     */
    @Import(name="autoHeadroomPercentage")
    private @Nullable Output<Integer> autoHeadroomPercentage;

    /**
     * @return Set the auto headroom percentage (a number in the range [0, 200]) which controls the percentage of headroom from the cluster. Relevant only when `autoscale_is_auto_config` toggled on.
     * 
     */
    public Optional<Output<Integer>> autoHeadroomPercentage() {
        return Optional.ofNullable(this.autoHeadroomPercentage);
    }

    /**
     * Cooldown period between scaling actions.
     * 
     */
    @Import(name="autoscaleCooldown")
    private @Nullable Output<Integer> autoscaleCooldown;

    /**
     * @return Cooldown period between scaling actions.
     * 
     */
    public Optional<Output<Integer>> autoscaleCooldown() {
        return Optional.ofNullable(this.autoscaleCooldown);
    }

    /**
     * Auto Scaling scale down operations.
     * 
     */
    @Import(name="autoscaleDown")
    private @Nullable Output<OceanAutoscalerAutoscaleDownArgs> autoscaleDown;

    /**
     * @return Auto Scaling scale down operations.
     * 
     */
    public Optional<Output<OceanAutoscalerAutoscaleDownArgs>> autoscaleDown() {
        return Optional.ofNullable(this.autoscaleDown);
    }

    /**
     * Spare resource capacity management enabling fast assignment of Pods without waiting for new resources to launch.
     * 
     */
    @Import(name="autoscaleHeadroom")
    private @Nullable Output<OceanAutoscalerAutoscaleHeadroomArgs> autoscaleHeadroom;

    /**
     * @return Spare resource capacity management enabling fast assignment of Pods without waiting for new resources to launch.
     * 
     */
    public Optional<Output<OceanAutoscalerAutoscaleHeadroomArgs>> autoscaleHeadroom() {
        return Optional.ofNullable(this.autoscaleHeadroom);
    }

    /**
     * Automatically configure and optimize headroom resources.
     * 
     */
    @Import(name="autoscaleIsAutoConfig")
    private @Nullable Output<Boolean> autoscaleIsAutoConfig;

    /**
     * @return Automatically configure and optimize headroom resources.
     * 
     */
    public Optional<Output<Boolean>> autoscaleIsAutoConfig() {
        return Optional.ofNullable(this.autoscaleIsAutoConfig);
    }

    /**
     * Enable the Ocean Kubernetes Auto Scaler.
     * 
     */
    @Import(name="autoscaleIsEnabled")
    private @Nullable Output<Boolean> autoscaleIsEnabled;

    /**
     * @return Enable the Ocean Kubernetes Auto Scaler.
     * 
     */
    public Optional<Output<Boolean>> autoscaleIsEnabled() {
        return Optional.ofNullable(this.autoscaleIsEnabled);
    }

    /**
     * enables automatic and manual headroom to work in parallel. When set to false, automatic headroom overrides all other headroom definitions manually configured, whether they are at cluster or VNG level.
     * 
     */
    @Import(name="enableAutomaticAndManualHeadroom")
    private @Nullable Output<Boolean> enableAutomaticAndManualHeadroom;

    /**
     * @return enables automatic and manual headroom to work in parallel. When set to false, automatic headroom overrides all other headroom definitions manually configured, whether they are at cluster or VNG level.
     * 
     */
    public Optional<Output<Boolean>> enableAutomaticAndManualHeadroom() {
        return Optional.ofNullable(this.enableAutomaticAndManualHeadroom);
    }

    /**
     * List of Ocean extended resource definitions to use in this cluster.
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
    @Import(name="extendedResourceDefinitions")
    private @Nullable Output<List<String>> extendedResourceDefinitions;

    /**
     * @return List of Ocean extended resource definitions to use in this cluster.
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
    public Optional<Output<List<String>>> extendedResourceDefinitions() {
        return Optional.ofNullable(this.extendedResourceDefinitions);
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

    private OceanAutoscalerArgs() {}

    private OceanAutoscalerArgs(OceanAutoscalerArgs $) {
        this.autoHeadroomPercentage = $.autoHeadroomPercentage;
        this.autoscaleCooldown = $.autoscaleCooldown;
        this.autoscaleDown = $.autoscaleDown;
        this.autoscaleHeadroom = $.autoscaleHeadroom;
        this.autoscaleIsAutoConfig = $.autoscaleIsAutoConfig;
        this.autoscaleIsEnabled = $.autoscaleIsEnabled;
        this.enableAutomaticAndManualHeadroom = $.enableAutomaticAndManualHeadroom;
        this.extendedResourceDefinitions = $.extendedResourceDefinitions;
        this.resourceLimits = $.resourceLimits;
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
         * @param autoHeadroomPercentage Set the auto headroom percentage (a number in the range [0, 200]) which controls the percentage of headroom from the cluster. Relevant only when `autoscale_is_auto_config` toggled on.
         * 
         * @return builder
         * 
         */
        public Builder autoHeadroomPercentage(@Nullable Output<Integer> autoHeadroomPercentage) {
            $.autoHeadroomPercentage = autoHeadroomPercentage;
            return this;
        }

        /**
         * @param autoHeadroomPercentage Set the auto headroom percentage (a number in the range [0, 200]) which controls the percentage of headroom from the cluster. Relevant only when `autoscale_is_auto_config` toggled on.
         * 
         * @return builder
         * 
         */
        public Builder autoHeadroomPercentage(Integer autoHeadroomPercentage) {
            return autoHeadroomPercentage(Output.of(autoHeadroomPercentage));
        }

        /**
         * @param autoscaleCooldown Cooldown period between scaling actions.
         * 
         * @return builder
         * 
         */
        public Builder autoscaleCooldown(@Nullable Output<Integer> autoscaleCooldown) {
            $.autoscaleCooldown = autoscaleCooldown;
            return this;
        }

        /**
         * @param autoscaleCooldown Cooldown period between scaling actions.
         * 
         * @return builder
         * 
         */
        public Builder autoscaleCooldown(Integer autoscaleCooldown) {
            return autoscaleCooldown(Output.of(autoscaleCooldown));
        }

        /**
         * @param autoscaleDown Auto Scaling scale down operations.
         * 
         * @return builder
         * 
         */
        public Builder autoscaleDown(@Nullable Output<OceanAutoscalerAutoscaleDownArgs> autoscaleDown) {
            $.autoscaleDown = autoscaleDown;
            return this;
        }

        /**
         * @param autoscaleDown Auto Scaling scale down operations.
         * 
         * @return builder
         * 
         */
        public Builder autoscaleDown(OceanAutoscalerAutoscaleDownArgs autoscaleDown) {
            return autoscaleDown(Output.of(autoscaleDown));
        }

        /**
         * @param autoscaleHeadroom Spare resource capacity management enabling fast assignment of Pods without waiting for new resources to launch.
         * 
         * @return builder
         * 
         */
        public Builder autoscaleHeadroom(@Nullable Output<OceanAutoscalerAutoscaleHeadroomArgs> autoscaleHeadroom) {
            $.autoscaleHeadroom = autoscaleHeadroom;
            return this;
        }

        /**
         * @param autoscaleHeadroom Spare resource capacity management enabling fast assignment of Pods without waiting for new resources to launch.
         * 
         * @return builder
         * 
         */
        public Builder autoscaleHeadroom(OceanAutoscalerAutoscaleHeadroomArgs autoscaleHeadroom) {
            return autoscaleHeadroom(Output.of(autoscaleHeadroom));
        }

        /**
         * @param autoscaleIsAutoConfig Automatically configure and optimize headroom resources.
         * 
         * @return builder
         * 
         */
        public Builder autoscaleIsAutoConfig(@Nullable Output<Boolean> autoscaleIsAutoConfig) {
            $.autoscaleIsAutoConfig = autoscaleIsAutoConfig;
            return this;
        }

        /**
         * @param autoscaleIsAutoConfig Automatically configure and optimize headroom resources.
         * 
         * @return builder
         * 
         */
        public Builder autoscaleIsAutoConfig(Boolean autoscaleIsAutoConfig) {
            return autoscaleIsAutoConfig(Output.of(autoscaleIsAutoConfig));
        }

        /**
         * @param autoscaleIsEnabled Enable the Ocean Kubernetes Auto Scaler.
         * 
         * @return builder
         * 
         */
        public Builder autoscaleIsEnabled(@Nullable Output<Boolean> autoscaleIsEnabled) {
            $.autoscaleIsEnabled = autoscaleIsEnabled;
            return this;
        }

        /**
         * @param autoscaleIsEnabled Enable the Ocean Kubernetes Auto Scaler.
         * 
         * @return builder
         * 
         */
        public Builder autoscaleIsEnabled(Boolean autoscaleIsEnabled) {
            return autoscaleIsEnabled(Output.of(autoscaleIsEnabled));
        }

        /**
         * @param enableAutomaticAndManualHeadroom enables automatic and manual headroom to work in parallel. When set to false, automatic headroom overrides all other headroom definitions manually configured, whether they are at cluster or VNG level.
         * 
         * @return builder
         * 
         */
        public Builder enableAutomaticAndManualHeadroom(@Nullable Output<Boolean> enableAutomaticAndManualHeadroom) {
            $.enableAutomaticAndManualHeadroom = enableAutomaticAndManualHeadroom;
            return this;
        }

        /**
         * @param enableAutomaticAndManualHeadroom enables automatic and manual headroom to work in parallel. When set to false, automatic headroom overrides all other headroom definitions manually configured, whether they are at cluster or VNG level.
         * 
         * @return builder
         * 
         */
        public Builder enableAutomaticAndManualHeadroom(Boolean enableAutomaticAndManualHeadroom) {
            return enableAutomaticAndManualHeadroom(Output.of(enableAutomaticAndManualHeadroom));
        }

        /**
         * @param extendedResourceDefinitions List of Ocean extended resource definitions to use in this cluster.
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
        public Builder extendedResourceDefinitions(@Nullable Output<List<String>> extendedResourceDefinitions) {
            $.extendedResourceDefinitions = extendedResourceDefinitions;
            return this;
        }

        /**
         * @param extendedResourceDefinitions List of Ocean extended resource definitions to use in this cluster.
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
        public Builder extendedResourceDefinitions(List<String> extendedResourceDefinitions) {
            return extendedResourceDefinitions(Output.of(extendedResourceDefinitions));
        }

        /**
         * @param extendedResourceDefinitions List of Ocean extended resource definitions to use in this cluster.
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
        public Builder extendedResourceDefinitions(String... extendedResourceDefinitions) {
            return extendedResourceDefinitions(List.of(extendedResourceDefinitions));
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

        public OceanAutoscalerArgs build() {
            return $;
        }
    }

}
