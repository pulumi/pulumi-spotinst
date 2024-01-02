// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.aws.inputs.SuspensionSuspensionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class SuspensionArgs extends com.pulumi.resources.ResourceArgs {

    public static final SuspensionArgs Empty = new SuspensionArgs();

    /**
     * Elastigroup ID to apply the suspensions on.
     * 
     */
    @Import(name="groupId", required=true)
    private Output<String> groupId;

    /**
     * @return Elastigroup ID to apply the suspensions on.
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
    }

    /**
     * block of single process to suspend.
     * 
     */
    @Import(name="suspensions", required=true)
    private Output<List<SuspensionSuspensionArgs>> suspensions;

    /**
     * @return block of single process to suspend.
     * 
     */
    public Output<List<SuspensionSuspensionArgs>> suspensions() {
        return this.suspensions;
    }

    private SuspensionArgs() {}

    private SuspensionArgs(SuspensionArgs $) {
        this.groupId = $.groupId;
        this.suspensions = $.suspensions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SuspensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SuspensionArgs $;

        public Builder() {
            $ = new SuspensionArgs();
        }

        public Builder(SuspensionArgs defaults) {
            $ = new SuspensionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param groupId Elastigroup ID to apply the suspensions on.
         * 
         * @return builder
         * 
         */
        public Builder groupId(Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId Elastigroup ID to apply the suspensions on.
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param suspensions block of single process to suspend.
         * 
         * @return builder
         * 
         */
        public Builder suspensions(Output<List<SuspensionSuspensionArgs>> suspensions) {
            $.suspensions = suspensions;
            return this;
        }

        /**
         * @param suspensions block of single process to suspend.
         * 
         * @return builder
         * 
         */
        public Builder suspensions(List<SuspensionSuspensionArgs> suspensions) {
            return suspensions(Output.of(suspensions));
        }

        /**
         * @param suspensions block of single process to suspend.
         * 
         * @return builder
         * 
         */
        public Builder suspensions(SuspensionSuspensionArgs... suspensions) {
            return suspensions(List.of(suspensions));
        }

        public SuspensionArgs build() {
            if ($.groupId == null) {
                throw new MissingRequiredPropertyException("SuspensionArgs", "groupId");
            }
            if ($.suspensions == null) {
                throw new MissingRequiredPropertyException("SuspensionArgs", "suspensions");
            }
            return $;
        }
    }

}
