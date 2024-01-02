// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.spotinst.aws.outputs.ElastigroupLoggingExport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupLogging {
    /**
     * @return Logging Export configuration.
     * 
     */
    private @Nullable ElastigroupLoggingExport export;

    private ElastigroupLogging() {}
    /**
     * @return Logging Export configuration.
     * 
     */
    public Optional<ElastigroupLoggingExport> export() {
        return Optional.ofNullable(this.export);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupLogging defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ElastigroupLoggingExport export;
        public Builder() {}
        public Builder(ElastigroupLogging defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.export = defaults.export;
        }

        @CustomType.Setter
        public Builder export(@Nullable ElastigroupLoggingExport export) {

            this.export = export;
            return this;
        }
        public ElastigroupLogging build() {
            final var _resultValue = new ElastigroupLogging();
            _resultValue.export = export;
            return _resultValue;
        }
    }
}
