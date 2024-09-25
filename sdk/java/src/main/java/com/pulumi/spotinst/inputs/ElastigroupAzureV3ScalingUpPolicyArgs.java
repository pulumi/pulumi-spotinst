// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.inputs.ElastigroupAzureV3ScalingUpPolicyActionArgs;
import com.pulumi.spotinst.inputs.ElastigroupAzureV3ScalingUpPolicyDimensionArgs;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupAzureV3ScalingUpPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupAzureV3ScalingUpPolicyArgs Empty = new ElastigroupAzureV3ScalingUpPolicyArgs();

    @Import(name="action", required=true)
    private Output<ElastigroupAzureV3ScalingUpPolicyActionArgs> action;

    public Output<ElastigroupAzureV3ScalingUpPolicyActionArgs> action() {
        return this.action;
    }

    @Import(name="cooldown", required=true)
    private Output<Integer> cooldown;

    public Output<Integer> cooldown() {
        return this.cooldown;
    }

    @Import(name="dimensions")
    private @Nullable Output<List<ElastigroupAzureV3ScalingUpPolicyDimensionArgs>> dimensions;

    public Optional<Output<List<ElastigroupAzureV3ScalingUpPolicyDimensionArgs>>> dimensions() {
        return Optional.ofNullable(this.dimensions);
    }

    @Import(name="evaluationPeriods", required=true)
    private Output<Integer> evaluationPeriods;

    public Output<Integer> evaluationPeriods() {
        return this.evaluationPeriods;
    }

    @Import(name="isEnabled")
    private @Nullable Output<Boolean> isEnabled;

    public Optional<Output<Boolean>> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }

    @Import(name="metricName", required=true)
    private Output<String> metricName;

    public Output<String> metricName() {
        return this.metricName;
    }

    @Import(name="namespace", required=true)
    private Output<String> namespace;

    public Output<String> namespace() {
        return this.namespace;
    }

    @Import(name="operator", required=true)
    private Output<String> operator;

    public Output<String> operator() {
        return this.operator;
    }

    @Import(name="period", required=true)
    private Output<Integer> period;

    public Output<Integer> period() {
        return this.period;
    }

    @Import(name="policyName", required=true)
    private Output<String> policyName;

    public Output<String> policyName() {
        return this.policyName;
    }

    @Import(name="source")
    private @Nullable Output<String> source;

    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    @Import(name="statistic", required=true)
    private Output<String> statistic;

    public Output<String> statistic() {
        return this.statistic;
    }

    @Import(name="threshold", required=true)
    private Output<Double> threshold;

    public Output<Double> threshold() {
        return this.threshold;
    }

    @Import(name="unit")
    private @Nullable Output<String> unit;

    public Optional<Output<String>> unit() {
        return Optional.ofNullable(this.unit);
    }

    private ElastigroupAzureV3ScalingUpPolicyArgs() {}

    private ElastigroupAzureV3ScalingUpPolicyArgs(ElastigroupAzureV3ScalingUpPolicyArgs $) {
        this.action = $.action;
        this.cooldown = $.cooldown;
        this.dimensions = $.dimensions;
        this.evaluationPeriods = $.evaluationPeriods;
        this.isEnabled = $.isEnabled;
        this.metricName = $.metricName;
        this.namespace = $.namespace;
        this.operator = $.operator;
        this.period = $.period;
        this.policyName = $.policyName;
        this.source = $.source;
        this.statistic = $.statistic;
        this.threshold = $.threshold;
        this.unit = $.unit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupAzureV3ScalingUpPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupAzureV3ScalingUpPolicyArgs $;

        public Builder() {
            $ = new ElastigroupAzureV3ScalingUpPolicyArgs();
        }

        public Builder(ElastigroupAzureV3ScalingUpPolicyArgs defaults) {
            $ = new ElastigroupAzureV3ScalingUpPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder action(Output<ElastigroupAzureV3ScalingUpPolicyActionArgs> action) {
            $.action = action;
            return this;
        }

        public Builder action(ElastigroupAzureV3ScalingUpPolicyActionArgs action) {
            return action(Output.of(action));
        }

        public Builder cooldown(Output<Integer> cooldown) {
            $.cooldown = cooldown;
            return this;
        }

        public Builder cooldown(Integer cooldown) {
            return cooldown(Output.of(cooldown));
        }

        public Builder dimensions(@Nullable Output<List<ElastigroupAzureV3ScalingUpPolicyDimensionArgs>> dimensions) {
            $.dimensions = dimensions;
            return this;
        }

        public Builder dimensions(List<ElastigroupAzureV3ScalingUpPolicyDimensionArgs> dimensions) {
            return dimensions(Output.of(dimensions));
        }

        public Builder dimensions(ElastigroupAzureV3ScalingUpPolicyDimensionArgs... dimensions) {
            return dimensions(List.of(dimensions));
        }

        public Builder evaluationPeriods(Output<Integer> evaluationPeriods) {
            $.evaluationPeriods = evaluationPeriods;
            return this;
        }

        public Builder evaluationPeriods(Integer evaluationPeriods) {
            return evaluationPeriods(Output.of(evaluationPeriods));
        }

        public Builder isEnabled(@Nullable Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        public Builder metricName(Output<String> metricName) {
            $.metricName = metricName;
            return this;
        }

        public Builder metricName(String metricName) {
            return metricName(Output.of(metricName));
        }

        public Builder namespace(Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        public Builder operator(Output<String> operator) {
            $.operator = operator;
            return this;
        }

        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        public Builder period(Output<Integer> period) {
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

        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        public Builder source(String source) {
            return source(Output.of(source));
        }

        public Builder statistic(Output<String> statistic) {
            $.statistic = statistic;
            return this;
        }

        public Builder statistic(String statistic) {
            return statistic(Output.of(statistic));
        }

        public Builder threshold(Output<Double> threshold) {
            $.threshold = threshold;
            return this;
        }

        public Builder threshold(Double threshold) {
            return threshold(Output.of(threshold));
        }

        public Builder unit(@Nullable Output<String> unit) {
            $.unit = unit;
            return this;
        }

        public Builder unit(String unit) {
            return unit(Output.of(unit));
        }

        public ElastigroupAzureV3ScalingUpPolicyArgs build() {
            if ($.action == null) {
                throw new MissingRequiredPropertyException("ElastigroupAzureV3ScalingUpPolicyArgs", "action");
            }
            if ($.cooldown == null) {
                throw new MissingRequiredPropertyException("ElastigroupAzureV3ScalingUpPolicyArgs", "cooldown");
            }
            if ($.evaluationPeriods == null) {
                throw new MissingRequiredPropertyException("ElastigroupAzureV3ScalingUpPolicyArgs", "evaluationPeriods");
            }
            if ($.metricName == null) {
                throw new MissingRequiredPropertyException("ElastigroupAzureV3ScalingUpPolicyArgs", "metricName");
            }
            if ($.namespace == null) {
                throw new MissingRequiredPropertyException("ElastigroupAzureV3ScalingUpPolicyArgs", "namespace");
            }
            if ($.operator == null) {
                throw new MissingRequiredPropertyException("ElastigroupAzureV3ScalingUpPolicyArgs", "operator");
            }
            if ($.period == null) {
                throw new MissingRequiredPropertyException("ElastigroupAzureV3ScalingUpPolicyArgs", "period");
            }
            if ($.policyName == null) {
                throw new MissingRequiredPropertyException("ElastigroupAzureV3ScalingUpPolicyArgs", "policyName");
            }
            if ($.statistic == null) {
                throw new MissingRequiredPropertyException("ElastigroupAzureV3ScalingUpPolicyArgs", "statistic");
            }
            if ($.threshold == null) {
                throw new MissingRequiredPropertyException("ElastigroupAzureV3ScalingUpPolicyArgs", "threshold");
            }
            return $;
        }
    }

}
