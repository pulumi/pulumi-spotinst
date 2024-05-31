// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StatefulNodeAzureBootDiagnosticArgs extends com.pulumi.resources.ResourceArgs {

    public static final StatefulNodeAzureBootDiagnosticArgs Empty = new StatefulNodeAzureBootDiagnosticArgs();

    @Import(name="isEnabled")
    private @Nullable Output<Boolean> isEnabled;

    public Optional<Output<Boolean>> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }

    @Import(name="storageUrl")
    private @Nullable Output<String> storageUrl;

    public Optional<Output<String>> storageUrl() {
        return Optional.ofNullable(this.storageUrl);
    }

    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private StatefulNodeAzureBootDiagnosticArgs() {}

    private StatefulNodeAzureBootDiagnosticArgs(StatefulNodeAzureBootDiagnosticArgs $) {
        this.isEnabled = $.isEnabled;
        this.storageUrl = $.storageUrl;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StatefulNodeAzureBootDiagnosticArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatefulNodeAzureBootDiagnosticArgs $;

        public Builder() {
            $ = new StatefulNodeAzureBootDiagnosticArgs();
        }

        public Builder(StatefulNodeAzureBootDiagnosticArgs defaults) {
            $ = new StatefulNodeAzureBootDiagnosticArgs(Objects.requireNonNull(defaults));
        }

        public Builder isEnabled(@Nullable Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        public Builder storageUrl(@Nullable Output<String> storageUrl) {
            $.storageUrl = storageUrl;
            return this;
        }

        public Builder storageUrl(String storageUrl) {
            return storageUrl(Output.of(storageUrl));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public StatefulNodeAzureBootDiagnosticArgs build() {
            return $;
        }
    }

}