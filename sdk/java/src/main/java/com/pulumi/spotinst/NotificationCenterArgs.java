// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.inputs.NotificationCenterComputePolicyConfigArgs;
import com.pulumi.spotinst.inputs.NotificationCenterRegisteredUserArgs;
import com.pulumi.spotinst.inputs.NotificationCenterSubscriptionArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotificationCenterArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationCenterArgs Empty = new NotificationCenterArgs();

    @Import(name="computePolicyConfig", required=true)
    private Output<NotificationCenterComputePolicyConfigArgs> computePolicyConfig;

    public Output<NotificationCenterComputePolicyConfigArgs> computePolicyConfig() {
        return this.computePolicyConfig;
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="isActive")
    private @Nullable Output<Boolean> isActive;

    public Optional<Output<Boolean>> isActive() {
        return Optional.ofNullable(this.isActive);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="privacyLevel", required=true)
    private Output<String> privacyLevel;

    public Output<String> privacyLevel() {
        return this.privacyLevel;
    }

    @Import(name="registeredUsers")
    private @Nullable Output<List<NotificationCenterRegisteredUserArgs>> registeredUsers;

    public Optional<Output<List<NotificationCenterRegisteredUserArgs>>> registeredUsers() {
        return Optional.ofNullable(this.registeredUsers);
    }

    @Import(name="subscriptions")
    private @Nullable Output<List<NotificationCenterSubscriptionArgs>> subscriptions;

    public Optional<Output<List<NotificationCenterSubscriptionArgs>>> subscriptions() {
        return Optional.ofNullable(this.subscriptions);
    }

    private NotificationCenterArgs() {}

    private NotificationCenterArgs(NotificationCenterArgs $) {
        this.computePolicyConfig = $.computePolicyConfig;
        this.description = $.description;
        this.isActive = $.isActive;
        this.name = $.name;
        this.privacyLevel = $.privacyLevel;
        this.registeredUsers = $.registeredUsers;
        this.subscriptions = $.subscriptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationCenterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationCenterArgs $;

        public Builder() {
            $ = new NotificationCenterArgs();
        }

        public Builder(NotificationCenterArgs defaults) {
            $ = new NotificationCenterArgs(Objects.requireNonNull(defaults));
        }

        public Builder computePolicyConfig(Output<NotificationCenterComputePolicyConfigArgs> computePolicyConfig) {
            $.computePolicyConfig = computePolicyConfig;
            return this;
        }

        public Builder computePolicyConfig(NotificationCenterComputePolicyConfigArgs computePolicyConfig) {
            return computePolicyConfig(Output.of(computePolicyConfig));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder isActive(@Nullable Output<Boolean> isActive) {
            $.isActive = isActive;
            return this;
        }

        public Builder isActive(Boolean isActive) {
            return isActive(Output.of(isActive));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder privacyLevel(Output<String> privacyLevel) {
            $.privacyLevel = privacyLevel;
            return this;
        }

        public Builder privacyLevel(String privacyLevel) {
            return privacyLevel(Output.of(privacyLevel));
        }

        public Builder registeredUsers(@Nullable Output<List<NotificationCenterRegisteredUserArgs>> registeredUsers) {
            $.registeredUsers = registeredUsers;
            return this;
        }

        public Builder registeredUsers(List<NotificationCenterRegisteredUserArgs> registeredUsers) {
            return registeredUsers(Output.of(registeredUsers));
        }

        public Builder registeredUsers(NotificationCenterRegisteredUserArgs... registeredUsers) {
            return registeredUsers(List.of(registeredUsers));
        }

        public Builder subscriptions(@Nullable Output<List<NotificationCenterSubscriptionArgs>> subscriptions) {
            $.subscriptions = subscriptions;
            return this;
        }

        public Builder subscriptions(List<NotificationCenterSubscriptionArgs> subscriptions) {
            return subscriptions(Output.of(subscriptions));
        }

        public Builder subscriptions(NotificationCenterSubscriptionArgs... subscriptions) {
            return subscriptions(List.of(subscriptions));
        }

        public NotificationCenterArgs build() {
            if ($.computePolicyConfig == null) {
                throw new MissingRequiredPropertyException("NotificationCenterArgs", "computePolicyConfig");
            }
            if ($.privacyLevel == null) {
                throw new MissingRequiredPropertyException("NotificationCenterArgs", "privacyLevel");
            }
            return $;
        }
    }

}
