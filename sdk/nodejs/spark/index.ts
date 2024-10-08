// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { OceanArgs, OceanState } from "./ocean";
export type Ocean = import("./ocean").Ocean;
export const Ocean: typeof import("./ocean").Ocean = null as any;
utilities.lazyLoad(exports, ["Ocean"], () => require("./ocean"));

export { OceanVirtualNodeGroupArgs, OceanVirtualNodeGroupState } from "./oceanVirtualNodeGroup";
export type OceanVirtualNodeGroup = import("./oceanVirtualNodeGroup").OceanVirtualNodeGroup;
export const OceanVirtualNodeGroup: typeof import("./oceanVirtualNodeGroup").OceanVirtualNodeGroup = null as any;
utilities.lazyLoad(exports, ["OceanVirtualNodeGroup"], () => require("./oceanVirtualNodeGroup"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "spotinst:spark/ocean:Ocean":
                return new Ocean(name, <any>undefined, { urn })
            case "spotinst:spark/oceanVirtualNodeGroup:OceanVirtualNodeGroup":
                return new OceanVirtualNodeGroup(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("spotinst", "spark/ocean", _module)
pulumi.runtime.registerResourceModule("spotinst", "spark/oceanVirtualNodeGroup", _module)