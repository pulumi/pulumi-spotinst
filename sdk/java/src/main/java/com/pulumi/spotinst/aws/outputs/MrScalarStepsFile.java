// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MrScalarStepsFile {
    /**
     * @return S3 Bucket name for bootstrap actions.
     * 
     */
    private String bucket;
    /**
     * @return S3 key for bootstrap actions.
     * 
     */
    private String key;

    private MrScalarStepsFile() {}
    /**
     * @return S3 Bucket name for bootstrap actions.
     * 
     */
    public String bucket() {
        return this.bucket;
    }
    /**
     * @return S3 key for bootstrap actions.
     * 
     */
    public String key() {
        return this.key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MrScalarStepsFile defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String bucket;
        private String key;
        public Builder() {}
        public Builder(MrScalarStepsFile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.key = defaults.key;
        }

        @CustomType.Setter
        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public MrScalarStepsFile build() {
            final var o = new MrScalarStepsFile();
            o.bucket = bucket;
            o.key = key;
            return o;
        }
    }
}
