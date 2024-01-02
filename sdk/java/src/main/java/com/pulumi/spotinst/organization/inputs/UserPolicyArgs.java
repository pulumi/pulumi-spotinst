// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.organization.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class UserPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserPolicyArgs Empty = new UserPolicyArgs();

    @Import(name="policyAccountIds", required=true)
    private Output<List<String>> policyAccountIds;

    public Output<List<String>> policyAccountIds() {
        return this.policyAccountIds;
    }

    /**
     * A policy to register under the given group
     * (should be existing policy only).
     * 
     */
    @Import(name="policyId", required=true)
    private Output<String> policyId;

    /**
     * @return A policy to register under the given group
     * (should be existing policy only).
     * 
     */
    public Output<String> policyId() {
        return this.policyId;
    }

    private UserPolicyArgs() {}

    private UserPolicyArgs(UserPolicyArgs $) {
        this.policyAccountIds = $.policyAccountIds;
        this.policyId = $.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserPolicyArgs $;

        public Builder() {
            $ = new UserPolicyArgs();
        }

        public Builder(UserPolicyArgs defaults) {
            $ = new UserPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder policyAccountIds(Output<List<String>> policyAccountIds) {
            $.policyAccountIds = policyAccountIds;
            return this;
        }

        public Builder policyAccountIds(List<String> policyAccountIds) {
            return policyAccountIds(Output.of(policyAccountIds));
        }

        public Builder policyAccountIds(String... policyAccountIds) {
            return policyAccountIds(List.of(policyAccountIds));
        }

        /**
         * @param policyId A policy to register under the given group
         * (should be existing policy only).
         * 
         * @return builder
         * 
         */
        public Builder policyId(Output<String> policyId) {
            $.policyId = policyId;
            return this;
        }

        /**
         * @param policyId A policy to register under the given group
         * (should be existing policy only).
         * 
         * @return builder
         * 
         */
        public Builder policyId(String policyId) {
            return policyId(Output.of(policyId));
        }

        public UserPolicyArgs build() {
            if ($.policyAccountIds == null) {
                throw new MissingRequiredPropertyException("UserPolicyArgs", "policyAccountIds");
            }
            if ($.policyId == null) {
                throw new MissingRequiredPropertyException("UserPolicyArgs", "policyId");
            }
            return $;
        }
    }

}
