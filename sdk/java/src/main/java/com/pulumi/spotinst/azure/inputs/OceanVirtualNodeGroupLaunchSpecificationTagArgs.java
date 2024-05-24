// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanVirtualNodeGroupLaunchSpecificationTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanVirtualNodeGroupLaunchSpecificationTagArgs Empty = new OceanVirtualNodeGroupLaunchSpecificationTagArgs();

    /**
     * Tag Key for Vms in the cluster.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return Tag Key for Vms in the cluster.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Tag Value for VMs in the cluster.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Tag Value for VMs in the cluster.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private OceanVirtualNodeGroupLaunchSpecificationTagArgs() {}

    private OceanVirtualNodeGroupLaunchSpecificationTagArgs(OceanVirtualNodeGroupLaunchSpecificationTagArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanVirtualNodeGroupLaunchSpecificationTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanVirtualNodeGroupLaunchSpecificationTagArgs $;

        public Builder() {
            $ = new OceanVirtualNodeGroupLaunchSpecificationTagArgs();
        }

        public Builder(OceanVirtualNodeGroupLaunchSpecificationTagArgs defaults) {
            $ = new OceanVirtualNodeGroupLaunchSpecificationTagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key Tag Key for Vms in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Tag Key for Vms in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value Tag Value for VMs in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Tag Value for VMs in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public OceanVirtualNodeGroupLaunchSpecificationTagArgs build() {
            return $;
        }
    }

}
