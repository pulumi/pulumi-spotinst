// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.organization.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class UserGroupPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserGroupPolicyArgs Empty = new UserGroupPolicyArgs();

    /**
     * A list of accounts to register with the assigned under the
     * given group (should be existing accounts only).
     * 
     */
    @Import(name="accountIds", required=true)
    private Output<List<String>> accountIds;

    /**
     * @return A list of accounts to register with the assigned under the
     * given group (should be existing accounts only).
     * 
     */
    public Output<List<String>> accountIds() {
        return this.accountIds;
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

    private UserGroupPolicyArgs() {}

    private UserGroupPolicyArgs(UserGroupPolicyArgs $) {
        this.accountIds = $.accountIds;
        this.policyId = $.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserGroupPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserGroupPolicyArgs $;

        public Builder() {
            $ = new UserGroupPolicyArgs();
        }

        public Builder(UserGroupPolicyArgs defaults) {
            $ = new UserGroupPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountIds A list of accounts to register with the assigned under the
         * given group (should be existing accounts only).
         * 
         * @return builder
         * 
         */
        public Builder accountIds(Output<List<String>> accountIds) {
            $.accountIds = accountIds;
            return this;
        }

        /**
         * @param accountIds A list of accounts to register with the assigned under the
         * given group (should be existing accounts only).
         * 
         * @return builder
         * 
         */
        public Builder accountIds(List<String> accountIds) {
            return accountIds(Output.of(accountIds));
        }

        /**
         * @param accountIds A list of accounts to register with the assigned under the
         * given group (should be existing accounts only).
         * 
         * @return builder
         * 
         */
        public Builder accountIds(String... accountIds) {
            return accountIds(List.of(accountIds));
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

        public UserGroupPolicyArgs build() {
            if ($.accountIds == null) {
                throw new MissingRequiredPropertyException("UserGroupPolicyArgs", "accountIds");
            }
            if ($.policyId == null) {
                throw new MissingRequiredPropertyException("UserGroupPolicyArgs", "policyId");
            }
            return $;
        }
    }

}