// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SuspensionSuspension {
    /**
     * @return The name of process to suspend. Valid values: `&#34;AUTO_HEALING&#34; , &#34;OUT_OF_STRATEGY&#34;, &#34;PREVENTIVE_REPLACEMENT&#34;, &#34;REVERT_PREFERRED&#34;, or &#34;SCHEDULING&#34;`.
     * 
     */
    private String name;

    private SuspensionSuspension() {}
    /**
     * @return The name of process to suspend. Valid values: `&#34;AUTO_HEALING&#34; , &#34;OUT_OF_STRATEGY&#34;, &#34;PREVENTIVE_REPLACEMENT&#34;, &#34;REVERT_PREFERRED&#34;, or &#34;SCHEDULING&#34;`.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SuspensionSuspension defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        public Builder() {}
        public Builder(SuspensionSuspension defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public SuspensionSuspension build() {
            final var o = new SuspensionSuspension();
            o.name = name;
            return o;
        }
    }
}
