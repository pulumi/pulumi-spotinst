// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class RolloutSpecFailurePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final RolloutSpecFailurePolicyArgs Empty = new RolloutSpecFailurePolicyArgs();

    /**
     * Choose an action to perform on failure. Default is `abort`.  Enum: &#34;abort&#34; &#34;pause&#34; &#34;promote&#34;.
     * 
     */
    @Import(name="action", required=true)
    private Output<String> action;

    /**
     * @return Choose an action to perform on failure. Default is `abort`.  Enum: &#34;abort&#34; &#34;pause&#34; &#34;promote&#34;.
     * 
     */
    public Output<String> action() {
        return this.action;
    }

    private RolloutSpecFailurePolicyArgs() {}

    private RolloutSpecFailurePolicyArgs(RolloutSpecFailurePolicyArgs $) {
        this.action = $.action;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RolloutSpecFailurePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RolloutSpecFailurePolicyArgs $;

        public Builder() {
            $ = new RolloutSpecFailurePolicyArgs();
        }

        public Builder(RolloutSpecFailurePolicyArgs defaults) {
            $ = new RolloutSpecFailurePolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action Choose an action to perform on failure. Default is `abort`.  Enum: &#34;abort&#34; &#34;pause&#34; &#34;promote&#34;.
         * 
         * @return builder
         * 
         */
        public Builder action(Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action Choose an action to perform on failure. Default is `abort`.  Enum: &#34;abort&#34; &#34;pause&#34; &#34;promote&#34;.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        public RolloutSpecFailurePolicyArgs build() {
            if ($.action == null) {
                throw new MissingRequiredPropertyException("RolloutSpecFailurePolicyArgs", "action");
            }
            return $;
        }
    }

}
