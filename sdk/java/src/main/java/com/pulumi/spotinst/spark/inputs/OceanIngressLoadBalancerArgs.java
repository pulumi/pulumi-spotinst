// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.spark.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanIngressLoadBalancerArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanIngressLoadBalancerArgs Empty = new OceanIngressLoadBalancerArgs();

    @Import(name="managed")
    private @Nullable Output<Boolean> managed;

    public Optional<Output<Boolean>> managed() {
        return Optional.ofNullable(this.managed);
    }

    @Import(name="serviceAnnotations")
    private @Nullable Output<Map<String,String>> serviceAnnotations;

    public Optional<Output<Map<String,String>>> serviceAnnotations() {
        return Optional.ofNullable(this.serviceAnnotations);
    }

    @Import(name="targetGroupArn")
    private @Nullable Output<String> targetGroupArn;

    public Optional<Output<String>> targetGroupArn() {
        return Optional.ofNullable(this.targetGroupArn);
    }

    private OceanIngressLoadBalancerArgs() {}

    private OceanIngressLoadBalancerArgs(OceanIngressLoadBalancerArgs $) {
        this.managed = $.managed;
        this.serviceAnnotations = $.serviceAnnotations;
        this.targetGroupArn = $.targetGroupArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanIngressLoadBalancerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanIngressLoadBalancerArgs $;

        public Builder() {
            $ = new OceanIngressLoadBalancerArgs();
        }

        public Builder(OceanIngressLoadBalancerArgs defaults) {
            $ = new OceanIngressLoadBalancerArgs(Objects.requireNonNull(defaults));
        }

        public Builder managed(@Nullable Output<Boolean> managed) {
            $.managed = managed;
            return this;
        }

        public Builder managed(Boolean managed) {
            return managed(Output.of(managed));
        }

        public Builder serviceAnnotations(@Nullable Output<Map<String,String>> serviceAnnotations) {
            $.serviceAnnotations = serviceAnnotations;
            return this;
        }

        public Builder serviceAnnotations(Map<String,String> serviceAnnotations) {
            return serviceAnnotations(Output.of(serviceAnnotations));
        }

        public Builder targetGroupArn(@Nullable Output<String> targetGroupArn) {
            $.targetGroupArn = targetGroupArn;
            return this;
        }

        public Builder targetGroupArn(String targetGroupArn) {
            return targetGroupArn(Output.of(targetGroupArn));
        }

        public OceanIngressLoadBalancerArgs build() {
            return $;
        }
    }

}
