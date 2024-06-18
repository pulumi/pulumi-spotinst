// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanImportScheduledTaskTaskTaskParametersClusterRollArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanImportScheduledTaskTaskTaskParametersClusterRollArgs Empty = new OceanImportScheduledTaskTaskTaskParametersClusterRollArgs();

    /**
     * Indicates the threshold of minimum healthy instances in single batch. If the amount of healthy instances in single batch is under the threshold, the cluster roll will fail. If exists, the parameter value will be in range of 1-100. In case of null as value, the default value in the backend will be 50%. Value of param should represent the number in percentage (%) of the batch.
     * 
     */
    @Import(name="batchMinHealthyPercentage")
    private @Nullable Output<Integer> batchMinHealthyPercentage;

    /**
     * @return Indicates the threshold of minimum healthy instances in single batch. If the amount of healthy instances in single batch is under the threshold, the cluster roll will fail. If exists, the parameter value will be in range of 1-100. In case of null as value, the default value in the backend will be 50%. Value of param should represent the number in percentage (%) of the batch.
     * 
     */
    public Optional<Output<Integer>> batchMinHealthyPercentage() {
        return Optional.ofNullable(this.batchMinHealthyPercentage);
    }

    /**
     * Value as a percent to set the size of a batch in a roll. Valid values are 0-100.
     * 
     */
    @Import(name="batchSizePercentage")
    private @Nullable Output<Integer> batchSizePercentage;

    /**
     * @return Value as a percent to set the size of a batch in a roll. Valid values are 0-100.
     * 
     */
    public Optional<Output<Integer>> batchSizePercentage() {
        return Optional.ofNullable(this.batchSizePercentage);
    }

    /**
     * Add a comment description for the roll. The comment is limited to 256 chars.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Add a comment description for the roll. The comment is limited to 256 chars.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * During the roll, if the parameter is set to true we honor PDB during the instance replacement.
     * 
     */
    @Import(name="respectPdb")
    private @Nullable Output<Boolean> respectPdb;

    /**
     * @return During the roll, if the parameter is set to true we honor PDB during the instance replacement.
     * 
     */
    public Optional<Output<Boolean>> respectPdb() {
        return Optional.ofNullable(this.respectPdb);
    }

    private OceanImportScheduledTaskTaskTaskParametersClusterRollArgs() {}

    private OceanImportScheduledTaskTaskTaskParametersClusterRollArgs(OceanImportScheduledTaskTaskTaskParametersClusterRollArgs $) {
        this.batchMinHealthyPercentage = $.batchMinHealthyPercentage;
        this.batchSizePercentage = $.batchSizePercentage;
        this.comment = $.comment;
        this.respectPdb = $.respectPdb;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanImportScheduledTaskTaskTaskParametersClusterRollArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanImportScheduledTaskTaskTaskParametersClusterRollArgs $;

        public Builder() {
            $ = new OceanImportScheduledTaskTaskTaskParametersClusterRollArgs();
        }

        public Builder(OceanImportScheduledTaskTaskTaskParametersClusterRollArgs defaults) {
            $ = new OceanImportScheduledTaskTaskTaskParametersClusterRollArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param batchMinHealthyPercentage Indicates the threshold of minimum healthy instances in single batch. If the amount of healthy instances in single batch is under the threshold, the cluster roll will fail. If exists, the parameter value will be in range of 1-100. In case of null as value, the default value in the backend will be 50%. Value of param should represent the number in percentage (%) of the batch.
         * 
         * @return builder
         * 
         */
        public Builder batchMinHealthyPercentage(@Nullable Output<Integer> batchMinHealthyPercentage) {
            $.batchMinHealthyPercentage = batchMinHealthyPercentage;
            return this;
        }

        /**
         * @param batchMinHealthyPercentage Indicates the threshold of minimum healthy instances in single batch. If the amount of healthy instances in single batch is under the threshold, the cluster roll will fail. If exists, the parameter value will be in range of 1-100. In case of null as value, the default value in the backend will be 50%. Value of param should represent the number in percentage (%) of the batch.
         * 
         * @return builder
         * 
         */
        public Builder batchMinHealthyPercentage(Integer batchMinHealthyPercentage) {
            return batchMinHealthyPercentage(Output.of(batchMinHealthyPercentage));
        }

        /**
         * @param batchSizePercentage Value as a percent to set the size of a batch in a roll. Valid values are 0-100.
         * 
         * @return builder
         * 
         */
        public Builder batchSizePercentage(@Nullable Output<Integer> batchSizePercentage) {
            $.batchSizePercentage = batchSizePercentage;
            return this;
        }

        /**
         * @param batchSizePercentage Value as a percent to set the size of a batch in a roll. Valid values are 0-100.
         * 
         * @return builder
         * 
         */
        public Builder batchSizePercentage(Integer batchSizePercentage) {
            return batchSizePercentage(Output.of(batchSizePercentage));
        }

        /**
         * @param comment Add a comment description for the roll. The comment is limited to 256 chars.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Add a comment description for the roll. The comment is limited to 256 chars.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param respectPdb During the roll, if the parameter is set to true we honor PDB during the instance replacement.
         * 
         * @return builder
         * 
         */
        public Builder respectPdb(@Nullable Output<Boolean> respectPdb) {
            $.respectPdb = respectPdb;
            return this;
        }

        /**
         * @param respectPdb During the roll, if the parameter is set to true we honor PDB during the instance replacement.
         * 
         * @return builder
         * 
         */
        public Builder respectPdb(Boolean respectPdb) {
            return respectPdb(Output.of(respectPdb));
        }

        public OceanImportScheduledTaskTaskTaskParametersClusterRollArgs build() {
            return $;
        }
    }

}
