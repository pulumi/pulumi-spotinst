// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HealthCheckCheckArgs extends com.pulumi.resources.ResourceArgs {

    public static final HealthCheckCheckArgs Empty = new HealthCheckCheckArgs();

    @Import(name="endPoint")
    private @Nullable Output<String> endPoint;

    public Optional<Output<String>> endPoint() {
        return Optional.ofNullable(this.endPoint);
    }

    /**
     * The destination for the request.
     * 
     */
    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    /**
     * @return The destination for the request.
     * 
     */
    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    /**
     * The number of consecutive successful health checks that must occur before declaring an instance healthy.
     * 
     */
    @Import(name="healthy", required=true)
    private Output<Integer> healthy;

    /**
     * @return The number of consecutive successful health checks that must occur before declaring an instance healthy.
     * 
     */
    public Output<Integer> healthy() {
        return this.healthy;
    }

    /**
     * The amount of time (in seconds) between each health check (minimum: 10).
     * 
     */
    @Import(name="interval", required=true)
    private Output<Integer> interval;

    /**
     * @return The amount of time (in seconds) between each health check (minimum: 10).
     * 
     */
    public Output<Integer> interval() {
        return this.interval;
    }

    /**
     * The port of the Spotinst HCS (default: 80).
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    /**
     * @return The port of the Spotinst HCS (default: 80).
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }

    /**
     * The protocol to use to connect with the instance. Valid values: http, https.
     * 
     */
    @Import(name="protocol", required=true)
    private Output<String> protocol;

    /**
     * @return The protocol to use to connect with the instance. Valid values: http, https.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }

    @Import(name="timeOut")
    private @Nullable Output<Integer> timeOut;

    public Optional<Output<Integer>> timeOut() {
        return Optional.ofNullable(this.timeOut);
    }

    /**
     * the amount of time (in seconds) to wait when receiving a response from the health check.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<Integer> timeout;

    /**
     * @return the amount of time (in seconds) to wait when receiving a response from the health check.
     * 
     */
    public Optional<Output<Integer>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    /**
     * The number of consecutive failed health checks that must occur before declaring an instance unhealthy.
     * 
     */
    @Import(name="unhealthy", required=true)
    private Output<Integer> unhealthy;

    /**
     * @return The number of consecutive failed health checks that must occur before declaring an instance unhealthy.
     * 
     */
    public Output<Integer> unhealthy() {
        return this.unhealthy;
    }

    private HealthCheckCheckArgs() {}

    private HealthCheckCheckArgs(HealthCheckCheckArgs $) {
        this.endPoint = $.endPoint;
        this.endpoint = $.endpoint;
        this.healthy = $.healthy;
        this.interval = $.interval;
        this.port = $.port;
        this.protocol = $.protocol;
        this.timeOut = $.timeOut;
        this.timeout = $.timeout;
        this.unhealthy = $.unhealthy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HealthCheckCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HealthCheckCheckArgs $;

        public Builder() {
            $ = new HealthCheckCheckArgs();
        }

        public Builder(HealthCheckCheckArgs defaults) {
            $ = new HealthCheckCheckArgs(Objects.requireNonNull(defaults));
        }

        public Builder endPoint(@Nullable Output<String> endPoint) {
            $.endPoint = endPoint;
            return this;
        }

        public Builder endPoint(String endPoint) {
            return endPoint(Output.of(endPoint));
        }

        /**
         * @param endpoint The destination for the request.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint The destination for the request.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        /**
         * @param healthy The number of consecutive successful health checks that must occur before declaring an instance healthy.
         * 
         * @return builder
         * 
         */
        public Builder healthy(Output<Integer> healthy) {
            $.healthy = healthy;
            return this;
        }

        /**
         * @param healthy The number of consecutive successful health checks that must occur before declaring an instance healthy.
         * 
         * @return builder
         * 
         */
        public Builder healthy(Integer healthy) {
            return healthy(Output.of(healthy));
        }

        /**
         * @param interval The amount of time (in seconds) between each health check (minimum: 10).
         * 
         * @return builder
         * 
         */
        public Builder interval(Output<Integer> interval) {
            $.interval = interval;
            return this;
        }

        /**
         * @param interval The amount of time (in seconds) between each health check (minimum: 10).
         * 
         * @return builder
         * 
         */
        public Builder interval(Integer interval) {
            return interval(Output.of(interval));
        }

        /**
         * @param port The port of the Spotinst HCS (default: 80).
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port of the Spotinst HCS (default: 80).
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param protocol The protocol to use to connect with the instance. Valid values: http, https.
         * 
         * @return builder
         * 
         */
        public Builder protocol(Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The protocol to use to connect with the instance. Valid values: http, https.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        public Builder timeOut(@Nullable Output<Integer> timeOut) {
            $.timeOut = timeOut;
            return this;
        }

        public Builder timeOut(Integer timeOut) {
            return timeOut(Output.of(timeOut));
        }

        /**
         * @param timeout the amount of time (in seconds) to wait when receiving a response from the health check.
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<Integer> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout the amount of time (in seconds) to wait when receiving a response from the health check.
         * 
         * @return builder
         * 
         */
        public Builder timeout(Integer timeout) {
            return timeout(Output.of(timeout));
        }

        /**
         * @param unhealthy The number of consecutive failed health checks that must occur before declaring an instance unhealthy.
         * 
         * @return builder
         * 
         */
        public Builder unhealthy(Output<Integer> unhealthy) {
            $.unhealthy = unhealthy;
            return this;
        }

        /**
         * @param unhealthy The number of consecutive failed health checks that must occur before declaring an instance unhealthy.
         * 
         * @return builder
         * 
         */
        public Builder unhealthy(Integer unhealthy) {
            return unhealthy(Output.of(unhealthy));
        }

        public HealthCheckCheckArgs build() {
            $.healthy = Objects.requireNonNull($.healthy, "expected parameter 'healthy' to be non-null");
            $.interval = Objects.requireNonNull($.interval, "expected parameter 'interval' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            $.protocol = Objects.requireNonNull($.protocol, "expected parameter 'protocol' to be non-null");
            $.unhealthy = Objects.requireNonNull($.unhealthy, "expected parameter 'unhealthy' to be non-null");
            return $;
        }
    }

}
