// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.spark.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanIngressControllerArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanIngressControllerArgs Empty = new OceanIngressControllerArgs();

    /**
     * - Should an ingress controller managed by Ocean for Apache Spark be installed on the cluster.
     * 
     */
    @Import(name="managed")
    private @Nullable Output<Boolean> managed;

    /**
     * @return - Should an ingress controller managed by Ocean for Apache Spark be installed on the cluster.
     * 
     */
    public Optional<Output<Boolean>> managed() {
        return Optional.ofNullable(this.managed);
    }

    private OceanIngressControllerArgs() {}

    private OceanIngressControllerArgs(OceanIngressControllerArgs $) {
        this.managed = $.managed;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanIngressControllerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanIngressControllerArgs $;

        public Builder() {
            $ = new OceanIngressControllerArgs();
        }

        public Builder(OceanIngressControllerArgs defaults) {
            $ = new OceanIngressControllerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param managed - Should an ingress controller managed by Ocean for Apache Spark be installed on the cluster.
         * 
         * @return builder
         * 
         */
        public Builder managed(@Nullable Output<Boolean> managed) {
            $.managed = managed;
            return this;
        }

        /**
         * @param managed - Should an ingress controller managed by Ocean for Apache Spark be installed on the cluster.
         * 
         * @return builder
         * 
         */
        public Builder managed(Boolean managed) {
            return managed(Output.of(managed));
        }

        public OceanIngressControllerArgs build() {
            return $;
        }
    }

}