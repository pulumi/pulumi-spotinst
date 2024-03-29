// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class StatefulNodeAzureUpdateStateArgs extends com.pulumi.resources.ResourceArgs {

    public static final StatefulNodeAzureUpdateStateArgs Empty = new StatefulNodeAzureUpdateStateArgs();

    @Import(name="state", required=true)
    private Output<String> state;

    public Output<String> state() {
        return this.state;
    }

    private StatefulNodeAzureUpdateStateArgs() {}

    private StatefulNodeAzureUpdateStateArgs(StatefulNodeAzureUpdateStateArgs $) {
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StatefulNodeAzureUpdateStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatefulNodeAzureUpdateStateArgs $;

        public Builder() {
            $ = new StatefulNodeAzureUpdateStateArgs();
        }

        public Builder(StatefulNodeAzureUpdateStateArgs defaults) {
            $ = new StatefulNodeAzureUpdateStateArgs(Objects.requireNonNull(defaults));
        }

        public Builder state(Output<String> state) {
            $.state = state;
            return this;
        }

        public Builder state(String state) {
            return state(Output.of(state));
        }

        public StatefulNodeAzureUpdateStateArgs build() {
            if ($.state == null) {
                throw new MissingRequiredPropertyException("StatefulNodeAzureUpdateStateArgs", "state");
            }
            return $;
        }
    }

}
