// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StatefulNodeAzureDeleteArgs extends com.pulumi.resources.ResourceArgs {

    public static final StatefulNodeAzureDeleteArgs Empty = new StatefulNodeAzureDeleteArgs();

    @Import(name="diskShouldDeallocate")
    private @Nullable Output<Boolean> diskShouldDeallocate;

    public Optional<Output<Boolean>> diskShouldDeallocate() {
        return Optional.ofNullable(this.diskShouldDeallocate);
    }

    @Import(name="diskTtlInHours")
    private @Nullable Output<Integer> diskTtlInHours;

    public Optional<Output<Integer>> diskTtlInHours() {
        return Optional.ofNullable(this.diskTtlInHours);
    }

    @Import(name="networkShouldDeallocate")
    private @Nullable Output<Boolean> networkShouldDeallocate;

    public Optional<Output<Boolean>> networkShouldDeallocate() {
        return Optional.ofNullable(this.networkShouldDeallocate);
    }

    @Import(name="networkTtlInHours")
    private @Nullable Output<Integer> networkTtlInHours;

    public Optional<Output<Integer>> networkTtlInHours() {
        return Optional.ofNullable(this.networkTtlInHours);
    }

    @Import(name="publicIpShouldDeallocate")
    private @Nullable Output<Boolean> publicIpShouldDeallocate;

    public Optional<Output<Boolean>> publicIpShouldDeallocate() {
        return Optional.ofNullable(this.publicIpShouldDeallocate);
    }

    @Import(name="publicIpTtlInHours")
    private @Nullable Output<Integer> publicIpTtlInHours;

    public Optional<Output<Integer>> publicIpTtlInHours() {
        return Optional.ofNullable(this.publicIpTtlInHours);
    }

    @Import(name="shouldDeregisterFromLb")
    private @Nullable Output<Boolean> shouldDeregisterFromLb;

    public Optional<Output<Boolean>> shouldDeregisterFromLb() {
        return Optional.ofNullable(this.shouldDeregisterFromLb);
    }

    @Import(name="shouldRevertToOd")
    private @Nullable Output<Boolean> shouldRevertToOd;

    public Optional<Output<Boolean>> shouldRevertToOd() {
        return Optional.ofNullable(this.shouldRevertToOd);
    }

    @Import(name="shouldTerminateVm", required=true)
    private Output<Boolean> shouldTerminateVm;

    public Output<Boolean> shouldTerminateVm() {
        return this.shouldTerminateVm;
    }

    @Import(name="snapshotShouldDeallocate")
    private @Nullable Output<Boolean> snapshotShouldDeallocate;

    public Optional<Output<Boolean>> snapshotShouldDeallocate() {
        return Optional.ofNullable(this.snapshotShouldDeallocate);
    }

    @Import(name="snapshotTtlInHours")
    private @Nullable Output<Integer> snapshotTtlInHours;

    public Optional<Output<Integer>> snapshotTtlInHours() {
        return Optional.ofNullable(this.snapshotTtlInHours);
    }

    private StatefulNodeAzureDeleteArgs() {}

    private StatefulNodeAzureDeleteArgs(StatefulNodeAzureDeleteArgs $) {
        this.diskShouldDeallocate = $.diskShouldDeallocate;
        this.diskTtlInHours = $.diskTtlInHours;
        this.networkShouldDeallocate = $.networkShouldDeallocate;
        this.networkTtlInHours = $.networkTtlInHours;
        this.publicIpShouldDeallocate = $.publicIpShouldDeallocate;
        this.publicIpTtlInHours = $.publicIpTtlInHours;
        this.shouldDeregisterFromLb = $.shouldDeregisterFromLb;
        this.shouldRevertToOd = $.shouldRevertToOd;
        this.shouldTerminateVm = $.shouldTerminateVm;
        this.snapshotShouldDeallocate = $.snapshotShouldDeallocate;
        this.snapshotTtlInHours = $.snapshotTtlInHours;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StatefulNodeAzureDeleteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatefulNodeAzureDeleteArgs $;

        public Builder() {
            $ = new StatefulNodeAzureDeleteArgs();
        }

        public Builder(StatefulNodeAzureDeleteArgs defaults) {
            $ = new StatefulNodeAzureDeleteArgs(Objects.requireNonNull(defaults));
        }

        public Builder diskShouldDeallocate(@Nullable Output<Boolean> diskShouldDeallocate) {
            $.diskShouldDeallocate = diskShouldDeallocate;
            return this;
        }

        public Builder diskShouldDeallocate(Boolean diskShouldDeallocate) {
            return diskShouldDeallocate(Output.of(diskShouldDeallocate));
        }

        public Builder diskTtlInHours(@Nullable Output<Integer> diskTtlInHours) {
            $.diskTtlInHours = diskTtlInHours;
            return this;
        }

        public Builder diskTtlInHours(Integer diskTtlInHours) {
            return diskTtlInHours(Output.of(diskTtlInHours));
        }

        public Builder networkShouldDeallocate(@Nullable Output<Boolean> networkShouldDeallocate) {
            $.networkShouldDeallocate = networkShouldDeallocate;
            return this;
        }

        public Builder networkShouldDeallocate(Boolean networkShouldDeallocate) {
            return networkShouldDeallocate(Output.of(networkShouldDeallocate));
        }

        public Builder networkTtlInHours(@Nullable Output<Integer> networkTtlInHours) {
            $.networkTtlInHours = networkTtlInHours;
            return this;
        }

        public Builder networkTtlInHours(Integer networkTtlInHours) {
            return networkTtlInHours(Output.of(networkTtlInHours));
        }

        public Builder publicIpShouldDeallocate(@Nullable Output<Boolean> publicIpShouldDeallocate) {
            $.publicIpShouldDeallocate = publicIpShouldDeallocate;
            return this;
        }

        public Builder publicIpShouldDeallocate(Boolean publicIpShouldDeallocate) {
            return publicIpShouldDeallocate(Output.of(publicIpShouldDeallocate));
        }

        public Builder publicIpTtlInHours(@Nullable Output<Integer> publicIpTtlInHours) {
            $.publicIpTtlInHours = publicIpTtlInHours;
            return this;
        }

        public Builder publicIpTtlInHours(Integer publicIpTtlInHours) {
            return publicIpTtlInHours(Output.of(publicIpTtlInHours));
        }

        public Builder shouldDeregisterFromLb(@Nullable Output<Boolean> shouldDeregisterFromLb) {
            $.shouldDeregisterFromLb = shouldDeregisterFromLb;
            return this;
        }

        public Builder shouldDeregisterFromLb(Boolean shouldDeregisterFromLb) {
            return shouldDeregisterFromLb(Output.of(shouldDeregisterFromLb));
        }

        public Builder shouldRevertToOd(@Nullable Output<Boolean> shouldRevertToOd) {
            $.shouldRevertToOd = shouldRevertToOd;
            return this;
        }

        public Builder shouldRevertToOd(Boolean shouldRevertToOd) {
            return shouldRevertToOd(Output.of(shouldRevertToOd));
        }

        public Builder shouldTerminateVm(Output<Boolean> shouldTerminateVm) {
            $.shouldTerminateVm = shouldTerminateVm;
            return this;
        }

        public Builder shouldTerminateVm(Boolean shouldTerminateVm) {
            return shouldTerminateVm(Output.of(shouldTerminateVm));
        }

        public Builder snapshotShouldDeallocate(@Nullable Output<Boolean> snapshotShouldDeallocate) {
            $.snapshotShouldDeallocate = snapshotShouldDeallocate;
            return this;
        }

        public Builder snapshotShouldDeallocate(Boolean snapshotShouldDeallocate) {
            return snapshotShouldDeallocate(Output.of(snapshotShouldDeallocate));
        }

        public Builder snapshotTtlInHours(@Nullable Output<Integer> snapshotTtlInHours) {
            $.snapshotTtlInHours = snapshotTtlInHours;
            return this;
        }

        public Builder snapshotTtlInHours(Integer snapshotTtlInHours) {
            return snapshotTtlInHours(Output.of(snapshotTtlInHours));
        }

        public StatefulNodeAzureDeleteArgs build() {
            if ($.shouldTerminateVm == null) {
                throw new MissingRequiredPropertyException("StatefulNodeAzureDeleteArgs", "shouldTerminateVm");
            }
            return $;
        }
    }

}
