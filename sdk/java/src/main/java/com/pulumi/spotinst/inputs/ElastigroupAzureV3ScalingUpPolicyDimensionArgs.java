// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupAzureV3ScalingUpPolicyDimensionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupAzureV3ScalingUpPolicyDimensionArgs Empty = new ElastigroupAzureV3ScalingUpPolicyDimensionArgs();

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private ElastigroupAzureV3ScalingUpPolicyDimensionArgs() {}

    private ElastigroupAzureV3ScalingUpPolicyDimensionArgs(ElastigroupAzureV3ScalingUpPolicyDimensionArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupAzureV3ScalingUpPolicyDimensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupAzureV3ScalingUpPolicyDimensionArgs $;

        public Builder() {
            $ = new ElastigroupAzureV3ScalingUpPolicyDimensionArgs();
        }

        public Builder(ElastigroupAzureV3ScalingUpPolicyDimensionArgs defaults) {
            $ = new ElastigroupAzureV3ScalingUpPolicyDimensionArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ElastigroupAzureV3ScalingUpPolicyDimensionArgs build() {
            return $;
        }
    }

}
