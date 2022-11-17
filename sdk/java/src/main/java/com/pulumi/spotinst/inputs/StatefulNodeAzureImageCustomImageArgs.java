// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class StatefulNodeAzureImageCustomImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final StatefulNodeAzureImageCustomImageArgs Empty = new StatefulNodeAzureImageCustomImageArgs();

    @Import(name="customImageResourceGroupName", required=true)
    private Output<String> customImageResourceGroupName;

    public Output<String> customImageResourceGroupName() {
        return this.customImageResourceGroupName;
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    private StatefulNodeAzureImageCustomImageArgs() {}

    private StatefulNodeAzureImageCustomImageArgs(StatefulNodeAzureImageCustomImageArgs $) {
        this.customImageResourceGroupName = $.customImageResourceGroupName;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StatefulNodeAzureImageCustomImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatefulNodeAzureImageCustomImageArgs $;

        public Builder() {
            $ = new StatefulNodeAzureImageCustomImageArgs();
        }

        public Builder(StatefulNodeAzureImageCustomImageArgs defaults) {
            $ = new StatefulNodeAzureImageCustomImageArgs(Objects.requireNonNull(defaults));
        }

        public Builder customImageResourceGroupName(Output<String> customImageResourceGroupName) {
            $.customImageResourceGroupName = customImageResourceGroupName;
            return this;
        }

        public Builder customImageResourceGroupName(String customImageResourceGroupName) {
            return customImageResourceGroupName(Output.of(customImageResourceGroupName));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public StatefulNodeAzureImageCustomImageArgs build() {
            $.customImageResourceGroupName = Objects.requireNonNull($.customImageResourceGroupName, "expected parameter 'customImageResourceGroupName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
