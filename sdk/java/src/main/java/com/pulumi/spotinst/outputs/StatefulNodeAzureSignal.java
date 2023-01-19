// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class StatefulNodeAzureSignal {
    private Integer timeout;
    private String type;

    private StatefulNodeAzureSignal() {}
    public Integer timeout() {
        return this.timeout;
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulNodeAzureSignal defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer timeout;
        private String type;
        public Builder() {}
        public Builder(StatefulNodeAzureSignal defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.timeout = defaults.timeout;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder timeout(Integer timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public StatefulNodeAzureSignal build() {
            final var o = new StatefulNodeAzureSignal();
            o.timeout = timeout;
            o.type = type;
            return o;
        }
    }
}