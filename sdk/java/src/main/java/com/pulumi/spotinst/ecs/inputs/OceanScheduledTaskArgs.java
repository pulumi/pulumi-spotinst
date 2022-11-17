// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.ecs.inputs.OceanScheduledTaskShutdownHoursArgs;
import com.pulumi.spotinst.ecs.inputs.OceanScheduledTaskTaskArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanScheduledTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanScheduledTaskArgs Empty = new OceanScheduledTaskArgs();

    /**
     * Set shutdown hours for cluster object.
     * 
     */
    @Import(name="shutdownHours")
    private @Nullable Output<OceanScheduledTaskShutdownHoursArgs> shutdownHours;

    /**
     * @return Set shutdown hours for cluster object.
     * 
     */
    public Optional<Output<OceanScheduledTaskShutdownHoursArgs>> shutdownHours() {
        return Optional.ofNullable(this.shutdownHours);
    }

    /**
     * The scheduling tasks for the cluster.
     * 
     */
    @Import(name="tasks")
    private @Nullable Output<List<OceanScheduledTaskTaskArgs>> tasks;

    /**
     * @return The scheduling tasks for the cluster.
     * 
     */
    public Optional<Output<List<OceanScheduledTaskTaskArgs>>> tasks() {
        return Optional.ofNullable(this.tasks);
    }

    private OceanScheduledTaskArgs() {}

    private OceanScheduledTaskArgs(OceanScheduledTaskArgs $) {
        this.shutdownHours = $.shutdownHours;
        this.tasks = $.tasks;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanScheduledTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanScheduledTaskArgs $;

        public Builder() {
            $ = new OceanScheduledTaskArgs();
        }

        public Builder(OceanScheduledTaskArgs defaults) {
            $ = new OceanScheduledTaskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param shutdownHours Set shutdown hours for cluster object.
         * 
         * @return builder
         * 
         */
        public Builder shutdownHours(@Nullable Output<OceanScheduledTaskShutdownHoursArgs> shutdownHours) {
            $.shutdownHours = shutdownHours;
            return this;
        }

        /**
         * @param shutdownHours Set shutdown hours for cluster object.
         * 
         * @return builder
         * 
         */
        public Builder shutdownHours(OceanScheduledTaskShutdownHoursArgs shutdownHours) {
            return shutdownHours(Output.of(shutdownHours));
        }

        /**
         * @param tasks The scheduling tasks for the cluster.
         * 
         * @return builder
         * 
         */
        public Builder tasks(@Nullable Output<List<OceanScheduledTaskTaskArgs>> tasks) {
            $.tasks = tasks;
            return this;
        }

        /**
         * @param tasks The scheduling tasks for the cluster.
         * 
         * @return builder
         * 
         */
        public Builder tasks(List<OceanScheduledTaskTaskArgs> tasks) {
            return tasks(Output.of(tasks));
        }

        /**
         * @param tasks The scheduling tasks for the cluster.
         * 
         * @return builder
         * 
         */
        public Builder tasks(OceanScheduledTaskTaskArgs... tasks) {
            return tasks(List.of(tasks));
        }

        public OceanScheduledTaskArgs build() {
            return $;
        }
    }

}
