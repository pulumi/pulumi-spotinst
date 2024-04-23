// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.aws.inputs.ElastigroupUpdatePolicyRollConfigStrategyArgs;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupUpdatePolicyRollConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupUpdatePolicyRollConfigArgs Empty = new ElastigroupUpdatePolicyRollConfigArgs();

    @Import(name="batchSizePercentage", required=true)
    private Output<Integer> batchSizePercentage;

    public Output<Integer> batchSizePercentage() {
        return this.batchSizePercentage;
    }

    @Import(name="gracePeriod")
    private @Nullable Output<Integer> gracePeriod;

    public Optional<Output<Integer>> gracePeriod() {
        return Optional.ofNullable(this.gracePeriod);
    }

    /**
     * The service that will perform health checks for the instance. Valid values: `&#34;ELB&#34;`, `&#34;HCS&#34;`, `&#34;TARGET_GROUP&#34;`, `&#34;EC2&#34;`, `&#34;K8S_NODE&#34;`, `&#34;NOMAD_NODE&#34;`, `&#34;ECS_CLUSTER_INSTANCE&#34;`.
     * 
     */
    @Import(name="healthCheckType")
    private @Nullable Output<String> healthCheckType;

    /**
     * @return The service that will perform health checks for the instance. Valid values: `&#34;ELB&#34;`, `&#34;HCS&#34;`, `&#34;TARGET_GROUP&#34;`, `&#34;EC2&#34;`, `&#34;K8S_NODE&#34;`, `&#34;NOMAD_NODE&#34;`, `&#34;ECS_CLUSTER_INSTANCE&#34;`.
     * 
     */
    public Optional<Output<String>> healthCheckType() {
        return Optional.ofNullable(this.healthCheckType);
    }

    @Import(name="strategy")
    private @Nullable Output<ElastigroupUpdatePolicyRollConfigStrategyArgs> strategy;

    public Optional<Output<ElastigroupUpdatePolicyRollConfigStrategyArgs>> strategy() {
        return Optional.ofNullable(this.strategy);
    }

    @Import(name="waitForRollPercentage")
    private @Nullable Output<Double> waitForRollPercentage;

    public Optional<Output<Double>> waitForRollPercentage() {
        return Optional.ofNullable(this.waitForRollPercentage);
    }

    @Import(name="waitForRollTimeout")
    private @Nullable Output<Integer> waitForRollTimeout;

    public Optional<Output<Integer>> waitForRollTimeout() {
        return Optional.ofNullable(this.waitForRollTimeout);
    }

    private ElastigroupUpdatePolicyRollConfigArgs() {}

    private ElastigroupUpdatePolicyRollConfigArgs(ElastigroupUpdatePolicyRollConfigArgs $) {
        this.batchSizePercentage = $.batchSizePercentage;
        this.gracePeriod = $.gracePeriod;
        this.healthCheckType = $.healthCheckType;
        this.strategy = $.strategy;
        this.waitForRollPercentage = $.waitForRollPercentage;
        this.waitForRollTimeout = $.waitForRollTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupUpdatePolicyRollConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupUpdatePolicyRollConfigArgs $;

        public Builder() {
            $ = new ElastigroupUpdatePolicyRollConfigArgs();
        }

        public Builder(ElastigroupUpdatePolicyRollConfigArgs defaults) {
            $ = new ElastigroupUpdatePolicyRollConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder batchSizePercentage(Output<Integer> batchSizePercentage) {
            $.batchSizePercentage = batchSizePercentage;
            return this;
        }

        public Builder batchSizePercentage(Integer batchSizePercentage) {
            return batchSizePercentage(Output.of(batchSizePercentage));
        }

        public Builder gracePeriod(@Nullable Output<Integer> gracePeriod) {
            $.gracePeriod = gracePeriod;
            return this;
        }

        public Builder gracePeriod(Integer gracePeriod) {
            return gracePeriod(Output.of(gracePeriod));
        }

        /**
         * @param healthCheckType The service that will perform health checks for the instance. Valid values: `&#34;ELB&#34;`, `&#34;HCS&#34;`, `&#34;TARGET_GROUP&#34;`, `&#34;EC2&#34;`, `&#34;K8S_NODE&#34;`, `&#34;NOMAD_NODE&#34;`, `&#34;ECS_CLUSTER_INSTANCE&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckType(@Nullable Output<String> healthCheckType) {
            $.healthCheckType = healthCheckType;
            return this;
        }

        /**
         * @param healthCheckType The service that will perform health checks for the instance. Valid values: `&#34;ELB&#34;`, `&#34;HCS&#34;`, `&#34;TARGET_GROUP&#34;`, `&#34;EC2&#34;`, `&#34;K8S_NODE&#34;`, `&#34;NOMAD_NODE&#34;`, `&#34;ECS_CLUSTER_INSTANCE&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckType(String healthCheckType) {
            return healthCheckType(Output.of(healthCheckType));
        }

        public Builder strategy(@Nullable Output<ElastigroupUpdatePolicyRollConfigStrategyArgs> strategy) {
            $.strategy = strategy;
            return this;
        }

        public Builder strategy(ElastigroupUpdatePolicyRollConfigStrategyArgs strategy) {
            return strategy(Output.of(strategy));
        }

        public Builder waitForRollPercentage(@Nullable Output<Double> waitForRollPercentage) {
            $.waitForRollPercentage = waitForRollPercentage;
            return this;
        }

        public Builder waitForRollPercentage(Double waitForRollPercentage) {
            return waitForRollPercentage(Output.of(waitForRollPercentage));
        }

        public Builder waitForRollTimeout(@Nullable Output<Integer> waitForRollTimeout) {
            $.waitForRollTimeout = waitForRollTimeout;
            return this;
        }

        public Builder waitForRollTimeout(Integer waitForRollTimeout) {
            return waitForRollTimeout(Output.of(waitForRollTimeout));
        }

        public ElastigroupUpdatePolicyRollConfigArgs build() {
            if ($.batchSizePercentage == null) {
                throw new MissingRequiredPropertyException("ElastigroupUpdatePolicyRollConfigArgs", "batchSizePercentage");
            }
            return $;
        }
    }

}
