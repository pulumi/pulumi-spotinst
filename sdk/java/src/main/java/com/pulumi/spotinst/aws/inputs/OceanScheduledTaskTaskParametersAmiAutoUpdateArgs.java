// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.aws.inputs.OceanScheduledTaskTaskParametersAmiAutoUpdateAmiAutoUpdateClusterRollArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanScheduledTaskTaskParametersAmiAutoUpdateArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanScheduledTaskTaskParametersAmiAutoUpdateArgs Empty = new OceanScheduledTaskTaskParametersAmiAutoUpdateArgs();

    @Import(name="amiAutoUpdateClusterRoll")
    private @Nullable Output<OceanScheduledTaskTaskParametersAmiAutoUpdateAmiAutoUpdateClusterRollArgs> amiAutoUpdateClusterRoll;

    public Optional<Output<OceanScheduledTaskTaskParametersAmiAutoUpdateAmiAutoUpdateClusterRollArgs>> amiAutoUpdateClusterRoll() {
        return Optional.ofNullable(this.amiAutoUpdateClusterRoll);
    }

    @Import(name="applyRoll")
    private @Nullable Output<Boolean> applyRoll;

    public Optional<Output<Boolean>> applyRoll() {
        return Optional.ofNullable(this.applyRoll);
    }

    @Import(name="minorVersion")
    private @Nullable Output<Boolean> minorVersion;

    public Optional<Output<Boolean>> minorVersion() {
        return Optional.ofNullable(this.minorVersion);
    }

    @Import(name="patch")
    private @Nullable Output<Boolean> patch;

    public Optional<Output<Boolean>> patch() {
        return Optional.ofNullable(this.patch);
    }

    private OceanScheduledTaskTaskParametersAmiAutoUpdateArgs() {}

    private OceanScheduledTaskTaskParametersAmiAutoUpdateArgs(OceanScheduledTaskTaskParametersAmiAutoUpdateArgs $) {
        this.amiAutoUpdateClusterRoll = $.amiAutoUpdateClusterRoll;
        this.applyRoll = $.applyRoll;
        this.minorVersion = $.minorVersion;
        this.patch = $.patch;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanScheduledTaskTaskParametersAmiAutoUpdateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanScheduledTaskTaskParametersAmiAutoUpdateArgs $;

        public Builder() {
            $ = new OceanScheduledTaskTaskParametersAmiAutoUpdateArgs();
        }

        public Builder(OceanScheduledTaskTaskParametersAmiAutoUpdateArgs defaults) {
            $ = new OceanScheduledTaskTaskParametersAmiAutoUpdateArgs(Objects.requireNonNull(defaults));
        }

        public Builder amiAutoUpdateClusterRoll(@Nullable Output<OceanScheduledTaskTaskParametersAmiAutoUpdateAmiAutoUpdateClusterRollArgs> amiAutoUpdateClusterRoll) {
            $.amiAutoUpdateClusterRoll = amiAutoUpdateClusterRoll;
            return this;
        }

        public Builder amiAutoUpdateClusterRoll(OceanScheduledTaskTaskParametersAmiAutoUpdateAmiAutoUpdateClusterRollArgs amiAutoUpdateClusterRoll) {
            return amiAutoUpdateClusterRoll(Output.of(amiAutoUpdateClusterRoll));
        }

        public Builder applyRoll(@Nullable Output<Boolean> applyRoll) {
            $.applyRoll = applyRoll;
            return this;
        }

        public Builder applyRoll(Boolean applyRoll) {
            return applyRoll(Output.of(applyRoll));
        }

        public Builder minorVersion(@Nullable Output<Boolean> minorVersion) {
            $.minorVersion = minorVersion;
            return this;
        }

        public Builder minorVersion(Boolean minorVersion) {
            return minorVersion(Output.of(minorVersion));
        }

        public Builder patch(@Nullable Output<Boolean> patch) {
            $.patch = patch;
            return this;
        }

        public Builder patch(Boolean patch) {
            return patch(Output.of(patch));
        }

        public OceanScheduledTaskTaskParametersAmiAutoUpdateArgs build() {
            return $;
        }
    }

}