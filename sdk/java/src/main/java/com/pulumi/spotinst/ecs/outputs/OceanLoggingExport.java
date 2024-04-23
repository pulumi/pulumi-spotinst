// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.spotinst.ecs.outputs.OceanLoggingExportS3;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class OceanLoggingExport {
    private @Nullable List<OceanLoggingExportS3> s3s;

    private OceanLoggingExport() {}
    public List<OceanLoggingExportS3> s3s() {
        return this.s3s == null ? List.of() : this.s3s;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanLoggingExport defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<OceanLoggingExportS3> s3s;
        public Builder() {}
        public Builder(OceanLoggingExport defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3s = defaults.s3s;
        }

        @CustomType.Setter
        public Builder s3s(@Nullable List<OceanLoggingExportS3> s3s) {

            this.s3s = s3s;
            return this;
        }
        public Builder s3s(OceanLoggingExportS3... s3s) {
            return s3s(List.of(s3s));
        }
        public OceanLoggingExport build() {
            final var _resultValue = new OceanLoggingExport();
            _resultValue.s3s = s3s;
            return _resultValue;
        }
    }
}
