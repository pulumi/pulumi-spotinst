// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
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

    @Import(name="autoWeight")
    private @Nullable Output<Boolean> autoWeight;

    public Optional<Output<Boolean>> autoWeight() {
        return Optional.ofNullable(this.autoWeight);
    }

    @Import(name="azAwareness")
    private @Nullable Output<Boolean> azAwareness;

    public Optional<Output<Boolean>> azAwareness() {
        return Optional.ofNullable(this.azAwareness);
    }

    @Import(name="balancerId")
    private @Nullable Output<String> balancerId;

    public Optional<Output<String>> balancerId() {
        return Optional.ofNullable(this.balancerId);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="targetSetId")
    private @Nullable Output<String> targetSetId;

    public Optional<Output<String>> targetSetId() {
        return Optional.ofNullable(this.targetSetId);
    }

    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private ManagedInstanceLoadBalancerArgs() {}

    private ManagedInstanceLoadBalancerArgs(ManagedInstanceLoadBalancerArgs $) {
        this.arn = $.arn;
        this.autoWeight = $.autoWeight;
        this.azAwareness = $.azAwareness;
        this.balancerId = $.balancerId;
        this.name = $.name;
        this.targetSetId = $.targetSetId;
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

        public Builder autoWeight(@Nullable Output<Boolean> autoWeight) {
            $.autoWeight = autoWeight;
            return this;
        }

        public Builder autoWeight(Boolean autoWeight) {
            return autoWeight(Output.of(autoWeight));
        }

        public Builder azAwareness(@Nullable Output<Boolean> azAwareness) {
            $.azAwareness = azAwareness;
            return this;
        }

        public Builder azAwareness(Boolean azAwareness) {
            return azAwareness(Output.of(azAwareness));
        }

        public Builder balancerId(@Nullable Output<String> balancerId) {
            $.balancerId = balancerId;
            return this;
        }

        public Builder balancerId(String balancerId) {
            return balancerId(Output.of(balancerId));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder targetSetId(@Nullable Output<String> targetSetId) {
            $.targetSetId = targetSetId;
            return this;
        }

        public Builder targetSetId(String targetSetId) {
            return targetSetId(Output.of(targetSetId));
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
