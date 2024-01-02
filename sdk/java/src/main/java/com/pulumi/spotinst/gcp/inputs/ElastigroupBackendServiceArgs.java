// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gcp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.gcp.inputs.ElastigroupBackendServiceNamedPortArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupBackendServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupBackendServiceArgs Empty = new ElastigroupBackendServiceArgs();

    /**
     * Sets which location the backend services will be active. Valid values: `regional`, `global`.
     * 
     */
    @Import(name="locationType")
    private @Nullable Output<String> locationType;

    /**
     * @return Sets which location the backend services will be active. Valid values: `regional`, `global`.
     * 
     */
    public Optional<Output<String>> locationType() {
        return Optional.ofNullable(this.locationType);
    }

    /**
     * Describes a named port and a list of ports.
     * 
     */
    @Import(name="namedPorts")
    private @Nullable Output<List<ElastigroupBackendServiceNamedPortArgs>> namedPorts;

    /**
     * @return Describes a named port and a list of ports.
     * 
     */
    public Optional<Output<List<ElastigroupBackendServiceNamedPortArgs>>> namedPorts() {
        return Optional.ofNullable(this.namedPorts);
    }

    /**
     * Use when `location_type` is &#34;regional&#34;. Set the traffic for the backend service to either between the instances in the vpc or to traffic from the internet. Valid values: `INTERNAL`, `EXTERNAL`.
     * 
     */
    @Import(name="scheme")
    private @Nullable Output<String> scheme;

    /**
     * @return Use when `location_type` is &#34;regional&#34;. Set the traffic for the backend service to either between the instances in the vpc or to traffic from the internet. Valid values: `INTERNAL`, `EXTERNAL`.
     * 
     */
    public Optional<Output<String>> scheme() {
        return Optional.ofNullable(this.scheme);
    }

    /**
     * The name of the backend service.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The name of the backend service.
     * 
     */
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

        /**
         * @param locationType Sets which location the backend services will be active. Valid values: `regional`, `global`.
         * 
         * @return builder
         * 
         */
        public Builder locationType(@Nullable Output<String> locationType) {
            $.locationType = locationType;
            return this;
        }

        /**
         * @param locationType Sets which location the backend services will be active. Valid values: `regional`, `global`.
         * 
         * @return builder
         * 
         */
        public Builder locationType(String locationType) {
            return locationType(Output.of(locationType));
        }

        /**
         * @param namedPorts Describes a named port and a list of ports.
         * 
         * @return builder
         * 
         */
        public Builder namedPorts(@Nullable Output<List<ElastigroupBackendServiceNamedPortArgs>> namedPorts) {
            $.namedPorts = namedPorts;
            return this;
        }

        /**
         * @param namedPorts Describes a named port and a list of ports.
         * 
         * @return builder
         * 
         */
        public Builder namedPorts(List<ElastigroupBackendServiceNamedPortArgs> namedPorts) {
            return namedPorts(Output.of(namedPorts));
        }

        /**
         * @param namedPorts Describes a named port and a list of ports.
         * 
         * @return builder
         * 
         */
        public Builder namedPorts(ElastigroupBackendServiceNamedPortArgs... namedPorts) {
            return namedPorts(List.of(namedPorts));
        }

        /**
         * @param scheme Use when `location_type` is &#34;regional&#34;. Set the traffic for the backend service to either between the instances in the vpc or to traffic from the internet. Valid values: `INTERNAL`, `EXTERNAL`.
         * 
         * @return builder
         * 
         */
        public Builder scheme(@Nullable Output<String> scheme) {
            $.scheme = scheme;
            return this;
        }

        /**
         * @param scheme Use when `location_type` is &#34;regional&#34;. Set the traffic for the backend service to either between the instances in the vpc or to traffic from the internet. Valid values: `INTERNAL`, `EXTERNAL`.
         * 
         * @return builder
         * 
         */
        public Builder scheme(String scheme) {
            return scheme(Output.of(scheme));
        }

        /**
         * @param serviceName The name of the backend service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the backend service.
         * 
         * @return builder
         * 
         */
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
