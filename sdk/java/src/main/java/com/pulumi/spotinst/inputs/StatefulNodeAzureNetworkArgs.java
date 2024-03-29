// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.inputs.StatefulNodeAzureNetworkNetworkInterfaceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class StatefulNodeAzureNetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final StatefulNodeAzureNetworkArgs Empty = new StatefulNodeAzureNetworkArgs();

    @Import(name="networkInterfaces", required=true)
    private Output<List<StatefulNodeAzureNetworkNetworkInterfaceArgs>> networkInterfaces;

    public Output<List<StatefulNodeAzureNetworkNetworkInterfaceArgs>> networkInterfaces() {
        return this.networkInterfaces;
    }

    @Import(name="networkResourceGroupName", required=true)
    private Output<String> networkResourceGroupName;

    public Output<String> networkResourceGroupName() {
        return this.networkResourceGroupName;
    }

    @Import(name="virtualNetworkName", required=true)
    private Output<String> virtualNetworkName;

    public Output<String> virtualNetworkName() {
        return this.virtualNetworkName;
    }

    private StatefulNodeAzureNetworkArgs() {}

    private StatefulNodeAzureNetworkArgs(StatefulNodeAzureNetworkArgs $) {
        this.networkInterfaces = $.networkInterfaces;
        this.networkResourceGroupName = $.networkResourceGroupName;
        this.virtualNetworkName = $.virtualNetworkName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StatefulNodeAzureNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatefulNodeAzureNetworkArgs $;

        public Builder() {
            $ = new StatefulNodeAzureNetworkArgs();
        }

        public Builder(StatefulNodeAzureNetworkArgs defaults) {
            $ = new StatefulNodeAzureNetworkArgs(Objects.requireNonNull(defaults));
        }

        public Builder networkInterfaces(Output<List<StatefulNodeAzureNetworkNetworkInterfaceArgs>> networkInterfaces) {
            $.networkInterfaces = networkInterfaces;
            return this;
        }

        public Builder networkInterfaces(List<StatefulNodeAzureNetworkNetworkInterfaceArgs> networkInterfaces) {
            return networkInterfaces(Output.of(networkInterfaces));
        }

        public Builder networkInterfaces(StatefulNodeAzureNetworkNetworkInterfaceArgs... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }

        public Builder networkResourceGroupName(Output<String> networkResourceGroupName) {
            $.networkResourceGroupName = networkResourceGroupName;
            return this;
        }

        public Builder networkResourceGroupName(String networkResourceGroupName) {
            return networkResourceGroupName(Output.of(networkResourceGroupName));
        }

        public Builder virtualNetworkName(Output<String> virtualNetworkName) {
            $.virtualNetworkName = virtualNetworkName;
            return this;
        }

        public Builder virtualNetworkName(String virtualNetworkName) {
            return virtualNetworkName(Output.of(virtualNetworkName));
        }

        public StatefulNodeAzureNetworkArgs build() {
            if ($.networkInterfaces == null) {
                throw new MissingRequiredPropertyException("StatefulNodeAzureNetworkArgs", "networkInterfaces");
            }
            if ($.networkResourceGroupName == null) {
                throw new MissingRequiredPropertyException("StatefulNodeAzureNetworkArgs", "networkResourceGroupName");
            }
            if ($.virtualNetworkName == null) {
                throw new MissingRequiredPropertyException("StatefulNodeAzureNetworkArgs", "virtualNetworkName");
            }
            return $;
        }
    }

}
