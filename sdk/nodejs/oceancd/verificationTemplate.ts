// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Spotinst OceanCD Verfification Template resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as spotinst from "@pulumi/spotinst";
 *
 * const test = new spotinst.oceancd.VerificationTemplate("test", {
 *     name: "test-verification-template-tes",
 *     args: [{
 *         argName: "test-arg",
 *         value: "test",
 *         valueFrom: {
 *             secretKeyRef: {
 *                 name: "test_key",
 *                 key: "key-value-test",
 *             },
 *         },
 *     }],
 *     metrics: [{
 *         metricsName: "test-metrics-names",
 *         dryRun: false,
 *         interval: "10m",
 *         initialDelay: "1m",
 *         count: 10,
 *         successCondition: "result[0] <= 0.95",
 *         failureCondition: "result[0] >= 0.95",
 *         failureLimit: 2,
 *         consecutiveErrorLimit: 1,
 *         providers: [{
 *             prometheus: {
 *                 prometheusQuery: "http_requests_new",
 *             },
 *             datadog: {
 *                 duration: "1m",
 *                 datadogQuery: "avg:kubernetes.cpu.user.total",
 *             },
 *             newRelic: {
 *                 profile: "test",
 *                 newRelicQuery: "FROM Metric SELECT count",
 *             },
 *             cloudWatch: {
 *                 duration: "5m",
 *                 metricDataQueries: [{
 *                     id: "utilization",
 *                     metricStat: {
 *                         metric: {
 *                             metricName: "Test",
 *                             namespace: "AWS/EC2",
 *                             dimensions: [{
 *                                 dimensionName: "instandId",
 *                                 dimensionValue: "i-123044",
 *                             }],
 *                         },
 *                         metricPeriod: 400,
 *                         stat: "average",
 *                         unit: "None",
 *                     },
 *                     expression: "SELECT AVG(CPUUtilization) FROM SCHEMA",
 *                     label: "TestLabel",
 *                     returnData: false,
 *                     period: 300,
 *                 }],
 *             },
 *             web: {
 *                 method: "GET",
 *                 url: "https://oceancd.com/api/v1/metrics?clusterId= args.clusterId",
 *                 webHeaders: [{
 *                     webHeaderKey: "Autorization",
 *                     webHeaderValue: "Bearer=args.token",
 *                 }],
 *                 body: "{\"key\": \"test\"}",
 *                 timeoutSeconds: 20,
 *                 jsonPath: "$.data",
 *                 insecure: false,
 *             },
 *             job: {
 *                 specs: [{
 *                     backoffLimit: 1,
 *                     jobTemplates: [{
 *                         templateSpecs: [{
 *                             containers: [{
 *                                 containerName: "hello",
 *                                 commands: [
 *                                     "sh",
 *                                     "-c",
 *                                 ],
 *                                 image: "nginx.2.1",
 *                             }],
 *                             restartPolicy: "never",
 *                         }],
 *                     }],
 *                 }],
 *             },
 *             jenkins: {
 *                 pipelineName: "testPipelineName",
 *                 tlsVerification: true,
 *                 timeout: "2m",
 *                 jenkinsInterval: "5s",
 *                 jenkinsParameters: {
 *                     parameterKey: "app",
 *                     parameterValue: "my-app",
 *                 },
 *             },
 *         }],
 *         baseline: {
 *             baselineProviders: [{
 *                 prometheus: {
 *                     prometheusQuery: "http_requests_total.status!",
 *                 },
 *                 datadog: {
 *                     duration: "2m",
 *                     datadogQuery: "avg:kubernetes.cpu.user",
 *                 },
 *                 newRelic: {
 *                     profile: "test",
 *                     newRelicQuery: "FROM Metric SELECT count*",
 *                 },
 *             }],
 *             minRange: 40,
 *             maxRange: 50,
 *             threshold: "range",
 *         },
 *     }],
 * });
 * ```
 */
export class VerificationTemplate extends pulumi.CustomResource {
    /**
     * Get an existing VerificationTemplate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VerificationTemplateState, opts?: pulumi.CustomResourceOptions): VerificationTemplate {
        return new VerificationTemplate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'spotinst:oceancd/verificationTemplate:VerificationTemplate';

    /**
     * Returns true if the given object is an instance of VerificationTemplate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VerificationTemplate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VerificationTemplate.__pulumiType;
    }

    /**
     * List of verification arguments. You may specify either `value` OR `valueFrom` but not both.In case `args`:`value` is already defined in the RolloutSpec entity, there is no need to also specify it in the VerificationTemplate entity.
     */
    public readonly args!: pulumi.Output<outputs.oceancd.VerificationTemplateArg[] | undefined>;
    /**
     * List of verification metrics.
     */
    public readonly metrics!: pulumi.Output<outputs.oceancd.VerificationTemplateMetric[] | undefined>;
    /**
     * Identifier name for Ocean CD Verification Template. Must be unique.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a VerificationTemplate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: VerificationTemplateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VerificationTemplateArgs | VerificationTemplateState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VerificationTemplateState | undefined;
            resourceInputs["args"] = state ? state.args : undefined;
            resourceInputs["metrics"] = state ? state.metrics : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as VerificationTemplateArgs | undefined;
            resourceInputs["args"] = args ? args.args : undefined;
            resourceInputs["metrics"] = args ? args.metrics : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(VerificationTemplate.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VerificationTemplate resources.
 */
export interface VerificationTemplateState {
    /**
     * List of verification arguments. You may specify either `value` OR `valueFrom` but not both.In case `args`:`value` is already defined in the RolloutSpec entity, there is no need to also specify it in the VerificationTemplate entity.
     */
    args?: pulumi.Input<pulumi.Input<inputs.oceancd.VerificationTemplateArg>[]>;
    /**
     * List of verification metrics.
     */
    metrics?: pulumi.Input<pulumi.Input<inputs.oceancd.VerificationTemplateMetric>[]>;
    /**
     * Identifier name for Ocean CD Verification Template. Must be unique.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a VerificationTemplate resource.
 */
export interface VerificationTemplateArgs {
    /**
     * List of verification arguments. You may specify either `value` OR `valueFrom` but not both.In case `args`:`value` is already defined in the RolloutSpec entity, there is no need to also specify it in the VerificationTemplate entity.
     */
    args?: pulumi.Input<pulumi.Input<inputs.oceancd.VerificationTemplateArg>[]>;
    /**
     * List of verification metrics.
     */
    metrics?: pulumi.Input<pulumi.Input<inputs.oceancd.VerificationTemplateMetric>[]>;
    /**
     * Identifier name for Ocean CD Verification Template. Must be unique.
     */
    name?: pulumi.Input<string>;
}
