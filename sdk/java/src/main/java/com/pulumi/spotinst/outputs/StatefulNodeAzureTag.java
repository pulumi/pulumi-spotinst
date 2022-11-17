// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StatefulNodeAzureTag {
    private String tagKey;
    private @Nullable String tagValue;

    private StatefulNodeAzureTag() {}
    public String tagKey() {
        return this.tagKey;
    }
    public Optional<String> tagValue() {
        return Optional.ofNullable(this.tagValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulNodeAzureTag defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String tagKey;
        private @Nullable String tagValue;
        public Builder() {}
        public Builder(StatefulNodeAzureTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tagKey = defaults.tagKey;
    	      this.tagValue = defaults.tagValue;
        }

        @CustomType.Setter
        public Builder tagKey(String tagKey) {
            this.tagKey = Objects.requireNonNull(tagKey);
            return this;
        }
        @CustomType.Setter
        public Builder tagValue(@Nullable String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public StatefulNodeAzureTag build() {
            final var o = new StatefulNodeAzureTag();
            o.tagKey = tagKey;
            o.tagValue = tagValue;
            return o;
        }
    }
}
