// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.aws.inputs.ElastigroupIntegrationEcsAutoscaleAttributeArgs;
import com.pulumi.spotinst.aws.inputs.ElastigroupIntegrationEcsAutoscaleDownArgs;
import com.pulumi.spotinst.aws.inputs.ElastigroupIntegrationEcsAutoscaleHeadroomArgs;
import com.pulumi.spotinst.aws.inputs.ElastigroupIntegrationEcsBatchArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupIntegrationEcsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupIntegrationEcsArgs Empty = new ElastigroupIntegrationEcsArgs();

    @Import(name="autoscaleAttributes")
    private @Nullable Output<List<ElastigroupIntegrationEcsAutoscaleAttributeArgs>> autoscaleAttributes;

    public Optional<Output<List<ElastigroupIntegrationEcsAutoscaleAttributeArgs>>> autoscaleAttributes() {
        return Optional.ofNullable(this.autoscaleAttributes);
    }

    @Import(name="autoscaleCooldown")
    private @Nullable Output<Integer> autoscaleCooldown;

    public Optional<Output<Integer>> autoscaleCooldown() {
        return Optional.ofNullable(this.autoscaleCooldown);
    }

    @Import(name="autoscaleDown")
    private @Nullable Output<ElastigroupIntegrationEcsAutoscaleDownArgs> autoscaleDown;

    public Optional<Output<ElastigroupIntegrationEcsAutoscaleDownArgs>> autoscaleDown() {
        return Optional.ofNullable(this.autoscaleDown);
    }

    @Import(name="autoscaleHeadroom")
    private @Nullable Output<ElastigroupIntegrationEcsAutoscaleHeadroomArgs> autoscaleHeadroom;

    public Optional<Output<ElastigroupIntegrationEcsAutoscaleHeadroomArgs>> autoscaleHeadroom() {
        return Optional.ofNullable(this.autoscaleHeadroom);
    }

    @Import(name="autoscaleIsAutoConfig")
    private @Nullable Output<Boolean> autoscaleIsAutoConfig;

    public Optional<Output<Boolean>> autoscaleIsAutoConfig() {
        return Optional.ofNullable(this.autoscaleIsAutoConfig);
    }

    @Import(name="autoscaleIsEnabled")
    private @Nullable Output<Boolean> autoscaleIsEnabled;

    public Optional<Output<Boolean>> autoscaleIsEnabled() {
        return Optional.ofNullable(this.autoscaleIsEnabled);
    }

    @Import(name="autoscaleScaleDownNonServiceTasks")
    private @Nullable Output<Boolean> autoscaleScaleDownNonServiceTasks;

    public Optional<Output<Boolean>> autoscaleScaleDownNonServiceTasks() {
        return Optional.ofNullable(this.autoscaleScaleDownNonServiceTasks);
    }

    @Import(name="batch")
    private @Nullable Output<ElastigroupIntegrationEcsBatchArgs> batch;

    public Optional<Output<ElastigroupIntegrationEcsBatchArgs>> batch() {
        return Optional.ofNullable(this.batch);
    }

    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    public Output<String> clusterName() {
        return this.clusterName;
    }

    private ElastigroupIntegrationEcsArgs() {}

    private ElastigroupIntegrationEcsArgs(ElastigroupIntegrationEcsArgs $) {
        this.autoscaleAttributes = $.autoscaleAttributes;
        this.autoscaleCooldown = $.autoscaleCooldown;
        this.autoscaleDown = $.autoscaleDown;
        this.autoscaleHeadroom = $.autoscaleHeadroom;
        this.autoscaleIsAutoConfig = $.autoscaleIsAutoConfig;
        this.autoscaleIsEnabled = $.autoscaleIsEnabled;
        this.autoscaleScaleDownNonServiceTasks = $.autoscaleScaleDownNonServiceTasks;
        this.batch = $.batch;
        this.clusterName = $.clusterName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupIntegrationEcsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupIntegrationEcsArgs $;

        public Builder() {
            $ = new ElastigroupIntegrationEcsArgs();
        }

        public Builder(ElastigroupIntegrationEcsArgs defaults) {
            $ = new ElastigroupIntegrationEcsArgs(Objects.requireNonNull(defaults));
        }

        public Builder autoscaleAttributes(@Nullable Output<List<ElastigroupIntegrationEcsAutoscaleAttributeArgs>> autoscaleAttributes) {
            $.autoscaleAttributes = autoscaleAttributes;
            return this;
        }

        public Builder autoscaleAttributes(List<ElastigroupIntegrationEcsAutoscaleAttributeArgs> autoscaleAttributes) {
            return autoscaleAttributes(Output.of(autoscaleAttributes));
        }

        public Builder autoscaleAttributes(ElastigroupIntegrationEcsAutoscaleAttributeArgs... autoscaleAttributes) {
            return autoscaleAttributes(List.of(autoscaleAttributes));
        }

        public Builder autoscaleCooldown(@Nullable Output<Integer> autoscaleCooldown) {
            $.autoscaleCooldown = autoscaleCooldown;
            return this;
        }

        public Builder autoscaleCooldown(Integer autoscaleCooldown) {
            return autoscaleCooldown(Output.of(autoscaleCooldown));
        }

        public Builder autoscaleDown(@Nullable Output<ElastigroupIntegrationEcsAutoscaleDownArgs> autoscaleDown) {
            $.autoscaleDown = autoscaleDown;
            return this;
        }

        public Builder autoscaleDown(ElastigroupIntegrationEcsAutoscaleDownArgs autoscaleDown) {
            return autoscaleDown(Output.of(autoscaleDown));
        }

        public Builder autoscaleHeadroom(@Nullable Output<ElastigroupIntegrationEcsAutoscaleHeadroomArgs> autoscaleHeadroom) {
            $.autoscaleHeadroom = autoscaleHeadroom;
            return this;
        }

        public Builder autoscaleHeadroom(ElastigroupIntegrationEcsAutoscaleHeadroomArgs autoscaleHeadroom) {
            return autoscaleHeadroom(Output.of(autoscaleHeadroom));
        }

        public Builder autoscaleIsAutoConfig(@Nullable Output<Boolean> autoscaleIsAutoConfig) {
            $.autoscaleIsAutoConfig = autoscaleIsAutoConfig;
            return this;
        }

        public Builder autoscaleIsAutoConfig(Boolean autoscaleIsAutoConfig) {
            return autoscaleIsAutoConfig(Output.of(autoscaleIsAutoConfig));
        }

        public Builder autoscaleIsEnabled(@Nullable Output<Boolean> autoscaleIsEnabled) {
            $.autoscaleIsEnabled = autoscaleIsEnabled;
            return this;
        }

        public Builder autoscaleIsEnabled(Boolean autoscaleIsEnabled) {
            return autoscaleIsEnabled(Output.of(autoscaleIsEnabled));
        }

        public Builder autoscaleScaleDownNonServiceTasks(@Nullable Output<Boolean> autoscaleScaleDownNonServiceTasks) {
            $.autoscaleScaleDownNonServiceTasks = autoscaleScaleDownNonServiceTasks;
            return this;
        }

        public Builder autoscaleScaleDownNonServiceTasks(Boolean autoscaleScaleDownNonServiceTasks) {
            return autoscaleScaleDownNonServiceTasks(Output.of(autoscaleScaleDownNonServiceTasks));
        }

        public Builder batch(@Nullable Output<ElastigroupIntegrationEcsBatchArgs> batch) {
            $.batch = batch;
            return this;
        }

        public Builder batch(ElastigroupIntegrationEcsBatchArgs batch) {
            return batch(Output.of(batch));
        }

        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        public ElastigroupIntegrationEcsArgs build() {
            if ($.clusterName == null) {
                throw new MissingRequiredPropertyException("ElastigroupIntegrationEcsArgs", "clusterName");
            }
            return $;
        }
    }

}
