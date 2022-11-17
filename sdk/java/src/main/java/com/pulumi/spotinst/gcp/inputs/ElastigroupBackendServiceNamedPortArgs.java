// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.gcp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ElastigroupBackendServiceNamedPortArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupBackendServiceNamedPortArgs Empty = new ElastigroupBackendServiceNamedPortArgs();

    /**
     * The dimension name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The dimension name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * A list of ports.
     * 
     */
    @Import(name="ports", required=true)
    private Output<List<String>> ports;

    /**
     * @return A list of ports.
     * 
     */
    public Output<List<String>> ports() {
        return this.ports;
    }

    private ElastigroupBackendServiceNamedPortArgs() {}

    private ElastigroupBackendServiceNamedPortArgs(ElastigroupBackendServiceNamedPortArgs $) {
        this.name = $.name;
        this.ports = $.ports;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupBackendServiceNamedPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupBackendServiceNamedPortArgs $;

        public Builder() {
            $ = new ElastigroupBackendServiceNamedPortArgs();
        }

        public Builder(ElastigroupBackendServiceNamedPortArgs defaults) {
            $ = new ElastigroupBackendServiceNamedPortArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The dimension name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The dimension name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param ports A list of ports.
         * 
         * @return builder
         * 
         */
        public Builder ports(Output<List<String>> ports) {
            $.ports = ports;
            return this;
        }

        /**
         * @param ports A list of ports.
         * 
         * @return builder
         * 
         */
        public Builder ports(List<String> ports) {
            return ports(Output.of(ports));
        }

        /**
         * @param ports A list of ports.
         * 
         * @return builder
         * 
         */
        public Builder ports(String... ports) {
            return ports(List.of(ports));
        }

        public ElastigroupBackendServiceNamedPortArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.ports = Objects.requireNonNull($.ports, "expected parameter 'ports' to be non-null");
            return $;
        }
    }

}
