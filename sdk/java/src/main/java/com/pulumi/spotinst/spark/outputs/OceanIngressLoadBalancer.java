// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.spark.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanIngressLoadBalancer {
    /**
     * @return - Should a load balancer managed by Ocean for Apache Spark be provisioned for the cluster. Set this to false if you want to use an existing load balancer (only available on AWS).
     * 
     */
    private @Nullable Boolean managed;
    /**
     * @return - Annotations to add to the ingress controller load balancer service. This is useful to configure properties of the managed load balancer, like the nature of the load balancer (e.g. ELB, NLB, ALB on AWS), the security groups, or various timeouts.
     * 
     */
    private @Nullable Map<String,String> serviceAnnotations;
    /**
     * @return - The ARN of a target group that the Ocean for Apache Spark ingress controller will be bound to. Set this to use an existing load balancer with Ocean for Apache Spark. Has no effect if using a managed load balancer. Only available on AWS.
     * 
     */
    private @Nullable String targetGroupArn;

    private OceanIngressLoadBalancer() {}
    /**
     * @return - Should a load balancer managed by Ocean for Apache Spark be provisioned for the cluster. Set this to false if you want to use an existing load balancer (only available on AWS).
     * 
     */
    public Optional<Boolean> managed() {
        return Optional.ofNullable(this.managed);
    }
    /**
     * @return - Annotations to add to the ingress controller load balancer service. This is useful to configure properties of the managed load balancer, like the nature of the load balancer (e.g. ELB, NLB, ALB on AWS), the security groups, or various timeouts.
     * 
     */
    public Map<String,String> serviceAnnotations() {
        return this.serviceAnnotations == null ? Map.of() : this.serviceAnnotations;
    }
    /**
     * @return - The ARN of a target group that the Ocean for Apache Spark ingress controller will be bound to. Set this to use an existing load balancer with Ocean for Apache Spark. Has no effect if using a managed load balancer. Only available on AWS.
     * 
     */
    public Optional<String> targetGroupArn() {
        return Optional.ofNullable(this.targetGroupArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanIngressLoadBalancer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean managed;
        private @Nullable Map<String,String> serviceAnnotations;
        private @Nullable String targetGroupArn;
        public Builder() {}
        public Builder(OceanIngressLoadBalancer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managed = defaults.managed;
    	      this.serviceAnnotations = defaults.serviceAnnotations;
    	      this.targetGroupArn = defaults.targetGroupArn;
        }

        @CustomType.Setter
        public Builder managed(@Nullable Boolean managed) {

            this.managed = managed;
            return this;
        }
        @CustomType.Setter
        public Builder serviceAnnotations(@Nullable Map<String,String> serviceAnnotations) {

            this.serviceAnnotations = serviceAnnotations;
            return this;
        }
        @CustomType.Setter
        public Builder targetGroupArn(@Nullable String targetGroupArn) {

            this.targetGroupArn = targetGroupArn;
            return this;
        }
        public OceanIngressLoadBalancer build() {
            final var _resultValue = new OceanIngressLoadBalancer();
            _resultValue.managed = managed;
            _resultValue.serviceAnnotations = serviceAnnotations;
            _resultValue.targetGroupArn = targetGroupArn;
            return _resultValue;
        }
    }
}
