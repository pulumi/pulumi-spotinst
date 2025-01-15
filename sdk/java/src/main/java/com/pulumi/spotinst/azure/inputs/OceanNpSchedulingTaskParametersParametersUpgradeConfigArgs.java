// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.azure.inputs.OceanNpSchedulingTaskParametersParametersUpgradeConfigRollParametersArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanNpSchedulingTaskParametersParametersUpgradeConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanNpSchedulingTaskParametersParametersUpgradeConfigArgs Empty = new OceanNpSchedulingTaskParametersParametersUpgradeConfigArgs();

    @Import(name="applyRoll")
    private @Nullable Output<Boolean> applyRoll;

    public Optional<Output<Boolean>> applyRoll() {
        return Optional.ofNullable(this.applyRoll);
    }

    @Import(name="rollParameters")
    private @Nullable Output<OceanNpSchedulingTaskParametersParametersUpgradeConfigRollParametersArgs> rollParameters;

    public Optional<Output<OceanNpSchedulingTaskParametersParametersUpgradeConfigRollParametersArgs>> rollParameters() {
        return Optional.ofNullable(this.rollParameters);
    }

    @Import(name="scopeVersion")
    private @Nullable Output<String> scopeVersion;

    public Optional<Output<String>> scopeVersion() {
        return Optional.ofNullable(this.scopeVersion);
    }

    private OceanNpSchedulingTaskParametersParametersUpgradeConfigArgs() {}

    private OceanNpSchedulingTaskParametersParametersUpgradeConfigArgs(OceanNpSchedulingTaskParametersParametersUpgradeConfigArgs $) {
        this.applyRoll = $.applyRoll;
        this.rollParameters = $.rollParameters;
        this.scopeVersion = $.scopeVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanNpSchedulingTaskParametersParametersUpgradeConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanNpSchedulingTaskParametersParametersUpgradeConfigArgs $;

        public Builder() {
            $ = new OceanNpSchedulingTaskParametersParametersUpgradeConfigArgs();
        }

        public Builder(OceanNpSchedulingTaskParametersParametersUpgradeConfigArgs defaults) {
            $ = new OceanNpSchedulingTaskParametersParametersUpgradeConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder applyRoll(@Nullable Output<Boolean> applyRoll) {
            $.applyRoll = applyRoll;
            return this;
        }

        public Builder applyRoll(Boolean applyRoll) {
            return applyRoll(Output.of(applyRoll));
        }

        public Builder rollParameters(@Nullable Output<OceanNpSchedulingTaskParametersParametersUpgradeConfigRollParametersArgs> rollParameters) {
            $.rollParameters = rollParameters;
            return this;
        }

        public Builder rollParameters(OceanNpSchedulingTaskParametersParametersUpgradeConfigRollParametersArgs rollParameters) {
            return rollParameters(Output.of(rollParameters));
        }

        public Builder scopeVersion(@Nullable Output<String> scopeVersion) {
            $.scopeVersion = scopeVersion;
            return this;
        }

        public Builder scopeVersion(String scopeVersion) {
            return scopeVersion(Output.of(scopeVersion));
        }

        public OceanNpSchedulingTaskParametersParametersUpgradeConfigArgs build() {
            return $;
        }
    }

}
