// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.organization.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ProgrammaticUserAccount {
    /**
     * @return Account ID the programmatic user will have access to.
     * 
     */
    private String accountId;
    /**
     * @return (Enum: `&#34;viewer&#34;, &#34;editor&#34;) Role to be associated with the
     * programmatic user for this account.
     * 
     */
    private String accountRole;

    private ProgrammaticUserAccount() {}
    /**
     * @return Account ID the programmatic user will have access to.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return (Enum: `&#34;viewer&#34;, &#34;editor&#34;) Role to be associated with the
     * programmatic user for this account.
     * 
     */
    public String accountRole() {
        return this.accountRole;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProgrammaticUserAccount defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private String accountRole;
        public Builder() {}
        public Builder(ProgrammaticUserAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.accountRole = defaults.accountRole;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        @CustomType.Setter
        public Builder accountRole(String accountRole) {
            this.accountRole = Objects.requireNonNull(accountRole);
            return this;
        }
        public ProgrammaticUserAccount build() {
            final var o = new ProgrammaticUserAccount();
            o.accountId = accountId;
            o.accountRole = accountRole;
            return o;
        }
    }
}
