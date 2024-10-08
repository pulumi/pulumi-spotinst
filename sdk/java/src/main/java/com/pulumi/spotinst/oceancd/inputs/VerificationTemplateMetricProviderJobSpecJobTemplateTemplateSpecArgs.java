// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.oceancd.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.spotinst.oceancd.inputs.VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecContainerArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecArgs Empty = new VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecArgs();

    /**
     * A list of containers belonging to the pod.
     * 
     */
    @Import(name="containers", required=true)
    private Output<List<VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecContainerArgs>> containers;

    /**
     * @return A list of containers belonging to the pod.
     * 
     */
    public Output<List<VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecContainerArgs>> containers() {
        return this.containers;
    }

    /**
     * Restart policy for all containers within the pod. Enum: `&#34;Never&#34; &#34;OnFailure&#34;`
     * 
     */
    @Import(name="restartPolicy", required=true)
    private Output<String> restartPolicy;

    /**
     * @return Restart policy for all containers within the pod. Enum: `&#34;Never&#34; &#34;OnFailure&#34;`
     * 
     */
    public Output<String> restartPolicy() {
        return this.restartPolicy;
    }

    private VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecArgs() {}

    private VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecArgs(VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecArgs $) {
        this.containers = $.containers;
        this.restartPolicy = $.restartPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecArgs $;

        public Builder() {
            $ = new VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecArgs();
        }

        public Builder(VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecArgs defaults) {
            $ = new VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containers A list of containers belonging to the pod.
         * 
         * @return builder
         * 
         */
        public Builder containers(Output<List<VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecContainerArgs>> containers) {
            $.containers = containers;
            return this;
        }

        /**
         * @param containers A list of containers belonging to the pod.
         * 
         * @return builder
         * 
         */
        public Builder containers(List<VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecContainerArgs> containers) {
            return containers(Output.of(containers));
        }

        /**
         * @param containers A list of containers belonging to the pod.
         * 
         * @return builder
         * 
         */
        public Builder containers(VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecContainerArgs... containers) {
            return containers(List.of(containers));
        }

        /**
         * @param restartPolicy Restart policy for all containers within the pod. Enum: `&#34;Never&#34; &#34;OnFailure&#34;`
         * 
         * @return builder
         * 
         */
        public Builder restartPolicy(Output<String> restartPolicy) {
            $.restartPolicy = restartPolicy;
            return this;
        }

        /**
         * @param restartPolicy Restart policy for all containers within the pod. Enum: `&#34;Never&#34; &#34;OnFailure&#34;`
         * 
         * @return builder
         * 
         */
        public Builder restartPolicy(String restartPolicy) {
            return restartPolicy(Output.of(restartPolicy));
        }

        public VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecArgs build() {
            if ($.containers == null) {
                throw new MissingRequiredPropertyException("VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecArgs", "containers");
            }
            if ($.restartPolicy == null) {
                throw new MissingRequiredPropertyException("VerificationTemplateMetricProviderJobSpecJobTemplateTemplateSpecArgs", "restartPolicy");
            }
            return $;
        }
    }

}