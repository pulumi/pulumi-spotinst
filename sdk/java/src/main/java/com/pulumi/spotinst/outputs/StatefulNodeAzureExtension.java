// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class StatefulNodeAzureExtension {
    private String apiVersion;
    private Boolean minorVersionAutoUpgrade;
    private String name;
    private @Nullable Map<String,Object> protectedSettings;
    private @Nullable Map<String,Object> publicSettings;
    private String publisher;
    private String type;

    private StatefulNodeAzureExtension() {}
    public String apiVersion() {
        return this.apiVersion;
    }
    public Boolean minorVersionAutoUpgrade() {
        return this.minorVersionAutoUpgrade;
    }
    public String name() {
        return this.name;
    }
    public Map<String,Object> protectedSettings() {
        return this.protectedSettings == null ? Map.of() : this.protectedSettings;
    }
    public Map<String,Object> publicSettings() {
        return this.publicSettings == null ? Map.of() : this.publicSettings;
    }
    public String publisher() {
        return this.publisher;
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulNodeAzureExtension defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String apiVersion;
        private Boolean minorVersionAutoUpgrade;
        private String name;
        private @Nullable Map<String,Object> protectedSettings;
        private @Nullable Map<String,Object> publicSettings;
        private String publisher;
        private String type;
        public Builder() {}
        public Builder(StatefulNodeAzureExtension defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.minorVersionAutoUpgrade = defaults.minorVersionAutoUpgrade;
    	      this.name = defaults.name;
    	      this.protectedSettings = defaults.protectedSettings;
    	      this.publicSettings = defaults.publicSettings;
    	      this.publisher = defaults.publisher;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder apiVersion(String apiVersion) {
            this.apiVersion = Objects.requireNonNull(apiVersion);
            return this;
        }
        @CustomType.Setter
        public Builder minorVersionAutoUpgrade(Boolean minorVersionAutoUpgrade) {
            this.minorVersionAutoUpgrade = Objects.requireNonNull(minorVersionAutoUpgrade);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder protectedSettings(@Nullable Map<String,Object> protectedSettings) {
            this.protectedSettings = protectedSettings;
            return this;
        }
        @CustomType.Setter
        public Builder publicSettings(@Nullable Map<String,Object> publicSettings) {
            this.publicSettings = publicSettings;
            return this;
        }
        @CustomType.Setter
        public Builder publisher(String publisher) {
            this.publisher = Objects.requireNonNull(publisher);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public StatefulNodeAzureExtension build() {
            final var o = new StatefulNodeAzureExtension();
            o.apiVersion = apiVersion;
            o.minorVersionAutoUpgrade = minorVersionAutoUpgrade;
            o.name = name;
            o.protectedSettings = protectedSettings;
            o.publicSettings = publicSettings;
            o.publisher = publisher;
            o.type = type;
            return o;
        }
    }
}
