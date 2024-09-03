// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class CredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final CredentialsArgs Empty = new CredentialsArgs();

    /**
     * The ID of the account associated with your token.
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return The ID of the account associated with your token.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * Provide the IAM Role ARN connected to another AWS account 922761411349 and with the latest Spot Policy - &lt;https://docs.spot.io/administration/api/spot-policy-in-aws&gt;
     * 
     */
    @Import(name="iamrole", required=true)
    private Output<String> iamrole;

    /**
     * @return Provide the IAM Role ARN connected to another AWS account 922761411349 and with the latest Spot Policy - &lt;https://docs.spot.io/administration/api/spot-policy-in-aws&gt;
     * 
     */
    public Output<String> iamrole() {
        return this.iamrole;
    }

    private CredentialsArgs() {}

    private CredentialsArgs(CredentialsArgs $) {
        this.accountId = $.accountId;
        this.iamrole = $.iamrole;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CredentialsArgs $;

        public Builder() {
            $ = new CredentialsArgs();
        }

        public Builder(CredentialsArgs defaults) {
            $ = new CredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The ID of the account associated with your token.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The ID of the account associated with your token.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param iamrole Provide the IAM Role ARN connected to another AWS account 922761411349 and with the latest Spot Policy - &lt;https://docs.spot.io/administration/api/spot-policy-in-aws&gt;
         * 
         * @return builder
         * 
         */
        public Builder iamrole(Output<String> iamrole) {
            $.iamrole = iamrole;
            return this;
        }

        /**
         * @param iamrole Provide the IAM Role ARN connected to another AWS account 922761411349 and with the latest Spot Policy - &lt;https://docs.spot.io/administration/api/spot-policy-in-aws&gt;
         * 
         * @return builder
         * 
         */
        public Builder iamrole(String iamrole) {
            return iamrole(Output.of(iamrole));
        }

        public CredentialsArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("CredentialsArgs", "accountId");
            }
            if ($.iamrole == null) {
                throw new MissingRequiredPropertyException("CredentialsArgs", "iamrole");
            }
            return $;
        }
    }

}
