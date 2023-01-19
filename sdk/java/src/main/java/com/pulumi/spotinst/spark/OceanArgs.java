// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.spark;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.spark.inputs.OceanComputeArgs;
import com.pulumi.spotinst.spark.inputs.OceanIngressArgs;
import com.pulumi.spotinst.spark.inputs.OceanLogCollectionArgs;
import com.pulumi.spotinst.spark.inputs.OceanWebhookArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanArgs Empty = new OceanArgs();

    @Import(name="compute")
    private @Nullable Output<OceanComputeArgs> compute;

    public Optional<Output<OceanComputeArgs>> compute() {
        return Optional.ofNullable(this.compute);
    }

    @Import(name="ingress")
    private @Nullable Output<OceanIngressArgs> ingress;

    public Optional<Output<OceanIngressArgs>> ingress() {
        return Optional.ofNullable(this.ingress);
    }

    @Import(name="logCollection")
    private @Nullable Output<OceanLogCollectionArgs> logCollection;

    public Optional<Output<OceanLogCollectionArgs>> logCollection() {
        return Optional.ofNullable(this.logCollection);
    }

    /**
     * - The ID of the Ocean cluster that Ocean for Apache Spark should be installed on.
     * 
     */
    @Import(name="oceanClusterId", required=true)
    private Output<String> oceanClusterId;

    /**
     * @return - The ID of the Ocean cluster that Ocean for Apache Spark should be installed on.
     * 
     */
    public Output<String> oceanClusterId() {
        return this.oceanClusterId;
    }

    @Import(name="webhook")
    private @Nullable Output<OceanWebhookArgs> webhook;

    public Optional<Output<OceanWebhookArgs>> webhook() {
        return Optional.ofNullable(this.webhook);
    }

    private OceanArgs() {}

    private OceanArgs(OceanArgs $) {
        this.compute = $.compute;
        this.ingress = $.ingress;
        this.logCollection = $.logCollection;
        this.oceanClusterId = $.oceanClusterId;
        this.webhook = $.webhook;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanArgs $;

        public Builder() {
            $ = new OceanArgs();
        }

        public Builder(OceanArgs defaults) {
            $ = new OceanArgs(Objects.requireNonNull(defaults));
        }

        public Builder compute(@Nullable Output<OceanComputeArgs> compute) {
            $.compute = compute;
            return this;
        }

        public Builder compute(OceanComputeArgs compute) {
            return compute(Output.of(compute));
        }

        public Builder ingress(@Nullable Output<OceanIngressArgs> ingress) {
            $.ingress = ingress;
            return this;
        }

        public Builder ingress(OceanIngressArgs ingress) {
            return ingress(Output.of(ingress));
        }

        public Builder logCollection(@Nullable Output<OceanLogCollectionArgs> logCollection) {
            $.logCollection = logCollection;
            return this;
        }

        public Builder logCollection(OceanLogCollectionArgs logCollection) {
            return logCollection(Output.of(logCollection));
        }

        /**
         * @param oceanClusterId - The ID of the Ocean cluster that Ocean for Apache Spark should be installed on.
         * 
         * @return builder
         * 
         */
        public Builder oceanClusterId(Output<String> oceanClusterId) {
            $.oceanClusterId = oceanClusterId;
            return this;
        }

        /**
         * @param oceanClusterId - The ID of the Ocean cluster that Ocean for Apache Spark should be installed on.
         * 
         * @return builder
         * 
         */
        public Builder oceanClusterId(String oceanClusterId) {
            return oceanClusterId(Output.of(oceanClusterId));
        }

        public Builder webhook(@Nullable Output<OceanWebhookArgs> webhook) {
            $.webhook = webhook;
            return this;
        }

        public Builder webhook(OceanWebhookArgs webhook) {
            return webhook(Output.of(webhook));
        }

        public OceanArgs build() {
            $.oceanClusterId = Objects.requireNonNull($.oceanClusterId, "expected parameter 'oceanClusterId' to be non-null");
            return $;
        }
    }

}
