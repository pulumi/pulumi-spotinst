// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanScheduledTaskShutdownHoursArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanScheduledTaskShutdownHoursArgs Empty = new OceanScheduledTaskShutdownHoursArgs();

    @Import(name="isEnabled")
    private @Nullable Output<Boolean> isEnabled;

    public Optional<Output<Boolean>> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }

    @Import(name="timeWindows", required=true)
    private Output<List<String>> timeWindows;

    public Output<List<String>> timeWindows() {
        return this.timeWindows;
    }

    private OceanScheduledTaskShutdownHoursArgs() {}

    private OceanScheduledTaskShutdownHoursArgs(OceanScheduledTaskShutdownHoursArgs $) {
        this.isEnabled = $.isEnabled;
        this.timeWindows = $.timeWindows;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanScheduledTaskShutdownHoursArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanScheduledTaskShutdownHoursArgs $;

        public Builder() {
            $ = new OceanScheduledTaskShutdownHoursArgs();
        }

        public Builder(OceanScheduledTaskShutdownHoursArgs defaults) {
            $ = new OceanScheduledTaskShutdownHoursArgs(Objects.requireNonNull(defaults));
        }

        public Builder isEnabled(@Nullable Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        public Builder timeWindows(Output<List<String>> timeWindows) {
            $.timeWindows = timeWindows;
            return this;
        }

        public Builder timeWindows(List<String> timeWindows) {
            return timeWindows(Output.of(timeWindows));
        }

        public Builder timeWindows(String... timeWindows) {
            return timeWindows(List.of(timeWindows));
        }

        public OceanScheduledTaskShutdownHoursArgs build() {
            $.timeWindows = Objects.requireNonNull($.timeWindows, "expected parameter 'timeWindows' to be non-null");
            return $;
        }
    }

}