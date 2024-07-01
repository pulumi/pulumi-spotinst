// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

// Export members:
export { DataIntegrationArgs, DataIntegrationState } from "./dataIntegration";
export type DataIntegration = import("./dataIntegration").DataIntegration;
export const DataIntegration: typeof import("./dataIntegration").DataIntegration = null as any;
utilities.lazyLoad(exports, ["DataIntegration"], () => require("./dataIntegration"));

export { ElastigroupAzureV3Args, ElastigroupAzureV3State } from "./elastigroupAzureV3";
export type ElastigroupAzureV3 = import("./elastigroupAzureV3").ElastigroupAzureV3;
export const ElastigroupAzureV3: typeof import("./elastigroupAzureV3").ElastigroupAzureV3 = null as any;
utilities.lazyLoad(exports, ["ElastigroupAzureV3"], () => require("./elastigroupAzureV3"));

export { HealthCheckArgs, HealthCheckState } from "./healthCheck";
export type HealthCheck = import("./healthCheck").HealthCheck;
export const HealthCheck: typeof import("./healthCheck").HealthCheck = null as any;
utilities.lazyLoad(exports, ["HealthCheck"], () => require("./healthCheck"));

export { OceanRightSizingRuleArgs, OceanRightSizingRuleState } from "./oceanRightSizingRule";
export type OceanRightSizingRule = import("./oceanRightSizingRule").OceanRightSizingRule;
export const OceanRightSizingRule: typeof import("./oceanRightSizingRule").OceanRightSizingRule = null as any;
utilities.lazyLoad(exports, ["OceanRightSizingRule"], () => require("./oceanRightSizingRule"));

export { ProviderArgs } from "./provider";
export type Provider = import("./provider").Provider;
export const Provider: typeof import("./provider").Provider = null as any;
utilities.lazyLoad(exports, ["Provider"], () => require("./provider"));

export { StatefulNodeAzureArgs, StatefulNodeAzureState } from "./statefulNodeAzure";
export type StatefulNodeAzure = import("./statefulNodeAzure").StatefulNodeAzure;
export const StatefulNodeAzure: typeof import("./statefulNodeAzure").StatefulNodeAzure = null as any;
utilities.lazyLoad(exports, ["StatefulNodeAzure"], () => require("./statefulNodeAzure"));

export { SubscriptionArgs, SubscriptionState } from "./subscription";
export type Subscription = import("./subscription").Subscription;
export const Subscription: typeof import("./subscription").Subscription = null as any;
utilities.lazyLoad(exports, ["Subscription"], () => require("./subscription"));


// Export sub-modules:
import * as aws from "./aws";
import * as azure from "./azure";
import * as config from "./config";
import * as ecs from "./ecs";
import * as gcp from "./gcp";
import * as gke from "./gke";
import * as oceancd from "./oceancd";
import * as organization from "./organization";
import * as spark from "./spark";
import * as types from "./types";

export {
    aws,
    azure,
    config,
    ecs,
    gcp,
    gke,
    oceancd,
    organization,
    spark,
    types,
};

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "spotinst:index/dataIntegration:DataIntegration":
                return new DataIntegration(name, <any>undefined, { urn })
            case "spotinst:index/elastigroupAzureV3:ElastigroupAzureV3":
                return new ElastigroupAzureV3(name, <any>undefined, { urn })
            case "spotinst:index/healthCheck:HealthCheck":
                return new HealthCheck(name, <any>undefined, { urn })
            case "spotinst:index/oceanRightSizingRule:OceanRightSizingRule":
                return new OceanRightSizingRule(name, <any>undefined, { urn })
            case "spotinst:index/statefulNodeAzure:StatefulNodeAzure":
                return new StatefulNodeAzure(name, <any>undefined, { urn })
            case "spotinst:index/subscription:Subscription":
                return new Subscription(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("spotinst", "index/dataIntegration", _module)
pulumi.runtime.registerResourceModule("spotinst", "index/elastigroupAzureV3", _module)
pulumi.runtime.registerResourceModule("spotinst", "index/healthCheck", _module)
pulumi.runtime.registerResourceModule("spotinst", "index/oceanRightSizingRule", _module)
pulumi.runtime.registerResourceModule("spotinst", "index/statefulNodeAzure", _module)
pulumi.runtime.registerResourceModule("spotinst", "index/subscription", _module)
pulumi.runtime.registerResourcePackage("spotinst", {
    version: utilities.getVersion(),
    constructProvider: (name: string, type: string, urn: string): pulumi.ProviderResource => {
        if (type !== "pulumi:providers:spotinst") {
            throw new Error(`unknown provider type ${type}`);
        }
        return new Provider(name, <any>undefined, { urn });
    },
});
