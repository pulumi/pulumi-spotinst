// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElastigroupAzureV3NetworkNetworkInterfaceSecurityGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElastigroupAzureV3NetworkNetworkInterfaceSecurityGroupArgs Empty = new ElastigroupAzureV3NetworkNetworkInterfaceSecurityGroupArgs();

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    private ElastigroupAzureV3NetworkNetworkInterfaceSecurityGroupArgs() {}

    private ElastigroupAzureV3NetworkNetworkInterfaceSecurityGroupArgs(ElastigroupAzureV3NetworkNetworkInterfaceSecurityGroupArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElastigroupAzureV3NetworkNetworkInterfaceSecurityGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElastigroupAzureV3NetworkNetworkInterfaceSecurityGroupArgs $;

        public Builder() {
            $ = new ElastigroupAzureV3NetworkNetworkInterfaceSecurityGroupArgs();
        }

        public Builder(ElastigroupAzureV3NetworkNetworkInterfaceSecurityGroupArgs defaults) {
            $ = new ElastigroupAzureV3NetworkNetworkInterfaceSecurityGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public ElastigroupAzureV3NetworkNetworkInterfaceSecurityGroupArgs build() {
            return $;
        }
    }

}