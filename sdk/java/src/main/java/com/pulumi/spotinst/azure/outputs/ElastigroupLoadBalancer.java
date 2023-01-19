// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElastigroupLoadBalancer {
    private @Nullable Boolean autoWeight;
    /**
     * @return The balancer ID.
     * 
     */
    private @Nullable String balancerId;
    /**
     * @return The scale set ID associated with the load balancer.
     * 
     */
    private @Nullable String targetSetId;
    /**
     * @return The resource type. Valid values: CLASSIC, TARGET_GROUP, MULTAI_TARGET_SET.
     * 
     */
    private String type;

    private ElastigroupLoadBalancer() {}
    public Optional<Boolean> autoWeight() {
        return Optional.ofNullable(this.autoWeight);
    }
    /**
     * @return The balancer ID.
     * 
     */
    public Optional<String> balancerId() {
        return Optional.ofNullable(this.balancerId);
    }
    /**
     * @return The scale set ID associated with the load balancer.
     * 
     */
    public Optional<String> targetSetId() {
        return Optional.ofNullable(this.targetSetId);
    }
    /**
     * @return The resource type. Valid values: CLASSIC, TARGET_GROUP, MULTAI_TARGET_SET.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupLoadBalancer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean autoWeight;
        private @Nullable String balancerId;
        private @Nullable String targetSetId;
        private String type;
        public Builder() {}
        public Builder(ElastigroupLoadBalancer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoWeight = defaults.autoWeight;
    	      this.balancerId = defaults.balancerId;
    	      this.targetSetId = defaults.targetSetId;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder autoWeight(@Nullable Boolean autoWeight) {
            this.autoWeight = autoWeight;
            return this;
        }
        @CustomType.Setter
        public Builder balancerId(@Nullable String balancerId) {
            this.balancerId = balancerId;
            return this;
        }
        @CustomType.Setter
        public Builder targetSetId(@Nullable String targetSetId) {
            this.targetSetId = targetSetId;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ElastigroupLoadBalancer build() {
            final var o = new ElastigroupLoadBalancer();
            o.autoWeight = autoWeight;
            o.balancerId = balancerId;
            o.targetSetId = targetSetId;
            o.type = type;
            return o;
        }
    }
}