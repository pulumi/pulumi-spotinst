// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { BalancerArgs, BalancerState } from "./balancer";
export type Balancer = import("./balancer").Balancer;
export const Balancer: typeof import("./balancer").Balancer = null as any;
utilities.lazyLoad(exports, ["Balancer"], () => require("./balancer"));

export { DeploymentArgs, DeploymentState } from "./deployment";
export type Deployment = import("./deployment").Deployment;
export const Deployment: typeof import("./deployment").Deployment = null as any;
utilities.lazyLoad(exports, ["Deployment"], () => require("./deployment"));

export { ListenerArgs, ListenerState } from "./listener";
export type Listener = import("./listener").Listener;
export const Listener: typeof import("./listener").Listener = null as any;
utilities.lazyLoad(exports, ["Listener"], () => require("./listener"));

export { RoutingRuleArgs, RoutingRuleState } from "./routingRule";
export type RoutingRule = import("./routingRule").RoutingRule;
export const RoutingRule: typeof import("./routingRule").RoutingRule = null as any;
utilities.lazyLoad(exports, ["RoutingRule"], () => require("./routingRule"));

export { TargetArgs, TargetState } from "./target";
export type Target = import("./target").Target;
export const Target: typeof import("./target").Target = null as any;
utilities.lazyLoad(exports, ["Target"], () => require("./target"));

export { TargetSetArgs, TargetSetState } from "./targetSet";
export type TargetSet = import("./targetSet").TargetSet;
export const TargetSet: typeof import("./targetSet").TargetSet = null as any;
utilities.lazyLoad(exports, ["TargetSet"], () => require("./targetSet"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "spotinst:multai/balancer:Balancer":
                return new Balancer(name, <any>undefined, { urn })
            case "spotinst:multai/deployment:Deployment":
                return new Deployment(name, <any>undefined, { urn })
            case "spotinst:multai/listener:Listener":
                return new Listener(name, <any>undefined, { urn })
            case "spotinst:multai/routingRule:RoutingRule":
                return new RoutingRule(name, <any>undefined, { urn })
            case "spotinst:multai/target:Target":
                return new Target(name, <any>undefined, { urn })
            case "spotinst:multai/targetSet:TargetSet":
                return new TargetSet(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("spotinst", "multai/balancer", _module)
pulumi.runtime.registerResourceModule("spotinst", "multai/deployment", _module)
pulumi.runtime.registerResourceModule("spotinst", "multai/listener", _module)
pulumi.runtime.registerResourceModule("spotinst", "multai/routingRule", _module)
pulumi.runtime.registerResourceModule("spotinst", "multai/target", _module)
pulumi.runtime.registerResourceModule("spotinst", "multai/targetSet", _module)
