// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderArgs Empty = new ProviderArgs();

    /**
     * Spotinst Account ID
     * 
     */
    @Import(name="account")
    private @Nullable Output<String> account;

    /**
     * @return Spotinst Account ID
     * 
     */
    public Optional<Output<String>> account() {
        return Optional.ofNullable(this.account);
    }

    /**
     * Enable or disable the Spotinst provider
     * 
     */
    @Import(name="enabled", json=true)
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enable or disable the Spotinst provider
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Spotinst SDK Feature Flags
     * 
     */
    @Import(name="featureFlags")
    private @Nullable Output<String> featureFlags;

    /**
     * @return Spotinst SDK Feature Flags
     * 
     */
    public Optional<Output<String>> featureFlags() {
        return Optional.ofNullable(this.featureFlags);
    }

    /**
     * Spotinst Personal API Access Token
     * 
     */
    @Import(name="token")
    private @Nullable Output<String> token;

    /**
     * @return Spotinst Personal API Access Token
     * 
     */
    public Optional<Output<String>> token() {
        return Optional.ofNullable(this.token);
    }

    private ProviderArgs() {}

    private ProviderArgs(ProviderArgs $) {
        this.account = $.account;
        this.enabled = $.enabled;
        this.featureFlags = $.featureFlags;
        this.token = $.token;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderArgs $;

        public Builder() {
            $ = new ProviderArgs();
        }

        public Builder(ProviderArgs defaults) {
            $ = new ProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param account Spotinst Account ID
         * 
         * @return builder
         * 
         */
        public Builder account(@Nullable Output<String> account) {
            $.account = account;
            return this;
        }

        /**
         * @param account Spotinst Account ID
         * 
         * @return builder
         * 
         */
        public Builder account(String account) {
            return account(Output.of(account));
        }

        /**
         * @param enabled Enable or disable the Spotinst provider
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enable or disable the Spotinst provider
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param featureFlags Spotinst SDK Feature Flags
         * 
         * @return builder
         * 
         */
        public Builder featureFlags(@Nullable Output<String> featureFlags) {
            $.featureFlags = featureFlags;
            return this;
        }

        /**
         * @param featureFlags Spotinst SDK Feature Flags
         * 
         * @return builder
         * 
         */
        public Builder featureFlags(String featureFlags) {
            return featureFlags(Output.of(featureFlags));
        }

        /**
         * @param token Spotinst Personal API Access Token
         * 
         * @return builder
         * 
         */
        public Builder token(@Nullable Output<String> token) {
            $.token = token;
            return this;
        }

        /**
         * @param token Spotinst Personal API Access Token
         * 
         * @return builder
         * 
         */
        public Builder token(String token) {
            return token(Output.of(token));
        }

        public ProviderArgs build() {
            return $;
        }
    }

}