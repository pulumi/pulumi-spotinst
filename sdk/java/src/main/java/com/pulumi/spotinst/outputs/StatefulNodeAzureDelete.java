// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StatefulNodeAzureDelete {
    private Boolean diskShouldDeallocate;
    private @Nullable Integer diskTtlInHours;
    private Boolean networkShouldDeallocate;
    private @Nullable Integer networkTtlInHours;
    private Boolean publicIpShouldDeallocate;
    private @Nullable Integer publicIpTtlInHours;
    private Boolean shouldTerminateVm;
    private Boolean snapshotShouldDeallocate;
    private @Nullable Integer snapshotTtlInHours;

    private StatefulNodeAzureDelete() {}
    public Boolean diskShouldDeallocate() {
        return this.diskShouldDeallocate;
    }
    public Optional<Integer> diskTtlInHours() {
        return Optional.ofNullable(this.diskTtlInHours);
    }
    public Boolean networkShouldDeallocate() {
        return this.networkShouldDeallocate;
    }
    public Optional<Integer> networkTtlInHours() {
        return Optional.ofNullable(this.networkTtlInHours);
    }
    public Boolean publicIpShouldDeallocate() {
        return this.publicIpShouldDeallocate;
    }
    public Optional<Integer> publicIpTtlInHours() {
        return Optional.ofNullable(this.publicIpTtlInHours);
    }
    public Boolean shouldTerminateVm() {
        return this.shouldTerminateVm;
    }
    public Boolean snapshotShouldDeallocate() {
        return this.snapshotShouldDeallocate;
    }
    public Optional<Integer> snapshotTtlInHours() {
        return Optional.ofNullable(this.snapshotTtlInHours);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulNodeAzureDelete defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean diskShouldDeallocate;
        private @Nullable Integer diskTtlInHours;
        private Boolean networkShouldDeallocate;
        private @Nullable Integer networkTtlInHours;
        private Boolean publicIpShouldDeallocate;
        private @Nullable Integer publicIpTtlInHours;
        private Boolean shouldTerminateVm;
        private Boolean snapshotShouldDeallocate;
        private @Nullable Integer snapshotTtlInHours;
        public Builder() {}
        public Builder(StatefulNodeAzureDelete defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskShouldDeallocate = defaults.diskShouldDeallocate;
    	      this.diskTtlInHours = defaults.diskTtlInHours;
    	      this.networkShouldDeallocate = defaults.networkShouldDeallocate;
    	      this.networkTtlInHours = defaults.networkTtlInHours;
    	      this.publicIpShouldDeallocate = defaults.publicIpShouldDeallocate;
    	      this.publicIpTtlInHours = defaults.publicIpTtlInHours;
    	      this.shouldTerminateVm = defaults.shouldTerminateVm;
    	      this.snapshotShouldDeallocate = defaults.snapshotShouldDeallocate;
    	      this.snapshotTtlInHours = defaults.snapshotTtlInHours;
        }

        @CustomType.Setter
        public Builder diskShouldDeallocate(Boolean diskShouldDeallocate) {
            this.diskShouldDeallocate = Objects.requireNonNull(diskShouldDeallocate);
            return this;
        }
        @CustomType.Setter
        public Builder diskTtlInHours(@Nullable Integer diskTtlInHours) {
            this.diskTtlInHours = diskTtlInHours;
            return this;
        }
        @CustomType.Setter
        public Builder networkShouldDeallocate(Boolean networkShouldDeallocate) {
            this.networkShouldDeallocate = Objects.requireNonNull(networkShouldDeallocate);
            return this;
        }
        @CustomType.Setter
        public Builder networkTtlInHours(@Nullable Integer networkTtlInHours) {
            this.networkTtlInHours = networkTtlInHours;
            return this;
        }
        @CustomType.Setter
        public Builder publicIpShouldDeallocate(Boolean publicIpShouldDeallocate) {
            this.publicIpShouldDeallocate = Objects.requireNonNull(publicIpShouldDeallocate);
            return this;
        }
        @CustomType.Setter
        public Builder publicIpTtlInHours(@Nullable Integer publicIpTtlInHours) {
            this.publicIpTtlInHours = publicIpTtlInHours;
            return this;
        }
        @CustomType.Setter
        public Builder shouldTerminateVm(Boolean shouldTerminateVm) {
            this.shouldTerminateVm = Objects.requireNonNull(shouldTerminateVm);
            return this;
        }
        @CustomType.Setter
        public Builder snapshotShouldDeallocate(Boolean snapshotShouldDeallocate) {
            this.snapshotShouldDeallocate = Objects.requireNonNull(snapshotShouldDeallocate);
            return this;
        }
        @CustomType.Setter
        public Builder snapshotTtlInHours(@Nullable Integer snapshotTtlInHours) {
            this.snapshotTtlInHours = snapshotTtlInHours;
            return this;
        }
        public StatefulNodeAzureDelete build() {
            final var o = new StatefulNodeAzureDelete();
            o.diskShouldDeallocate = diskShouldDeallocate;
            o.diskTtlInHours = diskTtlInHours;
            o.networkShouldDeallocate = networkShouldDeallocate;
            o.networkTtlInHours = networkTtlInHours;
            o.publicIpShouldDeallocate = publicIpShouldDeallocate;
            o.publicIpTtlInHours = publicIpTtlInHours;
            o.shouldTerminateVm = shouldTerminateVm;
            o.snapshotShouldDeallocate = snapshotShouldDeallocate;
            o.snapshotTtlInHours = snapshotTtlInHours;
            return o;
        }
    }
}