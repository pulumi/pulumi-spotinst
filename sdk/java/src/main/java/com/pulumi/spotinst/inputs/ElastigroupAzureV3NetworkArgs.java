// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.inputs.ElastigroupAzureV3NetworkNetworkInterfaceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ElastigroupAzureV3NetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupAzureV3NetworkArgs Empty = new ElastigroupAzureV3NetworkArgs();

    /**
     * - 
     * 
     */
    @Import(name="networkInterfaces", required=true)
    private Output<List<ElastigroupAzureV3NetworkNetworkInterfaceArgs>> networkInterfaces;

    /**
     * @return -
     * 
     */
    public Output<List<ElastigroupAzureV3NetworkNetworkInterfaceArgs>> networkInterfaces() {
        return this.networkInterfaces;
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

    /**
     * Name of Vnet.
     * 
     */
    @Import(name="virtualNetworkName", required=true)
    private Output<String> virtualNetworkName;

    /**
     * @return Name of Vnet.
     * 
     */
    public Output<String> virtualNetworkName() {
        return this.virtualNetworkName;
    }

    private ElastigroupAzureV3NetworkArgs() {}

    private ElastigroupAzureV3NetworkArgs(ElastigroupAzureV3NetworkArgs $) {
        this.networkInterfaces = $.networkInterfaces;
        this.resourceGroupName = $.resourceGroupName;
        this.virtualNetworkName = $.virtualNetworkName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupAzureV3NetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupAzureV3NetworkArgs $;

        public Builder() {
            $ = new ElastigroupAzureV3NetworkArgs();
        }

        public Builder(ElastigroupAzureV3NetworkArgs defaults) {
            $ = new ElastigroupAzureV3NetworkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param networkInterfaces -
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaces(Output<List<ElastigroupAzureV3NetworkNetworkInterfaceArgs>> networkInterfaces) {
            $.networkInterfaces = networkInterfaces;
            return this;
        }

        /**
         * @param networkInterfaces -
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaces(List<ElastigroupAzureV3NetworkNetworkInterfaceArgs> networkInterfaces) {
            return networkInterfaces(Output.of(networkInterfaces));
        }

        /**
         * @param networkInterfaces -
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaces(ElastigroupAzureV3NetworkNetworkInterfaceArgs... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
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

        /**
         * @param virtualNetworkName Name of Vnet.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkName(Output<String> virtualNetworkName) {
            $.virtualNetworkName = virtualNetworkName;
            return this;
        }

        /**
         * @param virtualNetworkName Name of Vnet.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkName(String virtualNetworkName) {
            return virtualNetworkName(Output.of(virtualNetworkName));
        }

        public ElastigroupAzureV3NetworkArgs build() {
            $.networkInterfaces = Objects.requireNonNull($.networkInterfaces, "expected parameter 'networkInterfaces' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.virtualNetworkName = Objects.requireNonNull($.virtualNetworkName, "expected parameter 'virtualNetworkName' to be non-null");
            return $;
        }
    }

}
