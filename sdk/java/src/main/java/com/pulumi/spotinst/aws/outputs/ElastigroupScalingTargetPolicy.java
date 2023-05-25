// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.spotinst.aws.outputs.ElastigroupScalingTargetPolicyDimension;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupScalingTargetPolicy {
    /**
     * @return Integer the amount of time, in seconds, after a scaling activity completes and before the next scaling activity can start. If this parameter is not specified, the default cooldown period for the group applies.
     * 
     */
    private @Nullable Integer cooldown;
    /**
     * @return A list of dimensions describing qualities of the metric.
     * 
     */
    private @Nullable List<ElastigroupScalingTargetPolicyDimension> dimensions;
    /**
     * @return The number of periods over which data is compared to the specified threshold.
     * 
     */
    private @Nullable Integer evaluationPeriods;
    /**
     * @return String, restrict the maximal number of instances which can be added in each scale-up action.
     * 
     * `scaling_target_policies` support predictive scaling:
     * 
     */
    private @Nullable String maxCapacityPerScale;
    /**
     * @return String, the name of the metric, with or without spaces.
     * 
     */
    private String metricName;
    /**
     * @return String, the namespace for the alarm&#39;s associated metric.
     * 
     */
    private String namespace;
    /**
     * @return The granularity, in seconds, of the returned datapoints. Period must be at least 60 seconds and must be a multiple of 60.
     * 
     */
    private @Nullable Integer period;
    /**
     * @return String, the name of the policy.
     * 
     */
    private String policyName;
    /**
     * @return Start a metric prediction process to determine the expected target metric value within the next two days. See [Predictive Autoscaling](https://api.spotinst.com/elastigroup-for-aws/concepts/scaling-concepts/predictive-autoscaling/) documentation for more info. Valid values: `FORECAST_AND_SCALE`, `FORECAST_ONLY`.
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
    private @Nullable String predictiveMode;
    /**
     * @return String, the source of the metric. Valid values: `&#34;cloudWatch&#34;`, `&#34;spectrum&#34;`.
     * 
     */
    private @Nullable String source;
    /**
     * @return String, the metric statistics to return. For information about specific statistics go to [Statistics](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/index.html?CHAP_TerminologyandKeyConcepts.html#Statistic) in the Amazon CloudWatch Developer Guide.
     * 
     */
    private @Nullable String statistic;
    /**
     * @return The target number of instances to have in the group.
     * 
     */
    private Double target;
    /**
     * @return String, tThe unit for the alarm&#39;s associated metric. Valid values: `&#34;percent`, `&#34;seconds&#34;`, `&#34;microseconds&#34;`, `&#34;milliseconds&#34;`, `&#34;bytes&#34;`, `&#34;kilobytes&#34;`, `&#34;megabytes&#34;`, `&#34;gigabytes&#34;`, `&#34;terabytes&#34;`, `&#34;bits&#34;`, `&#34;kilobits&#34;`, `&#34;megabits&#34;`, `&#34;gigabits&#34;`, `&#34;terabits&#34;`, `&#34;count&#34;`, `&#34;bytes/second&#34;`, `&#34;kilobytes/second&#34;`, `&#34;megabytes/second&#34;`, `&#34;gigabytes/second&#34;`, `&#34;terabytes/second&#34;`, `&#34;bits/second&#34;`, `&#34;kilobits/second&#34;`, `&#34;megabits/second&#34;`, `&#34;gigabits/second&#34;`, `&#34;terabits/second&#34;`, `&#34;count/second&#34;`, `&#34;none&#34;`.
     * 
     */
    private @Nullable String unit;

    private ElastigroupScalingTargetPolicy() {}
    /**
     * @return Integer the amount of time, in seconds, after a scaling activity completes and before the next scaling activity can start. If this parameter is not specified, the default cooldown period for the group applies.
     * 
     */
    public Optional<Integer> cooldown() {
        return Optional.ofNullable(this.cooldown);
    }
    /**
     * @return A list of dimensions describing qualities of the metric.
     * 
     */
    public List<ElastigroupScalingTargetPolicyDimension> dimensions() {
        return this.dimensions == null ? List.of() : this.dimensions;
    }
    /**
     * @return The number of periods over which data is compared to the specified threshold.
     * 
     */
    public Optional<Integer> evaluationPeriods() {
        return Optional.ofNullable(this.evaluationPeriods);
    }
    /**
     * @return String, restrict the maximal number of instances which can be added in each scale-up action.
     * 
     * `scaling_target_policies` support predictive scaling:
     * 
     */
    public Optional<String> maxCapacityPerScale() {
        return Optional.ofNullable(this.maxCapacityPerScale);
    }
    /**
     * @return String, the name of the metric, with or without spaces.
     * 
     */
    public String metricName() {
        return this.metricName;
    }
    /**
     * @return String, the namespace for the alarm&#39;s associated metric.
     * 
     */
    public String namespace() {
        return this.namespace;
    }
    /**
     * @return The granularity, in seconds, of the returned datapoints. Period must be at least 60 seconds and must be a multiple of 60.
     * 
     */
    public Optional<Integer> period() {
        return Optional.ofNullable(this.period);
    }
    /**
     * @return String, the name of the policy.
     * 
     */
    public String policyName() {
        return this.policyName;
    }
    /**
     * @return Start a metric prediction process to determine the expected target metric value within the next two days. See [Predictive Autoscaling](https://api.spotinst.com/elastigroup-for-aws/concepts/scaling-concepts/predictive-autoscaling/) documentation for more info. Valid values: `FORECAST_AND_SCALE`, `FORECAST_ONLY`.
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
    public Optional<String> predictiveMode() {
        return Optional.ofNullable(this.predictiveMode);
    }
    /**
     * @return String, the source of the metric. Valid values: `&#34;cloudWatch&#34;`, `&#34;spectrum&#34;`.
     * 
     */
    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }
    /**
     * @return String, the metric statistics to return. For information about specific statistics go to [Statistics](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/index.html?CHAP_TerminologyandKeyConcepts.html#Statistic) in the Amazon CloudWatch Developer Guide.
     * 
     */
    public Optional<String> statistic() {
        return Optional.ofNullable(this.statistic);
    }
    /**
     * @return The target number of instances to have in the group.
     * 
     */
    public Double target() {
        return this.target;
    }
    /**
     * @return String, tThe unit for the alarm&#39;s associated metric. Valid values: `&#34;percent`, `&#34;seconds&#34;`, `&#34;microseconds&#34;`, `&#34;milliseconds&#34;`, `&#34;bytes&#34;`, `&#34;kilobytes&#34;`, `&#34;megabytes&#34;`, `&#34;gigabytes&#34;`, `&#34;terabytes&#34;`, `&#34;bits&#34;`, `&#34;kilobits&#34;`, `&#34;megabits&#34;`, `&#34;gigabits&#34;`, `&#34;terabits&#34;`, `&#34;count&#34;`, `&#34;bytes/second&#34;`, `&#34;kilobytes/second&#34;`, `&#34;megabytes/second&#34;`, `&#34;gigabytes/second&#34;`, `&#34;terabytes/second&#34;`, `&#34;bits/second&#34;`, `&#34;kilobits/second&#34;`, `&#34;megabits/second&#34;`, `&#34;gigabits/second&#34;`, `&#34;terabits/second&#34;`, `&#34;count/second&#34;`, `&#34;none&#34;`.
     * 
     */
    public Optional<String> unit() {
        return Optional.ofNullable(this.unit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupScalingTargetPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer cooldown;
        private @Nullable List<ElastigroupScalingTargetPolicyDimension> dimensions;
        private @Nullable Integer evaluationPeriods;
        private @Nullable String maxCapacityPerScale;
        private String metricName;
        private String namespace;
        private @Nullable Integer period;
        private String policyName;
        private @Nullable String predictiveMode;
        private @Nullable String source;
        private @Nullable String statistic;
        private Double target;
        private @Nullable String unit;
        public Builder() {}
        public Builder(ElastigroupScalingTargetPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cooldown = defaults.cooldown;
    	      this.dimensions = defaults.dimensions;
    	      this.evaluationPeriods = defaults.evaluationPeriods;
    	      this.maxCapacityPerScale = defaults.maxCapacityPerScale;
    	      this.metricName = defaults.metricName;
    	      this.namespace = defaults.namespace;
    	      this.period = defaults.period;
    	      this.policyName = defaults.policyName;
    	      this.predictiveMode = defaults.predictiveMode;
    	      this.source = defaults.source;
    	      this.statistic = defaults.statistic;
    	      this.target = defaults.target;
    	      this.unit = defaults.unit;
        }

        @CustomType.Setter
        public Builder cooldown(@Nullable Integer cooldown) {
            this.cooldown = cooldown;
            return this;
        }
        @CustomType.Setter
        public Builder dimensions(@Nullable List<ElastigroupScalingTargetPolicyDimension> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public Builder dimensions(ElastigroupScalingTargetPolicyDimension... dimensions) {
            return dimensions(List.of(dimensions));
        }
        @CustomType.Setter
        public Builder evaluationPeriods(@Nullable Integer evaluationPeriods) {
            this.evaluationPeriods = evaluationPeriods;
            return this;
        }
        @CustomType.Setter
        public Builder maxCapacityPerScale(@Nullable String maxCapacityPerScale) {
            this.maxCapacityPerScale = maxCapacityPerScale;
            return this;
        }
        @CustomType.Setter
        public Builder metricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }
        @CustomType.Setter
        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        @CustomType.Setter
        public Builder period(@Nullable Integer period) {
            this.period = period;
            return this;
        }
        @CustomType.Setter
        public Builder policyName(String policyName) {
            this.policyName = Objects.requireNonNull(policyName);
            return this;
        }
        @CustomType.Setter
        public Builder predictiveMode(@Nullable String predictiveMode) {
            this.predictiveMode = predictiveMode;
            return this;
        }
        @CustomType.Setter
        public Builder source(@Nullable String source) {
            this.source = source;
            return this;
        }
        @CustomType.Setter
        public Builder statistic(@Nullable String statistic) {
            this.statistic = statistic;
            return this;
        }
        @CustomType.Setter
        public Builder target(Double target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        @CustomType.Setter
        public Builder unit(@Nullable String unit) {
            this.unit = unit;
            return this;
        }
        public ElastigroupScalingTargetPolicy build() {
            final var o = new ElastigroupScalingTargetPolicy();
            o.cooldown = cooldown;
            o.dimensions = dimensions;
            o.evaluationPeriods = evaluationPeriods;
            o.maxCapacityPerScale = maxCapacityPerScale;
            o.metricName = metricName;
            o.namespace = namespace;
            o.period = period;
            o.policyName = policyName;
            o.predictiveMode = predictiveMode;
            o.source = source;
            o.statistic = statistic;
            o.target = target;
            o.unit = unit;
            return o;
        }
    }
}
