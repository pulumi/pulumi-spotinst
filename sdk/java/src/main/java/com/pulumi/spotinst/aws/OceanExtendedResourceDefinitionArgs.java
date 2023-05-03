// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.aws;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OceanExtendedResourceDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final OceanExtendedResourceDefinitionArgs Empty = new OceanExtendedResourceDefinitionArgs();

    /**
     * The extended resource name as should be requested by your pods and registered to the nodes. Cannot be updated.
     * The name should be a valid Kubernetes extended resource name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The extended resource name as should be requested by your pods and registered to the nodes. Cannot be updated.
     * The name should be a valid Kubernetes extended resource name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A mapping between AWS instanceType or * as default and its value for the given extended resource.
     * 
     */
    @Import(name="resourceMapping", required=true)
    private Output<Map<String,Object>> resourceMapping;

    /**
     * @return A mapping between AWS instanceType or * as default and its value for the given extended resource.
     * 
     */
    public Output<Map<String,Object>> resourceMapping() {
        return this.resourceMapping;
    }

    private OceanExtendedResourceDefinitionArgs() {}

    private OceanExtendedResourceDefinitionArgs(OceanExtendedResourceDefinitionArgs $) {
        this.name = $.name;
        this.resourceMapping = $.resourceMapping;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OceanExtendedResourceDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OceanExtendedResourceDefinitionArgs $;

        public Builder() {
            $ = new OceanExtendedResourceDefinitionArgs();
        }

        public Builder(OceanExtendedResourceDefinitionArgs defaults) {
            $ = new OceanExtendedResourceDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The extended resource name as should be requested by your pods and registered to the nodes. Cannot be updated.
         * The name should be a valid Kubernetes extended resource name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The extended resource name as should be requested by your pods and registered to the nodes. Cannot be updated.
         * The name should be a valid Kubernetes extended resource name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceMapping A mapping between AWS instanceType or * as default and its value for the given extended resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceMapping(Output<Map<String,Object>> resourceMapping) {
            $.resourceMapping = resourceMapping;
            return this;
        }

        /**
         * @param resourceMapping A mapping between AWS instanceType or * as default and its value for the given extended resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceMapping(Map<String,Object> resourceMapping) {
            return resourceMapping(Output.of(resourceMapping));
        }

        public OceanExtendedResourceDefinitionArgs build() {
            $.resourceMapping = Objects.requireNonNull($.resourceMapping, "expected parameter 'resourceMapping' to be non-null");
            return $;
        }
    }

}
