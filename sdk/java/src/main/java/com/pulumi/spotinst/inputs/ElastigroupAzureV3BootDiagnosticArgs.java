// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupAzureV3BootDiagnosticArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupAzureV3BootDiagnosticArgs Empty = new ElastigroupAzureV3BootDiagnosticArgs();

    @Import(name="isEnabled", required=true)
    private Output<Boolean> isEnabled;

    public Output<Boolean> isEnabled() {
        return this.isEnabled;
    }

    @Import(name="storageUrl")
    private @Nullable Output<String> storageUrl;

    public Optional<Output<String>> storageUrl() {
        return Optional.ofNullable(this.storageUrl);
    }

    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private ElastigroupAzureV3BootDiagnosticArgs() {}

    private ElastigroupAzureV3BootDiagnosticArgs(ElastigroupAzureV3BootDiagnosticArgs $) {
        this.isEnabled = $.isEnabled;
        this.storageUrl = $.storageUrl;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupAzureV3BootDiagnosticArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupAzureV3BootDiagnosticArgs $;

        public Builder() {
            $ = new ElastigroupAzureV3BootDiagnosticArgs();
        }

        public Builder(ElastigroupAzureV3BootDiagnosticArgs defaults) {
            $ = new ElastigroupAzureV3BootDiagnosticArgs(Objects.requireNonNull(defaults));
        }

        public Builder isEnabled(Output<Boolean> isEnabled) {
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

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ElastigroupAzureV3BootDiagnosticArgs build() {
            if ($.isEnabled == null) {
                throw new MissingRequiredPropertyException("ElastigroupAzureV3BootDiagnosticArgs", "isEnabled");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("ElastigroupAzureV3BootDiagnosticArgs", "type");
            }
            return $;
        }
    }

}