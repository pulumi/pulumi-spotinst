// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MrScalarCoreScalingUpPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final MrScalarCoreScalingUpPolicyArgs Empty = new MrScalarCoreScalingUpPolicyArgs();

    @Import(name="actionType")
    private @Nullable Output<String> actionType;

    public Optional<Output<String>> actionType() {
        return Optional.ofNullable(this.actionType);
    }

    @Import(name="adjustment")
    private @Nullable Output<String> adjustment;

    public Optional<Output<String>> adjustment() {
        return Optional.ofNullable(this.adjustment);
    }

    @Import(name="cooldown")
    private @Nullable Output<Integer> cooldown;

    public Optional<Output<Integer>> cooldown() {
        return Optional.ofNullable(this.cooldown);
    }

    @Import(name="dimensions")
    private @Nullable Output<Map<String,Object>> dimensions;

    public Optional<Output<Map<String,Object>>> dimensions() {
        return Optional.ofNullable(this.dimensions);
    }

    @Import(name="evaluationPeriods")
    private @Nullable Output<Integer> evaluationPeriods;

    public Optional<Output<Integer>> evaluationPeriods() {
        return Optional.ofNullable(this.evaluationPeriods);
    }

    @Import(name="maxTargetCapacity")
    private @Nullable Output<String> maxTargetCapacity;

    public Optional<Output<String>> maxTargetCapacity() {
        return Optional.ofNullable(this.maxTargetCapacity);
    }

    @Import(name="maximum")
    private @Nullable Output<String> maximum;

    public Optional<Output<String>> maximum() {
        return Optional.ofNullable(this.maximum);
    }

    @Import(name="metricName", required=true)
    private Output<String> metricName;

    public Output<String> metricName() {
        return this.metricName;
    }

    @Import(name="minTargetCapacity")
    private @Nullable Output<String> minTargetCapacity;

    public Optional<Output<String>> minTargetCapacity() {
        return Optional.ofNullable(this.minTargetCapacity);
    }

    @Import(name="minimum")
    private @Nullable Output<String> minimum;

    public Optional<Output<String>> minimum() {
        return Optional.ofNullable(this.minimum);
    }

    @Import(name="namespace", required=true)
    private Output<String> namespace;

    public Output<String> namespace() {
        return this.namespace;
    }

    @Import(name="operator")
    private @Nullable Output<String> operator;

    public Optional<Output<String>> operator() {
        return Optional.ofNullable(this.operator);
    }

    @Import(name="period")
    private @Nullable Output<Integer> period;

    public Optional<Output<Integer>> period() {
        return Optional.ofNullable(this.period);
    }

    @Import(name="policyName", required=true)
    private Output<String> policyName;

    public Output<String> policyName() {
        return this.policyName;
    }

    @Import(name="statistic")
    private @Nullable Output<String> statistic;

    public Optional<Output<String>> statistic() {
        return Optional.ofNullable(this.statistic);
    }

    @Import(name="target")
    private @Nullable Output<String> target;

    public Optional<Output<String>> target() {
        return Optional.ofNullable(this.target);
    }

    @Import(name="threshold", required=true)
    private Output<Double> threshold;

    public Output<Double> threshold() {
        return this.threshold;
    }

    @Import(name="unit", required=true)
    private Output<String> unit;

    public Output<String> unit() {
        return this.unit;
    }

    private MrScalarCoreScalingUpPolicyArgs() {}

    private MrScalarCoreScalingUpPolicyArgs(MrScalarCoreScalingUpPolicyArgs $) {
        this.actionType = $.actionType;
        this.adjustment = $.adjustment;
        this.cooldown = $.cooldown;
        this.dimensions = $.dimensions;
        this.evaluationPeriods = $.evaluationPeriods;
        this.maxTargetCapacity = $.maxTargetCapacity;
        this.maximum = $.maximum;
        this.metricName = $.metricName;
        this.minTargetCapacity = $.minTargetCapacity;
        this.minimum = $.minimum;
        this.namespace = $.namespace;
        this.operator = $.operator;
        this.period = $.period;
        this.policyName = $.policyName;
        this.statistic = $.statistic;
        this.target = $.target;
        this.threshold = $.threshold;
        this.unit = $.unit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MrScalarCoreScalingUpPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MrScalarCoreScalingUpPolicyArgs $;

        public Builder() {
            $ = new MrScalarCoreScalingUpPolicyArgs();
        }

        public Builder(MrScalarCoreScalingUpPolicyArgs defaults) {
            $ = new MrScalarCoreScalingUpPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder actionType(@Nullable Output<String> actionType) {
            $.actionType = actionType;
            return this;
        }

        public Builder actionType(String actionType) {
            return actionType(Output.of(actionType));
        }

        public Builder adjustment(@Nullable Output<String> adjustment) {
            $.adjustment = adjustment;
            return this;
        }

        public Builder adjustment(String adjustment) {
            return adjustment(Output.of(adjustment));
        }

        public Builder cooldown(@Nullable Output<Integer> cooldown) {
            $.cooldown = cooldown;
            return this;
        }

        public Builder cooldown(Integer cooldown) {
            return cooldown(Output.of(cooldown));
        }

        public Builder dimensions(@Nullable Output<Map<String,Object>> dimensions) {
            $.dimensions = dimensions;
            return this;
        }

        public Builder dimensions(Map<String,Object> dimensions) {
            return dimensions(Output.of(dimensions));
        }

        public Builder evaluationPeriods(@Nullable Output<Integer> evaluationPeriods) {
            $.evaluationPeriods = evaluationPeriods;
            return this;
        }

        public Builder evaluationPeriods(Integer evaluationPeriods) {
            return evaluationPeriods(Output.of(evaluationPeriods));
        }

        public Builder maxTargetCapacity(@Nullable Output<String> maxTargetCapacity) {
            $.maxTargetCapacity = maxTargetCapacity;
            return this;
        }

        public Builder maxTargetCapacity(String maxTargetCapacity) {
            return maxTargetCapacity(Output.of(maxTargetCapacity));
        }

        public Builder maximum(@Nullable Output<String> maximum) {
            $.maximum = maximum;
            return this;
        }

        public Builder maximum(String maximum) {
            return maximum(Output.of(maximum));
        }

        public Builder metricName(Output<String> metricName) {
            $.metricName = metricName;
            return this;
        }

        public Builder metricName(String metricName) {
            return metricName(Output.of(metricName));
        }

        public Builder minTargetCapacity(@Nullable Output<String> minTargetCapacity) {
            $.minTargetCapacity = minTargetCapacity;
            return this;
        }

        public Builder minTargetCapacity(String minTargetCapacity) {
            return minTargetCapacity(Output.of(minTargetCapacity));
        }

        public Builder minimum(@Nullable Output<String> minimum) {
            $.minimum = minimum;
            return this;
        }

        public Builder minimum(String minimum) {
            return minimum(Output.of(minimum));
        }

        public Builder namespace(Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        public Builder operator(@Nullable Output<String> operator) {
            $.operator = operator;
            return this;
        }

        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        public Builder period(@Nullable Output<Integer> period) {
            $.period = period;
            return this;
        }

        public Builder period(Integer period) {
            return period(Output.of(period));
        }

        public Builder policyName(Output<String> policyName) {
            $.policyName = policyName;
            return this;
        }

        public Builder policyName(String policyName) {
            return policyName(Output.of(policyName));
        }

        public Builder statistic(@Nullable Output<String> statistic) {
            $.statistic = statistic;
            return this;
        }

        public Builder statistic(String statistic) {
            return statistic(Output.of(statistic));
        }

        public Builder target(@Nullable Output<String> target) {
            $.target = target;
            return this;
        }

        public Builder target(String target) {
            return target(Output.of(target));
        }

        public Builder threshold(Output<Double> threshold) {
            $.threshold = threshold;
            return this;
        }

        public Builder threshold(Double threshold) {
            return threshold(Output.of(threshold));
        }

        public Builder unit(Output<String> unit) {
            $.unit = unit;
            return this;
        }

        public Builder unit(String unit) {
            return unit(Output.of(unit));
        }

        public MrScalarCoreScalingUpPolicyArgs build() {
            if ($.metricName == null) {
                throw new MissingRequiredPropertyException("MrScalarCoreScalingUpPolicyArgs", "metricName");
            }
            if ($.namespace == null) {
                throw new MissingRequiredPropertyException("MrScalarCoreScalingUpPolicyArgs", "namespace");
            }
            if ($.policyName == null) {
                throw new MissingRequiredPropertyException("MrScalarCoreScalingUpPolicyArgs", "policyName");
            }
            if ($.threshold == null) {
                throw new MissingRequiredPropertyException("MrScalarCoreScalingUpPolicyArgs", "threshold");
            }
            if ($.unit == null) {
                throw new MissingRequiredPropertyException("MrScalarCoreScalingUpPolicyArgs", "unit");
            }
            return $;
        }
    }

}