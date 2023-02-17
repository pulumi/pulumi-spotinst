// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanLaunchSpecInstanceMetadataOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanLaunchSpecInstanceMetadataOptionsArgs Empty = new OceanLaunchSpecInstanceMetadataOptionsArgs();

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

    private OceanLaunchSpecInstanceMetadataOptionsArgs() {}

    private OceanLaunchSpecInstanceMetadataOptionsArgs(OceanLaunchSpecInstanceMetadataOptionsArgs $) {
        this.httpPutResponseHopLimit = $.httpPutResponseHopLimit;
        this.httpTokens = $.httpTokens;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanLaunchSpecInstanceMetadataOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanLaunchSpecInstanceMetadataOptionsArgs $;

        public Builder() {
            $ = new OceanLaunchSpecInstanceMetadataOptionsArgs();
        }

        public Builder(OceanLaunchSpecInstanceMetadataOptionsArgs defaults) {
            $ = new OceanLaunchSpecInstanceMetadataOptionsArgs(Objects.requireNonNull(defaults));
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

        public OceanLaunchSpecInstanceMetadataOptionsArgs build() {
            $.httpTokens = Objects.requireNonNull($.httpTokens, "expected parameter 'httpTokens' to be non-null");
            return $;
        }
    }

}
