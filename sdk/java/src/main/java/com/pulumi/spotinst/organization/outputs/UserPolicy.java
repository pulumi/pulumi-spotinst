// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.organization.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class UserPolicy {
    private List<String> policyAccountIds;
    /**
     * @return A policy to register under the given group
     * (should be existing policy only).
     * 
     */
    private String policyId;

    private UserPolicy() {}
    public List<String> policyAccountIds() {
        return this.policyAccountIds;
    }
    /**
     * @return A policy to register under the given group
     * (should be existing policy only).
     * 
     */
    public String policyId() {
        return this.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> policyAccountIds;
        private String policyId;
        public Builder() {}
        public Builder(UserPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyAccountIds = defaults.policyAccountIds;
    	      this.policyId = defaults.policyId;
        }

        @CustomType.Setter
        public Builder policyAccountIds(List<String> policyAccountIds) {
            this.policyAccountIds = Objects.requireNonNull(policyAccountIds);
            return this;
        }
        public Builder policyAccountIds(String... policyAccountIds) {
            return policyAccountIds(List.of(policyAccountIds));
        }
        @CustomType.Setter
        public Builder policyId(String policyId) {
            this.policyId = Objects.requireNonNull(policyId);
            return this;
        }
        public UserPolicy build() {
            final var o = new UserPolicy();
            o.policyAccountIds = policyAccountIds;
            o.policyId = policyId;
            return o;
        }
    }
}
