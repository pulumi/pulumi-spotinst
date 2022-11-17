// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupLoginArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupLoginArgs Empty = new ElastigroupLoginArgs();

    /**
     * Password for admin access to Windows VMs. Required for Windows product types.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return Password for admin access to Windows VMs. Required for Windows product types.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * SSH for admin access to Linux VMs. Required for Linux product types.
     * 
     */
    @Import(name="sshPublicKey")
    private @Nullable Output<String> sshPublicKey;

    /**
     * @return SSH for admin access to Linux VMs. Required for Linux product types.
     * 
     */
    public Optional<Output<String>> sshPublicKey() {
        return Optional.ofNullable(this.sshPublicKey);
    }

    /**
     * Set admin access for accessing your VMs.
     * 
     */
    @Import(name="userName", required=true)
    private Output<String> userName;

    /**
     * @return Set admin access for accessing your VMs.
     * 
     */
    public Output<String> userName() {
        return this.userName;
    }

    private ElastigroupLoginArgs() {}

    private ElastigroupLoginArgs(ElastigroupLoginArgs $) {
        this.password = $.password;
        this.sshPublicKey = $.sshPublicKey;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupLoginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupLoginArgs $;

        public Builder() {
            $ = new ElastigroupLoginArgs();
        }

        public Builder(ElastigroupLoginArgs defaults) {
            $ = new ElastigroupLoginArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param password Password for admin access to Windows VMs. Required for Windows product types.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password for admin access to Windows VMs. Required for Windows product types.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param sshPublicKey SSH for admin access to Linux VMs. Required for Linux product types.
         * 
         * @return builder
         * 
         */
        public Builder sshPublicKey(@Nullable Output<String> sshPublicKey) {
            $.sshPublicKey = sshPublicKey;
            return this;
        }

        /**
         * @param sshPublicKey SSH for admin access to Linux VMs. Required for Linux product types.
         * 
         * @return builder
         * 
         */
        public Builder sshPublicKey(String sshPublicKey) {
            return sshPublicKey(Output.of(sshPublicKey));
        }

        /**
         * @param userName Set admin access for accessing your VMs.
         * 
         * @return builder
         * 
         */
        public Builder userName(Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName Set admin access for accessing your VMs.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public ElastigroupLoginArgs build() {
            $.userName = Objects.requireNonNull($.userName, "expected parameter 'userName' to be non-null");
            return $;
        }
    }

}
