// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecContainerArgs extends com.pulumi.resources.ResourceArgs {

    public static final VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecContainerArgs Empty = new VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecContainerArgs();

    /**
     * The entry point of a container.
     * 
     */
    @Import(name="commands", required=true)
    private Output<List<String>> commands;

    /**
     * @return The entry point of a container.
     * 
     */
    public Output<List<String>> commands() {
        return this.commands;
    }

    /**
     * The name of a container.
     * 
     */
    @Import(name="containerName", required=true)
    private Output<String> containerName;

    /**
     * @return The name of a container.
     * 
     */
    public Output<String> containerName() {
        return this.containerName;
    }

    /**
     * The image name of a container.
     * 
     */
    @Import(name="image", required=true)
    private Output<String> image;

    /**
     * @return The image name of a container.
     * 
     */
    public Output<String> image() {
        return this.image;
    }

    private VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecContainerArgs() {}

    private VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecContainerArgs(VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecContainerArgs $) {
        this.commands = $.commands;
        this.containerName = $.containerName;
        this.image = $.image;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecContainerArgs $;

        public Builder() {
            $ = new VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecContainerArgs();
        }

        public Builder(VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecContainerArgs defaults) {
            $ = new VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecContainerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param commands The entry point of a container.
         * 
         * @return builder
         * 
         */
        public Builder commands(Output<List<String>> commands) {
            $.commands = commands;
            return this;
        }

        /**
         * @param commands The entry point of a container.
         * 
         * @return builder
         * 
         */
        public Builder commands(List<String> commands) {
            return commands(Output.of(commands));
        }

        /**
         * @param commands The entry point of a container.
         * 
         * @return builder
         * 
         */
        public Builder commands(String... commands) {
            return commands(List.of(commands));
        }

        /**
         * @param containerName The name of a container.
         * 
         * @return builder
         * 
         */
        public Builder containerName(Output<String> containerName) {
            $.containerName = containerName;
            return this;
        }

        /**
         * @param containerName The name of a container.
         * 
         * @return builder
         * 
         */
        public Builder containerName(String containerName) {
            return containerName(Output.of(containerName));
        }

        /**
         * @param image The image name of a container.
         * 
         * @return builder
         * 
         */
        public Builder image(Output<String> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image The image name of a container.
         * 
         * @return builder
         * 
         */
        public Builder image(String image) {
            return image(Output.of(image));
        }

        public VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecContainerArgs build() {
            if ($.commands == null) {
                throw new MissingRequiredPropertyException("VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecContainerArgs", "commands");
            }
            if ($.containerName == null) {
                throw new MissingRequiredPropertyException("VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecContainerArgs", "containerName");
            }
            if ($.image == null) {
                throw new MissingRequiredPropertyException("VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecContainerArgs", "image");
            }
            return $;
        }
    }

}
