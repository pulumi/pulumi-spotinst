// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.inputs.OceanRightSizingRuleAttachWorkloadArgs;
import com.pulumi.spotinst.inputs.OceanRightSizingRuleDetachWorkloadArgs;
import com.pulumi.spotinst.inputs.OceanRightSizingRuleRecommendationApplicationBoundaryArgs;
import com.pulumi.spotinst.inputs.OceanRightSizingRuleRecommendationApplicationIntervalArgs;
import com.pulumi.spotinst.inputs.OceanRightSizingRuleRecommendationApplicationMinThresholdArgs;
import com.pulumi.spotinst.inputs.OceanRightSizingRuleRecommendationApplicationOverheadValueArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanRightSizingRuleState extends com.pulumi.resources.ResourceArgs {

    public static final OceanRightSizingRuleState Empty = new OceanRightSizingRuleState();

    @Import(name="attachWorkloads")
    private @Nullable Output<List<OceanRightSizingRuleAttachWorkloadArgs>> attachWorkloads;

    public Optional<Output<List<OceanRightSizingRuleAttachWorkloadArgs>>> attachWorkloads() {
        return Optional.ofNullable(this.attachWorkloads);
    }

    @Import(name="detachWorkloads")
    private @Nullable Output<List<OceanRightSizingRuleDetachWorkloadArgs>> detachWorkloads;

    public Optional<Output<List<OceanRightSizingRuleDetachWorkloadArgs>>> detachWorkloads() {
        return Optional.ofNullable(this.detachWorkloads);
    }

    @Import(name="oceanId")
    private @Nullable Output<String> oceanId;

    public Optional<Output<String>> oceanId() {
        return Optional.ofNullable(this.oceanId);
    }

    @Import(name="recommendationApplicationBoundaries")
    private @Nullable Output<List<OceanRightSizingRuleRecommendationApplicationBoundaryArgs>> recommendationApplicationBoundaries;

    public Optional<Output<List<OceanRightSizingRuleRecommendationApplicationBoundaryArgs>>> recommendationApplicationBoundaries() {
        return Optional.ofNullable(this.recommendationApplicationBoundaries);
    }

    @Import(name="recommendationApplicationIntervals")
    private @Nullable Output<List<OceanRightSizingRuleRecommendationApplicationIntervalArgs>> recommendationApplicationIntervals;

    public Optional<Output<List<OceanRightSizingRuleRecommendationApplicationIntervalArgs>>> recommendationApplicationIntervals() {
        return Optional.ofNullable(this.recommendationApplicationIntervals);
    }

    @Import(name="recommendationApplicationMinThresholds")
    private @Nullable Output<List<OceanRightSizingRuleRecommendationApplicationMinThresholdArgs>> recommendationApplicationMinThresholds;

    public Optional<Output<List<OceanRightSizingRuleRecommendationApplicationMinThresholdArgs>>> recommendationApplicationMinThresholds() {
        return Optional.ofNullable(this.recommendationApplicationMinThresholds);
    }

    @Import(name="recommendationApplicationOverheadValues")
    private @Nullable Output<List<OceanRightSizingRuleRecommendationApplicationOverheadValueArgs>> recommendationApplicationOverheadValues;

    public Optional<Output<List<OceanRightSizingRuleRecommendationApplicationOverheadValueArgs>>> recommendationApplicationOverheadValues() {
        return Optional.ofNullable(this.recommendationApplicationOverheadValues);
    }

    @Import(name="ruleName")
    private @Nullable Output<String> ruleName;

    public Optional<Output<String>> ruleName() {
        return Optional.ofNullable(this.ruleName);
    }

    private OceanRightSizingRuleState() {}

    private OceanRightSizingRuleState(OceanRightSizingRuleState $) {
        this.attachWorkloads = $.attachWorkloads;
        this.detachWorkloads = $.detachWorkloads;
        this.oceanId = $.oceanId;
        this.recommendationApplicationBoundaries = $.recommendationApplicationBoundaries;
        this.recommendationApplicationIntervals = $.recommendationApplicationIntervals;
        this.recommendationApplicationMinThresholds = $.recommendationApplicationMinThresholds;
        this.recommendationApplicationOverheadValues = $.recommendationApplicationOverheadValues;
        this.ruleName = $.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanRightSizingRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanRightSizingRuleState $;

        public Builder() {
            $ = new OceanRightSizingRuleState();
        }

        public Builder(OceanRightSizingRuleState defaults) {
            $ = new OceanRightSizingRuleState(Objects.requireNonNull(defaults));
        }

        public Builder attachWorkloads(@Nullable Output<List<OceanRightSizingRuleAttachWorkloadArgs>> attachWorkloads) {
            $.attachWorkloads = attachWorkloads;
            return this;
        }

        public Builder attachWorkloads(List<OceanRightSizingRuleAttachWorkloadArgs> attachWorkloads) {
            return attachWorkloads(Output.of(attachWorkloads));
        }

        public Builder attachWorkloads(OceanRightSizingRuleAttachWorkloadArgs... attachWorkloads) {
            return attachWorkloads(List.of(attachWorkloads));
        }

        public Builder detachWorkloads(@Nullable Output<List<OceanRightSizingRuleDetachWorkloadArgs>> detachWorkloads) {
            $.detachWorkloads = detachWorkloads;
            return this;
        }

        public Builder detachWorkloads(List<OceanRightSizingRuleDetachWorkloadArgs> detachWorkloads) {
            return detachWorkloads(Output.of(detachWorkloads));
        }

        public Builder detachWorkloads(OceanRightSizingRuleDetachWorkloadArgs... detachWorkloads) {
            return detachWorkloads(List.of(detachWorkloads));
        }

        public Builder oceanId(@Nullable Output<String> oceanId) {
            $.oceanId = oceanId;
            return this;
        }

        public Builder oceanId(String oceanId) {
            return oceanId(Output.of(oceanId));
        }

        public Builder recommendationApplicationBoundaries(@Nullable Output<List<OceanRightSizingRuleRecommendationApplicationBoundaryArgs>> recommendationApplicationBoundaries) {
            $.recommendationApplicationBoundaries = recommendationApplicationBoundaries;
            return this;
        }

        public Builder recommendationApplicationBoundaries(List<OceanRightSizingRuleRecommendationApplicationBoundaryArgs> recommendationApplicationBoundaries) {
            return recommendationApplicationBoundaries(Output.of(recommendationApplicationBoundaries));
        }

        public Builder recommendationApplicationBoundaries(OceanRightSizingRuleRecommendationApplicationBoundaryArgs... recommendationApplicationBoundaries) {
            return recommendationApplicationBoundaries(List.of(recommendationApplicationBoundaries));
        }

        public Builder recommendationApplicationIntervals(@Nullable Output<List<OceanRightSizingRuleRecommendationApplicationIntervalArgs>> recommendationApplicationIntervals) {
            $.recommendationApplicationIntervals = recommendationApplicationIntervals;
            return this;
        }

        public Builder recommendationApplicationIntervals(List<OceanRightSizingRuleRecommendationApplicationIntervalArgs> recommendationApplicationIntervals) {
            return recommendationApplicationIntervals(Output.of(recommendationApplicationIntervals));
        }

        public Builder recommendationApplicationIntervals(OceanRightSizingRuleRecommendationApplicationIntervalArgs... recommendationApplicationIntervals) {
            return recommendationApplicationIntervals(List.of(recommendationApplicationIntervals));
        }

        public Builder recommendationApplicationMinThresholds(@Nullable Output<List<OceanRightSizingRuleRecommendationApplicationMinThresholdArgs>> recommendationApplicationMinThresholds) {
            $.recommendationApplicationMinThresholds = recommendationApplicationMinThresholds;
            return this;
        }

        public Builder recommendationApplicationMinThresholds(List<OceanRightSizingRuleRecommendationApplicationMinThresholdArgs> recommendationApplicationMinThresholds) {
            return recommendationApplicationMinThresholds(Output.of(recommendationApplicationMinThresholds));
        }

        public Builder recommendationApplicationMinThresholds(OceanRightSizingRuleRecommendationApplicationMinThresholdArgs... recommendationApplicationMinThresholds) {
            return recommendationApplicationMinThresholds(List.of(recommendationApplicationMinThresholds));
        }

        public Builder recommendationApplicationOverheadValues(@Nullable Output<List<OceanRightSizingRuleRecommendationApplicationOverheadValueArgs>> recommendationApplicationOverheadValues) {
            $.recommendationApplicationOverheadValues = recommendationApplicationOverheadValues;
            return this;
        }

        public Builder recommendationApplicationOverheadValues(List<OceanRightSizingRuleRecommendationApplicationOverheadValueArgs> recommendationApplicationOverheadValues) {
            return recommendationApplicationOverheadValues(Output.of(recommendationApplicationOverheadValues));
        }

        public Builder recommendationApplicationOverheadValues(OceanRightSizingRuleRecommendationApplicationOverheadValueArgs... recommendationApplicationOverheadValues) {
            return recommendationApplicationOverheadValues(List.of(recommendationApplicationOverheadValues));
        }

        public Builder ruleName(@Nullable Output<String> ruleName) {
            $.ruleName = ruleName;
            return this;
        }

        public Builder ruleName(String ruleName) {
            return ruleName(Output.of(ruleName));
        }

        public OceanRightSizingRuleState build() {
            return $;
        }
    }

}