// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanImportStrategyArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanImportStrategyArgs Empty = new OceanImportStrategyArgs();

    /**
     * The draining timeout (in seconds) before terminating the instance.
     * 
     */
    @Import(name="drainingTimeout")
    private @Nullable Output<Integer> drainingTimeout;

    /**
     * @return The draining timeout (in seconds) before terminating the instance.
     * 
     */
    public Optional<Output<Integer>> drainingTimeout() {
        return Optional.ofNullable(this.drainingTimeout);
    }

    @Import(name="preemptiblePercentage")
    private @Nullable Output<Integer> preemptiblePercentage;

    public Optional<Output<Integer>> preemptiblePercentage() {
        return Optional.ofNullable(this.preemptiblePercentage);
    }

    @Import(name="provisioningModel")
    private @Nullable Output<String> provisioningModel;

    public Optional<Output<String>> provisioningModel() {
        return Optional.ofNullable(this.provisioningModel);
    }

    private OceanImportStrategyArgs() {}

    private OceanImportStrategyArgs(OceanImportStrategyArgs $) {
        this.drainingTimeout = $.drainingTimeout;
        this.preemptiblePercentage = $.preemptiblePercentage;
        this.provisioningModel = $.provisioningModel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanImportStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanImportStrategyArgs $;

        public Builder() {
            $ = new OceanImportStrategyArgs();
        }

        public Builder(OceanImportStrategyArgs defaults) {
            $ = new OceanImportStrategyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param drainingTimeout The draining timeout (in seconds) before terminating the instance.
         * 
         * @return builder
         * 
         */
        public Builder drainingTimeout(@Nullable Output<Integer> drainingTimeout) {
            $.drainingTimeout = drainingTimeout;
            return this;
        }

        /**
         * @param drainingTimeout The draining timeout (in seconds) before terminating the instance.
         * 
         * @return builder
         * 
         */
        public Builder drainingTimeout(Integer drainingTimeout) {
            return drainingTimeout(Output.of(drainingTimeout));
        }

        public Builder preemptiblePercentage(@Nullable Output<Integer> preemptiblePercentage) {
            $.preemptiblePercentage = preemptiblePercentage;
            return this;
        }

        public Builder preemptiblePercentage(Integer preemptiblePercentage) {
            return preemptiblePercentage(Output.of(preemptiblePercentage));
        }

        public Builder provisioningModel(@Nullable Output<String> provisioningModel) {
            $.provisioningModel = provisioningModel;
            return this;
        }

        public Builder provisioningModel(String provisioningModel) {
            return provisioningModel(Output.of(provisioningModel));
        }

        public OceanImportStrategyArgs build() {
            return $;
        }
    }

}
