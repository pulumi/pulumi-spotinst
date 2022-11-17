// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupLogin {
    /**
     * @return Password for admin access to Windows VMs. Required for Windows product types.
     * 
     */
    private @Nullable String password;
    /**
     * @return SSH for admin access to Linux VMs. Required for Linux product types.
     * 
     */
    private @Nullable String sshPublicKey;
    /**
     * @return Set admin access for accessing your VMs.
     * 
     */
    private String userName;

    private ElastigroupLogin() {}
    /**
     * @return Password for admin access to Windows VMs. Required for Windows product types.
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return SSH for admin access to Linux VMs. Required for Linux product types.
     * 
     */
    public Optional<String> sshPublicKey() {
        return Optional.ofNullable(this.sshPublicKey);
    }
    /**
     * @return Set admin access for accessing your VMs.
     * 
     */
    public String userName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupLogin defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String password;
        private @Nullable String sshPublicKey;
        private String userName;
        public Builder() {}
        public Builder(ElastigroupLogin defaults) {
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
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public ElastigroupLogin build() {
            final var o = new ElastigroupLogin();
            o.password = password;
            o.sshPublicKey = sshPublicKey;
            o.userName = userName;
            return o;
        }
    }
}
