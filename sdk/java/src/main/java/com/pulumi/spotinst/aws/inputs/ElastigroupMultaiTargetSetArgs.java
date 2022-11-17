// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ElastigroupMultaiTargetSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupMultaiTargetSetArgs Empty = new ElastigroupMultaiTargetSetArgs();

    /**
     * ID of Multai Load Balancer.
     * 
     */
    @Import(name="balancerId", required=true)
    private Output<String> balancerId;

    /**
     * @return ID of Multai Load Balancer.
     * 
     */
    public Output<String> balancerId() {
        return this.balancerId;
    }

    /**
     * ID of Multai target set.
     * 
     */
    @Import(name="targetSetId", required=true)
    private Output<String> targetSetId;

    /**
     * @return ID of Multai target set.
     * 
     */
    public Output<String> targetSetId() {
        return this.targetSetId;
    }

    private ElastigroupMultaiTargetSetArgs() {}

    private ElastigroupMultaiTargetSetArgs(ElastigroupMultaiTargetSetArgs $) {
        this.balancerId = $.balancerId;
        this.targetSetId = $.targetSetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupMultaiTargetSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupMultaiTargetSetArgs $;

        public Builder() {
            $ = new ElastigroupMultaiTargetSetArgs();
        }

        public Builder(ElastigroupMultaiTargetSetArgs defaults) {
            $ = new ElastigroupMultaiTargetSetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param balancerId ID of Multai Load Balancer.
         * 
         * @return builder
         * 
         */
        public Builder balancerId(Output<String> balancerId) {
            $.balancerId = balancerId;
            return this;
        }

        /**
         * @param balancerId ID of Multai Load Balancer.
         * 
         * @return builder
         * 
         */
        public Builder balancerId(String balancerId) {
            return balancerId(Output.of(balancerId));
        }

        /**
         * @param targetSetId ID of Multai target set.
         * 
         * @return builder
         * 
         */
        public Builder targetSetId(Output<String> targetSetId) {
            $.targetSetId = targetSetId;
            return this;
        }

        /**
         * @param targetSetId ID of Multai target set.
         * 
         * @return builder
         * 
         */
        public Builder targetSetId(String targetSetId) {
            return targetSetId(Output.of(targetSetId));
        }

        public ElastigroupMultaiTargetSetArgs build() {
            $.balancerId = Objects.requireNonNull($.balancerId, "expected parameter 'balancerId' to be non-null");
            $.targetSetId = Objects.requireNonNull($.targetSetId, "expected parameter 'targetSetId' to be non-null");
            return $;
        }
    }

}
