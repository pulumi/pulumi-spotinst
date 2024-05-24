// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanAutoscalerAutoscaleDownArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanAutoscalerAutoscaleDownArgs Empty = new OceanAutoscalerAutoscaleDownArgs();

    /**
     * Would represent the maximum % to scale-down.
     * 
     */
    @Import(name="maxScaleDownPercentage")
    private @Nullable Output<Double> maxScaleDownPercentage;

    /**
     * @return Would represent the maximum % to scale-down.
     * 
     */
    public Optional<Output<Double>> maxScaleDownPercentage() {
        return Optional.ofNullable(this.maxScaleDownPercentage);
    }

    private OceanAutoscalerAutoscaleDownArgs() {}

    private OceanAutoscalerAutoscaleDownArgs(OceanAutoscalerAutoscaleDownArgs $) {
        this.maxScaleDownPercentage = $.maxScaleDownPercentage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanAutoscalerAutoscaleDownArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanAutoscalerAutoscaleDownArgs $;

        public Builder() {
            $ = new OceanAutoscalerAutoscaleDownArgs();
        }

        public Builder(OceanAutoscalerAutoscaleDownArgs defaults) {
            $ = new OceanAutoscalerAutoscaleDownArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxScaleDownPercentage Would represent the maximum % to scale-down.
         * 
         * @return builder
         * 
         */
        public Builder maxScaleDownPercentage(@Nullable Output<Double> maxScaleDownPercentage) {
            $.maxScaleDownPercentage = maxScaleDownPercentage;
            return this;
        }

        /**
         * @param maxScaleDownPercentage Would represent the maximum % to scale-down.
         * 
         * @return builder
         * 
         */
        public Builder maxScaleDownPercentage(Double maxScaleDownPercentage) {
            return maxScaleDownPercentage(Output.of(maxScaleDownPercentage));
        }

        public OceanAutoscalerAutoscaleDownArgs build() {
            return $;
        }
    }

}
