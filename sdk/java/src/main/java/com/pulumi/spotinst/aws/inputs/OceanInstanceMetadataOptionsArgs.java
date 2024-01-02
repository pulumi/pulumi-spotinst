// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanInstanceMetadataOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanInstanceMetadataOptionsArgs Empty = new OceanInstanceMetadataOptionsArgs();

    /**
     * An integer from 1 through 64. The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further the instance metadata requests can travel.
     * 
     */
    @Import(name="httpPutResponseHopLimit")
    private @Nullable Output<Integer> httpPutResponseHopLimit;

    /**
     * @return An integer from 1 through 64. The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further the instance metadata requests can travel.
     * 
     */
    public Optional<Output<Integer>> httpPutResponseHopLimit() {
        return Optional.ofNullable(this.httpPutResponseHopLimit);
    }

    /**
     * Determines if a signed token is required or not. Valid values: `optional` or `required`.
     * 
     */
    @Import(name="httpTokens", required=true)
    private Output<String> httpTokens;

    /**
     * @return Determines if a signed token is required or not. Valid values: `optional` or `required`.
     * 
     */
    public Output<String> httpTokens() {
        return this.httpTokens;
    }

    private OceanInstanceMetadataOptionsArgs() {}

    private OceanInstanceMetadataOptionsArgs(OceanInstanceMetadataOptionsArgs $) {
        this.httpPutResponseHopLimit = $.httpPutResponseHopLimit;
        this.httpTokens = $.httpTokens;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanInstanceMetadataOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanInstanceMetadataOptionsArgs $;

        public Builder() {
            $ = new OceanInstanceMetadataOptionsArgs();
        }

        public Builder(OceanInstanceMetadataOptionsArgs defaults) {
            $ = new OceanInstanceMetadataOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param httpPutResponseHopLimit An integer from 1 through 64. The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further the instance metadata requests can travel.
         * 
         * @return builder
         * 
         */
        public Builder httpPutResponseHopLimit(@Nullable Output<Integer> httpPutResponseHopLimit) {
            $.httpPutResponseHopLimit = httpPutResponseHopLimit;
            return this;
        }

        /**
         * @param httpPutResponseHopLimit An integer from 1 through 64. The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further the instance metadata requests can travel.
         * 
         * @return builder
         * 
         */
        public Builder httpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
            return httpPutResponseHopLimit(Output.of(httpPutResponseHopLimit));
        }

        /**
         * @param httpTokens Determines if a signed token is required or not. Valid values: `optional` or `required`.
         * 
         * @return builder
         * 
         */
        public Builder httpTokens(Output<String> httpTokens) {
            $.httpTokens = httpTokens;
            return this;
        }

        /**
         * @param httpTokens Determines if a signed token is required or not. Valid values: `optional` or `required`.
         * 
         * @return builder
         * 
         */
        public Builder httpTokens(String httpTokens) {
            return httpTokens(Output.of(httpTokens));
        }

        public OceanInstanceMetadataOptionsArgs build() {
            if ($.httpTokens == null) {
                throw new MissingRequiredPropertyException("OceanInstanceMetadataOptionsArgs", "httpTokens");
            }
            return $;
        }
    }

}
