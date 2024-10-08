// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.oceancd.inputs.VerificationTemplateMetricBaselineBaselineProviderArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VerificationTemplateMetricBaselineArgs extends com.pulumi.resources.ResourceArgs {

    public static final VerificationTemplateMetricBaselineArgs Empty = new VerificationTemplateMetricBaselineArgs();

    /**
     * The name of the monitoring tool chosen for the metric.
     * 
     */
    @Import(name="baselineProviders", required=true)
    private Output<List<VerificationTemplateMetricBaselineBaselineProviderArgs>> baselineProviders;

    /**
     * @return The name of the monitoring tool chosen for the metric.
     * 
     */
    public Output<List<VerificationTemplateMetricBaselineBaselineProviderArgs>> baselineProviders() {
        return this.baselineProviders;
    }

    /**
     * Number in percent we allow the new version’s data result to be under baseline data result.
     * 
     */
    @Import(name="maxRange")
    private @Nullable Output<Integer> maxRange;

    /**
     * @return Number in percent we allow the new version’s data result to be under baseline data result.
     * 
     */
    public Optional<Output<Integer>> maxRange() {
        return Optional.ofNullable(this.maxRange);
    }

    /**
     * Number in percent we allow the new version’s data result to be under baseline data result.*
     * 
     */
    @Import(name="minRange")
    private @Nullable Output<Integer> minRange;

    /**
     * @return Number in percent we allow the new version’s data result to be under baseline data result.*
     * 
     */
    public Optional<Output<Integer>> minRange() {
        return Optional.ofNullable(this.minRange);
    }

    /**
     * A mathematical expression needed for the comparison. Enum: &#34;&lt;&#34; &#34;&gt;&#34; &#34;&lt;=&#34; &#34;&gt;=&#34; &#34;=&#34; &#34;range&#34;
     * 
     */
    @Import(name="threshold", required=true)
    private Output<String> threshold;

    /**
     * @return A mathematical expression needed for the comparison. Enum: &#34;&lt;&#34; &#34;&gt;&#34; &#34;&lt;=&#34; &#34;&gt;=&#34; &#34;=&#34; &#34;range&#34;
     * 
     */
    public Output<String> threshold() {
        return this.threshold;
    }

    private VerificationTemplateMetricBaselineArgs() {}

    private VerificationTemplateMetricBaselineArgs(VerificationTemplateMetricBaselineArgs $) {
        this.baselineProviders = $.baselineProviders;
        this.maxRange = $.maxRange;
        this.minRange = $.minRange;
        this.threshold = $.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VerificationTemplateMetricBaselineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VerificationTemplateMetricBaselineArgs $;

        public Builder() {
            $ = new VerificationTemplateMetricBaselineArgs();
        }

        public Builder(VerificationTemplateMetricBaselineArgs defaults) {
            $ = new VerificationTemplateMetricBaselineArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param baselineProviders The name of the monitoring tool chosen for the metric.
         * 
         * @return builder
         * 
         */
        public Builder baselineProviders(Output<List<VerificationTemplateMetricBaselineBaselineProviderArgs>> baselineProviders) {
            $.baselineProviders = baselineProviders;
            return this;
        }

        /**
         * @param baselineProviders The name of the monitoring tool chosen for the metric.
         * 
         * @return builder
         * 
         */
        public Builder baselineProviders(List<VerificationTemplateMetricBaselineBaselineProviderArgs> baselineProviders) {
            return baselineProviders(Output.of(baselineProviders));
        }

        /**
         * @param baselineProviders The name of the monitoring tool chosen for the metric.
         * 
         * @return builder
         * 
         */
        public Builder baselineProviders(VerificationTemplateMetricBaselineBaselineProviderArgs... baselineProviders) {
            return baselineProviders(List.of(baselineProviders));
        }

        /**
         * @param maxRange Number in percent we allow the new version’s data result to be under baseline data result.
         * 
         * @return builder
         * 
         */
        public Builder maxRange(@Nullable Output<Integer> maxRange) {
            $.maxRange = maxRange;
            return this;
        }

        /**
         * @param maxRange Number in percent we allow the new version’s data result to be under baseline data result.
         * 
         * @return builder
         * 
         */
        public Builder maxRange(Integer maxRange) {
            return maxRange(Output.of(maxRange));
        }

        /**
         * @param minRange Number in percent we allow the new version’s data result to be under baseline data result.*
         * 
         * @return builder
         * 
         */
        public Builder minRange(@Nullable Output<Integer> minRange) {
            $.minRange = minRange;
            return this;
        }

        /**
         * @param minRange Number in percent we allow the new version’s data result to be under baseline data result.*
         * 
         * @return builder
         * 
         */
        public Builder minRange(Integer minRange) {
            return minRange(Output.of(minRange));
        }

        /**
         * @param threshold A mathematical expression needed for the comparison. Enum: &#34;&lt;&#34; &#34;&gt;&#34; &#34;&lt;=&#34; &#34;&gt;=&#34; &#34;=&#34; &#34;range&#34;
         * 
         * @return builder
         * 
         */
        public Builder threshold(Output<String> threshold) {
            $.threshold = threshold;
            return this;
        }

        /**
         * @param threshold A mathematical expression needed for the comparison. Enum: &#34;&lt;&#34; &#34;&gt;&#34; &#34;&lt;=&#34; &#34;&gt;=&#34; &#34;=&#34; &#34;range&#34;
         * 
         * @return builder
         * 
         */
        public Builder threshold(String threshold) {
            return threshold(Output.of(threshold));
        }

        public VerificationTemplateMetricBaselineArgs build() {
            if ($.baselineProviders == null) {
                throw new MissingRequiredPropertyException("VerificationTemplateMetricBaselineArgs", "baselineProviders");
            }
            if ($.threshold == null) {
                throw new MissingRequiredPropertyException("VerificationTemplateMetricBaselineArgs", "threshold");
            }
            return $;
        }
    }

}