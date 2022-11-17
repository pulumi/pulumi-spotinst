// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanTagArgs Empty = new OceanTagArgs();

    /**
     * Tag key.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return Tag key.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Tag value.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Tag value.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private OceanTagArgs() {}

    private OceanTagArgs(OceanTagArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanTagArgs $;

        public Builder() {
            $ = new OceanTagArgs();
        }

        public Builder(OceanTagArgs defaults) {
            $ = new OceanTagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key Tag key.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Tag key.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value Tag value.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Tag value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public OceanTagArgs build() {
            return $;
        }
    }

}
