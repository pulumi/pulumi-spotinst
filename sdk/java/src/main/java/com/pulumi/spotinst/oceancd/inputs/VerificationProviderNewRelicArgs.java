// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VerificationProviderNewRelicArgs extends com.pulumi.resources.ResourceArgs {

    public static final VerificationProviderNewRelicArgs Empty = new VerificationProviderNewRelicArgs();

    @Import(name="accountId", required=true)
    private Output<String> accountId;

    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * The base URL for NerdGraph for a proxy.
     * 
     */
    @Import(name="baseUrlNerdGraph")
    private @Nullable Output<String> baseUrlNerdGraph;

    /**
     * @return The base URL for NerdGraph for a proxy.
     * 
     */
    public Optional<Output<String>> baseUrlNerdGraph() {
        return Optional.ofNullable(this.baseUrlNerdGraph);
    }

    /**
     * The base URL of the New Relic REST API for a proxy.
     * 
     */
    @Import(name="baseUrlRest")
    private @Nullable Output<String> baseUrlRest;

    /**
     * @return The base URL of the New Relic REST API for a proxy.
     * 
     */
    public Optional<Output<String>> baseUrlRest() {
        return Optional.ofNullable(this.baseUrlRest);
    }

    /**
     * The NewRelic user key
     * 
     */
    @Import(name="personalApiKey", required=true)
    private Output<String> personalApiKey;

    /**
     * @return The NewRelic user key
     * 
     */
    public Output<String> personalApiKey() {
        return this.personalApiKey;
    }

    /**
     * A region which the account is attached to. Default is &#34;us&#34;.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return A region which the account is attached to. Default is &#34;us&#34;.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    private VerificationProviderNewRelicArgs() {}

    private VerificationProviderNewRelicArgs(VerificationProviderNewRelicArgs $) {
        this.accountId = $.accountId;
        this.baseUrlNerdGraph = $.baseUrlNerdGraph;
        this.baseUrlRest = $.baseUrlRest;
        this.personalApiKey = $.personalApiKey;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VerificationProviderNewRelicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VerificationProviderNewRelicArgs $;

        public Builder() {
            $ = new VerificationProviderNewRelicArgs();
        }

        public Builder(VerificationProviderNewRelicArgs defaults) {
            $ = new VerificationProviderNewRelicArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param baseUrlNerdGraph The base URL for NerdGraph for a proxy.
         * 
         * @return builder
         * 
         */
        public Builder baseUrlNerdGraph(@Nullable Output<String> baseUrlNerdGraph) {
            $.baseUrlNerdGraph = baseUrlNerdGraph;
            return this;
        }

        /**
         * @param baseUrlNerdGraph The base URL for NerdGraph for a proxy.
         * 
         * @return builder
         * 
         */
        public Builder baseUrlNerdGraph(String baseUrlNerdGraph) {
            return baseUrlNerdGraph(Output.of(baseUrlNerdGraph));
        }

        /**
         * @param baseUrlRest The base URL of the New Relic REST API for a proxy.
         * 
         * @return builder
         * 
         */
        public Builder baseUrlRest(@Nullable Output<String> baseUrlRest) {
            $.baseUrlRest = baseUrlRest;
            return this;
        }

        /**
         * @param baseUrlRest The base URL of the New Relic REST API for a proxy.
         * 
         * @return builder
         * 
         */
        public Builder baseUrlRest(String baseUrlRest) {
            return baseUrlRest(Output.of(baseUrlRest));
        }

        /**
         * @param personalApiKey The NewRelic user key
         * 
         * @return builder
         * 
         */
        public Builder personalApiKey(Output<String> personalApiKey) {
            $.personalApiKey = personalApiKey;
            return this;
        }

        /**
         * @param personalApiKey The NewRelic user key
         * 
         * @return builder
         * 
         */
        public Builder personalApiKey(String personalApiKey) {
            return personalApiKey(Output.of(personalApiKey));
        }

        /**
         * @param region A region which the account is attached to. Default is &#34;us&#34;.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region A region which the account is attached to. Default is &#34;us&#34;.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public VerificationProviderNewRelicArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("VerificationProviderNewRelicArgs", "accountId");
            }
            if ($.personalApiKey == null) {
                throw new MissingRequiredPropertyException("VerificationProviderNewRelicArgs", "personalApiKey");
            }
            return $;
        }
    }

}
