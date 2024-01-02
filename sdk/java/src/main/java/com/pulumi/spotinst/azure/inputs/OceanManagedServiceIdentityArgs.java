// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class OceanManagedServiceIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanManagedServiceIdentityArgs Empty = new OceanManagedServiceIdentityArgs();

    /**
     * Name of the Load Balancer.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the Load Balancer.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The Resource Group name of the Load Balancer.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The Resource Group name of the Load Balancer.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private OceanManagedServiceIdentityArgs() {}

    private OceanManagedServiceIdentityArgs(OceanManagedServiceIdentityArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanManagedServiceIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanManagedServiceIdentityArgs $;

        public Builder() {
            $ = new OceanManagedServiceIdentityArgs();
        }

        public Builder(OceanManagedServiceIdentityArgs defaults) {
            $ = new OceanManagedServiceIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the Load Balancer.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the Load Balancer.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The Resource Group name of the Load Balancer.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The Resource Group name of the Load Balancer.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public OceanManagedServiceIdentityArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("OceanManagedServiceIdentityArgs", "name");
            }
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("OceanManagedServiceIdentityArgs", "resourceGroupName");
            }
            return $;
        }
    }

}
