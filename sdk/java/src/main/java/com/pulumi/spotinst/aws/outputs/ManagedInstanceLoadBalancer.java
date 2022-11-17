// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedInstanceLoadBalancer {
    /**
     * @return The AWS resource ARN (Required only for ALB target groups).
     * 
     */
    private @Nullable String arn;
    /**
     * @return &#34;Auto Weight&#34; will automatically provide a higher weight for instances that are larger as appropriate. For example, if you have configured your Elastigroup with m4.large and m4.xlarge instances the m4.large will have half the weight of an m4.xlarge. This ensures that larger instances receive a higher number of MLB requests.
     * 
     */
    private @Nullable Boolean autoWeight;
    /**
     * @return &#34;AZ Awareness&#34; will ensure that instances within the same AZ are using the corresponding MLB runtime instance in the same AZ. This feature reduces multi-zone data transfer fees.
     * 
     */
    private @Nullable Boolean azAwareness;
    /**
     * @return The Multai load balancer ID. Example: lb-123456
     * 
     */
    private @Nullable String balancerId;
    /**
     * @return The record set name.
     * 
     */
    private @Nullable String name;
    /**
     * @return The Multai load target set ID. Example: ts-123456
     * 
     */
    private @Nullable String targetSetId;
    /**
     * @return String, Action type. Supported action types: `pause`, `resume`, `recycle`.
     * 
     */
    private String type;

    private ManagedInstanceLoadBalancer() {}
    /**
     * @return The AWS resource ARN (Required only for ALB target groups).
     * 
     */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * @return &#34;Auto Weight&#34; will automatically provide a higher weight for instances that are larger as appropriate. For example, if you have configured your Elastigroup with m4.large and m4.xlarge instances the m4.large will have half the weight of an m4.xlarge. This ensures that larger instances receive a higher number of MLB requests.
     * 
     */
    public Optional<Boolean> autoWeight() {
        return Optional.ofNullable(this.autoWeight);
    }
    /**
     * @return &#34;AZ Awareness&#34; will ensure that instances within the same AZ are using the corresponding MLB runtime instance in the same AZ. This feature reduces multi-zone data transfer fees.
     * 
     */
    public Optional<Boolean> azAwareness() {
        return Optional.ofNullable(this.azAwareness);
    }
    /**
     * @return The Multai load balancer ID. Example: lb-123456
     * 
     */
    public Optional<String> balancerId() {
        return Optional.ofNullable(this.balancerId);
    }
    /**
     * @return The record set name.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The Multai load target set ID. Example: ts-123456
     * 
     */
    public Optional<String> targetSetId() {
        return Optional.ofNullable(this.targetSetId);
    }
    /**
     * @return String, Action type. Supported action types: `pause`, `resume`, `recycle`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedInstanceLoadBalancer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String arn;
        private @Nullable Boolean autoWeight;
        private @Nullable Boolean azAwareness;
        private @Nullable String balancerId;
        private @Nullable String name;
        private @Nullable String targetSetId;
        private String type;
        public Builder() {}
        public Builder(ManagedInstanceLoadBalancer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.autoWeight = defaults.autoWeight;
    	      this.azAwareness = defaults.azAwareness;
    	      this.balancerId = defaults.balancerId;
    	      this.name = defaults.name;
    	      this.targetSetId = defaults.targetSetId;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        @CustomType.Setter
        public Builder autoWeight(@Nullable Boolean autoWeight) {
            this.autoWeight = autoWeight;
            return this;
        }
        @CustomType.Setter
        public Builder azAwareness(@Nullable Boolean azAwareness) {
            this.azAwareness = azAwareness;
            return this;
        }
        @CustomType.Setter
        public Builder balancerId(@Nullable String balancerId) {
            this.balancerId = balancerId;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
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
        public ManagedInstanceLoadBalancer build() {
            final var o = new ManagedInstanceLoadBalancer();
            o.arn = arn;
            o.autoWeight = autoWeight;
            o.azAwareness = azAwareness;
            o.balancerId = balancerId;
            o.name = name;
            o.targetSetId = targetSetId;
            o.type = type;
            return o;
        }
    }
}
