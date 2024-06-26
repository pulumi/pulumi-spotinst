// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedInstanceLoadBalancerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedInstanceLoadBalancerArgs Empty = new ManagedInstanceLoadBalancerArgs();

    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private ManagedInstanceLoadBalancerArgs() {}

    private ManagedInstanceLoadBalancerArgs(ManagedInstanceLoadBalancerArgs $) {
        this.arn = $.arn;
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedInstanceLoadBalancerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedInstanceLoadBalancerArgs $;

        public Builder() {
            $ = new ManagedInstanceLoadBalancerArgs();
        }

        public Builder(ManagedInstanceLoadBalancerArgs defaults) {
            $ = new ManagedInstanceLoadBalancerArgs(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ManagedInstanceLoadBalancerArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("ManagedInstanceLoadBalancerArgs", "type");
            }
            return $;
        }
    }

}
