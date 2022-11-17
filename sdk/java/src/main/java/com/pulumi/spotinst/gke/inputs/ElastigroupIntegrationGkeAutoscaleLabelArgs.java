// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ElastigroupIntegrationGkeAutoscaleLabelArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupIntegrationGkeAutoscaleLabelArgs Empty = new ElastigroupIntegrationGkeAutoscaleLabelArgs();

    /**
     * The label name.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The label name.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The label value.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The label value.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private ElastigroupIntegrationGkeAutoscaleLabelArgs() {}

    private ElastigroupIntegrationGkeAutoscaleLabelArgs(ElastigroupIntegrationGkeAutoscaleLabelArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupIntegrationGkeAutoscaleLabelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupIntegrationGkeAutoscaleLabelArgs $;

        public Builder() {
            $ = new ElastigroupIntegrationGkeAutoscaleLabelArgs();
        }

        public Builder(ElastigroupIntegrationGkeAutoscaleLabelArgs defaults) {
            $ = new ElastigroupIntegrationGkeAutoscaleLabelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The label name.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The label name.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value The label value.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The label value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ElastigroupIntegrationGkeAutoscaleLabelArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
