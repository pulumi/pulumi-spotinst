// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.inputs.NotificationCenterComputePolicyConfigDynamicRuleFilterConditionArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotificationCenterComputePolicyConfigDynamicRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationCenterComputePolicyConfigDynamicRuleArgs Empty = new NotificationCenterComputePolicyConfigDynamicRuleArgs();

    @Import(name="filterConditions")
    private @Nullable Output<List<NotificationCenterComputePolicyConfigDynamicRuleFilterConditionArgs>> filterConditions;

    public Optional<Output<List<NotificationCenterComputePolicyConfigDynamicRuleFilterConditionArgs>>> filterConditions() {
        return Optional.ofNullable(this.filterConditions);
    }

    private NotificationCenterComputePolicyConfigDynamicRuleArgs() {}

    private NotificationCenterComputePolicyConfigDynamicRuleArgs(NotificationCenterComputePolicyConfigDynamicRuleArgs $) {
        this.filterConditions = $.filterConditions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationCenterComputePolicyConfigDynamicRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationCenterComputePolicyConfigDynamicRuleArgs $;

        public Builder() {
            $ = new NotificationCenterComputePolicyConfigDynamicRuleArgs();
        }

        public Builder(NotificationCenterComputePolicyConfigDynamicRuleArgs defaults) {
            $ = new NotificationCenterComputePolicyConfigDynamicRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder filterConditions(@Nullable Output<List<NotificationCenterComputePolicyConfigDynamicRuleFilterConditionArgs>> filterConditions) {
            $.filterConditions = filterConditions;
            return this;
        }

        public Builder filterConditions(List<NotificationCenterComputePolicyConfigDynamicRuleFilterConditionArgs> filterConditions) {
            return filterConditions(Output.of(filterConditions));
        }

        public Builder filterConditions(NotificationCenterComputePolicyConfigDynamicRuleFilterConditionArgs... filterConditions) {
            return filterConditions(List.of(filterConditions));
        }

        public NotificationCenterComputePolicyConfigDynamicRuleArgs build() {
            return $;
        }
    }

}
