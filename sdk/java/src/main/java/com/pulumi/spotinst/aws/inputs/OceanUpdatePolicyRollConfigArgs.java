// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanUpdatePolicyRollConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanUpdatePolicyRollConfigArgs Empty = new OceanUpdatePolicyRollConfigArgs();

    /**
     * Default: 50. Indicates the threshold of minimum healthy instances in single batch. If the amount of healthy instances in single batch is under the threshold, the cluster roll will fail. If exists, the parameter value will be in range of 1-100. In case of null as value, the default value in the backend will be 50%. Value of param should represent the number in percentage (%) of the batch.
     * 
     */
    @Import(name="batchMinHealthyPercentage")
    private @Nullable Output<Integer> batchMinHealthyPercentage;

    /**
     * @return Default: 50. Indicates the threshold of minimum healthy instances in single batch. If the amount of healthy instances in single batch is under the threshold, the cluster roll will fail. If exists, the parameter value will be in range of 1-100. In case of null as value, the default value in the backend will be 50%. Value of param should represent the number in percentage (%) of the batch.
     * 
     */
    public Optional<Output<Integer>> batchMinHealthyPercentage() {
        return Optional.ofNullable(this.batchMinHealthyPercentage);
    }

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
     * List of virtual node group identifiers to be rolled.
     * 
     */
    @Import(name="launchSpecIds")
    private @Nullable Output<List<String>> launchSpecIds;

    /**
     * @return List of virtual node group identifiers to be rolled.
     * 
     */
    public Optional<Output<List<String>>> launchSpecIds() {
        return Optional.ofNullable(this.launchSpecIds);
    }

    /**
     * During the roll, if the parameter is set to `true` we honor PDB during the instance replacement.
     * 
     */
    @Import(name="respectPdb")
    private @Nullable Output<Boolean> respectPdb;

    /**
     * @return During the roll, if the parameter is set to `true` we honor PDB during the instance replacement.
     * 
     */
    public Optional<Output<Boolean>> respectPdb() {
        return Optional.ofNullable(this.respectPdb);
    }

    private OceanUpdatePolicyRollConfigArgs() {}

    private OceanUpdatePolicyRollConfigArgs(OceanUpdatePolicyRollConfigArgs $) {
        this.batchMinHealthyPercentage = $.batchMinHealthyPercentage;
        this.batchSizePercentage = $.batchSizePercentage;
        this.launchSpecIds = $.launchSpecIds;
        this.respectPdb = $.respectPdb;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanUpdatePolicyRollConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanUpdatePolicyRollConfigArgs $;

        public Builder() {
            $ = new OceanUpdatePolicyRollConfigArgs();
        }

        public Builder(OceanUpdatePolicyRollConfigArgs defaults) {
            $ = new OceanUpdatePolicyRollConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param batchMinHealthyPercentage Default: 50. Indicates the threshold of minimum healthy instances in single batch. If the amount of healthy instances in single batch is under the threshold, the cluster roll will fail. If exists, the parameter value will be in range of 1-100. In case of null as value, the default value in the backend will be 50%. Value of param should represent the number in percentage (%) of the batch.
         * 
         * @return builder
         * 
         */
        public Builder batchMinHealthyPercentage(@Nullable Output<Integer> batchMinHealthyPercentage) {
            $.batchMinHealthyPercentage = batchMinHealthyPercentage;
            return this;
        }

        /**
         * @param batchMinHealthyPercentage Default: 50. Indicates the threshold of minimum healthy instances in single batch. If the amount of healthy instances in single batch is under the threshold, the cluster roll will fail. If exists, the parameter value will be in range of 1-100. In case of null as value, the default value in the backend will be 50%. Value of param should represent the number in percentage (%) of the batch.
         * 
         * @return builder
         * 
         */
        public Builder batchMinHealthyPercentage(Integer batchMinHealthyPercentage) {
            return batchMinHealthyPercentage(Output.of(batchMinHealthyPercentage));
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
         * @param launchSpecIds List of virtual node group identifiers to be rolled.
         * 
         * @return builder
         * 
         */
        public Builder launchSpecIds(@Nullable Output<List<String>> launchSpecIds) {
            $.launchSpecIds = launchSpecIds;
            return this;
        }

        /**
         * @param launchSpecIds List of virtual node group identifiers to be rolled.
         * 
         * @return builder
         * 
         */
        public Builder launchSpecIds(List<String> launchSpecIds) {
            return launchSpecIds(Output.of(launchSpecIds));
        }

        /**
         * @param launchSpecIds List of virtual node group identifiers to be rolled.
         * 
         * @return builder
         * 
         */
        public Builder launchSpecIds(String... launchSpecIds) {
            return launchSpecIds(List.of(launchSpecIds));
        }

        /**
         * @param respectPdb During the roll, if the parameter is set to `true` we honor PDB during the instance replacement.
         * 
         * @return builder
         * 
         */
        public Builder respectPdb(@Nullable Output<Boolean> respectPdb) {
            $.respectPdb = respectPdb;
            return this;
        }

        /**
         * @param respectPdb During the roll, if the parameter is set to `true` we honor PDB during the instance replacement.
         * 
         * @return builder
         * 
         */
        public Builder respectPdb(Boolean respectPdb) {
            return respectPdb(Output.of(respectPdb));
        }

        public OceanUpdatePolicyRollConfigArgs build() {
            if ($.batchSizePercentage == null) {
                throw new MissingRequiredPropertyException("OceanUpdatePolicyRollConfigArgs", "batchSizePercentage");
            }
            return $;
        }
    }

}
