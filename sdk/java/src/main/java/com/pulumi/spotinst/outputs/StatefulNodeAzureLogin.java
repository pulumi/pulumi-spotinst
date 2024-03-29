// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StatefulNodeAzureLogin {
    private @Nullable String password;
    private @Nullable String sshPublicKey;
    private String userName;

    private StatefulNodeAzureLogin() {}
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    public Optional<String> sshPublicKey() {
        return Optional.ofNullable(this.sshPublicKey);
    }
    public String userName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulNodeAzureLogin defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String password;
        private @Nullable String sshPublicKey;
        private String userName;
        public Builder() {}
        public Builder(StatefulNodeAzureLogin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.sshPublicKey = defaults.sshPublicKey;
    	      this.userName = defaults.userName;
        }

        @CustomType.Setter
        public Builder password(@Nullable String password) {

            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder sshPublicKey(@Nullable String sshPublicKey) {

            this.sshPublicKey = sshPublicKey;
            return this;
        }
        @CustomType.Setter
        public Builder userName(String userName) {
            if (userName == null) {
              throw new MissingRequiredPropertyException("StatefulNodeAzureLogin", "userName");
            }
            this.userName = userName;
            return this;
        }
        public StatefulNodeAzureLogin build() {
            final var _resultValue = new StatefulNodeAzureLogin();
            _resultValue.password = password;
            _resultValue.sshPublicKey = sshPublicKey;
            _resultValue.userName = userName;
            return _resultValue;
        }
    }
}
