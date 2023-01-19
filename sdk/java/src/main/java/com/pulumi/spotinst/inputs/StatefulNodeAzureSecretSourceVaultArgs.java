// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class StatefulNodeAzureSecretSourceVaultArgs extends com.pulumi.resources.ResourceArgs {

    public static final StatefulNodeAzureSecretSourceVaultArgs Empty = new StatefulNodeAzureSecretSourceVaultArgs();

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private StatefulNodeAzureSecretSourceVaultArgs() {}

    private StatefulNodeAzureSecretSourceVaultArgs(StatefulNodeAzureSecretSourceVaultArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StatefulNodeAzureSecretSourceVaultArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatefulNodeAzureSecretSourceVaultArgs $;

        public Builder() {
            $ = new StatefulNodeAzureSecretSourceVaultArgs();
        }

        public Builder(StatefulNodeAzureSecretSourceVaultArgs defaults) {
            $ = new StatefulNodeAzureSecretSourceVaultArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public StatefulNodeAzureSecretSourceVaultArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}