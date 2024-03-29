// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.ecs.inputs.OceanLoggingExportS3Args;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanLoggingExportArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanLoggingExportArgs Empty = new OceanLoggingExportArgs();

    /**
     * Exports your cluster&#39;s logs to the S3 bucket and subdir configured on the S3 data integration given.
     * 
     */
    @Import(name="s3s")
    private @Nullable Output<List<OceanLoggingExportS3Args>> s3s;

    /**
     * @return Exports your cluster&#39;s logs to the S3 bucket and subdir configured on the S3 data integration given.
     * 
     */
    public Optional<Output<List<OceanLoggingExportS3Args>>> s3s() {
        return Optional.ofNullable(this.s3s);
    }

    private OceanLoggingExportArgs() {}

    private OceanLoggingExportArgs(OceanLoggingExportArgs $) {
        this.s3s = $.s3s;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanLoggingExportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanLoggingExportArgs $;

        public Builder() {
            $ = new OceanLoggingExportArgs();
        }

        public Builder(OceanLoggingExportArgs defaults) {
            $ = new OceanLoggingExportArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param s3s Exports your cluster&#39;s logs to the S3 bucket and subdir configured on the S3 data integration given.
         * 
         * @return builder
         * 
         */
        public Builder s3s(@Nullable Output<List<OceanLoggingExportS3Args>> s3s) {
            $.s3s = s3s;
            return this;
        }

        /**
         * @param s3s Exports your cluster&#39;s logs to the S3 bucket and subdir configured on the S3 data integration given.
         * 
         * @return builder
         * 
         */
        public Builder s3s(List<OceanLoggingExportS3Args> s3s) {
            return s3s(Output.of(s3s));
        }

        /**
         * @param s3s Exports your cluster&#39;s logs to the S3 bucket and subdir configured on the S3 data integration given.
         * 
         * @return builder
         * 
         */
        public Builder s3s(OceanLoggingExportS3Args... s3s) {
            return s3s(List.of(s3s));
        }

        public OceanLoggingExportArgs build() {
            return $;
        }
    }

}
