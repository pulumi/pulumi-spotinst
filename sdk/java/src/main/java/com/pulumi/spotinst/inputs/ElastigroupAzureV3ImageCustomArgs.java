// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ElastigroupAzureV3ImageCustomArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupAzureV3ImageCustomArgs Empty = new ElastigroupAzureV3ImageCustomArgs();

    /**
     * Name of the custom image. Required if resource_group_name is specified.
     * 
     */
    @Import(name="imageName", required=true)
    private Output<String> imageName;

    /**
     * @return Name of the custom image. Required if resource_group_name is specified.
     * 
     */
    public Output<String> imageName() {
        return this.imageName;
    }

    /**
     * - The resource group of the Application Security Group.
     *   }
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return - The resource group of the Application Security Group.
     * }
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private ElastigroupAzureV3ImageCustomArgs() {}

    private ElastigroupAzureV3ImageCustomArgs(ElastigroupAzureV3ImageCustomArgs $) {
        this.imageName = $.imageName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupAzureV3ImageCustomArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupAzureV3ImageCustomArgs $;

        public Builder() {
            $ = new ElastigroupAzureV3ImageCustomArgs();
        }

        public Builder(ElastigroupAzureV3ImageCustomArgs defaults) {
            $ = new ElastigroupAzureV3ImageCustomArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param imageName Name of the custom image. Required if resource_group_name is specified.
         * 
         * @return builder
         * 
         */
        public Builder imageName(Output<String> imageName) {
            $.imageName = imageName;
            return this;
        }

        /**
         * @param imageName Name of the custom image. Required if resource_group_name is specified.
         * 
         * @return builder
         * 
         */
        public Builder imageName(String imageName) {
            return imageName(Output.of(imageName));
        }

        /**
         * @param resourceGroupName - The resource group of the Application Security Group.
         * }
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName - The resource group of the Application Security Group.
         * }
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public ElastigroupAzureV3ImageCustomArgs build() {
            $.imageName = Objects.requireNonNull($.imageName, "expected parameter 'imageName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
