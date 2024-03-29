// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StatefulNodeAzureBootDiagnostic {
    private @Nullable Boolean isEnabled;
    private @Nullable String storageUrl;
    private @Nullable String type;

    private StatefulNodeAzureBootDiagnostic() {}
    public Optional<Boolean> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }
    public Optional<String> storageUrl() {
        return Optional.ofNullable(this.storageUrl);
    }
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulNodeAzureBootDiagnostic defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean isEnabled;
        private @Nullable String storageUrl;
        private @Nullable String type;
        public Builder() {}
        public Builder(StatefulNodeAzureBootDiagnostic defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isEnabled = defaults.isEnabled;
    	      this.storageUrl = defaults.storageUrl;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder isEnabled(@Nullable Boolean isEnabled) {

            this.isEnabled = isEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder storageUrl(@Nullable String storageUrl) {

            this.storageUrl = storageUrl;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public StatefulNodeAzureBootDiagnostic build() {
            final var _resultValue = new StatefulNodeAzureBootDiagnostic();
            _resultValue.isEnabled = isEnabled;
            _resultValue.storageUrl = storageUrl;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
