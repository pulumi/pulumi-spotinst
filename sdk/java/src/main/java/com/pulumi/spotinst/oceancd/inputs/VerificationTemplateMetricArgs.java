// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.oceancd.inputs.VerificationTemplateMetricBaselineArgs;
import com.pulumi.spotinst.oceancd.inputs.VerificationTemplateMetricProviderArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VerificationTemplateMetricArgs extends com.pulumi.resources.ResourceArgs {

    public static final VerificationTemplateMetricArgs Empty = new VerificationTemplateMetricArgs();

    /**
     * Baseline Object.
     * 
     */
    @Import(name="baseline")
    private @Nullable Output<VerificationTemplateMetricBaselineArgs> baseline;

    /**
     * @return Baseline Object.
     * 
     */
    public Optional<Output<VerificationTemplateMetricBaselineArgs>> baseline() {
        return Optional.ofNullable(this.baseline);
    }

    /**
     * The maximum number of times the measurement is allowed to error in succession, before the metric is considered error.Default is 4.When choosing `Jenkins` as the provider, there is no need to send this variable.
     * 
     */
    @Import(name="consecutiveErrorLimit")
    private @Nullable Output<Integer> consecutiveErrorLimit;

    /**
     * @return The maximum number of times the measurement is allowed to error in succession, before the metric is considered error.Default is 4.When choosing `Jenkins` as the provider, there is no need to send this variable.
     * 
     */
    public Optional<Output<Integer>> consecutiveErrorLimit() {
        return Optional.ofNullable(this.consecutiveErrorLimit);
    }

    /**
     * The number of times to run the measurement. If both interval and count are omitted, the effective count is 1. If only interval is specified, metric runs indefinitely. If count &gt; 1, interval must be specified. When choosing `Jenkins` as the provider, there is no need to send this variable.
     * 
     */
    @Import(name="count")
    private @Nullable Output<Integer> count;

    /**
     * @return The number of times to run the measurement. If both interval and count are omitted, the effective count is 1. If only interval is specified, metric runs indefinitely. If count &gt; 1, interval must be specified. When choosing `Jenkins` as the provider, there is no need to send this variable.
     * 
     */
    public Optional<Output<Integer>> count() {
        return Optional.ofNullable(this.count);
    }

    /**
     * Defines whether the metric should have an impact on the result of the rollout.
     * 
     */
    @Import(name="dryRun")
    private @Nullable Output<Boolean> dryRun;

    /**
     * @return Defines whether the metric should have an impact on the result of the rollout.
     * 
     */
    public Optional<Output<Boolean>> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * An expression which determines if a measurement is considered failed.If failureCondition is set, then successCondition is not allowed. When choosing Jenkins as the provider, there is no need to send this variable.
     * 
     */
    @Import(name="failureCondition")
    private @Nullable Output<String> failureCondition;

    /**
     * @return An expression which determines if a measurement is considered failed.If failureCondition is set, then successCondition is not allowed. When choosing Jenkins as the provider, there is no need to send this variable.
     * 
     */
    public Optional<Output<String>> failureCondition() {
        return Optional.ofNullable(this.failureCondition);
    }

    /**
     * The maximum number of times the measurement is allowed to fail, before the entire metric is considered failed.Default is 0. When choosing `Jenkins` as the provider, there is no need to send this variable.
     * 
     */
    @Import(name="failureLimit")
    private @Nullable Output<Integer> failureLimit;

    /**
     * @return The maximum number of times the measurement is allowed to fail, before the entire metric is considered failed.Default is 0. When choosing `Jenkins` as the provider, there is no need to send this variable.
     * 
     */
    public Optional<Output<Integer>> failureLimit() {
        return Optional.ofNullable(this.failureLimit);
    }

    /**
     * How long to wait before starting this metric measurements. When choosing Jenkins as the provider, there is no need to send this variable.
     * 
     */
    @Import(name="initialDelay")
    private @Nullable Output<String> initialDelay;

    /**
     * @return How long to wait before starting this metric measurements. When choosing Jenkins as the provider, there is no need to send this variable.
     * 
     */
    public Optional<Output<String>> initialDelay() {
        return Optional.ofNullable(this.initialDelay);
    }

    /**
     * Defines an interval string (30s, 5m, 1h) between each verification measurements. If omitted, will perform a single measurement.When choosing Jenkins as the provider, there is no need to send this variable.
     * 
     */
    @Import(name="interval")
    private @Nullable Output<String> interval;

    /**
     * @return Defines an interval string (30s, 5m, 1h) between each verification measurements. If omitted, will perform a single measurement.When choosing Jenkins as the provider, there is no need to send this variable.
     * 
     */
    public Optional<Output<String>> interval() {
        return Optional.ofNullable(this.interval);
    }

    /**
     * The name of the verification metric.
     * 
     */
    @Import(name="metricsName", required=true)
    private Output<String> metricsName;

    /**
     * @return The name of the verification metric.
     * 
     */
    public Output<String> metricsName() {
        return this.metricsName;
    }

    /**
     * The name of the monitoring tool chosen for the metric.
     * 
     */
    @Import(name="providers", required=true)
    private Output<List<VerificationTemplateMetricProviderArgs>> providers;

    /**
     * @return The name of the monitoring tool chosen for the metric.
     * 
     */
    public Output<List<VerificationTemplateMetricProviderArgs>> providers() {
        return this.providers;
    }

    /**
     * An expression which determines if a measurement is considered successful. The keyword `result` is a variable reference to the value of measurement. Results can be both structured data or primitive. If successCondition is set, then failureCondition is not allowed. When choosing `Jenkins` as the provider, there is no need to send this variable.
     * 
     */
    @Import(name="successCondition")
    private @Nullable Output<String> successCondition;

    /**
     * @return An expression which determines if a measurement is considered successful. The keyword `result` is a variable reference to the value of measurement. Results can be both structured data or primitive. If successCondition is set, then failureCondition is not allowed. When choosing `Jenkins` as the provider, there is no need to send this variable.
     * 
     */
    public Optional<Output<String>> successCondition() {
        return Optional.ofNullable(this.successCondition);
    }

    private VerificationTemplateMetricArgs() {}

    private VerificationTemplateMetricArgs(VerificationTemplateMetricArgs $) {
        this.baseline = $.baseline;
        this.consecutiveErrorLimit = $.consecutiveErrorLimit;
        this.count = $.count;
        this.dryRun = $.dryRun;
        this.failureCondition = $.failureCondition;
        this.failureLimit = $.failureLimit;
        this.initialDelay = $.initialDelay;
        this.interval = $.interval;
        this.metricsName = $.metricsName;
        this.providers = $.providers;
        this.successCondition = $.successCondition;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VerificationTemplateMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VerificationTemplateMetricArgs $;

        public Builder() {
            $ = new VerificationTemplateMetricArgs();
        }

        public Builder(VerificationTemplateMetricArgs defaults) {
            $ = new VerificationTemplateMetricArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param baseline Baseline Object.
         * 
         * @return builder
         * 
         */
        public Builder baseline(@Nullable Output<VerificationTemplateMetricBaselineArgs> baseline) {
            $.baseline = baseline;
            return this;
        }

        /**
         * @param baseline Baseline Object.
         * 
         * @return builder
         * 
         */
        public Builder baseline(VerificationTemplateMetricBaselineArgs baseline) {
            return baseline(Output.of(baseline));
        }

        /**
         * @param consecutiveErrorLimit The maximum number of times the measurement is allowed to error in succession, before the metric is considered error.Default is 4.When choosing `Jenkins` as the provider, there is no need to send this variable.
         * 
         * @return builder
         * 
         */
        public Builder consecutiveErrorLimit(@Nullable Output<Integer> consecutiveErrorLimit) {
            $.consecutiveErrorLimit = consecutiveErrorLimit;
            return this;
        }

        /**
         * @param consecutiveErrorLimit The maximum number of times the measurement is allowed to error in succession, before the metric is considered error.Default is 4.When choosing `Jenkins` as the provider, there is no need to send this variable.
         * 
         * @return builder
         * 
         */
        public Builder consecutiveErrorLimit(Integer consecutiveErrorLimit) {
            return consecutiveErrorLimit(Output.of(consecutiveErrorLimit));
        }

        /**
         * @param count The number of times to run the measurement. If both interval and count are omitted, the effective count is 1. If only interval is specified, metric runs indefinitely. If count &gt; 1, interval must be specified. When choosing `Jenkins` as the provider, there is no need to send this variable.
         * 
         * @return builder
         * 
         */
        public Builder count(@Nullable Output<Integer> count) {
            $.count = count;
            return this;
        }

        /**
         * @param count The number of times to run the measurement. If both interval and count are omitted, the effective count is 1. If only interval is specified, metric runs indefinitely. If count &gt; 1, interval must be specified. When choosing `Jenkins` as the provider, there is no need to send this variable.
         * 
         * @return builder
         * 
         */
        public Builder count(Integer count) {
            return count(Output.of(count));
        }

        /**
         * @param dryRun Defines whether the metric should have an impact on the result of the rollout.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(@Nullable Output<Boolean> dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        /**
         * @param dryRun Defines whether the metric should have an impact on the result of the rollout.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(Boolean dryRun) {
            return dryRun(Output.of(dryRun));
        }

        /**
         * @param failureCondition An expression which determines if a measurement is considered failed.If failureCondition is set, then successCondition is not allowed. When choosing Jenkins as the provider, there is no need to send this variable.
         * 
         * @return builder
         * 
         */
        public Builder failureCondition(@Nullable Output<String> failureCondition) {
            $.failureCondition = failureCondition;
            return this;
        }

        /**
         * @param failureCondition An expression which determines if a measurement is considered failed.If failureCondition is set, then successCondition is not allowed. When choosing Jenkins as the provider, there is no need to send this variable.
         * 
         * @return builder
         * 
         */
        public Builder failureCondition(String failureCondition) {
            return failureCondition(Output.of(failureCondition));
        }

        /**
         * @param failureLimit The maximum number of times the measurement is allowed to fail, before the entire metric is considered failed.Default is 0. When choosing `Jenkins` as the provider, there is no need to send this variable.
         * 
         * @return builder
         * 
         */
        public Builder failureLimit(@Nullable Output<Integer> failureLimit) {
            $.failureLimit = failureLimit;
            return this;
        }

        /**
         * @param failureLimit The maximum number of times the measurement is allowed to fail, before the entire metric is considered failed.Default is 0. When choosing `Jenkins` as the provider, there is no need to send this variable.
         * 
         * @return builder
         * 
         */
        public Builder failureLimit(Integer failureLimit) {
            return failureLimit(Output.of(failureLimit));
        }

        /**
         * @param initialDelay How long to wait before starting this metric measurements. When choosing Jenkins as the provider, there is no need to send this variable.
         * 
         * @return builder
         * 
         */
        public Builder initialDelay(@Nullable Output<String> initialDelay) {
            $.initialDelay = initialDelay;
            return this;
        }

        /**
         * @param initialDelay How long to wait before starting this metric measurements. When choosing Jenkins as the provider, there is no need to send this variable.
         * 
         * @return builder
         * 
         */
        public Builder initialDelay(String initialDelay) {
            return initialDelay(Output.of(initialDelay));
        }

        /**
         * @param interval Defines an interval string (30s, 5m, 1h) between each verification measurements. If omitted, will perform a single measurement.When choosing Jenkins as the provider, there is no need to send this variable.
         * 
         * @return builder
         * 
         */
        public Builder interval(@Nullable Output<String> interval) {
            $.interval = interval;
            return this;
        }

        /**
         * @param interval Defines an interval string (30s, 5m, 1h) between each verification measurements. If omitted, will perform a single measurement.When choosing Jenkins as the provider, there is no need to send this variable.
         * 
         * @return builder
         * 
         */
        public Builder interval(String interval) {
            return interval(Output.of(interval));
        }

        /**
         * @param metricsName The name of the verification metric.
         * 
         * @return builder
         * 
         */
        public Builder metricsName(Output<String> metricsName) {
            $.metricsName = metricsName;
            return this;
        }

        /**
         * @param metricsName The name of the verification metric.
         * 
         * @return builder
         * 
         */
        public Builder metricsName(String metricsName) {
            return metricsName(Output.of(metricsName));
        }

        /**
         * @param providers The name of the monitoring tool chosen for the metric.
         * 
         * @return builder
         * 
         */
        public Builder providers(Output<List<VerificationTemplateMetricProviderArgs>> providers) {
            $.providers = providers;
            return this;
        }

        /**
         * @param providers The name of the monitoring tool chosen for the metric.
         * 
         * @return builder
         * 
         */
        public Builder providers(List<VerificationTemplateMetricProviderArgs> providers) {
            return providers(Output.of(providers));
        }

        /**
         * @param providers The name of the monitoring tool chosen for the metric.
         * 
         * @return builder
         * 
         */
        public Builder providers(VerificationTemplateMetricProviderArgs... providers) {
            return providers(List.of(providers));
        }

        /**
         * @param successCondition An expression which determines if a measurement is considered successful. The keyword `result` is a variable reference to the value of measurement. Results can be both structured data or primitive. If successCondition is set, then failureCondition is not allowed. When choosing `Jenkins` as the provider, there is no need to send this variable.
         * 
         * @return builder
         * 
         */
        public Builder successCondition(@Nullable Output<String> successCondition) {
            $.successCondition = successCondition;
            return this;
        }

        /**
         * @param successCondition An expression which determines if a measurement is considered successful. The keyword `result` is a variable reference to the value of measurement. Results can be both structured data or primitive. If successCondition is set, then failureCondition is not allowed. When choosing `Jenkins` as the provider, there is no need to send this variable.
         * 
         * @return builder
         * 
         */
        public Builder successCondition(String successCondition) {
            return successCondition(Output.of(successCondition));
        }

        public VerificationTemplateMetricArgs build() {
            if ($.metricsName == null) {
                throw new MissingRequiredPropertyException("VerificationTemplateMetricArgs", "metricsName");
            }
            if ($.providers == null) {
                throw new MissingRequiredPropertyException("VerificationTemplateMetricArgs", "providers");
            }
            return $;
        }
    }

}
