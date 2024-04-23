// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.gke.inputs.OceanImportScheduledTaskShutdownHoursArgs;
import com.pulumi.spotinst.gke.inputs.OceanImportScheduledTaskTaskArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanImportScheduledTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanImportScheduledTaskArgs Empty = new OceanImportScheduledTaskArgs();

    @Import(name="shutdownHours")
    private @Nullable Output<OceanImportScheduledTaskShutdownHoursArgs> shutdownHours;

    public Optional<Output<OceanImportScheduledTaskShutdownHoursArgs>> shutdownHours() {
        return Optional.ofNullable(this.shutdownHours);
    }

    @Import(name="tasks")
    private @Nullable Output<List<OceanImportScheduledTaskTaskArgs>> tasks;

    public Optional<Output<List<OceanImportScheduledTaskTaskArgs>>> tasks() {
        return Optional.ofNullable(this.tasks);
    }

    private OceanImportScheduledTaskArgs() {}

    private OceanImportScheduledTaskArgs(OceanImportScheduledTaskArgs $) {
        this.shutdownHours = $.shutdownHours;
        this.tasks = $.tasks;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanImportScheduledTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanImportScheduledTaskArgs $;

        public Builder() {
            $ = new OceanImportScheduledTaskArgs();
        }

        public Builder(OceanImportScheduledTaskArgs defaults) {
            $ = new OceanImportScheduledTaskArgs(Objects.requireNonNull(defaults));
        }

        public Builder shutdownHours(@Nullable Output<OceanImportScheduledTaskShutdownHoursArgs> shutdownHours) {
            $.shutdownHours = shutdownHours;
            return this;
        }

        public Builder shutdownHours(OceanImportScheduledTaskShutdownHoursArgs shutdownHours) {
            return shutdownHours(Output.of(shutdownHours));
        }

        public Builder tasks(@Nullable Output<List<OceanImportScheduledTaskTaskArgs>> tasks) {
            $.tasks = tasks;
            return this;
        }

        public Builder tasks(List<OceanImportScheduledTaskTaskArgs> tasks) {
            return tasks(Output.of(tasks));
        }

        public Builder tasks(OceanImportScheduledTaskTaskArgs... tasks) {
            return tasks(List.of(tasks));
        }

        public OceanImportScheduledTaskArgs build() {
            return $;
        }
    }

}
