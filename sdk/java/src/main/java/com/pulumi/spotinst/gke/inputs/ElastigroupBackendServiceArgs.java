// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gke.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.gke.inputs.ElastigroupBackendServiceNamedPortArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupBackendServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupBackendServiceArgs Empty = new ElastigroupBackendServiceArgs();

    @Import(name="locationType")
    private @Nullable Output<String> locationType;

    public Optional<Output<String>> locationType() {
        return Optional.ofNullable(this.locationType);
    }

    @Import(name="namedPorts")
    private @Nullable Output<List<ElastigroupBackendServiceNamedPortArgs>> namedPorts;

    public Optional<Output<List<ElastigroupBackendServiceNamedPortArgs>>> namedPorts() {
        return Optional.ofNullable(this.namedPorts);
    }

    @Import(name="scheme")
    private @Nullable Output<String> scheme;

    public Optional<Output<String>> scheme() {
        return Optional.ofNullable(this.scheme);
    }

    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName;
    }

    private ElastigroupBackendServiceArgs() {}

    private ElastigroupBackendServiceArgs(ElastigroupBackendServiceArgs $) {
        this.locationType = $.locationType;
        this.namedPorts = $.namedPorts;
        this.scheme = $.scheme;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupBackendServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupBackendServiceArgs $;

        public Builder() {
            $ = new ElastigroupBackendServiceArgs();
        }

        public Builder(ElastigroupBackendServiceArgs defaults) {
            $ = new ElastigroupBackendServiceArgs(Objects.requireNonNull(defaults));
        }

        public Builder locationType(@Nullable Output<String> locationType) {
            $.locationType = locationType;
            return this;
        }

        public Builder locationType(String locationType) {
            return locationType(Output.of(locationType));
        }

        public Builder namedPorts(@Nullable Output<List<ElastigroupBackendServiceNamedPortArgs>> namedPorts) {
            $.namedPorts = namedPorts;
            return this;
        }

        public Builder namedPorts(List<ElastigroupBackendServiceNamedPortArgs> namedPorts) {
            return namedPorts(Output.of(namedPorts));
        }

        public Builder namedPorts(ElastigroupBackendServiceNamedPortArgs... namedPorts) {
            return namedPorts(List.of(namedPorts));
        }

        public Builder scheme(@Nullable Output<String> scheme) {
            $.scheme = scheme;
            return this;
        }

        public Builder scheme(String scheme) {
            return scheme(Output.of(scheme));
        }

        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public ElastigroupBackendServiceArgs build() {
            if ($.serviceName == null) {
                throw new MissingRequiredPropertyException("ElastigroupBackendServiceArgs", "serviceName");
            }
            return $;
        }
    }

}
