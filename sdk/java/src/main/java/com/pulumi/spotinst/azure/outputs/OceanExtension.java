// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanExtension {
    /**
     * @return API version of the extension.
     * 
     */
    private @Nullable String apiVersion;
    /**
     * @return Toggles whether auto upgrades are allowed.
     * 
     */
    private @Nullable Boolean minorVersionAutoUpgrade;
    /**
     * @return Name of the Load Balancer.
     * 
     */
    private @Nullable String name;
    /**
     * @return Image publisher.
     * 
     */
    private @Nullable String publisher;
    /**
     * @return The type of load balancer. Supported value: `loadBalancer`
     * 
     */
    private @Nullable String type;

    private OceanExtension() {}
    /**
     * @return API version of the extension.
     * 
     */
    public Optional<String> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * @return Toggles whether auto upgrades are allowed.
     * 
     */
    public Optional<Boolean> minorVersionAutoUpgrade() {
        return Optional.ofNullable(this.minorVersionAutoUpgrade);
    }
    /**
     * @return Name of the Load Balancer.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Image publisher.
     * 
     */
    public Optional<String> publisher() {
        return Optional.ofNullable(this.publisher);
    }
    /**
     * @return The type of load balancer. Supported value: `loadBalancer`
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanExtension defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apiVersion;
        private @Nullable Boolean minorVersionAutoUpgrade;
        private @Nullable String name;
        private @Nullable String publisher;
        private @Nullable String type;
        public Builder() {}
        public Builder(OceanExtension defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.minorVersionAutoUpgrade = defaults.minorVersionAutoUpgrade;
    	      this.name = defaults.name;
    	      this.publisher = defaults.publisher;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        @CustomType.Setter
        public Builder minorVersionAutoUpgrade(@Nullable Boolean minorVersionAutoUpgrade) {
            this.minorVersionAutoUpgrade = minorVersionAutoUpgrade;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder publisher(@Nullable String publisher) {
            this.publisher = publisher;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public OceanExtension build() {
            final var o = new OceanExtension();
            o.apiVersion = apiVersion;
            o.minorVersionAutoUpgrade = minorVersionAutoUpgrade;
            o.name = name;
            o.publisher = publisher;
            o.type = type;
            return o;
        }
    }
}