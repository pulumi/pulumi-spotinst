// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class OceanLoggingExportS3Args extends com.pulumi.resources.ResourceArgs {

    public static final OceanLoggingExportS3Args Empty = new OceanLoggingExportS3Args();

    /**
     * The identifier of The S3 data integration to export the logs to.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The identifier of The S3 data integration to export the logs to.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private OceanLoggingExportS3Args() {}

    private OceanLoggingExportS3Args(OceanLoggingExportS3Args $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanLoggingExportS3Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanLoggingExportS3Args $;

        public Builder() {
            $ = new OceanLoggingExportS3Args();
        }

        public Builder(OceanLoggingExportS3Args defaults) {
            $ = new OceanLoggingExportS3Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The identifier of The S3 data integration to export the logs to.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The identifier of The S3 data integration to export the logs to.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public OceanLoggingExportS3Args build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("OceanLoggingExportS3Args", "id");
            }
            return $;
        }
    }

}
