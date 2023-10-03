// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.spark.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OceanIngressPrivateLink {
    /**
     * @return - Should the Ocean for Apache Spark control plane address the cluster using a custom endpoint. Use this to specify the DNS address of an externally provisioned (unmanaged) load balancer.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return - The name of the VPC Endpoint Service the Ocean for Apache Spark control plane should bind to.
     * 
     */
    private @Nullable String vpcEndpointService;

    private OceanIngressPrivateLink() {}
    /**
     * @return - Should the Ocean for Apache Spark control plane address the cluster using a custom endpoint. Use this to specify the DNS address of an externally provisioned (unmanaged) load balancer.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return - The name of the VPC Endpoint Service the Ocean for Apache Spark control plane should bind to.
     * 
     */
    public Optional<String> vpcEndpointService() {
        return Optional.ofNullable(this.vpcEndpointService);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OceanIngressPrivateLink defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String vpcEndpointService;
        public Builder() {}
        public Builder(OceanIngressPrivateLink defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.vpcEndpointService = defaults.vpcEndpointService;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder vpcEndpointService(@Nullable String vpcEndpointService) {
            this.vpcEndpointService = vpcEndpointService;
            return this;
        }
        public OceanIngressPrivateLink build() {
            final var o = new OceanIngressPrivateLink();
            o.enabled = enabled;
            o.vpcEndpointService = vpcEndpointService;
            return o;
        }
    }
}
