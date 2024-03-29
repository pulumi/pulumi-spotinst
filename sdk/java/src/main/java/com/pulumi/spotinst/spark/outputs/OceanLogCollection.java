// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.spark.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanLogCollection {
    /**
     * @return - Enable/Disable collecting driver and executor logs. When enabled, logs are stored by NetApp and can be downloaded from the Spot console web interface. The logs are deleted after 30 days.
     * 
     */
    private @Nullable Boolean collectAppLogs;

    private OceanLogCollection() {}
    /**
     * @return - Enable/Disable collecting driver and executor logs. When enabled, logs are stored by NetApp and can be downloaded from the Spot console web interface. The logs are deleted after 30 days.
     * 
     */
    public Optional<Boolean> collectAppLogs() {
        return Optional.ofNullable(this.collectAppLogs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanLogCollection defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean collectAppLogs;
        public Builder() {}
        public Builder(OceanLogCollection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collectAppLogs = defaults.collectAppLogs;
        }

        @CustomType.Setter
        public Builder collectAppLogs(@Nullable Boolean collectAppLogs) {

            this.collectAppLogs = collectAppLogs;
            return this;
        }
        public OceanLogCollection build() {
            final var _resultValue = new OceanLogCollection();
            _resultValue.collectAppLogs = collectAppLogs;
            return _resultValue;
        }
    }
}
