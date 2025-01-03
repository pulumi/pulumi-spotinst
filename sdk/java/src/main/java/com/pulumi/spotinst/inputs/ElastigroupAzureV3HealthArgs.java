// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupAzureV3HealthArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupAzureV3HealthArgs Empty = new ElastigroupAzureV3HealthArgs();

    @Import(name="autoHealing")
    private @Nullable Output<Boolean> autoHealing;

    public Optional<Output<Boolean>> autoHealing() {
        return Optional.ofNullable(this.autoHealing);
    }

    @Import(name="gracePeriod")
    private @Nullable Output<Integer> gracePeriod;

    public Optional<Output<Integer>> gracePeriod() {
        return Optional.ofNullable(this.gracePeriod);
    }

    @Import(name="healthCheckTypes")
    private @Nullable Output<List<String>> healthCheckTypes;

    public Optional<Output<List<String>>> healthCheckTypes() {
        return Optional.ofNullable(this.healthCheckTypes);
    }

    @Import(name="unhealthyDuration")
    private @Nullable Output<Integer> unhealthyDuration;

    public Optional<Output<Integer>> unhealthyDuration() {
        return Optional.ofNullable(this.unhealthyDuration);
    }

    private ElastigroupAzureV3HealthArgs() {}

    private ElastigroupAzureV3HealthArgs(ElastigroupAzureV3HealthArgs $) {
        this.autoHealing = $.autoHealing;
        this.gracePeriod = $.gracePeriod;
        this.healthCheckTypes = $.healthCheckTypes;
        this.unhealthyDuration = $.unhealthyDuration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupAzureV3HealthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupAzureV3HealthArgs $;

        public Builder() {
            $ = new ElastigroupAzureV3HealthArgs();
        }

        public Builder(ElastigroupAzureV3HealthArgs defaults) {
            $ = new ElastigroupAzureV3HealthArgs(Objects.requireNonNull(defaults));
        }

        public Builder autoHealing(@Nullable Output<Boolean> autoHealing) {
            $.autoHealing = autoHealing;
            return this;
        }

        public Builder autoHealing(Boolean autoHealing) {
            return autoHealing(Output.of(autoHealing));
        }

        public Builder gracePeriod(@Nullable Output<Integer> gracePeriod) {
            $.gracePeriod = gracePeriod;
            return this;
        }

        public Builder gracePeriod(Integer gracePeriod) {
            return gracePeriod(Output.of(gracePeriod));
        }

        public Builder healthCheckTypes(@Nullable Output<List<String>> healthCheckTypes) {
            $.healthCheckTypes = healthCheckTypes;
            return this;
        }

        public Builder healthCheckTypes(List<String> healthCheckTypes) {
            return healthCheckTypes(Output.of(healthCheckTypes));
        }

        public Builder healthCheckTypes(String... healthCheckTypes) {
            return healthCheckTypes(List.of(healthCheckTypes));
        }

        public Builder unhealthyDuration(@Nullable Output<Integer> unhealthyDuration) {
            $.unhealthyDuration = unhealthyDuration;
            return this;
        }

        public Builder unhealthyDuration(Integer unhealthyDuration) {
            return unhealthyDuration(Output.of(unhealthyDuration));
        }

        public ElastigroupAzureV3HealthArgs build() {
            return $;
        }
    }

}
