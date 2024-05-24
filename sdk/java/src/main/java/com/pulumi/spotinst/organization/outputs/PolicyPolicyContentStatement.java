// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.organization.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class PolicyPolicyContentStatement {
    /**
     * @return Set a list of required actions for this permissions statement.
     * Full list of actions can be found in [https://docs.spot.io/account-user-management/user-management/access-policies-actions/](https://docs.spot.io/account-user-management/user-management/access-policies-actions/).
     * 
     */
    private List<String> actions;
    /**
     * @return Valid values &#34;ALLOW&#34;, &#34;DENY&#34;.
     * 
     */
    private String effect;
    /**
     * @return Set a list of resources IDs. In order to include all resources in this statement - use &#34;*&#34;.
     * 
     */
    private List<String> resources;

    private PolicyPolicyContentStatement() {}
    /**
     * @return Set a list of required actions for this permissions statement.
     * Full list of actions can be found in [https://docs.spot.io/account-user-management/user-management/access-policies-actions/](https://docs.spot.io/account-user-management/user-management/access-policies-actions/).
     * 
     */
    public List<String> actions() {
        return this.actions;
    }
    /**
     * @return Valid values &#34;ALLOW&#34;, &#34;DENY&#34;.
     * 
     */
    public String effect() {
        return this.effect;
    }
    /**
     * @return Set a list of resources IDs. In order to include all resources in this statement - use &#34;*&#34;.
     * 
     */
    public List<String> resources() {
        return this.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyPolicyContentStatement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> actions;
        private String effect;
        private List<String> resources;
        public Builder() {}
        public Builder(PolicyPolicyContentStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.effect = defaults.effect;
    	      this.resources = defaults.resources;
        }

        @CustomType.Setter
        public Builder actions(List<String> actions) {
            if (actions == null) {
              throw new MissingRequiredPropertyException("PolicyPolicyContentStatement", "actions");
            }
            this.actions = actions;
            return this;
        }
        public Builder actions(String... actions) {
            return actions(List.of(actions));
        }
        @CustomType.Setter
        public Builder effect(String effect) {
            if (effect == null) {
              throw new MissingRequiredPropertyException("PolicyPolicyContentStatement", "effect");
            }
            this.effect = effect;
            return this;
        }
        @CustomType.Setter
        public Builder resources(List<String> resources) {
            if (resources == null) {
              throw new MissingRequiredPropertyException("PolicyPolicyContentStatement", "resources");
            }
            this.resources = resources;
            return this;
        }
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }
        public PolicyPolicyContentStatement build() {
            final var _resultValue = new PolicyPolicyContentStatement();
            _resultValue.actions = actions;
            _resultValue.effect = effect;
            _resultValue.resources = resources;
            return _resultValue;
        }
    }
}
