// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gcp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.gcp.inputs.ElastigroupDiskInitializeParamArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupDiskArgs Empty = new ElastigroupDiskArgs();

    @Import(name="autoDelete")
    private @Nullable Output<Boolean> autoDelete;

    public Optional<Output<Boolean>> autoDelete() {
        return Optional.ofNullable(this.autoDelete);
    }

    @Import(name="boot")
    private @Nullable Output<Boolean> boot;

    public Optional<Output<Boolean>> boot() {
        return Optional.ofNullable(this.boot);
    }

    @Import(name="deviceName")
    private @Nullable Output<String> deviceName;

    public Optional<Output<String>> deviceName() {
        return Optional.ofNullable(this.deviceName);
    }

    @Import(name="initializeParams")
    private @Nullable Output<List<ElastigroupDiskInitializeParamArgs>> initializeParams;

    public Optional<Output<List<ElastigroupDiskInitializeParamArgs>>> initializeParams() {
        return Optional.ofNullable(this.initializeParams);
    }

    @Import(name="interface")
    private @Nullable Output<String> interface_;

    public Optional<Output<String>> interface_() {
        return Optional.ofNullable(this.interface_);
    }

    @Import(name="mode")
    private @Nullable Output<String> mode;

    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    @Import(name="source")
    private @Nullable Output<String> source;

    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ElastigroupDiskArgs() {}

    private ElastigroupDiskArgs(ElastigroupDiskArgs $) {
        this.autoDelete = $.autoDelete;
        this.boot = $.boot;
        this.deviceName = $.deviceName;
        this.initializeParams = $.initializeParams;
        this.interface_ = $.interface_;
        this.mode = $.mode;
        this.source = $.source;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupDiskArgs $;

        public Builder() {
            $ = new ElastigroupDiskArgs();
        }

        public Builder(ElastigroupDiskArgs defaults) {
            $ = new ElastigroupDiskArgs(Objects.requireNonNull(defaults));
        }

        public Builder autoDelete(@Nullable Output<Boolean> autoDelete) {
            $.autoDelete = autoDelete;
            return this;
        }

        public Builder autoDelete(Boolean autoDelete) {
            return autoDelete(Output.of(autoDelete));
        }

        public Builder boot(@Nullable Output<Boolean> boot) {
            $.boot = boot;
            return this;
        }

        public Builder boot(Boolean boot) {
            return boot(Output.of(boot));
        }

        public Builder deviceName(@Nullable Output<String> deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        public Builder deviceName(String deviceName) {
            return deviceName(Output.of(deviceName));
        }

        public Builder initializeParams(@Nullable Output<List<ElastigroupDiskInitializeParamArgs>> initializeParams) {
            $.initializeParams = initializeParams;
            return this;
        }

        public Builder initializeParams(List<ElastigroupDiskInitializeParamArgs> initializeParams) {
            return initializeParams(Output.of(initializeParams));
        }

        public Builder initializeParams(ElastigroupDiskInitializeParamArgs... initializeParams) {
            return initializeParams(List.of(initializeParams));
        }

        public Builder interface_(@Nullable Output<String> interface_) {
            $.interface_ = interface_;
            return this;
        }

        public Builder interface_(String interface_) {
            return interface_(Output.of(interface_));
        }

        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        public Builder source(String source) {
            return source(Output.of(source));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ElastigroupDiskArgs build() {
            return $;
        }
    }

}