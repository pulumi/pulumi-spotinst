// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.spotinst.gke.outputs.ElastigroupDiskInitializeParam;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupDisk {
    private @Nullable Boolean autoDelete;
    private @Nullable Boolean boot;
    private @Nullable String deviceName;
    private @Nullable List<ElastigroupDiskInitializeParam> initializeParams;
    private @Nullable String interface_;
    private @Nullable String mode;
    private @Nullable String source;
    private @Nullable String type;

    private ElastigroupDisk() {}
    public Optional<Boolean> autoDelete() {
        return Optional.ofNullable(this.autoDelete);
    }
    public Optional<Boolean> boot() {
        return Optional.ofNullable(this.boot);
    }
    public Optional<String> deviceName() {
        return Optional.ofNullable(this.deviceName);
    }
    public List<ElastigroupDiskInitializeParam> initializeParams() {
        return this.initializeParams == null ? List.of() : this.initializeParams;
    }
    public Optional<String> interface_() {
        return Optional.ofNullable(this.interface_);
    }
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }
    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupDisk defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean autoDelete;
        private @Nullable Boolean boot;
        private @Nullable String deviceName;
        private @Nullable List<ElastigroupDiskInitializeParam> initializeParams;
        private @Nullable String interface_;
        private @Nullable String mode;
        private @Nullable String source;
        private @Nullable String type;
        public Builder() {}
        public Builder(ElastigroupDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDelete = defaults.autoDelete;
    	      this.boot = defaults.boot;
    	      this.deviceName = defaults.deviceName;
    	      this.initializeParams = defaults.initializeParams;
    	      this.interface_ = defaults.interface_;
    	      this.mode = defaults.mode;
    	      this.source = defaults.source;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder autoDelete(@Nullable Boolean autoDelete) {
            this.autoDelete = autoDelete;
            return this;
        }
        @CustomType.Setter
        public Builder boot(@Nullable Boolean boot) {
            this.boot = boot;
            return this;
        }
        @CustomType.Setter
        public Builder deviceName(@Nullable String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        @CustomType.Setter
        public Builder initializeParams(@Nullable List<ElastigroupDiskInitializeParam> initializeParams) {
            this.initializeParams = initializeParams;
            return this;
        }
        public Builder initializeParams(ElastigroupDiskInitializeParam... initializeParams) {
            return initializeParams(List.of(initializeParams));
        }
        @CustomType.Setter("interface")
        public Builder interface_(@Nullable String interface_) {
            this.interface_ = interface_;
            return this;
        }
        @CustomType.Setter
        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }
        @CustomType.Setter
        public Builder source(@Nullable String source) {
            this.source = source;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public ElastigroupDisk build() {
            final var o = new ElastigroupDisk();
            o.autoDelete = autoDelete;
            o.boot = boot;
            o.deviceName = deviceName;
            o.initializeParams = initializeParams;
            o.interface_ = interface_;
            o.mode = mode;
            o.source = source;
            o.type = type;
            return o;
        }
    }
}