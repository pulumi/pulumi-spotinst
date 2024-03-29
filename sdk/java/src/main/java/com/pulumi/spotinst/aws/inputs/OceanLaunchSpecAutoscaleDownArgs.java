// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanLaunchSpecAutoscaleDownArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanLaunchSpecAutoscaleDownArgs Empty = new OceanLaunchSpecAutoscaleDownArgs();

    /**
     * The maximum percentage allowed to scale down in a single scaling action on the nodes running in a specific VNG. Allowed only if maxScaleDownPercentage is set to null at the cluster level. Number between [0.1-100].
     * 
     */
    @Import(name="maxScaleDownPercentage")
    private @Nullable Output<Double> maxScaleDownPercentage;

    /**
     * @return The maximum percentage allowed to scale down in a single scaling action on the nodes running in a specific VNG. Allowed only if maxScaleDownPercentage is set to null at the cluster level. Number between [0.1-100].
     * 
     */
    public Optional<Output<Double>> maxScaleDownPercentage() {
        return Optional.ofNullable(this.maxScaleDownPercentage);
    }

    private OceanLaunchSpecAutoscaleDownArgs() {}

    private OceanLaunchSpecAutoscaleDownArgs(OceanLaunchSpecAutoscaleDownArgs $) {
        this.maxScaleDownPercentage = $.maxScaleDownPercentage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanLaunchSpecAutoscaleDownArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanLaunchSpecAutoscaleDownArgs $;

        public Builder() {
            $ = new OceanLaunchSpecAutoscaleDownArgs();
        }

        public Builder(OceanLaunchSpecAutoscaleDownArgs defaults) {
            $ = new OceanLaunchSpecAutoscaleDownArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxScaleDownPercentage The maximum percentage allowed to scale down in a single scaling action on the nodes running in a specific VNG. Allowed only if maxScaleDownPercentage is set to null at the cluster level. Number between [0.1-100].
         * 
         * @return builder
         * 
         */
        public Builder maxScaleDownPercentage(@Nullable Output<Double> maxScaleDownPercentage) {
            $.maxScaleDownPercentage = maxScaleDownPercentage;
            return this;
        }

        /**
         * @param maxScaleDownPercentage The maximum percentage allowed to scale down in a single scaling action on the nodes running in a specific VNG. Allowed only if maxScaleDownPercentage is set to null at the cluster level. Number between [0.1-100].
         * 
         * @return builder
         * 
         */
        public Builder maxScaleDownPercentage(Double maxScaleDownPercentage) {
            return maxScaleDownPercentage(Output.of(maxScaleDownPercentage));
        }

        public OceanLaunchSpecAutoscaleDownArgs build() {
            return $;
        }
    }

}
