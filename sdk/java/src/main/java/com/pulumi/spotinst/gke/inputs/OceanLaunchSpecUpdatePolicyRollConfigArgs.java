// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;


public final class OceanLaunchSpecUpdatePolicyRollConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanLaunchSpecUpdatePolicyRollConfigArgs Empty = new OceanLaunchSpecUpdatePolicyRollConfigArgs();

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

    private OceanLaunchSpecUpdatePolicyRollConfigArgs() {}

    private OceanLaunchSpecUpdatePolicyRollConfigArgs(OceanLaunchSpecUpdatePolicyRollConfigArgs $) {
        this.batchSizePercentage = $.batchSizePercentage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanLaunchSpecUpdatePolicyRollConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanLaunchSpecUpdatePolicyRollConfigArgs $;

        public Builder() {
            $ = new OceanLaunchSpecUpdatePolicyRollConfigArgs();
        }

        public Builder(OceanLaunchSpecUpdatePolicyRollConfigArgs defaults) {
            $ = new OceanLaunchSpecUpdatePolicyRollConfigArgs(Objects.requireNonNull(defaults));
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

        public OceanLaunchSpecUpdatePolicyRollConfigArgs build() {
            if ($.batchSizePercentage == null) {
                throw new MissingRequiredPropertyException("OceanLaunchSpecUpdatePolicyRollConfigArgs", "batchSizePercentage");
            }
            return $;
        }
    }

}
