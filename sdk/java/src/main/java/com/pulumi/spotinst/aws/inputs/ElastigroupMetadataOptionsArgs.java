// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupMetadataOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupMetadataOptionsArgs Empty = new ElastigroupMetadataOptionsArgs();

    /**
     * The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further instance metadata requests can travel. Valid values: Integers from `1` to `64`.
     * 
     */
    @Import(name="httpPutResponseHopLimit")
    private @Nullable Output<Integer> httpPutResponseHopLimit;

    /**
     * @return The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further instance metadata requests can travel. Valid values: Integers from `1` to `64`.
     * 
     */
    public Optional<Output<Integer>> httpPutResponseHopLimit() {
        return Optional.ofNullable(this.httpPutResponseHopLimit);
    }

    /**
     * The state of token usage for your instance metadata requests. Valid values: `optional` or `required`.
     * 
     */
    @Import(name="httpTokens", required=true)
    private Output<String> httpTokens;

    /**
     * @return The state of token usage for your instance metadata requests. Valid values: `optional` or `required`.
     * 
     */
    public Output<String> httpTokens() {
        return this.httpTokens;
    }

    private ElastigroupMetadataOptionsArgs() {}

    private ElastigroupMetadataOptionsArgs(ElastigroupMetadataOptionsArgs $) {
        this.httpPutResponseHopLimit = $.httpPutResponseHopLimit;
        this.httpTokens = $.httpTokens;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupMetadataOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupMetadataOptionsArgs $;

        public Builder() {
            $ = new ElastigroupMetadataOptionsArgs();
        }

        public Builder(ElastigroupMetadataOptionsArgs defaults) {
            $ = new ElastigroupMetadataOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param httpPutResponseHopLimit The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further instance metadata requests can travel. Valid values: Integers from `1` to `64`.
         * 
         * @return builder
         * 
         */
        public Builder httpPutResponseHopLimit(@Nullable Output<Integer> httpPutResponseHopLimit) {
            $.httpPutResponseHopLimit = httpPutResponseHopLimit;
            return this;
        }

        /**
         * @param httpPutResponseHopLimit The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further instance metadata requests can travel. Valid values: Integers from `1` to `64`.
         * 
         * @return builder
         * 
         */
        public Builder httpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
            return httpPutResponseHopLimit(Output.of(httpPutResponseHopLimit));
        }

        /**
         * @param httpTokens The state of token usage for your instance metadata requests. Valid values: `optional` or `required`.
         * 
         * @return builder
         * 
         */
        public Builder httpTokens(Output<String> httpTokens) {
            $.httpTokens = httpTokens;
            return this;
        }

        /**
         * @param httpTokens The state of token usage for your instance metadata requests. Valid values: `optional` or `required`.
         * 
         * @return builder
         * 
         */
        public Builder httpTokens(String httpTokens) {
            return httpTokens(Output.of(httpTokens));
        }

        public ElastigroupMetadataOptionsArgs build() {
            $.httpTokens = Objects.requireNonNull($.httpTokens, "expected parameter 'httpTokens' to be non-null");
            return $;
        }
    }

}
