// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.azure.inputs.OceanNpSchedulingTaskParametersParametersClusterRollArgs;
import com.pulumi.spotinst.azure.inputs.OceanNpSchedulingTaskParametersParametersUpgradeConfigArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanNpSchedulingTaskParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanNpSchedulingTaskParametersArgs Empty = new OceanNpSchedulingTaskParametersArgs();

    @Import(name="parametersClusterRoll")
    private @Nullable Output<OceanNpSchedulingTaskParametersParametersClusterRollArgs> parametersClusterRoll;

    public Optional<Output<OceanNpSchedulingTaskParametersParametersClusterRollArgs>> parametersClusterRoll() {
        return Optional.ofNullable(this.parametersClusterRoll);
    }

    @Import(name="parametersUpgradeConfig")
    private @Nullable Output<OceanNpSchedulingTaskParametersParametersUpgradeConfigArgs> parametersUpgradeConfig;

    public Optional<Output<OceanNpSchedulingTaskParametersParametersUpgradeConfigArgs>> parametersUpgradeConfig() {
        return Optional.ofNullable(this.parametersUpgradeConfig);
    }

    private OceanNpSchedulingTaskParametersArgs() {}

    private OceanNpSchedulingTaskParametersArgs(OceanNpSchedulingTaskParametersArgs $) {
        this.parametersClusterRoll = $.parametersClusterRoll;
        this.parametersUpgradeConfig = $.parametersUpgradeConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanNpSchedulingTaskParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanNpSchedulingTaskParametersArgs $;

        public Builder() {
            $ = new OceanNpSchedulingTaskParametersArgs();
        }

        public Builder(OceanNpSchedulingTaskParametersArgs defaults) {
            $ = new OceanNpSchedulingTaskParametersArgs(Objects.requireNonNull(defaults));
        }

        public Builder parametersClusterRoll(@Nullable Output<OceanNpSchedulingTaskParametersParametersClusterRollArgs> parametersClusterRoll) {
            $.parametersClusterRoll = parametersClusterRoll;
            return this;
        }

        public Builder parametersClusterRoll(OceanNpSchedulingTaskParametersParametersClusterRollArgs parametersClusterRoll) {
            return parametersClusterRoll(Output.of(parametersClusterRoll));
        }

        public Builder parametersUpgradeConfig(@Nullable Output<OceanNpSchedulingTaskParametersParametersUpgradeConfigArgs> parametersUpgradeConfig) {
            $.parametersUpgradeConfig = parametersUpgradeConfig;
            return this;
        }

        public Builder parametersUpgradeConfig(OceanNpSchedulingTaskParametersParametersUpgradeConfigArgs parametersUpgradeConfig) {
            return parametersUpgradeConfig(Output.of(parametersUpgradeConfig));
        }

        public OceanNpSchedulingTaskParametersArgs build() {
            return $;
        }
    }

}
