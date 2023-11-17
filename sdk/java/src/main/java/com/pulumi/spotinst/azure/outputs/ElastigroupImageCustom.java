// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.azure.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ElastigroupImageCustom {
    private String imageName;
    /**
     * @return Name of the Resource Group for Elastigroup.
     * 
     */
    private String resourceGroupName;

    private ElastigroupImageCustom() {}
    public String imageName() {
        return this.imageName;
    }
    /**
     * @return Name of the Resource Group for Elastigroup.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElastigroupImageCustom defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String imageName;
        private String resourceGroupName;
        public Builder() {}
        public Builder(ElastigroupImageCustom defaults) {
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
        public ElastigroupImageCustom build() {
            final var o = new ElastigroupImageCustom();
            o.imageName = imageName;
            o.resourceGroupName = resourceGroupName;
            return o;
        }
    }
}
