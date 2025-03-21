// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.azure.inputs.OceanNpVirtualNodeGroupSchedulingShutdownHoursArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanNpVirtualNodeGroupSchedulingArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanNpVirtualNodeGroupSchedulingArgs Empty = new OceanNpVirtualNodeGroupSchedulingArgs();

    /**
     * An object used to specify times that the nodes in the virtual node group will be stopped.
     * 
     */
    @Import(name="shutdownHours")
    private @Nullable Output<OceanNpVirtualNodeGroupSchedulingShutdownHoursArgs> shutdownHours;

    /**
     * @return An object used to specify times that the nodes in the virtual node group will be stopped.
     * 
     */
    public Optional<Output<OceanNpVirtualNodeGroupSchedulingShutdownHoursArgs>> shutdownHours() {
        return Optional.ofNullable(this.shutdownHours);
    }

    private OceanNpVirtualNodeGroupSchedulingArgs() {}

    private OceanNpVirtualNodeGroupSchedulingArgs(OceanNpVirtualNodeGroupSchedulingArgs $) {
        this.shutdownHours = $.shutdownHours;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanNpVirtualNodeGroupSchedulingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanNpVirtualNodeGroupSchedulingArgs $;

        public Builder() {
            $ = new OceanNpVirtualNodeGroupSchedulingArgs();
        }

        public Builder(OceanNpVirtualNodeGroupSchedulingArgs defaults) {
            $ = new OceanNpVirtualNodeGroupSchedulingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param shutdownHours An object used to specify times that the nodes in the virtual node group will be stopped.
         * 
         * @return builder
         * 
         */
        public Builder shutdownHours(@Nullable Output<OceanNpVirtualNodeGroupSchedulingShutdownHoursArgs> shutdownHours) {
            $.shutdownHours = shutdownHours;
            return this;
        }

        /**
         * @param shutdownHours An object used to specify times that the nodes in the virtual node group will be stopped.
         * 
         * @return builder
         * 
         */
        public Builder shutdownHours(OceanNpVirtualNodeGroupSchedulingShutdownHoursArgs shutdownHours) {
            return shutdownHours(Output.of(shutdownHours));
        }

        public OceanNpVirtualNodeGroupSchedulingArgs build() {
            return $;
        }
    }

}
