// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanLaunchSpecNetworkInterfaceAccessConfig {
    /**
     * @return The name of the access configuration.
     * 
     */
    private @Nullable String name;
    /**
     * @return The type of the access configuration.
     * 
     */
    private @Nullable String type;

    private OceanLaunchSpecNetworkInterfaceAccessConfig() {}
    /**
     * @return The name of the access configuration.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The type of the access configuration.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanLaunchSpecNetworkInterfaceAccessConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable String type;
        public Builder() {}
        public Builder(OceanLaunchSpecNetworkInterfaceAccessConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public OceanLaunchSpecNetworkInterfaceAccessConfig build() {
            final var _resultValue = new OceanLaunchSpecNetworkInterfaceAccessConfig();
            _resultValue.name = name;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
