// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataIntegrationS3 {
    private String bucketName;
    /**
     * @return The subdirectory in which your files will be stored within the bucket. Adds the prefix subdir/ to new objects&#39; keys. Can&#39;t be null or contain &#39;/&#39;.
     * 
     */
    private @Nullable String subdir;

    private DataIntegrationS3() {}
    public String bucketName() {
        return this.bucketName;
    }
    /**
     * @return The subdirectory in which your files will be stored within the bucket. Adds the prefix subdir/ to new objects&#39; keys. Can&#39;t be null or contain &#39;/&#39;.
     * 
     */
    public Optional<String> subdir() {
        return Optional.ofNullable(this.subdir);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataIntegrationS3 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String bucketName;
        private @Nullable String subdir;
        public Builder() {}
        public Builder(DataIntegrationS3 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.subdir = defaults.subdir;
        }

        @CustomType.Setter
        public Builder bucketName(String bucketName) {
            if (bucketName == null) {
              throw new MissingRequiredPropertyException("DataIntegrationS3", "bucketName");
            }
            this.bucketName = bucketName;
            return this;
        }
        @CustomType.Setter
        public Builder subdir(@Nullable String subdir) {

            this.subdir = subdir;
            return this;
        }
        public DataIntegrationS3 build() {
            final var _resultValue = new DataIntegrationS3();
            _resultValue.bucketName = bucketName;
            _resultValue.subdir = subdir;
            return _resultValue;
        }
    }
}
