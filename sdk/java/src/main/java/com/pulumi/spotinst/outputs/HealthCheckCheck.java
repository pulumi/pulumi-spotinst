// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HealthCheckCheck {
    private @Nullable String endPoint;
    /**
     * @return The destination for the request.
     * 
     */
    private @Nullable String endpoint;
    /**
     * @return The number of consecutive successful health checks that must occur before declaring an instance healthy.
     * 
     */
    private Integer healthy;
    /**
     * @return The amount of time (in seconds) between each health check (minimum: 10).
     * 
     */
    private Integer interval;
    /**
     * @return The port to use to connect with the instance.
     * 
     */
    private Integer port;
    /**
     * @return The protocol to use to connect with the instance. Valid values: http, https.
     * 
     */
    private String protocol;
    private @Nullable Integer timeOut;
    /**
     * @return the amount of time (in seconds) to wait when receiving a response from the health check.
     * 
     */
    private @Nullable Integer timeout;
    /**
     * @return The number of consecutive failed health checks that must occur before declaring an instance unhealthy.
     * 
     */
    private Integer unhealthy;

    private HealthCheckCheck() {}
    public Optional<String> endPoint() {
        return Optional.ofNullable(this.endPoint);
    }
    /**
     * @return The destination for the request.
     * 
     */
    public Optional<String> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }
    /**
     * @return The number of consecutive successful health checks that must occur before declaring an instance healthy.
     * 
     */
    public Integer healthy() {
        return this.healthy;
    }
    /**
     * @return The amount of time (in seconds) between each health check (minimum: 10).
     * 
     */
    public Integer interval() {
        return this.interval;
    }
    /**
     * @return The port to use to connect with the instance.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return The protocol to use to connect with the instance. Valid values: http, https.
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    public Optional<Integer> timeOut() {
        return Optional.ofNullable(this.timeOut);
    }
    /**
     * @return the amount of time (in seconds) to wait when receiving a response from the health check.
     * 
     */
    public Optional<Integer> timeout() {
        return Optional.ofNullable(this.timeout);
    }
    /**
     * @return The number of consecutive failed health checks that must occur before declaring an instance unhealthy.
     * 
     */
    public Integer unhealthy() {
        return this.unhealthy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthCheckCheck defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String endPoint;
        private @Nullable String endpoint;
        private Integer healthy;
        private Integer interval;
        private Integer port;
        private String protocol;
        private @Nullable Integer timeOut;
        private @Nullable Integer timeout;
        private Integer unhealthy;
        public Builder() {}
        public Builder(HealthCheckCheck defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endPoint = defaults.endPoint;
    	      this.endpoint = defaults.endpoint;
    	      this.healthy = defaults.healthy;
    	      this.interval = defaults.interval;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.timeOut = defaults.timeOut;
    	      this.timeout = defaults.timeout;
    	      this.unhealthy = defaults.unhealthy;
        }

        @CustomType.Setter
        public Builder endPoint(@Nullable String endPoint) {

            this.endPoint = endPoint;
            return this;
        }
        @CustomType.Setter
        public Builder endpoint(@Nullable String endpoint) {

            this.endpoint = endpoint;
            return this;
        }
        @CustomType.Setter
        public Builder healthy(Integer healthy) {
            if (healthy == null) {
              throw new MissingRequiredPropertyException("HealthCheckCheck", "healthy");
            }
            this.healthy = healthy;
            return this;
        }
        @CustomType.Setter
        public Builder interval(Integer interval) {
            if (interval == null) {
              throw new MissingRequiredPropertyException("HealthCheckCheck", "interval");
            }
            this.interval = interval;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("HealthCheckCheck", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            if (protocol == null) {
              throw new MissingRequiredPropertyException("HealthCheckCheck", "protocol");
            }
            this.protocol = protocol;
            return this;
        }
        @CustomType.Setter
        public Builder timeOut(@Nullable Integer timeOut) {

            this.timeOut = timeOut;
            return this;
        }
        @CustomType.Setter
        public Builder timeout(@Nullable Integer timeout) {

            this.timeout = timeout;
            return this;
        }
        @CustomType.Setter
        public Builder unhealthy(Integer unhealthy) {
            if (unhealthy == null) {
              throw new MissingRequiredPropertyException("HealthCheckCheck", "unhealthy");
            }
            this.unhealthy = unhealthy;
            return this;
        }
        public HealthCheckCheck build() {
            final var _resultValue = new HealthCheckCheck();
            _resultValue.endPoint = endPoint;
            _resultValue.endpoint = endpoint;
            _resultValue.healthy = healthy;
            _resultValue.interval = interval;
            _resultValue.port = port;
            _resultValue.protocol = protocol;
            _resultValue.timeOut = timeOut;
            _resultValue.timeout = timeout;
            _resultValue.unhealthy = unhealthy;
            return _resultValue;
        }
    }
}
