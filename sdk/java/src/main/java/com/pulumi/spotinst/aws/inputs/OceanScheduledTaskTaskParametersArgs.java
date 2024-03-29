// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.aws.inputs.OceanScheduledTaskTaskParametersAmiAutoUpdateArgs;
import com.pulumi.spotinst.aws.inputs.OceanScheduledTaskTaskParametersParametersClusterRollArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanScheduledTaskTaskParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanScheduledTaskTaskParametersArgs Empty = new OceanScheduledTaskTaskParametersArgs();

    @Import(name="amiAutoUpdate")
    private @Nullable Output<OceanScheduledTaskTaskParametersAmiAutoUpdateArgs> amiAutoUpdate;

    public Optional<Output<OceanScheduledTaskTaskParametersAmiAutoUpdateArgs>> amiAutoUpdate() {
        return Optional.ofNullable(this.amiAutoUpdate);
    }

    @Import(name="parametersClusterRoll")
    private @Nullable Output<OceanScheduledTaskTaskParametersParametersClusterRollArgs> parametersClusterRoll;

    public Optional<Output<OceanScheduledTaskTaskParametersParametersClusterRollArgs>> parametersClusterRoll() {
        return Optional.ofNullable(this.parametersClusterRoll);
    }

    private OceanScheduledTaskTaskParametersArgs() {}

    private OceanScheduledTaskTaskParametersArgs(OceanScheduledTaskTaskParametersArgs $) {
        this.amiAutoUpdate = $.amiAutoUpdate;
        this.parametersClusterRoll = $.parametersClusterRoll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanScheduledTaskTaskParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanScheduledTaskTaskParametersArgs $;

        public Builder() {
            $ = new OceanScheduledTaskTaskParametersArgs();
        }

        public Builder(OceanScheduledTaskTaskParametersArgs defaults) {
            $ = new OceanScheduledTaskTaskParametersArgs(Objects.requireNonNull(defaults));
        }

        public Builder amiAutoUpdate(@Nullable Output<OceanScheduledTaskTaskParametersAmiAutoUpdateArgs> amiAutoUpdate) {
            $.amiAutoUpdate = amiAutoUpdate;
            return this;
        }

        public Builder amiAutoUpdate(OceanScheduledTaskTaskParametersAmiAutoUpdateArgs amiAutoUpdate) {
            return amiAutoUpdate(Output.of(amiAutoUpdate));
        }

        public Builder parametersClusterRoll(@Nullable Output<OceanScheduledTaskTaskParametersParametersClusterRollArgs> parametersClusterRoll) {
            $.parametersClusterRoll = parametersClusterRoll;
            return this;
        }

        public Builder parametersClusterRoll(OceanScheduledTaskTaskParametersParametersClusterRollArgs parametersClusterRoll) {
            return parametersClusterRoll(Output.of(parametersClusterRoll));
        }

        public OceanScheduledTaskTaskParametersArgs build() {
            return $;
        }
    }

}
