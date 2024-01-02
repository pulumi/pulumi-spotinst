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
public final class StatefulNodeAzureOsDisk {
    private @Nullable Integer sizeGb;
    private String type;

    private StatefulNodeAzureOsDisk() {}
    public Optional<Integer> sizeGb() {
        return Optional.ofNullable(this.sizeGb);
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulNodeAzureOsDisk defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer sizeGb;
        private String type;
        public Builder() {}
        public Builder(StatefulNodeAzureOsDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sizeGb = defaults.sizeGb;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder sizeGb(@Nullable Integer sizeGb) {

            this.sizeGb = sizeGb;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("StatefulNodeAzureOsDisk", "type");
            }
            this.type = type;
            return this;
        }
        public StatefulNodeAzureOsDisk build() {
            final var _resultValue = new StatefulNodeAzureOsDisk();
            _resultValue.sizeGb = sizeGb;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
