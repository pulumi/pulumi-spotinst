// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupUpdatePolicyRollConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupUpdatePolicyRollConfigArgs Empty = new ElastigroupUpdatePolicyRollConfigArgs();

    /**
     * Sets the percentage of the instances to deploy in each batch.
     * 
     */
    @Import(name="batchSizePercentage", required=true)
    private Output<Integer> batchSizePercentage;

    /**
     * @return Sets the percentage of the instances to deploy in each batch.
     * 
     */
    public Output<Integer> batchSizePercentage() {
        return this.batchSizePercentage;
    }

    /**
     * Sets the grace period for new instances to become healthy.
     * 
     */
    @Import(name="gracePeriod")
    private @Nullable Output<Integer> gracePeriod;

    /**
     * @return Sets the grace period for new instances to become healthy.
     * 
     */
    public Optional<Output<Integer>> gracePeriod() {
        return Optional.ofNullable(this.gracePeriod);
    }

    /**
     * Sets the health check type to use. Valid values: `&#34;INSTANCE_STATE&#34;`, `&#34;NONE&#34;`.
     * 
     */
    @Import(name="healthCheckType")
    private @Nullable Output<String> healthCheckType;

    /**
     * @return Sets the health check type to use. Valid values: `&#34;INSTANCE_STATE&#34;`, `&#34;NONE&#34;`.
     * 
     */
    public Optional<Output<String>> healthCheckType() {
        return Optional.ofNullable(this.healthCheckType);
    }

    private ElastigroupUpdatePolicyRollConfigArgs() {}

    private ElastigroupUpdatePolicyRollConfigArgs(ElastigroupUpdatePolicyRollConfigArgs $) {
        this.batchSizePercentage = $.batchSizePercentage;
        this.gracePeriod = $.gracePeriod;
        this.healthCheckType = $.healthCheckType;
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

        /**
         * @param batchSizePercentage Sets the percentage of the instances to deploy in each batch.
         * 
         * @return builder
         * 
         */
        public Builder batchSizePercentage(Output<Integer> batchSizePercentage) {
            $.batchSizePercentage = batchSizePercentage;
            return this;
        }

        /**
         * @param batchSizePercentage Sets the percentage of the instances to deploy in each batch.
         * 
         * @return builder
         * 
         */
        public Builder batchSizePercentage(Integer batchSizePercentage) {
            return batchSizePercentage(Output.of(batchSizePercentage));
        }

        /**
         * @param gracePeriod Sets the grace period for new instances to become healthy.
         * 
         * @return builder
         * 
         */
        public Builder gracePeriod(@Nullable Output<Integer> gracePeriod) {
            $.gracePeriod = gracePeriod;
            return this;
        }

        /**
         * @param gracePeriod Sets the grace period for new instances to become healthy.
         * 
         * @return builder
         * 
         */
        public Builder gracePeriod(Integer gracePeriod) {
            return gracePeriod(Output.of(gracePeriod));
        }

        /**
         * @param healthCheckType Sets the health check type to use. Valid values: `&#34;INSTANCE_STATE&#34;`, `&#34;NONE&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckType(@Nullable Output<String> healthCheckType) {
            $.healthCheckType = healthCheckType;
            return this;
        }

        /**
         * @param healthCheckType Sets the health check type to use. Valid values: `&#34;INSTANCE_STATE&#34;`, `&#34;NONE&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckType(String healthCheckType) {
            return healthCheckType(Output.of(healthCheckType));
        }

        public ElastigroupUpdatePolicyRollConfigArgs build() {
            $.batchSizePercentage = Objects.requireNonNull($.batchSizePercentage, "expected parameter 'batchSizePercentage' to be non-null");
            return $;
        }
    }

}
