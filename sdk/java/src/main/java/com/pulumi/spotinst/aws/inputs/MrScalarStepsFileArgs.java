// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class MrScalarStepsFileArgs extends com.pulumi.resources.ResourceArgs {

    public static final MrScalarStepsFileArgs Empty = new MrScalarStepsFileArgs();

    /**
     * S3 Bucket name for bootstrap actions.
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    /**
     * @return S3 Bucket name for bootstrap actions.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * S3 key for bootstrap actions.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return S3 key for bootstrap actions.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    private MrScalarStepsFileArgs() {}

    private MrScalarStepsFileArgs(MrScalarStepsFileArgs $) {
        this.bucket = $.bucket;
        this.key = $.key;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MrScalarStepsFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MrScalarStepsFileArgs $;

        public Builder() {
            $ = new MrScalarStepsFileArgs();
        }

        public Builder(MrScalarStepsFileArgs defaults) {
            $ = new MrScalarStepsFileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket S3 Bucket name for bootstrap actions.
         * 
         * @return builder
         * 
         */
        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket S3 Bucket name for bootstrap actions.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param key S3 key for bootstrap actions.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key S3 key for bootstrap actions.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        public MrScalarStepsFileArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            return $;
        }
    }

}
