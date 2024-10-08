// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataIntegrationS3Args extends com.pulumi.resources.ResourceArgs {

    public static final DataIntegrationS3Args Empty = new DataIntegrationS3Args();

    @Import(name="bucketName", required=true)
    private Output<String> bucketName;

    public Output<String> bucketName() {
        return this.bucketName;
    }

    /**
     * The subdirectory in which your files will be stored within the bucket. Adds the prefix subdir/ to new objects&#39; keys. Can&#39;t be null or contain &#39;/&#39;.
     * 
     */
    @Import(name="subdir")
    private @Nullable Output<String> subdir;

    /**
     * @return The subdirectory in which your files will be stored within the bucket. Adds the prefix subdir/ to new objects&#39; keys. Can&#39;t be null or contain &#39;/&#39;.
     * 
     */
    public Optional<Output<String>> subdir() {
        return Optional.ofNullable(this.subdir);
    }

    private DataIntegrationS3Args() {}

    private DataIntegrationS3Args(DataIntegrationS3Args $) {
        this.bucketName = $.bucketName;
        this.subdir = $.subdir;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataIntegrationS3Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataIntegrationS3Args $;

        public Builder() {
            $ = new DataIntegrationS3Args();
        }

        public Builder(DataIntegrationS3Args defaults) {
            $ = new DataIntegrationS3Args(Objects.requireNonNull(defaults));
        }

        public Builder bucketName(Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        /**
         * @param subdir The subdirectory in which your files will be stored within the bucket. Adds the prefix subdir/ to new objects&#39; keys. Can&#39;t be null or contain &#39;/&#39;.
         * 
         * @return builder
         * 
         */
        public Builder subdir(@Nullable Output<String> subdir) {
            $.subdir = subdir;
            return this;
        }

        /**
         * @param subdir The subdirectory in which your files will be stored within the bucket. Adds the prefix subdir/ to new objects&#39; keys. Can&#39;t be null or contain &#39;/&#39;.
         * 
         * @return builder
         * 
         */
        public Builder subdir(String subdir) {
            return subdir(Output.of(subdir));
        }

        public DataIntegrationS3Args build() {
            if ($.bucketName == null) {
                throw new MissingRequiredPropertyException("DataIntegrationS3Args", "bucketName");
            }
            return $;
        }
    }

}