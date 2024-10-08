// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class StatefulNodeAzureExtension {
    private String apiVersion;
    private Boolean minorVersionAutoUpgrade;
    private String name;
    private @Nullable Map<String,String> protectedSettings;
    private @Nullable Map<String,String> publicSettings;
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
    public Map<String,String> protectedSettings() {
        return this.protectedSettings == null ? Map.of() : this.protectedSettings;
    }
    public Map<String,String> publicSettings() {
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
        private @Nullable Map<String,String> protectedSettings;
        private @Nullable Map<String,String> publicSettings;
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
            if (apiVersion == null) {
              throw new MissingRequiredPropertyException("StatefulNodeAzureExtension", "apiVersion");
            }
            this.apiVersion = apiVersion;
            return this;
        }
        @CustomType.Setter
        public Builder minorVersionAutoUpgrade(Boolean minorVersionAutoUpgrade) {
            if (minorVersionAutoUpgrade == null) {
              throw new MissingRequiredPropertyException("StatefulNodeAzureExtension", "minorVersionAutoUpgrade");
            }
            this.minorVersionAutoUpgrade = minorVersionAutoUpgrade;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("StatefulNodeAzureExtension", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder protectedSettings(@Nullable Map<String,String> protectedSettings) {

            this.protectedSettings = protectedSettings;
            return this;
        }
        @CustomType.Setter
        public Builder publicSettings(@Nullable Map<String,String> publicSettings) {

            this.publicSettings = publicSettings;
            return this;
        }
        @CustomType.Setter
        public Builder publisher(String publisher) {
            if (publisher == null) {
              throw new MissingRequiredPropertyException("StatefulNodeAzureExtension", "publisher");
            }
            this.publisher = publisher;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("StatefulNodeAzureExtension", "type");
            }
            this.type = type;
            return this;
        }
        public StatefulNodeAzureExtension build() {
            final var _resultValue = new StatefulNodeAzureExtension();
            _resultValue.apiVersion = apiVersion;
            _resultValue.minorVersionAutoUpgrade = minorVersionAutoUpgrade;
            _resultValue.name = name;
            _resultValue.protectedSettings = protectedSettings;
            _resultValue.publicSettings = publicSettings;
            _resultValue.publisher = publisher;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
