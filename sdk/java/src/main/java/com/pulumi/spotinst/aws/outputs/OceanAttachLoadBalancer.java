// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanAttachLoadBalancer {
    /**
     * @return If type is &#34;TARGET_GROUP&#34; then an ARN is required. Otherwise is not allowed.
     * 
     */
    private @Nullable String arn;
    /**
     * @return If type is &#34;CLASSIC&#34; then a name is required. Otherwise is not allowed.
     * 
     */
    private @Nullable String name;
    /**
     * @return Type of load balancer to use.
     * 
     */
    private String type;

    private OceanAttachLoadBalancer() {}
    /**
     * @return If type is &#34;TARGET_GROUP&#34; then an ARN is required. Otherwise is not allowed.
     * 
     */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * @return If type is &#34;CLASSIC&#34; then a name is required. Otherwise is not allowed.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Type of load balancer to use.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanAttachLoadBalancer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String name;
        private String type;
        public Builder() {}
        public Builder(OceanAttachLoadBalancer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder arn(@Nullable String arn) {

            this.arn = arn;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("OceanAttachLoadBalancer", "type");
            }
            this.type = type;
            return this;
        }
        public OceanAttachLoadBalancer build() {
            final var _resultValue = new OceanAttachLoadBalancer();
            _resultValue.arn = arn;
            _resultValue.name = name;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
