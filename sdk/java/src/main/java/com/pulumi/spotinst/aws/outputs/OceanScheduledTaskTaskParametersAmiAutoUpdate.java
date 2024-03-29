// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.spotinst.aws.outputs.OceanScheduledTaskTaskParametersAmiAutoUpdateAmiAutoUpdateClusterRoll;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanScheduledTaskTaskParametersAmiAutoUpdate {
    private @Nullable OceanScheduledTaskTaskParametersAmiAutoUpdateAmiAutoUpdateClusterRoll amiAutoUpdateClusterRoll;
    private @Nullable Boolean applyRoll;
    private @Nullable Boolean minorVersion;
    private @Nullable Boolean patch;

    private OceanScheduledTaskTaskParametersAmiAutoUpdate() {}
    public Optional<OceanScheduledTaskTaskParametersAmiAutoUpdateAmiAutoUpdateClusterRoll> amiAutoUpdateClusterRoll() {
        return Optional.ofNullable(this.amiAutoUpdateClusterRoll);
    }
    public Optional<Boolean> applyRoll() {
        return Optional.ofNullable(this.applyRoll);
    }
    public Optional<Boolean> minorVersion() {
        return Optional.ofNullable(this.minorVersion);
    }
    public Optional<Boolean> patch() {
        return Optional.ofNullable(this.patch);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanScheduledTaskTaskParametersAmiAutoUpdate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable OceanScheduledTaskTaskParametersAmiAutoUpdateAmiAutoUpdateClusterRoll amiAutoUpdateClusterRoll;
        private @Nullable Boolean applyRoll;
        private @Nullable Boolean minorVersion;
        private @Nullable Boolean patch;
        public Builder() {}
        public Builder(OceanScheduledTaskTaskParametersAmiAutoUpdate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amiAutoUpdateClusterRoll = defaults.amiAutoUpdateClusterRoll;
    	      this.applyRoll = defaults.applyRoll;
    	      this.minorVersion = defaults.minorVersion;
    	      this.patch = defaults.patch;
        }

        @CustomType.Setter
        public Builder amiAutoUpdateClusterRoll(@Nullable OceanScheduledTaskTaskParametersAmiAutoUpdateAmiAutoUpdateClusterRoll amiAutoUpdateClusterRoll) {

            this.amiAutoUpdateClusterRoll = amiAutoUpdateClusterRoll;
            return this;
        }
        @CustomType.Setter
        public Builder applyRoll(@Nullable Boolean applyRoll) {

            this.applyRoll = applyRoll;
            return this;
        }
        @CustomType.Setter
        public Builder minorVersion(@Nullable Boolean minorVersion) {

            this.minorVersion = minorVersion;
            return this;
        }
        @CustomType.Setter
        public Builder patch(@Nullable Boolean patch) {

            this.patch = patch;
            return this;
        }
        public OceanScheduledTaskTaskParametersAmiAutoUpdate build() {
            final var _resultValue = new OceanScheduledTaskTaskParametersAmiAutoUpdate();
            _resultValue.amiAutoUpdateClusterRoll = amiAutoUpdateClusterRoll;
            _resultValue.applyRoll = applyRoll;
            _resultValue.minorVersion = minorVersion;
            _resultValue.patch = patch;
            return _resultValue;
        }
    }
}
