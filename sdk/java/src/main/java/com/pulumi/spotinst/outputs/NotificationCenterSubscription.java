// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NotificationCenterSubscription {
    private @Nullable String endpoint;
    private @Nullable String subscriptionType;

    private NotificationCenterSubscription() {}
    public Optional<String> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }
    public Optional<String> subscriptionType() {
        return Optional.ofNullable(this.subscriptionType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationCenterSubscription defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String endpoint;
        private @Nullable String subscriptionType;
        public Builder() {}
        public Builder(NotificationCenterSubscription defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.subscriptionType = defaults.subscriptionType;
        }

        @CustomType.Setter
        public Builder endpoint(@Nullable String endpoint) {

            this.endpoint = endpoint;
            return this;
        }
        @CustomType.Setter
        public Builder subscriptionType(@Nullable String subscriptionType) {

            this.subscriptionType = subscriptionType;
            return this;
        }
        public NotificationCenterSubscription build() {
            final var _resultValue = new NotificationCenterSubscription();
            _resultValue.endpoint = endpoint;
            _resultValue.subscriptionType = subscriptionType;
            return _resultValue;
        }
    }
}
