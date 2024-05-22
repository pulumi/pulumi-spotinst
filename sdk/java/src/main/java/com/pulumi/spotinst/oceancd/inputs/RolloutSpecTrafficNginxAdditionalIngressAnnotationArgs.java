// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RolloutSpecTrafficNginxAdditionalIngressAnnotationArgs extends com.pulumi.resources.ResourceArgs {

    public static final RolloutSpecTrafficNginxAdditionalIngressAnnotationArgs Empty = new RolloutSpecTrafficNginxAdditionalIngressAnnotationArgs();

    @Import(name="canaryByHeader")
    private @Nullable Output<String> canaryByHeader;

    public Optional<Output<String>> canaryByHeader() {
        return Optional.ofNullable(this.canaryByHeader);
    }

    @Import(name="key1")
    private @Nullable Output<String> key1;

    public Optional<Output<String>> key1() {
        return Optional.ofNullable(this.key1);
    }

    private RolloutSpecTrafficNginxAdditionalIngressAnnotationArgs() {}

    private RolloutSpecTrafficNginxAdditionalIngressAnnotationArgs(RolloutSpecTrafficNginxAdditionalIngressAnnotationArgs $) {
        this.canaryByHeader = $.canaryByHeader;
        this.key1 = $.key1;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RolloutSpecTrafficNginxAdditionalIngressAnnotationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RolloutSpecTrafficNginxAdditionalIngressAnnotationArgs $;

        public Builder() {
            $ = new RolloutSpecTrafficNginxAdditionalIngressAnnotationArgs();
        }

        public Builder(RolloutSpecTrafficNginxAdditionalIngressAnnotationArgs defaults) {
            $ = new RolloutSpecTrafficNginxAdditionalIngressAnnotationArgs(Objects.requireNonNull(defaults));
        }

        public Builder canaryByHeader(@Nullable Output<String> canaryByHeader) {
            $.canaryByHeader = canaryByHeader;
            return this;
        }

        public Builder canaryByHeader(String canaryByHeader) {
            return canaryByHeader(Output.of(canaryByHeader));
        }

        public Builder key1(@Nullable Output<String> key1) {
            $.key1 = key1;
            return this;
        }

        public Builder key1(String key1) {
            return key1(Output.of(key1));
        }

        public RolloutSpecTrafficNginxAdditionalIngressAnnotationArgs build() {
            return $;
        }
    }

}
