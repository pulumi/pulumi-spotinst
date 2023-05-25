// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupIntegrationDockerSwarmAutoscaleDownArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupIntegrationDockerSwarmAutoscaleDownArgs Empty = new ElastigroupIntegrationDockerSwarmAutoscaleDownArgs();

    /**
     * The number of periods over which data is compared to the specified threshold.
     * 
     */
    @Import(name="evaluationPeriods")
    private @Nullable Output<Integer> evaluationPeriods;

    /**
     * @return The number of periods over which data is compared to the specified threshold.
     * 
     */
    public Optional<Output<Integer>> evaluationPeriods() {
        return Optional.ofNullable(this.evaluationPeriods);
    }

    /**
     * Represents the maximum percent to scale-down. Number between 1-100.
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
    @Import(name="maxScaleDownPercentage")
    private @Nullable Output<Double> maxScaleDownPercentage;

    /**
     * @return Represents the maximum percent to scale-down. Number between 1-100.
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
    public Optional<Output<Double>> maxScaleDownPercentage() {
        return Optional.ofNullable(this.maxScaleDownPercentage);
    }

    private ElastigroupIntegrationDockerSwarmAutoscaleDownArgs() {}

    private ElastigroupIntegrationDockerSwarmAutoscaleDownArgs(ElastigroupIntegrationDockerSwarmAutoscaleDownArgs $) {
        this.evaluationPeriods = $.evaluationPeriods;
        this.maxScaleDownPercentage = $.maxScaleDownPercentage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupIntegrationDockerSwarmAutoscaleDownArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupIntegrationDockerSwarmAutoscaleDownArgs $;

        public Builder() {
            $ = new ElastigroupIntegrationDockerSwarmAutoscaleDownArgs();
        }

        public Builder(ElastigroupIntegrationDockerSwarmAutoscaleDownArgs defaults) {
            $ = new ElastigroupIntegrationDockerSwarmAutoscaleDownArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param evaluationPeriods The number of periods over which data is compared to the specified threshold.
         * 
         * @return builder
         * 
         */
        public Builder evaluationPeriods(@Nullable Output<Integer> evaluationPeriods) {
            $.evaluationPeriods = evaluationPeriods;
            return this;
        }

        /**
         * @param evaluationPeriods The number of periods over which data is compared to the specified threshold.
         * 
         * @return builder
         * 
         */
        public Builder evaluationPeriods(Integer evaluationPeriods) {
            return evaluationPeriods(Output.of(evaluationPeriods));
        }

        /**
         * @param maxScaleDownPercentage Represents the maximum percent to scale-down. Number between 1-100.
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
        public Builder maxScaleDownPercentage(@Nullable Output<Double> maxScaleDownPercentage) {
            $.maxScaleDownPercentage = maxScaleDownPercentage;
            return this;
        }

        /**
         * @param maxScaleDownPercentage Represents the maximum percent to scale-down. Number between 1-100.
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
        public Builder maxScaleDownPercentage(Double maxScaleDownPercentage) {
            return maxScaleDownPercentage(Output.of(maxScaleDownPercentage));
        }

        public ElastigroupIntegrationDockerSwarmAutoscaleDownArgs build() {
            return $;
        }
    }

}
