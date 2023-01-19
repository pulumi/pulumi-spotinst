// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ElastigroupAzureV3ImageCustom {
    /**
     * @return Name of the custom image. Required if resource_group_name is specified.
     * 
     */
    private String imageName;
    /**
     * @return Name of the Azure Resource Group where the Managed Service Identity is located.
     * 
     */
    private String resourceGroupName;

    private ElastigroupAzureV3ImageCustom() {}
    /**
     * @return Name of the custom image. Required if resource_group_name is specified.
     * 
     */
    public String imageName() {
        return this.imageName;
    }
    /**
     * @return Name of the Azure Resource Group where the Managed Service Identity is located.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupAzureV3ImageCustom defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String imageName;
        private String resourceGroupName;
        public Builder() {}
        public Builder(ElastigroupAzureV3ImageCustom defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageName = defaults.imageName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        @CustomType.Setter
        public Builder imageName(String imageName) {
            this.imageName = Objects.requireNonNull(imageName);
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public ElastigroupAzureV3ImageCustom build() {
            final var o = new ElastigroupAzureV3ImageCustom();
            o.imageName = imageName;
            o.resourceGroupName = resourceGroupName;
            return o;
        }
    }
}