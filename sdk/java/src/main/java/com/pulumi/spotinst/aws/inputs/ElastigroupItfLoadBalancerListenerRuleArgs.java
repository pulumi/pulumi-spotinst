// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.aws.inputs.ElastigroupItfLoadBalancerListenerRuleStaticTargetGroupArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupItfLoadBalancerListenerRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupItfLoadBalancerListenerRuleArgs Empty = new ElastigroupItfLoadBalancerListenerRuleArgs();

    @Import(name="ruleArn", required=true)
    private Output<String> ruleArn;

    public Output<String> ruleArn() {
        return this.ruleArn;
    }

    @Import(name="staticTargetGroup")
    private @Nullable Output<ElastigroupItfLoadBalancerListenerRuleStaticTargetGroupArgs> staticTargetGroup;

    public Optional<Output<ElastigroupItfLoadBalancerListenerRuleStaticTargetGroupArgs>> staticTargetGroup() {
        return Optional.ofNullable(this.staticTargetGroup);
    }

    private ElastigroupItfLoadBalancerListenerRuleArgs() {}

    private ElastigroupItfLoadBalancerListenerRuleArgs(ElastigroupItfLoadBalancerListenerRuleArgs $) {
        this.ruleArn = $.ruleArn;
        this.staticTargetGroup = $.staticTargetGroup;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupItfLoadBalancerListenerRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupItfLoadBalancerListenerRuleArgs $;

        public Builder() {
            $ = new ElastigroupItfLoadBalancerListenerRuleArgs();
        }

        public Builder(ElastigroupItfLoadBalancerListenerRuleArgs defaults) {
            $ = new ElastigroupItfLoadBalancerListenerRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder ruleArn(Output<String> ruleArn) {
            $.ruleArn = ruleArn;
            return this;
        }

        public Builder ruleArn(String ruleArn) {
            return ruleArn(Output.of(ruleArn));
        }

        public Builder staticTargetGroup(@Nullable Output<ElastigroupItfLoadBalancerListenerRuleStaticTargetGroupArgs> staticTargetGroup) {
            $.staticTargetGroup = staticTargetGroup;
            return this;
        }

        public Builder staticTargetGroup(ElastigroupItfLoadBalancerListenerRuleStaticTargetGroupArgs staticTargetGroup) {
            return staticTargetGroup(Output.of(staticTargetGroup));
        }

        public ElastigroupItfLoadBalancerListenerRuleArgs build() {
            if ($.ruleArn == null) {
                throw new MissingRequiredPropertyException("ElastigroupItfLoadBalancerListenerRuleArgs", "ruleArn");
            }
            return $;
        }
    }

}
