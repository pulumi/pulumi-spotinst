// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ElastigroupManagedServiceIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupManagedServiceIdentityArgs Empty = new ElastigroupManagedServiceIdentityArgs();

    /**
     * Name of the Managed Service Identity.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the Managed Service Identity.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Name of the Azure Resource Group where the Managed Service Identity is located.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the Azure Resource Group where the Managed Service Identity is located.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private ElastigroupManagedServiceIdentityArgs() {}

    private ElastigroupManagedServiceIdentityArgs(ElastigroupManagedServiceIdentityArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupManagedServiceIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupManagedServiceIdentityArgs $;

        public Builder() {
            $ = new ElastigroupManagedServiceIdentityArgs();
        }

        public Builder(ElastigroupManagedServiceIdentityArgs defaults) {
            $ = new ElastigroupManagedServiceIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the Managed Service Identity.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the Managed Service Identity.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName Name of the Azure Resource Group where the Managed Service Identity is located.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the Azure Resource Group where the Managed Service Identity is located.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public ElastigroupManagedServiceIdentityArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ElastigroupManagedServiceIdentityArgs", "name");
            }
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("ElastigroupManagedServiceIdentityArgs", "resourceGroupName");
            }
            return $;
        }
    }

}
