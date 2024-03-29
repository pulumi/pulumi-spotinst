// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class OceanLoggingExportS3 {
    /**
     * @return The identifier of The S3 data integration to export the logs to.
     * 
     */
    private String id;

    private OceanLoggingExportS3() {}
    /**
     * @return The identifier of The S3 data integration to export the logs to.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanLoggingExportS3 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        public Builder() {}
        public Builder(OceanLoggingExportS3 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("OceanLoggingExportS3", "id");
            }
            this.id = id;
            return this;
        }
        public OceanLoggingExportS3 build() {
            final var _resultValue = new OceanLoggingExportS3();
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
