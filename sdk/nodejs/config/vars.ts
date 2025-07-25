// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

declare var exports: any;
const __config = new pulumi.Config("spotinst");

/**
 * Spotinst Account ID
 */
export declare const account: string | undefined;
Object.defineProperty(exports, "account", {
    get() {
        return __config.get("account");
    },
    enumerable: true,
});

/**
 * Enable or disable the Spotinst provider
 */
export declare const enabled: boolean | undefined;
Object.defineProperty(exports, "enabled", {
    get() {
        return __config.getObject<boolean>("enabled");
    },
    enumerable: true,
});

/**
 * Spotinst SDK Feature Flags
 */
export declare const featureFlags: string | undefined;
Object.defineProperty(exports, "featureFlags", {
    get() {
        return __config.get("featureFlags");
    },
    enumerable: true,
});

/**
 * Spotinst Personal API Access Token
 */
export declare const token: string | undefined;
Object.defineProperty(exports, "token", {
    get() {
        return __config.get("token");
    },
    enumerable: true,
});

